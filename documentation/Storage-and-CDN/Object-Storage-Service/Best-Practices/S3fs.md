# Use S3fs to mount Bucket on the Linux instance

S3fs is a FUSE-based file system, which allows Linux to mount Bucket to the local file system and S3fs can remain the original format of the object. By using S3fs, a Bucket can be mounted into the Linux system as a folder and used as a system folder.

## Refer to the official description for environment installation and configuration

https://github.com/s3fs-fuse/s3fs-fuse

**1. Installation dependent package**

On CentOS 7:

```
sudo yum install automake fuse fuse-devel gcc-c++ git libcurl-devel libxml2-devel make openssl-devel
```

On Ubuntu 14.04:

```
sudo apt-get install automake autotools-dev fuse g++ git libcurl4-openssl-dev libfuse-dev libssl-dev libxml2-dev make pkg-config
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
echo Access_Key_ID:Access_Key_Secret > ~/.passwd-s3fs
chmod 600 ~/.passwd-s3fs
```

Description

The acquisition mode of Access Key ID: Access Key Secret: https://uc.jdcloud.com/account/accessKey

chmod 600: Only the current user can access the key file setting.


**4. Mount Object Storage Service to local catalog/new**

```
mkdir /new
s3fs bucketname /new -o passwd_file=~/.passwd-s3fs -o url="https://s3.cn-north-1.jcloudcs.com"
```
Description

mkdir: Create a new folder as the local mounting catalog.

s3fs: Manually mount commands, in which the bucketname is the bucket name, /new is the local mounting path, passwd_file is the password file location, and url is the S3 domain name compatible to [Object Storage Service](../API-Reference-S3-Compatible/Regions-And-Endpoints.md) (please input service domain name where the bucket is located)

**5. View mounting results**

```
df -h
```

![查看挂载结果](../../../../image/Object-Storage-Service/OSS-072.png)


**6. Log in the catalog to view the object file**


![查看object文件](../../../../image/Object-Storage-Service/OSS-073.png)


**Tips：**

1. If CentOS 6 is used, please refer to the following installation steps:

```
yum install automake gcc-c++ git libcurl-devel libxml2-devel make openssl-devel

wget https://github.com/libfuse/libfuse/releases/download/fuse_2_9_4/fuse-2.9.2.tar.gz
tar -zxvf fuse-2.9.2.tar.gz
cd fuse-2.9.2
./configure --prefix=/usr
make
make install
export PKG_CONFIG_PATH=/usr/lib/pkgconfig:/usr/lib64/pkgconfig/
ldconfig
```

2. If Mac OS is used to install S3fs, please refer to the following steps:

```
git clone https://github.com/s3fs-fuse/s3fs-fuse.git
cd s3fs-fuse
./autogen.sh
./configure --prefix=/usr/local
PKG_CONFIG_PATH="/usr/local/opt/openssl/lib/pkgconfig:/usr/local/opt/libxml2/lib/pkgconfig"
make
sudo make install
```

Note: --prefix=/usr/local is not required; PKG_CONFIG_PATH is required, /usr/local/ shall be replaced with the user’s local path.

If you use non-root account when mounting the Bucket via Mac OS, please specify uid and gid of current account when the mount command is specified. Examples are as follows:

```
sudo s3fs bucketname /new -o passwd_file=~/.passwd-s3fs -o url="https://s3.cn-north-1.jcloudcs.com" -o uid=11111 -o gid=11111
```

3. When mounting Object Storage Service with the s3fs-fuse tool and copying files with cp commands, the following solutions can be taken when the file mime-type is modified:

- Use the `cp` command to copy files; the actions carried by the `s3fs-fuse` tool on the bottom are dependent on the file `/etc/mime.types` and the file determines the mime-type attribute of the `cp` command target file.

- By default, the centos7 revision of JD Cloud does not contain the `/etc/mime.types` file. Thus, it needs to obtain such file by copying or installing httpd and the installation command is yum install httpd.

- For catalogs mounted by the `s3fs` command, it needs use `umount` command at first and the command will take effect once the `s3fs` command is executed once again.

4. If you enable static website hosted before using S3fs to mount Bucket, the mount will fail; if you enable static website hosted after using S3fs to mount Bucket, the file operation will be invalid.
