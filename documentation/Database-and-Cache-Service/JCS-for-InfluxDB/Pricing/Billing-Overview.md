# Billing Overview

## Charging Items

InfluxDB instances are charged by the combined methods of specification and bucket.

- Specification, i.e. CPU core number and memory capacity distributed to instances.
- Bucket, i.e. disk capacity distributed to an instance.

## Region and Availability Zone

At present, the price of InfluxDB instance is the same in all availability zones of all regions.

## Amount Overdue/Expiry Description

### Instances of Monthly Package Billing

After the instance expires, the billing status will be marked as expired, and the database service will be unavailable. If there is no renewal within 7 days, the instance will be deleted after 7 days, and at the same time the backup file of the instance will be deleted, with the instance data unrecoverable.

### Bill the instance by configuration

When the instance is overdue, the billing status will be marked as the overdue and the database service will be unavailable. If there is no renewal within 7 days, the instance will be deleted and the backup files of this instance will be deleted. The instance data cannot be recovered.

