# Set white list
The white list will control which IP addresses can access the DRDS instance. By default, the VPC segment where the instance is located is in the white list list, namely, all IPs in the VPC are accessible.

If the user needs to enable Internet access, the IP address of the Internet that needs to be accessed must be added to the white list. It is suggested to add only the IP addresses that really need to be accessed from the Internet to ensure the data security of the instance. The modified white list will take effect immediately and the instance is not required for restart.

## Note
* By default, the VPC segment where the instance is located is in the white list list.
* The white list is not allowed to be blank, and at least one access rule shall be kept.

## Operation Steps
**1. Select Target Instance**

Enter the Instance List, select the target instance that the white list is required to be set and click the target instance to enter the Instance Details.

**2. Enter White List Setting Page**

Select **[Security Management]**  Tag, click  **[White List Setting]** Tag

**3. Edit White List**

Click **[Edit]** button, and the parameters of the pop-up box are described as follows:
- Two editing methods are supported: ** "Text Edit" ** and ** "Select from Virtual Machines"**
- Text Edit requires you to manually enter an IP address or IP segment, wherein multiple IP addresses and IP segments are separated through the commas and spaces. If 0.0.0.0/0 is filled, it represents that all addresses are allowed for access.
- Selecting the method from Virtual Machines will display all VM Instances that are on the same VPC as the DRDS Instance, it only requires you to simply check the VM that needs to access to the VM Instance, and its Intranet IP address will be automatically added to the white list rule.

![设置白名单1](../../../../../image/DRDS/Set-Whitelist-1.png)

4. Click ***OK*** button, the white list rule will take effect immediately.
