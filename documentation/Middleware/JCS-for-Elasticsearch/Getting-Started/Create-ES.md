## Create Cluster
You can create clusters via the console of JCS for Elasticsearch. For billing instructions of instances, please refer to "[Price Overview](../Pricing/Price-Overview.md)" and "[Billing Rules](../Pricing/Billing-Rules.md)".
## Preconditions
- JD Cloud account registration is done and real-name verification is completed. If you have no accounts, please [register](https://accounts.jdcloud.com/p/regPage?source=jdcloud&ReturnUrl=https%3a%2f%2fuc.jdcloud.com%2fpassport%2fcomplete%3freturnUrl%3dhttps%3a%2f%2fwww.jdcloud.com), or make [Real-name Verification](https://uc.jdcloud.com/account/certify).
- If billing type is selected as pay by configuration, please confirm that your account balance (including coupon) is sufficient for your application.
## Operation Steps

1.Login [JCS for Elasticsearch Console](https://es-console.jdcloud.com/clusters).</br>

2.Click [Create Cluster] in the Instance List Page to enter the "Create Cluster" Page.</br>

3. After logging in the "Create Cluster" page, you can set information such as region, basic information, specification, network and snapshot.</br>

* "Region": The current work areas support "cn-north-1", "cn-east-2".</br>
* "Availability Zone": An Availability Zone is a physical area that uses independent power and network resources. Interconnected through the internal network and physically isolated to improve the availability of application program.</br> 
* "Cluster Version": The current version supports 5.6.9 and 6.5.4.</br>
* "Cluster Name": The name of the customized cluster. The name cannot be blank. It only supports numbers, capital and lowercase letters, English underline "_" and line-through "-", start with letters and cannot exceed 32 characters.</br>
* "Storage Type": Support Performance Type SSD Cloud Disk Service, Passage Type SSD Cloud Disk Service and General Type SSD Cloud Disk. It is suggested to select the Performance Type SSD Cloud Disk.</br>
* "Node Specification": Currently supports six specifications, including: 1 core 2G, 2 core 4G, 2 core 8G, 4 core 16G, 8 core 32G and 16 core 64G. Different virtual machine specifications can be selected according to specific business conditions, wherein 1 core 2G is only applicable to testing, not to production environment.</br>
* "Single Point Storage Specification": Single point storage specification range is 20-16000GB, the step size is 10GB and integers can be entered.</br>
* "Number of Nodes": Support the ticket method to enhance the node quota.</br>
* "Dedicated Primary Node Switch": The dedicated primary node can be enabled to improve cluster stability, thus it is suggested to enable it.
* "Specification of dedicated master node": 2-core 8G and 4-core 16G and 8-core 32G are supported.</br>
* "Number of dedicated master node": For most instances, three dedicated master nodes are applicable.</br>
* "Storage of dedicated master node": Fixed 20G.</br>
* "Coordinator Node Switch": The coordinator node can improve cluster performance. Therefore, it is suggested to enable the coordinator node.</br>
* "Coordinator Node Specification": Support three specifications, i.e. 2-core 8G, 4-core 16G, 8-core 32G and 16-core 64G.</br>
* "Coordinator Node Count": Support the ticket method to increase the node quota.</br>
* "Coordinator Node Storage": Fixed 20G.</br>
* "Virtual Private Cloud": Displays the current VPC list. The most newly created VPC is selected by default. Click "Create New Virtual Private Cloud" after the list to jump to the Virtual Private Cloud (VPC) page.</br>
* "Subnet": Displays the current subnet list. The most newly created subnet is selected by default. Click "Create New Subnet" after the list to jump to the Virtual Private Cloud - Subnet page.</br>
* "Snapshot Switch": Disabled by default, can be enabled.</br>
* "Backup Start Time": Support fixed-time backup per day.</br>

8. The selected configuration list shows the currently selected configuration information, and the unselected options display the default configuration. Click "Buy Now" to enter the specification confirmation interface.</br>

9. When the specification confirmation is completed, click "Enable Now" to start creating the cluster.</br>
  
  
10. After jumping to the payment confirmation page and after the payment succeeds, it will return to the cluster list page. The cluster created by you will appear in the cluster list. And the cluster status is "Pending"; wait patiently for a few minutes, and the cluster status will change to "Running" after creation succeeds. If the cluster creation fails, please recreate the cluster according to the page notifications.</br>
  
 
