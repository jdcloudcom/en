# PostgreSQL Reboot Instance
When connecting count issues or performance issues of instances are found, you can reset such instances manually to solve the problems. However, the connection will be disconnected by resetting instances. Please carry out the operation with caution.

## Note
* Reset can be conducted only when the instance is running.
* Generally, reset will be completed within 8 seconds. If there are a mass of transactions to be submitted and rolled back, the reset will be delayed for 1~2 min.

## Operation Steps
1. Login [Cloud Database RDS console](https://rds-console.jdcloud.com/database).
2. There are two entrances to reset the of instance, including
    * List page: Select the target instance requiring reboot and click **Reboot** in the operations column.
    * Instance details: Select the target instance requiring reset to log in the page instance details, and click [Actions] -》[Reset] on top-right page.
3. The reset confirmation pop-up box is as shown in the figure.
    * Click ***OK*** to complete the instance reset operation.
    * Click ***Cancel*** to call off the instance reset operation.
    
![截图](https://img1.jcloudcs.com/cms/0d8ca556-e783-4fa9-ab72-b30652c0251020180423125543.png)
