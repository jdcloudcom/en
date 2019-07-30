# Create Container Instance

**Preconditions**

1. Before creating a container instance, you need to complete the following steps  
2. Register a JD Cloud account, activate and verify the same, to respectively access [JD Cloud registration](https://accounts.jdcloud.com/p/regPage?source=jdcloud%26ReturnUrl=%2f%2fuc.jdcloud.com%2fpassport%2fcomplete%3freturnUrl%3d//www.jdcloud.com/), [JD Cloud Login](https://console.jdcloud.com/overview) and [Real-name Verification](https://uc.jdcloud.com/account/verify).  
3. If you need to create the billing instances paid by configuration, you need to keep your balance above RMB 50. If the balance is less than the limit, please [recharge](https://uc.jdcloud.com/cost/capital/recharg) your account.  
4. You must create a virtual private cloud and a subnet first;  
5. If you need IAM for an instance using a security group, you can pre-create a security group or reconfigure the outbound and inbound rules of a security group.  

**Action Steps**

 1. Open Console, select [Elastic Compute>>Container Service>>Container Instance](https://cns-console.jdcloud.com/host/container/list);  
 2. Select the region where the container instance to be created is located, and click **Create** button to access to the container instance purchase page; it is recommended that you choose the region where the instance is located and the availability zone according to the business situation.  
 Note: Currently, it supports cn-north-1, cn-east-2 and cn-south-1 regions; as for the online time of other regions, please wait.  
 3. Select billing model: monthly package and pay by configuration; as for monthly package, pay monthly to purchase resource and as for pay by configuration, billing is made as per the length of time actually used (accurate to seconds). Regarding the difference between the two billing methods, please refer to [the billing rules](https://docs.jdcloud.com/en/native-container/billing-rules).  
 4. Selection of region and availability zone: In this step, you can still select the area corresponding to the container (cn-north-1) and the availability zone. Please note that "The resource intranet in different regions is not interlinked, and cannot be changed after creation", if the selected region quota is full, the quota can be increased by open ticket.  
 5. Select image:  
    For image selection, you can select JD Cloud Image or third party image;  
    - JD Cloud Image: ** Recommend to use this method**;The image is saved in the Container Registry of JD Cloud, seamlessly integrated with the container instance service to implement high speed image download. Select current added repository and images in current region; if there is no created repository in current region, you can click **Create Registry** to jump to Registration Creation page. See [Container Registry Help Center](https://docs.jdcloud.com/en/container-registry/product-overview) for details;  
    - Image from Third Party: docker.io, or repository address corresponding to warehouse verification information. It is docker.io by default; create container **based on the Public Image provided by Docker Hub if docker.io is select**, such as centos, nginx, etc.; after selecting the warehouse verification information, the container is created based on the public or private image provided by the corresponding Repository. When no warehouse authentication information is added, JD Cloud will use Docker Hub to obtain docker image by default; if a third-party private Repository is required, you will need to first add warehouse verification information to JD Cloud. Choose to add third-party Secrets to JD Cloud. ** Notes:** Images created by users in Docker Hub, whether public or private, images only can be created successfully until adding third-party repository verification, see the address: https://index.docker.io for repository domain. For details, see [Create Secrets](https://docs.jdcloud.com/en/native-container/create-repository)     
 Image name: Enter the image name needed to create the container, for example: library/nginx  
 Tag: Enter image version, e.g.: latest.  
   - **After the third-party image information is completed, the information verification will be conducted by default to confirm the existence of image that can obtain the image since containers can be created only when the image completely and correctly passes the information verification, so as to avoid unsuccessful creation of containers due to information errors**
 6. Select specification  
Configuration of JD Cloud VM support user customized selection: Provide four types are available: general type, compute optimized type, memory optimized type and high-frequency-compute general; users can select instance type and corresponding configurations according to different business scenarios. Please refer to the instance configuration recommendation for details.  
To select other instance, please select the rules for replacement instance to select:  
 7. Storage: JD Cloud provides the cloud disk as the system disk and the data disk of the container, the cloud disk uses the one disk multi-standby distributed storage method with high data reliability.                
System disk: Provide General SSD Disk, Performance SSD Disk, Capacity HDD Cloud Disk, and the capacity disk is 10-100G; the system disk file system format supports xfs or ext4, to format the container's system disk according to the selected file system format when creating the container; the mounting directory of the system disk is the root directory "/" which cannot be modified; currently the system disk must be deleted with the container;    
Data Disk: Provide General SSD Disk, Performance SSD Disk, Capacity HDD Cloud Disk; attach seven data disks; and only support to associate data disk when creating.       
  The Cloud Disk Service cost is independent from that of the instance. For products and prices, see [Cloud Disk Service](https://docs.jdcloud.com/en/cloud-disk-service/product-overview) for details   
 8. Select network  
Select **Virtual Private Cloud** and **Subnet**, after selecting Subnet, you can judge the VM number that may be created under the Subnet; if there is no Subnet currently, you may create a new Subnet through fast entrance and select in "Virtual Machine Network". Please refer to virtual private cloud and subnet for details.  
Private IP: There are two modes for automatic allocation and customization. It is automatic allocation by default; the private IP will be automatically assigned by the system to the container and cannot be modified; customization is available, you need to enter the private IP, the IP address within the IP scope of the intranet specified by your subnet CIDR; if a customized private IP is selected, batch creation of container instances is not supported for the time being.  
Select the corresponding created security group, which is a must; security group can also be created through a quick entry. Please refer to Create Security Group for details; after the creation, select in the "Network".   
 9. Bandwidth:  
The EIP bandwidth type provided by JD Cloud is billing by fixed bandwidth and billing by traffic; Billing by fixed bandwidth is based on the bandwidth cap value set at the time of purchase, regardless of your instance’s current real-time access to public network bandwidth; while billing by traffic is based on the actual traffic of your real-time access to the public network. Currently only BGP is available in cn-north-1.  
Bandwidth range is: 1Mbps~200Mbps. During the process of creating container instance, it is allowed not to purchase EIP temporarily; do not bind before the creation of container.  
 The cost for EIP bandwidth is independent from those of the instance. For specific information, please refer to [Public Network IP](https://docs.jdcloud.com/en/elastic-ip/product-overview).
 10. Advanced Settings  
It is not a compulsory item, which provides advanced options for you to create containers. You can optionally define options in advanced settings as needed;  
Running command: Enter the first Entrypoint instruction that runs when the container is started, which will replace the Entrypoint instruction set in the image;  
Running parameter: Enter the first CMD instruction that runs when the container is started, which will replace the CMD instruction set in the image; if the Entrypoint instruction has been set in the running command, the instruction will be appended to the parameter of the Entrypoint instruction for execution;  
Environment variable: Set the environment variable at the container running time. You can set multiple sets of environment variables for each container, and the keys and values of each set of environment variables must correspond one by one; after the container starts, you can use the env command to view the container's environment variable; click **+** to add a set of environment variable, and click **Delete** to delete a set of environment variable;  
Working directory: Set the container’s working directory. Container’s working directory must be absolute path, starting with "/" and cannot contain ":", "." characters; if not set, use the root directory "/" as the container's working directory by default.  
Machine name: Set the machine name of the container; if not set, use the container ID as the machine name;  
Startup item: click the button to open or close TTY; by default TTY is closed; after opening, a pseudo terminal will be assigned to the container to print the container's Stdin, Stdout and Stderror information.  
 11. Domain name and IP mapping  
It is not a compulsory item, to add a set of domain names and IP mapping to the container hosts file; Click **Delete** to delete a set of domain names and IP mapping; click **+** to add a set of domain names and IP mapping.  
 12. Basic Information  
Name: a compulsory item, and only supports Chinese, numbers, capital and lowercase letters, English underline "_" and line-through "-", and cannot exceed 32 characters; if the purchase is created in bulk, the names are displayed as "xxx1" and "xxx2" in turn.   
Description: It is not a compulsory item; you can set them on demand, and the container description should not exceed 256 characters;  
 13. Confirm the number of containers and the purchase duration  
Purchase quantity is limited by your container, cloud disk, EIP quota in the region and the amount of IP remaining on the selected subnet. If the quota is not enough, you can increase the quota by open ticket.  
If you purchase a monthly package instance, the purchase duration shall be set, which is 1 month at shortest and 3 years at longest. Please open ticket if you need longer service duration.  
  14. After completion of container related configuration, click **Buy Now** to complete the payment and enter the [Console>>Elastic Compute>>Container Service>>Container Instance](https://cns-console.jdcloud.com/host/container/list), to view the container created.  
