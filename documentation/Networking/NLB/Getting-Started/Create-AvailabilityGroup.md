
# Create availability group

## Create instance template

##### 1. Enable the console, select Elastic Compute>>Virtual Machine>>Instance Template
##### 2. Select a region requiring to create instance template
##### 3. Click **Create** to enter instance template creating page
##### 4. Select region: It still can select a region for creating a new instance template in this step (cn-north-1, cn-south-1, cn-east-1 and cn-east-2), please note that the instance template cannot be used across regions, for example, it does not support to use the instance template in region of cn-south-1 to create VM instance. If the quota of the selected chosen region is full, it may increase quota by open ticket.
##### 5. Set instance template name, description, for example: Web service instance template
##### 6. Select image, Virtual Machines in availability group shall be created by this image
##### 7. Select specifications: Specifications of JD Cloud VM support user customized selection: the user can select the instance types and corresponding configurations according to different business scenarios
##### 8. Select storage: JD Cloud provides two types of Cloud Disk and Hard Disk
##### 9. Select network: You are required to select “Virtual Private Cloud” and “Subnet”, after selecting Subnet, you can judge the VM number that may be created under the Subnet; if there is no Subnet currently, you may create a new Subnet through fast entrance and select in “Virtual Machine Network”
##### 10. Select public network bandwidth
##### 11. Click **Create Now**to trigger creation instance template, and you will see instance template created successfully on the instance template list page.

## Create availability group

##### 1. Open console, select Elastic Compute>>Availability Group.
##### 2. Select the region requiring to create availability group, it is noted that please ensure the created launch configuration is also in this region.
##### 3. Click **Create** to have a popup window for creating availability group
##### 4. Select region: The region you selected on the list page shall be the region by default, it still can exchange a corresponding region for creating a new instance template in this step (cn-north-1, cn-south-1, cn-east-1 and cn-east-2). If the quota of the selected chosen region is full, it may increase quota by open ticket.
##### 5. Set the availability zone attribute of availability group. To ensure optimal business availability, it is recommended to select multiple availability zones. Virtual machines in availability group shall be evenly distributed in availability group. It will reduce impact on your business when a single availability zone has a physical failure
##### 6. Sett availability group name and description, such as: Web Service Availability Group
##### 7. Select instance template, the drop-down box will list the instance templates that meet the conditions in the current region, please note that it is required to select an instance template that is configured with the second-generation virtual machine specification, at this point, select the “Web Service Instance Template” created in the previous step.
##### 8. Click **OK** to trigger to create availability group, you will see the availability group created successfully on the availability group list page.
