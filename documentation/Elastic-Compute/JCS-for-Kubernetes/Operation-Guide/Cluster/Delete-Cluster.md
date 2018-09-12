
# Delete Cluster

**Operation Instructions**

 1. Deleting the cluster means removing all cluster-related resources, all working node groups in cluster and working nodes in working node group, and the deployed applications will be deleted completely; the EIP created by the user and Kubernetes persistent storage without setting automatic deletion will continue to be retained. If you do not need to keep it, please delete it at corresponding page for the sake of avoiding additional charges.
 2. When the deletion is successful, the status will become deleted and the message will be displayed on the console for 15 minutes.

**Steps of Deleting Cluster:**

 1. Open the Console and Select Elastic Compute >>Kubernetes Service>>Cluster Service>>Cluster;
 2. Select the Custer Required to be Deleted and Click the Button of [Delete] on the right.
 3. In the pop-up window of deleting the Kubernetes Service, click [OK] to trigger the deletion of Kubernetes Service.