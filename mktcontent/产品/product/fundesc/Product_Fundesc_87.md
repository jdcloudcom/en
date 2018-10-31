[
	{
		"funcName":"High Availability",
		"funcContent":[
			{
				"funcName":"",
				"funcTitle":"Redundant Configuration and Multi-AZ Deployment Providing Highly Available Services",
				"funcP":"Network Load Balancer instance resources are redundantly configured automatically and provide services in a clustered manner. At the same time, resources can be deployed in multiple Availability Zones to ensure high availability of services."
			}
		]
	},
	{
		"funcName":"Deployment of internal and external network and flexible switching",
		"funcContent":[
			{
				"funcName":"",
				"funcTitle":"Associate Elastic IP for Flexible Switching between Internal and External Networks",
				"funcP":"The users can choose whether to associate EIP, and flexibly set up the private network and the Public IP Load Balancer and switch freely to meet the service demands in different scenarios. It could hide the internal network structure and improve system security through EIP associating method. "
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
		"funcName":"Session Retention",
		"funcContent":[
			{
				"funcName":"",
				"funcTitle":"Support Session Maintenance Based on TCP Connection",
				"funcP":"The default timeout period for the session is 1,440s, which is the minimum guaranteed time for the session. During this period, regardless of how the NLB and the backend services are elastically extended, all packets with the same source and destination IP addresses are forwarded to the same back-end server. When the session hold time expires, it can’t guarantee the message would be forwarded to the same back-end server."
			}
		]
	},
	{
		"funcName":"Running Out of Connection",
		"funcContent":[
			{
				"funcName":"",
				"funcTitle":"Back-end server gracefully exits service",
				"funcP":"Connection draining is a way for back-end servers to gracefully exit the service. When a server is removed from the \"virtual server group\" or the Availability Group, the connection exhaustion timer will be started. After that, only the established TCP connection packets will continue forwarding to the server until the connection exhaustion time expires. So far, the newly established TCP connection will not be forwarded to the server."
			}
		]
	},
	{
		"funcName":"Source IP Passthrough",
		"funcContent":[
			{
				"funcName":"",
				"funcTitle":"Client Source IP Transparent Transmission",
				"funcP":"NLB can transmit the source IP from the client-end to the back-end server without special intervention and configuration and without special processing by the server application."
			}
		]
	}
]