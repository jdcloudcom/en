# Price Overview

Column-oriented Storage products adopt the billing mode of Pay by Configuration according to different user needs, now, the basic cost for the Column-oriented Storage product mainly includes: Virtual Machine cost, Cloud Disk Service cost, EIP cost and the service charge for Column-oriented Storage product.

## Virtual Machine Cost

The following is the instance type family information currently sold by JD Cloud. The types and specifications of instances available for sales in different regions are not completely the same. Please refer to the display of the instance creation page. The specifications and type of specific instance on sale can be divided into according to different application scenarios, including:

* General
* Compute Optimized
* Memory Optimized
* High Frequency Compute

## General
Currently, the general type currently provides the general shared type and the general standard type, providing users with balanced computing and memory resources to meet the demand of most service scenarios. In which, each vCPU of general standard type is corresponded to hyper-threading core of one Intel Xeon processor, its vCPU to Memory Ratio is 1.:4。

### Shared Type<div id="g.s"></div>
**Specifications and Type Characteristics:**

* vCPU to Memory Ratio is 1:1 or 1:2
* Processor: Intel Xeon E5-2683 v4 (Broadwell) processor with 2.1 GHz dominant frequency
* It supports the following two types of Cloud Disks:
	* Premium Hdd Cloud Disk
	* SSD Cloud Disk
* Applicable Scenarios:
	* The initial stage of a personal website with less access traffic
	* Microservice
	* Test Environment

**Instance Type**

Instance Type|vCPU (Core)|Memory (GB)
:---|:---|:---
g.s1.micro|1|	1
g.s1.small|1|2

### General Standard<div id="g.n"></div>
**Characteristic of Specification and Type::**

* vCPU to Memory Ratio is 1:4 (excluding the specification of 4-core 12GB)

* Processor:
	* Generation II: Intel Xeon Gold 6148 (Skylake) processor with 2.4 GHz dominant frequency
	* Generation I: Intel Xeon E5-2683 v4 (Broadwell) processor with 2.1 GHz dominant frequency
* It supports the following two types of Cloud Disks:
	* Premium Hdd Cloud Disk
	* SSD Cloud Disk
* Applicable Scenarios:
	* Enterprise-level Applications of All Types and Sizes
	* Small and Medium Data System, Cache and Search Clusters
	* Data Analysis and Calculation
	* Compute Cluster, Memory Dependent Data Processing

**Instance Type**

Generation II

Instance Type|vCPU (Core)|Memory (GB)
:---|:---|:---
g.n2.medium|1|4
g.n2.large|2|8
g.n2.xlarge|4|16
g.n2.2xlarge|8|32
g.n2.4xlarge|16|64
g.n2.8xlarge|32|128
g.n2.16xlarge|64|256
g.n2.18xlarge|72|288

Generation I

Instance Type|vCPU (Core)|Memory (GB)|Description
:---|:---|:---|:---	
g.n1.medium|1|4| |	
g.n1.large|2|8|	|
g.n1.xlarge_m	|4|12|* 
g.n1.xlarge|4|16| |	
g.n1.2xlarge|8|32| |	
g.n1.4xlarge|16|64| |	
g.n1.8xlarge|32|128| |	

Mark * does not support the creation of a new Virtual Machine with this specification, and does not support you to adjust the current Virtual Machine to this specification, but it does not affect the use of your existing Virtual Machine with this specification.

## Compute Optimized
Compute Optimized Type currently provides Compute Optimized Standard Type, providing you with high performance computing resource to meet your demands. Each vCPU is corresponded to hyper-threading core of on Intel Xeon processor.

### Compute Optimized Standard<div id="c.n"></div>
**Specifications and Type Characteristics:**

* vCPU to Memory Ratio is 1:2 (excluding specifications of 2-core 2GB, 4-core 4GB, 8-core 8GB, 8-core 12GB and 16-core 16GB)
* Processor:
	* Generation II: Intel Xeon Gold 6148 (Skylake) processor with 2.4 GHz dominant frequency
	* Generation I: Intel Xeon E5-2683 v4 (Broadwell) processor with 2.1 GHz dominant frequency
* It supports the following two types of Cloud Disks:
	* Premium Hdd Cloud Disk
	* SSD Cloud Disk
* Applicable Scenarios:
	* Batch Workload
	* Web Frontend Server
	* Large Multiplayer Online Game (MMO) Frontend
	* Data Analysis, Batch Computing, Video Coding
	* High Performance Science and Engineering Application
**Instance Type**

Generation II

Instance Type|vCPU (Core)|Memory (GB)
:---|:---|:---
c.n2.large|2|4
c.n2.xlarge|4|8
c.n2.2xlarge|8|16
c.n2.4xlarge|16|32
c.n2.8xlarge|32|64
c.n2.16xlarge|64|128
c.n2.18xlarge	|72|144

Generation I

Instance Type|vCPU (Core)|Memory (GB)|Description
:---|:---|:---|:---	
c.n1.large|2|4 | | |
c.n1.xlarge_m	|4|4|	*
c.n1.xlarge|4|8| | |	
c.n1.2xlarge_s|8|8|*
c.n1.2xlarge_m|8|12|*
c.n1.2xlarge|8|16| | |	
c.n1.4xlarge_m|16|16|*
c.n1.4xlarge|16|32| | |	
c.n1.8xlarge|32|64| |	|

Mark * does not support the creation of a new Virtual Machine with this specification, and does not support you to adjust the current Virtual Machine to this specification, but it does not affect the use of your existing Virtual Machine with this specification.

## Memory Optimized
Memory Optimized Type currently provides the Memory Optimized Standard Type that is applicable to applications with large memory operations, searching and calculations. Each vCPU is corresponded to hyper-threading core of on Intel Xeon processor.

### Memory Optimized Standard<div id="m.n"></div>
**Specifications and Type Characteristics:**

* vCPU to Memory Ratio is 1:8 (excluding the specification of 2-core 12GB)
* Processor:
	* Generation II: Intel Xeon Gold 6148 (Skylake) processor with 2.4 GHz dominant frequency
	* Generation I: Intel Xeon E5-2683 v4 (Broadwell) processor with 2.1 GHz dominant frequency
* It supports the following two types of Cloud Disks:
	* Premium Hdd Cloud Disk
	* SSD Cloud Disk
* Applicable Scenarios:
	* High Performance Database and Main Memory Database
	* Data Analysis and Explored and Distributed Memory Cache
	* Hadoop, Spark Clusters and Applications with Other Enterprise Large-Memory Demand
**Instance Type**

Generation II

Instance Type|vCPU (Core)|Memory (GB)
:---|:---|:---
m.n2.large|2|16
m.n2.xlarge|4|32
m.n2.2xlarge|8|64
m.n2.4xlarge|16|128

Generation I

Instance Type|vCPU (Core)|Memory (GB)|Description
:---|:---|:---|:---	
m.n1.small|1|8|* | |
m.n1.medium|2	|12|*
m.n1.large|2|16	 | |
m.n1.xlarge|4|32 | |	
m.n1.2xlarge|8|64 | |	
m.n1.4xlarge|16|128| |	

Mark * does not support the creation of a new Virtual Machine with this specification, and does not support you to adjust the current Virtual Machine to this specification, but it does not affect the use of your existing Virtual Machine with this specification.

## High Frequency Compute

High Frequency Compute Type currently provides High Frequency Compute General Type, providing you with high performance computing resource. Each vCPU is corresponded to hyper-threading core of on Intel Xeon processor.

### High Frequency Compute General<div id="h.g"></div>
**Specifications and Type Characteristics:**

* vCPU to Memory Ratio is 1::4
* The calculation performance is stable and the processor dominant frequency is high
* Processor:
	* Generation II: Intel Xeon Gold 6146 (Skylake) processor with 3.2 GHz dominant frequency
	* Generation I: Intel Xeon E5-2667 v4 (Broadwell) processor with 3.2 GHz dominant frequency
* It supports the following two types of Cloud Disks:
	* Premium Hdd Cloud Disk
	* SSD Cloud Disk
* Applicable Scenarios:
	* High-performance Web Frontend Server
	* High Performance Science and Engineering Application
	* MMO Game and Video Coding
* Instance Type

Generation II:

Instance Type|vCPU (Core)|Memory (GB)
:---|:---|:---
h.g2.large|2|8
h.g2.xlarge|4|16
h.g2.2xlarge|8|32
h.g2.4xlarge|16|64
h.g2.8xlarge|32|128

Generation I:

Instance Type|vCPU (Core)|Memory (GB)
:---|:---|:---
h.g1.large|2|8
h.g1.xlarge|4|16
h.g1.2xlarge|8|32
h.g1.4xlarge|16|64
h.g1.6xlarge|24|96

Note:

* Generation II Virtual Machines (excluding High Frequency Compute Type) only can be provided in regions including cn-north-1, cn-east-2 and cn-south-1; and the High Frequency Compute Type only can be provided in cn-south-1 region.
* Generation I General Type, Compute Optimized Type and Memory Optimized Type Virtual Machines in regions of cn-north-1 and cn-east-2 may be run on Intel Xeon E5-2698 v3 (Haswell) processor with 2.3 GHz dominant frequency
* After purchasing the instance, you can modify the configuration of the instance based on changes in the business scale.


## Cloud Disk Service Cost

Monthly Package (RMB/G/Month), Pay By Configuration (RMB/G/Hour)
---:|---:
2.13 | 0.0046


## EIP Cost
ISP Line	|Region	|Bandwidth	|Pay By Configuration (RMB/Hour)	|Monthly Package (RMB/Month) |
:---|:--- |---: |---: |---: |
Single IP Provider	| cn-north-1/cn-south-1/cn-east-1|1Mbps|0.03	| 13	| |
Single IP Provider	| cn-north-1/cn-south-1/cn-east-1|2Mbps|0.06	| 26	| |
Single IP Provider	| cn-north-1/cn-south-1/cn-east-1|3Mbps|0.09	| 40	| |
Single IP Provider	| cn-north-1/cn-south-1/cn-east-1|4Mbps|0.12	| 53	| |
Single IP Provider	| cn-north-1/cn-south-1/cn-east-1|5Mbps|0.15	| 70	| |
Single IP Provider	| cn-north-1/cn-south-1/cn-east-1|Over 5Mbps, per Mbps Cost|0.12 |	 40	|
BGP	| cn-north-1/cn-south-1/cn-east-1/cn-east-2|1Mbps|0.06	| 23	| |
BGP	| cn-north-1/cn-south-1/cn-east-1/cn-east-2|2Mbps|0.10	| 46	| |
BGP | cn-north-1/cn-south-1/cn-east-1/cn-east-2|3Mbps|0.14	| 71	| | |
BGP	| cn-north-1/cn-south-1/cn-east-1/cn-east-2|4Mbps|0.18	| 96	| |
BGP	| cn-north-1/cn-south-1/cn-east-1/cn-east-2|5Mbps|0.22	| 125	| |
BGP	| BGP| cn-north-1/cn-south-1/cn-east-1/cn-east-2 | over 5Mbps, per Mbps cost|0.14 | 80	|

## Service Charge for Column-oriented Storage Product

Monthly Package (RMB/G/Month), Pay By Configuration (RMB/G/Hour)
---:|---:
Not Support Now|Free
