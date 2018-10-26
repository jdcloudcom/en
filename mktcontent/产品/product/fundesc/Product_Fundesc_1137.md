[
	{
		"funcName":"Directory Management",
		"funcContent":[
			{
				"funcName":"",
				"funcTitle":"Actual Microsoft Active Directory",
				"funcP":"JD Cloud directory service is the actual Microsoft Active Directory running on the JD Cloud hosting infrastructure. By this way, you can use tools (such as Active Directory management center and Active Directory users and computers) you are familiar with to manage users and equipment."
			},
			{
				"funcName":"",
				"funcTitle":"High Availability",
				"funcP":"Because the directory is a mission-critical infrastructure, the JD Cloud hosted directory service is deployed across multiple availability zones and is highly available. You can also expand JD Cloud hosted directory service through deploying extra domain controllers to improve the elasticity of cloud managed service so as to implement higher availability."
			},
			{
				"funcName":"",
				"funcTitle":"JD Cloud Hosted Infrastructure",
				"funcP":"JD Cloud hosted directory service runs on the JD Cloud hosted Infrastructure and it can automatically detect replace failed domain controllers by its monitoring function. In addition, it configures functions of data replication and daily automatic snapshot for you. You need not to install software, JD Cloud will treat all patching work and software update."
			},
			{
				"funcName":"",
				"funcTitle":"Support Trust Relationship",
				"funcP":"You can use Active Directory trust relationship to easily integrate JD Cloud hosted directory service with existing Active Directory. By using trust relationship, you can control which Active Directory users can access your JD Cloud resources through existing Active Directory. "
			},
			{
				"funcName":"",
				"funcTitle":"SSO",
				"funcP":"JD Cloud hosted directory service provides SSO based on Kerberos identity authentication which is same as Active Directory. By integrating your JD Cloud resources with directory service, your users can use a group of credentials to login applications and resources of JD Cloud through SSO."
			},
			{
				"funcName":"",
				"funcTitle":"Jointly Access JD Cloud Management Console",
				"funcP":"By JD Cloud hosted directory service, users and groups can easily and jointly access JD management console. Using joint access function can eliminate the necessity of using single user password and you can manage access according to single identity from Active Directory so as to help JD Cloud to improve its environmental security."
			},
			{
				"funcName":"",
				"funcTitle":"Daily Snapshot",
				"funcP":"JD Cloud hosted directory service provides built-in automatic daily snapshot. You can also take other snapshots before key application updates, which ensures that you have the latest data, in case there is a need to roll back the changes."
			}
		]
	}
]