
# Enable/Disable Network Policy

Network Policy is used for defining the network isolation strategy between Pods within the cluster and the network isolation strategy between Pod and other external network terminal. JD Cloud Network plug-ins provide the Network Policy Controller for support, refer to [Network Policy Overview]() for more descriptions.

You can enable or disable Network Policy these two values with one click at JD Cloud Console. You can also [Manually Deploy Network Policy Controller] in the cluster.

**Operation Description**

 1. After enabling Network Policy, deploy Network Policy Controller with the method of Daemonset in the cluster, and configure scaling policy based on level of CPU and memory for Pod, refer to [Network Policy Deployment Description]() for details;
 2. After disabling Network Policy, all deployments related to Network Policy Controller in the cluster will be removed; the already defined network isolation policy is still effective; the newly defined network isolation policy is no longer effective;
 3. Clusters in error, deleted or other middle running status do not support modification of Network Policy status;
 4. When the cluster is running but does not have a Node in a running status, Network Policy Controller

**Operation Steps:**

 1. Open the Console and select [Elastic Compute>>JCS for Kubernetes>>Cluster Service>>Cluster](https://cns-console.jdcloud.com/host/kubernetes/list)  
 2. Select the cluster service requiring for modifying Network Policy status, click the cluster name to enter the Cluster Details;  
 3. Click **OK** in the popped-up deleting JCS for Kubernetes popup to delete JCS for Kubernetes.
