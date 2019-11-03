# Log Dump

## I. Dump Configuration

### 1. Create a dump task

To create a dump task, it is required to confirm the added collection configuration, or no dump tasks can be created.

1) Log in the corresponding log set, click **Dump Configuration** in the "Management" after the log subject to be dumped, log in the Dump Configuration Page.

![](https://raw.githubusercontent.com/jdcloudcom/cn/zhangwenjie-only/image/LogService/LogTransfer/logtransfer1.png)

2) Dump Information Configuration

![](https://raw.githubusercontent.com/jdcloudcom/cn/zhangwenjie-only/image/LogService/LogTransfer/logtransfer2.png)

Click **Create Dump Task** to fill in the dump task name (non-null), which only consists of 32 characters at most including Chinese, numbers, uppercase and lowercase letters, English underlines "_" and line-throughs "-".

Select the JD Cloud Object Storage Service to be dumped, which shall be in the same region as the log set and log subject currently dumped. If there are no Object Storage Service resources in the region under the current account of the user, click **Create Object Storage Service** to rapidly create the Object Storage Service resource.

Enter the directory prefix. The prefix shall not start with /. If no directory prefixes are set, it is name of current log set/name of log subject/ by default, for example: servicecode/test-log/test-logapi.

Fill in the partition format. Automatically generate directories according to strptime time formatting, for example, fill in the partition format as %Y/%m/%d, and the generated directory 2017/07/16. The finally delivered file directory is: {OSS Bucket}/{Directory Prefix}/{Partition Format}_{Dump Task id}_{Dump Task Batch}.

Select the dump file size and dump time interval.

Select the dump format and whether to compress. Select the format to be compressed if compression is required.

Click **Save**, to complete creation of Dump Task.

After the dump task is created completely, a delay of about 15 minutes required before dumping.


### 2. Stop the dump task

Log in the Dump Configuration Page, select the dump task to be stopped, click **Stop Dumping** at the back to stop dumping log data.

![](https://raw.githubusercontent.com/jdcloudcom/cn/zhangwenjie-only/image/LogService/LogTransfer/logtransfer3.png)

Click **Log Dump Patent** in the menu on the left of the log service, select the log set, log subject and dump task to be dumped, click **Stop Dumping** to stop dumping log data.

![](https://raw.githubusercontent.com/jdcloudcom/cn/zhangwenjie-only/image/LogService/LogTransfer/logtransfer4.png)

## II. Dump Task History

Log in the page by clicking **View** after the dump task in the dump configuration or **Dump History** in the menu on the left of the log service.

During log dump management, the operations such as stopping dump tasks, modifying dump configurations, etc. can be carried out, and at the same time, the file dump status in dump tasks can be viewed. In case a dump fails, retry operation can be conducted within one hour, but is impossible after one hour.
