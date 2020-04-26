## Bastion

The servicecode of this product for getting monitoring data is bastion. One Bastion instance can be deployed on one or more nodes (containers), therefore the monitoring data can be used as indicator data of two dimensions, instance and node.

Note: When monitoring data of node dimension are getting, key in tags shall be designated as resource_name and specific container name shall be designated for value. The container name is in the fixed format, with details as follows:
- For Bastion instances of specifications 5, 20, 50, 100 and 200, there is only 1 node, and the container name format is: Bastion Instance ID-log-0.
- For Bastion instances of specifications 500, 1,000 and 5,000, there are 4 nodes. Their container names are as follows: Bastion Instance ID-log-0, Bastion Instance ID-relay1-0, Bastion Instance ID-relay2-0 and Bastion Instance ID-relay3-0.

metric | 中文名称  | English Name |Unit | Description
---|--- |--- |--- |--- 
bastion.cpu.util|CPU使用率|CPU Usage|%|
bastion.memory.usage|内存使用率|Memory Usage|%|
bastion.disk.bytes.read|磁盘读字节数|Disk Read Bytes|MB|
bastion.disk.bytes.write|磁盘写字节数|Disk Write Bytes|MB|
bastion.network.bytes.incoming|网络接收字节数|Nework Incoming Bytes|MB|
bastion.network.bytes.outgoing|网络发送字节数|Network Outgoing Bytes|MB|
bastion.disk.iops.read|磁盘读IOPS|Disk Read Iops|Nr./s|
bastion.disk.iops.write|磁盘写IOPS|Disk Write Iops|Nr./s|
bastion.disk.usage|磁盘使用率|Disk use percent|%| Provide this indicator to node dimension only
