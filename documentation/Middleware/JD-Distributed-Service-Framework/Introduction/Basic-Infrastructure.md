# Basic Architecture
JD Distributed Service Framework adopts cross-availability-zone deployment in each region. Each service of each user is deployed in the VPC of the user independently, completely separated from data of other users. After service deployment, the user can call all functions through RESTful API. Apart from currently supported Registration Center, Configuration Center and Call Chain Analysis, JD Distributed Service Framework of JD Cloud will provide Message Queue, API Gateway and other services to meet diversified requirements of users.



## Business Architecture

![](../../../../image/Internet-Middleware/JD-Distributed-Service-Framework/jdsf-struct.png)



