
# Create an availability group
## Operation Steps
### Create instance template
 1. Select **Elastic Compute**>> **Virtual Machines**>> **Instance Template** on the left navigation bar of Console to log in the Instance Template List page.
 
 2. Click **Create** button to go to instance template creating page
 
 3. Select region: Select a region corresponded to the created instance template, if the quota of the selected region is full, it may increase quota by opening ticket.
 
     Note: The instance template cannot be used across regions, for example, it does not support to use the instance template in region of cn-south-1 to create Virtual Machines in cn-north-1.

 4. Set the other parameters for the instance template as shown in the figure below, see [Virtual Machines-Create Instance Template](http://docs.jdcloud.com/virtual-machines/create-instance-template) for detailed parameter interpretations.
 
   - Image: Virtual Machines in Availability Group shall be created by the selected image.
   - Specifications: Select specifications of Generation II Virtual Machines, only the instance templates in specifications of Generation II Virtual Machines support creating Availability Group.
   - Storage: Cloud Disk Service or Local Hard Disk Service can be selected.
   - Networking: Select Virtual Private Cloud and Subnet where Virtual Machines are located, the count of Virtual Machines that can be created within the Subnet will be displayed after selecting Subnet. If there is no Subnet currently, you may create a new Subnet through the fast entrance and select in "Virtual Machines Network".
   - Public Network Bandwidth: Virtual Machines in the Guide provide services through Public IP associated with Distributed Network Load Balancer, Public IP is not required to be associated temporarily, click **Not Purchase Now**. If the backend Virtual Machines under your scenario need to be separately associate EIP to provide services, please configure public network bandwidth.
   - Login information: Configure login information of Virtual Machines in Availability Group.
![创建实例模板](../../../../image/Networking/Distributed-Network-Load-Balancer/DNLB-020.png)

 5. Click **Create Now** to complete operations of creating template.
 
### Create an availability group
 1. Select **Elastic Compute**>> **Availability Group** to go to Availability Group List page.
 
 2. Click *Create** button, and configure the following parameters in the pop-up dialog box:
 
   - Region: Select the region where Availability Zone is located. If the quota of the selected chosen region is full, it may increase quota by open ticket.
   - Availability Zone: To ensure optimal business availability, it is recommended to select multiple availability zones. Virtual Machines in availability group shall be evenly distributed in availability group. It will reduce impact on your business when a single availability zone has a physical failure.
   - Instance Template: Select to create the templates used by Virtual Machines in Availability Group, please note it is required to select instance templates configured with specifications of Generation II Virtual Machines. At this point, create the instance template created at the previous step.
 ![创建高可用组](../../../../image/Networking/Distributed-Network-Load-Balancer/DNLB-021.png)
 
 3. Click **OK** button to complete operations of creating Availability Group.

