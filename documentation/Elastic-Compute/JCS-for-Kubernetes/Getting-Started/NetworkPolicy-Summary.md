# Network Policy Overview

[Basic Concept](#Basic Concept)

Network Policy is used for defining the network isolation strategy between Pods within the cluster and the network isolation strategy between Pod and other external network terminal. The definition of Network Policy is implemented by the controller provided by the network plug-in. For details, refer to [Kubernetes.io](https://kubernetes.io/docs/concepts/services-networking/network-policies/).

There is no isolation between pods by default so they can receive traffic from any resource. Therefore, if you need to define the isolation strategy for Pod in the cluster, you can choose to enable Network Policy in the cluster.

[Deployment Description](Deployment Description)

The Network Policy Controller of JD Cloud can be implemented through integrating Felix components of Calico. Access policy between containers is defined by supporting NetworkPolicy of API based on Kubernetes standards, and Network Policy of [Calico](https://docs.projectcalico.org/v3.8/security/calico-network-policy) is compatible. 

You can choose [Enable Network Policy]() when creating the cluster and [Enable Network Policy]() for the created cluster.

After enabling Network Policy, components, component yaml definitions, and the role of components are added to the cluster (to be supplemented).
Working Principle Description (to be supplemented).
Resources of initial components define applicable cluster scale (to be supplemented).
JD Cloud provides Network Policy with scaling policy, and the policy description is as follows (to be supplemented).

Refer to [Document Name]() for more application practices relevant to Network Policy.


  
