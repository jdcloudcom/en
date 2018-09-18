# Managing OSS by using CloudBerry

## Introduction

CloudBerry Explorer is a file browser developed by the industry, used for directly accessing and managing object storage service under Windows. You may access and managing JD Cloud OSS via CloudBerry Explorer.

Main functions of CloudBerry include: supporting AK/SK login, managing bucket, managing object, upload, download, external link, synchronization, etc.

For more details of actions, please download [User Manual for JD Cloud Object Storage Service Cloudberry](https://oss.cn-north-1.jcloudcs.com/downloads/%E4%BA%AC%E4%B8%9C%E4%BA%91%E5%AF%B9%E8%B1%A1%E5%AD%98%E5%82%A8CloudBerry%E4%BD%BF%E7%94%A8%E6%89%8B%E5%86%8C.pdf)

## Use CloudBerry to access OSS

CloudBerry download link: http://www.cloudberrylab.com/download-thanks.aspx?prod=cbes3free

Before using CloudBerry, you need to register an account in JD Cloud in advance and sign up the JD Cloud OSS.

Specific steps for accessing OSS via CloudBerry are as follows:

Step 1: Click **New Storage Account**in the Source drop-down list on the right and select S3 Compatible in the pop-up.

![](https://github.com/jdcloudcom/cn/blob/edit/image/Object-Storage-Service/OSS-079.jpg)

Step 2: Fill in corresponding parameters in the pop-up dialog box:

![](https://github.com/jdcloudcom/cn/blob/edit/image/Object-Storage-Service/OSS-080.jpg)

Display name: Display name and fill in your own user name generally.

Service point: Fill in service domain name of S3 compatible to JD Cloud. (For service domain name of compatible S3, please refer to https: //www.jdcloud.com/help/detail/1902/isCatalog/1 )

Access key, Secret key: AK and SK access to OSS service

Use SSL: Use SSL or not. Do not check this option.

Use native multipart upload (recommended): Use native multipart upload or not

Signature version: Select 4

Step 3: Click **Test Connection** to test if the connection is successful or click **OK** for connection.

![](https://github.com/jdcloudcom/cn/blob/edit/image/Object-Storage-Service/OSS-081.jpg)

Once the connection is successful, corresponding Bucket list under the account (as jcloud) will be shown, as below:

![](https://github.com/jdcloudcom/cn/blob/edit/image/Object-Storage-Service/OSS-082.jpg)
