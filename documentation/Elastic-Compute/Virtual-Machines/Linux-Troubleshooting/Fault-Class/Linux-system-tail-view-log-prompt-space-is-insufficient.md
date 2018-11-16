# It Prompts Insufficient Space When Linux System Views Log by tail

**Problem Phenomenon:**

When the Linux VM views the log by tail, it prompts insufficient space. The error message is as follows:

![](https://github.com/jdcloudcom/cn/blob/cn-VirtualMachine-Linux/image/Elastic-Compute/Virtual-Machine/Linux/Linux%E7%B3%BB%E7%BB%9Ftail%E6%9F%A5%E7%9C%8B%E6%97%A5%E5%BF%97%E6%8F%90%E7%A4%BA%E7%A9%BA%E9%97%B4%E4%B8%8D%E8%B6%B301.png)

**Problem Causes:**

The tail operation requires system monitoring quota. The number of watch added by the same user exceeds max_user_watches parameter configuration of the kernel, leading to the problem.



**Solution:**

Modify /proc/sys/fs/inotify/max_user_watches to a larger value:

*sudo sysctl fs.inotify.max_user_watches=8192* # Take 8192 as an example, this mode takes effect temporarily

To take effect permanently, you need to modify /etc/sysctl.conf, add max_user_watches=8192, and then take effect by the following command:

*sysctl -p*

If your problem still can not solved, please submit open ticket to us.
