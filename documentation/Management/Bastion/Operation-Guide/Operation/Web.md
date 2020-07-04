# web Browser Operation and Maintenance


## Machine Operation and Maintenance

**Operation Steps**

1. Users can enter the Bastion domain in a browser, enter a user name and its password and click **Login** to login the operation and maintenance Bastion;

![](/image/Bastion/login-ins.png) 

2. If the user enables the MFA verification, please enter MFA security code and click **Submit

![](/image/Bastion/mfa.png) 

3. After login, please select the "Machine Operation and Maintenance" from the left-side navigation bar 

![](/image/Bastion/operate1.png) 

4. Select a machine to be subject to operation and maintenance, click the drop-down button of the Linux/Windows account, select an account and click **Login

![](/image/Bastion/operate2.png) 

If the selected account is automatically logged in, please directly login the machine for operation and maintenance;

![](/image/Bastion/operate3.png) 

If the account is logged in by hand, the notification for entering password will be provided on the page. Enter the password and press the Enter key. Then, you can login the machine and perform operation and maintenance.

![](/image/Bastion/operate4.png) 

## File Transfer


After logging in target resources through Web terminal, an operable file tree is displayed on the left by default, which is used to manage files or folders in Linux directory/Windows temporary net disk

  ![](/image/Bastion/operate5.png) 
  
**Description of Operations** 

1.  Name of the temporary storage disk on Windows Server: The default directory for TempDisk on Bastion is Download. At the end of the current session, the temporary storage disk will be cleared synchronously.
     The default path for the storage of Linux server files is in root directory.
      
    
2. Click **Upload** icon to upload the file.
  
  ![](/image/Bastion/operate6.png) 
 
```
 To upload or download a file on Windows Server, you need to open the Server's disk directory, copy/paste the file on TempDisk on Bastion, and then upload/download it.
 At the end of the current session, the temporary storage disk will be cleared synchronously. Please handle the files in the temporary storage disk in time
```
  
   ![](/image/Bastion/operate8.png) 
   
  
3. Select a file, click **Download** icon, and download the file.
  
  ![](/image/Bastion/operate7.png) 

## Modify user password

**Operation Steps**

1. Click the user menu on the upper right corner and select personal information

2. Under Security Information of the Personal Information page, the user’s password for login the Bastion can be modified
 
 
 
 
 
 
