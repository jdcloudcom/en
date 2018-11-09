# Delete File in Linux and Prompt Operation not permitted

**Problem Phenomenon:**

If the user deletes or moves the file in the Virtual Machines, it will prompt "Operation not permitted" error, and the operation will be unsuccessful, as shown in the following figure;

![](https://github.com/jdcloudcom/cn/blob/cn-VirtualMachine-Linux/image/Elastic-Compute/Virtual-Machine/Linux/Linux%E5%88%A0%E9%99%A4%E6%96%87%E4%BB%B6%E6%8F%90%E7%A4%BAOperation%20not%20permitted01.png)


**Problem Causes:**

The related file was added with the i protection attribute causing the operation to fail.


**Solution:**

Use the *lsattr* command to view the file attribute. You can see that the file has been added with the i attribute; this attribute indicates that the file cannot be modified or deleted.

![](https://github.com/jdcloudcom/cn/blob/cn-VirtualMachine-Linux/image/Elastic-Compute/Virtual-Machine/Linux/Linux%E5%88%A0%E9%99%A4%E6%96%87%E4%BB%B6%E6%8F%90%E7%A4%BAOperation%20not%20permitted02.png)


Use the *chattr* command to delete the i attribute;

![](https://github.com/jdcloudcom/cn/blob/cn-VirtualMachine-Linux/image/Elastic-Compute/Virtual-Machine/Linux/Linux%E5%88%A0%E9%99%A4%E6%96%87%E4%BB%B6%E6%8F%90%E7%A4%BAOperation%20not%20permitted03.png)

After deleting the i attribute, it will be normal when you operate this file again;
