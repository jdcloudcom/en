# Load Balancer
There are two sub-products of Application Load Balancer and Network Load Balancer under Load Balancer.

## Application Load Balancer
The servicecode of Application Load Balancer is balance. To view the indicator data for a port, the port in tags shall specify a specific port number.
The monitoring indicators it provides are as follows:  

metric | Chinese Name | English Name | Unit | Description
---|--- |--- |---|---
network.services.lb.new.requests | 新增请求数 | Requests | Nr. | 
network.services.lb.active.connections| 活跃连接数|Active Connection Counts | Nr.|
network.services.lb.new.connections | 新建连接数 | New Connection Counts | Nr. | 
network.services.lb.server.error| 服务端错误 | Server Error |Nr.|
network.services.lb.client.error|客户端错误|Client Error|Nr.|
network.services.lb.inflow.rate|流入流量速率|ProcessedIn_bps|bps|
network.services.lb.outflow.rate|流出流量速率|ProcessedOut_bps|bps|
network.services.lb.inflow.bytes|流入字节数|ProcessedIn_Bytes|Bytes|
network.services.lb.outflow.bytes|流出字节数|ProcessedOut_Bytes|Bytes|
network.services.lb.total.bytes|总字节数|Total Bytes|Bytes|




## Network Load Balancer
The servicecode of Network Load Balancer is nlb. To view the indicator data for a port, the port in tags shall specify a specific port number.
The monitoring indicators it provides are as follows:    

metric | Chinese Name | English Name | Unit | Description
---|--- |--- |---|---
network.services.lb.active.connections| 活跃连接数|Active Connection Counts | Nr.|
network.services.lb.new.connections | 新建连接数 | New Connection Counts | Nr. | 
network.services.lb.inflow.rate|流入流量速率|ProcessedIn_bps|bps|
network.services.lb.inflow.bytes|流入字节数|ProcessedIn_Bytes|Bytes|
network.services.lb.outflow.bytes|流出字节数|ProcessedOut_Bytes|Bytes|
