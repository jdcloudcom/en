# Data Migration Tool

## Overview

The data migration tool of Object Storage Service supports the file migration from services as AWS S3, Alibaba Cloud, Tencent Cloud, Baidu Cloud, Qiniu Cloud, etc. to JD Cloud OSS and supports the migration of local file list at the same time. The migration tool is a smile distributed system, which adopts python rpc for implementation, has one Master and one or more Workers, and you may run such tool on one or more machines.

The tool features are as follows:

1.Support a variety of data sources, including local data and data from a third party

2.Support breakpoint upload.

3.Support incremental migration and support file migration after the assigned time.

4.Support parallel data transmission.

Tool download: [osstransfer](http://downloads.oss.cn-north-1.jcloudcs.com/tools/osstransfer.zip)

## Operating Environment

Linux and Window

Software dependence: python Version 2.7.X

The migration tool is used for implementation by using python. Before use, it needs to install some dependence packages. You may install such packages by using the commands below (be sure to install pip at first).
```
pip install requests
pip install qiniu
pip install boto3
pip install -U cos-python-sdk-v5
pip install oss2
```

## Configuration Worker

Worker configuration file is config-worker (Path: osstransfer/src/worker/config-worker)

Configuration content is as follows
```
#port: Port number the worker is specified to use, the default value is 6262;
#is-continue: True/False, whether to continue the task uncompleted last time, the default value is True.
port=1234
is-continue=True
```
Directly run worker.py under the catalog osstransfer/src/worker after configuration. It is suggested to run worker at the background and the Worker starting command is as follows:
```
nohup python worker.py &
```
After starting worker, it will wait for the call of master. For operation record of worker, please view log-worker.txt file (catalog: osstransfer/logs).

Note: Worker only supports the call by one master at present. Please ensure that your worker will not serve several masters at the same time.



## Configuration of Master

The configuration file of Master is config-master (Path: osstransfer/src/master/config-master)

Configuration parameters are as follows:

|Configuration Item|Description|
|-|-|
|master|Specify ip of machine where master is located and port used; it is compulsory|
|worker|Specify available worker and you need to specify the worker’s ip and port configured to such worker; it is compulsory|
|Job-ID|Specify a name for this task; if the task name is assigned by yourself, it needs to ensure that the job-IDs under the same bucket are not the same; and you may not specify the task name and we will adopt the time stamp as Job-ID; it is optional|
|Job-type|There are two job types, including the transfer (migration job) and the check(verification job); it is compulsory|
|src-filetype|File types specifying source data include s3file, diskfile, qiniufile, aliyunfile, notencentfile and baidufile; it is compulsory|
|src-absolutepath|It is used only when the filetype is configured for specifying absolute path of the source data (the path must be ended with ‘/’). All files under the path will be migrated; it is compulsory|
|src-accesskey|Specify accesskey of source data, which is compulsory for migration of a third-party data source|
|src-secretkey|Specify secretkey of source data, which is compulsory for migration of a third-party data source|
|src-endpoint|Specify endpoint of source data, which is compulsory for migration of a third-party data source|
|src-bucketName|Specify bucket where the source data is located, which is compulsory for migration of a third-party data source|
|src-key|Specify migration catalog (be sure to be ended with ‘/’). If you failed to do so, all data under bucket will be migrated; it is optional|
|src-file-list|You may assign a file to keep the file list to be migrated or verified and the file format is as follows: filepath\tfilesize; note of option <br>: if src-file-list is specified, we will only migrate the file list specified in the file, and the src-key configuration item will become invalid (for the file system, you may use src-key to specify the prefix and keep the relative path in the file list)|
|des-accesskey|Accesskey of Object Storage Service; compulsory|
|des-secretkey|Secretkey of Object Storage Service; compulsory|
|des-endpoint|Endpoint of Object Storage Service; compulsory|
|des-bucketName|Bucket name of Object Storage Service; compulsory|
|des-key|Refer to Object Storage Service catalog and you may migrate the data to the catalog by assigning the catalog (must be ended with ‘/’); it is optional|
|sync-enable-increment|Whether the incremental synchronization is enabled; the optional parameters include True (enable incremental synchronization) and False (full synchronization); among the options, the incremental synchronization is the default value before the configuration; when the option False is selected, transfer-is-continue and check-is-continue will be False<br>, neglect of the configuration; note: when the setting True is selected, you must assign a value for job-ID and the value can’t be blank. |
|sync-lastmodify|Once the time is set, only the files with the final modification time after the setting time are migrated; the time format is YYYY-MM-DD HH:MM:SS and the default value is 1970-01-01   00:00:00; the time is optional<br>Note: Although you have set lastmodify, we may only migrate some files before lastmodify. In other words, the time is only a rough value and is not precise. |
|task-size|Specify the maximum value of each task migration data (in MB) and the default value is 5GB, which is used in the check; it is optional|
|task-filenumbers|Specify the maximum file number for migration of each task is 5w by default (as recommended, can’t exceed 20w), which will be used in the check process; it is optional|
|round|Specify round number; the default round number is 2; the round will be used in the check process; it is optional|
|transfer-is-continue|True/False, whether to continue the last unfinished job; the default is True; it is optional|
|transfer-error-output|Specify a file name to keep files failed in migration (you can view the failure reason via this file) and the default file name is: "[job-ID]-transfer-error-list.txt"; it is optional|
|check-time|Specify the check time, the optional parameters include now (check immediately after completion of migration), future (do not check after completion of migration and we will keep information necessary for check in the target bucket) and never (never check) and the default value is future; it is optional|
|check-mode|Specify check mode, the options include head (only view if the file exists) and md5 (compare md5 of the source data with that of the target data), and the default value is head; it is optional|
|check-is-continue|Whether to continue the check, True/False; the default value is True; it is optional|
|check-error-output|Specify a file name to keep the problematic files in the check process and the default name is: "[job-ID]-check-error-list.txt"; it is optional|
|check-md5-output|After verification, we will save md5 of all files. Please assign a file to keep md5 and the default file name is "[job-ID]-check-md5-list.txt"; it is optional|

## Operation Master

A job is assigned to master by the file config-master and master will read the file in the operation process to finish the assigned job.

Customer Scenario:

(1) Cold Data Migration

After configuring config-master, please directly run master.py under the catalog osstransfer/src/master. We suggest you to run it on the background:
```
nohup python master.py  &
```
(2) Hot Data Migration

If you intend to transfer the hot data, the timing job is suggested. You may set a timing job by using crontab under linux and the scheduled task with graphical interface is available under windows.

Use of crobtab under linux is as follows:

Give crontab -e command, add timing job and carry out such action once per day:

![](https://github.com/jdcloudcom/cn/blob/edit/image/Object-Storage-Service/OSS-090.jpg)

Note: If the last timing job is unfinished, the new migration task will not be started. This is to ensure that the data is kept consistent in the migration process.

Operation information of master can be viewed via log-master.txt under the catalog of osstransfer/logs.

## Monitoring Status

To obtain operation status of master and worker, we developed a simple program. The catalog of the program is osstransfer/src/probe/probe.py. We introduce the use of the program:

(1) Display Help Documentation

```
python probe.py -h
```

(2) View a worker or a master
```
python probe.py -ip_port ip:port
```

(3) View statuses of all workers and masters
```
python probe.py -f config-master
```
