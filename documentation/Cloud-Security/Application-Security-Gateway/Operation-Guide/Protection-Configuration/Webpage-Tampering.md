# Webpage Tamper-proofing

**Function Description**

​    The webpage tamper-proofing uses the mandatory static cache locking and updating mechanism to protect specific webpages. Even though relevant webpage of origin server is tampered, it can be returned to the user cache page. This function is in the public beta stage currently and provided for free in basic version.

**Action Steps**

​     1. Enter the console instance management page, and click protection configuration to enter the configuration page of protection tabs and then click the webpage tamper-proofing setting.

![image.png](https://img1.jcloudcs.com/cms/ab29442e-f406-442d-9334-4db0db4a1b4b20180817111409.png)

​    **Field Description**:

​    **URL**: URL of tamper-proofing page.

​    **Tamper-proofing Times**: effective tamper-proofing times upon adding a tamper-proofing page

​    **Protection Status**: whether this rule takes effect

​    **Operation Instructions**:   

​            Update cache, click and update contents on the protection page. The protection page will cache information of relevant page when the origin server is accessed at the first time.

​            Edit: modify rules.

​            Delete: delete relative rules.

​    2. Click Add a Rule and fill in the rule name and the URL needs tamper-proofing setting

​    ![image.png](https://img1.jcloudcs.com/cms/1270e388-4827-4e1c-9244-0500785b4f1f20180817111645.png)