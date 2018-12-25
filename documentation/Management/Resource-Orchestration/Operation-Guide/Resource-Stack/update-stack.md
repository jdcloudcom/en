# Update Resource Stack

## Preconditions

- During the process of using the resource stack, when the applied architecture or the existing resource stack cannot meet the business requirements, the user can update the current resource stack. 

- The user's resource stack can be updated in the status of “Creation Completed", "Update Completed", and “Rollback Completed".

## Operation Steps

1. Open the console, select **Management-Resource Orchestration-Resource Stack**, select the resource stack to be updated, and click **Update**.

![](https://raw.githubusercontent.com/jdcloudcom/cn/edit/image/Resource-Orchestration/update001.png)

2. You will enter the "Update Resource Stack" page for the resource stack update, the user can update the current template, use the new example template, or use my template; some template contents are modified as shown in the figure below. Directly click **Next** to enter the "Configuration Information” page.
![](https://raw.githubusercontent.com/jdcloudcom/cn/edit/image/Resource-Orchestration/update002.png)
3. Enter the “Configuration Information” page. If you need to modify the relevant parameter information, directly modify the customized parameters. If there is no need, click **Next**, review the modified information as shown in the figure below.

![](https://raw.githubusercontent.com/jdcloudcom/cn/edit/image/Resource-Orchestration/update003.png)
4. Enter the review information page, and click **Update Resource Stack** after confirming that there is no mistake.
![](https://raw.githubusercontent.com/jdcloudcom/cn/edit/image/Resource-Orchestration/update004.png)
5. You will enter the completion page after the resource stack update operation is completed, as shown in the figure below.
![](https://raw.githubusercontent.com/jdcloudcom/cn/edit/image/Resource-Orchestration/update005.png)

- *** Description: The resource stack update takes a short time, and the final update situation can be viewed in the resource stack list.***
- ***      The cloud server userdata does not support updates. When the user modifies the part, the update operation of the resource stack will ignore the modification.***

