## Action Steps

The following is an example of creating a filter table firewall:

### **1. Clear Original Rules**

```
[root@jd ~]# iptables -F    #Clear the rules of all the rule chains in the preset form filter
[root@jd ~]# iptables -X    #Clear the rules of the user-customized chains in the preset form filter
```
### **2. Set Preset Rules**

```
[root@jd ~]# iptables -P OUTPUT ACCEPT
[root@jd ~]# iptables -P FORWARD DROP
```

### **3. Saving Rules**

[root@jd ~]# iptables -L –n    #Check if the settings are done, and all the DROPs can be seen

The settings are done and valid temporarily; the server will recover to the status where no settings are done if it is rebooted. Use service iptables save for saving. When you see the information firewall rules, it means to save in /etc/sysconfig/iptables. May open the file to view vi /etc/sysconfig/iptables


### **4. Adding Rules**

Remote SSH Login (Open Port 22)
```
[root@jd ~]# iptables -A INPUT -p tcp --dport 22 -j ACCEPT
[root@jd ~]# iptables -A OUTPUT -p tcp --sport 22 -j ACCEPT
```
WEB Server (Open Port 80)
```
[root@jd ~]# iptables -A INPUT -p tcp --dport 80 -j ACCEPT
```
Email Server (Open Ports 25, 110)
```
[root@jd ~]# iptables -A INPUT -p tcp --dport 110 -j ACCEPT
[root@jd ~]# iptables -A INPUT -p tcp --dport 25 -j ACCEPT
```
FTP Server (Open Port 21)
```
[root@jd ~]# iptables -A INPUT -p tcp --dport 21 -j ACCEPT
```
DNS Server (Open Port 53)
```
[root@jd ~]# iptables -A INPUT -p tcp --dport 53 -j ACCEPT
```
HTTPS (Open Port 443)
```
[root@jd ~]# iptables -A INPUT -p tcp --dport 443-j ACCEPT
```
Allow ICMP (Allow ping)
```
[root@tp ~]# iptables -A OUTPUT -p icmp -j ACCEPT
[root@tp ~]# iptables -A INPUT -p icmp -j ACCEPT
```
Allow loopback (or will lead to problems such as failure of normal closing of DNS)
```
IPTABLES -A INPUT -i lo -p all -j ACCEPT
IPTABLES -A OUTPUT -o lo -p all -j ACCEPT
```
Forbid tcp access of a certain IP
```
[root@jd ~]# iptables -A INPUT -p tcp -s 192.168.1.2 -j DROP
```

### **5. Deletion Rules**

First, we need to know the number of the rule; there is a number for each rule

The rule and corresponding number can be shown through iptables -L -n --line-number
```
[root@jd ~]# iptables -L -n --line-number
```

```
num target     prot opt source               destination
1    DROP       tcp -- 0.0.0.0/0            0.0.0.0/0           tcp dpt:3306
2    DROP       tcp -- 0.0.0.0/0            0.0.0.0/0           tcp dpt:21
3    DROP       tcp -- 0.0.0.0/0            0.0.0.0/0           tcp dpt:80
```
 

With the extra line of num, we can see that the corresponding number of the early rule is 2. Then we can conduct the deletion.
```
[root@jd ~]# iptables -D INPUT 2
```
Delete the rule with the INPUT chain number 2

Check by iptables -L -n; the deletion is done.
