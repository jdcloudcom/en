# Monitor RDS  

## **Install monitoring plug-ins**   
Log in to the Virtual Machines needed to be the detection source (only Linux machines supported), and install monitoring plug-ins. Specific procedures are as below:  
1. Replicate installation commands to Virtual Machines according to the region where Virtual Machines locate.  

Region | Installation command
------------|---------------------
cn-north-1          | `wget -c http://devops-hb.oss-internal.cn-north-1.jcloudcs.com/ifrit/ifrit-agent-external-v0.01.403.a81f9eb.20181127121007.bin -O installer && sh installer -- -a jcmagent /usr/local/share/jdcloud/ifrit && rm -f installer`  
cn-east-2          | `wget -c http://devops-hd.oss-internal.cn-east-2.jcloudcs.com/ifrit/ifrit-agent-external-v0.01.403.a81f9eb.20181127121007.bin -O installer && sh installer -- -a jcmagent /usr/local/share/jdcloud/ifrit && rm -f installer`  
cn-east-1         | `wget -c http://devops-sq.oss-internal.cn-east-1.jcloudcs.com/ifrit/ifrit-agent-external-v0.01.403.a81f9eb.20181127121007.bin -O installer && sh installer -- -a jcmagent /usr/local/share/jdcloud/ifrit && rm -f installer` 
cn-south-1               | `wget -c http://devops.oss-internal.cn-south-1.jcloudcs.com/ifrit/ifrit-agent-external-v0.01.403.a81f9eb.20181127121007.bin -O installer && sh installer -- -a jcmagent /usr/local/share/jdcloud/ifrit && rm -f installer` 

2. Press Enter key to execute installation operation. Wait for 1 to 3 minutes until the monitoring plug-in is installed, confirm the jcmagent process with the command ps –ef | grep jcmagent and make sure the monitoring plug-in is successfully installed.  

## **Create the monitoring task**   
1. Log in to JD Cloud & AI Detection Console and click **Management->Cloud Detection->Availability Monitoring** to enter the availability monitoring task list page. Click **Create Task** in the upper left corner.  

2. Complete configuration information
- Complete the availability monitoring task name, such as: test_22  
- Select the detection source, and select the Virtual Machines in which the monitoring plug-in has been installed, and the plug-in is in "normal" status.  
- Select RDS as the detection target, use the detection protocol TELNET and select the database to be detected.  
3. Click **Confirm** to complete creation. The monitoring task will continuously detect intranet DNS address of data according to the detection source selected.  

## **View monitoring graph**  
After the above-mentioned task is successfully added, wait for 5 to 10 minutes, and click **Monitoring Graph** in the availability monitoring task list to view the response time and availability to the detection target of the task in the selected detection source.  

## **Set alarm**    
1. Return to the availability monitoring task list, click **Alarm Rule** to enter the **Alarm Rule** page, and click **Add Alarm Rule** to open the set alarm rule page.  

2. Select monitoring items, such as availability rate, statistical period (e.g. 5 minutes), statistical method (e.g. average value), calculation method (e.g. less than), threshold (e.g. 80%) and duration period (e.g. 2 cycles). Click **Next** to set the notification method, select the contact to be notified and click **Next** to finish alarm configuration.  
Note: Alarm service will continuously monitor access availability rate of RDS intranet domain. Once the alarm threshold is reached, a notice will be immediately given.

