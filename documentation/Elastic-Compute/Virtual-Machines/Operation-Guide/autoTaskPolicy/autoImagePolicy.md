# Automatic Image Policy (The product is in invite beta)

JD Cloud & AI now supports the use of Automatic Image Policy to set periodic host backup tasks for your Virtual Machine. Automatic Image Policy is an automatic task policy that can periodically back up Virtual Machine data and make image for the user according to the rules specified by the user. You can be free from periodically and manually making images for Virtual Machines if you use this product.
	
	Please note:
	* As the product is currently in the Greyscale invite beta, if you cannot view relevant pages via accessing the Console, it means that you do not have the right to use the product. Please open ticket for application.

## Service restrictions
Automatic Image Policy is only applicable to Virtual Machines of the cloud disk system disk.
The local disk data disks in the Virtual Machine do not support snapshot, and the images generated via Automatic Image Policy does not include the local data disks in the Virtual Machine.
Images generated will occupy your image quota and snapshot quota. Where no quota is available, then no automatic image will be created as well. 

## Operation steps

### Create Automatic Image Policy
1. Access [Automatic Task Policy Console][1] to enter the Automatic Image Policy List page. Or access [JD Cloud & AI Console][2] and click **Elastic Compute**-**Virtual Machine**-**Automatic Task Policy** to enter the Automatic Image Policy List page.

2. Click **Create** to enter the Automatic Image Policy Creation page.

![](../../../../../image/vm/autotaskpolicy1.png)

3. Select a region. Please note that Automatic Image Policy cannot be used across regions. For example, the policy in cn-north-1 cannot be associated with the Virtual Machines in cn-south-1. If the regions selected hit the limitation, you can open ticket to raise your limitation.

4. Fill in the name. The name cannot be empty, supporting Chinese, numbers, capital and lower-case letters, English underline "_" and line-through "-" with no more than 32 characters.

5. Add description. The description cannot be more than 256 characters.

6. Specify a execution start time. The execution start time refers to the time when the policy starts to be executed for the first time in accordance with the current rules. At the earliest, it needs to be 30 minutes after the current time, so you cannot specify any time within 30 minutes after the current time as the start time of the policy.

7. Specify the execution interval. You can select "hour", "day" or "week" as the unit. To avoid the excessive short interval between two tasks for the same policy and therefore resulting in conflicts, the shortest interval is 12 hours. The maximum interval is one year.

8. Select the disks associated with your image, namely, specify the Virtual Machine disks included in your image. Select **All Disks in the Virtual Machine**, and the system will create a Virtual Machine image. The image will not include any local data disk. Select **Specify Disk**. You can check the disk device names to be included in the image, and the system disk (vda) must be specified and cannot be canceled. If the specified disks exceed the disks attached to the Virtual Machine, the created image will not include the excessive part. If the specified disks include local data disks, the created image will not include local data disks.

9. Specify the policy status. The policy includes enabled and disabled status. The enabled policy can trigger the automatic image creation task, and the disabled policy cannot.


10. Policy log. To record the execution of policy, you can enable policy log here and specify the log delivery destination (log set and log theme). Before specifying the delivery destination, please make sure that you have created the related log set and log theme in [Log Service][3], with the "Cloud Product" as the "log source", the "Automatic Task Policy" as the "Cloud Product" and the "Automatic Image Policy Execution Log" as the "Log Type". For detailed operations, please refer to [Cloud Product Log Collection][4]
 

### Modify automatic image policy

1. You can modify the created automatic image policy. Click **Modify Policy** to enter the policy modification page
![](../../../../../image/vm/autotaskpolicy2.png)

2. You can modify the policy rules and information on this page. If you modify the execution start time or execution interval, the next execution time will be changed accordingly. To avoid the excessive short interval between two tasks for the same policy, the interval between one execution time and the next execution time of the policy shall be kept at least at 12 hours.
![](../../../../../image/vm/autotaskpolicy3.png)

### Associate resources

#### Associate Virtual Machine resources with the automatic image policy

1. Click **Associate Resource** at [Automatic Task Policy Console][1], or click the policy name to enter Details and then click **Operations** - **Associate Resource
![](../../../../../image/vm/autotaskpolicy4.png)

2. Check the Virtual Machine to be associated with the policy in the current region, and click **OK** to associate the automatic image policy with the Virtual Machine. The policy cannot be associated with the local disk system disk Virtual Machine. You cannot find your local disk system disk Virtual Machine on the list. Each Virtual Machine can only be associated with one automatic image policy. Operations on the Virtual Machine associated with the policy will disassociate it from the original policy.
![](../../../../../image/vm/autotaskpolicy5.png)

3. If you have a lot of Virtual Machine resources, you can search the Virtual Machine to be associated with the policy on the current page based on Virtual Machine ID or name. The exact search is based on Virtual Machine ID and the fuzzy search is based on the Virtual Machine name.
![](../../../../../image/vm/autotaskpolicy6.png)

#### Associate Virtual Machine resources with the automatic image policy

1. Access [Virtual Machine Console](https://cns-console.jdcloud.com/host/compute/list) and enter the Virtual Machine list page.

2. Select the Virtual Machine to be associated with policy in the list, and determine it as the Cloud disk system disk Virtual Machine. You can operate several Virtual Machines at the same time by multiselection.

3. Operate one Virtual Machine: Click **Operations** - **More** - **Automatic Image**, or click the Virtual Machine name to enter Details and then click **Operations** - **More** - **Automatic Image** to select **Associate Policy** for the Virtual Machine; <br>![](../../../../../image/vm/autotaskpolicy7.png)

<br>Batch operation: Click **More** - **Automatic Image** under the list<br>![](../../../../../image/vm/autotaskpolicy8.png)

### Disassociate associated resources

#### Disassociate Virtual Machine resources from the automatic image policy

1. Click the policy name to enter Details and view the Virtual Machines currently associated with the current resources.
![](../../../../../image/vm/autotaskpolicy9.png)

2. Disassociate one Virtual Machine: Click **Operations** - **Disassociate** at the right of the list of resources. Batch operation: Check the Virtual Machines and click **Disassociate** under the list. If an image is being created for your policy, disassociation will not affect the image creation.

#### Disassociate Virtual Machine resources from the automatic image policy

1. Access [Virtual Machine Console](https://cns-console.jdcloud.com/host/compute/list) and enter the Virtual Machine list page.
2. Click **Operations** - **More** - **Automatic Image**, or click the Virtual Machine name to enter Details and then click *Operations** - **More** - **Automatic Image** to select **Disassociate**.  <br>![](../../../../../image/vm/autotaskpolicy10.png)

### Disabled policy status

Click **Operations** - **More** - **Disable Policy** at [Automatic Task Policy Console][1], or click the policy name to enter Details and then click **Operations** - **More** - **Disable Policy**. The disable policy will not trigger the automatic image creation task.
![](../../../../../image/vm/autotaskpolicy11.png)

### Enabled policy status

Click **Operations** - **More** - **Enable Policy** at [Automatic Task Policy Console][1], or click the policy name to enter Details and then click **Operations** - **More** - **Enable Policy**. The enabled policy will trigger the automatic image creation task at a fixed time based on rules for the policy.
![](../../../../../image/vm/autotaskpolicy12.png)

### Inter-regional Policy Replication
Click **Operations** - **More** - **Inter-regional Policy Replication** at [Automatic Task Policy Console][1], or click the policy name to enter Details and then click **Operations** - **More** - **Inter-regional Policy Replication** to quickly replicate the current policy to other regions. The policy replica name is the same as the source policy by default, and the description will be automatically added to identify the policy source
![](../../../../../image/vm/autotaskpolicy13.png)

### Delete policy
Click **Operations** - **More** - **Delete Policy** at [Automatic Task Policy Console][1], or click the policy name to enter Details and then click **Operations** - **More** - **Delete Policy**. Click **OK** to delete the policy. After that, the Virtual Machine associated with the policy will be automatically disassociated, and the system cannot create an image automatically for the Virtual Machine based on the policy. If an image is being created based on the policy, the deletion will not affect the creation. 




 [1]: http://console.jdcloud.com/host/autoTaskPolicy/list
 [2]: https://console.jdcloud.com/
 [3]: https://logs-console.jdcloud.com/
 [4]: https://docs.jdcloud.com/en/log-service/cloudresource
