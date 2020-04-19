# Monitoring and Alarm Overview
Instance monitoring and alarms provide you with real-time instance monitoring management services, which support different monitoring dimensions, and start collecting data after instance is created successfully. It can be displayed graphically, which is convenient for you to grasp the usage of instance resources and running status. At the same time, you can set different alarm rules and the alarm notification will be triggered when this type of condition is triggered, which can  locate the fault easily for you.
## Monitoring Items 
JD Cloud & AI provide instances with the following monitoring indicators which can be divided into three categories according to the collected and reported preconditions:
* They are collected by the host machine where the instance is located, rather than monitoring plug-in in Virtual Machines. There are 4 indicators of this type, whose Chinese or English display names have suffix ‘(Host)’, including:
  * Disk Read Throughput (Host): vm.disk.bytes.read
  * Disk Write Throughput (Host): vm.disk.bytes.write
  * Network Input Bandwidth  (Host): vm.network.bytes.incoming
  * Network Output Bandwidth (Host): vm.network.bytes.outgoing
* They are collected by the public system components in Virtual Machines. All previous version components support collection and get data as long as these components are not uninstalled. There are 2 indicators of this type, including:
  * CPU Util: vm.cpu.util
  * Memory Util: vm.memory.usage
* They are collected by the public system components in Virtual Machines. Only JCS-Agent components of which versions are not lower than '3.0.989' support collection. Other than the above 6 indicators, other indicators in the table below are of this type, **if you can view this type of indicators on the monitoring page, it means that the version of system components in your current environment is too low, please refer to [Following Documents](monitoring-overview#user-content-1) for installation.**

<table>
	<thead>
    <tr>
		<th colspan="2">Monitoring Indicator</th>
      	<th>Indicator Meaning</th>
      	<th>Unit</th>
        <th>Report Dependence</th>
        <th>Description</th>
    </tr>
	</thead>
	<tbody>
    <tr>
        <td rowspan="4">CPU</td>
        <td> CPU Util   <br>vm.cpu.util</td>
        <td> Percentage of non-idle vCPU</td>
        <td> % </td>
        <td> For Agent built in public images, all versions support collecting this indicator</td>
        <td> Dimension: None</td>   
    </tr>
    <tr>
        <td> CPU Average Load (1min)  <br>vm.avg.load1</td>
        <td> System average load in the past 1 min of sampling instant</td>
        <td> None </td>
        <td rowspan="3"> JCS-Agent of which versions are not lower than '3.0.989'</td>
        <td rowspan="3"> Dimension: None<br>Only Linux system has this group of indicators</td>   
    </tr>
    <tr>
        <td> CPU Average Load (5min)  <br>vm.avg.load5</td>
        <td> System average load in the past 5 min of sampling instant</td>
        <td> None </td>
    </tr>
    <tr>
        <td> CPU Average Load (15min)  <br>vm.avg.load15</td>
        <td> System average load in the past 15 min of sampling instant</td>
        <td> None </td>
    </tr>
    <tr>
        <td rowspan="2">Memory</td>
        <td> Memory Util   <br>vm.memory.usage</td>
        <td> Percentage of used memory in total memory</td>
        <td> % </td>
        <td> For Agent built in public images, all versions support collecting this indicator</td>
        <td> Dimension: None</td>   
    </tr>
    <tr>
        <td> Memory Used   <br>vm.memory.used.bytes</td>
        <td> Used Memory in System</td>
        <td> Bytes </td>
        <td> JCS-Agent of which versions are not lower than '3.0.989'</td>
        <td> Dimension: None</td>   
    </tr>
    <tr>
        <td rowspan="9">Disk</td>
        <td> Disk Read Throughput (Host)  <br>vm.disk.bytes.read</td>
        <td> Number of Bytes Read Per Second On Disk (All Disks)</td>
        <td> Bps </td>
        <td rowspan="2"> None</td>
        <td rowspan="2"> Dimension: None<br>Host Machine Collection, Entire Disk Throughput of Instance</td>   
    </tr>
    <tr>
        <td> Disk Write Throughput (Host)  <br>vm.disk.bytes.write</td>
        <td> Number of Bytes Write Per Second On Disk (All Disks)</td>
        <td> Bps </td>
    </tr>
    <tr>
        <td> Disk Read Throughput  <br>vm.disk.dev.bytes.read</td>
        <td> Number of bytes read per second on the disk</td>
        <td> Bps </td>
        <td rowspan="7"> JCS-Agent of which versions are not lower than '3.0.989'</td>
        <td rowspan="4"> Dimension: Device file name (report taking 'devName' as tag) e.g.: <br>* Linux: 'devName'='/vda','/vdb1', ...<br>* Windows: ‘devName’='C','D', ...<br>Linux System. If the disk has partitions, report the statistics by partition. If no partition, report the statistics by disk; for Windows system, report the statistics by drive</td>   
    </tr>    
    <tr>
        <td> Disk Write Throughput  <br>vm.disk.dev.bytes.write</td>
        <td> Number of bytes written per second on the disk</td>
        <td> Bps </td> 
    </tr>       
    <tr>
        <td> Disk Read IOPS  <br>vm.disk.dev.io.read</td>
        <td> Disk Read Requests Per Second</td>
        <td> Count/s</td> 
    </tr>    
    <tr>
        <td> Disk Write IOPS  <br>vm.disk.dev.io.write</td>
        <td> Disk Write Requests Per Second</td>
        <td> Count/s</td> 
    </tr>        
    <tr>
        <td> Disk Util  <br>vm.disk.dev.used</td>
        <td>Percentage of Disk Usage</td>
        <td> % </td>
        <td rowspan="3"> Dimension: Mount Point (report taking ‘mountPoint’ as tag) e.g.: <br>* Linux: 'mountPoint'='/','/mnt', ...<br>* Windows: ‘mountPoint’='C','D', ...<br>Linux System report the statistics by mount point; for Windows system, report the statistics by drive<br>Only Linux system provides the 'disk inode utilization rate' indicator</td>   
    </tr>  
    <tr>
        <td> Disk Used <br>vm.disk.dev.used.bytes</td>
        <td>Capacity of Disk Usage</td>
        <td> Bytes </td>
    </tr>  
    <tr>
        <td> Disk inode Utilization Rate <br>vm.disk.dev.inode.used</td>
        <td> Percentage of Used Inode in Disk File System</td>
        <td> % </td>
    </tr>  
    <tr>
        <td rowspan="7">Network</td>
        <td> Network Input Bandwidth  (Host)  <br>vm.network.bytes.incoming</td>
        <td> Bytes Received by Network Interface Per Second (Sum Of All Network Interfaces)</td>
        <td> bps </td>
        <td rowspan="2"> None</td>
        <td rowspan="2"> Dimension: None<br>Host Machine Collection, Entire Network Bandwidth of Instance, Network Interface and Internet/Internet without Partition</td>   
    </tr>
    <tr>
        <td> Network Output Bandwidth (Host)  <br>vm.network.bytes.outgoing</td>
        <td> Bytes Sent by Network Interface Per Second (Sum Of All Network Interfaces)</td>
        <td> bps </td>
    </tr>
    <tr>
        <td> Network Input Bandwidth  (Host)  <br>vm.network.dev.bytes.in</td>
        <td> Bytes Received by Network Interface Per Second</td>
        <td> bps </td>
        <td rowspan="5"> JCS-Agent of which versions are not lower than '3.0.989'</td>
        <td rowspan="4"> Dimension: Network Interface (report taking ‘devName’ as tag) e.g.: <br>* Linux/Windows: 'devName'='eth0','eth1', ...<br>Entire Data Indicator of Network Interface, Internet/Internet without Partition</td>   
    </tr>
    <tr>
        <td> Network Output Bandwidth <br>vm.network.dev.bytes.out</td>
        <td> Bytes Sent by Network Interface Per Second</td>
        <td> bps </td> 
    </tr>
    <tr>
        <td> Network Ingress Packets  <br>vm.network.dev.packets.in</td>
        <td> Network Interface Ingress Packets Per Second</td>
        <td> pps </td> 
    </tr>
    <tr>
        <td> Network Egress Packets  <br>vm.network.dev.packets.out</td>
        <td> Network Interface Egress Packets Per Second</td>
        <td> pps </td> 
    </tr>
    <tr>
        <td> TCP Connections  <br>vm.netstat.tcp.established</td>
        <td> TCP Connections in ESTABLISHED status</td>
        <td> Count </td> 
        <td> Dimension: None </td> 
    </tr>    
    <tr>
        <td rowspan="7">GPU</td>
        <td> GPU Power<br>vm.gpu.power</td>
        <td> GPU Power</td>
        <td> Wt </td>
        <td rowspan="7"> JCS-Agent of which versions are not lower than '3.0.989'</td>
        <td rowspan="7"> Dimension: GPU Card (report taking ‘gpu_index’ as tag) e.g.: <br>* Linux/Windows: 'gpu_index‘=’0’,’1’,’2’,’3’, ...<br>Only GPU instance type has this group of indicators</td>   
    </tr>    
    <tr>
        <td> GPU Temperature <br>vm.gpu.temperature</td>
        <td> GPU Temperature</td>
        <td> ℃ </td>
    </tr>      
    <tr>
        <td> GPU Core Utilization Rate <br>vm.gpu.util.gpu</td>
        <td> GPU Core Utilization Rate</td>
        <td> % </td>
    </tr>     
    <tr>
        <td> 	GPU Encoder Utilization Rate <br>vm.gpu.util.encoder</td>
        <td> 	GPU Encoder Utilization Rate</td>
        <td> % </td>
    </tr>
    <tr>
        <td> 	GPU Decoder Utilization Rate <br>vm.gpu.util.decoder</td>
        <td> 	GPU Decoder Utilization Rate</td>
        <td> % </td>
    </tr>    
    <tr>
        <td> 	GPU Memory Util <br>vm.gpu.util.mem</td>
        <td> 	GPU Memory Util</td>
        <td> % </td>
    </tr>     
    <tr>
        <td> 	GPU Memory Used <br>vm.gpu.used.mem.bytes</td>
        <td> 	GPU Memory Used</td>
        <td> Bytes </td>
    </tr>     
	</thead>
</table> 
 
 
 
 
<div id="user-content-1"></div>

## Monitoring Plug-in Installation Description

The collection and report of VM Monitoring data rely on 'MonitorPlugin' Plug-in in the public image system component 'JCS-Agent'. The public image which was upgraded from May to July 2019 has installed by default the upgrade tool 'ifrit' to implement the automatic upgrade of JCS-Agent.<br>

If your current instance didn't install JCS-Agent or installed a lower version that has no automatic upgrade ability, you can directly install ifrit provided that you can ensure the early-stage system components cloud-init and QGA were uninstalled. Within 10 minutes after the installation, JCS-Agent will be automatically installed / updated to the latest version.<br>

* For the uninstallation method of cloud-init and QGA and the installation method of Ifrit, refer to: [Public Image System Component-JCS-Agent](https://docs.jdcloud.com/en/virtual-machines/default-agent-in-public-image#user-content-1)
* JCS-Agent Version View Method:
  * Linux：
  `
   ps -ef|grep MonitorPlugin
  `
  * Windows：
  `
  wmic process where caption="MonitorPlugin.exe" get caption,commandline /value
  `
  
## Monitoring Data Description
* The collection cycle of monitoring data is 10s and the minimum display interval is 1min;
* Different indicators have different default aggregation methods, and you can view aggregation methods of each indicator in the monitoring graph;
* The statistical period supports 1 hour, 6 hours, 12 hours, 1 day, 3 days, 7 days and 14 days by default. In addition, you can also set the statistical period, with the shortest 1 minute and the longest one month;
* Monitoring values in different statistics cycle will be aggregated correspondingly. For example, if the statistics cycle is 6 hours, the monitoring graph will display one monitoring value every 5 minutes and this monitoring value is aggregated by the collected values in the corresponding statistics cycle. Currently, only support search with default aggregation method;
* The monitoring data can be saved for up to 180 days. In the console, users can observe the monitoring data for 30 days. If you need to obtain monitoring data for 30 days-180 days, please open ticket.

## Others
* bps indicates the number of bits transmitted per second, ps is per second, the same meaning as /s;
* Bps refers to Bytes transmitted per second, ps refers to per second, meaning /s;
* Kbps=1000bps，KBps=1000Bps。
  
 
   
