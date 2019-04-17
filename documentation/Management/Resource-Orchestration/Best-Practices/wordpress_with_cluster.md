# Create a WordPress application of cluster mode

With this template, you can quickly create a dual-computer version WordPress application instance under VPC. This template will automatically create a VPC and subnet, a Cloud Database (RDS) MySQL5.7, two elastic Virtual Machines to deploy WordPress service and an elastic Load Balancer to provide external access.

Supported by the userdata function of the elastic Virtual Machine, this template can synchronously distribute the WordPress installation and deployment script to the elastic Virtual Machine, automatically download and install WordPress after creating the Machine and then start the WordPress service. For use details of userdata, please refer to the introductions in single WordPress application creation above.

The created resource stacks will output public IP of the Load Balancer.

`Note`: At present, the Resource Orchestration service does not support creation of Availability Group. While creating elastic Virtual Machines, it needs to define several VM Instance resources in the template.

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
## Example Template:
```  
{
  "JDCLOUDTemplateFormatVersion": "2018-10-01",
  "Description": "JDRO WORDPRESS_WITH_CLUSTER TEMPLATE",
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
      "Description": "Give an exact CIDR",
      "AllowedValues": [
        "192.168.0.0/16",
        "172.16.0.0/16",
        "10.0.0.0/16"
      ],
      "ConstraintDescription": "Need give an exact CIDR."
    },
    "InstanceName1": {
      "Default": "vm1",
      "Type": "String",
      "MinLength": "1",
      "MaxLength": "32",
      "Description": "Define the Instance Name",
      "AllowedPattern": "^[a-zA-Z_][a-zA-Z0-9_-]*$",
      "ConstraintDescription": "Name only supports numbers, capital and lowercase letters, English underline and hyphen."
    },
    "InstanceName2": {
      "Default": "vm2",
      "Type": "String",
      "MinLength": "1",
      "MaxLength": "32",
      "Description": "Define the Instance Name",
      "AllowedPattern": "^[a-zA-Z_][a-zA-Z0-9_-]*$",
      "ConstraintDescription": "Name only supports numbers, capital and lowercase letters, English underline and hyphen."
    },
    "VMPassword": {
      "NoEcho": true,
      "Description": "Password for vm access",
      "Type": "String",
      "MinLength": "8",
      "MaxLength": "16",
      "AllowedPattern": "[a-zA-Z0-9]*"
    },
    "DiskName1": {
      "Default": "disk1",
      "Type": "String",
      "MinLength": "1",
      "MaxLength": "32",
      "Description": "The Disk Name",
      "AllowedPattern": "^[a-zA-Z_][a-zA-Z0-9_-]*$",
      "ConstraintDescription": "Name only supports numbers, capital and lowercase letters, English underline and hyphen."
    },
    "DiskName2": {
      "Default": "disk2",
      "Type": "String",
      "MinLength": "1",
      "MaxLength": "32",
      "Description": "The Disk Name",
      "AllowedPattern": "^[a-zA-Z_][a-zA-Z0-9_-]*$",
      "ConstraintDescription": "Name only supports  numbers, capital and lowercase letters, English underline and hyphen."
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
    },
    "LoadBalancerName": {
      "Default": "lb",
      "Description": "LoadBalancer name",
      "Type": "String",
      "MinLength": "1",
      "MaxLength": "32",
      "AllowedPattern": "^[a-zA-Z_][a-zA-Z0-9_-]*$",
      "ConstraintDescription": "Name only supports  numbers, capital and lowercase letters, English underline  and hyphen."
    },
    "TargetGroupName": {
      "Default": "lbtargetgroup",
      "Description": "TargetGroup Name",
      "Type": "String",
      "MinLength": "1",
      "MaxLength": "32",
      "AllowedPattern": "^[a-zA-Z_][a-zA-Z0-9_-]*$",
      "ConstraintDescription": "Name only supports  numbers, capital and lowercase letters, English underline  and hyphen."
    },
    "LBBackendName": {
      "Default": "lbbackend",
      "Description": "Backend Name",
      "Type": "String",
      "MinLength": "1",
      "MaxLength": "32",
      "AllowedPattern": "^[a-zA-Z_][a-zA-Z0-9_-]*$",
      "ConstraintDescription": "Name only supports  numbers, capital and lowercase letters, English underline  and hyphen."
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
    "MyInstance1": {
      "Type": "JDCLOUD::VM::Instance",
      "Properties": {
        "Name": {
          "Ref": "InstanceName1"
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
        "ElasticIp": {
          "BandwidthMbps": 1,
          "Provider": "bgp"
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
                "Ref": "DiskName1"
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
                " #!/bin/bash \n",
                " Region=",
                {
                  "Ref": "JDCLOUD::Region"
                },
                "\n",
                " wget  jdro-userdata-${Region}.s3.${Region}.jcloudcs.com/signal.py -O /tmp/signal.py \n",
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
    "MyInstance2": {
      "Type": "JDCLOUD::VM::Instance",
      "Properties": {
        "Name": {
          "Ref": "InstanceName2"
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
        "ElasticIp": {
          "BandwidthMbps": 1,
          "Provider": "bgp"
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
                "Ref": "DiskName2"
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
                " #!/bin/bash \n",
                " Region=",
                {
                  "Ref": "JDCLOUD::Region"
                },
                "\n",
                " wget  jdro-userdata-${Region}.s3.${Region}.jcloudcs.com/signal.py -O /tmp/signal.py \n",
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
    "MyLoadBalancer": {
      "Type": "JDCLOUD::LoadBalance::LoadBalancer",
      "Properties": {
        "LoadBalancerName": {
          "Ref": "LoadBalancerName"
        },
        "SubnetId": {
          "Ref": "MySubnet"
        },
        "Azs": [
          {
            "Fn::FindInMap": [
              "AZInfo",
              {
                "Ref": "JDCLOUD::Region"
              },
              "az1"
            ]
          }
        ]
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
          "Ref": "MyLoadBalancer"
        },
        "InstanceType": "lb",
        "ElasticIpId": {
          "Ref": "MyElasticIp"
        }
      }
    },
    "MyLoadBalancerTargetGroup": {
      "Type": "JDCLOUD::LoadBalance::TargetGroup",
      "Properties": {
        "TargetGroupName": {
          "Ref": "TargetGroupName"
        },
        "LoadBalancerId": {
          "Ref": "MyLoadBalancer"
        }
      }
    },
    "MyLoadBalancerRegisterTargets": {
      "Type": "JDCLOUD::LoadBalance::RegisterTargets",
      "Properties": {
        "TargetGroupId": {
          "Ref": "MyLoadBalancerTargetGroup"
        },
        "TargetSpecs": [
          {
            "InstanceId": {
              "Ref": "MyInstance1"
            },
            "Port": 80
          },
          {
            "InstanceId": {
              "Ref": "MyInstance2"
            },
            "Port": 80
          }
        ]
      }
    },
    "MyLoadBalancerBackend": {
      "Type": "JDCLOUD::LoadBalance::Backend",
      "Properties": {
        "LoadBalancerId": {
          "Ref": "MyLoadBalancer"
        },
        "Port": 80,
        "BackendName": {
          "Ref": "LBBackendName"
        },
        "TargetGroupIds": [
          {
            "Ref": "MyLoadBalancerTargetGroup"
          }
        ],
        "Protocol": "Http",
        "HealthCheckSpec": {
          "Protocol": "Http",
          "Port": 80,
          "HttpPath": "/"
        }
      }
    },
    "MyLoadBalancerListener": {
      "Type": "JDCLOUD::LoadBalance::Listener",
      "Properties": {
        "BackendId": {
          "Ref": "MyLoadBalancerBackend"
        },
        "LoadBalancerId": {
          "Ref": "MyLoadBalancer"
        },
        "Protocol": "Http",
        "Port": 80
      }
    },
    "MyWaitCondition": {
      "Type": "JDCLOUD::ResourceOrchestration::WaitCondition",
      "DependsOn": [
        "MyInstance1",
        "MyInstance2"
      ],
      "Properties": {
        "Count": 2,
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
    "wordpress_cluster_domain": {
      "Value": {
        "Fn::Join": [
          ":",
          [
            {
              "Fn::GetAtt": [
                "MyLoadBalancer",
                "ElasticIpAddress"
              ]
            },
            {
              "Fn::GetAtt": [
                "MyLoadBalancerListener",
                "Port"
              ]
            }
          ]
        ]
      }
    }
  }
}
```
