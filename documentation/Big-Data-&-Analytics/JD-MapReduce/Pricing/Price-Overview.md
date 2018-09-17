# price overview

JD MapReduce products adopt a pay-by-configuration mode for different user needs. At present, the basic costs of JDJ JD MapReduce mainly include: virtual machine cost, cloud disk service cost, EIP cost, and JD MapReduce product service cost.

## Machine fee

The following is the example specification type information of the current JD Cloud. The types and specifications of the saleable instances in different regions are not identical. Please refer to the example creation page. The specific Instance Type specifications can be classified according to different application scenarios:

* Universal: [General Shared Type](#g.s), [General Standard Type](#g.n)
* Compute-Optimized Standard type: [Compute Optimized Standard Type](#c.n)
* Memory-Optimized type: [Memory Optimized Standard Type](#m.n)
* High-frequency calculation type: [High-frequency calculation optimization type](#h.g)

## Universal type
The universal model currently provides General Shared Type and General Standard types, providing you with balanced computing and memory resources to meet the needs of most business scenarios. Each of the vCPUs in the common standard type corresponds to an Intel Xeon processor hyper-threaded core with a vCPU to memory ratio of 1:4.

### General Shared Type <div id="g.s"></div>
**Specification type features:**

* vCPU to memory ratio is 1:1 or 1:2
* Processor: 2.1 GHz Intel Xeon E5-2683 v4 (Broadwell) processor
* Support the following two types of cloud disks:
	*Premium Hdd Cloud Disk
	* SSD cloud disk
* Applicable scenario:
	* Primary stage of personal website with small visit flows
	* Microservices
	* Test environment

**Instance Type**

Instance Type|vCPU (core)|Memory (GB)
:---|:---|:---
g.s1.micro|1|	1
g.s1.small|1|2

### General Standard Type <div id="g.n"></div>
**Specification type features:**

* vCPU to memory ratio is 1:4 (except for 4 core 12GB specifications)

* Processor:
	* Second generation: 2.4 GHz Intel Xeon Gold 6148 (Skylake) processor
	* First generation: 2.1 GHz Intel Xeon E5-2683 v4 (Broadwell) processor
* Support the following two types of cloud disks:
	*Premium Hdd Cloud Disk
	* SSD cloud disk
* Applicable scenario:
	* Enterprise applications of all types and sizes
	* Small and medium data systems, caches, search clusters
	* Data analysis and calculation
	* Compute cluster, memory dependent data processing

**Instance Type**

Second generation

Instance Type|vCPU (core)|Memory (GB)
:---|:---|:---
g.n2.medium|1|4
g.n2.large|2|8
g.n2.xlarge|4|16
g.n2.2xlarge|8|32
g.n2.4xlarge|16|64
g.n2.8xlarge|32|128
g.n2.16xlarge|64|256
g.n2.18xlarge|72|288

First generation

Example Specifications|vCPU (core)|Memory (GB)|Remarks
:---|:---|:---|:---	
g.n1.medium|1|4|	
g.n1.large|2|8|	
g.n1.xlarge_m	|4|12|*|
g.n1.xlarge|4|16|	
g.n1.2xlarge|8|32|	
g.n1.4xlarge|16|64|	
g.n1.8xlarge|32|128|	

The standard * indicates that the Virtual Machine is not supported by this specification, and you are not allowed to adjust the current Virtual Machine to this specification, but it does not affect the use of your existing Virtual Machine.

## Compute Optimized Type
Compute Optimized Type currently offer Compute-Optimized Standard that provide you with high-performance computing resources that can be met. Each vCPU corresponds to a hyper-threaded core of an Intel Xeon processor.

### Compute-Optimized Standard <div id="c.n"></div>
**Specification type features:**

* vCPU to memory ratio is 1:2 (except 2 core 2GB, 4 core 4GB, 8 core 8GB, 8 core 12GB and 16 core 16GB specifications)
* Processor:
	* Second generation: 2.4 GHz Intel Xeon Gold 6148 (Skylake) processor
	* First generation: 2.1 GHz Intel Xeon E5-2683 v4 (Broadwell) processor
* Support the following two types of cloud disks:
	*Premium Hdd Cloud Disk
	* SSD cloud disk
* Applicable scenario:
	* Batch workload
	* Web frontend server
	* Large multiplayer online game (MMO) front end
	* Data analysis, batch calculation, video coding
	* High performance science and engineering applications
**Instance Type**

Second generation

Instance Type|vCPU (core)|Memory (GB)
:---|:---|:---
c.n2.large|2|4
c.n2.xlarge|4|8
c.n2.2xlarge|8|16
c.n2.4xlarge|16|32
c.n2.8xlarge|32|64
c.n2.16xlarge|64|128
c.n2.18xlarge	|72|144

First generation

Example Specifications|vCPU (core)|Memory (GB)|Remarks
:---|:---|:---|:---	
c.n1.large|2|4	
c.n1.xlarge_m	|4|4|	*
c.n1.xlarge|4|8|	
c.n1.2xlarge_s|8|8|*
c.n1.2xlarge_m|8|12|*
c.n1.2xlarge|8|16|	
c.n1.4xlarge_m|16|16|*
c.n1.4xlarge|16|32|	
c.n1.8xlarge|32|64	

The standard * indicates that the Virtual Machine is not supported by this specification, and you are not allowed to adjust the current Virtual Machine to this specification, but it does not affect the use of your existing Virtual Machine.

## Memory Optimized Type
Memory-Optimized Type currently offer a Memory-Optimized Standard Type for applications with large memory operations, lookups, and calculations. Each vCPU corresponds to a hyper-threaded core of an Intel Xeon processor.

### Memory-Optimized Standard <div id="m.n"></div>
**Specification type features:**

* vCPU to memory ratio is 1:8 (except for 2 core 12GB specifications)
* Processor:
	* Second generation: 2.4 GHz Intel Xeon Gold 6148 (Skylake) processor
	* First generation: 2.1 GHz Intel Xeon E5-2683 v4 (Broadwell) processor
* Support the following two types of cloud disks:
	*Premium Hdd Cloud Disk
	* SSD cloud disk
* Applicable scenario:
	* High performance database, in-memory database
	* Data analysis and mining, distributed memory caching
	* Hadoop, Spark clusters and other enterprise large memory requirements applications
**Instance Type**

Second generation

Instance Type|vCPU (core)|Memory (GB)
:---|:---|:---
m.n2.large|2|16
m.n2.xlarge|4|32
m.n2.2xlarge|8|64
m.n2.4xlarge|16|128

First generation

Example Specifications|vCPU (core)|Memory (GB)|Remarks
:---|:---|:---|:---	
m.n1.small|1|8|*
m.n1.medium|2	|12|*
m.n1.large|2|16	
m.n1.xlarge|4|32	
m.n1.2xlarge|8|64	
m.n1.4xlarge|16|128	

The standard * indicates that the Virtual Machine is not supported by this specification, and you are not allowed to adjust the current Virtual Machine to this specification, but it does not affect the use of your existing Virtual Machine.

## High frequency calculation type

High-frequency computing models currently offer high-frequency computing general-purpose models that provide you with high-performance computing resources. Each vCPU corresponds to a hyper-threaded core of an Intel Xeon processor.

### High-Frequency-Compute General Type <div id="h.g"></div>
**Specification type features:**

* vCPU to memory ratio is 1:4
* Computational performance is stable, the processor frequency is high
* Processor:
	* Second generation: 3.2 GHz Intel Xeon Gold 6146 (Skylake) processor
	* First generation: 3.2 GHz Intel Xeon E5-2667 v4 (Broadwell) processor
* Support the following two types of cloud disks:
	*Premium Hdd Cloud Disk
	* SSD cloud disk
* Applicable scenario:
	* High-performance web front-end server
	* High performance science and engineering applications
	* MMO games, video coding
* Instance Type

Second generation:

Instance Type|vCPU (core)|Memory (GB)
:---|:---|:---
h.g2.large|2|8
h.g2.xlarge|4|16
h.g2.2xlarge|8|32
h.g2.4xlarge|16|64
h.g2.8xlarge|32|128

First generation:

Instance Type|vCPU (core)|Memory (GB)
:---|:---|:---
h.g1.large|2|8
h.g1.xlarge|4|16
h.g1.2xlarge|8|32
h.g1.4xlarge|16|64
h.g1.6xlarge|24|96

Please note:

* The second-generation Virtual Machine (except for high-frequency computing) is temporarily open only in cn-north-1, cn-east-2 and cn-south-1, and the high-frequency computing type is only available in cn-south-1;
* The first generation of general-purpose, compute-optimized, and memory-optimized Virtual Machine in cn-north-1 and cn-east-2 regions may also run on 2.3 GHz Intel Xeon E5-2698 v3 (Haswell) processors
* After purchasing an instance, you can modify the configuration of the instance according to the change of business scale. For details, please refer to ["Resize"]().


## Cloud Disk Service fee

Monthly Package (RMB/G/month) | Pay By Configuration (RMB/G/hour)
---:|---:
2.13 | 0.0046


## EIP Cost fee
IP provider | Region | Bandwidth | Pay By Configuration (RMB/ hour) | Annual subscription (RMB/ month) |
:---|:--- |---: |---: |---: |
Single line | cn-south-1/cn-south-1u/cn-east-1| 1Mbps | 0.03 | 13 |
Single line | cn-north-1/cn-south-1/cn-east-1| 2Mbps | 0.06 | 26 |
Single line | cn-north-1/cn-south-1/cn-east-1| 3Mbps | 0.09 | 40 |
Single line | cn-north-1/cn-south-1/cn-east-1| 4Mbps | 0.12 | 53 |
Single line | cn-north-1/cn-south-1/cn-east-1| 5Mbps | 0.15 | 70 |
Single line | cn-north-1/cn-south-1/cn-east-1| 5Mbps or more, per Mbps fee | 0.12 | 40 |
BGP | cn-north-1/cn-south-1/cn-east-1/cn-east-2| 1Mbps | 0.06 | 23 |
BGP | cn-north-1/cn-south-1/cn-east-1/cn-east-2| 2Mbps | 0.10 | 46 |
BGP | cn-north-1/cn-south-1/cn-east-1/cn-east-2| 3Mbps | 0.14 | 71 |
BGP | cn-north-1/cn-south-1/cn-east-1/cn-east-2| 4Mbps | 0.18 | 96 |
BGP | cn-north-1/cn-south-1/cn-east-1/cn-east-2| 5Mbps | 0.22 | 125 |
BGP | cn-north-1/cn-south-1/cn-east-1/cn-east-2| 5Mbps or more, per Mbps fee | 0.14 | 80 |

## JMR Product Service Fee

Monthly Package (RMB/G/month) | Pay By Configuration (RMB/G/hour)
---:|---:
Not supported yet | Free