# Public Network Access Method
*Tip: The way to access from the public network to Message Queue is only available for test. Do not use it in the Production Environment.*  

## Preconditions
To receive and send messages by using jcq sdk on the public network, it is required to meet the following precondition: own a JD Cloud Virtual Machines with Linux system, and associated EIP.

## 1. Proxy Setting

 Locally install a proxy client, for example, Proxifier and ProxyCap, and configure the proxy rules. Take Proxifier as an example for explanation.

### 1.1 Configuration of Proxy Server
 Configuration File->Proxy Server->Add  
 Address: 127.0.0.1  
 Port: Enter a locally unused port, such as 19999  
 Protocol: Select SOCKS version 5  
 Verification: Don't enable  

![公网访问-01](https://github.com/jdcloudcom/cn/blob/edit/image/Internet-Middleware/Message-Queue/公网访问-01.png)
 

### 1.2 Configuration of Proxy Rules

Configuration File->Proxy Rules->Add  
Name: Enter Any Name (e.g. jcq proxy rule)   
Application Program: Any program  
Target Machine: *.jvessel-open-hb.jdcloud.com  
Target Port: Any port  
Action: Select the proxy server created just now  


![公网访问-02](https://github.com/jdcloudcom/cn/blob/edit/image/Internet-Middleware/Message-Queue/公网访问-02.png)

Note: Select Direct as the action of Default rules, so that the network traffic outside jcq does not use proxy.  


![公网访问-03](https://github.com/jdcloudcom/cn/blob/edit/image/Internet-Middleware/Message-Queue/公网访问-03.png)



## 2. SSH Port Forwarding Configuration

Locally install ssh client such as SecureCRT and Xshell. Take SecureCRT as an example to explain how to configure port forwarding rules.  

### 2.1 Creation of Connection
Protocol: SSH2  
 Machine Name: Enter EIP of the User’s Virtual Machine  
Port: 22  
 Firewall: None  
User Name: Root  

![公网访问-04](https://github.com/jdcloudcom/cn/blob/edit/image/Internet-Middleware/Message-Queue/公网访问-04.png)

### 2.2 Configuration of Port Forwarding Rules

Option->Session Option->Connection->Port Forwarding  


![公网访问-05](https://github.com/jdcloudcom/cn/blob/edit/image/Internet-Middleware/Message-Queue/公网访问-05.png)


![公网访问-06](https://github.com/jdcloudcom/cn/blob/edit/image/Internet-Middleware/Message-Queue/公网访问-06.png)

Add Port Forwarding Rules  

Name: Enter Any Name (e.g. jcq forward rule)   

Manually select a local ip address permitted to connect: check  

IP Address: 127.0.0.1  

Port: Enter the local port configured in proxy in step 1.1. In this instance, it is 19999.  

Remote: Check ‘use SOCKS 4 or 5 for dynamic forwarding’  


![公网访问-07](https://github.com/jdcloudcom/cn/blob/edit/image/Internet-Middleware/Message-Queue/公网访问-07.png)



## 3. Use SDK to Receive and Send Messages

After meeting the following preconditions, locally use sdk to receive and send messages.  

Preconditions:
- Ensure that the proxy client in step 1 is in running status  
- Ensure that the connection configured in step 2 is in connecting status  
