# Registration Center

The registration center is the administration center of JD Distributed Service, realizing service registration and discovery. When a user creates a namespace, a registration center will be created at the same time. When the namespace is deleted, the registration center information will be synchronously deleted.

Services offered by the registration center include viewing basic information, service information, monitoring information, etc. in the registration center.

 
## Operation Steps

### Registration Center
1. Log in the JD Distributed Service Framework Console. Under the resource management on the left navigation bar, click **Registration Center** and enter the list page.
![](../../../../../image/Internet-Middleware/JD-Distributed-Service-Framework/zczx-list.png)
 
2. Click the name of the registration center to view the currently registered basic information. Users can query information in the basic information, such as node name, node version, node availability zone, node address and running status.
![](../../../../../image/Internet-Middleware/JD-Distributed-Service-Framework/zczx-jbxx.png)

**Description**

The registration center prohibits ICMP request. If test is necessary, you can use telnet to request Port 8500. You can try the following operations to detect the available methods in the registration center:

    # curl 'http://{domain+port}/v1/agent/members'
    


   




### Service Management
Users can view the service condition in each registration center.

Entry:

  -  Resource Management>Registration Center>Service Management.
  -  When entering the basic information page of the registration center, you can view by directly switching tabs.

1. List of all services.
![](../../../../../image/Internet-Middleware/JD-Distributed-Service-Framework/zczx-fwgl.png)

2. Query instance status of each service and details of each instance.

Service List
![](../../../../../image/Internet-Middleware/JD-Distributed-Service-Framework/zczx-fwgl-sllb.png)

Instance Details
![](../../../../../image/Internet-Middleware/JD-Distributed-Service-Framework/zczx-fwgl-sllb-slxq.png)




### Monitoring

Monitor information such as status, service instance condition and release condition of a registration center and configure alarm rules. Entrance: Resource Management>Registration Center>Monitoring.
![](../../../../../image/Internet-Middleware/JD-Distributed-Service-Framework/zczx-list-jk.png)


