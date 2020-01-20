#  Ingress Gateway

Via Ingress Gateway, the Internet Access entrance for service is provided.


##  Operation Description

###  Create Service Gateway

1. Login the Console, Middleware>Cloud Service Mesh>Ingress Gateway.

![](../../../../image/Internet-Middleware/Mesh/gateway-list.png) 


2. Click **Create**.

![](../../../../image/Internet-Middleware/Mesh/gateway-new.png) 

| Information Item | Description |
| :- | :- |
| Name | Name of the Ingress Gateway Created | 
| Istio Gateway Service | The default service is istio-ingress. | 
| Port Configuration | Click **Add** to add configuration of multiple ports. | 
| Port Name | Name of Port | 
| Port Protocol | Support HTTP/TCP | 
| Port | 1-65535 | 
| Host | The default value is the wildcard "*" which cannot be changed. | 

	
	
 
###  Delete gateway

- The associated virtual service, if any, cannot be edited or deleted, which can be edited and deleted upon disassociation.

- The deleted one cannot be recovered.


