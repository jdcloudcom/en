# Reboot Read-only Instance
When problems are found in connection or performance of the MySQL/Percona/MariaDB service read-only instance, the read-only instance can be manually rebooted to solve the problem.

## Precautions
* The instance can be rebooted only when the read-only instance is **running**.
* Please be cautious, since the read-only instance rebooting will cause the connection interrupted.

## Operation Steps
1. Login [RDS Console](https://rds-console.jdcloud.com/database).
2. Select the read-only instance to be rebooted, click the name of the target instance, and enter the instance detailed page.
3. Select the tag of ***Read-only Instance Management***, open the read-only instance management page, select the read-only instance to be rebooted and click ***Reboot*** in ***Operation*** column to reboot the read-only instance.
4. Popup box for the reboot confirmation is shown in the figure.
    * Click ***OK*** to reboot the read-only instance.
    * Click ***Cancel*** to cancel the read-only instance rebooting.

![image2018-5-31 19_5_23.png](https://img1.jcloudcs.com/cms/e15dfed8-47a9-4ec8-b131-fd8a329e253720180531190633.png)

