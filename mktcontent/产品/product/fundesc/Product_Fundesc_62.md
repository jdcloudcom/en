[
	{
		"funcName":"Alarm Scaling Mode",
		"funcContent":[
			{
				"funcName":"",
				"funcTitle":"Alarm Scaling Mode",
				"funcP":"It adjusts service deployment based on the VM monitoring performance indicators (such as CPU, memory usage rate, inbound and outbound network flow, etc), which can customize the alarm trigger policy. When the workloads drive the indicators to the threshold value, the VM instances will be automatically added or decreased based on the set policy, so as to flexibly respond to workload changes and improve the resource utilization rate."
			}
		]
	},
	{
		"funcName":"Scheduled Scaling Mode",
		"funcContent":[
			{
				"funcName":"",
				"funcTitle":"Scheduled Scaling Mode",
				"funcP":"In the case of predictable workload changes, a scheduled task can be set up to plan for the resources increase/decrease in advance. Periodic tasks can be configured to automatically increase or decrease the VM instances on a scheduled basis, so as to flexible respond to workload changes and improve the resource utilization rate. When periodic demand fluctuates, the alarm scaling mode can also be configured to deal with unpredicable changes."
			}
		]
	},
	{
		"funcName":"Automatic Adding Load Balancer",
		"funcContent":[
			{
				"funcName":"",
				"funcTitle":"Automatic Adding Load Balancer",
				"funcP":"The VM instances added by alarm and scheduled policies can directly associate with the existing Load Balancer to share the service flow and improve service availability."
			}
		]
	},
	{
		"funcName":"Scaling Activity Record",
		"funcContent":[
			{
				"funcName":"",
				"funcTitle":"Scaling Activity Record",
				"funcP":"This feature enables the users to view all the scaling activities that have been performed by the Scaling Policy (automatically/manually increase or decrease the Virtual Machines), including the cause, status and result details of scaling, with query history by time supported"
			}
		]
	}
]