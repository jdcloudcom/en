# JD Cloud VPC


## Introduction
VPC APIs


### Version
v1


## API
|Interface name|Request mehod|Function description|
|---|---|---|
|**createVpc**|POST|Create VPC|
|**deleteVpc**|DELETE|Delete VPC|
|**modifyVpc**|PATCH|Modify VPC interface|
|**describeVpcs**|GET|Query VPC list|
|**describeVpc**|GET|Query VPC information details|
|**createSubnet**|POST|Create subnet|
|**deleteSubnet**|DELETE|Delete subnet|
|**modifySubnet**|PATCH|Modify subnet interface|
|**describeSubnets**|GET|Query subnet list|
|**describeSubnet**|GET|Query subnet information details|
|**createRouteTable**|POST|Create route table|
|**deleteRouteTable**|DELETE|Delete route table|
|**modifyRouteTable**|PATCH|Modify route table attribute|
|**associateRouteTable**|POST|Associate subnet interface to route table|
|**disassociateRouteTable**|POST|Disassociate subnet interface from route table|
|**addRouteTableRules**|POST|Add route table rule|
|**removeRouteTableRules**|POST|Remove route table rule|
|**modifyRouteTableRules**|POST|Modify route table rule|
|**describeRouteTables**|GET|Query route table information|
|**describeRouteTable**|GET|Query route table information details|
|**createNetworkAcl**|POST|Create networkAcl interface|
|**deleteNetworkAcl**|DELETE|Delete networkAcl interface|
|**modifyNetworkAcl**|PATCH|Modify networkAcl interface|
|**associateNetworkAcl**|POST|Associate networkAcl interface to subnet|
|**disassociateNetworkAcl**|POST|Disassociate networkAcl APIs to subnet|
|**addNetworkAclRules**|POST|Add networkAcl rule interface|
|**removeNetworkAclRules**|POST|Remove networkAcl rule|
|**modifyNetworkAclRules**|POST|Modify networkAcl interface|
|**describeNetworkAcls**|GET|Query Acl list|
|**describeNetworkAcl**|GET|Query networkAcl resource details|
|**assignSecondaryIps**|POST|Assign secondary IP API to network interface|
|**associateElasticIp**|POST|Associate elastic IP API to network interface|
|**disassociateElasticIp**|POST|Disassociate elastic IP API from network interface|
|**unassignSecondaryIps**|POST|Delete secondary IP API from network interface|
|**createNetworkInterface**|POST|Create network interface API, can only create secondary network interface|
|**deleteNetworkInterface**|DELETE|Delete elastic network interface APIs|
|**describeNetworkInterface**|GET|Query elastic network interface information details|
|**describeNetworkInterfaces**|GET|Query elastic network interface list|
|**modifyNetworkInterface**|PATCH|Modify elastic network interface APIs|
|**createElasticIps**|POST|Create One or More Elastic IPs|
|**deleteElasticIp**|DELETE|Delete Elastic IP|
|**modifyElasticIp**|PATCH|Modify Elastic IP|
|**describeElasticIp**|GET|ElasticIp Resource Information Details|
|**describeElasticIps**|GET|Query Elastic IP List|
|**createNetworkSecurityGroup**|POST|Create Security Group|
|**deleteNetworkSecurityGroup**|DELETE|Delete security group|
|**modifyNetworkSecurityGroup**|PATCH|Modify security group attribute|
|**addNetworkSecurityGroupRules**|POST|Add security group rule|
|**removeNetworkSecurityGroupRules**|POST|Remove security group rule|
|**modifyNetworkSecurityGroupRules**|POST|Modify security group rule|
|**describeNetworkSecurityGroup**|GET|Query security group information details|
|**describeNetworkSecurityGroups**|GET|Query security group list|
|**createVpcPeering**|POST|Create VPCPeering API|
|**deleteVpcPeering**|DELETE|Delete VPCPeering API|
|**modifyVpcPeering**|PUT|Modify VPCPeering API|
|**describeVpcPeering**|GET|Query VPCPeering resource details|
|**describeVpcPeerings**|GET|Query VPCPeering resource list|
