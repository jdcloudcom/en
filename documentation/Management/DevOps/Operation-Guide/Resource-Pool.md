# Resource Pool

The machine resources include JD Cloud VM, other third party VM (including physical machine and virtual machine). If your account is related to JD Cloud console account, you can directly check the virtual machines in the console to move them to the DevOps platform by quick import method for deployment.

**Terminology Definition**

Resource Pool

In order to better manage and allocate machines, the concept of resource pool is introduced. The main function of resource pool is to assign machine belonging, i.e., import the machine resource from external (JD Cloud console or manual) to the product line, and then allocate the machines from the product line to the specific application.

**Import machine resource to resource pool**

Menu Bar-->Configuration Management-Resource Pool

![Alt text](https://github.com/jdcloudcom/cn/blob/DevOps/image/DevOps/Operation11.png)

1. JD Cloud Virtual Machine

Two resource pool import methods are provided:

1) Quick import: Select the product line to be imported in the service tree, click **Quick Import** and select the region of Virtual Machine on the Import page. Click **Query**, check the corresponding Virtual Machine, and click **Import** to import the selected Virtual Machine to the standby machine pool of the specified product line in the left service tree.

2) Batch import: Select the product line to be imported in the service tree, fill in the machine information correctly in according to the provided import template, and click **Import** to import the Virtual Machine in the file to the standby machine pool of the specified product line in the left service tree.

2. Miscellaneous

Only batch import is supported.
