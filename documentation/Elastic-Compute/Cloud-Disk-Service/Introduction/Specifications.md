# **Specifications**


Cloud Disk Service is a high-availability, high-reliability and low-cost storage devices, which can be used as an independent expandable disk of Virtual Machines to provide Virtual Machines with data storage of data block-level. Cloud disk adopts distributed mechanism with three copies, to provide Virtual Machines with up to 99.9999999% data reliability guarantee. The old cloud disks are divided into two types, SSD Cloud Disk and Premium Hdd Cloud Disk, which will be offline.<br>
In order to better meet the application scenarios of different performance requirements, JD Cloud launched three new types of cloud disks in January 2019, which respectively: General type SSD cloud disk, performance type SSD cloud disk and capacity type HDD cloud disk.

## SSD cloud disk

### Specification

Provide a capacity from minimum 20G to maximum 1000G (with a step size of 10G)

### Performance
- Maximum IOPS: 20000
- Default Throughput: 100MBps
- Maximum Throughput: 300MBps (please open ticket for application)
### Price

Monthly package: RMB 1/GB/month

Billing by quantity: RMB 0.0335/GB/day (wherein, RMB 0.0552/GB/day for Hong Kong area)

### Application Scenarios
- Applicable to MySQL, SQL Server, MongoDB and other medium and large-sized database application, providing long-term, stable and ultra-high single disk performance;
- Applicable to I/O intensive core business scenario with high requirements for data reliability;


## Premium Hdd cloud disk

### Specification

Provide a capacity from minimum 20G to maximum 3000G (with a step size of 10G)

### Performance
- Maximum IOPS: 500
- Maximum throughput: 80MBps
### Price

Monthly package: RMB 0.3/GB/month

Billing by quantity: RMB 0.011/GB/day

### Application Scenarios
- Applicable to most of I/O scenarios, the best choice with good quality and low price;
- Applicable to small and medium-sized database, web server, etc., providing stable IO performance output;
- Applicable to large file sequential read and write, cold data backup and other archiving storage, providing the best choice with high cost performance;


## General Type SSD Cloud Disk

### Specification

Provide a capacity from minimum 20G to maximum 4,000G (with a step size of 10G)

### Performance
- Maximum IOPS: 15,000
- Maximum Throughput: 150MBps
### Price

Monthly Package: RMB 0.39/GB/month

Pay by Configuration: 0.0625 RMB/100GB/Hour

### Application Scenarios
- Applicable to boot volumes, small databases, large-scale development tests, web servers, and other business scenarios that require random read-write;

## Performance Type SSD Cloud Disk

### Specification

Provide a capacity from minimum 20G to maximum 4,000G (with a step size of 10G)

### Performance
- Maximum IOPS: 32,000
- Maximum Throughput: 150MBps
### Price

Monthly Package: RMB 0.8/GB/Month

Pay by Configuration: 0.112 RMB/100G/Hour

### Application Scenarios
- Applicable to MySQL, SQL Server, MongoDB and other medium and large-sized database application, providing long-term, stable and ultra-high single disk performance;
- Applicable to I/O intensive core business scenario with high requirements for data reliability;

## Capacity Type HDD Cloud Disk

### Specification

Provide a capacity from minimum 20G to maximum 4,000G (with a step size of 10G)

### Performance
- Maximum IOPS: 500
- Maximum Throughput: 80MBps
### Price

Monthly Package: RMB 0.24/GB/Month

Pay by Configuration: 0.034 RMB/100G/Hour

### Application Scenarios
- Provide secure and reliable storage resources for Web applications to meet data integrity and data protection requirements;
- Applicable to scenarios with moderate read-write rate, fewer transactions to process, cold data backup, etc.;


