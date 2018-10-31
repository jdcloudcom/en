
# Delete working node group

**Operation Instructions:**

1、The quantity of working node group in a single cluster should at least be 1. If this working node group is the only working node group of the cluster, the deletion is not supported.  
2、When the deletion is successful, the status will become deleted and the message will be displayed on the console for 15 minutes.

**Steps of deleting the working node group:**

1、Open the console and select the Elastic Compute>>JCS for Kubernetes >>Cluster Service>>Work Node Group; select the working node group required scaling and click the button of delete;  
2、In the pop-up window, enter the number of expected target node, VM of the current region and the number limit for the intranet IP that the working node CIDR can allocate;  
3、Click the key OK to enter into the working node group scaling process.
