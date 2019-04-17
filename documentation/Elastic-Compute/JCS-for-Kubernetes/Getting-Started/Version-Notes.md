# Version Description  
  
## Kubernetes Community Version  
- The Kubernetes community versions are identified by x.y.z, where x stands for the Major version, y for the Minor version, and z for the Patch version. The version description is as follows: The Major version generally indicates API changes that are not compatible; the Minor version indicates functional changes, generally backwards compatible; the Patch version indicates backward compatibility bug fixes
- JD Cloud provides the JCS for Kubernetes version of JD Cloud based on the Kubernetes community version. The versions are identified by x.y.z-jcs.N. Each Minor version provides 2-3 stable patch versions. JD Cloud will determine the Patch versions supported to be released, but will not ensure the continuity of the patch versions. The -jcs.N suffix identifies the special branch provided by JD Cloud based on a patch version, including security updates, bug fixes or function upgrades. JD Cloud guarantees version availability.
  
## Kubernetes Version supported by JD Cloud  
  
### 1.8  
#### Version Description:  
The 1.8 version of JD Cloud JCS for Kubernetes has been released. After being released, the function upgrades will not be provided based on version 1.8. To ensure the availability and stability of the cluster, please select the new available cluster for testing and upgrading;

#### Description of new features supported by the community version:  
- Focus on security: Role-based access control (RBAC) becomes stable support. RBAC allows cluster administrators to dynamically define role access policies for the Kubernetes API. The Beta support for filtering outbound traffic through network policies enhances existing support for filtering inbound traffic. RBAC and network policy are two powerful tools to strengthen the organization and regulatory security requirements within Kubernetes. Kubelet's Transport Layer Security (TLS) certificate rotation became a beta version. Automatic certificate rotation reduces the burden of cluster security operation and maintenance.  
- Focus on workload support: Kubernetes 1.8 drives the beta version of the core workload API via the apps/v1beta2 group and version. Beta Version includes the current versions of Deployment, DaemonSet, ReplicaSet and StatefulSet. The Workload API is the cornerstone for migrating existing workloads to Kubernetes and developing Kubernetes-based cloud native application programs.  
## 1.12  

#### Version Description:  
- 1.12 Community version officially GA in September 2018. And this version is the latest version supported by the current JD Cloud JCS for Kubernetes.  
#### Description of new features supported by the community version:  
- Kubelet TLS Bootstrap GA: This function allows kubelet to direct themselves to a TLS secure cluster. Most importantly, it can automatically provide and distribute signature certificates. In addition, Kubelet server certificate guiding program and rotation are turning to a beta version. Currently, when the kubelet first starts, it generates a self-signed certificate/key pair that accepts incoming TLS connections. This feature introduces a process of generating a key locally and then issuing a certificate signature request to the cluster API server to obtain the associated certificate signed by the cluster's root certificate authority. In addition, when the certificate is approaching expiration, the same mechanism will be used to request the updated certificate.  
- RuntimeClass is a new cluster action scope resource that represents the container running attribute as a control plane released as an alpha function.  
- The snapshot/recovery functions of Kubernetes and CSI are being introduced as alpha functions. This provides a standardized API design (CRD) and adds PV snapshot/recovery support for CSI volume driver programs.  
- Topology-aware dynamic configuration is now in the test phase, and storage resources can now sense their own location.  
- The configurable pod process namespace share is in the test phase, and the user can configure the containers in the pod to share the common PID namespace by setting options in the PodSpec.  
- The taint nodes based on conditions are now in the test phase, the user can use the taint to indicate the node condition that prevents the scheduling.  
- Any/customized indicators in Horizontal Pod Autoscaler are moving to the second beta to test some other enhancement functions. This redesigned Horizontal Pod Autoscaler function includes support for customized indicators and status conditions.  
- Allowing the Horizontal Pod Autoscaler to reach the appropriate size faster is turning to a beta version.  
- The vertical scaling of the Pod is now in the test phase, making it possible to change the resource limits on the pod during its life cycle.  
- Static encryption via KMS is now in the test phase.  
