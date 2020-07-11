# SFTP Client Operation and Maintenance

The operation and maintenance personnel shall install tools supporting the SFTP protocol locally, such as Xftp, WinSCP, FlashFXP and FileZilla. Taking FileZilla for example, introduction to operation and maintenance login process of SFTP protocol is given.

## Operation Steps

1. Open the tool FileZilla, click the Site Manager page to add a new site, select the SFTP protocol, and enter the Bastion IP/domain and port.

![](/image/Bastion/sftp1.png) 

Generally, the following parameters of the client tool shall be entered:


| Parameters      |   Description  | 
| :--------: | :--------:|
| Host address  | Bastion IP address or domain |
| Port  | 2222|
| User name  | Bastion user name |
| Password  | Bastion user password |


2. Click **Connect** to connect the operation and maintenance Bastion.

3. After logging in the operation and maintenance Bastion successfully, the authorized server host list can be viewed on the right side.

![](/image/Bastion/sftp2.png) 

4. Double click the server host to be operated and maintained, and enter the directory of the server host to conduct file transmission operations.


