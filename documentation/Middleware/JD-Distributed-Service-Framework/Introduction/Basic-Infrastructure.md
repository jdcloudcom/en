# Basic Architecture
JD Cloud Distributed Service Framework in each region adopts cross-availability zone deployment. Each service of each user is deployed in the VPC of the user independently, completely separated from data of other users. After service deployment, the user can call all functions through RESTful API. Apart from currently supported Registration Center, Configuration Center, Call Chain Analysis, JD Cloud Distributed Framework will provide Message Queue, API Gateway and other services to meet diversified requirements of users.



## Business Architecture

![](../../../../image/Internet-Middleware/JD-Distributed-Service-Framework/jdsf-struct.png)



