# Service Tree

Service tree is the basic module of DevOps, playing the role of CMDB in DevOps. Users can easily create and manage the service tree nodes by the organization business architecture to provide configuration data service for various operation and maintenance scenarios for other DevOps modules.

**Terminology Definition**

Service Tree

The service tree is a tree structure with a visual topology that stores business organization architecture information. On the one hand, it supports JNS service (name service) and is in accordance with the hierarchical relationship of “department - product line - system - application - group - instance” to maintain the correspondence between machines and instances for providing other systems with accurate and unified service data information, on the other hand, users can implement role based on service tree management and role based unified privilege control, which is the foundation of the DevOps system.

- Department: users can flexibly define and divide departments, e.g., it may be a second level or third level department in the actual organization.
- Product Line: the product line is a complete product or service, e.g., a department that may have multiple product lines or businesses.
- System: the system is a set contains one or multiple applications that can be a stand-alone product or a major branch of a product.
- Application: application can be a large function module or a small function point, which can be defined and created by users according to the actual business conditions.
- Group: an application can create multiple groups for different production environments or different purposes, adding, managing and deploying machines to each group respectively.


**Edit Service Tree**

Click the service tree menu. Add the system, department, product line, system and application in turn on the corresponding nodes on the left. For different levels of nodes, you can perform basic settings, role settings and machine list. For application level nodes, you can also edit groups and edit instances

![Alt text](https://github.com/jdcloudcom/cn/blob/DevOps/image/DevOps/Operation4.png)

Specify the application nodes on the left side. The description of the specific functions of the five pages is as follows

1. Basic Settings

English name, Chinese name, description, etc.

2. Role Settings

Edit the different permission roles at the corresponding levels (the user name added here is the existing user name under this tenant; see Account Management for details).

The lower nodes will inherit the role settings of the upper nodes. For example, if user1 is set as the person in charge of system A, then user1 will automatically become the person in charge of all applications under system A.

3. Machine List

List the machine list under this node

4. Edit Group

You can set groups; a group is an object selected when releasing online.

![Alt text](https://github.com/jdcloudcom/cn/blob/DevOps/image/DevOps/Operation5.png)

Click **Create Group** and fill in the basic English name, Chinese name, environment (production/pre-release), etc. Wherein, the groups are divided into two categories according to whether the group "supports the scaling policy":

1) Support Scaling Policy

If it is selected to support the scaling policy, Virtual Machines with the corresponding specifications and quantity will be automatically created in the JD Cloud console according to the filled in instance template and the number of elastic machines in the first online release.

![Alt text](https://github.com/jdcloudcom/cn/blob/DevOps/image/DevOps/Operation6.png)

- InstanceTemplate: select the defined specification template in the menu bar - Configuration Management - Specification Template
- Availability Group: No/Yes
- Region: The physical location of the resource
- Availability Zone: if the availability group is selected, then multiple availability zones can be selected here
- Billing Method: Monthly package/Pay By Configuration
- Number of Elastic Machines: The virtual machines in a group
- Tags：
- Description:

After the subsequent deployment is complete, the scaling and migration will be performed according to the set scaling policy and migration policy. See the specification template page for details.

2) Not Support Scaling Policy

Then, according to the difference of the selected deployment machines, they are divided into the following two categories

a. Select Existing Machine

![Alt text](https://github.com/jdcloudcom/cn/blob/DevOps/image/DevOps/Operation7.png)

After clicking **OK**, you will enter the Edit Instance page. See Editing Instance for details

b. Create Machine Based on Instance Template

![Alt text](https://github.com/jdcloudcom/cn/blob/DevOps/image/DevOps/Operation8.png)

- Instance Template: select the defined specification template in the menu bar - Configuration Management - Specification Template
- Availability Group: No/Yes
- Availability Zone: if the availability group is selected, then multiple availability zones can be selected here
- Region: The physical location of the resource
- Billing Method: Monthly package/Pay By Configuration
- The number of instances: The virtual machines in the group
- Tags：
- Description:


5. Edit Instance

1) Support Scaling Policy  

When selecting groups that support scaling policy when creating groups, VM instances will be automatically created in the JD Cloud console according to the selected instance template, so no editing instance is involved.

2) Not Support Scaling Policy

a. Select Existing Machine

When selecting groups that do not support scaling policy and deploy the machine to select the groups with existing machines when creating groups, you need to add instances to the groups. Click **Add Instance**, select the group in the pop-up window, and add a machine to the group. An instance is a machine that has been associated to the corresponding service tree product line. The “Operation Guide - Resource Pool” will explain how to associate the JD Virtual Machine with the service tree product line.

![Alt text](https://github.com/jdcloudcom/cn/blob/DevOps/image/DevOps/Operation9.png)



b. Create Machine Based on Instance Template

When selecting groups that do not support scaling policy and deploy the machine to select to create machines according to instance template, VM instances will be automatically created in the JD Cloud console according to the selected instance template. Instance number can be modified in the Edit Instance page.

![Alt text](https://github.com/jdcloudcom/cn/blob/DevOps/image/DevOps/Operation10.png)
