# Price and Billing Rules

## Price Overview

For the type families that can be purchased by Virtual Machines and Native Container/POD, refer to: Instance Type that Can be Purchased by Instance Voucher](https://docs.jdcloud.com/virtual-machines/instancevoucher-overview#user-content-2)

Price of instance voucher of no resource reservation (it cannot be purchased in cn-east-1 region):

<table>
	<thead>
   <tr>
      <th colspan="2" rowspan="2" align="center"> Type Family</td>
      <th colspan="2" align="center">Monthly Package (RMB/Computing Power * Month)</td>
   </tr>
   <tr>
      <th align="center">cn-north-1/cn-east-2/cn-south-1</td>         
      <th>cn-east-1</td>
   </tr>
   </thead>
   <tbody>  
   <tr>
      <td rowspan="3">General - Standard</td>
      <td>g.n3</td>
      <td align="right">120</td>         
      <td align="right">--</td>
   </tr>
   <tr>
      <td>g.n2</td>
      <td align="right">136.5</td>        
      <td align="right">--</td>         
   </tr>
   <tr>
      <td>g.n1</td>
      <td align="right">147</td>         
      <td align="right">--</td>
   </tr>
   <tr>
      <td rowspan="3">Compute Optimized - Standard</td>
      <td>c.n3</td>
      <td align="right">93.5</td>         
      <td align="right">--</td>
   </tr>
   <tr>
      <td>c.n2</td>
      <td align="right">89.5</td>         
      <td align="right">--</td>
   </tr>
   <tr>
      <td>c.n1</td>
      <td align="right">97</td>         
      <td align="right">--</td>
   </tr>
   <tr>
      <td>Compute Optimized - Intensive</td>
      <td>c.c2</td>
      <td align="right">85</td>         
      <td align="right">--</td>
   </tr>
   <tr>
      <td rowspan="3">Memory Optimized - Standard</td>
      <td>m.n3</td>
      <td align="right">159</td>         
      <td align="right">--</td>
   </tr>
   <tr>
      <td>m.n2</td>
      <td align="right">154.85</td>         
      <td align="right">--</td>
   </tr>
   <tr>
      <td>m.n1</td>
      <td align="right">249</td>         
      <td align="right">--</td>
   </tr>
   <tr>
      <td rowspan="2">High Frequency Compute - General</td>
      <td>h.g2</td>
      <td align="right">166</td>         
      <td align="right">--</td>
   </tr> 
   <tr>
      <td>h.g1</td>
      <td align="right">171.5</td>         
      <td align="right">--</td>
   </tr>      
   <tr>
      <td rowspan="2">Storage Optimized - IO</td>
      <td>s.i3</td>
      <td align="right">174.46</td>         
      <td align="right">--</td>
   </tr> 
   <tr>
      <td>s.i1</td>
      <td align="right">177.25</td>         
      <td align="right">--</td>
   </tr> 
   <tr>
      <td>Storage Optimized - Big Data</td>
      <td>s.d2</td>
      <td align="right">208.63</td>         
      <td align="right">--</td>
   </tr>
   <tr>
      <td rowspan="3">GPU - Standard</td>
      <td>p.n1p40</td>
      <td align="right">4483.75</td>         
      <td align="right">--</td>
   </tr>
   <tr>
      <td>p.n1p40h</td>
      <td align="right">4315.75</td>         
      <td align="right">--</td>
   </tr>
   <tr>
      <td>p.n1v100</td>
      <td align="right">6211.25</td>         
      <td align="right">--</td>
   </tr>
</tbody>  
</table>     

## Billing Rules
### Billing Instructions
* The instance voucher only supports pay-in-advance and the purchase duration supports 1 month ~ 9 months, 1 year, 2 years and 3 years;
* Effective time: (No matter when you place an order and purchase the voucher in a natural hour, there will be usage equivalent to 1 hour within the first natural hour settlement cycle. Therefore, the effective time of the purchased voucher will be earlier than the creation time)
  * Start time: The previous integral point of the purchase time. For example, if the purchase time is "2020-04-25 9:50:00", then the effective start time is "2020-04-25 9:00:00"
  * End time: The expiration date is 23:59:59 at present. For example, if the purchase date is "2020-04-25" and the duration is 1 month, then the effective end time is "2020-05-25 23:59:59"
      

### Description for Stopping Expired Service
* When the expiration time of your purchased instance voucher is earlier than or the same as the current time, the billing status will become due. The expired voucher will become invalid immediately and cannot be used to deduct instances any longer;<br>
* Since the instance voucher **Cannot be Renewed Once Expired**, please pay attention to the expiration of resources and complete the renewal or advance setting before expiration [Automatic Renewal](https://docs.jdcloud.com/online-buying/renew-management);<br>
* Expired instance vouchers will not be automatically deleted, so that you may view the historical purchase record. You can delete such expired instance vouchers at the console at any time. The quota will be automatically released once the voucher is expired. This will not affect your purchase of new resources.

## Related References

[VM Instance Type](https://docs.jdcloud.com/virtual-machines/instance-type-family) 

[Virtual Machines Price Overview](https://docs.jdcloud.com/virtual-machines/price-overview)

[Native Container/POD Type and Price](https://docs.jdcloud.com/native-container/price-overview)<br>
