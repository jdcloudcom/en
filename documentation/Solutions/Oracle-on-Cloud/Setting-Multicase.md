# Set multicast

Multicast can be implemented through N2N software


### Cluster IP partition
|Machine Name | Public IP | Private IP | VirtualIP|scan IP|
|-|-|-|-|-|
|oracle-rac1|10.10.10.101|192.168.100.101|10.10.10.103|10.10.10.105 scan-ip|
|oracle-rac2|10.10.10.102|192.168.100.102|10.10.10.104|10.10.10.105 scan-ip|

### 1. Install N2N
Execute on all nodes where Oracle RAC is scheduled to be installed
```
svn co https://svn.ntop.org/svn/ntop/trunk/n2n
cd n2n/n2n_v2
make
make install
```

### 2. Enable supernode service
Enable the supernode service on one of the nodes
```
/opt/n2n/sbin/supernode -l 65530
# Write in booting self-startup
echo "/opt/n2n/sbin/supernode -l 65530" >> /etc/rc.local
```

### 3. Set multiple IP for nodes
Take two nodes as an example, you also need to write to the booting self-starting file
```
# 10.0.0.32 is the IP address for enabling the supernode service node

# Node 1
/opt/n2n/sbin/edge -d edge0 -a 10.10.10.101 -s 255.255.255.0 -c dtstack -k dtstack -l 10.0.0.32:65530 -E -r
/opt/n2n/sbin/edge -d edge1 -a 192.168.100.101 -s 255.255.255.0 -c dtstack -k dtstack -l 10.0.0.32:65530 -E -r

# Node 2
/opt/n2n/sbin/edge -d edge0 -a 10.10.10.102 -s 255.255.255.0 -c dtstack -k dtstack -l 10.0.0.32:65530 -E -r
/opt/n2n/sbin/edge -d edge1 -a 192.168.100.102 -s 255.255.255.0 -c dtstack -k dtstack -l 10.0.0.32:65530 -E -r
```
