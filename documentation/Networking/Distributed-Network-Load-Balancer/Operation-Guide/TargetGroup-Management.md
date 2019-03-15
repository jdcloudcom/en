# Virtual Server Group Management

A virtual server group is an instance of a set of service requests that handle Load Balancer distribution, and each instance is a backend server.
Virtual server group management is used to guide you in adding a virtual server group and managing existing virtual server groups.
## Note
- Only Virtual Machines/containers with the same region and VPC as Distributed Network Load Balancer can be added as backend servers.
- It is not supported for a backend server to join the same virtual server group by different ports.
- The IP Address 169.254.169.110 is used as the source IP for health check of the Distributed Network Load Balancer. If such health check function is enabled, the backend server shall not shield this IP.

## Operation Steps

### Create virtual server group
1. You can go to the virtual server group list page with the following two methods on the distributed network load balancer list page.

  - Click the specified distributed network load balancer under the **Name** bar, and go to the details of the distributed network load balancer. Click the **Virtual Server Group** tag, and go to the virtual server group list page.
  -  Click the **Add Listening** link under the **Operation** bar and go to the listener list page. Click the **Virtual Server Group** tag, and go to the virtual server group list page.

2. Click the **Create Virtual Server Group** and configure the group name in the pop-up dialog box.

3. In the **Type** bar in the **Optional Instance** list, select the type of instance you want to add, including three types: All, Virtual Machines and Container. Click the **Add** button to add the selected instance to the selected instance list.

4. Configure the port number and weight of the selected instance. Click **OK** to complete the operation of adding the virtual server group.
### Manage Virtual Server Group
1. View details of virtual server group: Click on the specified virtual server group under the **Name** bar and go to the details page to view its details.
 
2. Edit virtual server group: Click **Edit** under the **Operations** bar. In the pop-up dialog box, you can modify all the configuration information of the virtual server group.
 
3. Delete the virtual server group: Click **Delete** under the **Operations** bar to delete the specified virtual server group.
## Parameter Explanation
| Parameter	| Description	| 
| :- | :- |
|Port|The port on which the instance provides services. The input range is 1-65535. If you do not fill in this parameter, the port of the backend service is used by default.|
|Weight|The weight of the instance in the entire virtual server group, with an input range of 1-100. The higher is the weight of an instance, the higher is the probability that it is distributed to a service request|
		
