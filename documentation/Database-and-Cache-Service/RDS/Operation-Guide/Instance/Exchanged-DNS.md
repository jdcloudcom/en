# Domain Switch

Domain switch is to exchange the Intranet and Internet domains of two instances simultaneously. Where the user uses backup-based creation and time-based creation and new instances are required to be connected for applications, domains of original instances can be switched to new instances with the domain switch function. In such case, additional risks and work caused by modifying database connection character strings can be avoided.

 For example, the user deletes a batch of data by mistake and needs to recover such data via backup with original instance kept for data verification. In such case, the user can carry out the following operation:
1. Use **"Create Based on Backup"** or **"Create Via Time Point"** to recover the data to a new instance.
2. Check the data on the new instance
3. Use **"Domain Switch"** to switch the domain of the old instance to the recovered new instance, which can avoid applying and adjusting the access domain of database.

## Operation Steps
**1. Click **Domain Switch**

Enter the instance details and click **Domain Switch** at the top right

**2. Select instance**

After selecting the two instances requiring domain switch, click **OK** for operation

**Note: The two instances must have or do not have Internet domains at the same time. If in these two instance, one instance has an Internet domain while the other doesn’t, such operation is forbidden.**

![域名切换1](../../../../../image/RDS/Exchange-DNS-2.png)
