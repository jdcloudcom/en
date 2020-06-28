# Purchase Instance Voucher 

**The instance voucher is under invitation to A/B testing. If you cannot view relevant page when accessing the Console, which means you don't have trial permission yet. You may open ticket to apply for trial.**

## Quota
Instance Voucher of No Resource Reservation: (No limit to voucher count)<br>
* Non-GPU Type: (1 Computing Power = 1 Core)
  * Virtual Machines: 500 Computing Power/Region<br>
  * Native Container/POD: 500 Computing Power/Region<br>
* GPU Type: (1 Computing Power = 1 Card)
  * Virtual Machines: 100 Computing Power/Region<br>
  * Native Container/POD: - (No GPU type is provided for Native Container/POD currently)<br>

## Operation Entry
The instance voucher sets a Console entry under the menus [Elastic Compute - Virtual Machines] and [Elastic Compute - Native Container]. You can access the Instance Voucher Page from any one of the menu entries and purchase different types of vouchers as required on the Purchase Page.

## Purchase Instance Voucher
### No Resource Reservation
1. Access [Instance Voucher Console](https://cns-console.jdcloud.com/host/instancevoucher/list), or access [JD Cloud & AI Console](https://console.jdcloud.com/overview) and log in the Instance Voucher List Page by clicking **Elastic Compute** - **Virtual Machines** - **Instance Voucher** or **Elastic Compute** - **Native Container** - **Instance Voucher** on the left navigation bar.<br>

![](../../../../../image/vm/iv-buy1.png)
2. Select region and availability zone:<br>
* Region: The instance voucher cannot be used across regions and its regional attribute cannot be modified after purchase. Please select the voucher region according to the geographical distribution of the instance ((it cannot be purchased in cn-east-1 region).<br>
* Resource reservation: We only support instance vouchers of no resource reservation currently.<br>
* Availability zone: For vouchers of "no resource reservation type", you only need to designate the region to use all instances under the availability zone under the selected region if such vouchers are in line with the deduction requirement.<br>

![](../../../../../image/vm/iv-buy2.png)

3. Select applicable products:<br>
Vouchers of VM instance type can be only used for Virtual Machines and vouchers of Native Container/POD instance type can be only used for Native Container or POD.<br>

![](../../../../../image/vm/iv-buy3.png)

4. Instance attribute configuration:<br>
* Type family: Instance vouchers of no resource reservation are purchased by type family. Please select the type family corresponding to your pay-by-configuration instance type that you have already created or plan to create.
* Type: The types shown here are a list of all the types that can be deducted under the currently selected type family (**some types under part of the type family do not support use of vouchers, please refer to**[Description for Deduction Types of Instance Voucher](https://docs.jdcloud.com/virtual-machines/instancevoucher-overview#user-content-2)). If it shows "Sold Out", it means there is sell-out of this type in part/all of availability zones under current region. If you plan to purchase a voucher for subsequently created instances, please pay attention to the sell-out of types to avoid a waste of deductibility of sufficient resources when an instance voucher is purchased because of insufficient type inventory.

        Tips：
        To avoid a waste of instance vouchers, if you plan to purchase an instance voucher for new resources, we recommend that you should first purchase instances paid by configuration, and then purchase the instance voucher before the first integral point settlement of the instances according to the actually purchased resources.

* Computing power:
Computing power = ∑ type size × count (the type size is the basis for measuring the computing power of the type in the same type family; the CPU type is generally equal to the core number and the GPU type is generally the GPU card number), which is an index reflecting the computing capacity of a single instance or multiple-instance cluster.
   * The computing power of CPU type is the result from multiplying the core number by the count. For example, if a voucher is purchased for 5 sets of 2C type instances and 2 sets of 4C type instances, then fill in (5×2)+(2×4)=18
   * The computing power of GPU type is the result from multiplying the card number by the instance count. For example, if a voucher is purchased for 5 sets of 4-card type instances and 2 sets of 2-card type instances, then fill in (5×4)+(2×2)=24

Input range of computing power: [Type size of the minimum deductible type in the selected type family ~ remaining quota in current region], only integral multiples of the minimum type size (core number/card number) in the selected type family can be entered. For example, if the type size is 2 for the minimum type c.n3.large in c.n3 type family, then the purchased computing power cannot be less than 2 and must be an integral multiple of 2.

![](../../../../../image/vm/iv-buy4.png)

5. Purchase parameter configuration:<br>
* Name: The name cannot be null, it only supports Chinese, numbers, uppercase and lowercase letters, English underline " _ ", line-through "-" and dot ". ", and cannot exceed 32 characters.<br>
* Description: Optional, support full characters, enter 256 characters at most.<br>
* Purchase duration: The purchase duration supports 1 month ~ 9 months, 1 year, 2 years and 3 years.
* Automatic renewal: Automatic renewal can be directly configured at the time of purchase. Automatically renewed duration shall be the same as the purchase duration by default, and if any follow-up adjustment is required, you can turn to Renewal Management Console at any time.

![](../../../../../image/vm/iv-buy5.png)

## Related References
[Instance Voucher Overview](https://docs.jdcloud.com/virtual-machines/instancevoucher-overview)

[Description for Deduction Types of Instance Voucher](https://docs.jdcloud.com/virtual-machines/instancevoucher-overview#user-content-2)
