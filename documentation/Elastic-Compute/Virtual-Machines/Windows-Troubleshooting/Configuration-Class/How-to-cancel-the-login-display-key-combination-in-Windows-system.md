# How to cancel the display of login key combination in Windows system
**Problem Description:**

When the Windows system server logs in through the console remote connection, a prompt of "Press ctrl+alt+del to log in" will pop up. How to cancel this prompt.

![](https://github.com/jdcloudcom/cn/blob/edit/image/Elastic-Compute/Virtual-Machine/Windows/Windows%E7%B3%BB%E7%BB%9F%E5%A6%82%E4%BD%95%E5%8F%96%E6%B6%88%E7%99%BB%E5%BD%95%E6%98%BE%E7%A4%BA%E7%BB%84%E5%90%88%E9%94%AE01.png)

**Solution:**

Log in the server, click Start - Run, enter gpedit.msc to open the Group Policy Editor. Unfold Computer Configuration - Windows Settings - Security Settings - Local Policies - Security Options in sequence in the left box of the Group Policy Editor, click Security Options and find Interactive Login: Right click it without pressing CTRL+ALT+DEL, select Enabled in the pop-up menu, then close the window, later log in and log out, and the prompt of pressing ctrl+alt+del will not be displayed for the next time login.

![](https://github.com/jdcloudcom/cn/blob/edit/image/Elastic-Compute/Virtual-Machine/Windows/Windows%E7%B3%BB%E7%BB%9F%E5%A6%82%E4%BD%95%E5%8F%96%E6%B6%88%E7%99%BB%E5%BD%95%E6%98%BE%E7%A4%BA%E7%BB%84%E5%90%88%E9%94%AE02.png)
