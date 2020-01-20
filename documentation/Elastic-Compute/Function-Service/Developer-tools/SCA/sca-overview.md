# SCA (Serverless Cloud Application)

## Introduction

[SCA CLI](https://github.com/jdcloud-serverless/sca) is a Serverless Cloud Application (SCA) command line tool of JD Cloud. It provides convenient local management function to serverless application service of JD Cloud, including local function management: local test, package, deployment, cloud test, etc.          
sca cli can finish description of function resource via one function template configuration file template.yaml and configure and deploy local code to the cloud based on the configuration file.

## Running Environment

sca cli supports running of Linux and Mac;    
sca cli is developed based on go. You only need to download the installation package and then it is applicable for use.    

## Use Now

### Install sca cli (Linux)

Execute commands below to finish download and installation:           
`·curl -O https://raw.githubusercontent.com/jdcloud-serverless/sca/master/hack/install.sh && chmod +777 install.sh && sh install.sh && source ~/.bashrc`     

Besides, you can [Download Installation Package to a Local Directory](https://github.com/jdcloud-serverless/sca/releases), and run it after executing the command `chmod +x sca` to grant execution permission.

### Install sca cli (Mac)

Execute commands below to finish download and installation:    

` curl -O https://raw.githubusercontent.com/jdcloud-serverless/sca/master/hack/install-mac.sh && chmod +x install-mac.sh && sh install-mac.sh && source ~/.bashrc  `


Besides, you can [Download Installation Package to a Local Directory](https://github.com/jdcloud-serverless/sca/releases), and run it after executing the command `chmod +x sca` to grant execution permission.  



### Search sca version
` sca version `      
`JD Serverless Cloud Application Version: 0.0.1`

### Configure account information  
After sca is installed, [Initialize configuration](https://github.com/jdcloud-serverless/sca/blob/master/doc/usage/config.md) and synchronize JDCloud account information to sca. 

```
#sca config
[>] JDCould accountid = 11111(your acount id)
[>] JDCould region = cn-north-1
[>] JDCould access-key = 0123abcd(your ak)
[>] JDCould secret-key = abcd0123(your sk)

```       



### Install Docker (optional; required when executing local command)

sca cli supports start of Docker container management tool and use of container as environment for running function codes locally. The local command of sca cli will use Docker management APIs to realize related interconnection.     

- If you need to use local debugging and running capacity, please make sure that Docker has been correctly installed.
- If you need to use no Docker or intend to install Docker later, please skip this step.

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

Example: Initialize and create testproject (default) project in the current directory; default function name: test-function; when it is running: python3.6. Or, you can create configuration parameters:

`  sca init   `  

Create the project directory as follows

```
[root@A04-R08-I139-110-7T9CT92 testproject]# tree
.
├── README.md
├── template.yaml
└── test-function
    └── index.py

1 directory, 3 files

```


### Configuration File template.yaml
The initialization command will create a template.yaml template in the project, and sca cli can finish description of function resource via this function template configuration file, and configure and deploy local code to the cloud based on the configuration file. The format is as follows:

```
ROSTemplateFormatVersion: "2019-12-25"
Transform: JDCloud::Serverless-2019-12-25
Resources:
  test-function:
    Type: JDCloud::Serverless::Function
    Properties:
      Handler: index.handler
      Timeout: 300
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
 
```
# sca validate -t template.yaml
validate success.
```

### Local Test
Via [Debugging Local Functions](https://github.com/jdcloud-serverless/sca/blob/master/doc/usage/local.md), users can run codes in local simulated environment before deployment, send simulated test event, verify function execution and get running information and log. Before running local debugging, please make sure that Docker has been installed and started in local environment.  

Example: Test the test-function function in the template.yaml file in the current local default directory, and the event test event will be, by default, key:value character string:

```
#  sca local -n test-function

```  

```
python36: Pulling from jdccloudserverless/sca
Digest: sha256:6c40080bf12f45881a1f92e865eb52895a4a694ad4b12f620f25d8e95d52c6bd
Status: Image is up to date for jdccloudserverless/sca:python36
{
	"code": 0,
	"return": "hello world",
	"stdout": "{}\n",
	"stderr": "",
	"memory_used": "0.00m",
	"time_used": "6.889629ms"
}

```



### Packing Deployment
According to appointed function template configuration file, information such as appointed code package and function configuration is [Packed and Deployed to Cloud](https://github.com/jdcloud-serverless/sca/blob/master/doc/usage/deploy.md). 

Example: Deploy the function in the current directory template.yaml configuration to the cloud, replacing the repeated cloud function by default:
```
sca deploy 
```

```
Function (test-function) not exists , now beginning to create function
+---------------+--------------------------------+---------+-----------+---------+-------------+---------------+--------------------------------------------------------------------------------------------+----------------------+
| FUNCTION NAME |          DESCRIPTION           | VERSION |  RUNTIME  | TIMEOUT | MEMORY SIZE |    HANDLER    |                                          CODE URL                                          |     CREATE TIME      |
+---------------+--------------------------------+---------+-----------+---------+-------------+---------------+--------------------------------------------------------------------------------------------+----------------------+
| test-function | This is a template of function | LATEST  | python3.6 | 300 s   | 128 MB      | index.handler | http://oss-function-hb.s3.cn-north-1.jcloudcs.com/xxxxxx%3Atest-function%3ALATEST.zip | 2019-12-30T03:10:32Z |
|               | which name is "test-function"  |         |           |         |             |               |                                                                                            |                      |
+---------------+--------------------------------+---------+-----------+---------+-------------+---------------+--------------------------------------------------------------------------------------------+----------------------+
Deploy function (test-function) success .
```



### Function Management
Via function management, you can [View Cloud Function List](https://github.com/jdcloud-serverless/sca/blob/master/doc/usage/function_list.md), [Search Function Configuration](https://github.com/jdcloud-serverless/sca/blob/master/doc/usage/function_info.md) and [Delete Function](https://github.com/jdcloud-serverless/sca/blob/master/doc/usage/function_delete.md).               
`sca function list`  View existing function resource list on cloud.                
`sca function info`  View deployed cloud function configuration.             
`sca function del`   Delete deployed cloud functions.          

Example: Search cloud test-function function configuration details:
``` 
sca function info -n test-function   
```
```
+---------------+--------------------------------+---------+-----------+---------+-------------+---------------+--------------------------------------------------------------------------------------------+----------------------+
| FUNCTION NAME |          DESCRIPTION           | VERSION |  RUNTIME  | TIMEOUT | MEMORY SIZE |    HANDLER    |                                          CODE URL                                          |     CREATE TIME      |
+---------------+--------------------------------+---------+-----------+---------+-------------+---------------+--------------------------------------------------------------------------------------------+----------------------+
| test-function | This is a template of function | LATEST  | python3.6 | 300 s   | 128 MB      | index.handler | http://oss-function-hb.s3.cn-north-1.jcloudcs.com/xxxxxx%3Atest-function%3ALATEST.zip | 2019-12-30T03:10:32Z |
|               | which name is "test-function"  |         |           |         |             |               |                                                                                            |                      |
+---------------+--------------------------------+---------+-----------+---------+-------------+---------------+--------------------------------------------------------------------------------------------+----------------------+

```



### Cloud Invoking Function
Users can [Invoke Local Cloud Function](https://github.com/jdcloud-serverless/sca/blob/master/doc/usage/invoke.md) via the invoke command for test verification.

Example: Local test cloud test-function function:
```
sca invoke -n test-function

```

```
2019-12-30T11:14:15+08:00  bp4no1qq6sh2v13hpoed8vdpfqr84n05  Start Invoke   
2019-12-30T11:14:15+08:00  bp4no1qq6sh2v13hpoed8vdpfqr84n05  {'key': 'value'}  
2019-12-30T11:14:15+08:00  bp4no1qq6sh2v13hpoed8vdpfqr84n05  End Invoke   
2019-12-30T11:14:15+08:00  bp4no1qq6sh2v13hpoed8vdpfqr84n05  Report Invoke bp4no1qq6sh2v13hpoed8vdpfqr84n05,Duration :7.54ms  BilledDuration: 100ms  Memory Size: 128 MB  

Invoke Return : hello world
RequestId: bp4no1qq6sh2v13hpoed8vdpfqr84n05 		 Billed Duration: 100 ms 		Memory Size: 128 MB 		Max Memory Used : 0.00 MB


```


### Cloud Log
Via [Search Cloud Log Command](https://github.com/jdcloud-serverless/sca/blob/master/doc/usage/logs.md), you can search execution logs within appointed cloud function period.

Description: To search logs on cloud, please configure the log set and the log topic for the function first, and configure LogSetID and LogTopicID in the template.yaml file to search function execution logs through log service:
```    
      LogConfig:
        LogSet: "LogSetID"
        LogTopic: "LogTopicID"
````

Example: Search logs of test-function function in the latest 600000 seconds:
```
# sca logs -n test-function -d 600000
2019-12-19T10:35:05+08:00 boue3nfsqrshctda7hp792adjrap4r6r Report Invoke boue3nfsqrshctda7hp792adjrap4r6r,Duration :7.54ms  BilledDuration: 100ms  Memory Size: 128 MB
2019-12-19T10:35:05+08:00 boue3nfsqrshctda7hp792adjrap4r6r End Invoke
2019-12-19T10:35:05+08:00 boue3nfsqrshctda7hp792adjrap4r6r {}
2019-12-19T10:35:05+08:00 boue3nfsqrshctda7hp792adjrap4r6r Start Invoke

......


```

