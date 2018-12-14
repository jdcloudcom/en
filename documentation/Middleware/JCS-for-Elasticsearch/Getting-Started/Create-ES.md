## Create Instance
You can create instances via the console of JCS for Elasticsearch. For billing instructions of instances, please refer to "[Price Overview](../Pricing/Price-Overview.md)" and "[Billing Rules](../Pricing/Billing-Rules.md)".
## Preconditions
- JD Cloud account registration is done and real-name verification is completed. If you have no accounts, please [register](https://accounts.jdcloud.com/p/regPage?source=jdcloud&ReturnUrl=https%3a%2f%2fuc.jdcloud.com%2fpassport%2fcomplete%3freturnUrl%3dhttps%3a%2f%2fwww.jdcloud.com), or make [Real-name Verification](https://uc.jdcloud.com/account/certify)。
- If billing type is selected as pay by configuration, please confirm that your account balance (including coupon) is sufficient for your application.
## Operation Steps
1. 	Login [JCS for Elasticsearch Console](https://es-console.jdcloud.com/clusters)。

2. 	Click [Create Cluster] in the Instance List Page to enter the "Create Cluster" Page.</br>
![查询1](https://github.com/jdcloudcom/cn/blob/Elasticsearch/image/Internet-Middleware/JCS%20for%20Elasticsearch/创建ES-01.png)

![查询1](https://github.com/jdcloudcom/cn/blob/Elasticsearch/image/Internet-Middleware/JCS%20for%20Elasticsearch/configes_10.png)

3. After entering the "Create Cluster" page, specify the cluster "Region" and "Availability Zone".</br>
    * "Region": The current work areas support "cn-north-1", "cn-south-1" and "cn-east-2".</br>
    * "Availability Zone": An Availability Zone is a physical area that uses independent power and network resources. Interconnected through the internal network and physically isolated to improve the availability of application program. Different Availability Zones are not interconnected and cannot be changed after creation.
 ![查询1](https://github.com/jdcloudcom/cn/blob/Elasticsearch/image/Internet-Middleware/JCS%20for%20Elasticsearch/配置ES-01.png)
 
4. Set the cluster basic information, select "Cluster Version" and enter the "Cluster Name".</br>
    * "Cluster Version": The current version only supports 5.6.9.</br>
    * "Cluster Name": The name of the customized cluster. The name cannot be blank. It only supports Chinese, numbers, capital and lowercase letters, English underline "_" and line-through "-", and cannot exceed 32 characters.
 ![查询1](https://github.com/jdcloudcom/cn/blob/Elasticsearch/image/Internet-Middleware/JCS%20for%20Elasticsearch/配置ES-02.png)
 
5. Set the machine specification related parameters of the cluster.
    * "Node Specification": Currently supports six specifications, including: 1 core 2G, 2 core 4G, 2 core 8G, 4 core 16G, 8 core 32G and 16 core 64G. Different virtual machine specifications can be selected according to specific business conditions, wherein 1 core 2G is only applicable to testing, not to production environment.
    * "Single Point Storage Specification": Single point storage specification range is 20-200GB, and integers can be entered.
    * "Number of Nodes": Single point storage specification range is 1-15 and 1 node is selected by default. Where the input range is larger or smaller than the specified range, the maximum number of nodes and the minimum number of nodes will be displayed.
  ![查询1](https://github.com/jdcloudcom/cn/blob/Elasticsearch/image/Internet-Middleware/JCS%20for%20Elasticsearch/配置ES-031.png)
  
6. Set a dedicated master node. Since disabling the dedicated master node can improve the cluster stability, it is recommended to disable it.
    * "Specification of dedicated master node": 2-core 8G and 4-core 16G are supported.
    * "Number of dedicated master node": For most instances, three dedicated master nodes are applicable.
    * "Storage of dedicated master node": Fixed 20G.
![查询1](https://github.com/jdcloudcom/cn/blob/Elasticsearch/image/Internet-Middleware/JCS%20for%20Elasticsearch/configes_11.png)

7. Specify the network specification related parameters of the cluster, including "Virtual Private Cloud" and "Subnet".
    * "Virtual Private Cloud": Displays the current VPC list. The most newly created VPC is selected by default. Click "Create New Virtual Private Cloud" after the list to jump to the Virtual Private Cloud (VPC) page.
    * "Subnet": Displays the current subnet list. The most newly created subnet is selected by default. Click "Create New Subnet" after the list to jump to the Virtual Private Cloud - Subnet page.
  ![查询1](https://github.com/jdcloudcom/cn/blob/Elasticsearch/image/Internet-Middleware/JCS%20for%20Elasticsearch/配置ES-04.png)
  
8. The selected configuration list shows the currently selected configuration information, and the unselected options display the default configuration. Click "Buy Now" to enter the specification confirmation interface.

9. When the specification confirmation is completed, click "Enable Now" to start creating the cluster.
  ![查询1](https://github.com/jdcloudcom/cn/blob/Elasticsearch/image/Internet-Middleware/JCS%20for%20Elasticsearch/配置ES-06.png)

10. After jumping to the payment confirmation page and after the payment succeeds, it will return to the cluster list page. The cluster created by you will appear in the cluster list. And the cluster status is "Pending"; wait patiently for a few minutes, and the cluster status will change to "Running" after creation succeeds. If the cluster creation fails, please recreate the cluster according to the page notifications.
  ![查询1](https://github.com/jdcloudcom/cn/blob/Elasticsearch/image/Internet-Middleware/JCS%20for%20Elasticsearch/配置ES-07.png)
  ![查询1](https://github.com/jdcloudcom/cn/blob/Elasticsearch/image/Internet-Middleware/JCS%20for%20Elasticsearch/配置ES-08.png)
