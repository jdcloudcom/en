# Specifications

Data Warehouse JDW allows users to select the specification and count of Segment nodes. The supported specifications are as follows:

## Segment Node Specification

| Node Specification Code    | CPU(Core) | Memory(GB) | Available Bucket (GB) | Total Bucket of Dual Replicas (GB) | Storage Type | Node Count |
| --------------- | ---- | ------ | -------------- | ------------------ | -----    | -------- |
| jdw.dx2.large   | 4    | 16     | 128            | 256                |Local Disk SSD | 2-16      |
| jdw.dx2.xlarge  | 8    | 32     | 256            | 512                |Local Disk SSD | 2-16      |
| jdw.dx2.2xlarge | 16   | 64     | 512            | 1024               |Local Disk SSD | 2-16      |
| jdw.dx2.4xlarge | 32   | 128    | 1024           | 2048               | Local Disk SSD| 2-16      |


**Description:**

- Each Segment node can contain several Primary Segments and Mirror Segments.
- The bucket of the specification is the bucket available to the user, that is, the bucket occupied by Primary Segment.
- The total bucket of the Segment node is twice of that displayed by the specification and is used to store the data of Primary Segment and Mirror Segment.
- The Console can select 2-16 Segment nodes. If more nodes are needed, the ticket can be opened to enable it.

