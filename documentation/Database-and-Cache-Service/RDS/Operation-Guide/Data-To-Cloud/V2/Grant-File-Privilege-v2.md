# Backup File Authorization

A SQL Server instance needs read permission of backup files in the Object Storage Service, which file read permission can be added with the following method

**Suggestion: We suggest you create a separated Object Storage Service for uploading backup files to be imported, and grant read permission of the entire Bucket to the background system account**

1. Create the bucket for storing files to be imported, e.g., database-bak
2. Enter the Permission Setting page
Click **Enter the Bucket**, select **Space Setting**, **Add Customized Permission** to enter Permission Setting page

![权限设置1](../../../../../../image/RDS/Grant-File-Privilege-1.png)

3. Set permission
- Select **Customized User**, add user ID: **785455908940**
- Check **"GetObject"** and **"ListBucket"** for Operations
- Keep others unchanged
- Click **OK** to save settings

![权限设置2](../../../../../../image/RDS/Grant-File-Privilege-2.png)

**Note: Do not set any parameters in the "Static Website Hosting" page under "Space Settings" in this Bucket, or the reading of backup file may fail**
