# Machine Operation and Maintenance
When the administrator completes configuration for asset, user and operation & maintenance rule in the Bastion instance, the Bastion user can access the authorized machine via the web browser or the terminal for operation and maintenance operation. The document specifies how to make operation and maintenance configuration and login by the operation and maintenance personnel.

## web Browser Operation and Maintenance

### Operation Steps

1. IAM sub-users can redirect to the Bastion instance via the management button on the Bastion Console page. Or, you can enter the Bastion domain in a browser, enter a user name and its password and click **Login** to log in the operation and maintenance Bastion.

![](/image/Bastion/domain.png) 

![](/image/Bastion/login-ins.png) 

2. If the user enables the MFA verification, please enter MFA security code and click **Submit

![](/image/Bastion/mfa.png) 

3. After login, please select the "Machine Operation and Maintenance" or "Machine Group Operation and Maintenance" from the left-side navigation bar
 
4. Machine Operation and Maintenance

4.1	 Click **Machine Operation and Maintenance** and login the machine operation and maintenance page. Then the page will display all machines available for operation and maintenance

4.2 Select a machine to be subject to operation and maintenance, click the drop-down button of the Linux/Windows account, select an account and click **Login

![](/image/Bastion/operate2.png) 

If the selected account is automatically logged in, please directly login the machine for operation and maintenance;

![](/image/Bastion/operate3.png) 

If the account is logged in by hand, the notification for entering password will be provided on the page. Enter the password and press the Enter key. Then, you can login the machine and perform operation and maintenance.

![](/image/Bastion/operate4.png) 

## SSH Client Operation and Maintenance

The operation and maintenance personnel need to install tools of SSH protocol such as Xshell, SecureCRT and PuTTY in the local machine Taking Xshell for example, introduction to operation and maintenance login process of SSH protocol is given.

### Operation Steps

1. Turn on Xshell and enter ip and port number (default: 22) of operation and maintenance Bastion in the connection setting

![](/image/Bastion/ssh1.png) 

2. Enter user name and password of operation and maintenance Bastion in User Identity Verification.

![](/image/Bastion/ssh2.png) 

3. Click **Connect** to connect the operation and maintenance Bastion

4. Enter the asset management interface after successful login of the operation and maintenance Bastion. The interface displays the machine and machine group available for operation and maintenance (the machine group is in red color and the machine is in green color)

![](/image/Bastion/ssh3.png) 

5. Select a machine or machine group subject to operation and maintenance, enter the front numbers and press the Enter key to display the account of login machine

![](/image/Bastion/ssh4.png) 

![](/image/Bastion/ssh5.png) 

6. Select an account and enter the front numbers. Then, the target machine can be logged in via the account for operation and maintenance

![](/image/Bastion/ssh6.png) 

![](/image/Bastion/ssh7.png) 


