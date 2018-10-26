
# Deploying StorageClass

StorageClass provides a way for JCS for Kubernetes to describe storage classes, including fields such as provisioner, parameters, and reclaimPolicy, which are used when class needs to dynamically allocate persistent storage.  
JD Cloud provides customized volume plug-in kubernetes.io/jdcloud-ebs for JCS for Kubernetes, defines provisioner as JD Cloud customized volume plug-in, and provides persistent storage for JCS for Kubernetes with JD Cloud cloud disk. At present, in the JCS for Kubernetes service, we provide three kinds of storageclass. For details, refer to the figure below:

You can also create customized Storageclass:
```
kind: StorageClass
apiVersion: storage.k8s.io/v1
metadata:
  name: mystorageclass-hdd1
provisioner: kubernetes.io/jdcloud-ebs
parameters:
  zones: cn-north-1a, cn-north-1b
  fstype: ext4
reclaimPolicy: Retain
```
**Parameter Description:**  
1. provisioner: Set the parameter value to kubernetes.io/jdcloud-ebs, and it should not be modified. Identity is created with the JD Cloud cloud disk Provisioner plug-in. For example:  
2. type: Set the parameter value to ssd or premium-hdd, corresponding to JD Cloud SSD cloud disk and Premium Hdd cloud disk.  
3. fstype: Set the file system type, with optional parameter values of fstyle and ext4. If no fstyle is specified, ext4 will be used as the default file system type; for example, fstyle = ext4;  
4. zone: Set the availability zone of the cloud disk;    
You may not set the parameter in areas supporting single Availability Zones;  
In a region that supports multiple availability zones, you can select one or all of the availability zones (using “,” to separate parameter values), for example: zones=cn-north-1a, cn-north-1b, When all availability zones are selected, the new cloud disk will be randomly assigned to a certain availability zone according to the name hash algorithm.  
The corresponding relationship between Region and Availability Zone is shown in the following table:  
cn-north-1	Availability Zone A	cn-north-1a  
cn-north-1	Availability Zone B	cn-north-1b  
cn-east-1	Availability Zone A	cn-east-1a  
cn-east-2	Availability Zone A	cn-east-2a  
cn-east-2	Availability Zone B	cn-east-2b  
cn-south-1	Availability Zone A	cn-south-1a   
You can use StorageClassName to specify the corresponding cloud disk type when creating persistent storage declarations.  
For more StorageClass parameters, refer to Kubernetes parameter documentation;  

**Instructions:**  
1. The Persistent Volume created dynamically by storage class specifies the recovery policy in the reclaimPolicy field, which can be Delete or Retain. If reclaimPolicy is not specified when the StorageClass object is created, it will be Delete by default.  
2. Persistent Volumes manually created and managed through storage class will use the recovery policies specified when they are created;  
3.  Persistent Volume, created dynamically by storage class, will use the attach options specified in the mountOptions field in class. If the volume plug-in does not support the attach option but specifies the option, the allocation operation failed.
4. The installation option will not be verified either on class or on PV, so if the mount option is invalid, then this PV will fail;  
5. Storage class has the parameters describing the storage class volume. Depending on the distributor, different parameters can be accepted. For example, the value of JD Cloud parameter type is ssd and premium-hdd. When the parameter is omitted, the default value is used

 
