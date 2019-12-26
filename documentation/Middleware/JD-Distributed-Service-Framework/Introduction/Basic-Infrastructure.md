# Basic Architecture
JD Distributed Service Framework adopts cross-availability-zone deployment in each region. Each service of each user is deployed in the VPC of the user independently, completely separated from data of other users. After service deployment, the user can call all functions through RESTful API. At present, the product offers functional services including namespace, registration center, resource pool management, JD Distributed Service Gateway, application management and deployment, configuration management, service governance, log analysis and calling chain analysis. Cloud products such as API Gateway, ES and CodeDeploy have been enabled at present to satisfy various user needs. In the future, more cloud products and services will be enabled.



## Business Architecture

![](../../../../image/Internet-Middleware/JD-Distributed-Service-Framework/jdsf-struct.png)



