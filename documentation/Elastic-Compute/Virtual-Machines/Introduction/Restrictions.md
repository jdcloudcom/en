# Restrictions

## Account Limit
* You need to perform real-name verification for the JD Cloud account used to create the VM instance. For details, please refer to [Real-name Verification]();
* To create an instance billing by monthly package, you need to prepay the instance fee. To create an instance billing by configuration, you need to keep the total sum of your account balance and available coupons no less than RMB 50.

## Usage Restrictions
* Secondary virtualization is not supported for now (such as installing and using VMware and Hyper-V).
* External hardware devices (such as U disk, external hard disk, bank U shield, etc.) connection are not supported for now.
* NAT Instance only supports Centos 7.2 system currently.
* The first-generation instance type cannot be mutually resized with the second-generation instance type. For details, please refer to[Resize](http://docs.jdcloud.com/cn/virtual-machines/resize-instance).
* For Windows Server system instances, it supports 64-core vCPU to the maximum. And it is recommended to purchase a minimum configuration of 1Core 2GB to ensure efficient operation of the business.
* Single instance with a single private IP can only be associated to one elastic IP.
* The multicast protocol is not supported at this time. It is recommended to use the unicast peer-to-peer method instead.
* Windows Server instance supports password login, and Linux system instance supports password and key pair login.

## Other Restrictions
Constraints|Constraint Rules|Exception Application Mode   
:---|:---|:---     
Optional VM Instance Specifications|See [VM Instance Specifications](https://docs.jdcloud.com/cn/virtual-machines/instance-type-family)|Open Ticket 
Optional Public Image Types|See [Public Image Release Version](https://docs.jdcloud.com/cn/virtual-machines/image-type)|Open Ticket         
Single Region Instance Quota|20|Open Ticket      
Single Region Cloud Disk Quota|15|Open Ticket       
Single Region Cloud Disk Snapshot Quota|15|Open Ticket   
Single Region Elastic IP Quota|10|Open Ticket
Single VPC Security Group Quota|50|Open Ticket  
Single Region Private Image Quota|5|Open Ticket  
Single Region Shared Image Quota|5 (acceptable for no more than 5)|Adjustment Not Supported
Quota of Cloud Disk Attached to Single Virtual Machine|8 (SSD Cloud Disk or Premium Hdd Cloud Disk)|Adjustment Not Supported       
Quota of Elastic IP Associated to Single Virtual Machine |1|Adjustment Not Supported        
Quota of Security Group Associated to Single Virtual Machine|5|Adjustment Not Supported    
Quota of Key Pair Associated to Single Virtual Machine|1|Adjustment Not Supported     
System Disk Type and Capacity|40GB Local Disk for Free and Adjustment Not Supported<br>Cloud Disk 40~500GB (in beta)|Local Disk Capacity Adjustment Not Supported   
Data Disk Type and Capacity|SSD Cloud Disk: 20GB-1000GB<br> Premium Hdd Cloud Disk：20GB-3000GB|Adjustment Not Supported            
Single Security Group Rules Quota|Total Outbound and Inbound Rules No More Than 100|Adjustment Not Supported    


