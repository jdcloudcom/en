## **Security Group Rules Typical Configuration**

### **Allow SSH remotely connect to Linux VMs**

If you want to create a Linux VM that allows users to log in remotely through the SSH protocol, you can configure such access by configuring the following inbound rules without changing the default port of the SSH protocol:

| Rule Direction | Type | Protocol | Destination Port | Source IP | Strategy |
| -------- | ---- | ---- | -------- | --------- | ---- |
| Inbound     | SSH  | TCP  | 22       | 0.0.0.0/0 | Accept |



### **Allow RDP to remotely connect to Windows VM** 

If you want to create a Windows VM that allows users to log in remotely via the RDP protocol, you can configure such access by configuring the following inbound rules without changing the default port of the RDP protocol.

| Rule Direction | Type | Protocol | Destination Port | Source IP | Strategy |
| -------- | --------- | ---- | -------- | --------- | ---- |
| Inbound     | Customized TCP | TCP  | 3389     | 0.0.0.0/0 | Accept |



### Allow public network/intranet PING VM

If you want to use the PING command to check whether the VM public network/intranet network is connected to check network faults, you can realize such an application by configuring the following inbound rules

| Rule Direction | Type | Protocol | Destination Port | Source IP | Strategy |
| -------- | ---- | ---- | -------- | --------- | ---- |
| Inbound     | PING | ICMP | -        | 0.0.0.0/0 | Accept |



### Allow VM to provide Web services*

If you want to create a VM to provide Web services externally, you can configure the following inbound rules to implement basic Web services according to the service type of HTTP or HTTPS.

| Rule Direction | Type | Protocol | Destination Port | Source IP | Strategy |
| -------- | ----- | ---- | -------- | --------- | ---- |
| Inbound     | HTTP  | TCP  | 80       | 0.0.0.0/0 | Accept |
| Inbound     | HTTPS | TCP  | 443      | 0.0.0.0/0 | Accept |

### **Allow VM to provide DNS service** 

If you wish the VM created to provide the DNS service, you can realize such service by configuring the following inbound rule. 

| Rule Direction | Type | Protocol | Destination Port | Source IP | Strategy |
| -------- | ---------- | ---- | -------- | --------- | ---- |
| Inbound     | DNS (TCP) | TCP  | 53       | 0.0.0.0/0 | Accept |

### **Allow VM to provide FTP service**

If you want to use FTP software to upload or download files to the VM, after installing the FTP server program on the VM, you can configure the following inbound rules to realize FTP service authentication and data transmission 

| Rule Direction | Type | Protocol | Destination Port | Source IP | Strategy |
| -------- | --------- | ---- | -------- | --------- | ---- |
| Inbound     | Customized TCP | TCP  | 20-21    | 0.0.0.0/0 | Accept |

### Allow VM to access MySQL/Redis/SQL Server databases

If you wish that the VM created can access the JD Cloud database service, you may realize such access demand by configuring the following outbound rule. 

| Rule Direction | Type | Protocol | Destination Port | Source IP | Strategy |
| -------- | --------- | ---- | -------- | --------- | ---- |
| Outbound     | Customized TCP | TCP  | 1-65535  | 0.0.0.0/0 | Accept |

### **It allows VM as SQL Server database services to provide database services**

If you have created a Windows VM with a SQL Server database, you can allow other servers to access the database by configuring the following inbound rules

| Rule Direction | Type | Protocol | Destination Port | Source IP | Strategy |
| -------- | --------- | ---- | -------- | --------- | ---- |
| Inbound     | Customized TCP  | TCP  | 1433     | 0.0.0.0/0 | Accept |

`If you want to limit the IP address of the access service, you can fill in the explicit IP address or network segment at the source IP address. If there are multiple IP addresses, you can add multiple rules to achieve`