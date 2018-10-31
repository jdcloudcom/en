# Typical Configuration of Security Group Rules
The following configurations are all based on the assumption that there is no special network segment requirement for the source IP/ destination IP. If you want to restrict the IP address of the access service, you can clearly fill in IP address or network segment at the source IP position. If multiple IP addresses are to be added, you can add more rules to realize it.
## Allow SSH to Remotely Connect to Linux Instances
If you hope that the Linux instance created allows users to log in remotely via the SSH protocol, you can realize such access by configuring the following inbound rules without changing the default port of the SSH protocol:

|  **Rule Direction**   |  **Type**   |  **Protocol**   |  **Destination Port**   |  **Source IP**   |  **Policy**   |
| :--- | :--- | :--- | :--- | :--- | :--- |
|  Inbound   |  SSH   |   TCP |   22  |  0.0.0.0/0   |  Accept   |

## Allow RDP to Remotely Connect to Windows Instances
If you hope that the Windows instance created allows users to log in remotely via the RDP protocol, you can realize such access by configuring the following inbound rules without changing the default port of the RDP protocol:

|  **Rule Direction**   |  **Type**   |  **Protocol**   |  **Destination Port**   |  **Source IP**   |  **Policy**   |
| :--- | :--- | :--- | :--- | :--- | :--- |
|  Inbound  |  Customize TCP |   TCP |   3389  |  0.0.0.0/0   |  Accept   |

## Allow Public Network/ Intranet PING Instance
If you want to check whether the public network/ intranet network of the instance is connected through the PING command so as to remove network faults, you can achieve such application by configuring the following inbound rules:

|  **Rule Direction**   |  **Type**   |  **Protocol**   |  **Destination Port**   |  **Source IP**   |  **Policy**   |
| :--- | :--- | :--- | :--- | :--- | :--- |
|Inbound | ALL ICMP|  ALL ICMP |   -  |  0.0.0.0/0   |  Accept   |

## Allow Instances to Provide Web Services
If you hope that the instance created provides Web services externally, you can configure the following inbound rules to realize basic Web services according to the service type of HTTP or HTTPS:

|  **Rule Direction**   |  **Type**   |  **Protocol**   |  **Destination Port**   |  **Source IP**   |  **Policy**   |
| :--- | :--- | :--- | :--- | :--- | :--- |
|  Inbound   | HTTP |   TCP |   80  |  0.0.0.0/0   |  Accept   |
|  Inbound   |  HTTPS |   TCP |   443  |  0.0.0.0/0   |  Accept   |

### Allow Instances to Provide DNS Services
If you hope that the instance created provides DNS services, you can realize such services by configuring the following inbound rules:

|  **Rule Direction**   |  **Type**   |  **Protocol**   |  **Destination Port**   |  **Source IP**   |  **Policy**   |
| --- | --- | --- | --- | --- | --- |
|  Inbound   | DNS（TCP） |   TCP |   53 |  0.0.0.0/0   |  Accept   |

## Allow Instances to Provide FTP Services
If you want to use FTP software to upload or download files from/ to an instance, after installing the FTP server program on the instance, you can configure the following inbound rules to realize the authentication and data transfer of FTP services:

|  **Rule Direction**   |  **Type**   |  **Protocol**   |  **Destination Port**   |  **Source IP**   |  **Policy**   |
| --- | --- | --- | --- | --- | --- |
|  Inbound   | Customize TCP |   TCP |   20-21 |  0.0.0.0/0   |  Accept   |

## Allow Instances to Provide MySQL/Redis/SQL Server Database Services
If you hope that the instance created provides database services, you can realize access to the database from other services by configuring the following 3 outbound rules:

|  **Rule Direction**   |  **Type**   |  **Protocol**   |  **Destination Port**   |  **Source IP**   |  **Policy**   |
| :--- | :--- | :--- | :--- | :--- | :--- |
|  Inbound   |Customize TCP |   TCP |   3306（MySQL）  |  0.0.0.0/0   |  Accept   |
|  Inbound   |  Customize TCP |   TCP |   443  |  6379 (Redis)   |  Accept   |
|  Inbound   |  Customize TCP |   TCP |   443  |  1433 (SQL Server)   |  Accept   |
If you hope that the instance can have access to the remote database server, simply change the direction in the above rules to "Outbound".

## Allow Instances to Access Object Storage Service (OSS) of JD Cloud
If you hope that the instance created can access OSS domain name of JD Cloud, you can do so by configuring the following outbound rules:

|  **Rule Direction**   |  **Type**   |  **Protocol**   |  **Destination Port**   |  **Destination IP**   |  **Policy**   |
| --- | --- | --- | --- | --- | --- |
|  Outbound   | HTTP |   TCP |   80 |  0.0.0.0/0   |  Accept   |


