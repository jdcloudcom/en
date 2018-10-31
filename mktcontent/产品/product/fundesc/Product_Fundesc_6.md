[
	{
		"funcName":"Multi-protocol Support",
		"funcContent":[
			{
				"funcName":"",
				"funcTitle":"Multi-protocol Support to Meet Different Business Demands",
				"funcP":"The Load Balancer provides Load Balancer services based on Layer 4 (TCP protocol) and Layer 7 (HTTP). It can set listening protocol and port independently to meet different business demands. "
			}
		]
	},
	{
		"funcName":"Performance Check",
		"funcContent":[
			{
				"funcName":"",
				"funcTitle":"Automatic Health Check to Ensure Availability",
				"funcP":"Automatic Performance Check to Ensure Availability. The Load Balancer periodically detects the running status of the back-end Virtual Machines. Users can customize the detection frequency. Once any exception of Virtual Machines is detected, no traffic will be allocated to such instances to ensure service availability. "
			}
		]
	},
	{
		"funcName":"Multi-scheduling Algorithm",
		"funcContent":[
			{
				"funcName":"",
				"funcTitle":"Support Multi-scheduling Algorithms to Achieve More Reasonable Traffic Distribution",
				"funcP":"The Load Balancer supports three types of scheduling algorithms: polling, minimum connection number, and source IP. It can select an appropriate algorithm based on users' own business demands. For example, if the performance of the back-end machines is not significantly different, users can select the polling algorithm to evenly distribute the back-end machine traffic allocation and improve external service capabilities."
			}
		]
	},
	{
		"funcName":"Deployment of Internal Network",
		"funcContent":[
			{
				"funcName":"",
				"funcTitle":"Associate Elastic IP for Flexible Switching between Internal and External Networks",
				"funcP":"The users can choose whether to associate EIP, and flexibly set up the private network and the Public IP Load Balancer and switch freely to meet the service demands in different scenarios. It could hide the internal network structure and improve system security through EIP associating method. "
			}
		]
	},
	{
		"funcName":"Session Retention",
		"funcContent":[
			{
				"funcName":"",
				"funcTitle":"Session Retention to Meet Individual Needs",
				"funcP":"The Load Balancer is forwarded by the source IP, and the Layer 7 cookie session is maintained. The request from the same source is forwarded to the same server at the back end for processing, which satisfies the service requirements in different scenarios. "
			}
		]
	},
	{
		"funcName":"High Availability",
		"funcContent":[
			{
				"funcName":"",
				"funcTitle":"Redundant Configuration and Multi-AZ Deployment Providing Highly Available Services",
				"funcP":"The automatic redundant configuration of the Load Balancer instance resources can provide services in a clustered manner. At the same time, resources can be deployed in multiple AZs to ensure high availability of services. "
			}
		]
	}
]