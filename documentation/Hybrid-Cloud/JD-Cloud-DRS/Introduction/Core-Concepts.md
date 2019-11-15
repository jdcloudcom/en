# Core Concepts

|Name|Interpretation|
|-------------------|-----|
|Disaster Recovery|Refer to set up two or more IT systems with the same functions at different regions, such as health status monitoring and function switch. In case any system fails due to any accident (e.g. fire disaster, earthquake, etc.), the entire application system can be switched to another and the system functions can continue their normal work.| 
|Data Level Disaster Recovery|Refer to set up a remote disaster recovery center for remote data backup, so as to protect data against loss or destruction in case that a disaster occurs.| 
|Application Level Disaster Recovery|Refer to build a same application system on the backup site on the basis of the data level disaster recovery, so as to make sure that operations of key applications are recovered in the allowable time with the synchronous or asynchronous replication technology. Further, users basically have no feelings about occurrence of disaster and complete, reliable and safe service provided by the system is guaranteed.| 
|RPO|Recovery Point Objective refers to the expected data loss when any application fails. For example, RPO = 15 minutes means that when an application fails, data of latest 15 minutes cannot be recovered on the cloud.| 
|RTO|Recovery Time Objective refers to the time required for recovering operation of a failed application on the cloud.| 
|Failover|Fail Ove, disaster recovery, refers to the application recovery process on JD Cloud, after the user’s own environment applications failed.| 
|Fail Back |Fail Back, refers to process of migrating application data back to their own environments and recovering application operation, after the user’s own environment is recovered.| 
