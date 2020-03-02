# Specifications

JCS for Greenplum allows users to select the specification and count of Segment nodes. The supported specifications are as follows:

## Segment Node Specification

| Node Specification Code    | vCPU | Memory GB | Available Bucket GB | Total Bucket of Dual Replicas GB | Primary Segment Count | Node Count |
| --------------- | ---- | ------ | -------------- | ------------------ | ------------------- | -------- |
| jdw.dc1.large   | 2    | 16     | 160            | 320                | 1                   | 2-16      |
| jdw.dc1.4xlarge | 16   | 128    | 1280           | 2560               | 4                   | 2-16      |

**Description:**

- Each Segment node can contain several Primary Segments and Mirror Segments.
- The bucket of the specification is the bucket available to the user, that is, the bucket occupied by Primary Segment.
- The total bucket of the Segment node is twice of that displayed by the specification and is used to store the data of Primary Segment and Mirror Segment.
- The Console can select 2-8 Segment nodes. If more nodes are needed, the ticket can be opened to enable it.

