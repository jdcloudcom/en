# Specification Template

Click **Configuration Management** in the menu bar to enter **Specification Template**; the following page can be seen

![Alt text](https://github.com/jdcloudcom/cn/blob/DevOps/image/DevOps/Operation12.png)

1. Instance Template

Instance modules selected when performing "Edit Group" in the above "Service Tree". When deploying, DevOps will automatically create the VM instances and deploy the program in the JD Cloud Console based on the specified instance module. Users can select the region, base image, configuration specifications (CPU and memory), network and bandwidth of the machine resource according to their needs.

![Alt text](https://github.com/jdcloudcom/cn/blob/DevOps/image/DevOps/Operation13.png)

- Region: It is recommended that you select the close region according to your location to reduce access latency and increase download speed
- Image: select existing images in JD Cloud console
- Configure specification: Select machine type configuration
- Virtual Private Cloud: Select the existing virtual private cloud in JD Cloud console and assign the IP addresses in the range of virtual private cloud for Virtual Machine;
- Subnet: Select the existing subnet in JD Cloud console and assign the IP addresses in the range of subnet for Virtual Machine.
- Security group: Select the existing security group in JD Cloud console, which has the function of firewall and is used to set the network Identity and Access Management of Virtual Machine CVM.
- Billing by Bandwidth: Fixed bandwidth/by traffic
- Name: The name of the template to be created.
- Password: Set the login password of the virtual machine. If the password is not set, the system will automatically send the initial password to the mailbox associated with the JD Cloud console.

The completed templates will appear in the template list and can be selected in the Service Tree->Edit Group

2. The scaling templates are as follows:

A scaling template is a collection of Virtual Machine instances that follow the same rules and are for the same scenarios, defining the maximum and minimum values of the number of deployed instances and their listening rules.

After the scaling template is configured, you can make selection in the Service Tree->Edit Group phase according to business needs to achieve Auto Scaling of Instance

![Alt text](https://github.com/jdcloudcom/cn/blob/DevOps/image/DevOps/Operation14.png)

- Scaling Policy Name: Used to mark the scaling policy group.
- Minimum Auto Scaling Group: designate the minimum instance number in the auto scaling group
- Maximum Auto Scaling Number: designate the maximum instance number in the auto scaling group
- Cooling Period: set cooling period can ensure that other instances will not be started or terminated before the previous scaling activity takes effect. After the auto scaling group use simple scaling policy to perform dynamic scaling, it will wait for the completion of cooling time, then it will continue to perform scaling activity.
- Remove Policy: when an auto scaling group is going to reduce VM instances and has multiple choices, it will determine to remove which virtual machine(s) based on the remove policy. We provide two remove policies, i.e., remove the earliest Virtual Machines and remove the latest created Virtual Machines.
- Policy information now supports the following indicators:
 - CPU Idle Rate
 - Memory Idle Rate
 - Network Input Rate
 - Network Output Rate
 - Hawkeye Monitoring
- Each indicator can support the following dimensions:
 - Maximum
 - Minimum
 - Mean Value
- Scaling Rules: expansion/contraction, designated scaling number (set) virtual machines or designated proportion (%) virtual machines
- Send notifications to: when the scaling operation occurs, notification mails are sent to the designated mailbox; multiple mailboxes are separated by semicolons.
- Notifications will be sent when the auto scaling group has the following events: expansion, contraction, unable to expand, unable to contract.
