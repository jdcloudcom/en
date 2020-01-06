# Installation and Configuration

## Install sca CLI (Linux/Mac)

1. Download installation package from git to a local directory and install it;  
2. Execute the following command to verify whether sca has been installed successfully.  
sca --version  
If the following information is returned, it means that installation is succeeded. 
sca CLI, version 0.0.1

## Configure account information  
After sca is installed, configuration will be initialized and JDCloud account information will be synchronized to sca.  
The configuration information is as shown below:  
Region: product region information, support North China now;  
Account ID: User’s account ID can be obtained from User Management--Basic Data;  
SecretID and SecretKey: Users’ AK and SK information can be obtained in User Management - AccessKey Management.

```
$ sca config

```


## Install Docker

SCF CLI supports start of Docker container management tool and use of container as environment for running function codes locally. The local command local invoke of SCF CLI will use Docker management APIs to realize related interconnection.

If you need to use local debugging and running capacity, please make sure that Docker has been correctly installed.
If you need to use no Docker or intend to install Docker later, please skip this step.

### Install Docker on Mac
#### For Apple Mac OS Sierra 10.12 and above version
1. Download docker.dmg installation package from [Mac Version Download Link of docker-ce-desktop](https://hub.docker.com/editions/community/docker-ce-desktop-mac), double click installation file and start installation.  
2. After installation is completed, a tiny whale icon of Docker will be shown on the top status bar, which means that Docker has been finished and started.  

#### For Apple Mac OS Sierra 10.12 and below version
For Apple Mac OS Sierra 10.12 and below version, you need to install Docker with Docker Toolbox.  
1. Obtain download link for Toolbox of Mac Version from [Docker Toolbox Overview Page](https://docs.docker.com/toolbox/overview/).  
2. Double click Toolbox installation tool and install Toolbox according to [macOS Installation Guide](https://docs.docker.com/toolbox/toolbox_install_mac/) provided by Toolbox.  
3. After installation, double click the new icon of Docker Quickstart Terminal in Launchpad to start Docker.
After Docker is started, a terminal window will be shown for inputting. In such case, you can input the command docker version to check if Docker is installed and started successfully.  

### Install Docker on Linux
Install Docker in Linux, which can be finished via package management tools of different release version or the binary system package. Installation methods of different Linux versions are as follows:

#### CentOS Operating System
Get Docker installation package of [CentOS Version](https://docs.docker.com/install/linux/docker-ce/centos/).  
Execute the command sudo yum install docker-ce docker-ce-cli containerd.io to install Docker.
#### Debian Operating System
Get Docker installation package of [Debian Version](https://docs.docker.com/install/linux/docker-ce/debian/).  
Execute the command sudo apt-get install docker-ce docker-ce-cli containerd.io to install Docker.
#### Fedora Operating System
Get Docker installation package of [Fedora Version](https://docs.docker.com/install/linux/docker-ce/fedora/).  
Execute the command sudo dnf install docker-ce docker-ce-cli containerd.io to install Docker.
#### Ubuntu Operating System 
Get Docker installation package of [Ubuntu Version](https://docs.docker.com/install/linux/docker-ce/ubuntu/).  
Execute the command sudo apt-get install docker-ce docker-ce-cli containerd.io to install Docker.
#### Binary System Package
Get [Binary System Package](https://docs.docker.com/install/linux/docker-ce/binaries/).  
Decompose and run the binary system package to finish download, installation and start of Docker.
