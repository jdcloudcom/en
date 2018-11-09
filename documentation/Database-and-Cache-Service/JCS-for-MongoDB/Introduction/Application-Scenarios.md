# Application Scenarios

The following describes the applicable scenarios for JCS for MongoDB.

## City-wide Disaster Tolerance
JCS for MongoDB supports the multiple availability zone deployment mode. You can deploy the primary, secondary and the hidden nodes of the instance in different Availability Zones to provide the city-wide disaster tolerance. When an availability zone is unable to provide service due to force majeure, the MongoDB service can quickly switch to another Availability Zone to ensure service availability.

![City-wide Disaster Tolerance Scens](https://github.com/jdcloudcom/cn/blob/master/image/mongodb/mogno-001.png)


## Partitioned-service Application
Relying on the JCS for MongoDB's sophisticated backup mechanism and the ability to create instances based on point-in-time, you can quickly create new MongoDB instances based on the data of an instance to meet the fast roll-for and service needs of partitioned-server application such as games.

![Partitioned-server Application Scenarios](https://github.com/jdcloudcom/cn/blob/master/image/mongodb/mongo-002.png)

## Related Reference

- [Product Benefit](../Introduction/Benefits.md)
- [Features](../Introduction/Features.md)
- [Price Overview](../Pricing/Price-Overview.md)
- [Billing Rules](../Pricing/Billing-Rules.md)
- [Create Instance](../Getting-Started/Create-Instance.md)
