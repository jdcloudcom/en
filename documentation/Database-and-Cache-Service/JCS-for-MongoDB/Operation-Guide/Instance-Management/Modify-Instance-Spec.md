# Alter Configuration

If the current MongoDB instance configuration does not match your business application requirements, you can modify the instance configuration to meet your business requirements.
MongoDB instances support configuration items for changes, including:

- Specifications, i.e. the number of CPU cores and memory capacity that the instance is assigned.
- Storage space, the amount of disk the instance is allocated.

## Precautions

- The instance with billing type pay by configuration supports upgrade or downgrade, but please be careful to perform degradation of storage space. Otherwise, the mismatch may fail or the instance may be locked due to insufficient storage space.
- The instance with billing type under monthly package only supports upgrading instead of downgrading.
- There may be a flashover or master-slave switchover during the alteration process. Make sure that the application connects to the MongoDB service by using the Connection String URI.

## Precondition

- For the instance which is running and under normal billing situation, the alteration of configuration is allowable.
	
## Operation Steps

1. Log into [MongoDB Console](https://mongodb-console.jdcloud.com/mongodb?dataCenter=bj_02).
1. On the "Instance List" page, select the target instance, click **Alter Configuration** in the operation items to open the alter configuration popup.
   
   ![](https://github.com/jdcloudcom/cn/blob/master/image/mongodb/mongo-011.png)

1. In the popup window, select the new configuration you want to alter.

   ![](https://github.com/jdcloudcom/cn/blob/master/image/mongodb/mongo-012.png)
	
	- Specifications
		- CPU and memory occupied by the instance.
		- Different specifications correspond to different maximum number of connections and IOPS (that is, the maximum value that can be achieved by reading and writing respectively, and the maximum number of mixed reading and writing can reach 2 times of the index).
	
	- Storage Space: The disk space occupied by the instance.
		
	- Networking: The current instance is under VPC and subnet and cannot be altered.
	- Billing type: The billing type of the current instance, which cannot be modified.
	- Cost
		- For the instance with billing type pay by configuration, the fees are the hourly fee for the new configured instance.
		- For the instance with billing type under monthly package, the expense is the price difference of new and old configurations within the valid period of instance.
		
1. After selecting the configuration, click **OK** to enter the "Order Confirmation" page.
1. On the "Order Confirmation" page, confirm the instance information and read the Terms of Service for JCS for MongoDB.
	- For the billing type pay by configuration, please click **Instant Account Setup**.
	- For the billing type under monthly package, please click, please click **Pay Now** to enter the "Order Payment" page to complete the payment process.

1. After the payment process is completed, the page will automatically jump to the MongoDB "Instance List" page, please wait for the instance alteration to complete. You can view the newly altered instance on the "Instance Details" page.  


## Related Reference

- [Create Instance](../../Getting-Started/Create-Instance.md)
- [Connect Instance](../../Getting-Started/Connect-Instance.md)
- [Renew Instance](Renewal-Instructions.md)
- [Reboot Instance](Restart-Instance.md)
- [Delete Instance](Delete-Instance.md)
