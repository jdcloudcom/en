# Instance Type Family

An instance is the smallest unit for the computing services provided by JD Cloud for your business. Different instances identify their corresponding computing, memory, storage, and networking capabilities by their instance type familes and specific instance types. Meanwhile, the instance type family you specified when you create an instance determines the hardware configuration of this instance. You can select the appropriate instance type family and instance types based on the type and size of the application you need to deploy.

The following is the information on the instance type family currently sold on JD Cloud. The instance type families and instance types of the saleable instances in different regions are not identical, please refer to the information shown on the instance creation page. The specific Instance Type specifications can be classified according to different application scenarios:

* General: General Shared Type(instance-type-family#user-content-1), General Standard Type(instance-type-family#user-content-2)
* Compute-Optimized Standard type: Compute Optimized Standard Type(instance-type-family#user-content-3)
* Memory-Optimized type: Memory Optimized Standard Type(instance-type-family#user-content-4)
* High-frequency compute type: High-frequency compute optimization type: High-frequency calculation optimization type(instance-type-family#user-content-5)
* Storage Optimization type: [Storage Optimization IO type](instance-type-family#user-content-7), [Storage Optimization Big Data type](instance-type-family#user-content-8),
* GPU Type: [GPU Standard Type](instance-type-family#user-content-6)

## General
The General currently provides General Shared and General Standard types, providing you with balanced computing and memory resources to meet the needs of most business scenarios. Each of the vCPUs in the common standard type corresponds to an Intel Xeon processor hyper-threaded core with a vCPU to memory ratio of 1:4.

### General Shared
<div id="user-content-1"></div>

**Specification Type Features:**

* vCPU to Memory Ratio is 1:1 or 1:2
* Processor: 2.1 GHz Intel Xeon E5-2683 v4 (Broadwell) processor
* The following Cloud Disk Service types are supported:
	* General Type SSD Cloud Disk
	* Performance Type SSD Cloud Disk
	* Capacity Type HDD Cloud Disk
* Applicable Scenario:
	* Primary stage of personal website with small visits
	* Microservices
	* Test Environment

**Instance Type**

Instance Type|vCPU (core)|Memory (GB)
:---|:---|:---
|g.s1.micro|1|1
|g.s1.small|1|2

### General Standard Type
<div id="user-content-2"></div>

**Specification type features:**

* vCPU to memory ratio is 1:4 (except for g.n1.xlarge_m specification)
* Processor:
	* Generation III: Intel Xeon with 2.6 GHz dominant frequency Gold 6267 (Cascade Lake) Processor  
	* Second generation: 2.4 GHz Intel Xeon Gold 6148 (Skylake) processor
	* First generation: 2.1 GHz Intel Xeon E5-2683 v4 (Broadwell) processor
* The following Cloud Disk Service types are supported:
	* General Type SSD Cloud Disk
	* Performance Type SSD Cloud Disk
	* Capacity Type HDD Cloud Disk
* Applicable Scenario:
	* Enterprise applications of all types and sizes
	* Small and medium data systems, caches, search clusters
	* Data analysis and calculation
	* Compute cluster, memory dependent data processing

**Instance Type**

Generation III

Instance Type|vCPU (core)|Memory (GB)|Multi-queue network interface
:---|:---|:---|:---
|g.n3.medium|1|4|1
|g.n3.large|2|8|2
|g.n3.xlarge|4|16|4
|g.n3.2xlarge|8|32|4
|g.n3.3xlarge|12|48|4
|g.n3.4xlarge|16|64|4
|g.n3.6xlarge|24|96|4
|g.n3.8xlarge|32|128|4
|g.n3.12xlarge|48|192|4
|g.n3.16xlarge|64|256|4
|g.n3.18xlarge|72|288|4

Second generation

Instance Type|vCPU (core)|Memory (GB)|Network Interface Multi-Queue
:---|:---|:---|:---
|g.n2.medium|1|4|1
|g.n2.large|2|8|2
|g.n2.xlarge|4|16|4
|g.n2.2xlarge|8|32|4
|g.n2.4xlarge|16|64|4
|g.n2.8xlarge|32|128|4
|g.n2.16xlarge|64|256|4
|g.n2.18xlarge|72|288|4
|g.n2.metal|80|384|60

**For more details on Bare Metal Virtual Machines g.n2.metal, please refer to [Overview of Bare Metal Virtual Machines](../Operation-Guide/Instance/Bare-Metal/Bare-Metal-Overview.md)

First generation

Instance Type|vCPU (core)|Memory (GB)|Network Interface Multi-Queue|Remarks
:---|:---|:---|:---|:---
g.n1.medium|1|4|1 | |
g.n1.large|2|8|2 | |
g.n1.xlarge_m	|4|12|4|*
g.n1.xlarge|4|16|4 | |	
g.n1.2xlarge|8|32|4 | |	
g.n1.4xlarge|16|64|4 |	|
g.n1.8xlarge|32|128|4 |	 |

The mark * indicates that the VM is not supported by this instance type, and you are not allowed to adjust the current Virtual Machines to this specification, but it does not affect the use of your existing Virtual Machines.

## Compute Optimized Type
Compute Optimized Type currently offer Compute-Optimized Standard that provide you with high-performance computing resources that can be met. Each vCPU corresponds to a hyper-threaded core of an Intel Xeon processor.

<div id="user-content-3"></div>

### Compute-Optimized Standard

**Specification Type Features:**

* vCPU to Memory Ratio is 1:2 (except for c.n1.xlarge_m, c.n1.2xlarge_s, c.n1.2xlarge_m and c.n1.4xlarge_m specifications)
* Processor:
	* Generation III: Intel Xeon with 2.6 GHz dominant frequency Gold 6267 (Cascade Lake) Processor
	* Second generation: 2.4 GHz Intel Xeon Gold 6148 (Skylake) processor
	* First generation: 2.1 GHz Intel Xeon E5-2683 v4 (Broadwell) processor
* The following Cloud Disk Service types are supported:
	* General Type SSD Cloud Disk
	* Performance Type SSD Cloud Disk
	* Capacity Type HDD Cloud Disk
* Applicable Scenario:
	* Batch Workload
	* Web Frontend Server
	* Large Multiplayer Online Game (MMO) Front End
	* Data Analysis, Batch Calculation, Video Coding
	* High Performance Science and Engineering Applications

**Instance Type**

Generation III

Instance Type|vCPU (core)|Memory (GB)|Multi-queue network interface
:---|:---|:---|:---
|c.n3.large|2|4|2
|c.n3.xlarge|4|8|4
|c.n3.2xlarge|8|16|4
|c.n3.3xlarge|12|24|4
|c.n3.4xlarge|16|32|4
|c.n3.6xlarge|24|48|4
|c.n3.8xlarge|32|64|4
|c.n3.12xlarge|48|96|4
|c.n3.16xlarge|64|128|4
|c.n3.18xlarge|72|176|4

Second generation

Instance Type|vCPU (core)|Memory (GB)|Network Interface Multi-Queue
:---|:---|:---|:---
|c.n2.large|2|4|2
|c.n2.xlarge|4|8|4
|c.n2.2xlarge|8|16|4
|c.n2.4xlarge|16|32|4
|c.n2.8xlarge|32|64|4
|c.n2.16xlarge|64|128|4
|c.n2.18xlarge	|72|144|4

First generation

Instance Type|vCPU (core)|Memory (GB)|Network Interface Multi-Queue|Remarks
:---|:---|:---|:---|:---
|c.n1.large|2|4|2 | |	
|c.n1.xlarge_m	|4|4|4|	*
|c.n1.xlarge|4|8|	4| |
|c.n1.2xlarge_s|8|8|4|*
|c.n1.2xlarge_m|8|12|4|*
|c.n1.2xlarge|8|16|4 |	|
|c.n1.4xlarge_m|16|16|4|*
|c.n1.4xlarge|16|32|4 |	|
|c.n1.8xlarge|32|64|4 | |

The standard * indicates that the Virtual Machines is not supported by this specification, and you are not allowed to adjust the current Virtual Machines to this specification, but it does not affect the use of your existing Virtual Machines.

## Memory Optimized
Memory-Optimized Standard currently offer a Memory-Optimized Standard Type for applications with large memory operations, lookups, and calculations. Each vCPU corresponds to a hyper-threaded core of an Intel Xeon processor.

<div id="user-content-4"></div>

### Memory-Optimized Standard

**Specification Type Features:**

* vCPU to Memory Ratio is 1:8
* Processor:
	* Generation III: Intel Xeon with 2.6 GHz dominant frequency Gold 6267 (Cascade Lake) Processor 
	* Second generation: 2.4 GHz Intel Xeon Gold 6148 (Skylake) processor
	* First generation: 2.1 GHz Intel Xeon E5-2683 v4 (Broadwell) processor
* The following Cloud Disk Service types are supported:
	* General Type SSD Cloud Disk
	* Performance Type SSD Cloud Disk
	* Capacity Type HDD Cloud Disk
* Applicable Scenario:
	* High performance database, in-memory database
	* Data analysis and mining, distributed memory caching
	* Hadoop, Spark clusters and other enterprise large memory requirements applications

**Instance Type**

Generation III

Instance Type|vCPU (core)|Memory (GB)|Multi-queue network interface
:---|:---|:---|:---
|m.n3.large|2|16|2
|m.n3.xlarge|4|32|4
|m.n3.2xlarge|8|64|4
|m.n3.3xlarge|12|96|4
|m.n3.4xlarge|16|128|4
|m.n3.6xlarge|24|192|4
|m.n3.8xlarge|32|256|4

Second generation

Instance Type|vCPU (core)|Memory (GB)|Network Interface Multi-Queue
:---|:---|:---|:---
|m.n2.large|2|16|2
|m.n2.xlarge|4|32|4
|m.n2.2xlarge|8|64|4
|m.n2.4xlarge|16|128|4
|m.n2.8xlarge|32|256|4
|m.n2.16xlarge|64|512|4
|m.n2.18xlarge|72|576|4

First generation

Instance Type|vCPU (core)|Memory (GB)|Network Interface Multi-Queue|Remarks
:---|:---|:---|:---	|:---
|m.n1.small| 1 | 8 | 1 | *
|m.n1.medium|2	|12|2|*
|m.n1.large|2|16|2 | |
|m.n1.xlarge|4|32	|4 | |
|m.n1.2xlarge|8|64|4  | |
|m.n1.4xlarge|16|128|4 | |

The standard * indicates that the Virtual Machines is not supported by this specification, and you are not allowed to adjust the current Virtual Machines to this specification, but it does not affect the use of your existing Virtual Machines.

## High-Frequency-Compute

High-frequency computing models currently offer high-frequency computing general-purpose models that provide you with high-performance computing resources. Each vCPU corresponds to a hyper-threaded core of an Intel Xeon processor.

<div id="user-content-5"></div>

### High-Frequency-Compute General

**Specification Type Features:**

* vCPU to Memory Ratio is 1:4
* Computational performance is stable, the processor frequency is high
* Processor:
	* Second Generation: 3.2 GHz Intel Xeon Gold 6146 (Skylake) processor
	* First Generation: 3.2 GHz Intel Xeon E5-2667 v4 (Broadwell) processor
* The following Cloud Disk Service types are supported:
	* General Type SSD Cloud Disk
	* Performance Type SSD Cloud Disk
	* Capacity Type HDD Cloud Disk
* Applicable Scenario:
	* High-performance Web Front-end Server
	* High Performance Science and Engineering Applications
	* MMO games, Video Coding

**Instance Type**

Second Generation:

Instance Type|vCPU (core)|Memory (GB)|Network Interface Multi-Queue
:---|:---|:---|:---
|h.g2.large|2|8|2
|h.g2.xlarge|4|16|4
|h.g2.2xlarge|8|32|4
|h.g2.4xlarge|16|64|4
|h.g2.8xlarge|32|128|4

First Generation:

Instance Type|vCPU (core)|Memory (GB)|Network Interface Multi-Queue
:---|:---|:---|:---
|h.g1.large|2|8|2
|h.g1.xlarge|4|16|4
|h.g1.2xlarge|8|32|4
|h.g1.4xlarge|16|64|4
|h.g1.6xlarge|24|96|4

## Storage Optimization Type

Storage Optimization type currently includes Storage Optimization IO type and Storage Optimization Big Data type, which can provide high-performance local storage resources for you. Each vCPU is corresponded to hyper-threading core of on Intel Xeon processor.

<div id="user-content-7"></div>

### Storage Optimization IO Type

**Specifications and Type Characteristics:**

* vCPU to Memory Ratio is 1:4
* Provide local storage of low latency and high IO
* Processor:
	* Generation III: Intel Xeon Gold 6267 (Cascade Lake) processor with 2.6 GHz dominant frequency  
	* Generation II: Intel Xeon Gold 6148 (Skylake) processor with 2.4 GHz dominant frequency
	* Generation I: Intel Xeon E5-2683 v4 (Broadwell) processor with 2.1 GHz dominant frequency
* Support local data disk (for temporary storage) and support the following types of Cloud Disks: Please note that **local data disk is a temporary storage disk that is exposed to the loss of data (e.g. under the circumstance of transfer or system breakdown of host computers) and is not applicable to the customer scenarios where there is no data redundancy structure in the application layer. You are suggested to store important data in Cloud Disks.** 
	* General SSD Cloud Disk
	* Performance SSD Cloud Disk
	* Capacity HDD Cloud Disk
* Applicable Scenarios:
	* High-performance Relational Database
	* NoSQL Database
	* JCS for Elasticsearch and other circumstances

**Instance Type**


Generation III:

Instance Type|vCPU (core)|Memory (GB)|Local Data Disk (temporary storage|multi-queue network interface
:---|:---|:---|:---|:---
|s.i3.2xlarge|8|32|1 x 1862 NVMe SSD|4
|s.i3.4xlarge|16|64|2 x 1862 NVMe SSD|4
|s.i3.6xlarge|24|96|3 x 1862 NVMe SSD|4
|s.i3.8xlarge|32|128|4 x 1862 NVMe SSD|4
|s.i3.12xlarge|48|192|6 x 1862 NVMe SSD|4
|s.i3.16xlarge|64|256|8 x 1862 NVMe SSD|4
|s.i3.22large|88|352|8 x 1862 NVMe SSD|4

Generation II:

Instance Type|vCPU (core)|Memory (GB)|Local Data Disk (temporary storage|multi-queue network interface
:---|:---|:---|:---|:---
|s.i2.metal|88|384|1 x 1862 NVMe SSD|60

Generation I:

Instance Type|vCPU (core)|Memory (GB)|Local Data Disk (temporary storage|multi-queue network interface
:---|:---|:---|:---|:---
|s.i1.xlarge|4|16|1 x 894GB SSD|4
|s.i1.2xlarge|8|32|2 x 894GB SSD|4
|s.i1.4xlarge|16|64|4 x 894GB SSD|4
|s.i1.8xlarge|32|128|8 x 894GB SSD|4
|s.i1.14xlarge|56|224|14 x 894GB SSD|4

<div id="user-content-8"></div>

### Storage Optimization Big Data Type

**Specifications and Type Characteristics:**

* vCPU to Memory Ratio is 1:4
* Provide local storage of low latency, high capacity and high throughput
* Processor:
	* Generation II: Intel Xeon Silver 4116 (Skylake) processor with 2.1 GHz dominant frequency
	* Generation I: Intel Xeon E5-2650 v4 (Broadwell) processor with 2.2 GHz dominant frequency
* Support local data disk (for temporary storage) and support the following types of Cloud Disks: Please note that **local data disk is a temporary storage disk that is exposed to the loss of data (e.g. under the circumstance of transfer or system breakdown of host computers) and is not applicable to the customer scenarios where there is no data redundancy structure in the application layer. You are suggested to store important data in Cloud Disks.** 
	* General SSD Cloud Disk
	* Performance SSD Cloud Disk
	* Capacity HDD Cloud Disk
* Applicable Scenarios:
	* Hadoop MapReduce、HDFS、Hive、HBase
	* Other mass data storage area and computing business circumstances

**Instance Type**

Generation II:

Instance Type|vCPU (core)|Memory (GB)|Local Data Disk (temporary storage, GB)|Multi-queue Network Interface
:---|:---|:---|:---|:---
|s.d2.xlarge|4|22|1 x 9313 HDD|4
|s.d2.2xlarge|8|44|2 x 9313 HDD|4
|s.d2.4xlarge|16|88|4 x 9313 HDD|4
|s.d2.8xlarge|32|176|8 x 9313 HDD|4
|s.d2.10xlarge|40|220|12 x 9313 HDD|4

Generation I:

Instance Type|vCPU (core)|Memory (GB)|Local Data Disk (temporary storage, GB)|Multi-queue Network Interface
:---|:---|:---|:---|:---
|s.d1.xlarge|4|22|1 x 5587 HDD|4
|s.d1.2xlarge|8|44|2 x 5587 HDD|4
|s.d1.4xlarge|16|88|4 x 5587 HDD|4
|s.d1.8xlarge|32|176|8 x 5587 HDD|4
|s.d1.10xlarge|40|220|12 x 5587 HDD|4

## GPU Type

GPU Type currently provides GPU Standard Type, providing you with a heterogeneous computing resource with high performance. Each vCPU is corresponded to hyper-threading core of an Intel Xeon processor.

<div id="user-content-6"></div>

### GPU Standard Type

**Specifications and Type Characteristics:**

* The ratio between vCPU and memory is nearly 1:4
* Heterogeneous Computing
* GPU：
	* Nvidia Tesla P40 
	* Nvidia Tesla V100
* Processor:
	* Intel Xeon E5-2683 v4 (Broadwell) processor with 2.1 GHz dominant frequency(P40)
	* Intel Xeon E5-2650 v4 (Broadwell) processor (V100) with 2.2 GHz dominant frequency
* Support the local data disk (temporary storage). Please note that **local data disk data will be cleared when shutdown occurs**, and the following Cloud Disk Service types will be supported:
	* General Type SSD Cloud Disk
	* Performance Type SSD Cloud Disk
	* Capacity Type HDD Cloud Disk
* Applicable Scenarios:
	* Scientific Computing
	* Machine Learning
	* Graphics Rendering 

**Instance Type**

First Generation:

Instance Type|vCPU(core)|Memory(GB)|GPU|Local Data Disk (Temporary Storage, GB)|Network Interface Multi-queue
:---|:---|:---|:---|:---|:---|
|p.n1p40.3xlarge|12|48|1 x Nvidia Tesla P40|1 x 894 SSD|4
|p.n1p40.7xlarge|28|110|2 x Nvidia Tesla P40|2 x 894 SSD|4
|p.n1p40.14xlarge|56|220|4 x Nvidia Tesla P40|4 x 894 SSD|4
|p.n1p40h.3xlarge|12|48|1 x Nvidia Tesla P40|1 x 1117 HDD|4
|p.n1p40h.7xlarge|28|110|2 x Nvidia Tesla P40|2 x 1117 HDD|4
|p.n1p40h.14xlarge|56|220|4 x Nvidia Tesla P40|4 x 1117 HDD|4
|p.n1v100.2xlarge|8|44|1 x Nvidia Tesla V100|1 x 5587 HDD|4
|p.n1v100.5xlarge|20|110|2 x Nvidia Tesla V100|2 x 5587 HDD|4
|p.n1v100.10xlarge|40|220|4 x Nvidia Tesla V100|4 x 5587 HDD|4


Please note:

* High Frequency Compute Type only can be provided in cn-north-1, cn-east-2 and cn-south-1;
* GPU Type only can be provided in Single Availability Zone Open Beta Test in cn-north-1;
* The First generation of general, compute optimized, and memory optimized Virtual Machines in cn-north-1 and cn-east-2 regions may also run on 2.3 GHz Intel Xeon E5-2698 v3 (Haswell) processor;
* After purchasing an instance, you can modify the configuration of the instance according to the change of business scale. For details, please refer to [Resize](../Operation-Guide/Instance/Resize-Instance.md).

## Related Reference

[Resize](../Operation-Guide/Instance/Resize-Instance.md)
