## Application Load Balancer (ALB)
### Introduction
At present, the ALB log types accessing to Log Service are **Access Log** and **Health Check Log**. The access log is only in support of retrieving the 7-layer logs of Application Load Balancer currently. The ALB access log is only in support of searching the log data within 7 days currently.

### Access Log Field Description
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
certificate_id | Certificate id |string | eg: cert-jq3a9yhugj
docker_ip_port | docker ip and port | string | eg: 192.168.2.3:80

### Health Check Log Field Description
Log Filed| Field Description | Field Type | Field Value Description
-- | -- | -- | --
timestamp | Time stamp | time | Accurate to millisecond, eg: 2018-12-20T02:59:40.001Z
alb_id | Load Balancer ID | string | alb-[0-9][a-z]{10} , eg: alb-gmjnqw8bnh
backend_id | Backend service ID | string |backend-[0-9][a-z]{10}, eg: backend-lea4mj3kw7
backend_server_ip_port | Backend Server ip and port |string |  eg: 192.168.10.1:8080|
log_detail |  Log details | string | It is used to specify the log types including: 1) server is unhealthy: The health status of backend server becomes unhealthy.  2) server is healthy: The health status of backend server becomes healthy.  3)no available servers, num 1: The health status of all servers under the backend service becomes unhealthy and num represents the number of servers.  4)health check failed cause:ccc: This health check is found to be abnormal and its causes (for cause type, please see the following table) 

#### List of error reasons for health check
HTTP Health Check| TCP Health Check |Description
-- | -- | -- 
timeout | timeout | ..Time-out
connect failed |  connect failed | ...Connection creation failed
peek failed | peek failed | ..Connection abnormal 
send failed | send failed | ..Write failed 
peer closed  |           | .Opposite terminals close the connection 
parse check error	 |parse check error | . Health check results fail to pass the verification
recv failed |recv failed |  ..Read failed 




