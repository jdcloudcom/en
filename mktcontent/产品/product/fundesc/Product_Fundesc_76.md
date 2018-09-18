[
	{
		"funcName":"Availability Deployment Cross AZs",
		"funcContent":[
			{
				"funcName":"",
				"funcTitle":"Cross AZs",
				"funcP":"Assignment of multiple Availability Zones shall be supported when creating an Availability Group. The Availability Group will ensure that the Virtual Machines are evenly distributed in the assigned Availability Zone. A Virtual Machine will automatically be created in the assigned Availability Zone with fewer Virtual Machines, and the users have no need to assign an Availability Zone."
			},
			{
				"funcName":"",
				"funcTitle":"Multiple Fault Domains of Single Availability Group",
				"funcP":"The fault domain refers to the physical resource pools that are isolated from each other. At least 5 fault domains are allocated in a single Availability Zone by the same Availability Group, and hardware faults or scheduled maintenance in one fault domain would not affect other fault domains, thus the risk of simutaneous unavailability of all Virtual Machines in the service can be lowered. When a business is deployed, it is recommended that an Availability Group is deployed for each type of service, and there shall be at least two Virtual Machines in the Availability Group."
			}
		]
	},
	{
		"funcName":"Resource Monitoring",
		"funcContent":[
			{
				"funcName":"",
				"funcTitle":"Multi-dimensional Monitoring",
				"funcP":"Based on multi-dimensional monitoring of Virtual Machines in the Availability Group, visual chart display facilitates users to grasp real-time usage and operation status of Virtual Machines resources. Automatic report of CPU utilization rate, memory utilization rate and disk reak/write throughput and other monitoring data, enabling resources to be monitored with different statistical methods, such as average value and maximum value, etc."
			}
		]
	},
	{
		"funcName":"Auto Scaling",
		"funcContent":[
			{
				"funcName":"",
				"funcTitle":"Alarm Scaling Policy",
				"funcP":"In the case of service fluctuations, it supports deploying Alarm Scaling Polity based on monitoring indicators (e.g.CPU, memory usage rate). The Virtual Machines is automatically triggered to be added or deleted when the scaling condition is met, so as to flexibly handle workload changes, guarantee service capability and save deployment cost."
			},
			{
				"funcName":"",
				"funcTitle":"Timing Scaling Policy",
				"funcP":"In the case of predicatable business fluctuations, the number of Virtual Machines in the Availability Group can be configured with Scheduled Scaling Polity to trigger scheduled adding or deleting of Virtual Machines. In the case of periodic fluctuations, repetition cycle by day/week/month is also supported."
			},
			{
				"funcName":"",
				"funcTitle":"Scaling Record",
				"funcP":"When Auto Scaling is enabled in the Availability Group, the scaling activities triggered by the Auto Scaling Policy will be recorded to help following the activities implemented by Auto Scaling, including the content, status, and start time and end time of the scaling, which supports querying history by time."
			}
		]
	},
	{
		"funcName":"Efficient Management",
		"funcContent":[
			{
				"funcName":"",
				"funcTitle":"Configure Instance Template",
				"funcP":"Instance templates shall be configured when creating an Availability Group. The templates are started to record the configuration needed for creating a Virtual Machines, such as image, VM instance type and network information. The Availability Group will add a Virtual Machine based on the started template configuration without any renewed assignment, thus guaranteeing fast deployment and consistency of the VM instance type for the same service \n"
			}
		]
	}
]