
# Deploy Deployment

Below is an example of Deployment, which creates a ReplicaSet to start 3 nginx pods.

Download the sample file and execute the command:

$ kubectl create -f https://kubernetes.io/docs/user-guide/nginx-deployment.yaml --record


By setting --record flag in kubectl as true, it is possible to record the current command creation in the annotation to create or upgrade the resource. This will be useful in the future, for example, to view which commands are executed in each Deployment revision.

Then, by implementing get immediately, it is possible to obtain the following results:

$ kubectl get deployments


The output result shows that the desired number of repalica is 3 (configured according to the. spec.replicas in deployment), while the current number of replica (. status.replicas) is 0, with the latest number of replica (.status.updatedReplicas) as 0 and the available number of replica (.status.availableReplicas) as 0.

A few seconds later, by executing the get command, it will be possible to obtain the following output:

$ kubectl get deployments



We can see that Deployment has created three replicas, all of which are the latest (including the latest pod template) and available (which is the minimum number of pods in the ready state according to the.spec.minReadySeconds declaration in Deployment) Executing kubectl get rs and kubectl get pods will show Replica Set (RS) and Pod have been created.

$ kubectl get rs


You may notice that the name of ReplicaSet is always <Deployment's name>-<hash value of pod template>.

$ kubectl get pods --show-labels


The Replica Set just created will ensure that there are always 3 nginx pods.

Please note that: You must specify the correct pod template label in the Deployment selector (app = nginx in this example) and not be confused with the pod template label specified in the other controller selector (including Deployment, Replica Set and Replication Controller). Kubernetes itself will not prevent you from arbitrarily specifying the pod template label, but if you do so, these controllers conflict with each other and may lead to incorrect behavior.

