# Permission Management

The permission management contact rules, users and machine assets together so as to achieve the goal that one user can access the target machine within his/her permissions.

The authorized scenario for permission management includes:

- Add operation and maintenance rules to machines/machine groups
- Authorize machine/machine group operation and maintenance permissions to users/user groups
- Add resource account, etc. to machine/machine group


**Create Authorization**

Taking "add operation and maintenance rules to machines/machine groups" for example

Operation Steps

1. Access Permission > Authorization Management page and select **Create Authorization

 ![](/image/Bastion/hostRule.png) 

  In the authorization creation page, fill in authorization name, select one or more machines/machine groups associated, select association rules and click **OK** to finish authorization operation.
  
  You can view all operation and maintenance rules in the Permission > Rule Management page.
  
2. After successful authorization, the selected rules will take effect for the target machine.



Taking "authorize machine/machine group operation and maintenance permissions to users/user groups" for example 
  
Operation Steps

1. Access Permission > Authorization Management page and select **Create Authorization

 ![](/image/Bastion/userRole.png) 

  In the authorization creation page, fill in the authorization name, selected one or more machines/machine groups associated, selected one or more users/user groups, select an asset account and click **OK** to finish authorization.

2. After successful authorization, the system will automatically push the resource account to the target machine and complete machine authorization for the selected user


**Disable permission**

After the permission is disabled, corresponding rules will become invalid until it is reset as enabled by the administrator.

Operation Steps

1. Login Permission > Permission Management page

2. Click **Disable** in the permission management list


**Enable permission**

Operation Steps

1. Login Permission > Permission Management page

2. Click **Enable** in the permission management list


**Edit permissions**

Operation Steps

1. Login Permission > Permission Management page

2. Click **Edit** in the permission management list and reedit permission

