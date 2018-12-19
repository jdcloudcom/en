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

If you want to use the PING command to check whether the VM public network/intranet network is connected in order to check network faults, you can realize such an application by configuring the inbound rules as follows:

| Rule Direction | Type | Protocol | Destination Port | Source IP | Strategy |
| -------- | ---- | ---- | -------- | --------- | ---- |
| Inbound     | PING | ICMP |         | 0.0.0.0/0 | Accept |



### Allow VM to provide Web services*

If you want to create a VM providing external Web services, you can configure the following inbound rules to implement basic Web services on HTTP or HTTPS.

| Rule Direction | Type | Protocol | Destination Port | Source IP | Strategy |
| -------- | ----- | ---- | -------- | --------- | ---- |
| Inbound     | HTTP  | TCP  | 80       | 0.0.0.0/0 | Accept |
| Inbound     | HTTPS | TCP  | 443      | 0.0.0.0/0 | Accept |

### **Allow VM to provide DNS service** 

If you want to create a VM providing the DNS service, you can configure the inbound rule as follows:

| Rule Direction | Type | Protocol | Destination Port | Source IP | Strategy |
| -------- | ---------- | ---- | -------- | --------- | ---- |
| Inbound     | DNS (TCP) | TCP  | 53       | 0.0.0.0/0 | Accept |

### **Allow VM to provide FTP service**

If you want to use FTP software to upload or download files to VMs, after installing the FTP server program on a VM, you can configure the following inbound rules to realize FTP service authentication and data transmission

| Rule Direction | Type | Protocol | Destination Port | Source IP | Strategy |
| -------- | --------- | ---- | -------- | --------- | ---- |
| Inbound     | Customized TCP | TCP  | 20-21    | 0.0.0.0/0 | Accept |

### Allows VM to access MySQL/Redis/SQL Server databases

If you want to create a VM that can access the JD Cloud database service, you may configure the following outbound rule:

| Rule Direction | Type | Protocol | Destination Port | Source IP | Strategy |
| -------- | --------- | ---- | -------- | --------- | ---- |
| Outbound     | Customized TCP | TCP  | 1-65535  | 0.0.0.0/0 | Accept |

### **Allow VM as SQL Server database services to provide database services**

If you have created a Windows VM with a SQL Server database, you can allow other servers to access the database by configuring the following inbound rules

| Rule Direction | Type | Protocol | Destination Port | Source IP | Strategy |
| -------- | --------- | ---- | -------- | --------- | ---- |
| Inbound     | Customized TCP  | TCP  | 1433     | 0.0.0.0/0 | Accept |

`If you want to limit the IP addresses of the access service, you can fill in the explicit IP addresses or network segment at the source IP column. If there are multiple IP addresses, you can add multiple rules to achieve.`
