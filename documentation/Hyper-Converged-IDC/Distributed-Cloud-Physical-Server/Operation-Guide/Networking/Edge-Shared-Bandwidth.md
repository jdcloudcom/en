## Edge Shared Bandwidth

### Product Overview

Edge Shared Bandwidth enables multiple edge cloud elastic IP to commonly use one same bandwidth ("Edge Shared Bandwidth" also known as "Shared Bandwidth"). With one Edge Shared Bandwidth, all edge cloud public IPs under the same node and the same operator can reuse the bandwidth in the Shared Bandwidth when a customer has a large number of businesses on cloud.  Using Shared Bandwidth can save costs for using network bandwidth of enterprises. It offers billing methods of monthly package and pay by configuration.


### Use Restrictions

Please note the following use restrictions during use of the Edge Shared Bandwidth:

1. At present, a maximum of 10 edge cloud public IPs for each node are supported in each JD Cloud & AI account. If more quotas are required, please [Open Ticket](https://ticket.jdcloud.com/applyorder/submit) to increase quota.<br/>

2. Only edge cloud public IPs under the same node and the same operator can be added to the Edge Shared Bandwidth.<br/>

3. A maximum of 300 IPs are allowed to be added to each Edge Shared Bandwidth.<br/>

4. Monthly package resources are not allowed to be deleted currently.<br/>

### Billing Overview

Edge Shared Bandwidth supports two billing methods, i.e., monthly package and pay by configuration, and two billing items, i.e., bandwidth and additional uplink bandwidth. Monthly Package: Pay in advance by bandwidth configuration. Pay By Configuration: Bill per hour by bandwidth configuration.

**Monthly Package**

The monthly package is pay-in-advance type, with the cost to be paid at one time for one month, several months or many years. It is suitable for the scenario that the Edge Shared Bandwidth demand is estimated, and the cost is cheaper than billing of pay by configuration.

Detailed Description:
Costs for months or years are paid in advance, and current purchased time period supports 1 month~9 months, 1 year, 2 years, and 3 years; costs are deducted at one time when you create the resources; for example: You have purchased the Telecom Edge Shared Bandwidth with 1M bandwidth and 0M additional uplink bandwidth for 1 month at 10:00:00 on August 2, 2017 at the monthly unit price of RMB 24, you need to pay RMB 24=24* 1 and you could use this resource till 23:59:59 on September 2, 2017.

The monthly package resources do not support deletion before it expires. To guarantee your use rights, please confirm the business needs before purchase.

The expiration time of monthly package billing order is 23:59:59 in the Nth natural month or natural year from the start time of the order; for example: If the start time of the order is 15:00:00 on January 1, 2016 and the duration is one month, then the expiration time is 23:59:59 on February 1, 2016.

##### Description for Stopping Expired Service

When the expiration time of your monthly package paid network resources is earlier than or the same as the current time, your paid network resources status will become expired. Upon expiration, the service of the paid network resources will be stopped and unavailable for use;

Before expiration of your monthly package paid network resources, JD Cloud & AI will send you email and SMS to remind you that your resources are close to expire, please pay attention to check and renew in time;

Upon expiration of your paid network resources, your service will be stopped immediately and you will be sent email and SMS to notify you that your resources are expired, please be sure to check notification and recharge in time to prevent unnecessary losses;

Your paid network resources will be kept for 7 days from the moment when your service is stopped, and the system will reclaim the resources after 7 days, in which case the resources cannot be retrieved. The Console interface will only be able to perform renew operation;

Upon renewal, the stopped resources can be used normally.

**Pay By Configuration**

Enabling Requirements: To ensure your normal use, the sum of your account balance and available coupon will be no less than consumption threshold of RMB 50 when you enable the resource paid by configuration.

##### Description for Service Stopping Due to Arrearage

Your paid network resources (Edge Shared Bandwidth) status will become in arrears when the sum of the balance in your account and the available coupon is insufficient to pay the costs of next billing cycle resulting in the deduction failure;

You can continue to normally use your paid network resource for 3 hours after the payment is overdue. After 3 hours, the overdue service and deduction will be stopped. The Console interface shall only be able to perform the deletion operation;

After your paid network resource become in arrears overdue, you will be sent email or SMS to notify you that your resources are in arrears, please be sure to check notification and recharge in time to prevent unnecessary losses;

Your paid network resources will be kept for 7 days from the moment when your service is stopped, and the system will reclaim the resources after 7 days, in which case the resources cannot be retrieved;

The stopped paid network resource can be used normally after you make a supplementary payment for the amount in arrears;

If you don’t want to continue use the paid network resource paid by configuration, please delete the resources in time.

### Price Overview

For details, please refer to Edge Shared Bandwidth [Price Overview](../../Pricing/Price-Overview.md).

### Create Shared Bandwidth

- Turn on the Console, click **Shared Bandwidth** in the left navigation bar, enter the Shared Bandwidth List Page and click **Create** to pop up the Create Configuration window;<br/>

- Select the node, operator, bandwidth billing mode, ISP line type, bandwidth, additional uplink bandwidth cap, duration and count according to demands and click **OK** to create 1 Shared Bandwidth.<br/>

### View Shared Bandwidth

- Turn on the Console, click **Shared Bandwidth** in the left navigation bar, enter the Shared Bandwidth List Page to view the shared bandwidth information;<br/>

- or click **Name** of the Shared Bandwidth to redirect to the details to view the detailed information of Shared Bandwidth.<br/>


### Add IP

- Turn on the Console, click **Shared Bandwidth** in the left navigation bar, select a target shared bandwidth, click **Add IP** in the operations and pop up information below;<br/>

- Select the EIP to be added according to demands and click **OK** to complete the association.


### Modify Bandwidth

- Turn on the Console, click **Shared Bandwidth** in the left navigation bar, select a target shared bandwidth, click **Modify Bandwidth** in the operations, and select the bandwidth and additional uplink bandwidth size to be adjusted in the popup to complete the operations.<br/>

### Renew

- Turn on the Console, click **Shared Bandwidth** in the left navigation bar, select a target shared bandwidth, click **Renew** in the operations or enter the details and then click **Renew** in the operations; select the duration to be renewed in the popup, click **Renew** to redirect to the "Payment Confirmation Page" and then click **Pay Now** to complete the operations.<br/>

Note: Shared bandwidth paid by configuration does not support renewal.

### Delete

- Turn on the Console, click **Shared Bandwidth** in the left navigation bar, select a target Shared Bandwidth, click **Delete** in operation or log in the details and then click **Delete** in operation, and click **OK** to complete the operations.<br/>

- Note: Shared bandwidth paid by monthly package does not support deletion.
