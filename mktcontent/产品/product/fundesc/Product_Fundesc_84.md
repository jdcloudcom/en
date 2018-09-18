[
	{
		"funcName":"Multiple Network Interfaces & Multiple IPs",
		"funcContent":[
			{
				"funcName":"",
				"funcTitle":"Multiple Network Interfaces",
				"funcP":"According to the VM instance type, a single Virtual Machine can support association with up to eight Elastic Network Interfaces which can respectively belong to different subnets under the same Virtual Private Cloud."
			},
			{
				"funcName":"",
				"funcTitle":"Multiple Private IPs",
				"funcP":"According to the VM instance type, each elastic network interface of the Virtual Machines supports up to 21 private IP addresses, and all private IP address on the same Elastic Network Interface belong to the same subnet."
			},
			{
				"funcName":"",
				"funcTitle":"Multi EIP",
				"funcP":"Each internal network IP address allocated to one Elastic Network Interface can be associated with one Elastic IP address."
			}
		]
	},
	{
		"funcName":"Migration of Network Interface",
		"funcContent":[
			{
				"funcName":"",
				"funcTitle":"Territory-level Network Interface",
				"funcP":"Support Elastic Network Interfaces of region-level attribute, breaking through the limitation of availability zones of traditional elastic network interfaces. The elastic network interfaces can be migrated elastically between Virtual Machines in different availability zones in the Virtual Private Cloud."
			},
			{
				"funcName":"",
				"funcTitle":"Flexible migration",
				"funcP":"The Elastic Network Interface can be flexibly migrated between the Virtual Machines in the Virtual Private Cloud. When the Elastic Network Interface is migrated, the assigned private IP address, Elastic IP address and security group remain unchanged."
			}
		]
	},
	{
		"funcName":"Security for Business",
		"funcContent":[
			{
				"funcName":"",
				"funcTitle":"Independent security policy",
				"funcP":"Support security policy control of network interface level. An Elastic Network Interface can associate to 5 security groups, to achieve precise control of service traffic"
			},
			{
				"funcName":"",
				"funcTitle":"Business Traffic Separation",
				"funcP":"Multiple Elastic Network Interfaces may be attached to a Virtual Machine. The traffic of a specific business can be carried by a specific Elastic Network Interface. The Security Group Policy is applied for different Elastic Network Interfaces respectively to accurately separate business traffic and security policies."
			}
		]
	},
	{
		"funcName":"Routing Control",
		"funcContent":[
			{
				"funcName":"",
				"funcTitle":"Subnet Routing",
				"funcP":"Multiple Elastic Network Interfaces that belong to different subnets may be attached to a Virtual Machine. Each subnet can independently set up an IAM policy and a route forwarding policy to achieve security isolation between user business and the network"
			},
			{
				"funcName":"",
				"funcTitle":"Machine Routing",
				"funcP":"A fine routing policy can be set up inside the Virtual Machines. The specific business traffic can be forwarded by a specific Elastic Network Interface or a specific IP address."
			}
		]
	}
]