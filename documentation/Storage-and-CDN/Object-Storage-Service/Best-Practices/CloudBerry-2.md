# Managing OSS by using CloudBerry

## Introduction

CloudBerry Explorer is a file browser developed by the industry, used for directly accessing and managing Object Storage Service under Windows. You may access and managing JD Cloud OSS via CloudBerry Explorer.

Main functions of CloudBerry include: supporting AK/SK login, managing bucket, managing object, upload, download, external link, synchronization, etc.

For more details of actions, please download [User Manual for Object Storage Service Cloudberry](http://downloads.oss.cn-north-1.jcloudcs.com/%25E4%25BA%25AC%25E4%25B8%259C%25E4%25BA%2591%25E5%25AF%25B9%25E8%25B1%25A1%25E5%25AD%2598%25E5%2582%25A8CloudBerry%25E4%25BD%25BF%25E7%2594%25A8%25E6%2589%258B%25E5%2586%258C.pdf)

## Use CloudBerry to Access OSS

CloudBerry download link: http://www.cloudberrylab.com/download-thanks.aspx?prod=cbes3free

Before using CloudBerry, you need to register an account in JD Cloud in advance and sign up the JD Cloud OSS.

Specific steps for accessing OSS via CloudBerry are as follows:

Step 1: Click **New Storage Account**in the Source drop-down list on the right and select S3 Compatible in the pop-up.

![](https://github.com/jdcloudcom/cn/blob/edit/image/Object-Storage-Service/OSS-079.jpg)

Step 2: Fill in corresponding parameters in the pop-up dialog box:

![](https://github.com/jdcloudcom/cn/blob/edit/image/Object-Storage-Service/OSS-080.jpg)

Display name: Display name and fill in your own user name generally.

Service point: Fill in [service endpoint of S3 compatible](../../API-Reference-S3-Compatible/Regions-And-Endpoints.md) to JD Cloud.

Access key, Secret key: AK and SK access to OSS service

Use SSL: Use SSL or not. Do not check this option.

Use native multipart upload (recommended): Use native multipart upload or not

Signature version: Select 4

Step 3: Click **Test Connection** to test if the connection is successful or click **OK** for connection.

![](https://github.com/jdcloudcom/cn/blob/edit/image/Object-Storage-Service/OSS-081.jpg)

Once the connection is successful, corresponding Bucket list under the account (like jcloud) will be shown, as below:

![](https://github.com/jdcloudcom/cn/blob/edit/image/Object-Storage-Service/OSS-082.jpg)
