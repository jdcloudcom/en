# System Setting

## Security Setting

**Operation Steps**

Login System Configuration > Security Configuration page

![](/image/Bastion/security.png) 

   Login timeout: Edit login time-out period and then click **OK** to complete change.
   
   Password failure times: Edit the password failure times and click **OK** to finish change.
   
   Lock time: When a user’s login failure times reach the restriction requirements, login within this time interval is forbidden and further operation can be made upon re-login.
   
   Service time of password: If the password is not updated by the user during this period, the user password will become expired and invalid.
   
   Maximum SSH idle time: If no operation is made within the maximum idle time, connection will be automatically disconnected.



## Storage Management

**Storage Configuration**

Via storage management, the disk data status of the Bastion can be viewed.

![](/image/Bastion/security.png) 


**Automatic Deletion**

Under automatic deletion mode, setting of automatically deleting data of XX days can be set

![](/image/Bastion/security.png) 

## Log Backup

**Operation Steps**

1. Login System > Log Backup tab

2. Click **Create Backup** to produce backup files

![](/image/Bastion/backup.png) 

   Select a time range and contents to be outputted (operation logs and session logs) to output backup files.
   


