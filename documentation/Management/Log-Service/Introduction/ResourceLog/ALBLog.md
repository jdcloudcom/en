## ALB (Application Load Balancer) Access Log
### Introduction
Currently, the type of ALB log accessed to Log Service is **Application Load Balancer Access Log**. Currently, it only supports retrieval of 7-level log of Application Load Balancer.

### Field Description
Log Field(7-level) | Field Description | Field Type| Field Value Description
-- | -- | -- | --
timestamp  | Time stamp | time | accurate to millisecond, eg: 2018-12-20T02:59:40.001Z
alb_id | Load Balancer ID| string | alb-[0-9][a-z]{10} , eg: alb-gmjnqw8bnh
client_ip | Client ip | string | eg: 192.168.10.1
client_port | Client port  | int | 1-65535, eg: 50398
lb_vip | Load Balancer virtual ip (vip) | string | eg: 192.168.10.2
lb_vport | Load Balancer Listener port (vport) | int | 1-65535, eg: 8080
backend_server_ip_port | ip and port of Backend Server | string | eg: 192.168.10.1:8080
request_time | Request time | float | >0, eg: 0.006
backend_connect_time | Connection setup time | float | >0, eg: 0.001
backend_response_time | Response time | float | >0, eg: 0.006
status | Status Code | int | similar to http code; eg: 200, 404, 503 ....
backend_server_status | Return Status Code of Backend Server | int | similar to http code; eg: 200, 404, 503 ....
request_length | Request data length | int | >0, eg: 80
bytes_sent | Sent data | int | >0, eg: 197
scheme | scheme | string | uri scheme or stream Protocol; eg: http, https, tcp, udp
request_method | http method | string | GET, POST, DELETE, PUT , OPTION....
host | http host | string | Host in the request line or host in the request header or one servername that matches the request, eg: 192.168.2.3
request_uri | Complete URI of original request | string | eg : / ; /pan/beta/test1?fid=3
server_protocol | Protocol requested for use | string | Commonly, it is HTTP/1.0 or HTTP/1.1
http_user_agent | User agent | string | client agent, eg: curl, chrome
ssl_cipher | ssl cipher | string | eg：EECDH+AESGCM
ssl_protocol | ssl Protocol | string | eg: SSLv2, TLSv1 
