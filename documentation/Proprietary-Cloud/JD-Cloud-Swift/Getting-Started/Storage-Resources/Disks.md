# Cloud Disk Service

Cloud Disk Service is a highly reliable block storage service provided by JD Cloud Swift platform. It supports data in multi-replica distributed storage, and the distributed storage is 3 copies by default, which can prevent data unavailability due to component failure. Cloud Disk Service can storage the data of Virtual Machine system and provide support for the operation of Virtual Machines. Besides, Cloud Disk Service can be mounted on different Virtual Machines as a data disk so that the application data in Virtual Machines are persistent volume, and the support can be provided for a plurality of scenarios and businesses according to their requirement.

![Disks-1](../../../../../image/JD-Cloud-Swift/Disks-1.png)

### Function Description of Cloud Disk Service

#### Cloud Disk Service Life Cycle Management
Support full life cycle management on Cloud Disk Service such as direct creation, creation based on snapshot, editing, attaching/detaching from Virtual Machines, capacity extension and deletion, and common functions such as view details and snapshots. With operations above, users can freely and flexibly use Cloud Disk Services, and make adjustment according to actual business demands of upper level at any time, so as to reduce resource cost and improve utilization efficiency.

#### Independent Storage Service

The Cloud Disk Service provides high-reliability, high-availability and high-performance data storage service. The data of Cloud Disk Service are independent from Virtual Machines, support attaching and detaching at any time; a single Virtual Machine may be attached with up to multiple cloud disks to meet higher storage demands of users.

#### Elastic Expansion

The platform supports expanding the Cloud Disk Service capacity as needed, to meet storage demands of different businesses. When Cloud Disk Service is created based on snapshot, the Cloud Disk Service may be configured with bucket larger than or equal to the snapshot capacity, to meet users’ demands to run business based on snapshot data, and users may also be provided with large storage space.