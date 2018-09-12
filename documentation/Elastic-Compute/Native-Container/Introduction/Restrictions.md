

# Restrictions

 1. At present cn-north-1 and cn-east-2 are online.
 2. At present support only Docker image based on Linux operation system.
 3. The following table are relevant restrictions for using container:

|  Resource   |  Restriction   |  Exceptional application method   |
| --- | --- | --- |
|  Restriction on identify of container user created  | User shall complete real-name verification| No exceptions|
|  Restriction on money in container account created   |Create pay by configuration container which charge according to settings with remaining sum in account balance more than 50 yuan| Ticket |
|  Container instance quota in a single region  | 20 sets | Ticket |
|Cloud disk service quota in a single region    |  15 sets   | Ticket     |
|Cloud disk snapshot service in a single region     |  15 sets   | Ticket   |
|Security group quota in a single VPC     |  15   | Ticket     |
| Quota of public IP in a single region     |  10  | Ticket     |
|Type and volume of system disk of the container | Premium Hdd Cloud Disk: 10-100G; SSD Cloud disk: 10-100G | Unchangeable |
| Type and volume of data disk of the container     | Premium Hdd Cloud Disk: 20-3000G; SSD Cloud disk: 20-1000G | Unchangeable |
|   Restriction on rules for a single security group |  The entering and exiting rules shall not exceed 100 pieces in total   |  Unchangeable |
|  The quantity of Cloud Disk Service which are allowed to be attached to a single container   |  7 pieces  |   Unchangeable  |
| The quantity of security groups which are allowed to be associated to a single container |  5  |   Unchangeable  |
|  The quantity of pubic IP which are allowed to be associated to a single container   |  1  |   Unchangeable  |
|  The maximum save capacity of container log |  10M  |   Unchangeable  |
|  The maximum number of bytes of a single container log   |  4k  |   Unchangeable  |
|Restriction on use of container image   |  Support Dockerfile based on Linux operation system only  |   Unchangeable  |
|  Container use region and region restrictions   | cn-north-1 Availability Zone A, cn-north-1  Availability Zone B, cn-east-2 Availability Zone A, cn-east-2 Availability Zone B     | Unchangeable      |

