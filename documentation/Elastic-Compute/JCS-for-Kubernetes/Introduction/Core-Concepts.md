
# Core Concepts

| Concept    |    Explanation |
| --- | --- |
|    Cluster |    The cloud resource set necessary for the JCS for Kubernetes comprises JD Cloud resources such as the cloud server, the Cloud Disk Service, Public IP, and Load Balancer. |
|  Management Node   |One instance installed with Kubernetes management components such as kube-apiserver, kube-controller-manager and kube-schedule.     |
|  Working node   |The VM instance installed with Kubernetes components (docker Engine for the JD Cloud) for running container, such as Kubelet and network plug-ins, must be registered to a cluster at first, which can be used for deploying and managing container applications only when such instance is available.     |
|Working Node Group     |  A group of working node sets with the same Instance Type configuration.   |  
 
Kubernetes related concepts  
Kubernetes is a large-scale container scheduling system for automatic deployment, expansion and management of container applications. Features such as portability, scalability, and automatic scheduling.

|   Concept  | Explanation     |
| --- | --- |
| Node (Master)    |  The management capacity of the JCS for Kubernetes is provided by Master and Master in the JCS for Kubernetes runs the core cluster components such as APIServer, ControllerManager and Etcd; one Master node corresponds to one management node in JD Cloud cluster.   |
| Node    |  The computing power of the JCS for Kubernetes is provided by Node, and Node in the JCS for Kubernetes is the working host running all Pods. It can be a physical machine or a Virtual Machine; one Node corresponds to one working node in the JD Cloud cluster.   |
|  Pod   |   	Pod is the minimum/simplest basic unit for creating or deploying JCS for Kubernetes. One Pod represents a process running in the cluster, which can run a single container or containers working together. Generally, tightly-coupled applications are encapsulated in containers and the containers share the Kernel, network and file system.  |
|  StatefulSet   |   	StatefulSet guarantees Pod deployment and scaling sequences and solves the stateful service problems, i.e. PodName and HostName remain unchanged after scheduling Pod again, the same persistent data can be accessed and the deployment and expansion are made according to the predefined sequence (i.e. from 0 to N-1) and orderly contracted and deleted (i.e. from N-1 to 0).  |
|  DaemonSet  |   	Make sure that replica of one Pod is run on all (or a part of) Nodes. When there is any Node added to the cluster, one Pod will be created for such Node. When there is any Node removed from the cluster, these Pods will be recovered. All Pods created by DaemonSet will be deleted with the deletion of DaemonSet, and the typical applications include cluster storage daemon, log collection daemon and monitoring daemon.  |
|  Job   |   	Job is responsible for batch treatment task, i.e. the task is only executed for one time, guaranteeing one or more Pods of batch treatment are successfully ended.  |
|  CronJob   |   	Cron Job manages the time-based Job, running one Job periodically according to the preset program.  |
|  Service   |   	The logic group of one Pod defines the Pod access policy. For applications of the cluster, Kubernetes provides simple Endpoints API and the application program will be updated once one Pod group in Service changes. For applications not in the JCS for Kubernetes, Kubernetes provides the Service access based on VIP bridge and redirection to backend Pod via Service.  |
|  Job   |   	Job is responsible for batch treatment task, i.e. the task is only executed for one time, guaranteeing one or more Pods of batch treatment are successfully ended.  |
|   Ingress	  | Ingress refers to the entry to access the internal cluster service from the JCS for Kubernetes, providing the rule sets for sending in-site connections to the cluster service. You can configure URL for external access, the Load Balancer, SSL and the name-based Virtual Machines to Ingress. Users can request ingress by sending POST Ingress resources to the API server. |
|  ConfigMap   |   ConfigMap is used for saving key-value pair configuration data, capable of saving a single attribute as well as a configuration file. The configuration data is used in Pods and customer scenario comprises setting environment variable values and setting command line parameters in container or creating config files in data volume.  |
|  Volume   |   	The life cycle and action range of the Kubernetes storage volume share the same Pod. The storage volume in the statement of each Pod is shared by all containers of Pod. The use of Persistent Volume Claim is supported, i.e. PVC logic storage.  |
|  Persistent Volume(PV)/Persistent Volume Claim(PV)   |   	PV and PVC enable the logical abstraction capacity of storage to the JCS for Kubernetes, such that configuration to real background storage technique can be ignored when configuring the Pod logic, and the configuration is made by the PV configurer. PV is the resource provider, varying with changes of the cluster infrastructures and being configured by the JCS for Kubernetes administrator; however, PVC is the resource user, varying with changes of business and service demands and being configured by service administrator, i.e. the user of JCS for Kubernetes; and at present, JD Cloud supports the use of the Cloud Disk Service as PV.  |

