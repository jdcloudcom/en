# Description of VM Monitoring Indicators
JD Cloud provide instances with the following monitoring indicators which can be divided into three categories according to the collected and reported preconditions:
* They are collected by the host machine where the instance is located, rather than monitoring plug-in in Virtual Machines. There are 4 indicators of this type, whose Chinese or English display names have suffix ‘(Host)’, including:
  * Disk Read Throughput (Host): vm.disk.bytes.read
  * Disk Write Throughput (Host): vm.disk.bytes.write
  * Network Input Bandwidth  (Host): vm.network.bytes.incoming
  * Network Output Bandwidth (Host): vm.network.bytes.outgoing
* They are collected by the public system components in Virtual Machines. All previous version components support collection and get data as long as these components are not uninstalled. There are 2 indicators of this type, including:
  * CPU Util: vm.cpu.util
  * Memory Util: vm.memory.usage
* The remaining indicators are collected by the public system components in Virtual Machines. Only JCS-Agent components of which versions are not lower than '3.0.989' support collection.
If you can view this type of indicators on the monitoring page, it means that the version of system components in your current environment is too low, please refer to **Monitoring Plug-in Installation Description** at the bottom of this context for installation.

## Indicator Details
The servicecode of product line monitoring data: vm. The indicator details are as follows:
### Instance
metric | Chinese Name | English Name | Unit | Description
---|--- |--- |---|---
cpu.util | CPU使用率 | CPU Usage | % | 
memory.usage | 内存使用率| Memory Usage | % | 
vm.memory.used.bytes | 内存使用量 | Memory Used |  Bytes | 
vm.avg.load1 | 平均负载1min | CPU Average Load 1min | - | 
vm.avg.load5 | 平均负载5min | CPU Average Load 5min |  - | 
vm.avg.load15 | 平均负载15min | CPU Average Load 15min |  - | 
vm.disk.dev.bytes.read | 磁盘读吞吐量 | Disk Read Throughout | Bps|
vm.disk.dev.bytes.write | 磁盘写吞吐量| Disk Write Throughout| Bps|
vm.disk.dev.io.read | 磁盘读IOPS | Disk Read Requests | Count/s | 
vm.disk.dev.io.write |磁盘写IOPS | Disk Write Requests| Count/s | 
vm.network.dev.bytes.in| 网络进速率 | Network Inbound Rate | bps | 
vm.network.dev.bytes.out | 网络出速率 | Network Outbound Rate | bps | 
vm.network.dev.packets.in |网络进包量 | Network Inbound Packets | pps | 
vm.network.dev.packets.out |网络出包量| Network Outbound Packets |  pps | 
vm.netstat.tcp.established |TCP连接数 | TCP Connections |Count | Bare metal has no such indicator
vm.disk.bytes.read |磁盘读吞吐量(host)|Disk Read Throughout(host) |Bps |Bare metal has no such indicator
vm.disk.bytes.write|磁盘写吞吐量(host)| Disk Write Throughout(host)| Bps | Bare metal has no such indicator
vm.network.bytes.incoming | 网络进速率(host) |Network Inbound Rate(host)  |bps | Bare metal has no such indicator
vm.network.bytes.outgoing|网络出速率(host) |Network Outbound Rate(host) |bps  | Bare metal has no such indicator


###  Device - Disk
#### Amount  
**Linux reports by mount point. Windows reports by drive. key of tag is mountPoint. Its value is ‘/’,‘C:’...**

metric | Chinese Name | English Name | Unit | Description
---|--- |--- |---|---
vm.disk.dev.used | 磁盘使用率 | Disk Usage | % | 
vm.disk.dev.used.bytes | 磁盘使用量 | Disk Used | Bytes | 
vm.disk.dev.inode.used | 磁盘inode使用率 | Disk inode Usage | % | 


#### Read-write
**Linux reports by partition device name. Windows reports by drive. key of tag is devName. Its value is ‘/dev/vda1’,‘C:’...**

metric | Chinese Name | English Name | Unit | Description
---|--- |--- |---|---
vm.disk.dev.bytes.read | 磁盘读吞吐量 | Disk Read Throughout | Bps | 
vm.disk.dev.bytes.write| 磁盘写吞吐量| Disk Write Throughout| Bps|
vm.disk.dev.io.read | 磁盘读IOPS | Disk Read Requests | Count/s | 
vm.disk.dev.io.write |磁盘写IOPS | Disk Write Requests| Count/s | 


###  Device - Network  
**key of tag is devName. Its value is 'eth0','eth1'...'eth7'**
 
metric | Chinese Name | English Name | Unit | Description
---|--- |--- |---|---
vm.network.dev.bytes.in| 网络进速率 | Network Inbound Rate | bps | 
vm.network.dev.bytes.out | 网络出速率 | Network Outbound Rate | bps | 
vm.network.dev.packets.in |网络进包量 | Network Inbound Packets | pps | 
vm.network.dev.packets.out |网络出包量| Network Outbound Packets |  pps | 


###  Device - GPU 
**Only the machine of GPU instance type has such indicator. key of tag is gpu_index. Its values are '0’, ‘1’, ‘2’ and ‘3’**

metric | Chinese Name | English Name | Unit | Description
---|--- |--- |---|---
vm.gpu.util.gpu| GPU核使用率 | GPU Core Usage | % | 
vm.gpu.util.mem | GPU内存使用率 | GPU Memory Usage | % | 
vm.gpu.used.mem.bytes | GPU内存使用量 | GPU Memory Used | Bytes | 
vm.gpu.power |GPU功耗| GPU Power |  w | 
vm.gpu.temperature | GPU温度 | GPU Temperature | ℃  | 
vm.gpu.util.encoder | GPU编码器占用率 | GPU Encoder Usage | % | 
vm.gpu.util.decoder | GPU解码器占用率 | GPU Decoder Usage | % |



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
