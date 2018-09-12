
# Deploying StorageClass

StorageClass provides a way for Kubernetes Services to describe storage classes, including fields such as provisioner, parameters, and reclaimPolicy, which are used when class needs to dynamically allocate persistent storage.

JD Cloud provides customized volume plug-in kubernetes.io/jdcloud-ebs for Kubernetes Service, defines provisioner as JD Cloud customized volume plug-in, and provides persistent storage for Kubernetes Service with JD Cloud Cloud Disk Service. At present, in the Kubernetes Service, we provide three kinds of storageclass. For details, refer to the figure below:





You can also create customized Storageclass:

kind: StorageClass
apiVersion: storage.k8s.io/v1
metadata:
  name: mystorageclass-hdd1
provisioner: kubernetes.io/jdcloud-ebs
parameters:
  zones: cn-north-1a, cn-north-1b
  fstype: ext4
reclaimPolicy: Retain
Parameter Description:

provisioner: Set the parameter value to kubernetes.io/jdcloud-ebs, and it should not be modified. Identity is created with the JD Cloud Cloud Disk Service Provisioner plug-in. For example:

type: Set the parameter value to ssd or premium-hdd, corresponding to JD Cloud SSD Cloud Disk and Premium Hdd Cloud Disk.

fstype: Set the file system type, with optional parameter values of fstyle and ext4. If no fstyle is specified, ext4 will be used as the default file system type; for example, fstyle = ext4;

zone: Set the Availability Zone of the Cloud Disk Service;

You may not set the parameter in areas supporting single Availability Zones;

In a region that supports multiple Availability Zones, you can select one or all of the Availability Zones (using “,” to separate parameter values), for example: zones=cn-north-1a, cn-north-1b, When all Availability Zones are selected, the new Cloud Disk Service will be randomly assigned to a certain Availability Zone according to the name hash algorithm.

The corresponding relationship between Region and Availability Zone is shown in the following table:

cn-north-1	Availability Zone A	cn-north-1a
cn-north-1	Availability Zone B	cn-north-1b
cn-east-1	Availability Zone A	cn-east-1a
cn-east-2	Availability Zone A	cn-east-2a
cn-east-2	Availability Zone B	cn-east-2b
cn-south-1	Availability Zone A	cn-south-1a
You can use StorageClassName to specify the corresponding cloud disk service type when creating persistent storage declarations.

For more StorageClass parameters, refer to Kubernetes parameter documentation;
Description:

The Persistent Volume created dynamically by storage class specifies the recovery policy in the reclaimPolicy field, which can be Delete or Retain. If reclaimPolicy is not specified when the StorageClass object is created, it will be Delete by default.
Persistent Volumes manually created and managed through storage class will use the recovery policies specified when they are created;

Persistent Volume, created dynamically by storage class, will use the attach options specified in the mountOptions field in class. If the volume plug-in does not support the attach option but specifies the option, the allocation operation fail. Installation options do not validate on class and PV, so if attach options are invalid, the PV will fail.

Storage class has the parameters describing the storage class volume. Depending on the distributor, different parameters can be accepted. For example, the value of JD Cloud parameter type is ssd and premium-hdd. When the parameter is omitted, the default value is used

 