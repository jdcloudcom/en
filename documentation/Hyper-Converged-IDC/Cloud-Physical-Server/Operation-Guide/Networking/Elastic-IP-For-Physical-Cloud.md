# Elastic IP

## Product Overview

Elastic IP is a static IP dedicated for dynamic cloud computing. Different from the traditional static IP, Elastic IP can be associated with any Cloud Physical Server and you can associated it to A or B. Where the Cloud Physical Server fails or the availability zone fails, you may remap IP Address to healthy Cloud Physical Server, then you can handle server issues while providing service. Elastic IP is called as "Physical Cloud Public IP". (Note: The server refers to the "Cloud Physical Server")

## Use Restrictions

Please keep the following restrictions in mind when using the Elastic IP.

1. Now, JD Cloud supports that at most 10 Elastic IPs are applied for each account per region. If more quotas are required, please open a ticket for application.<br/>

2. Elastic IP may be associated with resources in the same region (including Cloud Physical Server).<br/>

3. Elastic IP can be associated with the Cloud Physical Server of VPC instance at the ratio of 1:1.<br/>

4. One single Elastic IP can be associated/disassociated for several times in one day. If it is required to change the IP of the resource that has associated Elastic IP, the resource shall disassociate current IP before associating new IP.<br/>

5. Now, monthly package resources are not allowed to be deleted.<br/>

## Billing Overview

EIP supports two billing methods, including the Monthly Package and Pay by Configuration, and supports two billing items, including the bandwidth and the additional uplink bandwidth. Monthly Package: Pay-In-Advance as per bandwidth configuration. Pay by configuration: The bill is issued per hour as per the bandwidth configuration.


**Monthly Package Billing**

The monthly package is Pay-In-Advance type, with a one-time fee of one month, several months or many years. It is suitable for the scenario of pre-estimation of Elastic IP bandwidth demand, and the cost is cheaper than billing by configuration.

Detailed Description:
Costs for months or years are paid in advance, and current purchase duration supports 1 month~9 months, 1 year, 2 years, and 3 years; costs are deducted at one time when creating the resources; For instance, if you have purchased BGP Elastic IP with 1M bandwidth for 1 month at 10:00:00 on August 2, 2017 at the monthly unit price of RMB 23, you need to pay RMB 23=23* 1 and you can use this resource till 23:59:59 on September 2, 2017.

The resources of the monthly package do not support deletion before it expires. To guarantee your use rights, please confirm the business needs and then purchase.

The expiration time of monthly package billing order is 23:59:59 in the Nth natural month or natural year from the start time of the order; for example, if the start time of the order is from 15:00:00, January 1, 2016 and the duration is 1 month, the expiration time is 23:59:59, February 1, 2016.

**Description for Stopping Expired Service**

When the expiration time of your monthly package paid network resources is earlier than or the same as the current time, your paid network resources status will become expired. The paid online resources service will be stopped and cannot be used after the expiration.

Emails and SMSs will be sent to you by JD Cloud before expiration of your monthly package paid online resources, reminding you that your resources are close to expire. Please check it and renew in time;

Upon expiration of your paid network resources, your service will be stopped immediately and be sent email and SMS to notify you of it. Please be sure to check the notification and recharge in time to prevent unnecessary losses;

Your paid network resources will be kept for 7 days from the moment when your service is stopped, and the system will recover the resources after 7 days, in which case the resources cannot be retrieved. The Console interface will only be able to perform renew operation;

The stopped resources can be used normally upon renewal;

**Pay by configuration**

Subscription requirements: In order to ensure your normal use, the sum of the balance and available voucher in your account shall not be less than the consumption threshold of RMB 50 when you activate the resource which is paid by configuration.<br/>

**Arrearage and Service Suspension Description**

When the sum of the balance and available coupon in your account is insufficient to pay the cost of the next billing cycle and the deduction fails, the status of your paid network resource (EIP) will turn to overdue;<br/>

When your paid network resource is in arrears, you can continue to use it normally for 3 hours, but the service will stopped 3 hours later, with deduction stopped as well; The Console interface can only be used for performing the deletion operation;<br/>

When your paid network resource is in arrears, you will be notified by email and SMS. Please be sure to check your notices and recharge in time to avoid unnecessary losses;<br/>

Your paid network resources will be reserved for 7 days upon the stopping of the service. After these 7 days, the system will withdraw such sources, and no resource will be retrieved since then.<br/>

Only after you pay the arrears, such paid network resources can be used normally again;<br/>

if you do not want to continue using such pay-by-configuration network resources, please delete the resources in time.<br/>

## Price Overview

For details, please refer to Public IP [Price Overview](../../Pricing/Price-Overview.md).

## Create Elastic IP

Open the Console, click **Cloud Physical Server**->**Elastic IP** on the left navigation bar in turn, enter the Elastic IP List page, click **Apply** to pop up the Create Configuration window;<br/>

Select **Region**, bandwidth billing mode (supporting two billing methods, namely, Monthly Package and Pay By Configuration), line type, bandwidth cap as well as purchased duration and number as needed, and click **OK** to create one Elastic IP.<br/>

The function of automatic renewal is available for Monthly Package resources. Check Automatic Renewal. After the resources are created, the automatic renewal attribute and duration can be changed. For monthly purchase, the automatic renewal duration is 1 month; for annual purchase, the automatic renewal duration is 1 year, and you can enjoy the automatic renewal discount for annual purchase.<br/>

## View Elastic IP

Open the Console, click **Cloud Physical Server**->**Elastic IP** on the left navigation bar in turn, enter the Elastic IP List page and view the Elastic IP information;<br/>

or click **Elastic IP**->**Public IP ID/Address**, redirect to the Details, and view the detailed IP information of Elastic IP.<br/>

## Associate Resource

Open the Console, click **Cloud Physical Server**->**Elastic IP** on the left navigation bar in turn, click the **Associate Resource** button in operation, and select the Cloud Physical Server or Load Balancer to be associated in the pop-up to complete association.

## Disassociate Resource

Open the Console, click **Cloud Physical Server**->**Elastic IP** on the left navigation bar in turn, click the **Disassociate Resource** button in operation, and select to disassociate.<br/>

## Modify Bandwidth

Open the Console, click **Cloud Physical Server**->**Elastic IP** on the left navigation bar in turn, click the **Modify Bandwidth** button in operation, and select the bandwidth size to be modified in the pop-up to complete modification.<br/>

Elastic IP supports the configuration upgrade and configuration downgrade operations.<br/>

## Renew

Open the Console, click **Elastic IP** on the left navigation bar, enter the Elastic IP List page, select the targeted EIP, click the **Renew** button in operation, or enter the Details and click the **Renew** button in operation, and then select the duration to be renewed in the pop-up, click the **OK** button, redirect to the Payment Confirmation page, and click **Pay Now** to complete operations.<br/>

Note: The Elastic IP charged by configuration will be converted to the resource of Monthly Package after renewal operations.<br/>

## Delete

Open the Console, click **Elastic IP** on the left navigation bar, enter the Elastic IP List page, select the targeted EIP, click the **Delete** button in operation, or enter the Details and click the **Delete** button in operation, and then click the **OK** button to complete operations.<br/>

Note: The Elastic IP under monthly package does not support the Delete operation.<br/>
