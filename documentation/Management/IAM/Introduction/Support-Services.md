# Cloud Products Supporting IAM

The purpose of IAM is to support all cloud products and services on the JD Cloud to control operations of resources for sub-users and roles. This document mainly lists the current cloud products accessing IAM and their corresponding access method and specific details.

The information in the table is defined as follows:

- Cloud Product: the name of a cloud product or service in JD Cloud.

- Service Name: unique identifier of a cloud product in JD Cloud.

- Policy Version: v2 or v3

> At present, IAM supports two versions, which are v2 and v3.
>
> v2: this version is the native version of IAM, which only supports the permission control granularity of read only (R), modify (M), delete (D). At present, this version is no longer to be iterated, the current accessed cloud products will be updated into v3 subsequently.
>
> v3: this version is the update version of IAM, which is currently capable of supporting permission control at service level, operation level, resource level, the cloud products accessing IAM subsequently will use this kind of method to determine permissions uniformly.

- Open API: determine whether the current products support IAM to manage permissions, of which "✔" represents support and "-" represents temporarily not support.

- Console: determine whether the current products support IAM to manage permissions, of which "✔" represents support and "-" represents temporarily not support.

- Authorization Granularity: permission control granularity supported by the current product.

> Authorization Granularity is divided into service level, operation level and resource level according to the granularity.
>
> - Service level: define whether there is access permissions to the whole of service, which includes allowing full operation permissions or denying full operation permissions to cloud products.
> - Operation level: define whether there is access permissions to the specific interface (API) of cloud product, e.g., grant permission that the sub-user can read policy list in IAM.
> - Resource level: define whether there is access permission to specific resources, which is the smallest authorization granularity, e.g., grant permission that the sub-user can modify the policy details in IAM.

#### Cloud Products Supporting Policy v2:
|  **Cloud Products**  | **Service Name** | **Policy Version** | **Open API** | **Console** | **Authorization Granularity** | **User Roles** | **Service Roles** |
| :----------: | :--------------: | :------: | :------: | :----: | :------: | :------: | :------: |
|    Virtual Machines    |      server      |    v2    |    ✔     |   ✔    |   －     |   －   |    －     |
|    Cloud Image    |      image       |    v2    |    ✔     |   ✔    |    －    |   －    |    －     |
|    Public IP    |    floatingIp    |    v2    |    ✔     |   ✔    |    －    |    －     |    －   |
|     VPC      |       vpc        |    v2    |    ✔     |   ✔    |    －    |   －    |   －     |


#### Cloud Products Supporting Policy v3:
##### Elastic Compute
|  **Cloud Product**  | **Service Name** | **Policy Version** | **Open API** | **Console** | **Authorization Granularity** | **User Role** | **Service Role** |
| :----------: | :--------------: | :------: | :------: | :----: | :------: | :------: | :------: |
| Cloud Disk Service |       disk       |    v3    |    ✔     |   ✔    |  Resource Level  |   －     |    －    |
| Native Container |       nativecontainer     |    v3    |    ✔     |   ✔    |  Resource Level  |   －     |    －    |
|     POD      |       pod        |    v3    |    ✔     |   ✔    |  Resource Level  |    －    |   －    |
|     JCS for Kubernetes     |       kubernetes        |    v3    |    ✔     |   ✔    |  Resource Level  |    －    |   －    |
| Container Registry  |       containerregistry        |    v3    |    ✔     |   ✔    |  Resource Level  |   －     |    －    |
| Function Service |       function     |    v3    |    ✔     |   ✔    |  Resource Level  |   ✔      |    －    |
##### Network
|  **Cloud Product**  | **Service Name** | **Policy Version** | **Open API** | **Console** | **Authorization Granularity** | **User Role** | **Service Role** |
| :----------: | :--------------: | :------: | :------: | :----: | :------: | :------: | :------: |
|   Load Balancer   |        lb        |    v3    |    ✔     |   ✔    |  Resource Level  |   －    |   －     |
##### Database and Cache
|  **Cloud Product**  | **Service Name** | **Policy Version** | **Open API** | **Console** | **Authorization Granularity** | **User Role** | **Service Role** |
| :----------: | :--------------: | :------: | :------: | :----: | :------: | :------: | :------: |
|   RDS |        rds      |    v3    |    ✔     |   ✔    |  Resource Level  |    ✔   |   －     |
|   JCS for MongoDB |        mongodb     |    v3    |    ✔     |   ✔    |  Resource Level  |    ✔   |   －     |
|   Distributed Relational Database Service (DRDS) |       drds    |    v3    |    ✔     |   ✔    |  Resource Level  |    ✔   |   －     |
|   JCS for Redis |      redis   |    v3    |    ✔     |   ✔    |  Resource Level  |    ✔   |   －     |
|   JCS for Memcached  |        memcached        |    v3    |    ✔     |   ✔    |  Resource Level  |    ✔   |   －     |
##### Storage
|  **Cloud Product**  | **Service Name** | **Policy Version** | **Open API** | **Console** | **Authorization Granularity** | **User Role** | **Service Role** |
| :----------: | :--------------: | :------: | :------: | :----: | :------: | :------: | :------: |
| Object Storage Service  |     oss       |    v3    |    ✔     |   ✔    |  Resource Level  |   ✔     |    －    |
| Cloud File Service |     zfs      |    v3    |    ✔     |   ✔    |  Resource Level  |   －     |    －    |
##### Edge and Acceleration
|  **Cloud Product**  | **Service Name** | **Policy Version** | **Open API** | **Console** | **Authorization Granularity** | **User Role** | **Service Role** |
| :----------: | :--------------: | :------: | :------: | :----: | :------: | :------: | :------: |
| CDN |     cdn      |    v3    |    ✔     |   ✔    |  Resource Level  |   －     |    －    |
##### Cloud Security
|  **Cloud Product**  | **Service Name** | **Policy Version** | **Open API** | **Console** | **Authorization Granularity** | **User Role** | **Service Role** |
| :----------: | :--------------: | :------: | :------: | :----: | :------: | :------: | :------: |
| Anti-DDoS Basic |     baseanti     |    v3    |    ✔     |   ✔    | Resource level  |   ✔  |   －    |
| DDoS Protection Package |     antipro     |    v3    |    ✔     |   ✔    |  Resource Level  |   ✔  |   －    |
|   Web Application Firewall   |       waf      |    v3    |    ✔     |   ✔    | Resource Level  |   ✔      |   －   |
| Anti-DDoS Pro |       ipanti      |    v3    |    ✔     |   ✔    |  Resource Level  |   ✔     |    －     |
| Application Security Gateway |       sgw        |    v3    |    ✔     |   ✔    |Resource level  |   ✔     |    －     |
|   Endpoint Security   |       hips       |    v3    |    ✔     |   ✔    |Operation level  |   ✔      |   －   |
|   Situation Awareness   |       csa        |    v3    |    ✔     |   ✔    |  Operation level  |   ✔    |   －     |
|SSL Certificate |    ssl      |    v3    |    ✔     |   ✔    |  Resource Level  |   ✔    |    －    |
|Key Management Service |    kms     |    v3    |    ✔     |   ✔    |  Resource Level  |   ✔    |    －    |
|Website Threat Inspector |    threatscanner     |    v3    |    ✔     |   ✔    |   Operation Level  |   ✔    |    －    |
##### Management
|  **Cloud Product**  | **Service Name** | **Policy Version** | **Open API** | **Console** | **Authorization Granularity** | **User Role** | **Service Role** |
| :----------: | :--------------: | :------: | :------: | :----: | :------: | :------: | :------: |
|Monitoring |   monitor    |    v3    |    ✔     |   ✔    |  Operation Level  |     ✔    |    －   |
|Resource Orchestration |   jdro    |    v3    |    ✔     |   ✔    |  Resource Level  |     ✔    |    －   |
|Directory Service |     directoryservice     |    v3    |    ✔     |   ✔    |  Resource Level  |   ✔    |    ✔   |
|Log Service|   logs   |    v3    |    ✔     |   ✔    |  Resource Level  |     ✔    |    －   |
|Audit Trail |    audittrail     |    v3    |    ✔     |   ✔    |  Operation Level  |     ✔    |    －   |
|Identity and Access Management |     iam   |    v3    |    ✔     |   ✔    |  Resource Level  |   ✔    |    －    |
|Security Token Service |    sts     |    v3    |    ✔     |   ✔    |  Resource Level  |    －    |    －   |
|Renew Management |   renewal    |    v3    |    ✔     |   ✔    |  Operation Level  |     ✔    |    －   |
| Tag Service|     resourcetag   |    v3    |    ✔     |   ✔    |  Operation Level  |   ✔    |    －   |
##### Domain Name & License
|  **Cloud Product**  | **Service Name** | **Policy Version** | **Open API** | **Console** | **Authorization Granularity** | **User Role** | **Service Role** |
| :----------: | :--------------: | :------: | :------: | :----: | :------: | :------: | :------: |
| JD Cloud DNS |     domainservice   |    v3    |    ✔     |   ✔    |  Resource Level  |   ✔    |  －   |
| HTTPDNS |     httpdns   |    v3    |    ✔     |   ✔    |  Operation Level |    ✔   |  －   |
##### Video Service
|  **Cloud Product**  | **Service Name** | **Policy Version** | **Open API** | **Console** | **Authorization Granularity** | **User Role** | **Service Role** |
| :----------: | :--------------: | :------: | :------: | :----: | :------: | :------: | :------: |
| Live Video |     live   |    v3    |    ✔     |   ✔    |  Operation Level |   ✔    |  －   |
| Video on Demand |    vod   |    v3    |    ✔     |   ✔    |  Operation Level |    ✔   |  －   |
##### Big Data & Analytics
|  **Cloud Product**  | **Service Name** | **Policy Version** | **Open API** | **Console** | **Authorization Granularity** | **User Role** | **Service Role** |
| :----------: | :--------------: | :------: | :------: | :----: | :------: | :------: | :------: |
| Data Factory2.0  |       datafactory       |    v3    |   －      |  －    |  Service Level  |   －     |    －    |
##### Middleware
|  **Cloud Product**  | **Service Name** | **Policy Version** | **Open API** | **Console** | **Authorization Granularity** | **User Role** | **Service Role** |
| :----------: | :--------------: | :------: | :------: | :----: | :------: | :------: | :------: |
| Message Queue JCQ  |       jcq        |    v3    |    ✔     |   ✔    | Resource level  |   ✔     |    －    |
|API Gateway|     apigateway  |    v3    |    ✔     |   ✔    |  Resource Level  |    ✔   |  －   |
| JCS for Elasticsearch |     es   |    v3    |    ✔     |   ✔    |  Resource Level  |    ✔   |  －   |
|Queue Service|     jqs   |    v3    |    ✔     |   ✔    |  Resource Level  |    ✔   |  －   |
| JD Distributed Service Framework |     jdsf   |    v3    |    ✔     |   ✔    |  Resource Level  |    ✔   |  －   |
##### Hyper-Converged IDC
|  **Cloud Product**  | **Service Name** | **Policy Version** | **Open API** | **Console** | **Authorization Granularity** | **User Role** | **Service Role** |
| :----------: | :--------------: | :------: | :------: | :----: | :------: | :------: | :------: |
| Cloud Physical Server|     cps   |    v3    |    ✔      |   ✔    | Resource Level|   ✔  |  －   |
| Cloud Cabinet Service|     jdccs   |    v3    |    －     |   －    | Service Level |   ✔  |  －   |
##### Expense Center
|  **Cloud Product**  | **Service Name** | **Policy Version** | **Open API** | **Console** | **Authorization Granularity** | **User Role** | **Service Role** |
| :----------: | :--------------: | :------: | :------: | :----: | :------: | :------: | :------: |
| Order Management  |      order       |    v3    |   ✔       |  ✔     |  Operation Level  |    ✔     |    －    |
| Invoice Management  |      invoice       |    v3    |   ✔       |  ✔     |  Operation Level  |    ✔     |    －    |
| Consumption Management |      billing    |    v3    |   ✔       |  ✔     |  Operation Level  |    ✔     |    －    |
| Consumption Prediction |     forecast   |    v3    |   ✔       |  ✔     |  Operation Level  |    ✔     |    －    |
| Settlement Management  |      settlement    |    v3    |   ✔       |  ✔     |  Operation Level  |    －     |    －    |
| Capital Management  |      asset    |    v3    |   ✔       |  ✔     |  Operation Level  |     ✔     |    －    |
##### Channel Management
|  **Cloud Product**  | **Service Name** | **Policy Version** | **Open API** | **Console** | **Authorization Granularity** | **User Role** | **Service Role** |
| :----------: | :--------------: | :------: | :------: | :----: | :------: | :------: | :------: |
| Channel Management  |      partner   |    v3    |   ✔       |  ✔     |  Operation Level  |    ✔     |    －    |
##### Developer Tools
|  **Cloud Product**  | **Service Name** | **Policy Version** | **Open API** | **Console** | **Authorization Granularity** | **User Role** | **Service Role** |
| :----------: | :--------------: | :------: | :------: | :----: | :------: | :------: | :------: |
| CodeCommit |    codecommit      |    v3    |  －       | －      |  Service Level |   －      |    －    |
| CodeBuild |       compile       |    v3    |  ✔      |  ✔     |  Resource Level |   ✔     |    －    |
| CodeDeploy |       deploy      |    v3    |   ✔      |  ✔    |  Resource Level  |   ✔     |    －    |
| CodePipeline  |       pipeline      |    v3    |   ✔      |  ✔      |  Resource Level  |   ✔      |    －    |
##### Internet of Things
|  **Cloud Product**  | **Service Name** | **Policy Version** | **Open API** | **Console** | **Authorization Granularity** | **User Role** | **Service Role** |
| :----------: | :--------------: | :------: | :------: | :----: | :------: | :------: | :------: |
| IoT Core |    iotcore    |    v3    |   ✔       |  ✔      |  Operation Level|   ✔      |    －    |
| IoT Hub Protocol Adaptor |       iotcloudgateway       |    v3    |  ✔      |  ✔     |  Operation Level|   ✔     |    －    |
