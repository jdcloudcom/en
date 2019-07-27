# Linux Partitioning, Formatting and Creating File System

Take CentOS operating system as an example, operations of data disk partitioning, formatting and creating file system are as follows:

1. After attaching on the Console, you can see a non-partitioned, formatted disk in Virtual Machines. You can view the disk partitioning information by the below command:

   `lsblk`

   As shown in figure below, unpartitioned, unformatted disk devices are /dev/vdb, `/dev/`prefix of **lsblk** output has been removed from the complete device path. If the device /dev/vdb already has partitions, its partitions will be listed as /dev/vda: /dev/vda1.
   
   ![lsblk](../../../../../../image/Elastic-Compute/CloudDisk/cloud-disk/parted-format/lsblk.PNG)

2. Before attaching and using newly created cloud disks, the file systems must be created on them. Before that, the following commands may be entered to verify whether the device contains the file system, take the device /dev/vdb as an example:

   `file -s /dev/vdb`

   When the device has no file system, as shown in figure below:

   ![vdb_nonfs](../../../../../../image/Elastic-Compute/CloudDisk/cloud-disk/parted-format/vdb_nonfs.PNG)

   If the device already has a file system, the system inputs and outputs are shown below (device /dev/vdb contains a file system in XFS format):

   ![vdb_fsexs](../../../../../../image/Elastic-Compute/CloudDisk/cloud-disk/parted-format/vdb_fsexs.PNG)

   **Note: **If your cloud disk was created through a snapshot, this cloud disk may already contain the file system and data, which can be mounted without recreating the file system, recreating of file system will overwrite the original disk data. If it is confirmed that there is no need to create a file system, skip this step and mount by directly executing step X.

3. If it is confirmed that it is required to create a new file system on this device, enter the mkfs-t command, take creating a file system in XFS format on the /dev/vdb device as an example:

   `mkfs -t xfs /dev/vdb`

   It is shown as the figure below after successful operation:

   ![mkfs](../../../../../../image/Elastic-Compute/CloudDisk/cloud-disk/parted-format/mkfs.PNG)

4. Use mount command to mount the device to the specified directory, taking mounting /dev/vdb to /mnt directory as an example:

   `sudo mount /dev/vdb /mnt`

   After successful execution, the system has no notification information. The mount can be checked by entering the `df -h` command. As shown in the figure below, the device /dev/vdb has been mounted successfully.

   ![mounted](../../../../../../image/Elastic-Compute/CloudDisk/cloud-disk/parted-format/mounted.PNG)

   If you want to attach the device in a different directory, you can also create an attaching directory by entering the mkdir command, taking the directory name /mypoint as an example:

   `sudo mkdir /mypoint`

   Then use /mypoint to replace /mnt in the mount command, namely `sudo mount /dev/vdb /mypoint`.

   
## Automatic Mount After Reboot

Virtual Machines need to be attached with Cloud Disk every time upon reboot. In order to avoid attaching Virtual Machines with the hard disk manually upon each reboot, automatic attaching of Virtual Machines with Cloud Disk after reboot can be achieved by adding entries in the device in /etc/fstab file.

1. (Optional) Back up /etc/fstab file to facilitate recovery of the file after maloperation.

   `sudo cp /etc/fstab /etc/fstab.bak`

2. Enter `blkid` command to find UUID of the device.

   ![check_uuid](../../../../../../image/Elastic-Compute/CloudDisk/cloud-disk/parted-format/check_uuid.PNG)

3. Use vim or other text editor to open /etc/fstab file, take using vim as an example below:

   `vim /etc/fstab`

4. Add a new line of entries in fstab with the UUID, current attaching directory, file system and attaching options of devices you want to be automatically attached after reboot, respectively.

   `UUID=e4abe4f9-4c65-4ce7-b8b1-171b7ab93f39 /mnt xfs defaults,nofail 0 2`

   ![fstab](../../../../../../image/Elastic-Compute/CloudDisk/cloud-disk/parted-format/fstab.PNG)

   **Note:**

   It is recommended to add **nofail** in the attaching options, as in the above example, namely, allow the instance to start normally even if an error occurs while the device is attached. Otherwise, it may cause failure of normal start of the instance upon reboot of the instance or recreating Virtual Machines through the image created through the instance under the condition that the device of such UUID is absent (such as the Cloud Disk is uninstalled).

5. (Optional) To check the validity of fstab file editing, uninstall the attached device through the `umount /mnt` command, and then enter:

   `mount -a`

   The command will automatically mount the device according to attaching information in fstab file, and fstab file editing is successful if the system has no error message generated.

