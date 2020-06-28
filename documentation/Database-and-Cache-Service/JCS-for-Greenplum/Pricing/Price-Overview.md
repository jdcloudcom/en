# Price Overview

At present, the Data Warehouse JDW Instance supports two billing types: monthly package and pay by configuration. The instance cost consists of two parts, i.e., node specifications and node counts.

## Node Specification Cost

| Segment Node Specification | CPU (Core) | Memory (GB) | Bucket (GB) | Storage Type | Monthly Package (RMB/Month) | Pay By Configuration (RMB/Hour) |
| --------------- | -------- | -------- | --------- | ----------- | ----------- | --------------- |
| jdw.dx2.large   | 4        | 16       | 128       |Local Disk SSD    | 838.4       | 1.75            |
| jdw.dx2.xlarge  | 8        | 32       | 256       |Local Disk SSD    |1676.8       | 3.49            |    
| jdw.dx2.2xlarge | 16       | 64       | 512       |Local Disk SSD    |3353.6       | 6.98            |
| jdw.dx2.4xlarge | 32       | 128      | 1024      | Local Disk SSD   |6707.2       | 13.96           |

## Node Number

One JDW instance can contain 2 to 16 Segment nodes.

## Instance Price

Instance Price = Node Specification Cost * Node Count.

