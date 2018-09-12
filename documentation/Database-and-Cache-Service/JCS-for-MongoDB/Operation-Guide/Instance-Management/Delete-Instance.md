# Delete Instance

If you no longer need to use a MongoDB instance, you can delete it.

## Precautions
- The billing type is an instance pay by configuration and you can delete it at any time.
- The billing type is an instance under monthly package, and the unexpired deletion is not supported at this time.
- After the instance is deleted, it cannot be recovered. Please be cautious.
- After the instance is deleted, the backup data of the instance will be deleted and cannot be recovered. If you need to save backup data, please download the backup data in advance and save it locally. For downloading methods, please see: [Download Backup]().

## Operation Steps
1. Log into [MongoDB Console](https://mongodb-console.jdcloud.com/mongodb?dataCenter=bj_02).
2. On the Instance List page, select the target instance. In the operation items, click **Delete** to open the confirmation popup.
 
   ![Delete Instance](https://github.com/jdcloudcom/cn/blob/master/image/mongodb/mongo-014.png)

3. In the confirmation pop-up window, click **OK** and wait for the instance deletion to complete.
4. After the instance is deleted, there will be no more information for the instance in the "Instance List".

## Related Reference

- [Create Instance](../../Getting-Started/Create-Instance.md)
- [Alter Configuration](Modify-Instance-Spec.md)
- [Renew Instance](Renewal-Instructions.md)
- [Reboot Instance](Restart-Instance.md)
- [Delete Instance](Delete-Instance.md)


