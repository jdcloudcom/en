# Create File Storage

above the list to enter the “File Storage” creation page.

![create-button](../../../../image/Cloud-File-Service/create_button.png)

2. Select **Region**. Only the “cn-south-1” region is supported during Beta period; fill in the “name” and “description” of the file storage according to the input requirements. Select the **Virtual Private Cloud** and **Subnet** for the attached target of the File Storage in the drop-down lists of **Virtual Private Cloud** and **Create Attached Target** columns respectively.

Due to the network isolation policy between **Virtual Private Cloud**, only VM Instances located in the currently selected **Virtual Private Cloud** and **Subnet** can attach the File Storage. Therefore, select the **Virtual Private Cloud** and **Subnet** of the file storage according to the network of the Virtual Machines where you want to attach the file storage.

If there is no existing "Virtual Private Cloud" and “Subnet", you can create VPCs and subnets by using "New VPC" and "New Subnet" on the page.
![fs_creating](../../../../image/Cloud-File-Service/fs_creating.png)


3. After completing the file storage attributes, click “Create” to complete the creation operation. When “File Storage” is created successfully, it will automatically redirect back to the “File Storage” list page.
![fs_created](../../../../image/Cloud-File-Service/fs_created.png)
