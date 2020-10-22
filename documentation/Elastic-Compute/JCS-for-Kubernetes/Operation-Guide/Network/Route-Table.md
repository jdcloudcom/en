# Cluster Network - Route Table
Cabinet K8S Service of JD Cloud & AI will associate route tables for different subnets in a cluster, guaranteeing normal access in the cluster.
## Normal Mode
Three route tables will be outputted, which are named as per the naming rules clusterid-node-rt-0, clusterid-pod-rt-0 and clusterid-nat-rt-0 are respectively associated with the working node group subnet, the Pod subnet and the Service-LB subnet. Including:
### Working Node Subnet Route Table
* Rule I: VPC Peering router going to management node CIDR
* Rule II: Router going to NAT instance (NAT instances will be created within Service-LB subnet by default in the normal mode)
* Rule III: local router
### Pod Subnet Route Table
* Rule I: VPC Peering router going to management node CIDR
* Rule II: Router going to NAT instance (NAT instances will be created within Service-LB subnet by default in the normal mode)
* Rule III: local router
### Service-LB Subnet Route Table
* Rule I: Internet router
* Rule I: local router
## Customized Mode
When a K8S cluster is created by a customer after September 28, 2020 and the customized mode is selected for the network configuration, K8S Service of JD Cloud & AI will create corresponding route tables for the working node group subnet, Pod subnet and Service-LB subnet in the same way of the normal node and associate them to corresponding subnets. The naming rules, clusterid-node-rt-0, clusterid-pod-rt-0 and clusterid-nat-rt-0, are respectively associated with the working node group subnet, the Pod subnet and the Service-LB subnet.
### Working Node Subnet Route Table
* Rule I: VPC Peering router going to management node CIDR
* Rule II: Router going to NAT instance/NAT Gateway (If you select to enable NAT, the router is available)
   * If the created NAT Gateway is selected when a cluster is created, NAT Gateway will be directed to
   * If automatic creation is selected when a cluster is created, NAT instances will be directed to
* Rule III: local router
### Pod Subnet Route Table
* Rule I: VPC Peering router going to management node CIDR
* Rule II: Router going to NAT instance/NAT Gateway (If you select to enable NAT, the router is available)
   * If the created NAT Gateway is selected when a cluster is created, NAT Gateway will be directed to
   * If automatic creation is selected when a cluster is created, NAT instances will be directed to
* Rule III: local router
### Service-LB Subnet Route Table
* Rule I: Internet router
* Rule I: local router
