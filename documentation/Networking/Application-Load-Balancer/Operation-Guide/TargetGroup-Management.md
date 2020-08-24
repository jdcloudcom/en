# Virtual server group management

[Add Virtual Server Group](targetgroup-management#user-content-1)

[Manage Virtual Server Group](targetgroup-management#user-content-2)

[Register/De-register Backend Server](targetgroup-management#user-content-3)


## Add virtual server group
<div id="user-content-1"></div>

1. Enter the virtual server group list page by clicking the Application Load Balancer-Details-Virtual server group;

	![虚拟服务器组列表页](../../../../image/Networking/ALB/ALB-034.png)

1. Click **Create Virtual Server Group**, and select the type of Virtual Server Group as Instance Type or IP Type;

- When Virtual Server Group is selected as **Instance Type**, select an instance to be added from the Optional Instance List, click **Add** to add the selected instance to the Selected Instance List, configure port and weight, click **OK** to complete the operations for adding Instance Type to Virtual Server Group. 

    - Port: the port via which an instance provides services; the input range is 1-65535. If this parameter is not filled in, the backend service port will be used by default.

    - Weight: The weight of an instance from the whole Virtual Server Group; the input range is 0-100. Any instance with higher weight enjoys higher probability to be allocated with service request. If the weight of an instance is 0, it means that the Application Load Balancer will not allocate any service request to the instance.

          Note:
           * Backend instances in Server Group must be at the same Virtual Private Cloud of the same territory with the Application Load Balancer.
           * The same instance can be registered to the same Virtual Server Group via different ports.
	   
    ![添加实例类型虚拟服务器组](../../../../image/Networking/ALB/ALB-050.png)

- When Virtual Server Group is selected as *IP Type*, click **Register New IP** to add a record, configure IP, port and weight (you can add multiple records as needed), and click **OK** to complete the operations for adding IP Type to Virtual Server Group. 

    - IP: The IP address of a registered Backend Server. The input range is 10.0.0.0/8, 172.16.0.0/12 and 192.168.0.0/16. When a Backend Server is out of VPC (e.g. a Backend Server interconnects with the Application Load Balancer via direct connection, VPC peering or VPN), please use an IP to register it to the Virtual Server Group.

    - Port: the port via which a Backend Server corresponding to an IP provides service; its input range is 1-65535. If this parameter is not filled in, the backend service port will be used by default.

    - Weight: the weight of a Backend Server corresponding to an IP from the whole Virtual Server Group; its input range is 0-100. Any Backend Server with higher weight enjoys higher probability to be allocated with service request. If the weight of a Backend Server is 0, it means that the Application Load Balancer will not distribute any service request to the backend server.

            Note:
              * The same IP can be registered to the same Virtual Server Group via different ports.
	      
    ![添加IP类型虚拟服务器组](../../../../image/Networking/ALB/ALB-035.png)
    
## Virtual server group management
<div id="user-content-2"></div>

1. Edit Virtual Server Group: The information of Virtual Server Group can be edited on the Virtual Server Group List page - Operations bar.

1. Delete virtual server group: Delete the virtual server group via the virtual server group list page-action bar.

1. By clicking **Virtual Server Group Name**, you can view the detailed information of Virtual Server Group and registered Backend Server.

	![管理虚拟服务器组](../../../../image/Networking/ALB/ALB-037.png)

	![查看虚拟服务器组](../../../../image/Networking/ALB/ALB-036.png)
		
## Register/De-register Backend Server
<div id="user-content-3"></div>

1. Open the virtual server group editing page by clicking the Application Load Balancer-Virtual server group-Editing;

1. Backend servers in Virtual Server Group can be registered/de-registered.

	![修改虚拟服务器组](../../../../image/Networking/ALB/ALB-096.png)
