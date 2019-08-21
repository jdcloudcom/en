# Configuration Access Log

Application Load Balancer Access Log collects detailed information of all access requests sent to Application Load Balancer, including information such as request time, request load balancer ID, client IP, request backend server IP and port. You can learn about client behavior, troubleshooting, etc., through access logs.

    Note: Only seven-layer access logs collecting Application Load Balancer in cn-north-1 and cn-east-2 regions are supported.

## Operation Steps
Access log of Application Load Balancer shall be collected in real-time in [Log Service](https://docs.jdcloud.com/log-service/product-overview) configuration. No configuration is required on the side of Application Load Balancer. Log Service can be configured with operations such as enable collection access log, disable collection access log, access log retrieval, and configure access log dump.

## Access Log Field Description

Please refer to [Application Load Balancer Access Log](https://docs.jdcloud.com/log-service/alblog) for description of fields of access log.
