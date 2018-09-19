
# Create Container Instance

**Precondition**

Before creating a container instance, the following procedure shall be completed

Register a JD Cloud account and get it activated and authenticated; you can respectively access to register JD Cloud, login JD Cloud and get real name verification to carry on operations;

If you need to create an instance pay by configuration, you shall make sure that there are no less than 50 yuan for your surpluses; please recharge in case there is not enough money;

You must create VPC, subnet firstly;

If you need to use security group to Identity and Access management of instance, you may create security group in advance or reconfigure the outbound, inbound rules of security group.


## Operational Steps

 1. Open console and select Elastic Compute>>Container service>>Container instance;
 2. Select the region that the container instance created belongs to and click “Create” button to go to the Container Instance Purchase page; you are suggested to select the region that instance located in and availability zone according to business condition.
 Remark: At present support cn-north-1, cn-east-2 and provide two availability zones including availability zone A and availability zone B; please look forward to the online time of other regions.
 3. Select Billing Mode: Monthly package and pay by configuration; yearly package and monthly package pay by month to purchase resources and charge according to configuration charge according to time period of actual use(exact to second). Please refer to charge rules for differences between the two billing method. 
 4. Selection of region and availability zone: In this step, you can still select the region (cn-north-1) that the container is corresponding to and availability zone; pay attention that “ Resource intranets in different regions are not interconnected and it shall not be changed after creation”, if quota in region you selected is filled, then you may increase quota by open ticket.
 5. Choose Image:
 Container Registry: docker.io or the Container Registry address that Registry authentication information is corresponding to. Default to docker.io, if docker.io is selected, it shall create container based on the public image that Docker Hub provides; after Registry authentication information has been selected, it shall create container based on the public or private image that corresponding Container Registry provides. If no Registry authentication information is added, then JD Cloud shall use Docker Hub to get container image by default; if you need to use third party private image Container Registry, you need to add secrets to JD Cloud firstly and select adding third party Container Registry authentication information to JD Cloud. When using a private image created in the Docker Hub to add a third-party warehouse certification, it is recommended that the warehouse domain name should be based on this address: https://index.docker.io     
 Image name: Enter image name that is required for creating container, for example: library/nginx
 Image version: If there is no enter, default version is latest; if you need other versions, please enter version name.
 6. Select specification
The configuration of JD Cloud VM support user-defined selection: Provide from 1 core 1G to 56 cores 448G(At present 32 cores 256G, 54 cores 112G, 54 cores 224 G, 54 cores 448G are currently not opened); provide three types including universal type, computer optimized type and memory optimized type and user can select instance type and corresponding settings according to different business scenarios; refer to instance settings recommendation for details
As for selecting other instances, please select to change instance rules to select:
 7. Storage: JD Cloud provide cloud disk service as the system disk and data disk for container; cloud disk service adopt distributed storage method of multiple backups for one disk which has a high reliability              

System Disk: At present only support SSD cloud disk, with range of capacity of 10-100G; the file system of system disk support xfs or ext4 format and we shall format the system disk of the container according to file system format selected when creating a container; the attach directory of system disk is the root directory “/” and can not be changed; at present the system disk must be deleted following the container delete.    

Data Disk: Support attach 7 data disks and may select Premium Hdd Cloud Disk and SSD cloud disk; only support creating time-associated data disk.        

Using the Premium Premium Hdd Cloud Disk as data disk: Support a range of 20G~3000G        

Using SSD Cloud Disk as Data Disk: Support a range of 20G~1000G        

The cost of cloud disk service is independent from that of instance and please refer to price of cloud disk for details of price.        

 8. Select network

Select “VPC” and “Subnet”, after that you may determine the quantity of VM allowed to be created under this subnet; if there is no subnet currently, you may create a new subnet according to fast entry and then select in “VM network”; please refer to VPC and subnet for details.                                               

Private IP: There are two mode including automatic allocate and self defined. Default to automatic allocate mode in which assign private IP by system to container automatically and can not be changed; you may select self-defined mode, in which intranet IP which is in the range of intranet IPs designated by subnet CIDR shall be entered; if you choose to self define intranet IP, it is not currently supporting creating container instance in batch.

Select the corresponding created security group. The security group is a necessary option and can be created at the quick entrance (please refer to the Security Group Creation section for more details). After creation, select it from “Web”. 

 9. Bandwidth:

The bandwidth of public IP JD Cloud provides is charged by: Fixed bandwidth - charged according to the Bandwidth Cap at the time of purchase and has nothing to do with real time access to public network; by traffic - charged according to the real time access to the public network. At present BGP is available only in cn-north-1.        

Bandwidth Range: 1Mbps~200Mbps, you may not purchase public IP for the moment during creating container instance and you may associate it after the container has been created.

 The bandwidth cost of EIP is independent from instance cost. Refer to price of public IP for details.        

 

Billing method of instance 	Public network billing by bandwidth     	Cost estimate                                        
Pay by configuration                  	by fixed bandwidth                  	Cost of settings, include: The prices of instance types (configuration of CPU and memory), data disks (if any), and EIP bandwidth.                    
By Traffic                    	 EIP Traffic Costs + Configuration Costs. Where, the configuration costs include: The costs of instance types (configuration of CPU and memory) and data disks (if any) and EIP configuration costs.          
Monthly package            	by fixed bandwidth                  	Cost of settings, include: The prices of instance types (configuration of CPU and memory), data disks (if any), and EIP bandwidth.                    
By Traffic                    	 EIP Traffic Costs + Configuration Costs. Where, the configuration costs include: The costs of instance types (configuration of CPU and memory) and data disks (if any) and EIP configuration costs.                   

        
 10. Advanced setup

Is not required item and provide advanced option for your creating container. You may selectively define options of advanced setup as required;

Running command: Enter the first Entrypoint instruction when running the container which shall replace the Entrypoint instruction that is set in image;

Running parameters: Enter the first CMD instruction when starting the container which shall replace the CMD instruction that is set in image; if Entrypoint instruction has been set in command which is already running, this instruction shall be added to parameters of Entrypoint instruction to be executed;

Environment variables: Environment variables for container running. You may set multiple groups of environment variables for each container, however, the key of environment variables must be corresponding to the value of environment variables one to one in each group; env command may be used to check the environment variables of the container; click + button and add a group of environment variables; click “delete” to delete a group of environment variables; 

Work directory: Set work directory for container. The work directory of container must be absolute path, start with/and not contain “: ”, “. ”characters; if there is no setup, use root directory “/” as work directory of container by default

Machine name: Setup the Machine name; if there is no setup, use container ID as host name;

Starting items: Click button to start or stop TTY; TTY is closed by default; allocate a pseudo-terminal for container after start and print Stdin, Stdout, Stderror information of the container;
 11. Domain and IP mapping

Not mandatory filed, add a group of domain names and IP mappings to hosts file of the container; click delete button to delete a group of domains and IP mappings; click + button to add a group of domains and IP mappings.
 12. Basic Information

Name: Mandatory field, currently only support English letters, numbers, capitals and lowercase letters, line-through “-”, underline “_” with length no exceed 32 characters; if creates purchase in batch, the names shall be presented with “xxx1”,“xxx2” successively.   

Description: Not mandatory filed, you may setup as required and the description for container can not exceed 256 characters;
 13. Determine the quantity of containers and purchase duration

Purchase quantity is limited by the quantity of your containers, Cloud Disk Service, public IP quota and the quantity of IP remained in the subnet you select in the region; if there are not enough quotas, you may open ticket to increase quota.

If you purchase yearly package or monthly package, you shall set the purchase duration which is minimally 1 month and maximally 3 years. Open ticket if longer service time is needed.
  14. After completing relevant settings for the container, click **Buy Now** and pay, then you can go to Console>>Elastic Compute>>Container service>>Container instance to check the container created.


 