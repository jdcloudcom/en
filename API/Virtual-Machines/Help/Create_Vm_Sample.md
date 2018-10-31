##1. General situation to create minimized parameter of a machine

    Create VM with local disk as system disk
    {
        "InstanceSpec":{
            "az":"cn-north-1a",
            "name":"test",
            "imageId":"bba85cab-dfdc-4359-9218-7a2de429dd80",
            "instanceType":"g.n2.medium",
            "systemDisk":{
                "diskCategory":"local"
            },
            "primaryNetworkInterface":{
                "networkInterface":{
                    "subnetId":"subnet-2yl2n4hqte"
                }
            }
        }
    }
    Create VM with cloud disk as system disk
    {
        "InstanceSpec":{
            "az":"cn-north-1a",
            "name":"test",
            "imageId":"bba85cab-dfdc-4359-9218-7a2de429dd80",
            "instanceType":"g.n2.medium",
            "systemDisk":{
                "diskCategory":"cloud",
                "CloudDiskSpec":{
                    "DiskType":"ssd",
                    "DiskSizeGB":50
                }
            },
            "primaryNetworkInterface":{
                "networkInterface":{
                    "subnetId":"subnet-2yl2n4hqte"
                }
            }
        }
    }
### Required Parameters:
|Field Name|Description|
|-|-|
|InstanceSpec.Name         | Name of Virtual Machine|
|InstanceSpec.Az           | Availability Zone|
|InstanceSpec.ImageId      | Image ID|
|InstanceSpec.InstanceType | Instance Type|
|InstanceSpec.PrimaryNetworkInterface.networkInterface.subnetId | Subnet ID|
|InstanceSpec.SystemDisk | System Disk Configuration|
|InstanceSpec.SystemDisk.DiskCategory| Disk classification is used to identify whether to create VM with local disk as system disk or with cloud disk as system disk. The value needs to match the image type. The localDisk type image needs to transmit "local", and the cloudDisk type image needs to transmit "cloud". <br>When "local" is passed in, the system disk is not billed, and the rest of the parameters under SystemDisk are invalid. <br>When "cloud" is introduced, the billing method of cloud disk is consistent with that of virtual machine|
|InstanceSpec.SystemDisk.CloudDiskSpec.DiskType| Type of Cloud Disk, it must be transmitted when made as system disk |
|InstanceSpec.SystemDisk.CloudDiskSpec.DiskSizeGB| Size of Cloud Disk [40-500GB] can't be smaller than that of the system disk of image. It must be tranmitted when cloud disk is made as system disk.

### Optional Parameters:
|Field Name|Description|
|-|-|
|MaxCount|Create quantity, and the default is 1|
|InstanceSpec.Charge|If the billing method of virtual machine is not specified, then pay by configuration is by default. The billing method of virtual machine only supports pay by configuration or monthly package |
|InstanceSpec.Description|Virtual Machine Description|
|InstanceSpec.Password|Virtual Machine Password|
|InstanceSpec.KeyNames|Key Pair Name|
|InstanceSpec.SystemDisk.CloudDiskSpec.AutoDelete|Whether the system disk is deleted with machine. If you create a local system disk, this parameter is forced to be true; if you create a machine with cloud system disk, the default is consistent with the configuration in the image. <br>When pay by configuration, it can be specified as true, and the monthly package is forced to be false by default|
|InstanceSpec.PrimaryNetworkInterface.NetworkInterface.PrimaryIpAddress|When the primary intranet IP of the primary network interface specifies this parameter, MaxCount can only be 1|
|InstanceSpec.PrimaryNetworkInterface.DeviceIndex|The device index of the primary network interface can only be 1|
|InstanceSpec.PrimaryNetworkInterface.AutoDelete|The primary network interface is deleted with the machine. The primary network interface can only be true|
|InstanceSpec.DataDisks| Data disk, which means the billing method of data disk is forced to be consistent with the billing method of the virtual machine. |
|InstanceSpec.DataDisks.n.DiskCategory|The required parameters of disk classification must be cloud (when creating a data disk)|
|InstanceSpec.DataDisks.n.DeviceName| Optional parameters, the data disk logical attaching point|
|InstanceSpec.DataDisks.n.AutoDelete| Whether the optional parameter is deleted with the machine, the pay by configuration billing is true by default, and the monthly package is forced to be false by default|
|InstanceSpec.DataDisks.n.NoDevice| Optional parameter to exclude devices in the package image or corresponding DeviceName in the template|
|InstanceSpec.DataDisks.n.CloudDiskSpec.Name| Optional parameters, data disk name|
|InstanceSpec.DataDisks.n.CloudDiskSpec.Description| Optional parameters, data disk description|
|InstanceSpec.DataDisks.n.CloudDiskSpec.DiskType|Required parameters (when creating a data disk), data disk type|
|InstanceSpec.DataDisks.n.CloudDiskSpec.DiskSizeGB| Required parameters (when creating a data disk), the size of data disk|
|InstanceSpec.DataDisks.n.CloudDiskSpec.SnapshotId| Optional parameters, create data disk from snapshot|
|InstanceSpec.ElasticIp| The billing of public IP is pay by consumption by default. If the billing parameters are not specified or are not pay by consumption, the billing method is forced to be consistent with that of the virtual machine. |
|InstanceSpec.ElasticIp.BandwidthMbps| Required parameters (when creating public IP), bandwidth size|
|InstanceSpec.ElasticIp.Provider| Optional parameters, the default is BGP|
|InstanceSpec.ElasticIp.ChargeSpec| Optional parameters, the default is pay by consumption|
|ClientToken| uuid that supports idempotence|


## II. Using AG to create the minimized parameters of the machine
    {
        "instanceSpec": {
            "agId":"ag-nm9ebd1z8n",
            "name":"test"
        }
    }
### Required Parameters:
|Field Name|Description|
|-|-|
|InstanceSpec.Name| Virtual Machine Name|
|InstanceSpec.AgId| Availability Group ID|
### Optional Parameters:
|Field Name|Description|
|-|-|
|MaxCount| Create quantity, the default is 1|
|InstanceSpec.Charge|If the billing method of virtual machine is not specified, then pay by configuration is by default. The billing method of virtual machine only supports pay by configuration or monthly package|
|InstanceSpec.Description|Virtual Machine Description|
|InstanceSpec.PrimaryNetworkInterface.NetworkInterface.PrimaryIpAddress|When the primary intranet IP of the primary network interface specifies this parameter, MaxCount can only be 1|
|ClientToken| uuid that supports idempotence|

## III. Using templates to create the minimized parameters of the machine
    {
        "instanceSpec": {
            "instanceTemplateId":"it-a7j208hj93",
            "name":"xx",
            "az":"cn-north-1a"
        }
    }
### Required Parameters:
|Field Name|Description|
|-|-|
|InstanceSpec.Name| Virtual Machine Name|
|InstanceSpec.Az| Availability Zone|
|InstanceSpec.InstanceTemplateId| Start the Template ID|
### Optional parameters: If there's conflicts between the specified parameter and a parameter in the template, then the specified parameter will replace the parameter in the template by force
|Field Name|Description|
|-|-|
|InstanceSpec.ImageId| Image ID, if it specifies an image ID that is inconsistent with the template, the data disk parameter dataDisks in the template is invalidated|
|InstanceSpec.InstanceType| Specification Type|
|InstanceSpec.SystemDisk | System Disk Configuration|
|InstanceSpec.SystemDisk.DiskCategory| Disk classification is used to identify whether to create VM with local disk as system disk or with cloud disk as system disk. The value needs to match the image type. The localDisk type image needs to transmit "local", and the cloudDisk type image needs to transmit "cloud". <br>When "local" is passed in, the system disk is not billed, and the rest of the parameters under SystemDisk are invalid. <br>When "cloud" is introduced, the billing method of cloud disk is consistent with that of virtual machine|
|InstanceSpec.SystemDisk.CloudDiskSpec.DiskType| Type of Cloud Disk|
|InstanceSpec.SystemDisk.CloudDiskSpec.DiskSizeGB| The size of the cloud disk, shall not be less than that of the image system disk|
|InstanceSpec.SystemDisk.CloudDiskSpec.AutoDelete| Whether the system disk is deleted with machine, the default is consistent with the configuration in the image. The pay by configuration billing can be true, but the monthly package is forced to be false by default|
|MaxCount| Create quantity, the default is 1|
|InstanceSpec.Charge|If the billing method of virtual machine is not specified, then pay by configuration is by default. The billing method of virtual machine only supports pay by configuration or monthly package|
|InstanceSpec.Description|Virtual Machine Description|
|InstanceSpec.Password|Virtual Machine Password|
|InstanceSpec.KeyNames| Key Pair Name|
|InstanceSpec.PrimaryNetworkInterface.networkInterface.subnetId| Subnet ID|
|InstanceSpec.PrimaryNetworkInterface.NetworkInterface.PrimaryIpAddress|When the primary intranet IP of the primary network interface specifies this parameter, MaxCount can only be 1|
|InstanceSpec.PrimaryNetworkInterface.DeviceIndex|The device index of the primary network interface can only be 1|
|InstanceSpec.PrimaryNetworkInterface.AutoDelete|The primary network interface is deleted with the machine, it can only be true|
|InstanceSpec.DataDisks| Data disk, which means the billing method of data disk is forced to be consistent with the billing method of the virtual machine. |
|InstanceSpec.DataDisks.n.DiskCategory| The required parameter (when creating a data disk), must be cloud|
|InstanceSpec.DataDisks.n.DeviceName| Optional Parameters|
|InstanceSpec.DataDisks.n.AutoDelete| Whether the optional parameter is deleted with the machine, the pay by configuration billing is true by default, and the monthly package is forced to be false by default|
|InstanceSpec.DataDisks.n.NoDevice| Optional parameter to exclude devices in the package image or corresponding DeviceName in the template|
|InstanceSpec.DataDisks.n.CloudDiskSpec.Name| Optional parameters, data disk name|
|InstanceSpec.DataDisks.n.CloudDiskSpec.Description| Optional parameters, data disk description|
|InstanceSpec.DataDisks.n.CloudDiskSpec.DiskType| The required parameter (when creating a data disk), the type of a data disk|
|InstanceSpec.DataDisks.n.CloudDiskSpec.DiskSizeGB| Required parameters (when creating a data disk), the size of data disk|
|InstanceSpec.DataDisks.n.CloudDiskSpec.SnapshotId| Optional parameters, create data disk from snapshot|
|InstanceSpec.ElasticIp| The billing of public IP is pay by consumption by default. If the billing parameters are not specified or are not pay by consumption, the billing method is forced to be consistent with that of the virtual machine. |
|InstanceSpec.ElasticIp.BandwidthMbps| Required parameters, the bandwidth size|
|InstanceSpec.ElasticIp.Provider| Optional parameters, the default is BGP|
|InstanceSpec.ElasticIp.ChargeSpec| Optional parameters, the default is pay by consumption|
|ClientToken| uuid that supports idempotence|
