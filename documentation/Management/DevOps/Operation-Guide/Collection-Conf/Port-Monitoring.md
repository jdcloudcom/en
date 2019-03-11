# Port Monitoring
## Monitoring Items Description

The purpose of port monitoring is to monitor the status, response time and return content of local (127.0.0.1) port(s). The status of port refers to that whether the port is alive. Response time refers to the time that needs to wait after initiating a test request. Return content refer to the specific content that returns the normal and other abnormal conditions.

Semantic detection such as http initiates the http request for local simulation.

| Names of Monitoring Items         | Meaning of Monitoring Items     | Unit | Description                                                         |
| ------------------ | -------------- | ---- | ------------------------------------------------------------ |
| ${name}.status    | Status of Port     |      | 1 denotes normal, 0 denotes abnormal                                         |
| ${name}.reason    | Error Status of Port |      | 0 denotes normal, 1 denotes connection timeout, 2 denotes connection refused, 3 denotes connection error, 4 indicates that request content return is not matching, 5 indicates that http status code is not matching, 6 indicates that failed to send request, 7 indicates that failed to read the other person’s response |
| ${name}.res_time  | Response Time       | Microsecond |                                                              |
| ${name}.http_code | httpStatus Code     |      | Status code of http, only when the http protocol communication is completed can this monitoring item be available; if the http protocol communication is not completed, response time and status code cannot be available |



## Operation Guide

Step 1: Select [Intelligent Monitoring] - [Monitoring Configuration] in the menu, select nodes at or below product lines in the service tree at the left side, click **New** on the Acquisition Configuration page as shown in the following figure.

![image](https://github.com/jdcloudcom/cn/blob/DevOps-guhezhu1/image/DevOps/Operation-Guide30.JPG)
Step 2: Open acquisition configuration new window as shown in the figure. In which,

**Monitoring Type**: Select port monitoring

**Method**: Method for port detection, including port alive detection, HTTP semantic detection, TCP semantic detection and UDP semantic detection

**Name**: Name of this collection task will be used as the prefix of monitoring indicators, which supports letters, numbers and \_, and must begin with a letter.

**Scope**: Scope of the port monitoring collection configuration is associated with the selected node in the service tree, with the principle of being selectable downward. When the application node in the service tree is selected, only "Application" can be selected in the scope; when system node in the service tree is selected, "System" or "Application" can be selected in the scope; when product line node in the service tree is selected, "Product Line", "System", "Application" can be selected in the scope

**Node**: Specific node of collection configuration, when selecting a system or product line node, all the applications the node belongs to will be covered.

**Acquisition cycle**: Select acquisition cycle to be configured.

**Address**: Port detection address, local IP/127.0.0.1 + port number

For semantic detection such as HTTP, it is also required to fill in the request address, request header and other contents.    

```
PS：
Configure Dynamic IP: Access local /127.0.0.1 by default. If this IP is not available, it can be switched to JSON configuration mode. Fill in the port number with $IP$.
Configure Dynamic port: $MAIN_PORT$ (when configuring this dynamic port, it is agreed to obtain the master port enabled by the instance in the service tree)
Configure dynamic address $DEPLOY_PATH$ (the instance deployment path on the service tree)
```

![image](https://github.com/jdcloudcom/cn/blob/DevOps-guhezhu1/image/DevOps/Operation-Guide31.jpg)

    Semantic Detection Methods such as HTTP: The requests such as http request can be initiated by local simulation for detection, check the port status and check if the returned content is correct.
    Request Method: Support GET/POST/HEAD
    Request Header: Support adding multiple field value pairs
    Match Status Code: Matching http status code
    Match Content: Fill in the content contained in the target page.

![image](https://github.com/jdcloudcom/cn/blob/DevOps-guhezhu1/image/DevOps/Operation-Guide32.jpg)
