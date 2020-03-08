## JCS for Greenplum

The servicecode of the product is jdw and viewing monitoring data of the Master node and the Segment node is supported.

### Master

- When indicator data of the Master node is getting, role in tags shall be assigned as mdw.  

metric | Chinese Name  | English Name |Unit | Description
---|--- |--- |--- |--- 
jdw.instance.connections|连接数|Connections|Nr.|
jdw.instance.cpu_utilization|CPU使用率|CPU utilization|%|
jdw.instance.memory_utilization|内存使用率|Memory utilization|%|
jdw.instance.disk_used|磁盘使用量|Disk space used|MB|
jdw.instance.iops_total|IOPS总量|Total IOPS|Nr.|
jdw.instance.iops_write|写入IOPS|Write IOPS|Nr.|
jdw.instance.iops_read|读取IOPS|Read IOPS|Nr.|
jdw.instance.network_receive|网络接收吞吐量|Network receive Throughput|kbps|
jdw.instance.network_transmit|网络传输吞吐量|Network transmit Throughput|kbps|

### Segment
- Where there are many nodes under the Segment node type, please designate corresponding node name for role in tags when the indicator data is getting, such as sdw1 and sdw2.  
 
metric | Chinese Name  | English Name |Unit | Description
---|--- |--- |--- |--- 
jdw.node.cpu_utilization|CPU使用率|CPU utilization|%|
jdw.node.memory_utilization|内存使用率|Memory utilization|%|
jdw.node.disk_percen|磁盘使用率|Percentage disk space used|%|
jdw.node.disk_used|磁盘使用量|Disk space used|MB|
jdw.node.network_receive|网络接收吞吐量|Network receive Throughput|kbps|
jdw.node.network_transmit|网络传输吞吐量|Network transmit Throughput|kbps|
jdw.node.iops_write|写入IOPS|Write IOPS|Nr.|
jdw.node.throughput_write|写入吞吐量|Write throughput|kbps|
jdw.node.iops_read|读取IOPS|Read IOPS|Nr.|
jdw.node.throughput_read|读取吞吐量|Read throughput|kbps|
