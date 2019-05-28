# IAM Instruction to Log Service

## I. Concept

Resource IAM Service. IAM is a user-based authorization policy. By setting IAM, you can centrally manage your users (such as employees, systems or applications) and control the permissions of users on which resources users can access under your name. For example, you can restrict your users to have the read permission to the Log Service. The sub-account is subordinate to the primary account, and these accounts cannot have any actual resources. All resources belong to the primary account. 
The current version of Log Service only supports the primary and sub-account polices in IAM now and other roles will be supported subsequently.

## II. Log Service Use Process via Sub-account

### 1. Creation of Sub-account

Log in the Console via the primary account, enter "Management—>IAM", https://iam-console.jdcloud.com/summary
Click **Create**, fill in sub-account information, click **OK** and complete creation.

![image](https://raw.githubusercontent.com/jdcloudcom/cn/zhangwenjie-only/image/LogService/LogserviceIAM/LS01.png)

![image](https://raw.githubusercontent.com/jdcloudcom/cn/zhangwenjie-only/image/LogService/LogserviceIAM/LS02.png)

### 2.2 Authorization of Sub-account

Log in **Management-->IAM-->User Management**, select specified sub-account, click "Authorization" to authorize several policies for sub-accounts. For policy management, please view "Management-->IAM-->Policy Management".
There are two default policies, i.e. the administrator and the read-only, and the customized policy is supported.

![image](https://raw.githubusercontent.com/jdcloudcom/cn/zhangwenjie-only/image/LogService/LogserviceIAM/LS03.png)

### 3. Console Login via Sub-account

URL for logging the Console via a sub-account is different to that of a primary account, which can be viewed in the Overview Page.

![image](https://raw.githubusercontent.com/jdcloudcom/cn/zhangwenjie-only/image/LogService/LogserviceIAM/LS04.png)

After the sub-account is created and authorized, the Console can be logged in via the sub-account login link and operation as well as view can be realized with the authorized permission.
