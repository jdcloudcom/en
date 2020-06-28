#  Load Balancer

On JD Distributed Service Framework, users can configure the Load Balancer for Kubernetes applications so that these applications can be accessed to all instances from intranet or public network.

## Operation Scenarios

Applications in the same JCS for Kubernetes can be accessed, which can be configured with the "internal" Load Balancer. If applications outside JCS for Kubernetes require access, they can be configured with the "external" Load Balancer.

## Environment Preparation

Cloud Kubernetes products have been enabled and Kubernetes applications have been created through JD Distributed Service Framework.

Applications may not be deployed in the order of the Load Balancer configuration, but the configuration takes effect only when the applications are deployed.


## Operation Steps

### Configure Internal Load Balancer

![](../../../../../image/Internet-Middleware/JD-Distributed-Service-Framework/fzjh-1.jpg)

After creation, log in the application detail, and configure Load Balancer for the application in the "Load Balancer" tab. For example:

![](../../../../../image/Internet-Middleware/JD-Distributed-Service-Framework/fzjh-4.jpg)

First, configure the internal Load Balancer. Click **Create** to configure the port information. For example:

![](../../../../../image/Internet-Middleware/JD-Distributed-Service-Framework/fzjh-5.jpg)


After the creation, you can see the newly added information in the list. For example:
![](../../../../../image/Internet-Middleware/JD-Distributed-Service-Framework/fzjh-6.jpg)


### Configure External Load Balancer

If you need to configure the external Load Balancer, you should first configure the internal Load Balancer information. Then log in the "external" tab, click **Create** and configure the information. For example:

![](../../../../../image/Internet-Middleware/JD-Distributed-Service-Framework/fzjh-7.jpg)


After creation, you will see the newly added information in the list. For example:

![](../../../../../image/Internet-Middleware/JD-Distributed-Service-Framework/fzjh-9.jpg)


Next, conduct domain name resolution and associate host. For example:

![](../../../../../image/Internet-Middleware/JD-Distributed-Service-Framework/fzjh-8.jpg)

Finally, conduct test and confirm if the configuration is successful. For example:

![](../../../../../image/Internet-Middleware/JD-Distributed-Service-Framework/fzjh-10.jpg)


Description:

- You can create a number of Load Balancers, but no one shall have a duplicated name.


### Delete

If you need to disassociate the Load Balancer, you can directly delete it and the deletion will take effect in real time.

