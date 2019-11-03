# Export Data

JCS for MongoDB provides automatic backup and manual backup. To export the data, you can download the backup file and export it to your local database.

导出备份时请关注当前备份的备份方式是物理备份还是逻辑备份，两者恢复方式不同。

## Operation Steps
1. Login [MongoDB Console](https://mongodb-console.jdcloud.com/mongodb).

2. On the "Instance List" page, select the target instance, then click **Instance Name** to enter the "Instance Details" page.

3. On the "Instance Details" page, click **Backup & Restore** to view the backup data.

    ![View Backup](https://github.com/jdcloudcom/cn/blob/master/image/mongodb/mongo-010.png)
   
4. Select the backup you want to download. In the operation items, click **Download** to open the download popup.

    ![View Backup](https://github.com/jdcloudcom/cn/blob/master/image/mongodb/mongo-009.png)
	
5. Download the backup file to local.
	
    Description
        - The validity period of intranet address and internet address is 24 hours;
	- English quotation marks shall be added to URL when download using wget;
	- If the Virtual Machines is in the same region with the virtual database, you are recommended to use the intranet address for downloading;
	
6. Import the backup file to the local database.

    - 备份为逻辑备份时，请执行以下命令。

        ```
        mongorestore --host xxx --port=27017 --authenticationDatabase admin --archive=xxx(文件路径)  --gzip -u root -p xxx
        ```

    - 备份为物理备份时，请按以下步骤操作。

        1) Unzip the backup file to the specified path
        
        ```
        tar -C /xxx/data (mongod data storage path) -xf /yyy/mongo-xxxx.tar (backup file download path)
        ```
        
        2) Single Node Mode Start mongod
        
        ```
        mongod --dbpath /xxx/data
        ```
        
        3) Log in to mongo through mongo shell, delete local database
        
        ```
        mongo [--options]
        use local
        db.dropDatabase()
        ```
        
        4) Start the current node by the method of replica set
        
        ```
        mongod --dbpath /xxx/data --replSet <replName>
        ```
        
        5) Log in to mongo through mongo shell, use rs.initiate() on one and only one member of replica set
        
        ```
        mongo [--options]
        
        rs.initiate( {
         		 _id : <replName>,
           		members: [ { _id : 0, host : <host:port> } ]
        })
        ```
        
        [rs.initiate()Usage](https://docs.mongodb.com/master/reference/method/rs.initiate/#rs.initiate)
        
        6) Add a new member to the replica set (please make sure that the data in the newly added member -- dbpath directory is null)
        
        ```
        rs.add()
        ```
        
        [rs.add()Usage](https://docs.mongodb.com/master/reference/method/rs.add/#rs.add)
        
        [MongoDB Replica Set Recovery Official Reference Document](https://docs.mongodb.com/master/tutorial/restore-replica-set-from-backup/)



## Related Reference

- [Import Data](Import-Data.md)
