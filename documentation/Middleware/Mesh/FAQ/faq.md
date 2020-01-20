# FAQ

###  Comprehensive Class


**Q: How to deploy applications to the mesh?**

A: For a new K8S cluster, please turn on the automatic injection proxy switch while installing istio components via one click. Subsequent installation business applications will be automatically injected to the proxy. If the K8S cluster already has an application, the proxy function can be injected manually. After deployment, please configure an istio gateway for traffic distribution.


**Q: What if mesh deployment failed?**

A: You can try to make deployment for two additional times. If failed, please open ticket about error information, indicating operation process, error information, cluster name and other information.


**Q: The original cluster already has an application. How to inject the cluster into the proxy?**

A: You can inject it into the proxy function manually?


**Q: Which Service Management functions are supported by the mesh?** 	

A: Service registration discovery, Load Balancer, meltdown, traffic offloading, traffic limit, safety, call chain, telemetry data view, etc.


**Q: How to migrate applications out of the mesh? Will traffic be cut off during migration?**

A: In case of move-out, the anti-injection proxy function can be used. When the proxy is removed from the instance via the K8S rollout mechanism, the original connection or long connection may be cut off. In addition, removal of Mesh gateway shall also be considered. The move-in and move-out solutions shall be made in details to guarantee traffic continuity. Please seek for support of JD Cloud Mesh Team.


**Q: Are multiple clusters are supported?**

A: They are not supported now.


**Q: How to use the traffic offloading function of mesh?**

A: The mesh supports Entry Traffic Rules and Internal Traffic Rules. For the Entry Traffic Rules, traffic can be offloaded from the gateway to the entry service according to the domain. The Internal Traffic Rules are mainly used for mutual access of the service within the Mesh, with three traffic offloading methods supported, i.e., Header, URI and weight.


**Q: How to plan the gateway of mesh?**

A: The gateway is the exit of an entire system. Generally, one gateway can meet business demands. To associate multiple backend service types to the same gateway, you only need to set the gateway domain as "*". In special business scenarios, multiple gateways can be set. Each gateway supports many ports.


**Q: Which mesh components are supported? What if the mesh components have no Internet IP?**

A: Such components include kiali, grafana, jaeger, bookinfo example and prometheus. The Cloud Mesh opens some of top 4 components with ingress and automatically generates the gateway and configuration. After installation, the access address can be viewed in the component management page.


**Q: What are Mesh gateway and k8s gateway?**

A: The gateway of Mesh and ingress of K8S are not the same item. Current, Cloud Mesh adopts istio gateway rather than K8S ingress for traffic guide.


**Q: How to use fault injection of mesh?**

A: At present, fault injection is not supported, which will be supported subsequently.


**Q: What’s the mesh version? Can it be upgraded?**

A: The current istio version is 1.2.5 and the upgrade function will be supported subsequently.


**Q: What if the installed function does not take effect**

A: Please check the istio component under the istio-system namespace is in running status. If it is in the pending status, this is because the resources are insufficient and k8s fails to schedule the istio component normally. Please try again after certain resources are applied


