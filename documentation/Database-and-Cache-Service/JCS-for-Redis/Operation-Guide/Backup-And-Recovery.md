# Backup Recovery
  
## 1. Automatic Backup (Set Automatic Backup Policy)

Each instance provides backup once a day in seven days a week. Users may customize the backup period and time with a minimum of once a week. The steps for setting backup policy are as below:

①. Log in Redis management console and select the target instance;

②. Click instance name to go to the instance resource information page;

③. Select backup recovery tag in the tag field;

④. Select backup setting tab;

⑤. Click **Edit** to customize the period and time of automatic backup.

 ![备份1](https://github.com/jdcloudcom/cn/blob/redis-1/image/Redis/backup.PNG)

Note: The retention time of backup data by default is 7 days. This is unchangeable.

⑥. Click **OK** to complete automatic backup setting.

## 2. Manual Backup (Backup Now)

Users can click the manual backup button on the top right corner of the backup recovery tag page, enter the manual backup name in the popup notification and then click **OK** to back up immediately.

![备份2](https://github.com/jdcloudcom/cn/blob/edit/image/Redis/backup2.png)
 
## 3. Backup Download

Users can view the backup data list on the "backup data" tag page. After checking the backup data required to be downloaded and clicking **Download**, there will be a pop-up notifying the download link and then you can download it to the local specified path.

Description: Each replicable node "download link" shall be an intelligent resolution address (with a valid duration of 1 hour) through which you can conduct resolution and download based on the network environment (note: in case of intranet download, the Virtual Machines and the database shall be in the same region).

![备份3](https://github.com/jdcloudcom/cn/blob/redis-1/image/Redis/backupdownload.PNG)

## 4. Backup Recovery

Users can view the backup data list on the "backup data" tag page. After clicking **Data Recovery** for the backup data to be recovered, there will be a pop-up notifying the recovery confirmation and then the data begins to recover after you click **OK**.

 ![备份4](https://github.com/jdcloudcom/cn/blob/edit/image/Redis/backup4.png)
