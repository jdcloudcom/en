# Windows Remote Login without Access
**Problem Phenomenon:**

During Windows remote login, the interface prompts "Users must be granted the access to login the remote computer through terminal services. Members of the "Remote Desktop Users" group have this access by default. If you are not a member of [Remote Desktop Users] group or another group with the access, or if the [Remote Desktop Users] group does not have the access, you shall grant the access manually. "As shown below:

![](https://github.com/jdcloudcom/cn/blob/edit/image/Elastic-Compute/Virtual-Machine/Windows/Windows%E8%BF%9C%E7%A8%8B%E7%99%BB%E5%BD%95%E6%8F%90%E7%A4%BA%E6%B2%A1%E6%9C%89%E7%99%BB%E5%BD%95%E7%9A%84%E6%9D%83%E9%99%9001.png)

**Problem Causes:**

Group policy configuration restricts users or groups that are allowed to login the terminal;

 

**Solution:**

1. Click **Start** -**Run** and enter *gpedit.msc* to open **Local Group Policy Editor**.

![](https://github.com/jdcloudcom/cn/blob/edit/image/Elastic-Compute/Virtual-Machine/Windows/Windows%E8%BF%9C%E7%A8%8B%E7%99%BB%E5%BD%95%E6%8F%90%E7%A4%BA%E6%B2%A1%E6%9C%89%E7%99%BB%E5%BD%95%E7%9A%84%E6%9D%83%E9%99%9002.png)


2. Click **Computer Configuration**-->**Windows Settings** -->**Security Settings**-->**Local Strategy**-->**Users Authorization Assignment** in the **Local Group Policy Editor**.

![](https://github.com/jdcloudcom/cn/blob/edit/image/Elastic-Compute/Virtual-Machine/Windows/Windows%E8%BF%9C%E7%A8%8B%E7%99%BB%E5%BD%95%E6%8F%90%E7%A4%BA%E6%B2%A1%E6%9C%89%E7%99%BB%E5%BD%95%E7%9A%84%E6%9D%83%E9%99%9003.png)

3. Find **Reject to login through remote desktop services** on the right and check whether there is an account that requires to be logged. If any, please delete it.

![](https://github.com/jdcloudcom/cn/blob/edit/image/Elastic-Compute/Virtual-Machine/Windows/Windows%E8%BF%9C%E7%A8%8B%E7%99%BB%E5%BD%95%E6%8F%90%E7%A4%BA%E6%B2%A1%E6%9C%89%E7%99%BB%E5%BD%95%E7%9A%84%E6%9D%83%E9%99%9004.png)


4. Then check **Allow to login through remote desktop service**, and check if there is any user account that requires to be logged, if there is corresponding account, following accounts shall be added.

![](https://github.com/jdcloudcom/cn/blob/edit/image/Elastic-Compute/Virtual-Machine/Windows/Windows%E8%BF%9C%E7%A8%8B%E7%99%BB%E5%BD%95%E6%8F%90%E7%A4%BA%E6%B2%A1%E6%9C%89%E7%99%BB%E5%BD%95%E7%9A%84%E6%9D%83%E9%99%9005.png)

5. Then test and login the VM to see whether it is normal.
