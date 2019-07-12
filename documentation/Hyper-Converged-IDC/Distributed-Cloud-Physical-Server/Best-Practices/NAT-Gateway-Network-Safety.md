# Network Security Scheme for NAT Gateway

## Overview
NAT Gateway can allow the arrival of the inbound traffic of its relevant Distributed Cloud Physical Server (DCPS for short) and allow the outbound traffic leaving from Distributed Cloud Physical Server by customizing the security policy. The NAT Gateway will (deny) all traffic by default. NAT is a set of security mechanism used for setting, maintaining and checking Internet communication of the Distributed Cloud Physical Server, providing a stateful firewall to the Distributed Cloud Physical Server (DCPS), and specifying and remembering connection status established for sending or receiving information package.

## Application Scenario Introduction
Public network access by DCPS of intranet only requires a Distributed Cloud Physical Server with one public IP and one private IP and the other Distributed Cloud Physical Servers with only one private IP. By using this server with public IP as the NAT Gateway, all Distributed Cloud Physical Servers can access the public network. Users can also allow the public network access by specific Distributed Cloud Physical Server according to business demands.

Similarly, the DCPS accessing intranet via the public network can access DCPS business application systems via the public network or realize remote management to DCPS by using this server with public IP as the NAT Gateway and mapping corresponding IP or port number.

With NAT Gateway, the network architecture is simplified, the public IP count is reduced and the network security of intranet DCPS and business application system is enhanced.

## Schematic Diagram of Network Architecture

![网络架构示意图](https://github.com/jdcloudcom/cn/blob/cn-distributed-cloud-physical-service/documentation/Hyper-Converged-IDC/Distributed-Cloud-Physical-Server/Image/DCPS-001.png)

## Configuration Scheme
The simulated IP information of configuration command is provided. Please purchase the IP information of the Distributed Cloud Physical Server for replacement.


**Note**: Please disable SSH login port 22 with care, as disabling port 22 will lead to inaccessibility from the external to the NAT Gateway and the Distributed Cloud Physical Server.

### Configuration Scheme for DCPS Public Network Access of Intranet

#### Modify Distributed Cloud Physical Server

1. SSH logs in the internal Server ssh root@172.16.0.4 via the NAT Gateway (the password is the one manually set at the time of purchase)

2. Default IP Information [Figure 1.0] and Route Information [Figure 1.1]

![IP信息图1.0](https://github.com/jdcloudcom/cn/blob/cn-distributed-cloud-physical-service/documentation/Hyper-Converged-IDC/Distributed-Cloud-Physical-Server/Image/DCPS-019.png)

<p align="center">IP Information [Figure 1.0]</p>

![路由信息图1.1](https://github.com/jdcloudcom/cn/blob/cn-distributed-cloud-physical-service/documentation/Hyper-Converged-IDC/Distributed-Cloud-Physical-Server/Image/DCPS-020.png)

<p align="center">Route Information [Figure 1.1]</p>

3. Modify the Distributed Cloud Physical Server to be the private IP of NAT Gateway (such as 172.16.0.3):

vim /etc/sysconfig/network-scripts/ifcfg-eth0, add one entry of `GATEWAY=172.16.0.3`, save and exit wq, and restart the service to take effect the service network restart.

![修改默认网关图2.0](https://github.com/jdcloudcom/cn/blob/cn-distributed-cloud-physical-service/documentation/Hyper-Converged-IDC/Distributed-Cloud-Physical-Server/Image/DCPS-021.png)

<p align="center">Modification of Default Gateway [Figure 2.0]</p>

![查看默认路由的网关图2.1](https://github.com/jdcloudcom/cn/blob/cn-distributed-cloud-physical-service/documentation/Hyper-Converged-IDC/Distributed-Cloud-Physical-Server/Image/DCPS-022.png)

<p align="center">View Gateway of Default Routing [Figure 2.1]</p>

#### Configuration Policy of NAT Gateway System

1. Enable the route forwarding functions of the system:

Edit the vim vi /etc/sysctl.conf file, modify `net.ipv4.ip_forward = 1`; the configuration will take effect without restarting system for sysctl –p.

![开启路由转发功能](https://github.com/jdcloudcom/cn/blob/cn-distributed-cloud-physical-service/documentation/Hyper-Converged-IDC/Distributed-Cloud-Physical-Server/Image/DCPS-023.png)

2. Add Forwarding Rules

The default iptables policy does not allow the traffic forwarding, therefore we need to delete the default banning rules of forwarding; in `iptables -D FORWARD 1`, `1` refers to the first rules of the Forwarding Rules. As there is only one default FORWARD rule by, it is required that only the first rule is deleted.

![默认forward转发规则图2.0](https://github.com/jdcloudcom/cn/blob/cn-distributed-cloud-physical-service/documentation/Hyper-Converged-IDC/Distributed-Cloud-Physical-Server/Image/DCPS-024.png)

<p align="center">Default Forwarding Rules [Figure 2.0]</p>


`iptables -A FORWARD -s 172.16.0.0/16 -i eth0 -j ACCEPT`


It is allowed to forward the traffic from the intranet segment (172.16.0.0/16) and from the intranet network interface eth0.


`iptables -A FORWARD -m state --state RELATED,ESTABLISHED  -j ACCEPT`


Forwarding of the traffic with established links is allowed and entrance of new request traffic from the Internet is not allowed.

![forward转发规则图2.1](https://github.com/jdcloudcom/cn/blob/cn-distributed-cloud-physical-service/documentation/Hyper-Converged-IDC/Distributed-Cloud-Physical-Server/Image/DCPS-025.png)

<p align="center">Forwarding Rules [Figure 2.1]</p>

3. Configure SNAT (the internal DCPS can access public network via NAT Gateway):

```
iptables -t nat -A POSTROUTING -s 172.16.0.0/16 -o eth1 -j SNAT --to-source 103.37.46.14
```

![SNAT策略规则图3.0](https://github.com/jdcloudcom/cn/blob/cn-distributed-cloud-physical-service/documentation/Hyper-Converged-IDC/Distributed-Cloud-Physical-Server/Image/DCPS-026.png)

<p align="center">SNAT Policy Rules [3.0]</p>

4. Save configuration

service iptables save

### Configuration Scheme of Public Network Access DCPS

1. Add filter security rules:

Access to corresponding businesses is allowed, such as TCP, UDP, ICMP services of SSH 22, NTP 123 and http80.

```
Iptables -A INPUT -i eth1 -p tcp -m state --state NEW -m tcp --dport 22 -j ACCEPT
iptables -A INPUT -i eth1 –p udp -m state --state NEW -m tcp --dport 123 -j ACCEPT
iptables -A INPUT -i eth1 -p tcp -m state --state NEW -m tcp --dport 80 -j ACCEPT
```

2. 	Configure DNAT (the public network can access the Distributed Cloud Physical Server via NAT Gateway)
Map the TCP 8888 port number to SSH 22 port of CPS.

```
Iptables –t nat -A PREROUTING -p tcp -m tcp --dport 8888 -j DNAT --to-destination 172.16.0.4:22
```

![DNAT策略规则图2.0](https://github.com/jdcloudcom/cn/blob/cn-distributed-cloud-physical-service/documentation/Hyper-Converged-IDC/Distributed-Cloud-Physical-Server/Image/DCPS-026.png)

<p align="center"> DNAT Policy Rules [2.0]</p>

                         
3. Save configuration

service iptables save
