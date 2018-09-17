# Restrictions

You can quickly create and use the  JCS for MongoDB, but there are some constraints need to be noted in use.

## Storage Engine
The storage engine defaults to WiredTiger and does not support modification.

## Replica Set
The system automatically sets up a three-node replica set. The roles are primary, secondary, and hidden. The primary node and the secondary node are visible to the user. The hidden node is invisible to the user. The user cannot set up the node by himself.
## oplog Size
Oplog defaults to 5% of storage space and cannot be modified.
## Connection Limit
The number of connections is related to the specifications of your purchase instance. The following are the maximum number of connections for each specification:

| Specification Code | Specifications | Maximum Connections |
| :- | :- | :- |
|mongo.s1.small	|1 core 2G	|500|
|mongo.s1.medium	|2 cores 4G	|1000|
|mongo.s1.large	|4 cores 8G	|2000|
|mongo.s1.xlarge |8 cores 16G| 4000|
|mongo.s2.2xlarge |8 cores 32G| 8000|
|mongo.s2.4xlarge |16 cores 64G| 16000|

## Related Reference

- [Product Overview](../Introduction/What-Is-MongoDB.md)
- [Price Overview](../Pricing/Price-Overview.md)
- [Create Instance](../Getting-Started/Create-Instance.md)
- [Alter Configuration](../Operation-Guide/Instance-Management/Modify-Instance-Spec.md)
