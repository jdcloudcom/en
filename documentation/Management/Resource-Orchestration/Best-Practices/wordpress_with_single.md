# Create a single-node WordPress application

　　With this template, you can quickly create a stand-alone version WordPress application instance under VPC. This template will automatically create a VPC and subnet, then create a Cloud Database (RDS) MySQL5.7, and finally create an elastic Virtual Machine to complete WordPress deployment.

　　Supported by the userdata function of the elastic Virtual Machine, this template can synchronously distribute the WordPress installation and deployment script to the elastic Virtual Machine, automatically download and install WordPress after creating the Machine and then start the WordPress service.

　　To monitor the execution result of the installation and deployment scripts for WordPress, two virtual resources are added in the template, including: “JDCLOUD::ResourceOrchestration::WaitCondition” and “JDCLOUD::ResourceOrchestration::WaitConditionHandle”. As for detailed introduction of the two resource types, please refer to the introduction page of Resource Orchestration resource type.

　　For userdata execution scripts of the elastic Virtual Machine, we suggest the user to download the message sending script provided by the Resource Orchestration service at first via the OSS address specified by the Resource Orchestration service. Upon completing installation of WordPress, the message sending script will be called to provide feedback to the Resource Orchestration server. For details, please refer to the instance template.

　　Upon the Resource Orchestration server receives the signals of successful deployment, creation of the complete resource stack is completed. If the Resource Orchestration server receives the deployment failure signals, it is deemed that the resource stack creation is failed, the rollback operation will be made and all created resources will be deleted.

　　The created resource stacks will output elastic IP of WordPress.  
 `Note`: The download link specified for message sending scripts of the Resource Orchestration service is as follows:  
- cn-north-1  
Linux Machine: jdro-userdata-cn-north-1.oss.cn-north-1.jcloudcs.com/signal.py  
Windows Machine: jdro-userdata-cn-north-1.oss.cn-north-1.jcloudcs.com/signal.exe
- cn-south-1    
Linux Machine: jdro-userdata-cn-south-1.oss.cn-south-1.jcloudcs.com/signal.py  
Windows Machine: jdro-userdata-cn-south-1.oss.cn-south-1.jcloudcs.com/signal.exe  
- cn-east-2   
Linux Machine: jdro-userdata-cn-east-2.oss.cn-east-2.jcloudcs.com/signal.py  
Windows Machine: jdro-userdata-cn-east-2.oss.cn-east-2.jcloudcs.com/signal.exe  
- cn-east-1  
Linux Machine: jdro-userdata-cn-east-1.oss.cn-east-1.jcloudcs.com/signal.py  
Windows Machine: jdro-userdata-cn-east-1.oss.cn-east-1.jcloudcs.com/signal.exe  

----------
## Orchestration Template Specification:

The template comprises several major parts. The Format Version is the essential part. Some parts in the template can be displayed in any order. However, at the time of creating a template, the logic sequence of the following lists may be useful, because some values in a part may be cited from the last part. Each part is briefly summarized in the list.

`Format Version` (required): Template version number supported by JDRO, current version number: 2018-10-01 

` Description` (optional): A text character string describing and specifying details of a template. 

`Parameters` (optional): Parameter to be customized by the template user when defining and creating the resource stack. Transmit to the template at the time of running (creating or updating stacks). You are allowed to cite the defined parameters in the parts of Resources and Outputs in the template. The use of parameters can enhance template flexibility and improve multiplex capacity. 

`Mappings` (optional): Used for mapping key pairs of parameter values with specified conditions and the key values and searching similar contents of tables. You are allowed to match keys with corresponding values by using the intrinsic function Fn::FindInMap in the parts of Resources and Outputs. 

` Conditions` (optional): Definite conditions such as Fn::And, Fn::Or, Fn::Not and Fn::Equals are applicable for Conditions. When creating or updating resource stacks, the system will calculate all conditions in the template first and then create resources. Create all resources related to the true condition, and ignore all resources related to the false condition. 

` Resources` (optional): Used for specifying resources contained in the resource stacks which are created with the template, including dependency between resources, configuration details, etc. 

`Outputs` (optional): Used for outputting the available information such as attribute. Outputted contents can be obtained via API or the console. 


-----------
Example:
```
{
  "JDCLOUDTemplateFormatVersion": "2018-10-01",
  "Description": "JDRO WORDPRESS_WITH_SINGLE TEMPLATE",
  "Parameters": {
    "VPCName": {
      "Default": "vpc",
      "Type": "String",
      "MinLength": "1",
      "MaxLength": "32",
      "Description": "Define the VPC Name. It cannot be same as an existing VPC name, otherwise the resource will fail to be created",
      "AllowedPattern": "^[a-zA-Z_][a-zA-Z0-9_-]*$",
      "ConstraintDescription": "Name only supports numbers, capital and lowercase letters, English underline and hyphen ."
    },
    "SubnetName": {
      "Default": "subnet",
      "Type": "String",
      "MinLength": "1",
      "MaxLength": "32",
      "Description": "Define the Subnet Name. It cannot be same as an existing Subnet name, otherwise the resource will fail to be created",
      "AllowedPattern": "^[a-zA-Z_][a-zA-Z0-9_-]*$",
      "ConstraintDescription": "Name only supports numbers, capital and lowercase letters, English underline and hyphen ."
    },
    "AddressPrefix": {
      "Default": "10.0.0.0/16",
      "Type": "String",
      "Description": "Give an CIDR",
      "AllowedValues": [
        "192.168.0.0/16",
        "172.16.0.0/16",
        "10.0.0.0/16"
      ],
      "ConstraintDescription": "Need give an exact CIDR."
    },
    "InstanceName": {
      "Default": "vm",
      "Type": "String",
      "MinLength": "1",
      "MaxLength": "32",
      "Description": "The Instance Name",
      "AllowedPattern": "^[a-zA-Z_][a-zA-Z0-9_-]*$",
      "ConstraintDescription": "Name only supports numbers, capital and lowercase letters, English underline and hyphen ."
    },
    "VMPassword": {
      "NoEcho": true,
      "Description": "Password for vm access",
      "Type": "String",
      "MinLength": "8",
      "MaxLength": "16",
      "AllowedPattern": "[a-zA-Z0-9]*"
    },
    "DiskName": {
      "Default": "disk",
      "Type": "String",
      "MinLength": "1",
      "MaxLength": "32",
      "Description": "The Disk Name",
      "AllowedPattern": "^[a-zA-Z_][a-zA-Z0-9_-]*$",
      "ConstraintDescription": ""
    },
    "DBName": {
      "Default": "wordpress",
      "Description": "MySQL database name",
      "Type": "String",
      "MinLength": "2",
      "MaxLength": "32",
      "AllowedPattern": "^[a-z][a-z0-9_]*$",
      "ConstraintDescription": "The name only supports lower case letters, numbers and English underline, no less than 2 characters and no more than 32 characters."
    },
    "DBUser": {
      "Default": "wordpress",
      "Description": "Username for MySQL database access",
      "Type": "String",
      "MinLength": "1",
      "MaxLength": "16",
      "AllowedPattern": "^[a-zA-Z][a-zA-Z0-9]*$",
      "ConstraintDescription": "must begin with a letter and contain only alphanumeric characters."
    },
    "DBPassword": {
      "NoEcho": true,
      "Description": "Password must contain and only supports letters both in upper case and lower case as well as figures, no less than 8 characters and no more than 16 characters. e.g. Ptest1130",
      "Type": "String",
      "MinLength": "8",
      "MaxLength": "16",
      "AllowedPattern": "[a-zA-Z0-9]*"
    }
  },
  "Mappings": {
    "AZInfo": {
      "cn-north-1": {
        "az1": "cn-north-1a",
        "az2": "cn-north-1b"
      },
      "cn-east-1": {
        "az1": "cn-east-1a"
      },
      "cn-east-2": {
        "az1": "cn-east-2a",
        "az2": "cn-east-2b"
      },
      "cn-south-1": {
        "az1": "cn-south-1a"
      }
    },
    "ImageInfo": {
      "cn-north-1": {
        "image": "img-9ha1rgelkq"
      },
      "cn-east-1": {
        "image": "img-htaupmjlqq"
      },
      "cn-east-2": {
        "image": "img-ssazsh60t6"
      },
      "cn-south-1": {
        "image": "img-uxgb28v2y3"
      }
    }
  },
  "Resources": {
    "MyVPC": {
      "Type": "JDCLOUD::VPC::VPC",
      "Properties": {
        "VpcName": {
          "Ref": "VPCName"
        }
      }
    },
    "MySubnet": {
      "Type": "JDCLOUD::VPC::Subnet",
      "Properties": {
        "VpcId": {
          "Ref": "MyVPC"
        },
        "AddressPrefix": {
          "Ref": "AddressPrefix"
        },
        "SubnetName": {
          "Ref": "SubnetName"
        }
      }
    },
    "MyInstance": {
      "Type": "JDCLOUD::VM::Instance",
      "Properties": {
        "Name": {
          "Ref": "InstanceName"
        },
        "ImageId": {
          "Fn::FindInMap": [
            "ImageInfo",
            {
              "Ref": "JDCLOUD::Region"
            },
            "image"
          ]
        },
        "InstanceType": "g.n2.medium",
        "AZ": {
          "Fn::FindInMap": [
            "AZInfo",
            {
              "Ref": "JDCLOUD::Region"
            },
            "az1"
          ]
        },
        "PrimaryNetworkInterface": {
          "NetworkInterface": {
            "SubnetId": {
              "Ref": "MySubnet"
            }
          }
        },
        "Password": {
          "Ref": "VMPassword"
        },
        "DataDisks": [
          {
            "AutoDelete": true,
            "CloudDiskSpec": {
              "Name": {
                "Ref": "DiskName"
              },
              "AZ": {
                "Fn::FindInMap": [
                  "AZInfo",
                  {
                    "Ref": "JDCLOUD::Region"
                  },
                  "az1"
                ]
              },
              "DiskSizeGB": 20,
              "DiskType": "ssd"
            },
            "DiskCategory": "cloud"
          }
        ],
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
                "DatabaseUser=",
                {
                  "Ref": "DBUser"
                },
                "\n",
                "DatabasePwd=",
                {
                  "Ref": "DBPassword"
                },
                "\n",
                "DatabaseName=",
                {
                  "Ref": "DBName"
                },
                "\n",
                "DatabaseHost=",
                {
                  "Fn::GetAtt": [
                    "MyDBInstance",
                    "InternalDomainName"
                  ]
                },
                "\n",
                "WebRootPath='/var/www/html'\n",
                "mkdir -p $WebRootPath \n",
                "yum install -y curl httpd mysql-server php php-common php-mysql\n",
                "yum install -y php-gd php-imap php-ldap php-odbc php-pear php-xml php-xmlrpc\n",
                "chkconfig httpd on\n",
                "wget http://wordpress.org/latest.tar.gz \n",
                "tar -xzvf latest.tar.gz \n",
                "sed -i \"s/database_name_here/$DatabaseName/\" wordpress/wp-config-sample.php\n",
                "sed -i \"s/username_here/$DatabaseUser/\" wordpress/wp-config-sample.php\n",
                "sed -i \"s/password_here/${DatabasePwd:-$DatabasePwdDef}/\" wordpress/wp-config-sample.php\n",
                "sed -i \"s/localhost/$DatabaseHost/\" wordpress/wp-config-sample.php\n",
                "sed -i \"s/bpache/apache/\" wordpress/wp-config-sample.php\n",
                "mv wordpress/wp-config-sample.php wordpress/wp-config.php\n",
                "cp -a wordpress/* $WebRootPath \n",
                "rm -rf wordpress*\n",
                "service httpd stop\n",
                "usermod -d $WebRootPath apache &>/dev/null\n",
                "chown apache:apache -R $WebRootPath\n",
                "service httpd start\n",
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
      }
    },
    "MyElasticIp": {
      "Type": "JDCLOUD::VPC::ElasticIp",
      "Properties": {
        "ElasticIPSpec": {
          "BandwidthMbps": 1,
          "Provider": "bgp"
        }
      }
    },
    "MyAssociateElasticIp": {
      "Type": "JDCLOUD::VPC::AssociateElasticIp",
      "Properties": {
        "InstanceId": {
          "Ref": "MyInstance"
        },
        "InstanceType": "vm",
        "ElasticIpId": {
          "Ref": "MyElasticIp"
        }
      }
    },
    "MyDBInstance": {
      "Type": "JDCLOUD::RDS::DBInstance",
      "Properties": {
        "Engine": "MySQL",
        "AZId": [
          {
            "Fn::FindInMap": [
              "AZInfo",
              {
                "Ref": "JDCLOUD::Region"
              },
              "az1"
            ]
          }
        ],
        "ChargeSpec": {
          "ChargeMode": "postpaid_by_duration"
        },
        "EngineVersion": "5.7",
        "InstanceClass": "db.mysql.s1.micro",
        "InstanceName": {
          "Ref": "DBName"
        },
        "InstanceStorageGB": 20,
        "VpcId": {
          "Ref": "MyVPC"
        },
        "SubnetId": {
          "Ref": "MySubnet"
        },
        "Database": {
          "CharacterSetName": "utf8",
          "DBName": {
            "Ref": "DBName"
          }
        },
        "Account": {
          "AccountName": {
            "Ref": "DBUser"
          },
          "AccountPassword": {
            "Ref": "DBPassword"
          }
        }
      }
    },
    "MyWaitCondition": {
      "Type": "JDCLOUD::ResourceOrchestration::WaitCondition",
      "DependsOn": [
        "MyInstance"
      ],
      "Properties": {
        "Count": 1,
        "Handle": {
          "Ref": "MyWaitConditionHandle"
        },
        "Timeout": "3600"
      }
    },
    "MyWaitConditionHandle": {
      "Type": "JDCLOUD::ResourceOrchestration::WaitConditionHandle",
      "Properties": {}
    }
  },
  "Outputs": {
    "Server_Domain": {
      "Value": {
        "Fn::Join": [
          ":",
          [
            {
              "Fn::GetAtt": [
                "MyInstance",
                "ElasticIpAddress"
              ]
            },
            "80"
          ]
        ]
      }
    }
  }
}
```
