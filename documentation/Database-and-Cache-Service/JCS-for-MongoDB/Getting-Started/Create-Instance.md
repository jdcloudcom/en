# Create Instance

You can quickly create a MongoDB instance via MongoDB console or API. For billing instructions of instance, see "[Price Overview](../Pricing/Billing-Overview.md)" and "[Billing Rules](../Pricing/Billing-Rules.md)".

This article describes how to create a MongoDB instance via console.

## Precondition
- Have a JD Cloud account and have completed the real-name verification. If you do not have an account, please [Register](https://accounts.jdcloud.com/p/regPage?source=jdcloud&ReturnUrl=%2f%2fuc.jdcloud.com%2fpassport%2fcomplete%3freturnUrl%3dhttp%3A%2F%2Fuc.jdcloud.com%2Fredirect%2FloginRouter%3FreturnUrl%3Dhttps%253A%252F%252Fwww.jdcloud.com%252Fhelp%252Fdetail%252F734%252FisCatalog%252F1), or complete [Real-name Verification](https://uc.jdcloud.com/account/certify).
- If the billing type is selected and paid by configuration, please confirm that your account balance (including coupon) is not less than RMB 50.

## Operation Steps
1. Login [MongoDB Console](https://mongodb-console.jdcloud.com/mongodb?dataCenter=bj_02).
2. On the "Instance List" page, click **Create** to enter the "Create Instance" page.

    ![Restart Instance](https://github.com/jdcloudcom/cn/blob/master/image/mongodb/mongo-003.png)
    
3. On the "Create Instance" page, select the billing type and choose: **Monthly Package** or **Pay by Configuration**.

	![Restart Instance](https://github.com/jdcloudcom/cn/blob/master/image/mongodb/mongo-003.png)
	
4. Select an instance configuration

	1. Region
	
       JD Cloud's computer room is distributed in multiple locations around the world. These locations are called geographies. JCS for MongoDB currently supports cn-north-1, cn-east-2, and will support more regions in the future.

	   Instructions:
	   - Cloud service products in the same geographical area are interconnected through intranets, but the intranets of different accounts are completely isolated;
	   - The intranet cannot communicate between cloud service products in different regions;
	   - When purchasing a cloud service, it is recommended to choose the region closest to your customer to reduce the access delay;
	  
	2. Specification configuration
	   - Database Version: Currently available versions are 3.2, 3.4 and 3.6 will be released soon.
	   - Specifications: The CPU and memory occupied by the instance, different specifications correspond to different maximum number of connections and IOPS (that is, the maximum value that can be achieved by reading and writing respectively, and the maximum number of mixed reading and writing can reach 2 times of the index).
	   - Storage Space: The disk space occupied by the instance.
	   
	3. Networking
	
	   MongoDB supports Virtual Private Cloud deployment. If you have not completed your network planning yet, please create a virtual private cloud and subnet first.

	   Instructions:
	   
	   Once the MongoDB instance chooses a Virtual Private Cloud, it cannot be changed. Make sure that your MongoDB instance is on the same Virtual Private Cloud as the Virtual Machines, so that your Virtual Machines cannot connect to the MongoDB instance.
	   
	4. Deployment method
	
	    MongoDB instance supports single and multiple availability zones deployment. Single availability zone deployment means that the three physical nodes of the MongoDB instance are distributed on different physical machines in the same Availability Zone, which can provide disaster tolerance across the racks. Multiple Availability Zone deployment refers to the three physical nodes of the MongoDB instance are distributed on physical machines in different Availability Zones, which can provide disaster tolerance across the machine rooms, but there is some delay in network transmission. You can choose the deployment method based on your business requirements.

	5. Password
	
	   You can reset a password when you create the instance, or you can set the password later and reset password after the MongoDB instance is created.

	6. Purchase Duration
	
	   When selecting monthly package as billing type, the purchase duration shall be specified. JCS for MongoDB supports a choice of 1 month to 3 years. Generally, the longer the purchase duration, the cheaper the unit price, and the specific promotional information can be viewed at the time of the creation of the instance page.
	
5. Click **Buy Now** to go to the "Order Confirmation" page.
6. On the "Order Confirmation" page, confirm the instance information and read the Terms of Service for JCS for MongoDB.
	- If the billing type is pay by configuration, please click **Instant Account Setup**.
	- If the billing type is monthly package, please click ** Pay Now** to enter the "Order Payment" page to complete the payment process.
7. After the payment process is completed, the page will automatically jump to the MongoDB "Instance List" page, please wait for the instance creation to complete. You can view the newly created MongoDB instance on the "Instance List" page.

## Related Reference

- [Set White List](Set-Whitelist.md)
- [Connection Instance](Connect-Instance.md)
- [Change Password](../Operation-Guide/Account-Management/Reset-Password.md)
- [Import Data](Import-Data.md)
- [Alter Configuration](../Operation-Guide/Instance-Management/Modify-Instance-Spec.md)
- [Billing Rules](../Pricing/Billing-Rules.md)
