# Configuration Management
Configuration management provides users with the service to configure the application.

Multiple versions can exist in each configuration, and each version can be released in different deployment groups for the same application. Configuration types include:

| Type	| Description	| 
| :- | :- | 
|  Application Configuration	|  It works for a specific application. In terms of priority, application configuration takes precedence over global configuration.	|  
|  Global Configuration	|  It works for namespace. 	|  
 


## Operation Steps

### Configure Management List

 ![](../../../../../image/Internet-Middleware/JD-Distributed-Service-Framework/config-list-new.png)
 

### Creation and Configuration

#### Create Application Configuration

Step 1: Select availability zone region, and click **Create a Configuration**.
 
Step 2: Fill in Information.

1. Please note that you cannot create a configuration with the same name on the same service.


2. Type selection: Create application configuration.


![](../../../../../image/Internet-Middleware/JD-Distributed-Service-Framework/config-create.png)
  
  
Step 3: Release the configuration  

Select the configuration to be released, and click **Release**.

![](../../../../../image/Internet-Middleware/JD-Distributed-Service-Framework/pzgl-fb-yypz.png)
  
Content descriptions of part of the field are as follows:

| Field	| Description	| 
| :- | :- | 
|  Profile	|  It is the method to isolate configuration files and only allows the configuration to take effect in the specified environment. The parameter will act on route policies. Select default value if there is no special requirement.  	|  
|  Configuration Storage 	|  The physical location of configure storage.	|
|  Resource Name 	|  The specific storage location of the configure storage. 	|  


####  Create Global Configuration

Step 1: Select availability zone region, and click **Create a Configuration**.
 
Step 2: Fill in Information.

1. Please note that you cannot create a configuration with the same name on the same service.

2. Type selection: Create global configuration.

![](../../../../../image/Internet-Middleware/JD-Distributed-Service-Framework/pzgl-fb-qjpz-xj.png)
  
  
Step 3: Release the configuration  

Select the configuration to be released, and click **Release**.

![](../../../../../image/Internet-Middleware/JD-Distributed-Service-Framework/pzgl-fb-yypz.png)
  
  
### View version information for configuration item

Click the name of the configuration item. Enter the version list page, you can view all versions released of the configuration.
![](../../../../../image/Internet-Middleware/JD-Distributed-Service-Framework/config-vision.png)
   
   
Click the version number name to view the version details.
![](../../../../../image/Internet-Middleware/JD-Distributed-Service-Framework/config-vision-detail-new.png)



### View the release history of the configuration
Select a configuration in the configuration management list to view historic release records of the configuration.
![](../../../../../image/Internet-Middleware/JD-Distributed-Service-Framework/config-vision-history-new.png)


### Generate New Version
Step 1: Log in the configuration management list, click the name of the configuration item, and enter the version management page of the configuration.
![](../../../../../image/Internet-Middleware/JD-Distributed-Service-Framework/pzgl-xdlb.png)
 

Step 2: Click **Generate a New Version** under action to enter the version edit page. Generate a new version after saving.

- The default parent version number here is the version number you selected in the previous step.

- The parent version content is displayed by default.

- The new version number needs to be greater than all the old version numbers.
![](../../../../../image/Internet-Middleware/JD-Distributed-Service-Framework/config-vision-add-new.png)
  




Step 3: Release new version.

- After release, the new version will replace the original version as the on-line version.

- In the version revision list, at least 1 version record shall be kept. If you need to delete all records, please delete the entire configuration record in "Configuration Management" at the upper level.


