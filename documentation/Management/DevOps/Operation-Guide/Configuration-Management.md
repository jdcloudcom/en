# Configuration Management

**Preface**

Configuration management is the basic module of DevOps, playing the role of CMDB in DevOps and providing configuration data services for various operation and maintenance scenarios for other modules of DevOps.

Configuration management provides basic services such as service tree structure creation and management, unified privilege control and machine import and distribution. Users can easily create and manage applications according to the business architecture of the organization.

**Terminology definition**

Service tree

The service tree is a tree structure with a visual topology that stores business organization architecture information. On the one hand, it supports JNS service (name service) and is in accordance with the hierarchical relationship of “department - product line - system - application - group - instance” to maintain the correspondence between machines and instances for providing other systems with accurate and unified service data information, on the other hand, users can implement role based on service tree management and role based unified privilege control, which is the foundation of the DevOps system.
- Department: users can flexibly define and divide departments, e.g., it may be a second level or third level department in the actual organization.
- Product line: the product line is a complete product or service, e.g., a department that may have multiple product lines or businesses.
- System: the system is a set contains one or multiple applications that can be a stand-alone product or a major branch of a product.
- Application: application can be a large function module or a small function point, which can be defined and created by users according to the actual business conditions.
- Group: an application can create multiple groups for different production environments or different purposes, adding, managing and deploying machines to each group respectively.

Resource pool

In order to better manage and allocate machines, the concept of resource pool is introduced. The main function of resource pool is to allocate machine belonging, i.e., import the machine resource from external (JD Cloud console or manual) to the secondary department, and then allocate the machines from the secondary department to the specific product line.

**Product Functions**

1. Maintain Product Line

Click " +add product line" at the right side of the Department Name to open the add Product Line page. Click the corresponding product line to edit or delete it. When deleting the product line, the system of it should be deleted first.

2. Maintain System

Click " +add system" at the right side of the Product Line Name to open the Add System page. Click the corresponding system to edit or delete it. When deleting the system, all applications under it should be deleted first.

3. Maintain Application

Click " +add application" at the right side of the System Name to open the Add Application page.

Click the corresponding application to edit or delete it. When deleting the application, all groups under the application should be deleted first.

4. Import Machines

The machine resources include JD Cloud Virtual Machine, other third party Virtual Machine (including physical machine and virtual machine). If your account has already been related to JD Cloud console account and has also been added to the resource pool of a product line, you can use the quick import method to directly check the virtual machines in the console to the DevOps platform for deployment.

Method one: quick import, select the product line to be imported in the service tree, click the Quick Import button and select the region of the virtual machines on the Import page.

Method two: batch import, select the product line to be imported in the service tree, enter the machine information correctly according to the provided import template and click OK.

  ![image](https://github.com/jdcloudcom/cn/blob/DevOps/image/DevOps/Operation-Guide4.png)

5. Maintain Group and Instances

When adding applications, complete [basic settings] and [role settings] then save it, you can add groups and the instances under each group to the application, the added machines can be seen on the Machine List page.

Select the corresponding applications to edit the group and instances on the right side, and when deleting the group, the instances under the group should be deleted first.

  ![image](https://github.com/jdcloudcom/cn/blob/DevOps/image/DevOps/Operation-Guide5.png)

Specifically, when add groups: 

  ![image](https://github.com/jdcloudcom/cn/blob/DevOps/image/DevOps/Operation-Guide6.png)

the following information should be entered:

- English name
- Chinese name
- environment: production/pre-release
- support scaling policy: Yes/No. Namely, whether this group supports auto scaling, that is, scaling the virtual machine according to the configured scaling policy, and deploying the corresponding programs

&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; if you select “Yes”, then:

  the following information should be entered:
  - Instances template: select the defined specification template in the menu bar - Configuration Management - Specification Template
  - Availability Group: No/Yes
  - Region: the physical location of the resource
  - Availability Zone: if the Availability Group is selected, then multiple availability zones can be selected here
  - Billing Method: Monthly Package/Pay By Configuration
  - The number of elastic machines: the virtual machines in a group
  - Tags：
  - Description:

	If you select “No”, then:

  Select deployment machines: select existing machines/create machines based on your instance modules,
  
  If you select “select existing machine”, then:
  
 ![image](https://github.com/jdcloudcom/cn/blob/DevOps/image/DevOps/Operation-Guide7.png)
 
   the following information should be entered:
    - Tags：
    - Description:
    enter the Edit Instance page and select the group to add the created virtual machines in the console.
    
If you select "create machines according to your instance modules", then:
  ![image](https://github.com/jdcloudcom/cn/blob/DevOps/image/DevOps/Operation-Guide8.png)
the following information should be entered:
  - Instances template: select the defined specification template in the menu bar - Configuration Management - Specification Template
  - Availability Group: No/Yes
  - Availability Zone: if the Availability Group is selected, then multiple availability zones can be selected here
  - Region: the physical location of the resource
  - Billing Method: Monthly Package/Pay By Configuration
  - The number of instances: the virtual machines in the group
  - Tags：
  - Description:


6. Resource Pool

Relate machine resource to product line

Configuration Management-Resource Pool from the navigation bar

i. Method one: quick import, select the product line to be imported in the Service Tree, click “Quick Import” button, select the Region of the Virtual Machine on the Import page, select the Virtual Machine needed.

ii. Method two: batch import, select the product line to be imported in the Service Tree, enter the correct Machine information according to the provided import template, then click OK.

 ![image](https://github.com/jdcloudcom/cn/blob/DevOps/image/DevOps/Operation-Guide9.png)


7. Specification Templates

Select Configuration Management - Specification Template from the navigation bar

Support Instance Template and Scaling Template

The Instance Templates are as follows:
  ![image](https://github.com/jdcloudcom/cn/blob/DevOps/image/DevOps/Operation-Guide10.png)

- Region: it is recommended that you select the closest region according to your geographic location. It can reduce access latency and improve download speed
- Image: select existing images in JD Cloud console
- Configure specification: select machine type configuration
- Virtual private cloud: select the existing virtual private cloud in JD Cloud console and assign the IP addresses in the range of virtual private cloud for virtual machines;
- Subnet: select the existing subnet in JD Cloud console and assign the IP addresses in the range of subnet for virtual machines;
- Security Group: select the existing security group in JD Cloud console, which has the function of firewall and is used to set the network Identity and Access Management of virtual machine CVirtual Machine.
- Billing by Bandwidth: fixed bandwidth/by traffic
- Name: the name of the template to be created.
- Password: set the login password of the virtual machine. If the password is not set, the system will automatically send the initial password to the mailbox associated with the console.

The completed templates will appear in the template list and can be selected in subsequent group settings.


The scaling templates are as follows:
   ![image](https://github.com/jdcloudcom/cn/blob/DevOps/image/DevOps/Operation-Guide11.png)
 
- Scaling policy name: used to mark the scaling policy group.
- Minimum Auto Scaling Group: designate the minimum instance number in the Auto Scaling Group
- Maximum scaling number: designate the maximum instance number in the Auto Scaling Group
- Cooling period: set cooling period can ensure that other instances will not be started or terminated before the previous scaling activity takes effect. After the auto scaling group use simple scaling policy to perform dynamic scaling, it will wait for the completion of cooling time, then it will continue to perform scaling activity.
- Remove policy: when an auto scaling group is going to reduce instances and has multiple choices, it will determine to remove which virtual machine(s) based on the remove policy. We provide two remove policies, i.e., remove the earliest virtual machines or remove the latest created virtual machines.
- Policy Information:
  Now it supports the following indicators:
  - CPU idle rate
  - Memory idle rate
  - Network in rate
  - Network out rate
  - Hawkeye monitoring
  Each indicator can support the following dimensions:
  - Maximum
  - Minimum
  - Mean value
  Scaling rules: expansion/contraction, designated scaling number (set) virtual machines or designated proportion (%) virtual machines

- Send notifications to: when the scaling operation occurs, notification mails are sent to the designated mailbox; multiple mailboxes are separated by semicolons.
- Notifications will be sent when the auto scaling group has the following events: expansion, contraction, unable to expand, unable to contract.
