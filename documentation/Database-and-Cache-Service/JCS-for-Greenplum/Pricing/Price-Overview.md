# Price Overview

At present, the JCS for Greenplum Instance supports two billing types: monthly package and pay by configuration. The instance cost consists of two parts, i.e., node specifications and node counts.

## Node Specification Cost

| Segment Node Specification | vCPU (Core) | Memory (GB) | Storage (GB) | Monthly Package (RMB/Month) | Pay By Configuration (RMB/Hour) |
| --------------- | -------- | -------- | --------- | ----------- | --------------- |
| jdw.dc1.large   | 2        | 16       | 160 SSD   | 800         | 1.64            |
| jdw.dc1.4xlarge | 16       | 128      | 1280 SSD  | 6400        | 13.12           |

## Node Number

One Greenplum instance can contain 2 to 8 Segment nodes.

## Instance Price

Instance Price = Node Specification Cost * Node Count.

