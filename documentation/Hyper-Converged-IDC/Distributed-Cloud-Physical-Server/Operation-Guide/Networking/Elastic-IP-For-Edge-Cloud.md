## Elastic IP

### Product Overview

Elastic IP is a static IP dedicated for dynamic cloud computing. Different from the traditional static IP, elastic IP can be associated with any Distributed Cloud Physical Server and you can associate it to A or B. When the Distributed Cloud Physical Server fails or the availability zone fails, you may remap the IP address to a healthy Distributed Cloud Physical Server, and then you can handle server issues while providing services. Elastic IP is called as "Edge Cloud Public IP". (Note: This server refers in particular to the "Distributed Cloud Physical Server")

### Use Restrictions

Please keep the following restrictions in mind when using the Elastic IP.

1. Now, JD Cloud & AI supports that at most 10 elastic IPs are applied for each account per node. If more quotas are required, please [Open Ticket](https://ticket.jdcloud.com/applyorder/submit) to increase quota.<br/>

2. Elastic IP may only be associated with operator resources in the same node (including Distributed Cloud Physical Server).<br/>

3. Elastic IP can be associated and disassociated with Distributed Cloud Physical Server.<br/>

4. One single Elastic IP can be associated/disassociated for several times in one day. If it is required to change the IP of the resource that has associated Elastic IP, the resource shall disassociate current IP before associating new IP.<br/>

5. Now, monthly package resources are not allowed to be deleted.<br/>

### Billing Overview

Elastic IP supports 2 billing methods, i.e., Monthly Package and Pay By Configuration, and 2 billing items, i.e., bandwidth and additional uplink bandwidth. Monthly package: Pay in advance by bandwidth configuration Pay by configuration: Bill per hour according to the bandwidth configuration

**Monthly Package Billing**

The monthly package is Pay-In-Advance type, with a one-time fee of one month, several months or many years. It is suitable for the scenario of pre-estimation of Elastic IP bandwidth demand, and the cost is cheaper than billing by configuration.

Detailed Description:
Costs for months or years are paid in advance, and current purchased time period supports 1 month~9 months, 1 year, 2 years, and 3 years; costs are deducted at one time when creating the resources; for example: you have purchased the Telecom Elastic IP with 1M bandwidth and 1M additional uplink bandwidth for 1 month at 10:00:00 on August 2, 2017 at the monthly unit price of RMB 23, then you need to pay RMB 23=23* 1 and you could use this resource till 23:59:59 on September 2, 2017.

The resources of the monthly package do not support deletion before it expires. To guarantee your use rights, please confirm the business needs and then purchase.

The expiration time of monthly package billing order is 23:59:59 in the Nth natural month or natural year from the start time of the order; for example, if the start time of the order is from 15:00:00, January 1, 2016 and the duration is 1 month, the expiration time is 23:59:59, February 1, 2016.

##### Description for Stopping Expired Service

When the expiration time of your monthly package paid network resources is earlier than or the same as the current time, your paid network resources status will become expired. The paid online resources service will be stopped and cannot be used after the expiration.

Emails and SMSs will be sent to you by JD Cloud & AI before expiration of your monthly package paid online resources, reminding you that your resources are close to expire. Please check it and renew in time;

Upon expiration of your paid network resources, your service will be stopped immediately and be sent email and SMS to notify you of it. Please be sure to check the notification and recharge in time to prevent unnecessary losses;

Your paid network resources will be kept for 7 days from the moment when your service is stopped, and the system will recover the resources after 7 days, in which case the resources cannot be retrieved. The Console interface will only be able to perform renew operation;

The stopped resources can be used normally upon renewal

**Pay By Configuration**

Enabling requirements: To ensure your normal use, the sum of your account balance and available coupon will be no less than consumption threshold of RMB 50 when you enable the resource billed by configuration.

##### Description for Service Stopping Due to Arrearage

Your paid network resources (Elastic IP) status will become in arrears when the sum of the balance in your account and the available coupon is insufficient to pay the costs of next billing cycle resulting the deduction failing;

You can continue to normally use your paid network resource for 3 hours after the payment is overdue. After 3 hours, the overdue service and deduction will be stopped. The Console interface shall only be able to perform the deletion operation;

You will be sent email or SMS after your paid online resources are overdue. Please be sure to check the same and recharge in time to prevent unnecessary losses;

Your paid network resources will be kept for 7 days from the moment when your service is stopped, and the system will recover the resources after 7 days, in which case the resources cannot be retrieved.

The stopped paid online resources can be used normally after you make a supplementary payment for the amount overdue;

Please delete the resources in time if you don’t want to continue use the paid online resources of pay by configuration.

### Price Overview

For details, please refer to Elastic IP [Price Overview](../../Pricing/Price-Overview.md).

### Create Elastic IP

- Turn on the Console, click **Distributed Cloud Physical Server** -> **Elastic IP** in turn in the left navigation bar, log in the Elastic IP List Page and click **Apply** to pop up the Create Configuration window;<br/>

- Select the node, operator, billing by bandwidth mode, ISP line type, bandwidth, additional bandwidth cap, duration and count according to demands and click **OK** to create 1 elastic IP.<br/>

### View Elastic IP

- Turn on the Console, click **Distributed Cloud Physical Server** - **Elastic IP** in turn in the left navigation bar, log in the Elastic IP List Page and view Elastic IP information;<br/>

- or click **IP Address** of elastic IP to redirect to the details and view detailed information of elastic IP.<br/>


### Associate Resource

- Turn on the Console, click **Elastic IP List Page** in the left navigation bar, select a target EIP, click **Associate Resource** in operation or log in the details and then click **Associate Resource** in operation to pop up the information below;<br/>

- Select the resource type, network interface count, target network interface name according to demands and click **OK** to complete the association.

### Disassociate Resource

- Turn on the Console, click **Elastic IP List Page** in the left navigation bar, select a target EIP, click **Disassociate Resource** in operation or log in the details and then click **Disassociate Resource** in operation to complete the disassociation.<br/>

### Modify Bandwidth

- Turn on the Console, click **Elastic IP List Page** in the left navigation bar, select a target EIP, click **Modify Bandwidth** in operation or log in the details and then click **Modify Bandwidth** in operation to pop up the information below:<br/>

- Select the bandwidth and additional uplink bandwidth size to be adjusted in the popup to complete the operations.<br/>

### Add to Shared Bandwidth

- Turn on the Console, click **Elastic IP List Page** in the left navigation bar, select a target EIP, click **Add to Shared Bandwidth** in operation or log in the details and then click **Add to Shared Bandwidth** in operation, and select the Shared Bandwidth to be added to complete the operations.<br/>

- After an elastic IP is added to Shared Bandwidth, please note:<br/>
  1. The original bandwidth/additional uplink bandwidth value will become invalid and become as the same as the Shared Bandwidth;<br/>
  2. The original billing mode will become invalid and turn to the pure IP, without additional bandwidth cost;<br/>
  3. The elastic IP in pay-in-advance monthly package does not support addition to Shared Bandwidth now and only supports addition of the configured elastic IP to Shared Bandwidth.<br/>

### Remove Out of Shared Bandwidth

- Turn on the Console, click **Elastic IP List Page** in the left navigation bar, select a target EIP, click **Move Out of Shared Bandwidth** in operation or log in the details and then click **Move Out of Shared Bandwidth** in operation to complete the operations.<br/>

- After an elastic IP is moved out of Shared Bandwidth, please note:<br/>
  1. The bandwidth and additional uplink bandwidth cap before addition to Shared Bandwidth will be restored;<br/>
  2. The billing mode before addition to Shared Bandwidth will be restored.<br/>

### Renew

- Turn on the Console, click **Elastic IP List Page** in the left navigation bar, select a target EIP, click **Renew** in operation or log in the details and then click **Renew** in operation, and select the duration to be renewed, click **OK** to redirect to **Payment Confirmation Page** and then click **Pay Now** to complete the operations. Note:<br/>
  1. Elastic IP paid by configuration does not support renewal.

### Delete

- Turn on the Console, click **Elastic IP List Page** in the left navigation bar, select a target EIP, click **Delete** in operation or log in the details and then click **Delete** in operation, and click **OK** to complete the operations. Note:<br/>
  1. Elastic IP paid by monthly package does not support deletion.
