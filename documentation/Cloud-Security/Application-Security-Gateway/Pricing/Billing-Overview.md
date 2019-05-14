# Description of Billing Method
#### Billing Rules

JD Cloud provides a variety of billing modes for different user demands, namely [Pay by Monthly Package](http://docs.jdcloud.com/en/billing/subscription), [Pay By Configuration](http://docs.jdcloud.com/en/billing/pay-as-you-go) and [Pay By Consumption](http://docs.jdcloud.com/en/billing/pay-as-you-go) respectively. The JD Cloud Application Security Gateway (VPC-WAF) currently adopts the billing method of paying by monthly package.

#### Monthly Package Billing

Users can purchase multiple Application Security Gateway (VPC-WAF) billing instances to provide protection against unused websites. Costs for months or years are paid in advance by the billing method of paying by monthly package. Current purchased time period supports 1 month~9 months, 1 year, 2 years, and 3 years; costs are deducted at one time when creating the instance;

- To guarantee your use rights, the Application Security Gateway monthly package cannot support deletion before expiration.

- It adopts the pay-in-advance method; the expiration time of monthly package billing order is at 23:59:59 in the Nth natural month or natural year from the start time of the order;
  For example: the start time of the order is January 1, 2020 at 15:00:00, the purchase duration is 1 month, and the expiration time is February 1, 2020 at 23:59:59.


#### Renewal Rules

Monthly Package Billing Instance Renewal: Expand the use duration of Application security gateway (VPC-WAF) Monthly Package. The renewal time periods include 1 month ~ 9 months, 1 year, 2 years and 3 years. If you operate to renew prior to the instance date due, the start time of the new order is expiration time of the original order; if you renew after resource date due, the start time of the new order is expiration time of the date of renewal.

Renewal instruction for trial version: JD Cloud Application Security Gateway (VPC-WAF) provides a 6-month usage time by default and the trial version does not support renewal. If you need to renew it, please upgrade the trial version to another version first before renewal. Or, after the trial version expires, you can reapply for the trial version and disassociate the Load Balancer that was associated to the trial version previously and then associate it to the new VPC-WAF trial version instance. The new VPC-WAF trial version instance will perform security protection for all HTTP/HTTPs traffic passing through the Load Balancer.

The paid version can be renewed according to the normal rules. For the detailed renewal instruction, please refer to [Renew Management](https://docs.jdcloud.com/en/online-buying/renew-management)


#### Expiration & Overdue Rules

When the expiration time of your monthly package Application Security Gateway(VPC-WAF) instance is earlier than or the same as the current time, the status of your virtual machine will be expired. Upon expiration, the service of the Application Security Gateway will be stopped and unavailable for use;

Your Application Security Gateway and security protection data will be kept for 7 days from the time of stopping service and the system will recover the resources after 7 days, in which case the data cannot be retrieved.
