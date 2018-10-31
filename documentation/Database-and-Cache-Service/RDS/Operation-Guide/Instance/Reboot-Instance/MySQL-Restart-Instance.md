# Reboot JCS for MySQL Instance
When there are problems found in connections or performance in the instance, you can manually reboot the instance to try to solve the problem. In addition, please be cautious, since the instance rebooting will cause the connection interrupted.

## Precautions
* The instance can be rebooted only when the instance is running.
* When an instance is rebooted, all read-only instances under the current instance are not rebooted.
* Reboots are usually completed in 8 seconds. If there are a large number of transactions to be submitted or rolled back, it may be extended by 1 ~ 2 minutes.

## Operation Steps
1. Login [RDS Console](https://rds-console.jdcloud.com/database).
2. There are two entries for rebooting instances as follows:
    * List Page: Select the instance to be rebooted, and click ***More -> Reboot*** in ***Operation***.
    * Instance Detailed Page: Select the instance to be rebooted, enter the instance detailed page, click ***Operation - > Reboot*** in the upper right corner of the page.
3. Popup box for the reboot confirmation is shown in the figure.
    * Click ***OK*** to reboot the instance.
    * Click ***Cancel*** to cancel the instance rebooting.
    
![Screenshot](https://img1.jcloudcs.com/cms/0d8ca556-e783-4fa9-ab72-b30652c0251020180423125543.png)
