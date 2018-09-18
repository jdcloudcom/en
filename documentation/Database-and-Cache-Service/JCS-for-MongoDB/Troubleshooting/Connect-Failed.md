# Virtual Machines Fails to Connect MongoDB Instance

## Problem Description
When the Virtual Machines is failed to connect with MongoDB database and the connection is unavailable, giving prompt: exception: connect failed, as shown in the figure below.

![](https://github.com/jdcloudcom/cn/blob/master/image/mongodb/mongo-027.png)

## Problem Analysis

The possible reason is that the link between the Virtual Machines and the MongoDB instance is disconnected.

## Problem Processing

1. Verify if the connection address of the MongoDB instance is correct.

   Locate the MongoDB instance on the MongoDB console and view the MongoDB connection address on the instance details page. Refer to: [Connection Instance](./ Getting-Started/ Connect-Instance.md)

1. Verify if the Virtual Machines for connection is in the same VPC of the MongoDB instance.

   Check whether the Virtual Machines and MongoDB instance are in the same VPC on JD Cloud console. If they are in different VPC and are not connected through the VPC peering connection, then the internal network is not available. Please replace the virtual machine to connect the MongoDB instance.

1. Confirm whether the white list of the MongoDB instance limits the IP of the Virtual Machines?

   Locate the MongoDB instance on the MongoDB console to view its white list settings. Confirm if the intranet IP of the Virtual Machines is limited by the white list, if so, please add it to the white list.

1. Confirm if the security group rules for the Virtual Machines are limited.

   Locate the virtual machine on the Virtual Machines console to view its security group rules. If the outbound rule does not open port 27017, please add the rule:
   - Type: Customized TCP
   - Destination Port: 27017
   - Destination IP: 0.0. 0.0/ 0, because the IP may change during disaster tolerance switching or capacity expansion of MongoDB, please open all IP(s).
	![](https://github.com/jdcloudcom/cn/blob/master/image/mongodb/mongo-028.png)
	
1. Verify if the network ACL used by the Virtual Machines and the subnet where MongoDB is located is limited.

   In the VPC console, find the network ACL used by the subnet where the Virtual Machines and MongoDB are located, and confirm whether the outbound rules and inbound rules are open for the port 27017. If not, add the rules:
   - Type: Customized TCP
   - Destination Port: 27017
   - Destination IP: 0.0. 0.0/ 0, because the IP may change during disaster tolerance switching or capacity expansion of MongoDB, please open all IP(s).
   ![](https://github.com/jdcloudcom/cn/blob/master/image/mongodb/mongo-029.png)

  ## Follow-up Processing
  If the problem is still not solved through the above operation, please [Open ticket](https://ticket.jdcloud.com/myorder/form?cateId=166&questionId=238) or call the customer hotline 400-615-1212 。


