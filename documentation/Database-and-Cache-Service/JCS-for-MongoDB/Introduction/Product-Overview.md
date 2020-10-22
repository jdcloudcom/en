# Product Overview


JCS for MongoDB is a high-performance NoSQL database service provided by JD Cloud based on the worldwide popular MongoDB. It is fully compatible with MongoDB protocol, supports deployment by replica set and sharded cluster and automatic disaster recovery switch by using high-availability architecture to ensure business availability and provides functions such as elastic expansion, backup recovery and monitoring, reducing management and maintenance costs and enabling you to focus on the application development and business growth.

## Main Characteristics

* Use high-availability architecture and support automatic disaster recovery switch by default.
* Provide convenient database backup and restore functions, and backup and restore can be done with one click.
* Support flexible expansion, and the instance configuration can be adjusted at any time to meet business needs while reducing the cost of use.
* Provide detailed performance indicator monitoring and automatic alarm function to reduce the difficulty of operation and maintenance.

## Supported Version

Currently, MongoDB 3.2, 3.4, 3.6 and 4.0 versions are supported.

## Supported Architecture

| Instance Architecture     | Description                                                         |
| ------------ | ------------------------------------------------------------ |
| Replica Set Instance   | Multiple replica sets are provided, including three-node, five-node and seven-node replica sets, and change of nodes is supported. |
| Sharded Cluster Instance | Sharded cluster instance composed based on multiple replica sets, containing Mongos, Shard and ConfigServer components. |

## Supported Region and Availability Zone

| Region      | Region Indication   | Availability Zone  | Availability Zone Indication  |
| :-------- | :--------- | :------ | :---------- |
| cn-north-1 | cn-north-1 | Availability Zone A | cn-north-1a |
| cn-north-1 | cn-north-1 | Availability Zone B | cn-north-1b |
| cn-north-1 | cn-north-1 | Availability Zone C | cn-north-1c |
| cn-east-2 | cn-east-2  | Availability Zone A | cn-east-2a  |
| cn-east-2 | cn-east-2  | Availability Zone B | cn-east-2b  |
| cn-east-2 | cn-east-2  | Availability Zone C | cn-east-2c  |

## Common Operations

- Get Started
  - [Create Instance](../Getting-Started/Create-Instance.md)
  - [Set White List](../Getting-Started/Set-Whitelist.md)
  - [Connection Instance](../Getting-Started/Connect-Instance.md)
- Migrate Data
  - [Import Data](../Getting-Started/Import-Data.md)
  - [Export Data](../Getting-Started/Export-Data.md)
- Extension and Upgrading
  - [Modify Instance](../Operation-Guide/Instance-Management/Modify-Instance-Spec.md)
- Backup and Recovery
  - [Modify Automatic Backup Strategy](../Operation-Guide/Backup/Modify-Backup-Policy.md)
  - [Create Backup Manually](../Operation-Guide/Backup/Create-Backup.md)
  - [Data Recovery](../Operation-Guide/Backup/Restore-Instance.md)
- Operation and Maintenance Management
  - [View Monitoring Information](../Operation-Guide/Monitoring/Monitoring.md)
  - [Set Alarm Rules](../Operation-Guide/Monitoring/Alarm-Rules.md)

## Billing

The JCS for MongoDB supports two billing types including monthly package and pay by configuration. For more information, please refer to "[Billing Rules](../Pricing/Billing-Rules.md) ".
