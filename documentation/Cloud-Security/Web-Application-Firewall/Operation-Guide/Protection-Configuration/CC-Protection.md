# CC Security Defense

Introduction to CC Defense

CC security defense will help you protect CC attacks against page requests. It can use exclusive algorithm defense engine and combine with big data to intercept robot and malicious CC attacks in a second.

### **Feature Description**

CC security defense can intercept malicious machine CC attacks and provide protection policies of different modes: normal and attack emergency.

After the website accesses WAF, you can enable CC security defense for it and adjust corresponding protection policy based on actual needs.

### **Operation Steps**

Refer to the following steps to configure the CC security defense mode:

**Description: **Prior to the following operations, please ensure that the website has accessed WAF for protection. Please refer to CNAME Access Guideline for specific operations.

1. Log in to [JD Cloud Web Application Firewall Console](https://cloudwaf-console.jdcloud.com).

2. Go to **Website Configuration** page.

3. Select the domain required to be operated; click **Protection Configuration** under its operation list.

4. Enable the protection in **CC Security Defense** and select corresponding protection mode: 
         **Description: ** If you need to disable the protection function, you may disable it here.![img](https://github.com/jdcloudcom/cn/blob/edit/image/waf-img/cc-web1.png)

5. - **Normal**: Default use mode is Normal. It intercepts particularly exceptional requests. It is recommended to use this mode when the website has no obviously exceptional traffic.
   - **Attack emergency**: When the website responses slowly and the indicators such as traffic, CPU and internal memory are abnormal, you can select the attack emergency mode.


 
