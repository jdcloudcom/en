# Import JD Cloud Virtual Machine

The machine resources include JD Cloud VM, other third party VM (including physical machine and virtual machine).

Let’s take JD Cloud VM as an example.

**Operation Steps**

1. Select application nodes from the Service Tree on the left side.

2. Log in the “JD Cloud Machine” page from Menu-->Configuration Management-->Resource Pool.

Because your account is related to JD Cloud console account, you can directly check the virtual machines in the console to move them to the DevOps platform by quick import method.

![Alt text](https://github.com/jdcloudcom/cn/blob/DevOps/image/DevOps/Starting5.png)

Click **Quick Import**, select the region of the Virtual Machine in the import page and click **Query** to list all virtual machines of the region. Please make the selection in accordance with your real conditions. Once the button **Import** is clicked, the selected Machine will be automatically associated to the specified product line of the Service Tree on the left side. Please Find the Virtual Machines from the standby machine pool of specified product line in the Service Tree.

3. Associate the Virtual Machine in the standby machine pool of the product line with the application code of the service tree. Log in the Service Tree Editing page from Menu-->Configuration Management-->Service Tree. The specified application can be selected from the left side, while the “Instance Edition” page can be entered from the right side.

![Alt text](https://github.com/jdcloudcom/cn/blob/DevOps/image/DevOps/Starting6.png)

Click **Add Instance**, select **Group** - **group-pre-template-tenant name**, click **Select Server**, and check the Virtual Machine in the server page. By doing so, the Virtual Machine is added in the group.

![Alt text](https://github.com/jdcloudcom/cn/blob/DevOps/image/DevOps/Starting7.png)
