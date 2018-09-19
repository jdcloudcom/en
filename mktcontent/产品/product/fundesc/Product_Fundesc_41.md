[
	{
		"funcName":"Service Connection Management",
		"funcContent":[
			{
				"funcName":"",
				"funcTitle":"Data Source Connection",
				"funcP":"The Data Factory originally supports multiple common data sources, enabling connection and data collection from the services on the cloud and different data sources in the user local enviornment, which can accelerate the process of data integration. Currently, it supports cloud storage, cloud database, Data Compute, SQL Server, Oracle, MySQL, DB2 and FTP, etc."
			},
			{
				"funcName":"",
				"funcTitle":"Computing Resource Connection",
				"funcP":"As a data integration service on the cloud, the Data Factory needs to perform ETL processing on the data that are accessed to the data source. By connecting different analysis services, the data factory cleans, transforms and analyzes the accessed data in the form of workflow to enable ETL. Currently, the data factory supports access to Data Compute, with such services as JD MapReduce, Stream Hub, Stream Compute and machine learning platform to be added later."
			}
		]
	},
	{
		"funcName":"Data Synchronization",
		"funcContent":[
			{
				"funcName":"",
				"funcTitle":"Data Access and Distribution",
				"funcP":"Data synchronization of the data factory supports synchronization of data from multiple local and cloud data sources, supporting the users with different synchronization policies such as full-scale synchronization, incremental synchronization and so on. It can be used for data access to enterprise data warehouse to collect multi-source data, and distribute the processed data in the data warehouse to the production system to support online services such as database system through the data synchronization feature of the Data Factory."
			}
		]
	},
	{
		"funcName":"Data Workflow",
		"funcContent":[
			{
				"funcName":"",
				"funcTitle":"Orchestration and Scheduling of Data Synchronization and Processing",
				"funcP":"The analysis tasks such as data access, data cleaning, data aggregation are orchestrated and organized through a unified Workflow Management Module, so that the users can formulate scheduling policies based on different cycles by month, week, day or hour as demanded by the service."
			}
		]
	},
	{
		"funcName":"Job Operation and Maintenance",
		"funcContent":[
			{
				"funcName":"",
				"funcTitle":"Job Alarm Warning Rule",
				"funcP":"The workflow of the Data Factory can be set up with multiple alarm warning policies to inform users of key running status of the task in no time."
			},
			{
				"funcName":"",
				"funcTitle":"Job Operation Monitoring",
				"funcP":"A record of the execution status and history of the workflow is provided for the users to view  the execution results and detailed logs of each job and track the detailed logs of each execution link in each workflow, which can facilitate the diagnosis and analysis of problems by the operation and maintenance personnel."
			}
		]
	}
]