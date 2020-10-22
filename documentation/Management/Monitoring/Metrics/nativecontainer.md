# Native Container 
There are two sub-products of "Container Instance" and "Pod" under Native Container.
## Container Instance
The servicecode of container instance is nativecontainer. Monitoring indicator data contains two dimensions of instance and disk. The specific indicators are as follows:

**Instance**  

metric | Chinese Name | English Name | Unit | Description
---|--- |--- |---|---
nativecontainer.cpu.util | CPU使用率|CPU Usage| % |
nativecontainer.avg.load1 | CPU平均负载1min | CPU AverageLoad 1min | None |
nativecontainer.avg.load15| CPU平均负载15min | CPU AverageLoad 15min | None | 
nativecontainer.tcp.connect.established | TCP有效连接数 | tcpConnection userful | Nr.|
nativecontainer.tcp.connect.total | TCP连接总数 | tcpConnection total | Nr.| 
nativecontainer.memory.usage | 内存使用率 | Memory Usage | % |
nativecontainer.disk.bytes.read | 系统盘读流量 | Disk Read Throughput | Bps| 
nativecontainer.disk.bytes.write |系统盘写流量 | Disk Write Throughput| Bps| 
nativecontainer.network.bytes.incoming |网络进流量 | Network Inbound Traffic | bps | 
nativecontainer.network.bytes.outgoing |网络出流量 | Network Outbound Traffic| bps | 
nativecontainer.power_state | 电源状态 | NativeContainer Power State | None|


**Disk**  
The tag reported by indicator data, whose key is mountPoint and containerName, can view the monitoring data of corresponding container and mount points  

metric | Chinese Name | English Name | Unit | Description
---|--- |--- |---|---
nativecontainer.disk.dev.used |磁盘使用率 | Disk Usage | % | 
nativecontainer.disk.dev.total|磁盘总量  | Disk Total | Bytes| 
nativecontainer.disk.dev.free |磁盘空闲量 | Disk Free | Bytes| 
nativecontainer.disk.dev.inode.used | inode使用率 | Inode Usage | % | 
nativecontainer.disk.dev.inode.total | inode总量 | Inode Total | Nr. | 
nativecontainer.disk.dev.inode.free | inode空闲量| Inode Free | Nr.| 


## Pod
The servicecode of Pod is pod. Monitoring indicator data contains two dimensions of instance and disk. The specific indicators are as follows:

**Instance**  

metric | Chinese Name | English Name | Unit | Description
---|--- |--- |---|---
pod.cpu.util | CPU使用率|CPU Usage| % |
pod.avg.load1 | CPU平均负载1min | CPU AverageLoad 1min | None |
pod.avg.load15| CPU平均负载15min | CPU AverageLoad 15min | None | 
pod.tcp.connect.established | TCP有效连接数 | tcpConnection userful | Nr.|
pod.tcp.connect.total | TCP连接总数 | tcpConnection total | Nr.| 
pod.memory.usage | 内存使用率 | Memory Usage | % |
pod.disk.bytes.read | 系统盘读流量 | Disk Read Throughput | Bps| 
pod.disk.bytes.write |系统盘写流量 | Disk Write Throughput| Bps| 
pod.network.bytes.incoming |网络进流量 | Network Inbound Traffic | bps | 
pod.network.bytes.outgoing |网络出流量 | Network Outbound Traffic| bps | 
pod.power_state | 电源状态 | NativeContainer Power State | None|

**Disk** 
The tag reported by indicator data, whose key is mountPoint and containerName, can view the monitoring data of corresponding container and mount points  

metric | Chinese Name | English Name | Unit | Description
---|--- |--- |---|---
pod.disk.dev.used |磁盘使用率 | Disk Usage | % | 
pod.disk.dev.total|磁盘总量  | Disk Total | Bytes| 
pod.disk.dev.free |磁盘空闲量 | Disk Free | Bytes| 
pod.disk.dev.inode.used | inode使用率 | Inode Usage | % | 
pod.disk.dev.inode.total | inode总量 | Inode Total | Nr. | 
pod.disk.dev.inode.free | inode空闲量| Inode Free | Nr.| 
