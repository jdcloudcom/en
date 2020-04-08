## VPC Attachment
VPC Attachment is used to establish one-to-one connection between Border Gateway and VPC, and after VPC attachment is created, VPC’s segment can be transmitted to border gateway route table by configuration of route transmission, oppositely, the route in border gateway effective route table can be transmitted to VPC route table.

```
  The function of VPC attachment is only released in Guangzhou and Shanghai currently.
```

### Operation Steps
##### 1. Create VPC Attachment
a) Log in [JD Cloud & AI VPC Attachment Console](https://cns-console.jdcloud.com/host/vpcAttachment/list), or enter **Attachment/Channel** Tab on Border Gateway Details to create VPC Attachment;  </br>
b) Select region and click **Create**;</br>
c) Enter VPC Attachment’s name, select Border Gateway and VPC, assign VPC segment to be transmitted to Border Gateway Route Table, and create VPC Attachment. Three modes are supported to transmit VPC segment: VPC all segments, assigned subnet segments and do not transmit segment;</br>
* VPC All Segments means that all selected subnet segments of VPC (including subnet segments existing currently and to be added in VPC, and segments automatically transmitting the subnet when it being created) are transmitted to Border Gateway Route Table.
* Assigned subnet segment means to transmit selected subnet segment only without transmitting unselected subnet segments and automatically transmitting subnet segments to be newly added in VPC.
* Do not transmit segment means that any selected segment in VPC will not be transmitted to Border Gateway;

```
  If segment conflict occurs among multiple VPCs with VPC Attachment created with the same Border Gateway, the principle for routes transmitted to Border Gateway route table is to count the first transmission as valid route and the second transmission as invalid route.
  For example, VPC A has a subnet with segment as 10.0.0.0/16 and VPC B has a subnet with segment as 10.0.1.0/24. When VPC A created VPC Attachment with Border Gateway BGW A with transmission of 10.0.0.0/16 subnet being assigned at the first place, while VPC B created VPC Attachment with Border Gateway BGW A with transmission of 10.0.1.0/24 subnet at the second place, the valid route table on Border Gateway BGW A only calculates 10.0.0.0/16 route with VPC A as the Next Hop as valid. Although 10.0.1.0/24 route with VPC B as the Next Hop would also enter route table on Border Gateway BGW A, it is only calculated as invalid.
  However, when the 10.0.0.0/16 route with VPC A as the Next Hop is deleted, the 10.0.1.0/24 route with VPC B as the Next Hop will enter valid route table on Border Gateway BGW A.
```

For more content of VPC Route Table configuring route transmission, refer to [VPC Route Table Route Transmission](https://docs.jdcloud.com/en/virtual-private-cloud/route-table-configuration).
![](../../../../../image/Networking/VPN/Operation-Guide/create-vpcattachment.png)

##### 2. Modify VPC Attachment
You can modify name, assigned VPC and transmitted subnet segment of VPC Attachment.</br>
a) Log in [JD Cloud & AI VPC Attachment Console](https://cns-console.jdcloud.com/host/vpcAttachment/list);  </br>
b) Select corresponding VPC Attachment, click **Edit** on the operation bar and enter VPC Attachment Editing Page.</br>
c) Modifications for VPC Attachment’s name, assigned VPC and transmitted subnet segments with restrictions on configuration items being the same as VPC Attachment creation are supported and modification for Border Gateway of VPC Attachment is not supported.</br>
![](../../../../../image/Networking/VPN/Operation-Guide/update-vpcattachment.png)

##### 3. Delete VPC Attachment
If you do not need VPC Attachment anymore, you can delete it.</br>
a) Log in [JD Cloud & AI VPC Attachment Console](https://cns-console.jdcloud.com/host/vpcAttachment/list);  </br>
b) Select corresponding VPC Attachment, and click **Delete** on the operation bar. After VPC Attachment is deleted, transmission relationship of VPC Route Table, VPC and transmission route corresponding to Border Gateway will be deleted automatically.</br>
![](../../../../../image/Networking/VPN/Operation-Guide/delete-vpcattachment.png)
