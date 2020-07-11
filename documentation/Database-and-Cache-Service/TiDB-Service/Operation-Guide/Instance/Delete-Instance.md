# Delete Instance
Depending on your business changes, you can manually delete the instance whose billing type is pay by configuration.

## Precautions
- The operation of deleting can only be performed when the instance status is "running".
- If any instance is deleted, backup under such instance will be synchronously deleted.

## Operation Steps
1. Log in to the distributed database TiDB management console.
2. There are two ingresses for deleting the instance, which are:
	- List: Select the target instance required to be deleted and click **Operate** - **Delete**.
	- Instance Detail page: Select the **target instance required to be deleted**, go to the Instant Detail page and click **Operate** -> **Delete** at the upper right corner of the page.
3. Pop-up Box for Delete Confirmation. For avoidance of deletion by mistake, please enter again ID of the instance to be deleted

![删除实例1](../../../../../image/TiDB/Delete-Instance-1.png)

