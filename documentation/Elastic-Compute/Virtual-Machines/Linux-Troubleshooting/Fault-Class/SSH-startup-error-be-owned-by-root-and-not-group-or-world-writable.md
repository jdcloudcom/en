# SSH Startup Error /var/empty/sshd must be owned by root and not group or world-writable



**Problem Causes:**

It is caused by abnormal permission of /var/empty/sshd directory, the user and group is root account by default.

**Solution:**

Manually modify the directory user and group, and execute

*chown root.root /var/empty/sshd/*

Restart the sshd service and it succeeds. As shown in the figure:

![](https://github.com/jdcloudcom/cn/blob/cn-VirtualMachine-Linux/image/Elastic-Compute/Virtual-Machine/Linux/SSH%E5%90%AF%E5%8A%A8%E6%8A%A5%E9%94%99varemptysshd01.png)

If your problem still can not solved, please submit open ticket to us.
