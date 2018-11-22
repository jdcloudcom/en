# Container Registry

Create privatized docker Repository, provide stable image hosting service; the Container Registry includes Public Image and Private Image.

Click **Operation & Maintenance Tools** in the menu bar, enter **Container Registry

The Docker client requires 1.12 and above versions.

**Concepts**

1. Projects

One project contains multiple Repositories. One Repository contains multiple versions.

For the same tenant name, the project name is unique.

For example:

tenant0202.hub-ark-hn.jdcloud.com/library/centos:7.3

In this address,

- Domain Name: tenant0202.hub-ark-hn.jdcloud.com
- Project: library
- Image: centos
- Version: 7.3
 

2. Image Type

1) Overview

There are two image types, which respectively are:

Base image: Generally, it refers to the native Centos operating system, which individuals can push them to the Container Registry for management and maintenance

Compiled image: Generally, it refers to the installation of the software required for compilation on the base image, such as (maven JDK GCC, etc.) the environment image required for compilation, and individuals can push them to the Container Registry for management and maintenance

2) Default

The image type pushed to the Container Registry is by default the base image.

3) Change the Image Type

The operations are as follows: Container Registry ---> Select the specified product line on the left service tree, click the specified project in the right page --> Enter the Repository page, click the specified Repository name -> Enter the image details page, click **Edit** next to the image type. If you do not have edit rights, please check the Container Registry permissions.

4) Relation to Compilation and Construction

The “Create Image” in the New Creation is the “Compiled Image” in the Container Registry.

**Create Image**

1. Install docker

```
# CentOS
yum install docker
```

2. Enable docker service

```
systemctl start docker
```

3. Generate Dockerfile

```
# If the base image is in a customized project, then, FROM tenant name.hub-ark-hn.jdcloud.com/{project name}/{image name}:{version}
# If the base image is in an official project, then, FROM tenant0202.hub-ark-hn.jdcloud.com/{project name}/{image name}:{version}
# Examples
FROM tenant0202.hub-ark-hn.jdcloud.com/library/centos:7.3
RUN yum -y install centos-release-gluster41 && yum -y install glusterfs-server
```


- You can also choose to manually pull the image to local. For details, see Pull Image in Container Registry.
- In an official project, library is a compiled image
- For the compilation of Dockerfile, please refer to the image Dockerfile in the official project. View in the following steps: Menu-->Container Registry-->Official Project-->Click on an image in the project, enter the image details page-->Specify the version, click **View DockerFile

4. Create docker Image

```
# May contain domain name information or may not contain domain name information
# Not contain domain name information  docker build  -t {image name}:{version}  .
# Examples
docker build  -t glusterfs:4.1.5  .
# Contain domain name information   docker build  -t {domain}/{project name}/{image name}:{version}  .
# If the base image is in a customized project, then the domain name is tenant name.hub-ark-hn.jdcloud.com/{project name}/{image name}:{version}
# If the base image is in an official project, then the domain name is tenant0202.hub-ark-hn.jdcloud.com/{project name}/{image name}:{version}
# Examples
docker build  -t Tenant Name.hub-ark-hn.jdcloud.com/xdata-op/glusterfs:4.1.5  .
```

5. View docker Image

```
docker images
```

6. Run docker Image

```
# If the base image is in a customized project, then the domain name is tenant name.hub-ark-hn.jdcloud.com/{project name}/{image name}:{version}
# If the base image is in an official project, then the domain name is tenant0202.hub-ark-hn.jdcloud.com/{project name}/{image name}:{version}
Examples
# Compiling Image
docker run -ti tenant0202.hub-ark-hn.jdcloud.com/library/centos:7.3 /bin/bash
```

7. Query Running docker Container

```
docker ps
```

8. Other Common Commands

```
#Log in docker Image
docker exec -it a6779e27ca13 bash
#Stop docker Image
docker stop a6779e27ca13
#Delete docker Container
docker rm a6779e27ca13
```


**Push Image to the Container Registry**

1. [Premise] You have permission to push the image to the project in the Container Registry page.
- Who has the permission to push the image to the project: Operation and maintenance for project-associated product line, product line development, and system operation and maintenance of the project members
- How to create a new project: Create a project on the Container Registry page. The newly created project is a customized project.
The specific operations are as follows: Menu --> Operation And Maintenance Tools --> Container Registry; in the left service tree, select a product line (this product line is the product line to be associated with the project), and the operation and maintenance role of the product line; you can click **Create Project** on the right side; fill in the project name and members (may be the systems under the product line). For permission details, refer to: Container Registry Permissions


2. List local images

```
docker images
```

3. Start the container from the backend, verify whether the configuration is correct

```
# If the base image is in a customized project, then the domain name is tenant name.hub-ark-hn.jdcloud.com/{project name}/{image name}:{version}
# If the base image is in an official project, then the domain name is tenant0202.hub-ark-hn.jdcloud.com/{project name}/{image name}:{version}
# Examples
# Compiling Image
docker run -ti tenant0202.hub-ark-hn.jdcloud.com/library/centos:7.3 /bin/bash
docker ps
```

4. Log in Repository

```
docker login -u{user name} -p{password} tenant name.hub-ark-hn.jdcloud.com
```

When「Login Succeeded」returns, login succeeded.

The user name=The user name in DevOps; the password=The password in DevOps

5. Mark local images

If the domain name is already included in the build, then there is no need to do the docker tag here. 
 
```
docker tag {image name/ID}  tenant name.hub-ark-hn.jdcloud.com/{project name}/{image name}:{version}
```

6. Push local image to the Container Registry

```
docker push tenant name.hub-ark-hn.jdcloud.com/{project name}/{image name}:{version}
```
 


**Pull Image from Container Registry**

1. Image in an Official Project

Container Registry-->Official Project Page-->Repository Page-->Image Details Page, click **Copy Image Address** following Version

```
docker pull tenant0202.hub-ark-hn.jdcloud.com/{project name}/{image name}:{version}
```

2. Public Repository in Customized Project

Container Registry-->Customized Project Page-->Repository Page-->Image Details Page, click **Copy Image Address** following Version

```
docker login -u{user name} -p{password} tenant name.hub-ark-hn.jdcloud.com
# Pull Image
docker pull tenant name.hub-ark-hn.jdcloud.com/{project name}/{image name}:{version}
```

The user name=The user name in DevOps; the password=The password in DevOps

Who has the permission to pull the image from the public repository in the customized project: All people within the tenants

3. Shared Repository in Customized Project

Container Registry-->Customized Project Page-->Repository Page-->Image Details Page, click **Copy Image Address** following Version

```
# Pull Image
docker pull tenant name.hub-ark-hn.jdcloud.com/{project name}/{image name}:{version}
```

The user name=The user name in DevOps; the password=The password in DevOps

Who has the permission to pull the image from the shared repository in the customized project: All people

 
4. Private Repository in Customized Project

Select the product line in the left service tree, Container Registry-->Customized Project Page-->Repository Page-->Image Details Page, click **Copy Image Address** following Version

```
docker login -u{user name} -p{password} tenant name.hub-ark-hn.jdcloud.com
# Pull Image
docker pull tenant name.hub-ark-hn.jdcloud.com/{project name}/{image name}:{version}
```

The user name=The user name in DevOps; the password=The password in DevOps

Who has the permission to pull the image from the private repository in the customized project: Person in charge of the product line associated with the project + product line operation and maintenance + product line development personnel + system operation and maintenance, testing, product and R&D of the project members, and operation and maintenance and development of the applications under the project


**Permission**

1. Definitions

Project: Similar to projects in Harbor, as a collection of repositories

- Official Project: Created by official and provides Public Images.
- Customized Project: Product line operation and maintenance personnel can create their own projects in the product line dimension, and specify project members, pull & push images to the project. The project members are the systems under the product line.

Repository: Belong to a project. There are multiple repositories in one project, and multiple versions in one repository.

The Repository has two dimensions:

1) Access Permission

- Open: All users in a tenant are open
- Private: Open to project members
- Sharing: All users between tenants are open

2) Image Type

Base image: As base image
Compilation image: It can be used for construction image selected during compilation and construction

2. Project Permission

|    New Project |  Delete Project | Create/Delete/Modify project members, i.e. select the corresponding system of the service tree|View
| :--------: | :--------:|:--------:|:--------:|
| Service Tree - Product line operation and maintenance personnel can create projects in their own product line dimension | Service Tree - Product line operation and maintenance personnel can delete projects associated with their own product line | Service Tree - Product line operation and maintenance | ALL within the tenants |


3. Repository Permission

The newly created repository is by default private and the base image.

When viewing, please note that you need to specify the product line in the left service tree.

|Repository Permission |    Pull Image |  Modify Access Permission (Public/Private/Shared) |Modify Image Type (Base/Compiled)|View |Modify Description|Delete|View|Can be selected during compilation and construction
| :----: | :----:|:----:|:----: | :----:|:----:|:----:|:----:|:----:|
| Project: Official Repository: Public  | ALL  No user name or password required | Not involved |Not involved |Not involved |Not involved |Not involved |ALL |ALL |
| Project: Customized Repository: Public | ALL within the tenants | Product line operation and maintenance+product line development+system operation and maintenance of project members | Product line operation and maintenance | Product line operation and maintenance+product line development+system operation and maintenance of project members|Product line operation and maintenance+product line development+system operation and maintenance of project members | Product line operation and maintenance | ALL within the tenants | ALL within the tenants|
| Project: Customized Repository: Private  | Person in charge of the product line+product line operation and maintenance+product line development+system operation and maintenance, testing, product and R&D of the project members, and operation and maintenance and development personnel of the applications under the project |Product line operation and maintenance+product line development+system operation and maintenance of project members  | Product line operation and maintenance| Product line operation and maintenance+product line development+system operation and maintenance of project members|product line operation and maintenance+product line development+system operation and maintenance of project members | Product line operation and maintenance| Person in charge of the product line+product line operation and maintenance+product line development+system operation and maintenance, testing, product and R&D of the project members, and operation and maintenance and development personnel of the applications under the project| Person in charge of the product line+product line operation and maintenance+product line development+system operation and maintenance, testing, product and r&d of the project members, and operation and maintenance and development personnel of the applications under the project|
| Project: Customized Repository: Shared  | ALL |Product line operation and maintenance+product line development+system operation and maintenance of project members  | Product line operation and maintenance| Product line operation and maintenance+product line development+system operation and maintenance of project members|Product line operation and maintenance+product line development+system operation and maintenance of project members | Product line operation and maintenance| ALL| ALL|


4. Image Version Permission

|    Image Version Permission |  View DockerFile |Delete |
| :--------: | :--------:|:--------:|
| Project: Official Repository: Public  | ALL| Not involved|
| Project: Customized Repository: Public  | Not involved |Product line operation and maintenance+Product line development+system operation and maintenance of the project members |
| Project: Customized Repository: Private  | Not involved |Product line operation and maintenance+Product line development+system operation and maintenance of the project members |
| Project: Customized Repository: Shared  | Not involved |Product line operation and maintenance+Product line development+system operation and maintenance of the project members |
