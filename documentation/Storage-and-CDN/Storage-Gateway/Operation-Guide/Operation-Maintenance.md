# Operation and Maintenance Guide

1. When the Storage Gateway is running normally and I need to modify the configuration information such as the secret key or Bucket, how do I operate?

The Storage Gateway configuration file path is `/etc/gateway/gw.conf`, and the related configuration items are accessKeyID, accessKeySecret, endpoint, and bucket. It can also be reconfigured by executing `gw install`. After executing `gw restart` and reboot the NFS service, the new configuration items will take effect.

2. After the Storage Gateway is rebooted, what should I do when I use the NFS Client to access the file and it reports the error `Stale file handle`?

After the client end mounts the shared file system of the Storage Gateway, if the Storage Gateway reboots the NFS service, the error of `Stale file handle` will appear on the client end. If you encounter this situation, you need to execute the umount operation and then execute the mount operation again. Then you can access the shared file normally. Because NFS V4 is stateful, when the NFS server is rebooted, the ROOTFD of the previous Client PUT fails, resulting in the error `Stale file handle`.

3. When the NFS Client executes umount, how should I operate when there is a `device is busy` notification?

When there is a `device is busy` notification, it indicates that the mount point is used by the process. You can execute `umount -l /mountpoint` and the system will umount after the directory is free. If you need umount immediately, you can execute `fuser -m -v -k -i /mountpoint` to kill the used process. Each kill process needs to be confirmed to prevent the mistaken kill process.

4. After the Storage Gateway stops the NFS service, the related NFS Client operations using the Hard mode will be hanged and you cannot force to umount. How should I operate in this scenario?

When mounting in Hard mode, when the Client fails to call the NFS service, it will retry repeatedly and the call cannot be interrupted. When this happens, it is recommended to start the original NFS service and then execute umount. If you no longer use NFS Server, you still need to force umount. Execute `fuser -m -v -k -i /mountpoint`to kill the related NFS process. If the used NFS process cannot be killed, reboot the NFS Client.

5. After the NFS server is disabled, the Client call is hanged and cannot be interrupted. How to avoid this problem?

When the client executes mount, it is Hard mode by default. When the client fails to load NFS, it will retry repeatedly until the NFS server responds. To avoid this situation, it is recommended to specify the intr parameter when mounting, that is, the RPC call can be interrupted. Or specify Soft mode to mount, and set retry (retry times), timeo (time-out period); after retrying over the specified number of times, NFS Client will throw `IO Error` instead of keeping retrying.

6. The Storage Gateway uses Cloud Disk as the cache space. When the cache is full, S3fs will automatically clear the cache. During the automatic cache cleanup process, the write speed will be slowed down; what should I do if I want to manually clean it?

The cache directory of the Storage Gateway is /cache, which caches the data you have recently accessed, which can be manually cleaned up. You can also execute a timed script task to clean up the cache.

7. What should I do if I need to view the Storage Gateway NFS service log?

The NFS-Ganesha log storage path is `/var/log/ganesha.log`. The default log output level is INFO. To modify the log level, edit the `/etc/ganesha/ganesha.conf` configuration file.

8. The Storage Gateway provides NFS service in a single machine. It does not provide high availability. If the Storage Gateway has system breakdown due to exception, reboot the machine and start the NFS service.

9. The current CentOS 7.1/7.2 system does not support the use of mounted Storage Gateway. If you need to use it, please refer to the following operations to manually upgrade the system kernel:

Download the kernel-3.10.0-514.26.2.el7.x86_64 kernel:

```
wget https://buildlogs.centos.org/c7.1611.u/kernel/20170704132018/3.10.0-514.26.2.el7.x86_64/kernel-3.10.0-514.26.2.el7.x86_64.rpm
```

Installation:

```
yum install kernel-3.10.0-514.26.2.el7.x86_64.rpm
```

Set the newly installed kernel to the system default TTY:

```
grub2-set-default 0
```

Reboot the system after the setup is complete:

```
reboot
```

After the reboot is complete, enter the following name to view if the current system kernel is the most recently installed version:

```
uname -r
```
10. Compared with the earlier version, Storage Gateway 1_0_4 image restores the following two vulnerabilities:
- [Intel Processor Meltdown and Spectre Security Vulnerability](https://docs.jdcloud.com/en/security-instruction/intel-meltdown-spectre-solution)
- [NTP Service and Monlist Vulnerability](https://docs.jdcloud.com/en/security-instruction/ntp-monlist-vulnerability)

If you use an image of the early version (e.g.: Storage Gateway1_0_0), please upgrade to Storage Gateway 1_0_4 version as quickly as possible.

If it is inconvenient to conduct upgrading due to business, please refer to the above-mentioned vulnerability solution to conduct repair on the original system.
