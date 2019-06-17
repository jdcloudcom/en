## Jdcloud-codedeploy File

When "Create Deployment", if the "Deployment Operating Command" selects the "Use jdcloud-codedeploy.yml in Code Root Directory", then CodeDeploy will execute all contents of jdcloud-codedeploy.yml. Note here that the directory where the jdcloud-codedeploy.yml file locates must be the code root directory and the file name is jdcloud-codedeploy.yml (uppercase and lowercase sensitive).

**Template**

```
files:
  - source: config/sql.txt
    destination: /home/config/sql
  - source: file1
    destination: /home/config
hooks:
   AfterInstall:
     - command: /opt/Control/Test1.sh
       timeout: 100
       runas: root
     - command: /opt/Control/Test2.sh
       timeout: 100
permissions: 
  - object: /home/config/soft
    pattern: "**"
    except: [function.php]
    owner: admin
    group: admin
    mode: 777
    type:
      - file
env:  
  php_path: /home/config/soft/php/bin
```

**Keyword Description**

**1) files (compulsory)**

source：

- Files and directories are supported. If it is a file, the specified file will be replicated (mv); if it is a directory, the file in the directory (excluding this directory) will be replicated (mv); if it is a single slash (/), all files will be replicated (mv).
- Relative Path: Begin from the root directory of code package


destination：

- Replicate (mv) contents in source to this location
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
- source: ./file1.txt
  destination: /home
# The execution results are as below:
/home/file1.txt
```

Example 2:

```
# files are as follows
- source: ./file1.txt
  destination: /home
- source: ./file2.txt
  destination: /home  
# The execution results are as below:
/home/file1.txt
/home/file2.txt
```

Example 3:

```
# files are as follows
- source: /
  destination: /home
# The execution results are as below:
/home/file1.txt
/home/file2.txt
/home/folder1/file3.txt
```

Example 4:

```
# files are as follows
- source: ./folder1
  destination: /home/test01
# The execution results are as below:
/home/test01/file3.txt
```


**2) hooks (optional)**

command:

- The location of command or script, which is an absolute path
- Compulsory

timeout：

- The unit of time-out period of script is s
- Optional, it is 10s by default

runas：

- Users Executing Script
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
| BeforeAllowTraffic | Pre-script Registered in Load Balancer | Yes |
| AllowTraffic | Register in Load Balancer | No |
| AfterAllowTraffic | Post-script Registered in Load Balancer | Yes |


The following environment variables can be supported in the hooks scripts:

| Environment variable      |   Explanation |
| :--------: | :--------:|
| JDCLOUD_CODEDEPLOY_APP_ID | Application ID, which can be viewed on the deployment application page |
| JDCLOUD_CODEDEPLOY_APP_NAME | Application name, which can be viewed on the deployment application page |
| JDCLOUD_CODEDEPLOY_GROUP_ID | Deployment group ID, which can be viewed on the application details page |
| JDCLOUD_CODEDEPLOY_GROUP_NAME | Deployment group name, which can be viewed on the application details page |
| JDCLOUD_CODEDEPLOY_DEPLOY_ID | Deployment task ID, which can be viewed on the deployment history page |
| JDCLOUD_CODEDEPLOY_LIFECYCLE_EVENT | Workflow Keyword |


**Examples**

```
hooks:
  AfterInstall:
    - command: /home/bin/stop.sh
      timeout: 100
      runas: hadoop
    - command: /home/bin/stop2.sh
      timeout: 100
      runas: root
  ApplicationStart:
    - command: /home/bin/start.sh
      timeout: 100
      runas: root
  BeforeInstall:
    - command: /home/bin/config.sh
      timeout: 10
```
In the process of deployment and in the workflow, corresponding operations bellow shall be made:

- Execute deployment of pre-script: Execute /home/bin/config.sh with the root user with time-out period of 10s
- Execute start script: Execute /home/bin/start.sh with the root user with time-out period of 100s
- Execute deployment of post-script: Execute /home/bin/stop.sh with the hadoop user with time-out period of 100s, and then execute /home/bin/stop2.sh with the root user with time-out period of 100s. Execute from top to bottom between two commands


It is recommended to set the set -e in the hooks script

**3) permissions (optional)**

object: 

- Directory or File with Permission to Be Modified
- Compulsory

pattern: 

- If "**" is used, the permission will be applied to all matched directory or file
- Optional

except: 

- Exceptional Directory or File
- Optional

owner: 

- Owner of Specified Directory or File
- Optional

group: 

- Specified Directory Group or File Group
- Optional

mode: 

- Specified Directory Mode or File Mode
- Optional

type:

- Direct directory or file. If case of directory, the permission will be applied to all directories other than except of object (exclusive); in case of file, the permission will applied to all files other than except in object (exclusive). The directory is directory and the file is file
- Optional


**Examples**

```
permissions:
  - object: /opt/soft
    pattern: "*bin*"
    except: [sbin/start]
    owner: admin
    mode: 777
    type:
      - directory
```

In the process of deployment and in the workflow, corresponding operations bellow shall be made:

After copying directories or files to specified path, operations of permissions shall be executed correspondingly: Names under the /opt/soft directory can be matched with bin, while permission modification operations shall be modified to names under the directory other than sbin/start, with permission modification of owner=admin, mode=777

**4) env (optional)**

Environment Variables for Executing Relevant Scripts of hooks in the Workflow

Designate the environment variable by means of key: value

**Examples**

```
env:  
  php_path: /home/config/soft/php/bin

```





