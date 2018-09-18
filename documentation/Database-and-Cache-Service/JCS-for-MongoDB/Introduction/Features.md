# Features

## Easy to Use

### Quick Creation
MongoDB instance can be created in minutes by using the MongoDB console or a simple API call.

### Flexible Capacity Expansion
Support capacity expansion and capacity reduction. You can upgrade or downgrade instance configurations as needed according to business conditions to improve resource utilization and reduce usage costs.

## Service Availability

### Three-node Replica Set

The three-node replica set is automatically set up. The default Primary and Secondary nodes provide services. When the Primey node fails, the system automatically elects a new Primary node. When the Secondary node is unavailable, the standby node takes over the service and multiple guarantee mechanisms ensure service availability.

## Single Availability Zone Deployment

Support for single availability deployment, three nodes are automatically deployed to physical machines in different racks, providing high availability across racks.

### Multiple Avialability Zone Deployment

Support for multiple availability zone deployment, you can specify the available zones for primary, secondary and hidden node deployments, and provide high availability across the machine rooms.

## Security
 
### VPC Virtual Private Cloud
The instance is deployed in a user-defined VPC, and network isolation protection is performed directly at the TCP layer to ensure data security.

### White list
Support user-defined IP white list and security control from access source.


## Backup and Recovery

### Automatic Backup
Automatically back up the data in full every day and keep it for 7 days. The backup file is stored in cloud storage in three copies.

### Manual Backup
Support manual creation of backup, backup data long-term storage.

### Data Recovery
Support recovery of backup data to the current case with one click; based on incremental backup, support to create new database case based on the data at any point of time within seven days.

## Monitoring Alarm

### Visual Monitoring
The MongoDB console provides a wealth of monitoring information, including CPU, memory, storage space, IOPS, etc. You can view the running status of the instance at any time.

### Automatic Alarm
You can set alarm rules based on the monitoring items. When the monitoring items reach the set threshold, the system will send you alarm information by SMS and email.

## Related Reference

- [Product Overview](../Introduction/What-Is-MongoDB.md)
- [Specifications](../Product-Introduction/Specification.md)
- [Price Overview](../Pricing/Price-Overview.md)
- [Create Instance](../Getting-Started/Create-Instance.md)
- [Alter Configuration](../Operation-Guide/Instance-Management/Modify-Instance-Spec.md)
- [Data Recovery](../Operation-Guide/Backup/Restore-Instance.md)
- [Set Alarm Rules](../Operation-Guide/Monitoring/Alarm-Rules.md)


