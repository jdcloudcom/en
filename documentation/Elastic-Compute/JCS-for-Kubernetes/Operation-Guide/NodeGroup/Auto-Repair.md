# Automatic Repair  

## Function Description
- JD Cloud provides automatic repair function for the JCS for Kubernetes work node group. After the startup, JD Cloud will periodically check the status of the nodes in the work node group, and automatically repair the nodes that have failed the status check multiple times to ensure that the nodes belonging to the work node cluster are always in a healthy ready status.  
- JD Cloud confirms whether the node needs to be automatically repaired according to the status of the working node in the cluster. If the cluster isn’t in the Ready status for several consecutive times within ten minutes, the node will be triggered for automatic repair.

## Notes:

- When the user account is in arrears, no automatic repair will be performed on the work node;
- When Virtual Machines are firstly created by worker node association, no automatic repair will be performed on the node;
- When the worker node is in the error or deleted status, no automatic repair will be performed on the node;
- Automatically repair the work node only when the work node group is in the running status;

## Operation Guide

Firstly, enable the automatic repair when creating a cluster  

1. Open the Console, select **Elastic Compute**>>**JCS for Kubernetes**>>**Cluster Service**>>**Clusters** to enter the Cluster List page, click **Create** to enter the Cluster Creation page;

2. Expand the advanced options in the newly created work node group configuration items to enable the automatic repair switch;

3. Click **OK** to submit the creation task;

4. The automatic repair function of the work node group created by the cluster association will be enabled;

Secondly, enable automatic repair when creating a working node group

1. Open the Console, select **Elastic Compute**>>**JCS for Kubernetes**>>**Cluster Service**>>**Work Node Group** to enter the Work Node Group List page, click **Create** to enter the Work Node Group Creation page;

2. Expand the advanced options to enable the automatic repair switch;

3. Click **OK** to submit the creation task;

4. After the working node group is created successfully, the automatic repair function will be enabled

Thirdly, enable/disable automatic repair on the work node group details page

1. Open the Console, select **Elastic Compute**>>**JCS for Kubernetes**>>**Cluster Service**>>**Work Node Group** to enter the Work Node Group List page, click the name of the work node group to enter the Work Node Group details page;

2. Click the automatic repair switch to enable or disable the automatic repair function of the work node group for a second time;
