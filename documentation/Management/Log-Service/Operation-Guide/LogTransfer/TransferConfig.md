# Log Dump
## 1. Overview
The requirements for log vary as the user's business is different. Some logs have long-term storage and offline analysis requirements, such as logs in security audit class. In order to reduce user's costs, the Log Service supports users to dump the log data into OSS. After dump, the user can download the required log data in the corresponding bucket of OSS.

The dump supports the selection on whether compression or not. Compressed dump can further reduce the cost, which supports the compression formats of snappy and gzip. You can also select an appropriate format to dump. JSON format and original format are supported.

## 2. Operation Steps

### Create a dump task

To create a dump task, it is required to confirm the added collection configuration, or no dump tasks can be created.

1) Enter a corresponding log set, select the log subject of dump task to be created, directly click the **Add** button behind **Log Dump** or click **Log Dump**, select **Dump Task List** in the draw-down box and click **Create Dump Task**.

![](https://raw.githubusercontent.com/jdcloudcom/cn/zhangwenjie-only/image/LogService/LogTransfer/createLogTransfer01.jpg)

2) Dump Information Configuration

Click **Create Dump Task** to fill in the dump task name (non-null), which only consists of 32 characters at most including Chinese, numbers, uppercase and lowercase letters, English underlines "_" and line-throughs "-".

Select the JD Cloud Object Storage Service to be dumped, which shall be in the same region as the log set and log subject currently dumped. If there are no Object Storage Service resources in the region under the current account of the user, click **Create Object Storage Service** to rapidly create the Object Storage Service resource.

Enter the directory prefix. The prefix shall not start with /. If no directory prefixes are set, it is name of current log set/name of log subject/ by default, for example: servicecode/test-log/test-logapi.

Fill in the partition format. Automatically generate directories according to strptime time formatting, for example, fill in the partition format as %Y/%m/%d, and the generated directory 2017/07/16. The finally delivered file directory is: {OSS Bucket}/{Directory Prefix}/{Partition Format}_{Dump Task id}_{Dump Task Batch}.

Select the dump file size and dump time interval.

Select the dump format and whether to compress. Select the format to be compressed if compression is required.

Click **Save**, to complete creation of Dump Task.

After the dump task is created completely, a delay of about 15 minutes required before dumping.

![](https://raw.githubusercontent.com/jdcloudcom/cn/zhangwenjie-only/image/LogService/LogTransfer/createLogTransfer02.jpg)

### Stop the dump task

Log in the Dump History Page, select a dump task to be stopped and click **Stop Dump**. Then, log data dump can be stopped.

### II. Dump Task History

Click the sub-menu **Dump History** under **Log Dump** and enter the page. View dump history of dump tasks.

![](https://raw.githubusercontent.com/jdcloudcom/cn/zhangwenjie-only/image/LogService/LogTransfer/transferHistory03.jpg)

## 3. Points for Attention
1. In the current version, it only supports dumping the log data to OSS under the user's own name.
2. After compressed delivery, it can further reduce the storage cost.
3. After being dumped to OSS, the fees required will be reflected in the bill of OSS, and charged by OSS.
4. At most 10 dump tasks are supported to be created under a single log topic.



