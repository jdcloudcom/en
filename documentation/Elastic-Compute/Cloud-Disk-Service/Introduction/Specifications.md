# **Specifications**


Cloud Disk Service is a high-availability, high-reliability and low-cost storage devices, which can be used as an independent expandable disk of Virtual Machines to provide Virtual Machines with data storage of data block-level. Cloud disk adopts distributed mechanism with three copies, to provide Virtual Machines with up to 99.9999999% data reliability guarantee. Based on different performances, Cloud Disk Service is divided into two types, i.e. SSD cloud disk and Premium Hdd cloud disk.

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


