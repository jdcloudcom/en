# Rule Management

The rules refer to the operation and maintenance policies, including IP access policy, command control policy and access period control.

**IP Access Policy**

Operation Steps

1. Login Permission> Account Management page and select **Create Rule**.

  Fill in the rule name and select IP restriction as the type in the rule creation page.
  
   ![](/image/Bastion/ipRule.png) 
  
  Under the IP restriction type, the restriction mode only contains permission of login via the following IP (white list) and the permission of no login via the following IP (black list), with corresponding IP lists provided.
  
  Click **OK** to complete creation of IP access policy rule.

2. Click the rule name in the rule management list to view rule details

3. Click the **Edit** button in the operation bar in the rule management list, with rules editable
  
4. In the rule management list, click the **Delete** button in the operation bar to delete the rule


**Command Control Policy**

Operation Steps

1. Login Permission> Account Management page and select **Create Rule**.

  Fill in the specification name and select command control as the rule type in the rule creation page.
  
   ![](/image/Bastion/ipRule.png) 
     
  The following commands (black list) cannot be executed under the command restriction mode. Corresponding restriction command contents will be provided, with one command per line.
  
  Click **OK** to finish creation of command control rule.
  
  
2. Click the rule name in the rule management list to view rule details

3. Click the **Edit** button in the operation bar in the rule management list, with rules editable
  
4. In the rule management list, click the **Delete** button in the operation bar to delete the rule



**Access Period Control**

Operation Steps

1. Login Permission> Account Management page and select **Create Rule**.

  Fill in the specification name and select period restriction as the rule type in the rule creation page.
    
   ![](/image/Bastion/timeRule.png) 
  
  The blue-background box refers to the allowable login period, while the gray-background box refers to the prohibitive login period.
  
  Select periods in batches, click **OK** to finish creation of access period control rules.
  
2. Click the rule name in the rule management list to view rule details

3. Click the **Edit** button in the operation bar in the rule management list, with rules editable
  
4. In the rule management list, click the **Delete** button in the operation bar to delete the rule
