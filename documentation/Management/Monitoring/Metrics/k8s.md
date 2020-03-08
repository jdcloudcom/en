The servicecode for JCS for Kubernetes to obtain monitoring data is jke, providing indicator data in three dimensions of cluster, node group and node. Details are as follows:

**Cluster** 

metric | Chinese Name | English Name | Unit | Description
---|--- |--- |---|---
jke.node.status.ready | 节点就绪状态 | Node Ready Status | None| 
jke.node.status.notready | 节点未就绪状态 | Node NotReady Status | None | 
jke.node.status.unknown | 节点未知状态 | Node Unknown Status | None | 
jke.pod.pending.count | 节点中待运行Pod数量 | Pending Pod Count | None | 
jke.pod.running.count | 节点中运行中Pod数量 | Running Pod Count | None | 
jke.pod.succeeded.count | 节点中成功Pod数量 |  Succeeded Pod Count | None | 
jke.pod.failed.count | 节点中失败Pod数量 | Failed Pod Count | None | 
jke.pod.unknown.count| 节点中未知状态Pod数量 | Unknown Pod Count | None | 
jke.api.request.count | API请求次数 | Api Request Count | Times| 
jke.api.request.size | API请求字节 | Api Reqeust Size | byte | 
jke.api.response.size | API响应字节 | Api Response Size  | byte | 
jke.cpu_util | CPU使用率 | CPU Usage | % | 
jke.memory.usage | 内存使用率 | Memory Usage | % |
jke.vm.disk.bytes.read | 系统盘读流量 | Disk Read Bytes | Bps | 
jke.vm.disk.bytes.write | 系统盘写流量 | Disk Write Bytes | Bps |
jke.vm.network.bytes.incoming | 网络进流量 | Network Incoming Bytes | bps|
jke.vm.network.bytes.outgoing | 网络出流量 | Network Outgoing Bytes | bps|

**Node Group/Node**  
- When getting the node group monitoring data, nodegroup_id in tags shall specify the ID of Node Group to be queried.
- When getting the node monitoring data, the node group where the node is in and the node information shall be specified. Besides, nodegroup_id in tags shall specify the node group ID to which the node subordinates, and node_id shall specify the node ID to be queried.

metric | Chinese Name | English Name | Unit | Description
---|--- |--- |---|---
jke.cpu_util | CPU使用率 | CPU Usage | % | 
jke.memory.usage | 内存使用率 | Memory Usage | % |
jke.vm.disk.bytes.read | 系统盘读流量 | Disk Read Bytes | Bps | 
jke.vm.disk.bytes.write | 系统盘写流量 | Disk Write Bytes | Bps |
jke.vm.network.bytes.incoming | 网络进流量 | Network Incoming Bytes | bps|
jke.vm.network.bytes.outgoing | 网络出流量 | Network Outgoing Bytes | bps|
