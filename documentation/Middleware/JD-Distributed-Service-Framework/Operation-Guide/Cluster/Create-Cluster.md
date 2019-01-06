# Create Registration Center

The registration center is the management center for microservices. The user manages the cluster by creating a registration center. Registration center management functions include creating, deleting, scaling, and viewing cluster information, which are described section by section below.

#### Entry
Middleware>JD Distributed Service Framework>Service Registration>Registration Center.


##  Operation Steps:
###   Step 1: Enter the management page of the registration center
Enter the JD Distributed Service Framework menu, and select the registration center menu under the service registration, and enter the registration center list page.


###   Step 2: Select the partition in which you want to deploy the resource
A registration center can only be created in a certain partition. As shown in the figure, select "cn-north-1" partition first, and then click "Create Registration Center".
 ![](../../../../../image/Internet-Middleware/JD-Distributed-Service-Framework/zczx-list.png)
 
 
####   Note:
-  The registration center is deployed directly in the user’s VPC and will occupy different counts of private IP according to the different specifications selected by the user. Please ensure that the selected subnet dynamic ip is sufficient.
- Once the resource is created, it cannot be migrated to another region.
-  If you do not have permission for the current region, you will not be able to create a new resource.
-  For creation, cluster names cannot be repeated, nor can they be repeated in different regions.

###   Step 3: Click Create Registration Center, and fill in the registration information.
You should enter cluster names in turn, select cluster network and subnet ID, select count of service instance and fill in description. Then click Save to complete the creation process.

The time required to create the instance is affected by the selected instance type. It takes about 5-15 minutes, please wait patiently.

  ![](../../../../../image/Internet-Middleware/JD-Distributed-Service-Framework/zczx-xj.png)

