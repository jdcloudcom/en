# Instance Voucher Overview (Inviting People to Product Testing)

Instance voucher is another way of paying and purchasing computing instances. After buying a voucher with monthly/yearly pay-in-advance at a price approximating monthly package, you can deduct the cost as per computing instances (VM Instance, Native Container/POD Instance) paid by configuration.<br>

Instance voucher decouples the payment and resources creation since its attribute determines the characteristics of the deductible instance, which is not limited to a certain or some instances. This can both allow for economic considerations in a long-term resource utilization plan and meet the demand for maintaining flexibility of resources creation and deletion.

## Instance Voucher Types
From the point of applicable instance type, it can be divided into **VM Instance Voucher** and **Native Container/POD Instance Voucher**:
* VM Instance Voucher: Applicable to VM instance deduction paid by configuration
* Native Container Instance Voucher: Applicable to Native Container/POD instance deduction paid by configuration

From the point of resource reservation, it can be divided into **No Resource Reservation** and **Resource Reservation** (currently, we only support purchasing no resource reservation type of instance vouchers)

|                   | No Resource Reservation                 | Resource Reservation     |
| ------------------- | ------------------- |---------------|
| Purchase Method  | In designated region, purchase by type family and computing power<sup>[1](instancevoucher-overview#user-content-1)</sup>] | In designated region and availability zone, purchase by type and count |
| Use Method  | In any availability zone under the same region, use instances paid by configuration with matched type family <sup>[2](instancevoucher-overview#user-content-1)</sup> | In the same availability zone under the same region, use instances paid by configuration with totally matched type|
| Resource Reservation  | In case of no reserved and lack of resources, there may be a waste of vouchers because types are sold out and instances cannot be created | In cause of reserved resources, resources are reserved according to the purchased type and count, so instances can at least be created according to the type and count purchased by voucher regardless of sales of resources |

## Comparison on Purchase Methods of Computing Instances
Instance voucher is a new way to purchase resources for instance paid by configuration. The comparison of several purchase methods is as follows:
* Pay By Configuration: It is a basic billing method for instances with pay-as-you-go. The deduction is settled regularly and resources can be deleted at any time. Applicable to business deployment of short-term running or periodic running with a short duration in each month;
* Monthly Package: It is a preferential billing method for instances with pay-in-advance. Users can get a discount compared with pricing billed by configuration when promising certain use duration (several months/years), in which only one instance is allowed to perform the promised duration. Instances cannot be deleted before expiration. Applicable to instances of long-term running without demand for deletion and reconstruction;
* Instance Voucher: It is a voucher paid in advance for instances billed by configuration. Users can get a discount compared with pricing billed by configuration when promising certain use duration (several months/years). Any satisfactory instance is allowed to use a voucher. As there is no limit to delete an instance billed by configuration, users obtain the discount in billing of monthly package and the flexibility in deleting resources.

      Tips：
      If now you are deploying business based on K8S or using Auto Scaling services and need to regularly delete and create resources for adjustment because instances in a cluster are affected by policy, we recommend that you should assess the running time of virtual machines in the cluster and consider using an instance voucher to get more price discount;<br>
      If you are using monthly-package instances and have no demand for deletion and adjustment, we recommend that you should not change to a mode of instance voucher + pay by configuration. Because the instance voucher does not support resource reservation yet, instances may be unable to be created again after deletion due to insufficient resources in case of resource shortage.

<div id="user-content-2"></div>

## Instance Type that Can be Purchased
Instance voucher of no resource reservation, after a region, applicable product and type family are designated, it can be purchased by computing power<sup>[1](instancevoucher-overview#user-content-1)</sup>. Type families that are sold and types of instance vouchers that cannot be used currently are shown in the table below:<br>
For details of instance type, refer to: [VM Instance Type](https://docs.jdcloud.com/virtual-machines/instance-type-family) and [Native Container/POD Type](https://docs.jdcloud.com/native-container/price-overview)<br>
For details of instance voucher pricing and billing rules, refer to: [Price and Billing Rules](https://docs.jdcloud.com/virtual-machines/price-and-billing-rules-of-instancevoucher)

    Please note:
     1. Instance vouchers are not supported by general shared, compute-optimized shared and GPU virtualized types;
     2. Since the instance types on the market vary in different regions, there are also regional differences in the type families that can be purchased by instance vouchers. For the specific type families available for sale in different regions, please refer to the purchase page;
     3. Some instance types may fall within the deductible range of the voucher and the sales of resources in different availability zones in each region are different. Please confirm the types of the built instances before purchasing the voucher, and pay attention to the sales of the instance types to be purchased.

<table>
	<thead>
   <tr>
      <th colspan="2"> Type Family Available for Sale</td>
      <th>Types Not Supporting Deduction</td>
      <th>Available for Virtual Machines</td>
      <th>Available for Native Container/POD</td>
      <th>Purchase Unit Conversion</td>
   </tr>
  	</thead>
   <tbody>   
   <tr>
      <td rowspan="3">General - Standard</td>
      <td>g.n3</td>
      <td>--</td>         
      <td>√</td>
      <td>× </td>
      <td rowspan="15">1 Computing Power = 1 Core</td>
   </tr>
   <tr>
      <td>g.n2</td>
      <td>--</td>         
      <td>√</td>
      <td>√ </td>
   </tr>
   <tr>
      <td>g.n1</td>
      <td>g.n1.xlarge_m</td>         
      <td>√</td>
      <td>√ </td>
   </tr>
   <tr>
      <td rowspan="3">Compute Optimized - Standard</td>
      <td>c.n3</td>
      <td>--</td>         
      <td>√</td>
      <td>× </td>
   </tr>
   <tr>
      <td>c.n2</td>
      <td>--</td>         
      <td>√</td>
      <td>√ </td>
   </tr>
   <tr>
      <td>c.n1</td>
      <td>c.n1.medium,c.n1.xlarge_m,c.n1.2xlarge_s,<br>c.n1.2xlarge_m,c.n1.4xlarge_m</td>         
      <td>√</td>
      <td>√ </td>
   </tr>
   <tr>
      <td>Compute Optimized - Intensive</td>
      <td>c.c2</td>
      <td>--</td>         
      <td>√</td>
      <td>× </td>
   </tr>
   <tr>
      <td rowspan="3">Memory Optimized - Standard</td>
      <td>m.n3</td>
      <td>--</td>         
      <td>√</td>
      <td>× </td>
   </tr>
   <tr>
      <td>m.n2</td>
      <td>--</td>         
      <td>√</td>
      <td>√ </td>
   </tr>
   <tr>
      <td>m.n1</td>
      <td>m.n1.medium</td>         
      <td>√</td>
      <td>√ </td>
   </tr>
   <tr>
      <td rowspan="2">High Frequency Compute - General</td>
      <td>h.g2</td>
      <td>--</td>         
      <td>√</td>
      <td>√ </td>
   </tr> 
   <tr>
      <td>h.g1</td>
      <td>--</td>         
      <td>√</td>
      <td>× </td>
   </tr>      
   <tr>
      <td rowspan="2">Storage Optimized - IO</td>
      <td>s.i3</td>
      <td>s.i3.22xlarge</td>         
      <td>√</td>
      <td>× </td>
   </tr> 
   <tr>
      <td>s.i1</td>
      <td>--</td>         
      <td>√</td>
      <td>× </td>
   </tr> 
   <tr>
      <td>Storage Optimized - Big Data</td>
      <td>s.d2</td>
      <td>s.i3.22xlarge</td>         
      <td>√</td>
      <td>× </td>
   </tr>
   <tr>
      <td rowspan="3">GPU - Standard</td>
      <td>p.n1p40</td>
      <td>--</td>         
      <td>√</td>
      <td>× </td>
      <td rowspan="3">1 Computing Power = 1 GPU Card</td>
   </tr>
   <tr>
      <td>p.n1p40h</td>
      <td>--</td>         
      <td>√</td>
      <td>× </td>
   </tr>
   <tr>
      <td>p.n1v100</td>
      <td>--</td>         
      <td>√</td>
      <td>× </td>
   </tr>
 </tbody>
 </table>     

<div id="user-content-3"></div>

## Quota
Instance Voucher of No Resource Reservation: (No limit to voucher count)<br>
* Non-GPU Type: (1 Computing Power = 1 Core)
  * Virtual Machines: 500 Computing Power/Region<br>
  * Native Container/POD: 500 Computing Power/Region<br>
* GPU Type: (1 Computing Power = 1 Card)
  * Virtual Machines: 100 Computing Power/Region<br>
  * Native Container/POD: - (No GPU type is provided for Native Container/POD currently)<br>


If you need to increase quota, please [Open Ticket](https://ticket.jdcloud.com/applyorder/submit).

## Deduction Rules
* After you successfully purchase an instance voucher, the system will, according to the instance type family and computing power<sup>[1](instancevoucher-overview#user-content-1)</sup>, convert the voucher into measurable usage as per the billing cycle (1 hour) for instances paid by configuration<sup>[3](instancevoucher-overview#user-content-1)</sup>(the available usage per hour: computing power* 3600s) for deduction when instances paid by configuration are settled;<br>
* When an instance paid by configuration is settled (settle by integral point or settle by deletion), the system will determine whether there is an available instance voucher for this type (region, type family, period of validity); if yes, it will calculate the usage consumed by the instance and deduct the available usage within this settlement cycle; if no instance voucher is available, it will deduct and settle the amount normally;<br>
* If only part of the instance consumption can be deducted from the available usage in the current settlement cycle, then the remaining usage will be deducted and settled according to the type pricing in proportion: Unit price of type/(Type size * 3600s) * (Usage consumed by the instance - usage deducted). For the way of viewing deduction records, please refer to the reference document [View Deduction Detailed Statement](https://docs.jdcloud.com/virtual-machines/check-usage-of-instancevoucher);<br>
* The available usage per hour of the instance voucher will not be accumulated or refunded whether it is fully deducted by the instance or not;


<div id="user-content-1"></div>

**Note:**<br>
1. Computing power: The index reflecting the computing capacity of a single instance or multiple-instance cluster in the same type family. Computing power = ∑ type size × count (the type size is the basis for measuring the computing power of the type in the same type family; the CPU type is generally equal to the core number and the GPU type is generally the GPU card number). For example, if you general standards generation II type family g.n2 has two 2C8G instances and two 4C16G instances, then under this type family, the computing power of four instances should be 2×2 + 4×2=12;<br>
2. In the instance voucher of no resource reservation, some types are not within the deductible scope. For details, refer to the above: [Instance Type that Can be Purchased](instancevoucher-overview#user-content-2);<br>
3. Usage: The computing tasks that can be completed within a certain time period by certain computing power, which is the result of computing power * duration (second). For example, if one set of g.n2.large instance runs for one hour, then its usage should be 1×2×3600.

## Related References
[Purchase Instance Voucher](https://docs.jdcloud.com/virtual-machines/purchase-instancevoucher)

[Price and Billing Rules](https://docs.jdcloud.com/virtual-machines/price-and-billing-rules-of-instancevoucher)

[View Deduction Detailed Statement](https://docs.jdcloud.com/virtual-machines/check-usage-of-instancevoucher)

[Manage Instance Voucher](https://docs.jdcloud.com/virtual-machines/manage-instancevoucher)
