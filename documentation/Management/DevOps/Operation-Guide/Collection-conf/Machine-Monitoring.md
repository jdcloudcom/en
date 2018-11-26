# Machine Monitoring

The purpose of the machine monitoring is to monitor the utilization of the resources, such as the utilization of cpu/physical memory/swap partition/disks of the machine. The agent will collect automatically without making configuration by the user.

## CPU
The following are cpu related monitoring indicators, the meaning of each indicator can be understood with reference to /proc/stat

| Names of Monitoring Items    | Meaning of Monitoring Items                 | Unit | Description |
| --------------- | --------------------------- | ---- | ---- |
| cpu.idle        | Percentage of Idle CPU               | %    |      |
| cpu.user        | Percentage of CPU Occupied by User Space       | %    |      |
| cpu.sys         | Percentage of CPU Occupied by Kernel Space       | %    |      |
| cpu.iowait      | Percentage of CPU Waiting for IO Operation       | %    |      |
| cpu.nice        | nice(Priority preemption) CPU Consumption Proportion | %    |      |
| cpu.irq         | Percentage of CPU Occupied by Hard Interruption Processing Program | %    |      |
| cpu.softIrq     | Percentage of CPU Occupied by Soft Interruption Processing Program | %    |      |
| cpu.steal       | Proportion of time that the virtual cpu takes to wait for real cpu    | %    |      |
| cpu.guest       | Proportion of Virtual CPU Operation Time           | %    |      |
| cpu.idle.min    | cpu.idleMinimum in Single Core        | %    |      |
| cpu.iowait.max  | cpu.iowaitMaximum in Single Core      | %    |      |
| cpu.softIrq.max | cpu.softIrqMaximum in Single Core     | %    |      |
| cpu.sys.max     | cpu.sysMaximum in Single Core         | %    |      |
| cpu.user.max    | cpu.userMaximum in Single Core        | %    |      |
| cpu.use         | cpuUtilization Rate of xxx may exceed 100  | %    |      |
| cpu.use.max     | cpu.useMaximum in Single Core         | %    |      |



## Memory

For memory related monitoring indicator, the meaning of each indicator can be understood with reference to /proc/meminfo. Unit: KB = kilobytes

| Names of Monitoring Items         | Meaning of Monitoring Items           | Unit | Description                              |
| ------------------ | -------------------- | ---- | --------------------------------- |
| mem.free.KB        | Remaining Physical Memory       | KB   | free                              |
| mem.free.percent   | Percentage of Remaining Physical Memory   | %    | free/total                        |
| mem.usable.KB      | Available Physical Memory         | KB   | free + buffers + cached           |
| mem.usable.percent | Percentage of Available Physical Memory   | %    | (free + buffers + cached) / total |
| mem.buffers.KB     | bufferPhysical Memory Occupied   | KB   |                                   |
| mem.cached.KB      | cachePhysical Memory Occupied    | KB   |                                   |
| mem.total.KB       | Total Physical Memory         | KB   |                                   |
| mem.use.KB         | Consumed Physical Memory       | KB   |                                   |
| mem.use.percent    | Percentage of Consumed Physical Memory | %    |                                   |
| swap.free.KB       | swapSize of Partition Idle     | KB   |                                   |
| swap.free.percent  | swapPercentage of Partition Idle   | %    |                                   |
| swap.total.KB      | swapTotal Partition         | KB   |                                   |
| swap.use.KB        | swapSize of Partition Usage     | KB   | Corresponding to mem.free.*                  |
| swap.use.percent   | swapPercentage of Partition Usage  | %    |  Corresponding to mem.free.*                   |

```sql
Note: If the Kernel supports Available, then mem.usable.* = MemAvailable.
If the Kernel does not support Available, then mem.usable.* = MemFree + Buffers + Cached.
```
## Load

For system average load related monitoring indicator, the meaning of each indicator can be understood with reference to /proc/loadavg. The higher the monitoring item value is, the busier the system is

| Names of Monitoring Items     | Meaning of Monitoring Items               | Unit | Description |
| -------------- | ------------------------ | ---- | ---- |
| load.avg_1min  | System Average Load in the Past 1 Minute  |      |      |
| load.avg_5min  | System Average Load in the Past 5 Minutes  |      |      |
| load.avg_15min | System Average Load in the Past 15 Minutes |      |      |



## Disk

For disk related monitoring indicator, the meaning of each indicator can be understood with reference to /proc/self/mounts.
Tag indicates the usage of certain specific attach point, such as disk.io.read_merged tags: device=sda

| Names of Monitoring Items               | Meaning of Monitoring Items             | Unit | Description |
| ------------------------ | ------------------- | ---- | ---- |
| disk.free.KB             | Idle Disk Capacity          | KB   |      |
| disk.free.percent        | Percentage of Idle Disk      | %    |      |
| disk.free.inodes         | Number of Idle Inodes in Disk     | Nr. |      |
| disk.free.inodes.percent | Percentage of Idle Inodes in Disk | %    |      |
| disk.total.KB            | Total Disk Capacity            | KB   |      |
| disk.total.inodes        | Total Number of Inodes in Disk       | Nr. |      |
| disk.use.KB              | Disk Usage          | KB   |      |
| disk.use.percent         | Percentage of Disk Usage      | %    |      |
| disk.use.inodes          | Usage of Inodes in disk     | Nr. |      |
| disk.use.inodes.percent  | Percentage of Used Inodes in Disk | %    |      |



For disk io related monitoring indicator, the meaning of each indicator can be understood with reference to /proc/diskstats.

| Names of Monitoring Items            | Meaning of Monitoring Items               | Unit | Description         |
| ------------------ | ------------------------ | ---- | ------------ |
| disk.io.read.KBps  | Number of Bytes Read per Second on the Disk     | KB/s |              |
| disk.io.write.KBps | Number of Bytes Written per Second on the Disk     | KB/s |              |
| disk.io.avgrq_sz   | Average (Block) Size of the Disk io Request |      |              |
| disk.io.avgqu_sz   | Queue Length of the Disk io Request       | Nr. |              |
| disk.io.await      | Average Processing Time of the Disk io Request   | Microsecond | Including waiting time |
| disk.io.svctm      | Average Processing Time of the Disk io Request   | Microsecond |              |
| disk.io.util       | Disk io Usage Rate             | %    |              |



## Networking

The following are memory related monitoring indicators, the meaning of each indicator can be understood with reference to /proc/meminfo. Unit: KB = kilobytes


    PS: Currently, network interfaces beginning with the following content are collected by default. If it is required to collect other network interfaces, it can be achieved by modifying the name of the network interface
    
    1. eth
    2. em
    3. bond
    4. en
    5. vEth
    6. Ethernet


| Names of Monitoring Items              | Meaning of Monitoring Items                         | Unit | Description |
| ----------------------- | ------------------------------------ | ---- | ---- |
| net.in.bps              | Network Inflow Speed                         | bps  |      |
| net.in.pps              | Network Inflow Package Speed                       | pps  |      |
| net.out.bps             | Network Outflow Speed                         | bps  |      |
| net.out.pps             | Network Outflow Package Speed                       | pps  |      |
| net.speed.bps           | Network Speed                             | bps  |      |
| net.in.errors.ps        | Network Inflow Error(s)/Second                    | Nr.   |      |
| net.in.dropped.ps       | Total Number of Data Packages Discarded by Device Driver Entrance     | Nr.   |      |
| net.in.fifo.errs.ps     | Number of FIFO Buffer Errors                 | Nr.   |      |
| net.in.frame.errs.ps    | Number of  Packet Frame Errors                     | Nr.   |      |
| net.in.compressed.ps    | Number of Compressed Data Packages Received by Device Driver         | Nr.   |      |
| net.in.multicast.ps     | Number of Multicast Frames Sent or Received by Device Driver     | Nr.   |      |
| net.out.errors.ps       | Network Outflow Error(s)/Second                    | Nr.   |      |
| net.out.dropped.ps      | Total Number of Data Packages Discarded by Device Driver Exit     | Nr.   |      |
| net.out.fifo.errs.ps    | Number of FIFO Buffer Errors                 | Nr.   |      |
| net.out.collisions.ps   | Number of Conflicts Detected on the Interface                 | Nr.   |      |
| net.out.carrier.errs.ps | Number of Carrier Losses Detected by the Device Driver | Nr.   |      |
| net.out.compressed.ps   | Number of  Compressed Data Packages Sent by Device Driver           | Nr.   |      |



## socket

The following are memory related monitoring indicators, the meaning of each indicator can be understood with reference to /proc/meminfo. Unit: KB = kilobytes

| Names of Monitoring Items       | Meaning of Monitoring Items                  | Unit | Description |
| --------------- | -------------------------- | ---- | ---- |
| net.socket.used | Total Number of All Protocol Sockets Used | Nr.   |      |



## TCP
The following are memory related monitoring indicators, the meaning of each indicator can be understood with reference to /proc/meminfo. Unit: KB = kilobytes

| Names of Monitoring Items                 | Meaning of Monitoring Items                                                    | Unit  | Description                                                         |
| --------------------------- | ------------------------------------------------------------ | ----- | ------------------------------------------------------------ |
| net.socket.tcp.inuse        | Number of TCP Sockets in Use (being listening).                        | Nr.    | Its value ≤ netstat –1nt                                           |
| net.tcp.curr_estab          | tcpNumber of Current Links                                                | Nr.    |                                                              |
| net.socket.tcp.orphan       | Number of TCP Connections without Owner (not belonging to any process)                            | Nr.    | Number of TCP Sockets Unnecessary and to Be Destroyed                                   |
| net.socket.tcp.tw           | Number of TCP Connections Waiting to Be Disabled                                          | Nr.    | netstat –ant                                                 |
| net.socket.tcp.alloc        | Number of TCP Sockets that Have Been Assigned (established, applied for sk_buff)             | Nr.    | Equal to netstat –ant                                             |
| net.socket.tcp.mem          | Usage of Socket Buffer                                           |       |                                                              |
| net.tcp.listen_overflows.ps | After completing the final step of three-way handshake, add 1 when the accept queue has exceeded the upper limit             | Nr./Second | Fully connected queue, its size is min(/proc/sys/net/core/somaxconn, backlog) |
| net.tcp.listen_drops.ps     | Any reason, including Accept queue exceeds the limit, create new connection, fail to inherit port, etc. add 1 | Nr./Second |                                                              |
| net.tcp.loss.ps             | tcpNumber of Times the Protocol Stack Recovered due to Data Packages Lost                          | Nr./Second |                                                              |
| net.tcp.abort_on_syn.ps     | Number of Times the Connection was Reset Arising From Receiving the Wrong syn Package (SN error)             | Nr./Second |                                                              |
| net.tcp.abort_on_data.ps    | Number of times the Connection was Reset when the Sock Status has Entered into Semi-connection under the Status of TCP_FIN_WAIT1 or TCP_FIN_WAIT2 But still Received Data | Nr./Second |                                                              |
| net.tcp.abort_on_close.ps   | Number of Times the Relevant Data that Have not Been Read Still Exists when Sock is Disabled                          | Nr./Second |                                                              |
| net.tcp.abort_on_memory.ps  | Number of Times that the Reset Directly Occurs due to Insufficient Memory when Sock is Disabled                  | Nr./Second |                                                              |
| net.tcp.abort_on_timeout.ps | tcpNumber of Times the Sock is Disabled Because the Repeat Times that Timers of Protocol Stack Expire Have Exceeded Maximum Limit    | Nr./Second |                                                              |
| net.tcp.abort_on_linger.ps  | Number of Times the Reset Directly Occurs in Case that the Status is under the State of TCP_FIN_WAIT2 when Sock is Disabled         | Nr./Second |                                                              |
| net.tcp.abort_failed.ps     | tcpNumber of Times the Protocol Stack Failed to Send the Reset Package                       | Nr./Second |                                                              |
| net.tcp.in_errs.ps          | Network Inflow Error(s)/Second                                            |Nr./Second |                                                              |
| net.tcp.in_segs.ps          | tcpNumber of Data Packages Received by the Protocol Layer                                    | Nr./Second |                                                              |
| net.tcp.out_segs.ps         | tcpNumber of Data Packages Sent from the Protocol Layer                                     | Nr./Second |                                                              |
| net.tcp.retrans_segs.ps     | Number of Times of TCP Retransmission/Second                                               | Nr./Second |                                                              |
| net.tcp.active_opens.ps     | Number of Times that TCP is Actively Enabled/Second                                           | Nr./Second |                                                              |



## UDP

The following are memory related monitoring indicators, the meaning of each indicator can be understood with reference to /proc/meminfo. Unit: KB = kilobytes

| Names of Monitoring Items               | Meaning of Monitoring Items                 | Unit  | Description |
| ------------------------ | -------------------------- | ----- | ---- |
| net.socket.used          | Total Number of All Protocol Sockets Used | Nr.  |      |
| net.socket.tcp.inuse     | Total Number of TCP Protocol Sockets Used  | Nr.  |      |
| net.udp.rcvbuf_errors.ps | Buffer Error Received by UDP/Second    | Nr./Second |      |
| net.udp.sndbuf_errors.ps | Buffer Error Sent by UDP/Second     | Nr./Second |      |



## netfilter

The following are memory related monitoring indicators, the meaning of each indicator can be understood with reference to /proc/meminfo. Unit: KB = kilobytes

| Names of Monitoring Items             | Meaning of Monitoring Items                                                  | Unit | Description |
| ---------------------- | ------------------------------------------------------------ | ---- | ---- |
| net.nf.conntrack.count | Size of Current Connection Tracking Form/proc/sys/net/nf_conntrack_count          |      |      |
| net.nf.conntrack.usage | Utilization Rate of Connection Tracking Form nf_conntrack_count/nf_conntrack_max * 100 |      |      |

