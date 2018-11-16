# Operation and maintenance tools

**Preface**

The major operation and maintenance tools include job platform and image management, providing users with basic operation and maintenance scenario services.

**Job platform**

The job platform provides the operation and maintenance engineers with automatic script execution and file distribution services, which can effectively improve the operation and maintenance efficiency. The job platform management module provides efficient script management and file distribution functions, enabling the centralized management of scripts distributed on various machines on the platform. These scripts can be used everywhere after they are edited at one place. What’s more is that all machines can be informed the modification of script information in real time at second level.

**Image packaging**

On the basis of harbor to create privatized docker image registry, providing stable image hosting services that include public image and private image.

**Product Functions**

**New script**

After selecting the service tree node, select the menu “Operation and Maintenance Tool - Script Management", and click “Add Script" in the Script List page, as shown in the figure. It supports manual input or upload script from local and it can set script parameters and timeout.

**Execute script**

Once the script is created, you can execute it through the script list. When executing, you can set the target machine, execution methods, execution account, etc., you can also modify the content, script parameters and timeout (changes only affect the execution process at this time, which it does not affect the original script) of the script again at the same time. When choose the target machine, it provides two ways of direct "select the server" and "selection service tree" for the purpose of convenience.

After setting, click “Execute Script". On the Script Execution page, click single machine to view the detailed log output.

![image](https://github.com/jdcloudcom/cn/blob/DevOps/image/DevOps/Operation-Guide26.png)
 

**New file distribution task**

For the new file distribution task, the node corresponding to the left service tree should be selected first. After the creation of the file distribution task, it will be assigned to the service tree node. After selecting the service tree node, click the "New Task" button to open the New Task page. As shown in the figure, in the page you can configure source files, set target path and target machines, multiple execution methods such as serial and parallel are supported by the file distribution, preposition and postposition commands can also be set.

**Execute file distribution task**

Once the file distribution task is created, the action can be performed through the task list. When executing, you can reset the source file, target directory, target machine, execution methods, execution account, etc. (the modification only affects the execution process at this time). When selecting the execution target machines, it provides two ways of direct "select the server" and "selection service tree" for the purpose of convenience.

After setting is completed, click Execute to open the detailed Execution page, and click Single Machine to see the detailed log output.

![image](https://github.com/jdcloudcom/cn/blob/DevOps/image/DevOps/Operation-Guide27.png)

**Image packaging**

Users can choose to upload images to the image packaging and download images from the image packaging.

1. Push local image to the image packaging

```
a. List local images
docker images
b. Start the container from the backend to verify whether the configuration is correct
docker run -d {image name/ID}
docker ps
c. Log in the image registry
docker login -u{user name} -p{password} *.jdcloud.com   #See the page notification for specific domain name
When「Login Succeeded」returns, login succeeded.
d. Mark local images
docker tag {image name/ID} *.jdcloud.com/{project name}/{image name}:{version}
e.Push the image to the packaging
docker push *.jdcloud.com/{project name}/{image name}:{version}
```

Notification:

a.	The default is foundation+private image. If you need to change, please login the image packaging to change the type base image and compile image

b.	The image is divided into two categories that are:

- basic image: generally, it refers to the native Centos operating system, which individuals can push them to the image packaging for management and maintenance
- compiled image: generally, it refers to the installation of the software required for compilation on the basic image, such as (maven JDK GCC, etc.) the environment image required for compilation, and individuals can push them to the image packaging for management and maintenance


2. Pull the image from the image packaging to local

```
a. Public image
docker pull *.jdcloud.com/{project name}/{tag name}:{version}
b. Private image
# Log in image packaging
docker login -u{user name} -p{password} *.jdcloud.com   #See the page notification for specific domain name
# Pull image
docker pull *.jdcloud.com/{project name}/{tag name}:{version}
```
