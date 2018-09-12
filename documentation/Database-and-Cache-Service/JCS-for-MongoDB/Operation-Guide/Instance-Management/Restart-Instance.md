# Reboot Instance

If your MongoDB instance is running abnormally but can not confirm the cause, you might consider rebooting  the instance.

## Precautions

- Reboot will cause the connection to be interrupted. Please make sure that you have made the business arrangement before proceeding.
- Reboot may result in a master-slave switch, so be sure to connect the MongoDB instance by using the Connection String URI.

## Precondition

- The instance status is Running and the billing status is normal.

## Operation Steps
1.  Login [MongoDB Console](http://mongodb-console.jdcloud.com/mongodb)。
1. On the "Instance List" page, select the target instance, click "Reboot" in the operation items to open the configuration popup.

   ![Reboot Instance](https://github.com/jdcloudcom/cn/blob/master/image/mongodb/mongo-013.png)
   
1. In the confirmation pop-up window, click **OK**.
1. The instance status changes to "Rebooting", then wait for the restart to complete.
2. After the reboot is complete, the instance status will change to "Running".

    Instruction: The instance reboot service will reboot three physical nodes in turn usually within a few minutes.

## Related Reference

- [Create Instance](../../Getting-Started/Create-Instance.md)
- [Alter Configuration](Modify-Instance-Spec.md)
- [Renew Instance](Renewal-Instructions.md)


