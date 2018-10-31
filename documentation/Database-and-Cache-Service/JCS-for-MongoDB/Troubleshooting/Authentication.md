# Login Database Prompt of Without Permission

## Problem Description

When I log into the MongoDB database, both the account and password are entered correctly, but it prompts failure of authentication .

![](https://github.com/jdcloudcom/cn/blob/master/image/mongodb/mongo-030.png)

## Problem Processing

It is required to enter the authentication library corresponding to the account when logging in MongoDB database, and if the authentication library is not correctly entered, it will prompt the failure of authentication. Assuming that the authorization library of your account is test, you can log in by using the following command:

> mongo --host xxxx.jdcloud.com:27017 --authenticationDatabase test -u <username> -p <password>

or

> mongodb://<username>:<password>@xxxx1.jdcloud.com:27017,xxxx2.jdcloud.com:27017/test?replicaSet=mgset-3937681456 

## Follow-up Processing
  If the problem is still not solved through the above operation, please [Open ticket](https://ticket.jdcloud.com/myorder/form?cateId=166&questionId=238) or call the customer hotline 400-615-1212 。
