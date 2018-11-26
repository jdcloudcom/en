# Restrictions

 1. At present cn-north-1 and cn-east-2 are online.
 2. At present support only Docker image based on Linux operation system.
 3. The following table are relevant restrictions for using container:



|  Resource   |  Restriction   |  Exceptional application method   |
| --- | --- | --- |
|  Product Type  | Native Container Instance | all users|
|  Product Type  | Native Container Pod | apply for enabling|
|  Restriction on identify of Native Container user created  | User shall complete real-name verification| No exceptions|
|  Restriction on money in Native Container account created   |Create pay by configuration container which charge according to settings with remaining sum in account balance more than 50 yuan| [Ticket](https://ticket.jdcloud.com/myorder/form?cateId=1&questionId=251) |
|  Native Container instance quota in a single region  | 5 sets | [Ticket](https://ticket.jdcloud.com/myorder/form?cateId=1&questionId=251) |
|Cloud disk service quota in a single region    |  15 sets   | [Ticket](https://ticket.jdcloud.com/myorder/form?cateId=1&questionId=251)     |
|Cloud disk snapshot service in a single region     |  15 sets   | [Ticket](https://ticket.jdcloud.com/myorder/form?cateId=1&questionId=251)   |
|Security group quota in a single VPC     |  15   | [Ticket](https://ticket.jdcloud.com/myorder/form?cateId=1&questionId=251)     |
| Quota of public IP in a single region     |  10  | [Ticket](https://ticket.jdcloud.com/myorder/form?cateId=1&questionId=251)     |
|Type and volume of system disk of the Native Container | Premium Hdd Cloud Disk: 20-100G; SSD Cloud disk: 20-100G | Unchangeable |
| Type and volume of data disk     | Premium Hdd Cloud Disk: 20-3000G; SSD Cloud disk: 20-1000G | Unchangeable |
|   Restriction on rules for a single security group |  The entering and exiting rules shall not exceed 100 pieces in total   |  Unchangeable |
|  The quantity of Cloud Disk Service which are allowed to be attached to a single Native Container   |  8 pieces  |   Unchangeable  |
| The quantity of security groups which are allowed to be associated to a single Native Container |  5  |   Unchangeable  |
|  The quantity of pubic IP which are allowed to be associated to a single Native Container   |  1  |   Unchangeable  |
|  The maximum save capacity of Native Container log |  10M  |   Unchangeable  |
|  The maximum number of bytes of Native Container log   |  4k  |   Unchangeable  |
|Use restrictions of Native Docker Image |  Support Dockerfile based on Linux operation system only  |   Unchangeable  |
|  Native Container use region and region restrictions   | cn-north-1 Availability Zone A, cn-north-1  Availability Zone B, cn-east-2 Availability Zone A, cn-east-2 Availability Zone B     | Unchangeable      |

