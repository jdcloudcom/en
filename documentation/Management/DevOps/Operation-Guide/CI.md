# Compilation and Construction


DevOps compilation and construction provide container-based automatic and continuous integration services for developers. It supports multiple languages construction environment, automatic/manual task trigger and view construction results and logs.

Click **Continuous Delivery** in the menu bar to log in the “Compilation and Construction”.

**Compilation and Construction**

Select an application from the Service Tree on the left side and click **Create and Construct** on the right side. Complete code library address and other information, save, enter the compilation construction list, and click **Construct Now** to perform compilation and construction operation. If the construction is successful, module version compiled and constructed can be seen in Module-View Version.

- Git Code Address: Complete code library address, with the naming specification as follows: group name need to be > two characters, naming specification in lowercase + number + underline + line-through (the uppercase letters will be automatically converted to lowercase letters). Special characters such as /, etc. are not supported.
- Code Branch: Select code branch to be compiled
- Module Name: The module name is automatically produced according to code address, used for associating “Compilation and Construction” and “On-line Release”.
- Construct Image: select compilation environment, and currently multiple versions of compilation environments for different languages such as Java, golang, node, static_resource are supported Support the customized compilation environment. For details, please refer to the Container Registry.
- Compile Dependence: It can add compilation dependence
- Construction Method: it supports build.sh and makefile Put the constructed scripts in the root directory of codes. For details, see Compilation and Construction-Specification.
- Construction Parameters: parameters required during the process of entering construction
- Trigger Conditions: construct manually or trigger compilation and construction automatically when submitting codes to branch(es)
- Construction Type: code package
- Version Rule: Provide version naming rules, please refer **Module-->Version View**.
- Cache Compilation Workspace: for multiple complication and construction, cache workspace can accelerate the process of compilation
- Construct upload location (multiple choices): In order to accelerate the “On-line Release” to obtain the compilation results, you can select the location of the construction package upload location according to the region of the Virtual Machine. 

Advanced Options:
- Enable LFS: Corresponding to large files in the code library
- Webhook Address: notifications to be triggered may be entered
- Email Notification: Email address may be entered
- Notification Frequency: You can set the notification sending frequency when there are construction exceptions or at every construction.


Select a module and view construction job.

![Alt text](https://github.com/jdcloudcom/cn/blob/DevOps/image/DevOps/Operation15.png)

View creation details and logs in the Construction History page.

![Alt text](https://github.com/jdcloudcom/cn/blob/DevOps/image/DevOps/Operation16.png)


**Module**

Compiled modules and version details can be viewed in the module page. Uploading compiled packages (meeting compilation and construction specifications as well) to a module is supported, for subsequent on-line release.

![Alt text](https://github.com/jdcloudcom/cn/blob/DevOps/image/DevOps/Operation17.png)

Click **View Version

![Alt text](https://github.com/jdcloudcom/cn/blob/DevOps/image/DevOps/Operation18.png)


**Specification**

1. Add the compilation script build.sh in the root directory of code repository.

Creation of build.sh can be made only when the compiled products are under the directory of the same level (output/). Different module names received by build.sh are used as parameters.

Place the compiled products in output. All contents in output are packages for launch in future.

The example code is as follows:
```
#Taking golang as an example, you need to add compilation scripts in the root path of the code library. The example build.sh is as follows:
#!/bin/bash
#The principle of compilation script is to put the compilation result into the output directory. This sample template provides a compilation script that generates the most basic golang running program package. For special needs, please consider it as appropriate.
#
#1. The script supports parameterization, and the parameters will be passed to the build_package function (the content is the compilation command finally executed).
#   , use $1, $2.... to show the first, second ... parameters
#2. The deployment requires to start up the program, so the control file needs to be provided in the current directory for startup and
#   Monitor the program status
#Part Modified by User
readonly PACKAGE_DIR_NAME=""    #The directory which the main file is in relative to src folder, optional
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
#Operation of Clearing Compilation and Construction Directory
function clean_before_build
{
    cd ${WORKSPACE_DIR}
    rm -rf bin pkg
    rm -rf ${OUTPUT}
}
#Actual Compilation Command
#In this function, use $1, $2... to obtain the first, second... parameters
function build_package()
{
    cd ${WORKSPACE_DIR}
    export GOPATH=$(pwd)
    go install ${PACKAGE_DIR_NAME} || return 1
}
#Set up the directory finally released
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
#Copy compilation result to the released directory
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

2. The bin/control in output is used for starting, stopping and conducting service health check. The control script template file is listed as below. It can be further modified/expanded for use.

The deployment path is /export/Instances/application name/instance name/runtime by default.

In the execution process, control will be automatically loaded on the On-line Release ->Group page. However, the configuration files and environmental variables configured will not be loaded on bashrc and profile files of the machine to be deployed.

In case of debugging control in the Virtual Machine, the command bin/control start can be executed directly under the deployment path.

The startup command needs to be executed in the backend using nohup; to avoid the memory being full, it is recommended to redirect the log to the default log path, ie ../log/

The pseudocode is as follows:
```
a. Relevant operations controlling the start of the program  start 
source env.sh 
nohup command  > /dev/null 2>&1 &
check status
a. Relevant operations controlling the stop of the program  stop 
find pid by port or process name 
kill  pid
check status
c. Relevant operations checking whether the program is started/stopped, called at intervals of 10s  status 
check port
check process name
check url
```

The example code is as follows:
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
