# Use S3fs to mount Bucket on the Linux instance

S3fs is a FUSE-based file system, which allows Linux to mount Bucket to the local file system and S3fs can remain the original format of the object. By using S3fs, a Bucket can be mounted into the Linux system as a folder and used as a system folder.

## Refer to the official description for environment installation and configuration

https://github.com/s3fs-fuse/s3fs-fuse

System with centos7 and above revision

**1. Installation dependent package**

```
sudo yum install automake fuse fuse-devel gcc-c++ git libcurl-devel libxml2-devel make openssl-devel
```

**2. Installation and compilation**

```
git clone https://github.com/s3fs-fuse/s3fs-fuse.git
cd s3fs-fuse
./autogen.sh
./configure
make
sudo make install
```

**3. Create password file**

```
echo key:sercert > ~/.passwd-s3fs
chmod 600 ~/.passwd-s3fs
```

Description

key: secret obtaining method: https://uc.jdcloud.com/account/accessKey

chmod 600: Only the current user can access the key file setting.


**4. Mount Object Storage Service to local catalog/new**

```
mkdir /new
s3fs bucketname /new -o passwd_file=~/.passwd-s3fs -o url="http://s3.cn-north-1.jcloudcs.com"
```
Description

mkdir: Create a new folder as the local mounting catalog.

s3fs: Manually mount commands, in which the bucketname is the bucket name, /new is the local mounting path, passwd_file is the password file location, and url is the S3 domain name compatible to [Object Storage Service](../API-Reference-S3-Compatible/Regions-And-Endpoints.md) (please input service domain name where the bucket is located)

**5. View mounting results**

```
df -h
```

![查看挂载结果](https://github.com/jdcloudcom/cn/blob/edit/image/Object-Storage-Service/OSS-072.png)


**6. Log in the catalog to view the object file**


![查看object文件](https://github.com/jdcloudcom/cn/blob/edit/image/Object-Storage-Service/OSS-073.png)


**Tips：**

When mounting Object Storage Service with the s3fs-fuse tool and copying files with cp commands, the following solutions can be taken when the file mime-type is modified:

1.Use the `cp` command to copy files; the actions carried by the `s3fs-fuse` tool on the bottom are dependent on the file `/etc/mime.types` and the file determines the mime-type attribute of the `cp` command target file.
2.By default, the centos7 revision of JD Cloud does not contain the `/etc/mime.types` file. Thus, it needs to obtain such file by copying or installing httpd and the installation command is yum install httpd.
3.For catalogs mounted by the `s3fs` command, it needs to be unmounted at first and the command will take effect once the s3fs command is executed once again.
