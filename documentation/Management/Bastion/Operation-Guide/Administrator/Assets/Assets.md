# Machine Management


Machine management is used for adding, importing and editing machine functions.


**Create Machine**

The administrator can create machines in the Asset > Machine Management page via creation methods such as create by hand, import JD Cloud Virtual Machines and import from local files.

![](/image/Bastion/hostList.png) 


- Create by hand: Click **Create Machine** to enter the creation page, fill in machine information according to the page requirements and then click **Create Machine**.
- Import JD Cloud Virtual Machines: Click ***Import JD Cloud Virtual Machines* and select the Virtual Machines to be imported from the popup.
- Import from local file: Click **Import from Local File** to import resources in batches.


Operation Steps

1. Login Asset > Machine Management page and select **Add Machine** to add machines by hand.

   ![](/image/Bastion/addHost.png) 
   
   Enter machine name, IP address, operating system and port protocol, select an account and click **Create User** in the machine creation page.
 

2. Login Asset > Machine Management page and select **Import JD Cloud Virtual Machines** to import machines in batches.
    
  1) Check VM instances to be imported to the Bastion on the JD Cloud Virtual Machines page and click **Import**.
  
  ![](/image/Bastion/import-ecs1.png) 
  
  2) After successful import, click the **Edit** button in the machine list and add a machine account.
  
  ![](/image/Bastion/import-ecs2.png) 
  
 
3. Login Asset > Machine Management page and select **Import from Local File** to create resources in batches.

  1) In the Import from Local File page, click **Template Download**.
  
  2) Fill in a template and import the following information required
    
  ![](/image/Bastion/modelHost.png) 
  
  3) Click **Upload File** after completing the template.
  
**Test Connectivity**  
  
1. After successful import, check in the list if connectivity is normal

2. For cursor connectivity status, please view details or retest the connectivity

 ![](/image/Bastion/test.png) 

3. Click **Login** in the list and try to log in the machine

 ![](/image/Bastion/onBoard.png) 
 
 
**Edit Machine**

Operation Steps

1. Login Asset > Machine Management page.

2. Click **Edit** in the machine list. Addition of machine account and modification to protocol and port are supported.

  ![](/image/Bastion/editHost.png) 
  

**Disable Machine**

If being disabled, the machine cannot be logged in via the Bastion until it is reset as enabled by the administrator.

Operation Steps

1. Login Asset > Machine Management page

2. Click **More** in the Operation bar of the machine list and select **Disable

  ![](/image/Bastion/stopHost.png) 

**Enable Machine**

Operation Steps

1. Login Asset > Machine Management page

2. Click **More** in the Operation bar of the machine list and select **Enable

  ![](/image/Bastion/startHost.png) 

**Delete Machine**

Operation Steps

1. Login Asset > Machine Management page.

2. Check the machine to be deleted from the machine list and delete the machine from the Bastion system.



