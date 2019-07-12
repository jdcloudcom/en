# Elastic IP

## Product Overview

Elastic IP is a static IP dedicated for dynamic cloud computing. Different from the traditional static IP, elastic IP can be associated with any Distributed Cloud Physical Server and you can associate it to A or B. When the Distributed Cloud Physical Server fails or the availability zone fails, you may remap the IP address to a healthy Distributed Cloud Physical Server, and then you can handle server issues while providing services. Elastic IP is called as "Edge Cloud Public IP". (Note: This server refers in particular to the "Distributed Cloud Physical Server")

## Use Restrictions

Please keep the following restrictions in mind when using the Elastic IP.

1. Now, JD Cloud supports that at most 10 elastic IPs are applied for each account per node. If more quotas are required, please open ticket for application.<br/>

2. Elastic IP may only be associated with operator resources in the same node (including Distributed Cloud Physical Server).<br/>

3. Elastic IP can only be associated with the Distributed Cloud Physical Server at the ratio of 1:1.<br/>

4. One single Elastic IP can be associated/disassociated for several times in one day. If it is required to change the IP of the resource that has associated Elastic IP, the resource shall disassociate current IP before associating new IP.<br/>

5. Now, monthly package resources are not allowed to be deleted.<br/>

## Billing Overview

Elastic IP supports the monthly package billing method. Monthly package: Pay-in-advance by bandwidth configuration

**Amount Overdue/Expiry Description**

When the expiration time of your monthly package paid online resources is earlier than or the same as the current time, your paid online resources status will become expired. The paid online resources service will be stopped and cannot be used after the expiration.

Emails and SMSs will be sent to you by JD Cloud before expiration of your monthly package paid online resources, reminding you that your resources are close to expire. Please check it and renew in time;

Upon expiration of your paid online resources, you will be sent email and SMS. Please be sure to check the same and recharge in time to prevent unnecessary losses;

Your paid online resources and data in the resources will be kept for 7 days from the time of stopping service, and the system will recover the resources after 7 days, in which case the resources cannot be retrieved.

The stopped resources can be used normally upon renewal

## Billing Rules

Elastic IP supports the monthly package billing method. Monthly package: Pay-in-advance by bandwidth configuration

**Monthly Package**

The monthly package is Pay-In-Advance type, with a one-time fee of one month, several months or many years. It is suitable for the scenario of pre-estimation of Elastic IP bandwidth demand, and the cost is cheaper than billing by configuration.

Example:
If you purchase the Telecom Elastic IP with 1M bandwidth for 1 month at 10:00:00 on August 2, 2017 at the monthly unit price of RMB 23, you need to pay RMB 23=23* 1 and you could use this resource till 23:59:59 on September 2, 2017.

Detailed Description:
Costs for months or years are paid in advance, and current purchased time period supports 1 month~9 months, 1 year, 2 years, and 3 years; costs are deducted at one time when creating the resources;

The resources of the monthly package do not support deletion before it expires. To guarantee your use rights, please confirm the business needs and then purchase.

The expiration time of monthly package billing order is 23:59:59 in the Nth natural month or natural year from the start time of the order; for example, if the start time of the order is from 15:00:00, January 1, 2016 and the duration is 1 month, the expiration time is 23:59:59, February 1, 2016.

## Price Overview

For details, please refer to Elastic IP [Price Overview](../../Pricing/Price-Overview.md).

## Create Elastic IP

Turn on the Console, click **Distributed Cloud Physical Server** -> **Elastic IP** in turn in the left navigation bar, log in the Elastic IP List Page and click **Apply**, with the pop-up as shown below:<br/>

Select **Node**, operator, Billing by Bandwidth mode, ISP Line type, bandwidth cap, purchase duration and count according to demands and click **OK**, to create 1 Elastic IP.
![创建eip](https://github.com/jdcloudcom/cn/blob/cn-distributed-cloud-physical-service/documentation/Hyper-Converged-IDC/Distributed-Cloud-Physical-Server/Image/DCPS-0088.png)

## View Elastic IP

Turn on the Console, click **Distributed Cloud Physical Server** -> **Elastic IP** in turn in the left navigation bar, log in the Elastic IP List Page and view Elastic IP information, as shown in the picture below:<br/>

Click **Public IP ID/Address** of Elastic IP, redirect to the Details Page and View details of Elastic IP.
![查看eip表页](https://github.com/jdcloudcom/cn/blob/cn-distributed-cloud-physical-service/documentation/Hyper-Converged-IDC/Distributed-Cloud-Physical-Server/Image/DCPS-009.png)

## Associate the EIP

Turn on the Console, click **Distributed Cloud Physical Server** -> **VPC Instance** in turn in the left navigation bar, log in the VPC Instance List Page, select a VPC instance and click **Associate Elastic IP** in operation. Then, EIP which can be associated is displayed in the pop-up. Please select it for association.
![物理机绑定eip](https://github.com/jdcloudcom/cn/blob/cn-distributed-cloud-physical-service/documentation/Hyper-Converged-IDC/Distributed-Cloud-Physical-Server/Image/DCPS-0111.png)<br/>

Moreover, turn on the Console, click **Distributed Cloud Physical Server** -> **Elastic IP** in turn in the left navigation bar, and click **Associate Resources** in operation. Then, Distributed Cloud Physical Server to be associated can be selected in the pop-up. Please select it for association.
![eip绑定物理机](https://github.com/jdcloudcom/cn/blob/cn-distributed-cloud-physical-service/documentation/Hyper-Converged-IDC/Distributed-Cloud-Physical-Server/Image/DCPS-010.png)

## Disassociate the EIP

Turn on the Console, click **Distributed Cloud Physical Server** -> **VPC Instance** in turn in the left navigation bar, log in the VPC Instance List Page, select a VPC instance, and click **Disassociate Elastic IP** in operation to complete disassociation.<br/>

Moreover, turn on the Console, click **Distributed Cloud Physical Server** -> **Elastic IP** in turn in the left navigation bar; click **Disassociate Resource** in operation, and conduct selection for disassociation.<br/>

## Modify Bandwidth

Moreover, turn on the Console, click **Distributed Cloud Physical Server -> **Elastic IP** in turn in the left navigation bar, and click **Modify Bandwidth** in operation. Then, the bandwidth to be adjusted can be selected in the pop-up to complete the operation.
![修改带宽](https://github.com/jdcloudcom/cn/blob/cn-distributed-cloud-physical-service/documentation/Hyper-Converged-IDC/Distributed-Cloud-Physical-Server/Image/DCPS-012.png)
