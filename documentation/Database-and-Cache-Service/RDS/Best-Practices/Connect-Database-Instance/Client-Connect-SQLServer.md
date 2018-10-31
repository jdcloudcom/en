# Connection Instance of Client to JCS for SQL Server

## Microsoft Client Download Address
Download SQL Server Management Studio (SSMS) first, official address:>
http://download.microsoft.com/download/0/9/9/099E0C83-072B-42A5-83A0-9BB3D2E6E2A3/SQLManagementStudio_x64_CHS.exe

## Connection Method for Disabled Internet Access
It is recommended to disable the internet access in production environment for database security. Users can connect to the JCS for SQL Server database locally through the port forwarding function of SSH2 if to temporarily access the database locally through the client, and specific steps are as follows: (take SecureCRT as an example)

1. Prepare a VM with an EIP and Linux operating system, such as 64-bit CentOS 7.3. The machine shares one VPC and subnet with cloud data.
2. Choose "SSH2" for the connection protocol of SecureCRT and configure the IP of VM in public network

![Connection Instance 1](../../../image/RDS/Client-Connect-1.png)

3. Select ***Port Forwarding*** and click ***Add***.

![Connection Instance 2](../../../image/RDS/Client-Connect-2.png)

4. Configure forwarding parameters

![Connection Instance 3](../../../image/RDS/Client-Connect-3.png)

5. Connect the public network VM with SecureCRT

![Connection Instance 4](../../../image/RDS/Client-Connect-4.png)

6. Run SSMS locally and connect to the database

![Connection Instance 5](../../../image/RDS/Client-Connect-5.png)

7. Input connection information
Input the local IP "127.0. 0.1" and the local port 6000 configured in the server name column, separated by a comma;

Selects ***SQL Server Authentication*** for authentication

![Connection Instance 6](../../../image/RDS/Client-Connect-6.png)

8. Database can be connected for operation after authentication succeed.

![Connection Instance 7](../../../image/RDS/Client-Connect-7.png)

