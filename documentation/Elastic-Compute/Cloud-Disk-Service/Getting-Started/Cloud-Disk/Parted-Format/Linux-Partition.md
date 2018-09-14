# Linux partitioning, formatting and creating file system

<br>

##  Use script to complete partitioning, formatting and attaching of data disk
<br>

In Linux system, you can use the script provided by JD Cloud to detect whether there is any data disk that has not yet been partitioned and then to automatically format and attach the data disk so as to spare you of entering complex commands and going through procedures.

<p>
<img src="http://cms.jcloud.com/ueditor/dialogs/attachment/fileTypeImages/icon_rar.gif"/><a title="attach script.zip" href="http://img1.jcloudcs.com/cms/6bbc4a45-02ce-460d-9696-c31f3fa18c6f20170728174252.zip" target="_self"><span style="color: rgb(0, 0, 0); font-family: Microsoft YaHei, &quot;Microsoft YaHei&quot;; font-size: 14px;">attach script.zip</span></a>
</p>
<br>
You can use this script in the following two manners:

1. Without any parameter: this script will automatically partition, format and attach (default attach points include jddata1, jddata2……jddatan) all of your non-partitioned devices and realize automatic attach of cloud disk by UUID in /etc/fstab file

</p>
<pre class="brush:as3;toolbar:false;">sh
sh auto_fdisk.sh</pre>
<p>

2. With device name (e.g. /dev/vdc, etc.), attach point, file system parameters: this script will automatically complete the partitioning, formatting and attachment actions according to your entering parameters.

</p>
<pre class="brush:as3;toolbar:false;">sh
sh auto_fdisk.sh /dev/vdb jddata1 ext4</pre>
<p>

**Note:**

1. Because related actions may lead to loss of data, before executing the actions, please ensure a valid backup of data has been done by snapshot and other means or that there is no impact of loss of relevant data;

2. This script is only applicable to non-partitioned and unattached cloud disk and will not take effect to hard disk partitioned or attached;

3. This script will create one partition for the hard disk by default and it is non-modifiable;

4. This script will write the disk UUID and attach information to /etc/fstab file in order to realize automatic attach of cloud disk. If you need to detach cloud disk, please delete corresponding /etc/fstab information, or it may result in failure to normal start by virtual machine.
Manually complete partitioning, formatting and attaching of data disk

## Manually complete partitioning, formatting and attaching of data disk

If you need to manually partition, format and create file system, we take Centos operating system for example as an instruction as below:

1. After attaching on the console, you can see a non-partitioned, formatted disk in VM. You can view the disk partition information by the following command:

```
fdisk -l
```

![](https://github.com/jdcloudcom/cn/blob/edit/image/Elastic-Compute/CloudDisk/cloud-disk/parted-format/parted_001.png)

2) You can complete the partition by the following command /dev/vdb and please modify it to the device name to be partitioned

```
fdisk /dev/vdb

```

After entering the command, enter n, p and 1 in turn, press enter key twice and then enter wq; complete and save it. After that, when viewing through fdisk -l once again, you can see the new partition /dev/vdb1


![](https://github.com/jdcloudcom/cn/blob/edit/image/Elastic-Compute/CloudDisk/cloud-disk/parted-format/parted_002.png)

Note: If the hard disk capacity created is greater than 2T, do not partition it or refer to the below procedures to use parted partition:

1) Create partition table and select GPT format:

![](https://github.com/jdcloudcom/cn/blob/edit/image/Elastic-Compute/CloudDisk/cloud-disk/parted-format/parted_003.png)

2) Create partition

![](https://github.com/jdcloudcom/cn/blob/edit/image/Elastic-Compute/CloudDisk/cloud-disk/parted-format/parted_004.jpg)

3) Run fdisk -l command again to confirm partition

![](https://github.com/jdcloudcom/cn/blob/edit/image/Elastic-Compute/CloudDisk/cloud-disk/parted-format/parted_005.jpg)

3. Then you need to use the following command to format the partitioned hard disk

```
mkfs -t ext4 /dev/vdb1
```



![](https://github.com/jdcloudcom/cn/blob/edit/image/Elastic-Compute/CloudDisk/cloud-disk/parted-format/parted_006.png)


Note: This example created an ext4 formatted file system; you can also select to create other file systems. To guarantee the completeness and availability of data to the extent of file system, it is not recommended to use formats not providing jounral mechanism, such as ext2.

4. Create the vdb1 catalog under mnt catalog and attach the disk to this catalog for convenience of management


```
mkdir -p /mnt/vdb1 && mount -t ext4 /dev/vdb1 /mnt/vdb1
```

5. View UUID of the disk

```
blkid /dev/vdb1
```
6. Write /etc/fstab file to attach cloud disk
![](https://github.com/jdcloudcom/cn/blob/edit/image/Elastic-Compute/CloudDisk/cloud-disk/parted-format/parted_007.png)


**Note: If the system is Centos 7 or higher, you must use nofail parameter when writing fstab; if a private image is produced for current virtual machine, the new virtual machine created based on this private image will be unable to normally start.**

