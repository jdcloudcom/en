# Continuous delivery

**Preface**

In the DevOps platform, the application service life cycle control can be completed by one-stop, including compilation construction, deployment, start-stop, restart and application offline, etc. to realize the full process management of the application.
- **Compilation Construction**

DevOps compilation construction provide container-based automatic and continuous integration services for developers. It supports multiple languages construction environment, automatic/manual task trigger and view construction results and logs. Compilation construction implements containerization isolation, supporting customized construction container. It provides upstream basic services for the continuous product integration and improves the R&D efficiency.
- **Online Release**

Support the deployment function for JD Cloud virtual machines, physical machines and other vendors’ virtual machines.
- **Log Service**

The log service provides a one-stop service for data collection, display and retrieval. The flexible retrieval function provides the second level query capability, supporting keyword highlighting retrieval and context viewing.

**Terminology definition**

**Site Logs**

The log files that currently exist on the servers are called site logs

**Historical Logs**

By log subscription, logs are collected, cleaned, and stored in the repository, which are called historical logs

**Product Functions**

**Compilation Construction**

1. Select “Continuous Delivery-Compilation Construction” from the menu in the navigation bar, click “New Construction” button to set basic information of compilation construction. 

- Git code address: provide source code address with the following naming specification:
group name need to be>two characters, module name & branch name naming specification is lowercase+numeric+underline+line-through (currently capital letters will be automatically converted to lowercase letters), special characters such as/etc are not supported
- Code branch: select code branches to be compiled
- Module name: the code address is automatically generated, and subsequent online releases will depend on this module name
- Construct image: select compilation environment, and currently multiple versions of compilation environments for different languages such as Java, golang, node, static_resource are supported
- Compile dependence: it can add compilation dependence
- Construction methods: support build.sh and makefile and provide compilation templates corresponding to different languages 

```
#Take golang as an example, you need to add compilation scripts in the root path of the code library. The example build.sh is as follows:
#!/bin/bash
#The principle of compilation script is to put the compilation result into the output directory. This sample template provides a compilation script that generates a most basic golang running program package. For special needs, please consider it as appropriate.
#
#1. The script supports parameterization; the parameters will be passed to the build_package function (the content is the compilation command finally executed)
#,  use $1, $2.... to show the first, second ... parameters
#2. The deployment requires to start up the program, so the control file needs to be provided in the current directory for startup and
#   Monitor the program status
#Part modified by the user
readonly PACKAGE_DIR_NAME=""    #The directory of the main file corresponding to src folder, optional
readonly PACKAGE_BIN_NAME=""    #Define the name of the generated running program, compulsory
readonly CONF_DIR_NAME=""       #Define the directory of configuration files, this path is a relative path; optional
#Final package-extracting path is $OUTPUT
if [[ "${PACKAGE_BIN_NAME}" == "" ]];then
    echo "Please set "PACKAGE_BIN_NAME" value"
    exit 1
fi
function set_work_dir
{
    readonly OUTPUT=$(pwd)/output
    readonly WORKSPACE_DIR=$(pwd)
}
#Operation of clearing compilation and building directory
function clean_before_build
{
    cd ${WORKSPACE_DIR}
    rm -rf bin pkg
    rm -rf ${OUTPUT}
}
#Actual compilation command
#In this function, $1, $2... Are used to obtain the first, second... parameters
function build_package()
{
    cd ${WORKSPACE_DIR}
    export GOPATH=$(pwd)
    go install ${PACKAGE_DIR_NAME} || return 1
}
#Build the directory finally released
function build_dir
{
    mkdir -p ${OUTPUT}/bin || return 1
}
function dir_not_empty()
{
    if [[ ! -d $1 ]];then
        return 1
    fi
    if [[ $(ls $1|wc -l) -eq 0 ]];then
        return 1
    fi
    return 0
}
#Copy the compilation result to the released directory
function copy_result
{
    cd ${WORKSPACE_DIR}
    cp -r ./bin/${PACKAGE_BIN_NAME} ${OUTPUT}/bin/${PACKAGE_BIN_NAME} || return 1
    cp -r ./control ${OUTPUT}/bin || return 1
    (dir_not_empty ${WORKSPACE_DIR}/${CONF_DIR_NAME} && mkdir -p ${OUTPUT}/${CONF_DIR_NAME};cp -rf ./${CONF_DIR_NAME}/* ${OUTPUT}/${CONF_DIR_NAME}/);return 0
}
#Execute
function main()
{
    cd $(dirname $0)
    set_work_dir
    echo "At: "$(date "+%Y-%m-%d %H:%M:%S") 'Cleaning...'
    clean_before_build || exit 1
    echo "At: "$(date "+%Y-%m-%d %H:%M:%S") 'Clean completed'
    echo
    echo "At: "$(date "+%Y-%m-%d %H:%M:%S") 'Building...'
    build_package $@ || exit 1
    echo "At: "$(date "+%Y-%m-%d %H:%M:%S") 'Build completed'
    echo
    echo "At: "$(date "+%Y-%m-%d %H:%M:%S") 'Making dir...'
    build_dir || exit 1
    echo "At: "$(date "+%Y-%m-%d %H:%M:%S") 'Make completed'
    echo
    echo "At: "$(date "+%Y-%m-%d %H:%M:%S") 'Copy result to publish dir...'
    copy_result || exit 1
    echo "At: "$(date "+%Y-%m-%d %H:%M:%S") 'Copy completed'
    echo
    exit 0
}
main $@
```
- Construction parameters: parameters required during the process of entering construction
- Trigger conditions: construct manually or trigger compilation construction automatically when submitting codes to branch(es)
- Construction type: construct output and support code package
- Revision rules: provide revision naming rules and archive them to the revision library
- Cache compilation workspace: for multiple complication construction, cache workspace can accelerate the process of compilation
- Construct upload location (multiple choices): in order to accelerate the online release to obtain the compilation results, you can select the location of the construction package upload location according to the region of the virtual machines
Advanced options:
- Enable LFS: corresponding to large files in the code library
- Webhook address: notifications to be triggered may be entered
- Email notification: email address may be entered
- Notification frequency: you can set the notification frequency as to send when there are construction exception or at every construction

2. After saving, enter the compilation construction list, click “Construct Now” to perform compilation construction operation. If the construction is successful, module revision with compiled construction can be seen in Module-View Revision.

**Module management**

In the module sub-page, it supports users to create modules, manually upload packages to modules and manage versions.

![image](https://github.com/jdcloudcom/cn/blob/DevOps/image/DevOps/Operation-Guide12.png)


**Application deployment**

1.Basic Settings

Select one application in the Service Tree at the left side, select “Continuous Delivery-online Release” from the menu to enter “online” page. Click “basic setting” sub-page to set executive account, associate the application to all modules (only after they have been associated together, you can select the compiled package version under your module when you go online)

2.Group Settings

Click “Configuration” on the “Group Settings” page to set configuration files and environmental variables for each group.

Of which, configuration files can be added, uploaded, and cloned.
 
![image](https://github.com/jdcloudcom/cn/blob/DevOps/image/DevOps/Operation-Guide13.png)

3.Online

Select the group(s) to be online on the “online” page and set online concurrence and time-out period. Select package revision to be online for online release. On the “Online Dynamic” page, you can view online details and perform rollback operation.

Then, the basic online release is completed.

4. Instance Management

It supports batch operations of restart, start, stop, enable or disable traffic, scaling (elastic deployment) for the instance dimension

![image](https://github.com/jdcloudcom/cn/blob/DevOps/image/DevOps/Operation-Guide14.png)
 
Add control scripts under the code root directory bin/to start, stop, and service health check 

control example is shown as below:

```
#!/bin/bash
cd "$(dirname $0)"/.. || exit 1
PROC_NAME=confcenter # Process name is usually the binary name and usually it is java for java program
START_COMMAND='bin/confcenter' #Command of starting up your program under the output directory
PROC_PORT=8055 # For the port occupied by the program, it is recommended to write. If the program does not occupy the port, it can be judged only through ps whether the process is started. If there is a program with the same name in the machine, there may be a problem.
WAIT_TIME=60 # The time taken from executing TART_COMMAND to when the program can fully start listen port
  
PROC_NAME=${PROC_NAME::15}
if [ -f default_env.sh ];then
    source default_env.sh
fi
help(){
    echo "${0} <start|stop|restart|status>"
    exit 1
}
  
checkhealth(){
    if [[ -n "$PROC_PORT" ]] ; then
        PORT_PROC=$(/usr/sbin/ss -nltp "( sport = :$PROC_PORT )" |sed 1d |awk '{print $NF}' |grep -oP '".*"' |sed "s/\"//g" |uniq)
        if [ X"$PORT_PROC" = X"$PROC_NAME" ] ; then
                echo "running"
            return 0
        fi
        echo "not running"
        return 1
   else
       ps -eo comm,pid |grep -P  "^$PROC_NAME"
       if [ "$?" = 0 ] ; then
       echo "running"
           return 0
       fi
       echo "not running"
       return 1
   fi
}
  
start(){
    checkhealth
    if [ $? = 0 ]; then
        echo "[WARN] $PROC_NAME is aleady running!"
        return 0
    fi
    mkdir -p log
  
    nohup $START_COMMAND  </dev/null &>> /dev/termination-log  &
  
  
    for i in $(seq $WAIT_TIME) ; do
        sleep 1
        checkhealth
        if [ $? = 0 ]; then
            echo "Start $PROC_NAME success"
            return 0
        fi
    done
    echo "[ERROR] Start $PROC_NAME failed"
    return 1
}
  
stop(){
    if [[ -n "$PROC_PORT"  ]] ; then
        PROC_ID=$(  /usr/sbin/ss -nltp "( sport = :$PROC_PORT )" |sed 1d  | awk '{print $NF}' |  grep -oP ',.*,' | grep -oP "d+" |  uniq )
    else
        PROC_ID=$(ps -eo comm,pid  | grep "^$PROC_NAME" |awk '{print $2}')
    fi
  
    if [[ -z "$PROC_ID" ]] ; then
        echo "[WARN] $PROC_NAME is aleady exit, skip stop"
        return 0
    fi
  
    checkhealth
    if [ "$?" != "0" ] ; then
        echo "[WARN] $PROC_NAME is aleady exit, skip stop"
        return 0
    fi
    kill $PROC_ID
    for i in $(seq $WAIT_TIME) ; do
        sleep 1
        checkhealth
        if [ "$?" != "0" ] ; then
            echo "Stop $PROC_NAME success"
            return 0
        fi
    done
  
    kill -9 $PROC_ID
    sleep 1
    checkhealth
    if [ "$?" != "0" ] ; then
        echo "Stop $PROC_NAME success"
        return 0
    fi
  
    echo "[ERROR] Stop $PROC_NAME failed"
    return 1
}
  
case "${1}" in
    start)
        start
        ;;
    stop)
        stop
        ;;
    status|health|checkhealth)
        checkhealth
        ;;
    restart)
        stop && start
        ;;
    *)
        help
        ;;
esac
```
5. Log service

5.1 Site log: select the application with log to be view, select “Continuous Delivery” - “online Release” from the menu, the logs corresponding to each instance can be viewed on the “Log Service - Site Log” page. Log view supports keyword highlighting, reverse query, whole word matching, etc. Click a row of log, its context log also can be viewed.
 
 ![image](https://github.com/jdcloudcom/cn/blob/DevOps/image/DevOps/Operation-Guide15.png)
 
5.2 Log subscription and historical log: select the application to view the log, select the menu “Continuous Delivery" - “Online Release", in the “Log service-Log subscription" page, click “New Subscription" to set the log path and save, you can view the group of subscriptions and the log of instances from the log page after the next online.
 
 ![image](https://github.com/jdcloudcom/cn/blob/DevOps/image/DevOps/Operation-Guide16.png)

**Arrange online**

Support for deployment across applications and provide settings such as parallelism, failure threshold, etc.

1. New view

Enter view name, time-out period and other configurations

2. Write view content

- The layers are serialized
- Jobs within each layer can be parallelized, and if the level of concurrency is set to 6, up to 6 jobs can be executed simultaneously
- Concurrency within job is set in the way supported by the job supports and is consistent with the page operating behavior. E.g., the package deployment job, its concurrency field values and meanings are: 0-serial, 30-30%, 70-70%, 100-parallel; and for the image deployment job, concurrency field values: 0-parallel, 1-serial...
- When the number of failed jobs in the layer reaches the configured max_fail (failure threshold), such layer and the overall view are marked as failure
See the following examples,

```
[
    // Level 1
    {
        concurrency: 2, // Concurrency in group 1 (Note: 0 stands for full concurrency, 1 stands for serial, n stands for up to n jobs are executed at the same time)
        timeout: 1200,  // time-out of group 1 (s)
        pause: 1,       // After the execution of this level is completed, the view will enter into the “pause” status; click “continue to execute” in the execution records to continue executing the following levels
        max_fail: 3,    // The level (and the whole view) will only be marked as failed when the number of failed jobs in this level  reaches 3; if it is given 0 here, all the failed jobs will be ignored
        // Deployment job in group 1, each job corresponds to the deployment of one APP
        "jobs": [
            // job1
            {
                app_name: "yangxiaojia-test-app1",  // job1 APP name
                concurrency: "0",                   // job1 instance concurrency (package deployment: 0-serial, 30-30%, 70-70%, and 100-concurrency || Image deployment: 0-concurrency, 1-serial, 2- 2 instances at most can be concurrent at the same time…)
                instance_timeout: 300,              // job1 execution time-out time (s)
                // job1 deployment target
                "target": [
                    group-hb,                      // Target group (if it is package deployment, it can be instance too, such as 0.group-hb)
                    "group-sh"
                ],
                type: "1",                          // job1 online types: 1-package deployment, 2-image deployment, 4-elastic deployment, 5-elastic expansion
                version: "4f40681d-20170622095458"  // job1 online package version
            }
            // Other jobs
            ...
        ]
    }
    // Other levels
    ...
]
```

3. After saving the view, editing, executing, viewing the execution history and deleting operations can be supported
