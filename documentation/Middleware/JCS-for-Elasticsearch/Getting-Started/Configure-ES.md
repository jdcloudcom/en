## Configure ES
Operation Steps:</br>
1. After entering the “Create Cluster” page, specify the cluster “Region" and "Availability Zone".</br>
* “Region”: The current work areas support “cn-north-1”, “cn-south-1” and “cn-east-2”.</br>
* “Availability Zone”: An Availability Zone is a physical area that uses independent power and network resources. Interconnected through the internal network and physically isolated to improve the availability of application program. Different Availability Zones are not interconnected and cannot be changed after creation.</br> 
 ! [Query 1](https://github.com/jdcloudcom/cn/blob/Elasticsearch/image/Internet-Middleware/JCS%20for%20Elasticsearch/Configure ES-01.png)
2. Set the cluster basic information, select **Cluster Version** and enter the "Cluster Name".</br>
* "Cluster Version": The current version only supports 5.6.9.</br>
* "Cluster Name": The name of the customized cluster. The name cannot be blank. It only supports Chinese, numbers, capital and lowercase letters, English underline "_" and line-through "-", and cannot exceed 32 characters.</br>
 ! [Query 1](https://github.com/jdcloudcom/cn/blob/Elasticsearch/image/Internet-Middleware/JCS%20for%20Elasticsearch/Configure ES-02.png)
3. Set the machine specification related parameters of the cluster.</br>
* "Node Specification": Currently supports six specifications, including: 1 core 2G, 2 core 4G, 2 core 8G, 4 core 16G, 8 core 32G and 16 core 64G. Different virtual machine specifications can be selected according to specific business conditions, wherein 1 core 2G is only applicable to testing, not to production environment.</br>
* “Single Point Storage Specification”: Single point storage specification range is 20-1000GB, and integers can be entered.</br>
* "Number of Nodes": Single point storage specification range is 1-25, 3 nodes are selected by default; the input range is larger or smaller than the specified range, and the maximum number of nodes and the minimum number of nodes are displayed.</br>
  ! [Query 1](https://github.com/jdcloudcom/cn/blob/Elasticsearch/image/Internet-Middleware/JCS%20for%20Elasticsearch/Configure ES-031.png)
4. Specify the network specification related parameters of the cluster, including “Virtual Private Cloud” and “Subnet”.</br>
* "Virtual Private Cloud": Displays the current VPC list. The most newly created VPC is selected by default. Click **Create New Virtual Private Cloud** after the list to jump to the Virtual Private Cloud (VPC) page.</br>
* "Subnet": Displays the current subnet list. The most newly created subnet is selected by default. Click **Create New Subnet** after the list to jump to the Virtual Private Cloud - Subnet page.</br>
  ! [Query 1](https://github.com/jdcloudcom/cn/blob/Elasticsearch/image/Internet-Middleware/JCS%20for%20Elasticsearch/Configure ES-04.png)
5. The selected configuration list shows the currently selected configuration information, and the unselected options display the default configuration. Click **Buy Now** to enter the specification confirmation interface.</br>
  ! [Query 1](https://github.com/jdcloudcom/cn/blob/Elasticsearch/image/Internet-Middleware/JCS%20for%20Elasticsearch/Configure ES-05.png)
6. When the specification confirmation is completed, click **Enable Now** to start creating the cluster.</br>
  ! [Query 1](https://github.com/jdcloudcom/cn/blob/Elasticsearch/image/Internet-Middleware/JCS%20for%20Elasticsearch/Configure ES-06.png)
7. After jumping to the payment confirmation page and after the payment succeeds, it will return to the cluster list page. The cluster created by you will appear in the cluster list. And the cluster status is "Pending”; wait patiently for a few minutes, and the cluster status will change to “Running" after creation succeeds. If the cluster creation fails, please recreate the cluster according to the page notifications.</br>
  ! [Query 1](https://github.com/jdcloudcom/cn/blob/Elasticsearch/image/Internet-Middleware/JCS%20for%20Elasticsearch/Configure ES-07.png)
  ! [Query 1](https://github.com/jdcloudcom/cn/blob/Elasticsearch/image/Internet-Middleware/JCS%20for%20Elasticsearch/Configure ES-08.png)
