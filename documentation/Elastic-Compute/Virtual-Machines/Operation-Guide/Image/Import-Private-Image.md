# Private Image Importation
## Function Overview

Private image importation means that the system disk of the server used by you in the locality or other cloud environments is saved as an image and imported into the JD Cloud & AI environment, so as to rapidly achieve the business deployment on JD Cloud & AI.<br>

Use Description about Image Importation:<br>

* As for image importation, currently only system disk image importation is supported;

* The way in which imported images are used is the same as the private images created by "create images", but some functions (e.g., set passwords and key pairs, endpoint security monitoring, etc.) may not be supported, since they rely on the official components in images. Support for these functions depends on whether you install the corresponding components before importing images. For the introduction on official components, please refer to the [public image system components](https://docs.jdcloud.com/en/virtual-machines/default-agent-in-public-image);

* Imported images will be used as private images in the format of "images of cloud disk system disks", and at the same time, a snapshot associated with imported images will be automatically generated;

* Images of "cloud disk system disks" can be used to create the system disk and acts as the machine of Cloud Disk, and images cannot be converted into the images of "local disk system disks". As for the difference between images of "local disk system disks" and images of "cloud disk system disks", please refer to the [image type](https://docs.jdcloud.com/en/virtual-machines/image-type).

## Basic Image Requirement<br>
### Basic Linux System Requirement<br>
| Image Attribute                  | Requirement                | 
| :------------------- |  :------------------- |
|Operating System|* CentOS, Ubuntu, Debian, SUSE Linux Enterprise and OpenSUSE<br> are supported * 64-bit is supported  |
|Image Format|* RAW, VHD, QCOW2 and VMDK are supported|
|Image Size|* The disk size and virtual size don’t exceed 500G|
|File System|* xfs, ext3, ext4|
|Partition|* MBR Partition|
|Driver Virtualization|* only KVM virtualization is supported, and it is required to install the virtio driver|
|Enabling Method|* Only support BIOS and does not support UEFI method
|Network|* the Ipv6 address isn’t supported for the time being|
|Basic system environment |* Disable the firewall, and release the TCP 22 port <br>* Enable the DHCP service<br>* Ensure that the system disk has remaining space<br>* Ensure that the file system is complete|
|System Configuration|* If /etc/fstab is configured with automatic attaching, please delete <br>* /etc/udev/rules.d. In case of 70-persistent-net.rules configuration, please delete <br>* please don’t modify /etc/shadow is read only<br>* Please don’t modify /etc/selinux/config Enable SELinux<br>* Please don’t modify /etc/grub/grub.cfg<br>* Please don’t modify /boot/grub/menu.lst
|System Component|* Install JCS-agent|
|Conflict Component|* Ensure that qemu-ga<br> is uninstalled* Ensure that cloud-init is uninstalled|

### Basic Linux System Requirement<br>
| Image Attribute                  | Requirement                | 
| :------------------- |  :------------------- |
|Operating System|* Windows Server 2016, 2012 R2 and 2008 R2 are supported<br> * 64-bit is supported  |
|Image Format|* RAW, VHD, QCOW2 and VMDK are supported|
|Image Size|* The disk size and virtual size don’t exceed 500G|
|File System|* NTFS|
|Partition|* MBR Partition|
|Driver Virtualization|* only KVM virtualization is supported, and it is required to install the virtio driver|
|Enabling Method|* Only support BIOS and does not support UEFI method
|Network|* the Ipv6 address isn’t supported for the time being|
|Basic System Environment |* Disable the firewall, release the RDP 3389 port<br>* Ensure that the system disk has remaining space<br>* Ensure that the file system is complete|
|System Configuration|* Please don’t modify the key system file|
|System Component|* Install JCS-agent|
|Conflicting Component|* Ensure that qemu-ga<br> is uninstalled* Ensure that cloudbase-init is uninstalled|

## Importation Steps

![](../../../../../image/vm/Image-Import-Image-Overview.png)<br>
### 1. Image Preparation
To guarantee the availability of imported images, please be sure to conduct image configuration test before import by referring to JD Cloud & AI image making requirements, especially key configuration of starting method, partition and [virtio Installation](https://docs.jdcloud.com/en/virtual-machines/install-virtio-driver), and carry out import operation after confirming the images conforming to JD Cloud & AI specifications.<br>

Meanwhile, to guarantee that imported images can get such functions as password modification, monitoring data reporting, security scan testing, etc. under the JD Cloud & AI environment, you are suggested to install important system components before exporting images. For the functions and installation methods of system components, please refer to: [Public image system components](https://docs.jdcloud.com/en/virtual-machines/default-agent-in-public-image). <br>

For Linux images, self inspection of important system configurations can be completed with the image self-inspection tool provided by us. For the use method, please refer to: [Image Self-inspection Tool](Image-Check-Tool.md)

### 2. Image File Generation
Importation of the image files in four types of formats, i.e., RAW, VHD, QCOW2 and VMDK are supported. Please designate the correct file format before generating image files.<br>

The iso image format isn’t supported, please change the format of the image into the designated format by VirtualBox, virt-manager or other tools before importation. For the operation guidance, please refer to: [Convert the image format](Convert-Image-File-Format.md), [conversion of images in ISO format](Convert-Image-File-Format-From-ISO.md)

### 3. Upload the image file
Before operating imported images, it is required to ensure that [the Object Storage Service has been enabled](https://docs.jdcloud.com/en/object-storage-service/sign-up-service-2) and [bucket has been created](https://docs.jdcloud.com/en/object-storage-service/create-bucket-2), and then upload the image file to the bucket in the **same region** of the image expected to be imported, and acquire the intranet download link of files (by changing the "s3" in download link domain into "s3-internal").<br>

Directly click **Replicate** icon to get an external link, if the access permission of the bucket is "public read/write" or "public read and private write".<br>
![](../../../../../image/vm/Image-Import-Image-Step1.png)

If the access permission of the bucket is "private read/write" or "customized permission", it is required to designate the link validity when getting external links. Considering that the time required for importing an image is related to the file size and the count of tasks in the system handling queue, to guarantee that the importation process is smooth, you are suggested to set an effective period of time of no less than 1d.<br>
![](../../../../../image/vm/Image-Import-Image-Step2.png)

### 4. Image importation

<div id="user-content-1"></div>

Since no Console operation entry is provided for the current image importation function, please complete importation by referring to the openAPI document and using CLI and SDK after completing the above-mentioned operating steps.<br>

* For the OpenAPI, see: [Image importation](https://docs.jdcloud.com/en/virtual-machines/api/importimage?content=API)<br>

* For CLI installation and configuration, please see [CLI Installation](https://docs.jdcloud.com/en/cli/installation) [CLI Configuration](https://docs.jdcloud.com/en/cli/config)<br>

* Meaning of CLI instruction:
```
jdc vm import-image --architecture x86_64 --os-type linux --platform "Other Linux" --disk-format qcow2 --system-disk-size-gb 50 --image-url https://XXXX.s3-internal.cn-north-1.jdcloud-oss.com/XXXX.qcow2 --image-name importImageTest
```

The parameter description of import APIs is as follows:

| Parameter                  | Type      |Compulsory or Not     | Description |
| :------------------- |  :------------------- | :------------------- |:------------------- |
| architecture   |  string    |Yes  |Operating System Architecture, support "x86_64" and "i386"
| osType   | string    |Yes   |Image Operating System Type, please fill in "linux" or "windows" according to actual situations
| platform   | string    |No   |Image Operating System Release Version, please fill in according to actual situations if the version is one of "CentOS", "Ubuntu" and "Windows Server", or fill in "Other Linux" or "Other Windows" correspondingly according to osType
| osVersion   |  string    |No  |Specific Operating System Release Version Number, e.g. 7.4 (CentOS), 18.04 (Ubuntu), only use to identify each other for distinguishing, you may fill according to needs
| diskFormat	 | string    |Yes   | Image File Format, support "vhd", "vmdk", "qcow2" and "raw", please fill in according to actual situations, or an error will be reported at the verification phase and affect import
| systemDiskSizeGB   |  int   |Yes  |  Specify capacity of system disk created with image, range [40,500], please ensure this parameter is not less than virtual size of image, or an error will be reported at the verification phase and affect import
| imageUrl   | string    |Yes   |For image files intranet download link in the same region as the imported image (OSS object external link address, and fill out it after changing the "s3" in the domain into "s3-internal"), any inconsistency between the domain where the files belong to and the region of the API and filling out the internet download link will affect the import.
| imageName   |  string    |Yes  |Customized Image Name
| description   |  string    |No  |Customized Image Description
| forceImport | boolean |No  |  Whether compulsively import image without image detection, to avoid unavailability of image after import, it is suggested maintaining the default value. Default value: false
| clientToken |  string    |No  |Use to guarantee the idempotence of the request. Generated by client, the length cannot exceed 64 characters

## View and Test Image
After the import image request is submitted, you can immediately see the specific progress via the proportion in the "Status" attribute in the Console Private Image List Page/Details.

As the system disk function of Cloud Disk Service in cn-north-1 is in the greyscale open period, if you cannot view imported disk images of cloud disk systems in the private image list, please open tickets to apply for permissions.

If the image is found at "Creating 0%" for a long time when searched, it is possible that there are too much import image requests, so your request is at queuing status, then you can call [Image Import Task Search](https://docs.jdcloud.com/en/virtual-machines/api/imagetasks?content=API) APIs through openAPI to know more detailed task progress.

* For OpenAPI document, see: [Search Image Task](https://docs.jdcloud.com/en/virtual-machines/api/imagetasks?content=API)<br>

* Meaning of CLI instruction:

```
jdc vm image-tasks --region-id cn-north-1 --task-action ImportImage --input-json '{"taskIds":[xxx]}'
```
After the image import is finished, please use the image to create VM instance to test whether the creation is successful and whether the basic function is normal. If any exception occurs, you can check compliance with basic requirements for image production. If the problem still cannot be solved, please open ticket or contact customer service to get technical supports.

After the import is successful, if you need to configure JD Cloud & AI Intranet yum source or ntp service, you can refer to [Linux System Configuration of yum Source and ntpd Service](https://docs.jdcloud.com/en/virtual-machines/linux-yum-ntpd).

## Related References
[Public image system components](https://docs.jdcloud.com/en/virtual-machines/default-agent-in-public-image)

[Image Type](https://docs.jdcloud.com/en/virtual-machines/image-type)

[virtio Installation](https://docs.jdcloud.com/en/virtual-machines/install-virtio-driver)

[Image Self-inspection Tool](Image-Check-Tool.md)

[Convert Image Format](Convert-Image-File-Format.md) 

[ISO Format Image Convert](Convert-Image-File-Format-From-ISO.md)

[Image Import OpenAPI](https://docs.jdcloud.com/en/virtual-machines/api/importimage?content=API)

[Image Task SearchOpenAPI](https://docs.jdcloud.com/en/virtual-machines/api/imagetasks?content=API) 

[CLI Installation](https://docs.jdcloud.com/en/cli/installation) 

[CLI Configuration](https://docs.jdcloud.com/en/cli/config)

[Linux System Configure yum Source and ntpd Service](https://docs.jdcloud.com/en/virtual-machines/linux-yum-ntpd)
