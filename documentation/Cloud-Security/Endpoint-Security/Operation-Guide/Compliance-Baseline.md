## Compliance Baseline

### Application for Enterprise Version

As the Compliance Baseline function is covered by Enterprise Version, tenants need to apply for trial of Enterprise Version to enable this function.

Log in to Official Website -> Product -> Endpoint Security and click **Trial Application of Enterprise Version**.
[Application Link](https://www.jdcloud.com/en/public/testApply/baseline),

![申请试用1](../../../../image/Endpoint-Security/申请试用-1.png)

![申请试用2](../../../../image/Endpoint-Security/申请试用-2.png)

Wait for background approval. After the approval is obtained, the compliance baseline and asset management will be displayed in the Endpoint Security product menu under this account.

### Compliance Baseline

#### Function Description

1. Support one-click task baseline check and visually display check results.

2. Automatically track changes of configuration status, greatly improving management efficiency.

3. Refer to domestic and foreign best practices of baseline check and meet the compliance audit requirements of supervision organization.

#### Entrance of Features

Log in to Console -> **Cloud Security** -> **Endpoint Security** -> **Threat Overview** and click **Compliance Baseline Risk** to redirect to **Compliance Baseline**

![](../../../../image/Endpoint-Security/%E5%90%88%E8%A7%84%E5%9F%BA%E7%BA%BF-1.png)

Log in to Console -> **Cloud Security** -> **Endpoint Security** -> **Compliance Baseline**

![](../../../../image/Endpoint-Security/%E5%90%88%E8%A7%84%E5%9F%BA%E7%BA%BF-2.png)

#### Create Check Task

Log in to Console -> [Cloud Security] -> [Endpoint Security] -> [Compliance Baseline], click the left corner to create a check

![](../../../../image/Endpoint-Security/%E5%90%88%E8%A7%84%E5%9F%BA%E7%BA%BF-3.png)

Check range: Create group information configuration based on group management in [Asset Management]

![](../../../../image/Endpoint-Security/baseline-11.png)

Check cycle: Support one check every 1 day, one check every 7 days, one check every 30 days

Check period: Four periods are supported according to different business peaks of users: 0:00~6:00, 6:00~12:00, 12:00~18:00, 18:00~24:00.

Baseline type: Currently, only the Best Practices Rule Set of Linux Platform is supported. In the future, Linux Application Best Practices, docker Best Practices and other rule sets will be added.

#### Execute Check Task

1. According to different requirements of tenants for Compliance Baseline Check Items of Virtual Machines, single check items can be ignored or ignored in batches. Meanwhile, when requirements of check items change, ignoring of single check items can be canceled or canceled in batches.
![](../../../../image/Endpoint-Security/%E5%90%88%E8%A7%84%E5%9F%BA%E7%BA%BF-7.png)

2. If periodic task scanning is set, the scanning task can be performed in advance.
![](../../../../image/Endpoint-Security/baseline-13.png)

3. After the check results are completed and the tenant completes the repair according to the reinforcement suggestion, the results will be verified again. The tenant can click all verification or only inspect a single check item
![](../../../../image/Endpoint-Security/baseline-14.png)

#### Display check result

Display check result from the perspective of check item. (Check result will be launched recently and displayed from the perspective of Virtual Machines)

Failed item: Number of failed check items

Affected endpoint: Number of endpoints with failed item

![](../../../../image/Endpoint-Security/%E5%90%88%E8%A7%84%E5%9F%BA%E7%BA%BF-5.png)

![](../../../../image/Endpoint-Security/%E5%90%88%E8%A7%84%E5%9F%BA%E7%BA%BF-6.png)
