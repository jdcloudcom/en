
# Create native container Pod  
**Preconditions**  
Before creating native container Pod, you need to finish the following steps  
1. Register a JD Cloud account, activate and verify the same, to respectively access JD Cloud registration, JD Cloud Login and Real-name Verification.  
2. If you need to create the billing instances paid by configuration, you need to keep your balance above RMB 50. If the balance is less than the limit, please recharge your account.  
3. You must create a virtual private cloud and a subnet first;  
4. If you need IAM for an instance using a security group, you can pre-create a security group or reconfigure the outbound and inbound rules of a security group.  
**Operation Steps**  
 1. Open console, select [elastic compute >> native container >> Pod](https://cns-console.jdcloud.com/host/pod/list)；  
 2. Select affiliated region of created native container Pod, click **Create**, access native container Pod purchase page. We suggest you select region and availability zone where the instance located in according to the business situation;  
&#160; &#160; **Description**: it only supports cn-north-1, cn-east-2, cn-south-1 regions, among which cn-north-1 and cn-east-2 can provide two available zones of Availability Zone A and Availability Zone B.    
 3. Select billing model: monthly package and pay by configuration; as for monthly package, pay monthly to purchase resource and as for pay by configuration, billing is made as per the length of time actually used (accurate to seconds). Regarding the difference between the two billing methods, please refer to the [Billing Rules][2];   
 4. Selection of region and availability zone: In this step, you can still select the regions and the availability zones corresponding to the Pod. Please note that “The resource intranet in different regions is not interlinked, and cannot be changed after creation", if the selected region quota is full, the quota can be increased by opening ticket.  
 ![](https://github.com/jdcloudcom/cn/blob/edit/image/Native-Container/Podregion.png)  
 5. Select specification  
	* Configure of JD Cloud native container Pod supports user customized selection: It provides 1 core 1G to 72 cores 576G. It also provides four types of general type, compute optimized type, memory optimized type and high frequency compute type, which users can select instance specifications and corresponding configurations according to different scenarios. See [Instance configuration recommendations] for details [3];  
![](https://github.com/jdcloudcom/cn/blob/edit/image/Native-Container/Podtype.png) 
 6. Select network
	* Select **Virtual Private Cloud** and **Subnet**, after selecting Subnet, you can judge the VM number that may be created under the Subnet; if there is no Subnet currently, you may create a new Subnet through fast entrance and select in “Virtual Machine Network”. See [Virtual Private Cloud][4] and [Subnet][5] for details.  
	* Private IP: There are two modes for automatic allocation and customization. It is automatic allocation by default; the private IP will be automatically allocated by the system to the container and cannot be modified; customization is available, you need to enter the private IP, the IP address within the IP scope of the intranet specified by your subnet CIDR; if a customized private IP is selected, batch creation of Pod is not supported for the time being.  
	*  Select corresponding created security group which is mandatory and can be created through quick entry. See [Create Security Group][6] for details. After creation, return Pod creation page and select the last created items in the drop down list.  
	![](https://github.com/jdcloudcom/cn/blob/edit/image/Native-Container/PodVPC.png)   
 7. Bandwidth  
	* The elastic IP bandwidth type provided by JD Cloud is billing by fixed bandwidth and billing by traffic; Billing by fixed bandwidth is based on the bandwidth cap value set at the time of purchase, regardless of your instance’s current real-time access to public network bandwidth; while billing by traffic is based on the actual traffic of your real-time access to the public network. See Elastic IP [Billing Rules][7].  
	* Bandwidth scope: 1Mbps ~ 200Mbps;  
	*  During the process of creating Pod, it is allowed not to purchase elastic IP temporarily. You can associate elastic IP after creation of Pod.  
	*  The cost of elastic IP bandwidth is independent from those of the instance. See [Elastic IP Price][8] for specific price information.  
![](https://github.com/jdcloudcom/cn/blob/edit/image/Native-Container/Podelasticip.png)   
 8. Storage:  
 JD Cloud provides the cloud disk service as the storage for Pod, the cloud disk uses the one disk multi-standby distributed storage method with high data reliability.   
	* Select Create Cloud Disk, use existing cloud disk and snapshot to create Pod storage;  
	* Cloud Disk Service Type:  
		* Premium Hdd Cloud Disk: supporting scope 20G ~ 3,000G;  
		* SSD Cloud Disk: supporting scope 20G~1,000G;  
	* When select billing as pay by configuration, it can configure whether the cloud disk service is automatically deleted followed Pod;  
	* Support xfs and ext4 two file system format. When create Pod, system will initiate cloud disk according to selected file system format. When select Create Cloud Disk or use Snapshot, it will force to initiate the new cloud disk according to the selected file system format. When select Existing Cloud Disk, please select whether to force to format cloud disk as required;  
	* Single Pod supports attach seven cloud disks as storage at most; and it only supports to attach cloud disks when creating Pod.        
	* The cost of the cloud disk is independent from the instance. See [Cloud Disk Price][9] for specific price information.    
       ![](https://github.com/jdcloudcom/cn/blob/edit/image/Native-Container/Podvolume.png)    
9. Define Container  
	* Multiple containers can be added in single Pod. You can define specific parameter configuration for each container. Details as follows:  
	* For the image selection, you can select JD Cloud Image or third party image  
		* JD Cloud Image: the image is saved in JD Cloud image repository, seamlessly integrated with Pod service to implement high speed image download. Select current added repository and images in current region; if there is no created repository in current region, you can click New Registration button to jump to Registration Creation page. See [Image Registry Help Center][10] for details;  
		![](https://github.com/jdcloudcom/cn/blob/edit/image/Native-Container/podjcr.png)  
		* Third party image: use docker.io or image repository address corresponding to repository verification information. The default selection is docker.io. When selecting docker.io, Pod will be created on the basis of public image provided by Docker Hub; After selecting repository verification information, you can create Pod according to the public or private image provided by selected image repository. When no warehouse authentication information is added, JD Cloud will use Docker Hub to obtain docker image by default; if a third-party private image is required, you will need to first add Repository verification information to JD Cloud. Choose to add third-party Secrets to JD Cloud.    
		![](https://github.com/jdcloudcom/cn/blob/edit/image/Native-Container/poddockehub.jpg)  
	* Container name: set container name; the container name in one Pod is unique and cannot be modified; it cannot be blank and its length cannot exceed 63 characters, which starts and ends with letters or numbers, and lowercases, numbers or "-" can be used in the middle places;    
	* Resource limit: set the resource cap assigned CPU, memory of container; the resource cap can be empty or not exceed selected specifications and types;  
	* Resource requirement: set the resource floor of assigned CPU, memory of container; The default value of CPU resource floor is 100m and that of memory resource is 64Mi; designated requirement should not exceed corresponding resource limit; Total designated container resource limits should not exceed selected specifications and types;  
	* System Disk:  
	* Storage  
	* Running command: Enter the first Entrypoint instruction that runs when the container is started, which will replace the Entrypoint instruction set in the image;   
	* Running parameter: Enter the first CMD instruction that runs when the container is started, which will replace the CMD instruction set in the image; if the Entrypoint instruction has been set in the running command, the instruction will be appended to the parameter of the Entrypoint instruction for execution;   
	* Environment variable: Set the environment variable at the container running time. You can set multiple sets of environment variables for each container, and the keys and values of each set of environment variables must correspond one by one; after the container starts, you can use the env command to view the container's environment variable; click **+** to add a set of environment variable, and click **Delete** to delete a set of environment variable;  
	* Working directory: Set the container’s working directory. Container’s working directory must be absolute path, starting with “/” and cannot contain “:”, “.” characters; if not set, use the root directory "/" as the container's working directory by default.
	* Startup item: Click the button to enable or disable TTY; by default TTY is disabled; after enabling, a pseudo terminal will be assigned to the container to print the container's Stdin, Stdout and Stderror information.    
	* Probe: check survival probe or ready probe checkbox to configure survival or ready probe for the container;  
		* Delay trigger: the delay time of probe being initiated after setting enable container; the default value is 10 seconds when it is unset;  
		* Time interval: set the probe result to timeout wait time; the default value is 10 seconds when it is unset;  
		* Failed threshold: Set the minimum number of times the probe behavior is repeated before the probe result is diagnosed as failure; the default value is 3 times when it is unset;  
		* Successful threshold: Set the minimum number of times the probe behavior is repeated before the probe result is diagnosed as successful; the default value is 1 time when it is unset;  
		* Pod supports three probe types: Execaction, HttpGet, TcpSocket;  
		* Execaction probe: probe command is executed by Exec mode under root directory of container file system;  
		* HttpGet: execute container probe command by HTTP.Get request mode;  
		* TcpSocket: designate a TCP port to execute designated TCPSocket probe command;  
 11. Advanced Settings  
	 * Reboot policy: set defined reboot policy of container in Pod; three policies of Always, Never, Reboot when Failure can be selected;  
	 * Machine name: set the machine name of Pod; if it is unset, use PodID as the machine name;  
	 * Domain name and IP mapping: optional, add a group of domain names and IP mappings in the hosts file of the container; click **+** to add a group of domain names and IP mappings; click **Delete** to delete a group of domains and IP mappings. Ten groups of domain names and IP mappings and be added at most;  
	 * DNS configuration: optional, set DNS configuration in file of /etc/resolv.conf of the Pod; Click **+** to add a group of DNS configurations; click **Delete** to delete a group of DNS configurations. Six groups of DNS configurations can be added at most;  
 12. Basic Information  
	 * Name: required, name cannot be duplicated, blank and exceed 253 characters, it must start and end with lowercases and numbers, lowercases, numbers, "-" or "." can be contained in the middle places;  
	 * Description: It is not a compulsory item; you can set them on demand, and the container description should not exceed 256 characters;  
 13. Confirm Pod number and purchase duration  
	 * Purchase quantity is limited by your container, cloud disk, EIP quota in the region and the amount of IP remaining on the selected subnet. If the quota is not enough, you can increase the quota by open ticket.  
	 * If you purchase a monthly package instance, the purchase duration shall be set, which is 1 month at shortest and 3 years at longest. Please open ticket if you need longer service duration.  
  14. After completing related configuration of Pod, click **Buy Now** to complete the payment and enter the Console >> Elastic Compute >> Native Container >> Pod to view created containers.  


 


  [2]: https://docs.jdcloud.com/cn/native-container/billing-rules
  [3]: https://docs.jdcloud.com/cn/native-container/recommend-instance
  [4]: https://docs.jdcloud.com/cn/virtual-private-cloud/product-overview
  [5]: https://docs.jdcloud.com/cn/virtual-private-cloud/subnet-features
  [6]: https://docs.jdcloud.com/cn/native-container/security-group
  [7]: https://docs.jdcloud.com/cn/elastic-ip/product-overview
  [8]: https://docs.jdcloud.com/cn/elastic-ip/billing-rules
  [9]: https://docs.jdcloud.com/cn/cloud-disk-service/price-overview
  [10]: https://docs.jdcloud.com/cn/container-registry/create-registry
