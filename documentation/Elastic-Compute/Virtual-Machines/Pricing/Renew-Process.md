# Renew Process
For instances with different billing types, the renewal operations are different:

* Renewal of Instance Billed by Configuration: The billing method of the instance billed by configuration will be converted into the monthly package, and the renewal duration will be 1 month to 9 months, 1 year, 2 years or 3 years;
* Renewal of Instance Billed under Monthly Package: extend the usage period of the Virtual Machines under monthly package. The renewal duration can be from 1 month to 9 months, 1 year, 2 years and 3 years. If you renew it before the instance expires, the start time of the new order is the expiration time of the original order; if you renew it after the resource expires, the start time of the new order is the renewal date.

In addition, the renewal operation also supports:

* Batch Renewal: Batch renewal for multiple resources will extend the usage duration of the selected resources according to the selected renewal duration by the user.
* Associated Renewal: When the instance is renewed, the elastic IP and cloud disk bound to the instance are displayed. The user selects the associated resources that need to be renewed together for renewal.


## Precondition

If you need to renew your instance, you will need to pay the full cost of the selected instance configuration for a specified life cycle, so you will need sufficient account balance (cash balance + available coupons) or choose a third party payment to complete the payment at the time of payment.

You want to know the specific cost of corresponding configuration with different renewal duration under monthly package billing pattern. You can go to [Price Calculator](https://www.jdcloud.com/calculator/calHost) to estimate the cost.

## Operation Steps
You can renew the instance from the following two accesses:

* Virtual Machines List Page/Detail Page
	1. Access [Virtual Machines Console](https://cns-console.jdcloud.com/host/compute/list);
	2. Select the region, and you can find the instance that needs to be renewed by condition search;
	3. Click **Operate** - **More** - **Renew** to jump to corresponding renewal page；<br>
	![](https://github.com/jdcloudcom/cn/blob/edit/image/vm/renew.png)
	4. For detailed operation and detailed procedure on the renewal page, please refer to [Renew Management](http://docs.jdcloud.com/cn/online-buying/renew-management).


## Related Reference

[Price Calculator](https://www.jdcloud.com/calculator/calHost)

[Virtual Machines Console](https://cns-console.jdcloud.com/host/compute/list);

[Renew Management](http://docs.jdcloud.com/cn/online-buying/renew-management)






