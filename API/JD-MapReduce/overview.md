# JMR API


## Introduction
Provide APIs for JD MapReduce operation in big data infrastructure services


### Version
v1


## API
|Interface name|Request mehod|Function description|
|---|---|---|
|**calculateClusterPrice**|POST|Calculate the cluster price of the corresponding specification attribute|
|**calculateExpansionPrice**|POST|Compute the price of cluster expansion|
|**clusterExpansion**|POST|Expand a specified number of instances for the specified cluster|
|**createAndExcuteJob**|POST|Create and Execute a Job under the Cluster|
|**createClusterInNewNetwork**|POST|Create a new cluster|
|**createCronJob**|POST|Create or update scheduling configuration|
|**createJob**|POST|Create a job based on the parameter information transferred in|
|**deleteCluster**|POST|Execute logical deletion on the assigned cluster|
|**deleteCronJob**|POST|Delete a regular task of the job|
|**deleteHdfsFile**|POST|Delete an hdfs file under the corresponding path of the specified cluster|
|**deleteJob**|POST|Delete a job specified by jobId|
|**deleteWorkFlow**|POST|Delete the specified workflow|
|**deleteWorkFlowTracker**|POST|Delete the operation record corresponding to the specified workflow|
|**executeJob**|POST|Execute a specified job|
|**getAccessKeys**|GET|Obtain accessKey and accessKeySecret based on userpin|
|**getAvaliableNum**|GET|Obtain the number of remaining resources that can be created of the current user|
|**getClusterCronJobCount**|POST|Obtain the cluster deployment job number|
|**getClusterDetailInfo**|POST|Display the cluster details during cluster expansion|
|**getClusterJobCount**|POST|Obtain the cluster job number|
|**getCronJobDetail**|POST|Obtain the regular task details|
|**getCronJobList**|POST|Obtain the execution plan list|
|**getCronJobTaskList**|POST|Obtain the operation record of a regular task of the job|
|**getCronJobTaskListByJobId**|POST|Search the operation record of a job of an execution plan|
|**getFirstServerVncUrl**|GET|Obtain the VNC URL for master nodes of remote connection cluster by clusterId|
|**getHardwareStack**|GET|Hardware Configuration Information List|
|**getInstanceList**|GET|Obtain the machine specification list (Filter out the low\-memory specifications; remove the ones inferior to quad\-core.)|
|**getJmrVersionList**|GET|Return to the current JD MapReduce Version List|
|**getJobList**|POST|Obtain the job list under the specified cluster|
|**getJobTypeList**|POST|Obtain job type list under the specified cluster|
|**getKey**|GET|Obtain user appkey and SecretKey|
|**getLastCronJobTask**|POST|Obtain the last operation record of a job of a regular task|
|**getPropertyValue**|GET|Software Configuration Information List|
|**getSoftwareAndVersionInfo**|POST|Obtain the software list corresponding to the assigned JD MapReduce Version and the Version information|
|**getSoftwareInfo**|POST|Obtain software list information of the corresponding Version|
|**getTaskList**|POST|Obtain the operation record of a job|
|**getWorkFlowList**|POST|Obtain the workflow list|
|**getWorkFlowTrackerList**|POST|Obtain the workflow operation record list|
|**idataCluster**|GET|Query the cluster list corresponding to the user\-assigned clusterId and related service information|
|**isValidJobName**|POST|Verify whether the job name is valid|
|**isValidPlanName**|POST|Verify whether the execution plan name is available|
|**modifyCronJob**|POST|Modify the execution plan of deployment job|
|**modifyJob**|POST|Modify the corresponding job information based on the parameter information transferred in|
|**monitorDetails**|POST|Detailed Data of Service Survival Status Monitoring|
|**monitorServiceList**|POST|All the corresponding service lists under the currently monitored cluster|
|**pauseCronJob**|POST|Suspend a regular task of the job|
|**queryExecutingJobList**|GET|Obtain the tasks in the plan (tasks already added to the quartz scheduler)|
|**queryFloatingIp**|POST|Query the cluster random code (eight digits)|
|**queryServerQuota**|GET|Query the Remaining Server Quota|
|**queryVpcSubnets**|POST|Query Vpc subnet collection|
|**queryVpcs**|POST|Obtain vpc collection|
|**releaseCluster**|POST|Release the clusters corresponding to the assigned clusterId|
|**renewBillingOrder**|POST|Renew the specified cluster in the specified renewal method|
|**resumeCronJob**|POST|Recover a regular task of the job|
|**runCronJobOnce**|POST|Execute a regular task now|
|**runWorkFlow**|POST|Run the specified workflow|
|**saveWorkFlow**|POST|Save the workflow information|
|**showClusterDetails**|GET|Query the corresponding cluster details according to clusterId|
|**showJobDetails**|POST|View the job details corresponding to the specified jobId|
|**validateName**|POST|Check whether the entered cluster name is duplicated|
|**validateUser**|GET|Verify the login user name|
|**wfInstanceDetail**|POST|View the detailed information of the specified workflow|
