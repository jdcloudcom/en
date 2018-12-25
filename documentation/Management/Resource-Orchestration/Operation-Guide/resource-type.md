# Resource Type

　　The resource type refers to the list of resource types supported by the Resource Orchestration service of JD Cloud, including the Virtual Machine, the Cloud Disk Service, VPC, the Load Balancer, RDS, etc. 
 
　　Turn on the console, select **Management-Resource Orchestration-Resource Type**, and view and exhibit the resource type list supporting orchestration.

## List of Resource Type Supported

| Resource Type | Description | 
|:-----|:-----|
| JDCLOUD::VM::Instance | Create VM Instance |
| JDCLOUD::VM::Disk | Create Cloud Disk |
| JDCLOUD::VM::AttachDisk | Instances to Attach Existing Hard Disks to Operation | 
| JDCLOUD::VPC::VPC | CreateVPC |
| JDCLOUD::VPC::Subnet | Create a subnet in VPC | 
| JDCLOUD::VPC::EIP | Assign a public networkIP |
| JDCLOUD::VPC::AssociateEIP | Load Balancer. The Virtual Machine and the Load Balancer are supported currently.|
| JDCLOUD::LB::LoadBalancer | Create Load Balancer |
| JDCLOUD::LB::Listener | Create listening |
| JDCLOUD::LB::TargetGroup | Create a target group |
| JDCLOUD::LB::RegisterTargets | Add instances in a target group |
| JDCLOUD::LB::Backend | Create the backend service | 
| JDCLOUD::RDS::DBInstance | Create a cloud database instance |

　　Table 1 Resource type supported by the Resource Orchestration service 
## Resource Type Details
### Virtual Machines
#### User Guide for VM Userdata

Where the Userdata function of the Virtual Machines is required when creating the Virtual Machines, the user can adopt the JDCLOUD::ResourceOrchestration::WaitConditionHandle and JDCLOUD::ResourceOrchestr provided by the Resource Orchestration to monitor the Userdata script execution results uploaded at the same time.ation::WaitCondition。 

##### Userdata Linux Script Example of Resource Orchestration

```
     "Userdata": {
        "Fn::Base64": {
          "Fn::Join": [
            "",
            [
              "#!/bin/bash \n",
              " Region=",
              {
                "Ref": "JDCLOUD::Region"
              },
              "\n",
              " wget jdro-userdata-${Region}.s3.${Region}.jcloudcs.com/signal.py -O /tmp/signal.py  \n",
              " chmod +x /tmp/signal.py \n",
              " #user code begin \n",



    	  " #add your userdata scripts  here"



              " # user code end \n",
              "/tmp/signal.py --exit-code $? ",
              {
                "Ref": "MyWaitConditionHandle"
              },
              " \n "
            ]
          ]
        }
      }

```

##### Userdata Windows Script Example of Resource Orchestration

```
     "Userdata": {
        "Fn::Base64": {
          "Fn::Join": [
            "",
            [
               " <powershell> \n",
               " $Region=\"",
               {
                "Ref": "JDCLOUD::Region"
               },
               "\"\n",
               " $client = new-object System.Net.WebClient \n",
               " $OSSAdress = \"http://jdro-userdata-$Region.s3.$Region.jcloudcs.com/signal.exe\" \n",
               " $client.DownloadFile($OSSAdress, 'C:\\WINDOWS\\system32\\signal.exe') \n",

               " $useraction = \"hello world\" \n",
               " $useraction > C:\\jdro.txt \n",

               " jdro-signal  ",
               "       --success ",	" true ",
               {
                   "Ref":"MyWaitConditionHandle"
               },
               "  >> C:\\jdro.log \n ",
               " </powershell> \n"
            ]
          ]
        }
      }

```

   The user is allowed to download the signal script provided by the Resource Orchestration in the Userdata script. The python script is available in the Linux platform, while signal.exe is available in the Windows platform. Scripts of different regions are independently deployed. Please refer to the reference above.

   The user is suggested to execute the signal script at the Userdata end and send the script execution result to the Resource Orchestration server. The JDCLOUD::ResourceOrchestration::WaitCondition resource can listen to the execution results. If the execution results are succeeded, the resource will display “Created”. Otherwise, the resource will display “Create Failed”.



##### Instructions to Signal Script

   The format of the script parameter signal is as follows:

```
    		Usage: signal.py   \[options\]  \[WaitConditionHandle URL\]

    		Options:
     			-s SUCCESS, --success=SUCCES  

    						[optional] If true, signal success to jdro; if false, signal failure. Default: true 
     			-i ID, --id=ID        [optional]  An unique ID to send with the signal
     			-e EXIT_CODE, --exit-code=EXIT_CODE [optional]  Derive success or failure from specified exit code

```

   WaitConditionHandle URL is returned by the resource JDCLOUD::ResourceOrchestration::WaitConditionHandle.

```
      	{
                   "Ref": "MyWaitConditionHandle"
        }
```

##### Precautions  

By default, when signals are sent to the Resource Orchestration server by the same Virtual Machine, only one signal will be received, while the others will be denied.
Where the results are sent via different customized IDs (e.g. by using random numbers) by the user and each result is accepted, the resource creation result exception may be incurred.


  
## View resource type details

You are allowed to select **Management-Resource Orchestration-Resource Type** in the console to enter the resource type list page. Then, select a resource type in the list and click **View Details** in the operation column to view the resource type details.

- Return value: Refer to relevant information returned by the resource type; exhibit “name” and “description” information. 

- Attribute: Refer to the attribute information to be specified when defining the resource in the template; the list will exhibit “name”, “type”, “required or not”, “description” and “details”.

### Return Value

　　Relevant information of resource type query result is provided to the user in the resource type detail page. 
  
　　As shown in the figure below, taking JDCLOUD::VM::Disk for example, its return value name is status, and the name describes the status of the cloud disk, being creating, available, in-use, extending, restoring, deleting, deleted, error_create, error_delete, error_restore or error_extend.
  
![返回值](../../../../image/Resource-Orchestration/resourcetype002.png)

### Attribute

　　The resource type detail page provides the user with the attribute information to be assigned when defining the resource in the Resource Orchestration template.
  
　　As shown in the figure below, taking JDCLOUD::VM::Disk for example, such as AZ, Charge, and Description.

![属性](../../../../image/Resource-Orchestration/resourcetype003.png)


