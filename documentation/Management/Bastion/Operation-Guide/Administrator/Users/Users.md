# User Management


User Management supports multiple user maintenance and configuration operation, including: create/delete user, import user, enable/disable user, edit basic information and role of user, search user, etc.


**Create users**

Users refer to the natural persons allowed to login the Bastion. The Bastion user types fall into the local user and the IAM sub-account user.

User creation methods include: Create by hand, import IAM sub-account and import from local files.

![](/image/Bastion/user.png) 


- Create by hand: Click **Create User** to enter the creation page, fill in user information according to the page requirements and then click **Create User**.
- Import IAM Sub-account: Click **Import IAM Sub-account** and select a sub-account to be imported in the popup.
- Import from local file: Click **Import from Local File** to import users in batches.

Operation Steps

1. Login User> User Management page and select **Create User** to create the user by hand.

  Enter user name, password and name and select a role in the user creation page and supplement contact information as required.
  
  
   The roles include the operation and maintenance personnel and the administrator
   
   - Operation and maintenance personnel: Only can login the machine with permission
   
   - Administrator: Can add users, assets, etc. and can manage the Bastion
 
   
  ![](/image/Bastion/addUser.png) 
  
 
  
2. Import users and select **Import from Local File** to create users in batches.

  1) In the Import from Local File page, click **Template Download**.
  
  2) Fill in the template. The user name and password fields are required. The password must contain 8-30 characters and must contain uppercase and lowercase letters, numbers and special characters in such a way that two letters and numbers cannot be placed together or the same letters and numbers cannot be repeated
      The roles include the administrator and the operation and maintenance personnel;
      
  ![](/image/Bastion/moduleUser.png) 
  
  3) Click **Upload File** after completing the template.
  
**Disable user**

If being disabled, the user cannot login the Bastion until he/she is reset as enabled by the administrator.

Operation Steps

1. Login User > User Management page.

2. Click **Disable** in the user list

  ![](/image/Bastion/userStop.png) 

**Enable user**

Operation Steps

1. Login User > User Management page.

2. Click **Enable** in the user list

  ![](/image/Bastion/userStart.png) 


**Delete the user**

Operation Steps

1. Login User > User Management page.

2. Check the user to be deleted from the user list and click **Delete**.

**Edit user**

Operation Steps

1. Login User > User Management page.

2. Click **Edit** in the user list. Modification to basic information is supported.



