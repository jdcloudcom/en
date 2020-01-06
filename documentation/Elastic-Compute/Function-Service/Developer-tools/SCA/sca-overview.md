# SCA (Serverless Cloud Application)

## Introduction

[SCA CLI](https://github.com/jdcloud-serverless/sca) is a Serverless Cloud Application (SCA) command line tool of JD Cloud. It provides convenient local management function to serverless application service of JD Cloud, including local function management: local test, package, deployment, cloud test, etc.          
sca cli can finish description of function resource via one function template configuration file template.yaml and configure and deploy local code to the cloud based on the configuration file.

## Running Environment

sca cli supports running of Linux and Mac;    
sca cli is developed based on go. You only need to download the installation package and then it is applicable for use.    

## Use Now

### Install sca cli (Linux/Mac)

Execute commands below to finish download and installation:           
`·curl -O https://raw.githubusercontent.com/jdcloud-serverless/sca/master/hack/install.sh && chmod +777 install.sh && sh install.sh && source ~/.bashrc`     

Or, you can [Download Installation Package to a Local Directory](https://github.com/jdcloud-serverless/sca/releases), execute the command `chmod +x sca`, grant execution permission and run it.  

### Search sca version
` sca version `      
`JD Serverless Cloud Application Version: 0.0.1`

### Configure account information  
After sca is installed, [Initialize configuration](https://github.com/jdcloud-serverless/sca/blob/master/doc/usage/config.md) and synchronize JDCloud account information to sca. 

` sca config  `        



### Install Docker

SCF CLI supports start of Docker container management tool and use of container as environment for running function codes locally. The local command of SCF CLI will use Docker management APIs to realize related interconnection.     
If you need to use local debugging and running capacity, please make sure that Docker has been correctly installed.
If you need to use no Docker or intend to install Docker later, please skip this step.

#### Install Docker on Mac
| Version                                 | Download Link                                                     | Installation Method                                                     |
| ------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ |
| Apple Mac OS Sierra 10.12 and above version | [docker-ce-desktop](https://hub.docker.com/editions/community/docker-ce-desktop-mac) | Download the docker.dmg installation package, double click the instillation file and start installation.             |
| Apple Mac OS Sierra 10.12 and below version   | [Docker Toolbox](https://docs.docker.com/toolbox/overview/)  | Double click the Toolbox installation tool and install Toolbox according to [macOS Installation Guide](https://docs.docker.com/toolbox/toolbox_install_mac/) provided by Toolbox. After installation, double click the new icon of Docker Quickstart Terminal in Launchpad to start Docker. |

#### Install Docker on Linux


| Version            | Download Link                                                     | Installation Method                                                     |
| --------------- | ------------------------------------------------------------ | ------------------------------------------------------------ |
| CentOS Operating System | [CentOS](https://docs.docker.com/install/linux/docker-ce/centos/) | Execute the command sudo yum install docker-ce docker-ce-cli containerd.io to install Docker. |
| Debian Operating System | [Debian](https://docs.docker.com/install/linux/docker-ce/debian/) | Execute the command sudo apt-get install docker-ce docker-ce-cli containerd.io to install Docker. |
| Fedora Operating System | [Fedora](https://docs.docker.com/install/linux/docker-ce/fedora/) | Execute the command sudo dnf install docker-ce docker-ce-cli containerd.io to install Docker. |
| Ubuntu Operating System | [Ubuntu](https://docs.docker.com/install/linux/docker-ce/ubuntu/) | Execute the command sudo apt-get install docker-ce docker-ce-cli containerd.io to install Docker. |
| Binary System Package        | [Binary System Package](https://docs.docker.com/install/linux/docker-ce/binaries/) | Decompose and run the binary system package to finish download, installation and start of Docker.       |



### Initialization Project       
By [Initializing Project](https://github.com/jdcloud-serverless/sca/blob/master/doc/usage/init.md), users can quickly create a simple template, including code file and configuration file, which can be further configured and developed based on the template and directly packed and deployed to the cloud.     

`  sca init   `    

### Configuration File template.yaml
sca cli can finish description of function resource via one function template configuration file template.yaml and configure and deploy local code to the cloud based on the configuration file. The format is as follows:
```
ROSTemplateFormatVersion: "2019-12-25"
Transform: JDCloud::Serverless-2019-12-25
Resources:
  test-function:
    Type: JDCloud::Serverless::Function
    Properties:
      Handler: index.handler
      Timeout: 280
      MemorySize: 128
      Runtime: python3.6
      Description: This is a template of function which name is "test-function"
      CodeUri: ./
      Env: {}
      Role: ""
      Policies: ""
      VPCConfig:
        Vpc: ""
        Subnet: ""
      LogConfig:
        LogSet: ""
        LogTopic: ""
      
```

### Verify configuration file
 [Verify template.yaml File](https://github.com/jdcloud-serverless/sca/blob/master/doc/usage/validate.md)    
 
`  sca validate  `        

### Local Test
Via [Debugging Local Functions](https://github.com/jdcloud-serverless/sca/blob/master/doc/usage/local.md), users can run codes in local simulated environment before deployment, send simulated test event, verify function execution and get running information and log. Before running local debugging, please make sure that Docker has been installed and started in local environment.  

`   sca local  `  

### Packing Deployment
According to appointed function template configuration file, information such as appointed code package and function configuration is [Packed and Deployed to Cloud](https://github.com/jdcloud-serverless/sca/blob/master/doc/usage/deploy.md). 

` sca deploy ` 

### Function Management
Via function management, you can [View Cloud Function List](https://github.com/jdcloud-serverless/sca/blob/master/doc/usage/function_list.md), [Search Function Configuration](https://github.com/jdcloud-serverless/sca/blob/master/doc/usage/function_info.md) and [Delete Function](https://github.com/jdcloud-serverless/sca/blob/master/doc/usage/function_delete.md).               
`sca function list`  View existing function resource list on cloud.                
`sca function info`  View deployed cloud function configuration.             
`sca function del`   Delete deployed cloud functions.          

### Cloud Invoking Function
Users can [Invoke Local Cloud Function](https://github.com/jdcloud-serverless/sca/blob/master/doc/usage/invoke.md) via the invoke command for test verification.

` sca invoke `


### Cloud Log
Via [Search Cloud Log Command](https://github.com/jdcloud-serverless/sca/blob/master/doc/usage/logs.md), you can search execution logs within appointed cloud function period.

`  sca log  `                

