[
	{
		"proGoodTitle":"Benefits",
		"proNameTitle":"Message Queue",
		"proDiffTitle":"Open Source Message Queue",
		"proGood":"Monitor Alarm",
		"proName":"Various types of monitoring are provided for users, including a variety of visual data monitoring of production TPS, number and size of published messages and number of accumulated messages, etc. The multi-terminal monitoring and early warning can assist you in giving an early warning, prompting risks and quickly positioning and solving problems in advance.",
		"proDiff":"Need to develop the monitoring system independently; the operation and maintenance personnel shall stand by at any time."
	},
	{
		"proGood":"High Availability",
		"proName":"With the cluster deployment and automatic primary-secondary switching technology, the service availability up to 99.95% is promised.",
		"proDiff":"Single machine or simple primary-secondary architecture, high availability cannot be guaranteed."
	},
	{
		"proGood":"High reliability",
		"proName":"Raft is introduced to realize the high reliability of data, the data are synchronously written and the data in 3 copies are backed up, with the data reliability of up to 99.999999%, and the default messages can be persistently stored for 3 days and the message at any time point consumed by a consumer ID in 3 days can be reset.",
		"proDiff":"The issue of single-point exists for data. Once it is lost, the data cannot be recalled. The data reliability cannot be guaranteed."
	},
	{
		"proGood":"High Performance",
		"proName":"Ten million-level of messages can be received, sent and notified per second, without concurrency restrictions, and a huge number of messages are accumulated, with the upper limit of capacity, and the writing delay of messages is controlled within 10ms.",
		"proDiff":"Data reliability and performance cannot be satisfied with low cost."
	},
	{
		"proGood":"Multi-type",
		"proName":"The various messages types are supported, including normal message, sequential message and delay message, so as to meet the demands for different workload scenarios.",
		"proDiff":"Not Support Multiple Message Types"
	},
	{
		"proGood":"Smooth Expansion",
		"proName":"To meet the requirements for messaging between workloads, the number of Topic can be expanded elastically and the scale of cluster can be elastically scalable, which is completely transparent to users, and the on-demand billing is adopted, the resource utilization is improved and the costs for redundancy are reduced.",
		"proDiff":"Need to create new resource, disconnect application connection and migrate the data after reaching the performance bottleneck; in this process, normal business access will be influenced. Long expansion period and low resource utilization rate"
	},
	{
		"proGood":"Monitor Alarm",
		"proName":"Various types of monitoring are provided for users, including a variety of visual data monitoring of production TPS, number and size of published messages and number of accumulated messages, etc. The multi-terminal monitoring and early warning can assist you in giving an early warning, prompting risks and quickly positioning and solving problems in advance.",
		"proDiff":"Need to develop the monitoring system independently; the operation and maintenance personnel shall stand by at any time."
	}
]