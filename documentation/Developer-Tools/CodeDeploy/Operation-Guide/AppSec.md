## AppSec File

During "Create Deployment", if the "Deployment Operating Command" selects the "Use appSpec. in Code Root Directory", then CodeDeploy will execute all contents of appSpec.yaml. Note here that the directory where the appSpec.yaml file locates must be the code root directory and the file name is appSpec.yaml. (Case sensitivity)

**Template**

```
files:
  - source: config/sql.txt
    destination: /home/config/sql
  - source: file1
    destination: /home/config
hooks:
   AfterInstall:
     - location: /opt/Control/Test1.sh
       timeout: 100
       runas:root
     - location: /opt/Control/Test2.sh
       timeout: 100
```

**Keyword Description**

1) files (compulsory)

source：
- Files and directories are supported. If it is a file, the specified file will be replicated; if it is a directory, the file in the directory will be replicated (excluding this directory); if it is a single slash (/), all files will be replicated.
- Relative path: Begin from the root directory of code package


destination：
- Replicate contents in source to this location
- Absolute Path


Support multiple pairs of source and destination.

**Examples**

Precondition: There are files as follows in the program package to be deployed:

```
file1.txt
file2.txt
folder1/file3.txt
```

Below we will take examples for description

Example 1:

```
# files are as follows
- source:./file1.txt
  destination:/home
# The execution results are as follows:
/home/file1.txt
```

Example 2:

```
# files are as follows
- source:./file1.txt
  destination:/home
- source:./file2.txt
  destination:/home  
# The execution results are as follows:
/home/file1.txt
/home/file2.txt
```

Example 3:

```
# files are as follows
- source:/
  destination:/home
# The execution results are as follows:
/home/file1.txt
/home/file2.txt
/home/folder1/file3.txt
```

Example 4:

```
# files are as follows
- source:./folder1
  destination:/home/test01
# The execution results are as follows:
/home/test01/file3.txt
```


2) hooks (optional)

location：
- The script location is an absolute path
- Compulsory

timeout：
- The unit of time-out period of script is s
- Optional, it is 10s by default

runas：
- Users executing script
- Optional, it is root by default


**Supports of keywords in workflow to hooks**

| Keyword      |   Explanation | Support hooks or not |
| :--------: | :--------:|:--------:|
| DownloadBundle  | Download program package | No |
| BeforeBlockTraffic   | Cancel pre-script registered in Load Balancer | Yes |
| BlockTraffic  | Cancel registration in Load Balancer | No |
| AfterBlockTraffic | Cancel post-script registered in Load Balancer | Yes |
| ApplicationStop | Stop script | Yes |
| BeforeInstall | Deploy pre-script | Yes |
| Install | Deploy | No |
| AfterInstall | Deploy post-script | Yes |
| ApplicationStart | Start script | Yes |
| ValidateService | Check script | Yes |
| BeforeAllowTraffic | Pre-script registered in Load Balancer | Yes |
| AllowTraffic | Register in Load Balancer | No |
| AfterAllowTraffic | Post-script registered in Load Balancer | Yes |


The following environment variables can be supported in the hooks scripts:

| Environment variable      |   Explanation |
| :--------: | :--------:|
|  APP_ID | Application ID, which can be viewed on the deployment application page |
| APP_NAME | Application name, which can be viewed on the deployment application page |
| GROUP_ID | Deployment group ID, which can be viewed on the application details page |
| GROUP_NAME | Deployment group name, which can be viewed on the application details page |
| DEPLOY_ID | Deployment task ID, which can be viewed on the deployment history page |



**Examples**

```
hooks:
  AfterInstall:
    - location: /home/bin/stop.sh
      timeout: 100
      runas: hadoop
    - location: /home/bin/stop2.sh
      timeout: 100
      runas: root
  ApplicationStart:
    - location: /home/bin/start.sh
      timeout: 100
      runas: root
  BeforeInstall:
	- location: /home/bin/config.sh
      timeout: 10
```
In the process of deployment and in the workflow, it will:

- Execute deployment of pre-script: Execute /home/bin/stop.sh with the hadoop user with time-out period of 100s; and then execute /home/bin/stop2.sh with the root user with time-out period of 100s
- Execute start script: Execute /home/bin/start.sh with the root user with time-out period of 100s
- Execute deployment of pre-script: Execute /home/bin/config.sh with the root user with time-out period of 10s


It is recommended to set the set -e in the hook script
