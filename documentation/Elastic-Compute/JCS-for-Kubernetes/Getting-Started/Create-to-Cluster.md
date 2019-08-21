# Create Cluster

## Confirm region and instance configuration
**Confirm the region of the Instance**

The complete isolation between different regions of JD Cloud ensures the greatest degree of stability and fault tolerance across different regions. It currently covers four regions: cn-north-1, cn-south-1, cn-east-1 and cn-east-2.

At present, Kubernetes Service is opened in cn-north-1, cn-south-1, cn-east-2. In the future, we will gradually increase more service areas to meet your business needs.

When choosing a region, you had better consider the following points:

 - The deployment relationship between clusters and other JD Cloud products;
 - Cloud products from different regions are not allowed to communicate through intranet by default;
 - Cluster by default is not allowed to communicate Cross-region, and can not access cloud databases and cloud caches across regions;
 - When the cloud disk type of persistent volume is created in the cluster, only support associating cloud disks at the same availability zone;      
 - The above-mentioned intranet interconnection refers to the interconnection of resources under the same account, and the intranet of resources under different accounts is completely isolated.

**Select specification configuration of working node group**

It is recommend that before formally deploying business, you should use an instance of pay by configuration billing to test performance and find out the instance type matching your business volume and other resource configuration. JCS for Kubernetes working node group currently only support Generation II instance type of pay by configuration billing. You can refer to [Instance Type](https://docs.jdcloud.com/en/virtual-machines/instance-type-family).

## Create Cluster

 1. Open the console and select Elastic Compute>>JCS for Kubernetes>>cluster service>>cluster
 ![新建集群](../../../../image/Elastic-Compute/JCS-for-Kubernetes/新建Kubernetes集群集群信息.png)。  
 2. Select a region and availability zone: It is recommended that you should select the region and availability zone where the cluster is located according to specific business conditions; by default, all availability zones under the specified region are selected and it is recommended to use the default mode; you can also cancel any one or more selected availability zones, but you shall ensure at least one availability zone is selected.

 3. Set the name and description: Name should not be null, which only supports Chinese text, figures, uppercase and lowercase letters, English text, underline " _ " and line-through " - ", with a length no more than 32 characters; description is an optional item, with a length no more than 256 characters.

 4. Manage node version: Support version 1.12.3 now.

 5. Manage node CIDR: It cannot be overlapped with CIDR of other VPC, and the value range of CIDR mask is 24 ~ 27. For setting rules of CIDR, please refer to the Help Documentation of [VPC Configuration](https://docs.jdcloud.com/en/virtual-private-cloud/vpc-configuration).

 6. Certificate verification and basic verification: All are enabled by default and it is recommended that all should be reserved; at least one shall be enabled;
  * Certificate verification: The certificate based on the base64 code is used for verification from the client to the cluster server; it is recommended that the certificate verification should be enabled;
  * Basic verification: When it is enabled, the client is allowed to conduct the verification on the cluster server by using the user name and password.

 7. Add Accesskey: Select the started Accesskey; if the Access Key is unavailable, please go to the Access Key management page, crate a new Access Key and keep it in starting status. You can refer to [Accesskey Management](https://docs.jdcloud.com/en/account-management/accesskey-management).

 8. Cluster monitoring: When it is enabled, the JCS for Kubernetes basic monitoring and cluster workload custom metric monitoring will be provided; for details, please refer to [Cluster Monitoring](https://docs.jdcloud.com/en/jcs-for-kubernetes/cluster-monitor).

## Create working node group:  

You need to add a working node group when creating a new cluster. You can configure parameters related to working node group on the Create Cluster page.

 ![新建集群增加工作节点组](../../../../image/Elastic-Compute/JCS-for-Kubernetes/新建Kubernetes集群工作节点组.png) 

1. VPC: Select the VPC to deploy the working node group resources:
  * JD Cloud will create four subnets in the selected VPC, including Working Node Subnet, Pod Subnet, Service Subnet and Service-LB Subnet, and create one route table for each of the subnets.
  * The CIDR created in the above VPC cannot be overlapped with other CIDRs created in VPC; for details, please refer to [Subnet Configuration](https://docs.jdcloud.com/en/virtual-private-cloud/subnet-configuration);
  * The working node group and the management node will be connected via the VPC Peering Network, so the selected VPC CIDR cannot be overlapped with the management node CIDR; for details, please refer to [VPC Peering Connection](https://docs.jdcloud.com/en/virtual-private-cloud/vpc-peering-configuration);
  * To avoid failing to create subnets related to working nodes caused by CIDR overlap, it is recommended that you [create a new VPC](https://docs.jdcloud.com/en/virtual-private-cloud/vpc-configuration);
  * The value range of VPC CIDR is 16 ~ 18.
  * When a cluster is created, the relevant quota of Virtual Private Cloud will be verified. So, please guarantee that the relevant network has a sufficient quota. For details, refer to [use restrictions for Virtual Private Cloud](https://docs.jdcloud.com/en/virtual-private-cloud/restrictions).

2. Select working node group version: It is recommended that you select a default working node group version matching the current management node version; click the drop-down list to show all working node group versions supported by current management node version.

3. Specification: Select different working nodes types according to specific business situations and the Virtual Machines support Generation II specification and GPU instance type. You can refer to [Instance Type](https://docs.jdcloud.com/en/virtual-machines/instance-type-family).
  * JD Cloud uses Virtual Machines as the working node of clusters;
  * The working nodes in each of the working node groups have the same instance type;
  * You can [add multiple node groups](https://docs.jdcloud.com/en/jcs-for-kubernetes/create-nodegroup) for a cluster, and different instance types are designated for each of the node groups for meeting the requirements of different types of application loads for instance types;

4. Count: The default count is 3; you can click **Increase**, **Decrease** or enter the expected node count directly according to needs; the maximum count of working nodes is subject to [the quota of Virtual Machines](https://docs.jdcloud.com/en/virtual-machines/restrictions) in current region and assignable count of Private IP of Working Node Subnet CIDR.
  * A Virtual Machine is created in the designated region/availability zone every time a working node is added;
  * To adjust the count of nodes in a cluster, you can [manually scale](https://docs.jdcloud.com/en/jcs-for-kubernetes/telescopic-nodegroup) the designated node group or [add working node groups](https://docs.jdcloud.com/en/jcs-for-kubernetes/create-nodegroup) and [delete working node groups](https://docs.jdcloud.com/en/jcs-for-kubernetes/delete-nodegroup);

5. Name: The default name is nodegroup1 and is unchangeable, supporting Chinese, numbers, uppercase and lowercase letters, English underline "_" and line-through "-", with at most 32 characters. Working node groups under the same cluster shall not have the same name.

6. The following are advanced options that do not necessarily need to be filled in:
  * Description: Description should consist of no more than 256 characters;
  * System disk: The default capacity of the local disk is 100G, which can not be modified;
  * Automatic repair: When it is enabled, the working node of non-running or ready status will be repaired automatically. For more details, please refer to [Automatic Repair Instruction](https://docs.jdcloud.com/en/jcs-for-kubernetes/auto-repair); 
  * Tag: Set keys and values of tags added on the working nodes; a key is composed of a prefix and a name; the prefix cannot exceed 253 characters, consisting of DNS sub-domain; each sub-domain cannot exceed 63 characters, must be started and ended with lowercase letters or numbers and may contain "-", ".", uppercase and lowercase letters and numbers; the name and value cannot exceed 63 characters respectively, must be started and ended with uppercase and lowercase letters or numbers respectively and may contain "-", " _ ", ".", uppercase and lowercase letters and numbers; and at most five groups of tags can be added.

7. After completing relevant settings, click **OK** to enter Elastic Compute>>JCS for Kubernetes>>Cluster Service>>Working Node Group and view the created JCS for Kubernetes.

