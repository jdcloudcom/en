# Create operation and maintenance rules and apply authorization

Before applying machine operation and maintenance with the Bastion, the administrator needs to create the operation and maintenance rules and authorize a specific user to apply operation and maintenance to specified assets. The document provides guide on how to create operation and maintenance rules and complete permission assignment by the administrator.


## Create Rules

1. Log in a Bastion instance

2. Go to the Permission > Rule Management page and click **Create Operation and Maintenance Rule

3. Fill in the rule name, select the rule type and complete creation in the rule creation page

![](/image/Bastion/rule1.png) 

![](/image/Bastion/rule2.png) 

Types include: IP restriction, command restriction and period restriction

IP restriction refers to restrict allowed/rejected access source IP lists.

Command restriction refers to restrict visitors from using the commands.

Period restriction refers to restrict access periods, etc.


## Authorization

1. After rules are created, please go to the Permission > Authorization Management page and click **Add Authorization

2. In the Authorization Management, the administrator can match rules to specified machine/machine group or authorize them to a user/user group or authorize specified resource account to a user

![](/image/Bastion/rule3.png) 
