# Automatic Image Policy

JD Cloud & AI now supports the use of Automatic Image Policy to set periodic host backup tasks for your Virtual Machine. Automatic Image Policy is an automatic task policy that can periodically back up Virtual Machine data and make image for the user according to the rules specified by the user. You can be free from periodically and manually making images for Virtual Machines if you use this product.
	
	Please note:
	* At most 20 automatic image policies are allowed to be created for a single region. For additional demands, please make an application via a ticket

## Fast Navigation

* [Use Restrictions](autoImagePolicy#user-content-1)
* [Create Automatic Image Policy](autoImagePolicy#user-content-2)
* [Modify Automatic Image Policy](autoImagePolicy#user-content-3)
* [Associate with Resource](autoImagePolicy#user-content-4)
* [Disassociate with Resources](autoImagePolicy#user-content-5)
* [Disable Policy](autoImagePolicy#user-content-6)
* [Enable Policy](autoImagePolicy#user-content-7)
* [Cross-region Policy Replication](autoImagePolicy#user-content-8)
* [Delete Policy](autoImagePolicy#user-content-9)

## Service restrictions
<div id="user-content-1"></div>

Automatic Image Policy is only applicable to Virtual Machines of the cloud disk system disk.
The local disk data disks in the Virtual Machine do not support snapshot, and the images generated via Automatic Image Policy does not include the local data disks in the Virtual Machine.
Images generated will occupy your image quota and snapshot quota. Where no quota is available, then no automatic image will be created as well. 

## Operation steps

### Create Automatic Image Policy
<div id="user-content-2"></div>

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
After specifying a delivery, you can find the related policy execution log in the log theme under the specified log set. If you delete the log theme or log set specified for the current policy, the current policy log function will be disabled automatically.
 

### Modify automatic image policy
<div id="user-content-3"></div>

1. You can modify the created automatic image policy. Click **Modify Policy** to enter the policy modification page
![](../../../../../image/vm/autotaskpolicy2.png)

2. You can modify the policy rules and information on this page. If you modify the execution start time, the next execution time will be changed accordingly. The execution start time shall be 30 minutes later. If you modify the execution interval, the modification will not affect the next execution time. After the next execution, the new execution interval will take effect. To avoid the excessive short interval between two tasks for the same policy, the interval between one execution time and the next execution time of the policy shall be kept at least at 12 hours.
![](../../../../../image/vm/autotaskpolicy3.png)

### Associate resources
<div id="user-content-4"></div>

#### Associate Virtual Machine resources with the automatic image policy

1. Click **Associate Resource** at [Automatic Task Policy Console][1], or click the policy name to enter Details and then click **Operations** - **Associate Resource
![](../../../../../image/vm/autotaskpolicy4.png)

2. Check the Virtual Machine to be associated with the policy in the current region, and click **OK** to associate the automatic image policy with the Virtual Machine. The policy cannot be associated with the local disk system disk Virtual Machine. You cannot find your local disk system disk Virtual Machine on the list. Each Virtual Machine can only be associated with one automatic image policy. Operations on the Virtual Machine associated with the policy will disassociate it from the original policy.
![](../../../../../image/vm/autotaskpolicy5.png)

3. If you have a lot of Virtual Machine resources, you can search the Virtual Machine to be associated with the policy on the current page based on Virtual Machine ID or name. The exact search is based on Virtual Machine ID and the fuzzy search is based on the Virtual Machine name.
![](../../../../../image/vm/autotaskpolicy6.png)

#### Associate Virtual Machine resources with the automatic image policy

##### Specify an automatic image policy when creating

1. Visit [Virtual Machine Console](https://cns-console.jdcloud.com/host/compute/list), and click **Create** to enter the Virtual Machine creation page.

2. In the advanced option module, turn on the backend switch of automatic image policy and specify an automatic image policy for the Virtual Machine. <br>![](../../../../../image/vm/autotaskpolicy14.png)

3. Please check in the Details whether the Virtual Machine is successfully associated with the specified policy after it is created. 。<br>![](../../../../../image/vm/autotaskpolicy15.png)


	
##### Associate with automatic image policy after creation

1. Access [Virtual Machine Console](https://cns-console.jdcloud.com/host/compute/list) and enter the Virtual Machine list page.

2. Select the Virtual Machine to be associated with policy in the list, and determine it as the Cloud disk system disk Virtual Machine. You can operate several Virtual Machines at the same time by multiselection.

3. Operate one Virtual Machine: Click **Operations** - **More** - **Automatic Image**, or click the Virtual Machine name to enter Details and then click **Operations** - **More** - **Automatic Image** to select **Associate Policy** for the Virtual Machine.
<br>![](../../../../../image/vm/autotaskpolicy7.png)

<br>Batch operation: Click **More** - **Automatic Image** under the list
<br>![](../../../../../image/vm/autotaskpolicy8.png)

### Disassociate associated resources
<div id="user-content-5"></div>

#### Disassociate Virtual Machine resources from the automatic image policy

1. Click the policy name to enter Details and view the Virtual Machines currently associated with the current resources.
![](../../../../../image/vm/autotaskpolicy9.png)

2. Disassociate one Virtual Machine: Click **Operations** - **Disassociate** at the right of the list of resources. Batch operation: Check the Virtual Machines and click **Disassociate** under the list. If an image is being created for your policy, disassociation will not affect the image creation.

#### Disassociate Virtual Machine resources from the automatic image policy

1. Access [Virtual Machine Console](https://cns-console.jdcloud.com/host/compute/list) and enter the Virtual Machine list page.
2. Click **Operations** - **More** - **Automatic Image**, or click the Virtual Machine name to enter Details and then click *Operations** - **More** - **Automatic Image** to select **Disassociate**. If your policy is creating image, the disassociation will not affect the image creation result.
<br>![](../../../../../image/vm/autotaskpolicy10.png)

### Disabled policy status
<div id="user-content-6"></div>

Click **Operations** - **More** - **Disable Policy** at [Automatic Task Policy Console][1], or click the policy name to enter Details and then click **Operations** - **More** - **Disable Policy**. The disable policy will not trigger the automatic image creation task.
![](../../../../../image/vm/autotaskpolicy11.png)

### Enabled policy status
<div id="user-content-7"></div>

Click **Operations** - **More** - **Enable Policy** at [Automatic Task Policy Console][1], or click the policy name to enter Details and then click **Operations** - **More** - **Enable Policy**. The enabled policy will trigger the automatic image creation task at a fixed time based on rules for the policy.
![](../../../../../image/vm/autotaskpolicy12.png)

### Inter-regional Policy Replication
<div id="user-content-8"></div>

Click **Operations** - **More** - **Inter-regional Policy Replication** at [Automatic Task Policy Console][1], or click the policy name to enter Details and then click **Operations** - **More** - **Inter-regional Policy Replication** to quickly replicate the current policy to other regions. The policy replica name is the same as the source policy by default, and the description will be automatically added to identify the policy source
![](../../../../../image/vm/autotaskpolicy13.png)

### Delete policy
<div id="user-content-9"></div>

Click **Operations** - **More** - **Delete Policy** at [Automatic Task Policy Console][1], or click the policy name to enter Details and then click **Operations** - **More** - **Delete Policy**. Click **OK** to delete the policy. After that, the Virtual Machine associated with the policy will be automatically disassociated, and the system cannot create an image automatically for the Virtual Machine based on the policy. If an image is being created based on the policy, the deletion will not affect the creation. 




 [1]: http://console.jdcloud.com/host/autoTaskPolicy/list
 [2]: https://console.jdcloud.com/
 [3]: https://logs-console.jdcloud.com/
 [4]: https://docs.jdcloud.com/en/log-service/cloudresource
