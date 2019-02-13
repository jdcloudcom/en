# Examples for Getting Started

# Environment Preparation

1. JDK of version 1.8 or above is required;<br />
2. Download example project: [Download link of the example project](https://apigateway.oss.cn-north-1.jcloudcs.com/demo/JDSF-Demo.zip)<br />
3. The Demo is idea project with the construction tool of maven. If your environment also is idea + maven, then you can directly download and use it. Otherwise you shall create your project according to your own tools and environment;


# Project Structure

### 1. Project Directory
|- client <br />
|- server <br />
|- pom.xml <br />
Where client presents a service caller; <br />
Server presents a service provider;<br />
Dependent packages required by the project are defined in the pom.xml<br />

### 2. Dependence Definition
Different configuration items are defined according to different requirements in the pom file. With annotation added to each configuration item, you can set your configuration according to your requirements.

# POM Description
### 1. parent Item
parent configuration presents the project parent item that we configured, which some configuration information can be inherited from it after configuration.<br />
The project is inherited from springcloud2.0, which facilitates the management and development of various extensions based on springcloud2.0.
### 2. dependencies Item
It introduces specific dependencies required by project development, which adds or delete dependent projects as required.<br />
The project mainly introduces service registration/discovery dependence, monitoring (alive detection) dependence, service calling dependence, load balancer dependence, configuration center dependence, calling chain dependence — jaeger and zipkin, which can be modified by users according to the requirements of their projects.
### 3. dependencyManagement Item
It can use dependencyManagement to carry out unified management for the version number of the project, which can keep the consistence and unique of dependencies and versions of projects for the convenience of management. In the case of changing version number, it can only be updated in the parent container other than modifying in any sub-project; in the case of another special version number of a certain sub-project is required, it only needs to declare a version number in dependencies of its own module. Sub-class will use the version number declared by the sub-class other than inherit that of parent class.


# Configurations and Instructions
## 1. Registration Center
After creating the cluster according to the number of service instances, the user can click [Cluster Information] under the registration center list to see registration center address which is the "Node Address" in "Node Information" section on the Cluster Information page. It is shown in the figure below:<br />
![集群地址](../../../../image/Internet-Middleware/JD-Distributed-Service-Framework/demo_cluster_nodes.png)<br />
Modify spring.cloud.consul.host configuration and usage mode in the configuration files under the server and client directories of the example program respectively (src/main/resources/application.properties), shown as in the following figure:<br />
![配置使用](../../../../image/Internet-Middleware/JD-Distributed-Service-Framework/demo_cluster.png)<br />
You only need to add @EnableDiscoveryClient and @EnableFeignClients annotations at Start Class of the project to enable service registration and discovery. @EnableDiscoveryClient annotation enables service registration and discovery while @EnableFeignClients annotation activates FeignClents immediately, which services are called by the following methods:<br />
![服务调用](../../../../image/Internet-Middleware/JD-Distributed-Service-Framework/demo_FeignClient.png)<br />
Where ("jdsf-server") is the project name of server to be called.



## 2. Calling Chain
The user writes in TPS data to create Calling Chain Cluster according to the Calling Chain, then clicks [Cluster Name] to access Calling Chain Details page, addresses and ports of protocols provided by the Calling Chain are displayed in "Calling Chain Address" at the bottom of Cluster Details page. It is shown in the figure below:<br  />
![调用链地址](../../../../image/Internet-Middleware/JD-Distributed-Service-Framework/demo_callchain_addreslist.png)<br />
Modify opentracing.jaeger.http-sender.url configuration in the configuration files under the server and client directories of the example program respectively (src/main/resources/application.properties). Please note that the example needs to use HTTP protocol address. The usage mode is shown as in the following figure:<br />
![配置使用](../../../../image/Internet-Middleware/JD-Distributed-Service-Framework/demo_callchain_setting.png)<br />
After accessing the services of the user and successfully writing in the calling data, click [Dependency Map] under the Calling Chain list to analyze the calling relationships between services. The results are shown as in the following figure:<br />
![调用图谱](../../../../image/Internet-Middleware/JD-Distributed-Service-Framework/demo_callchain_servicemap.png)<br />
Then click specific service name node to access the calling statistics page of each service and view a piece of specific calling information.

## 3. Configuration Center
The user creates configuration items and configuration contents required by his/her own businesses and releases them to the storage — it only supports to store them in registration center at present. It is shown in the figure below:<br />
![发布配置](../../../../image/Internet-Middleware/JD-Distributed-Service-Framework/demo_config_deploy.png)<br />
After successful release, modify information of configuration center address and port such as spring.cloud.consul.host in the configuration files under the server and client directories of the example program respectively (src/main/resources/bootstrap.properties). It is shown in the figure below:<br />
![配置设置](../../../../image/Internet-Middleware/JD-Distributed-Service-Framework/demo_config_setting.png)<br />
Then the user uses it in the codes with the following method — @Value method:<br />
![配置代码](../../../../image/Internet-Middleware/JD-Distributed-Service-Framework/demo_config_code.png)<br />
Notification: see code CloudConfig class for @ConfigurationProperties method.

# Deployment
Deploy the two example programs named server and client in the VPC and subnet where registration center and Calling Chain Service are located in. After running, service registration data and Calling Chain data can be seen.
