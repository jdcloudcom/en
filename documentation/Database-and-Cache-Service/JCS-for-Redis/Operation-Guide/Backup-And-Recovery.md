# Backup Recovery

  Here mainly introduce the use of backup recovery.
 
- Note: JCS Redis2.8 version supports backup recovery. JCS for Redis4.0 does not support it during the Beta but will support it at the end of the Beta.
  
## 1. Automatic Backup (Set Automatic Backup Policy)

Each instance provides backup once a day in seven days a week. Users may customize the backup period and time with a minimum of once a week. The steps for setting backup policy are as below:

①. Log in Redis management console and select the target instance;

②. Click instance name to go to the instance resource information page;

③. Select backup recovery tag in the tag field;

④. Select backup setting tab;

⑤. Click **Edit** to customize the period and time of automatic backup.

 ![备份1](https://github.com/jdcloudcom/cn/blob/edit/image/Redis/backup1.png)

Note: The retention time of backup data by default is 7 days. This is unchangeable.

⑥. Click **OK** to complete automatic backup setting.

## 2. Manual Backup (Backup Now)

Users can click the manual backup button on the top right corner of the backup recovery tag page, enter the manual backup name in the popup notification and then click **OK** to back up immediately.

![备份2](https://github.com/jdcloudcom/cn/blob/edit/image/Redis/backup2.png)
 
## 3. Backup Download

Users can see the backup data list by default in the backup recovery tag page. Click **Download** in the action bar on the right side of the corresponding backup data line to be downloaded and a download link notification will pop up. Users can download to the local memory based on their own conditions.

![备份3](https://github.com/jdcloudcom/cn/blob/edit/image/Redis/backup3.png)

## 4. Backup Recovery

Users can see the backup data list by default in the backup recovery tag page. Click **Data Recovery** in the action bar on the right side of the corresponding backup data line to be recovered and a recovery confirmation notification will pop up. Data recovery begins after users click **OK**.

 ![备份4](https://github.com/jdcloudcom/cn/blob/edit/image/Redis/backup4.png)
