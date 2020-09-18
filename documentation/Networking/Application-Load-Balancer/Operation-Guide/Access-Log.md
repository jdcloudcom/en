# Configure Application Load Balancer Access Log

[Access Log](Access-Log#user-content-1)

[Health Check Log](Access-Log#user-content-2)

## Access Log
<div id="user-content-1"></div>

As for Access Log, the detailed information of all access requests sent to Application Load Balancer, including request time, requested Load Balancer ID, client IP, and requested backend server IP, port, etc., is collected. You can learn about client actions and troubleshoot problems through access logs.

     Notes: (1) Access Log supports the collection of layer 7 access logs and layer 4 access logs, which is now opened in all regions. (2) Load Balancer does not charge any extra cost for the access log. You only need to pay some money for the log service.

### 1. Operation Steps
Access log of Application Load Balancer shall be collected in real-time in [Log Service](https://docs.jdcloud.com/log-service/product-overview) configuration. No configuration is required on the side of Application Load Balancer. Log Service can be configured with operations such as enable collection access log, disable collection access log, access log retrieval, and configure access log dump.

### 2. Access Log Field Description
Please refer to [Application Load Balancer Access Log](https://docs.jdcloud.com/log-service/alblog) for description of fields of access log.

## Health Check Log
<div id="user-content-2"></div>

Application Load Balancer performs health checks on associated backend servers on a regular basis, and only distributes traffic to the back servers with normal health. Health Check Log is used to record the changes in the health check status of backend servers and the causes of abnormal health checks, and no log will be printed if the health check is successful. Logs are printed only under the following circumstances: (1) The backend server health check status is abnormal; (2) the backend server health check status turns from healthy to unhealthy; (3) the backend server health check status turns from unhealthy to healthy; and (4) all servers in the backend server group turn to be unhealthy.

     Note: Load Balancer does not charge any extra money for Health Check Log. You only need to pay some money for the log service.

### 1. Operation Steps
Application Load Balancer health check logs shall be collected during the configuration of [Log Service](https://docs.jdcloud.com/log-service/product-overview) in real-time, and there is no need for any configuration on Application Load Balancer. Log Service can be configured with operations such as enabling the collection of health check logs, closing the collection of health check logs, health check log search, and health check log dump.

### 2. Health Check Log Field Description

For the health check log field description, please refer to [Application Load Balancer Health Check Log Description](https://docs.jdcloud.com/log-service/alblog).
