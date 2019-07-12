# Sensitive Operation Support List:

The list of currently defined sensitive operations is as follows:

#### Elastic Compute
|  **Cloud Product**  | **Interface Name** | **Interface Description** |
| :----------: | :--------------: | :------: |
| Virtual Machines  |      vm:deleteInstance       |    Delete Virtual Machines    | 
|     Auto Scaling  |   autoscaling:deleteAutoscalingGroup     |    Delete Auto Scaling Group  |  
|     Container Registry  |  containerregistry:deleteRegistry   |    Delete Registry  |  
|     Container Registry  | containerregistry:deleteRepository   |  Delete Registry  | 
|     Container Registry  |  containerregistry:deleteImage   |    Delete Image |  
|     Pod  |   pod:deletePod    |   Delete Pod  | 
|     JCS for Kubernetes  |   kubernetes:deleteCluster   |   Delete Cluster| 
|    JCS for Kubernetes  |   kubernetes:deleteNodeGroup    |    Delete Working Node Group | 
|    Function Service |   function:deleteFunction   |    Delete Function | 

#### Database and Cache
|  **Cloud Product**  | **Interface Name** | **Interface Description** |
| :----------: | :--------------: | :------: |
| Cloud Database (My SQL)  |      rds:deleteDatabase     |    Delete Database    | 
| Cloud Database (My SQL)  |     rds:deleteInstance    |   Delete Read-only Instance    | 
| Cloud Database (My SQL)  |      rds:deleteDatabase     |    Delete Instance   | 
|     Cloud Database (SQL Server) |  rds:deleteDatabase    |    Delete Database  |  
|     Cloud Database (SQL Server) |  rds:deleteInstance    |    Delete Instance|  
|     Cloud Database (SQL Server) | rds:restoreDatabaseFromFile   |  Cloud on Single Database|  
|     Cloud Database (SQL Server) |rds:restoreDatabaseFromBackup |  Single Database Recovery|  
|     JCS for MongoDB |  mongodb:deleteInstance   |    Delete Instance|  
|     DRDS |  drds:deleteInstance   |    Delete Instance|  
|     JCS|  redis:deleteCacheInstance  |    Delete a Singe Redis Instance|  
|     JCS for Memcached |  memcached:deleteInstance  |    Delete a Single memcached Instance|  

#### Storage and CDN
|  **Cloud Product**  | **Interface Name** | **Interface Description** |
| :----------: | :--------------: | :------: |
| CDN  |     cdn:stopDomain   |    Service Status Change-Stop Service   | 
| CDN  |      cdn:deleteDomain    |    Service Status Change-Delete Accelerated Domain| 

#### Cloud Security
|  **Cloud Product**  | **Interface Name** | **Interface Description** |
| :----------: | :--------------: | :------: |
| Application Security Gateway  |      sgw:deleteWaf    |    Delete WAF Instance   | 
| SSL Certificate  |    ssl:deleteCerts    |    Delete Certificate  | 
| SSL Certificate |      ssl:downloadCert  |    Download Certificate  | 
| JD Cloud DNS |      clouddnsservice:setLock  |    Enable/Disable Domain Locking | 

#### Management
|  **Cloud Product**  | **Interface Name** | **Interface Description** |
| :----------: | :--------------: | :------: |
| Resource Orchestration |      jdro:deleteStack  |    Delete Stack  | 
| IAM |     iam:createSubUser |   Create sub-user | 
| IAM|     iam:deleteSubUser  |    Delete sub-user  | 

#### Developer Tools
|  **Cloud Product**  | **Interface Name** | **Interface Description** |
| :----------: | :--------------: | :------: |
| CodeDeploy|    deploy:deleteApp  |    Delete application | 

#### Middleware
|  **Cloud Product**  | **Interface Name** | **Interface Description** |
| :----------: | :--------------: | :------: |
| JCS for Elasticsearch |      es:deleteInstance  |    Delete a Single es Instance  | 
| JCS for Elasticsearch |     es:modifyInstanceSpec  |    Change es Instance Configuration  | 
| JD Distributed Service Framework |     jdsf:deleteRegistry  |    Delete Registration Center Cluster  | 
| JD Distributed Service Framework |   jdsf:deleteTraceCluster |    Delete Calling Chain Cluster | 
| JD Distributed Service Framework |    jdsf:deleteAppConfig |    Delete Application Configuration | 
| JD Distributed Service Framework |     jdsf:deleteAppConfigVersion |   Delete Application Configuration Version  | 
| JD Distributed Service Framework |     jdsf:rollbackAppConfigVersion  |    Rollback Release of Configuration Version  | 
| Message Queue |   jcq:deleteTopic  |    Delete a  Single Topic  | 
| Queue Service |   jqs:deleteQueue  |  Delete queue  | 
