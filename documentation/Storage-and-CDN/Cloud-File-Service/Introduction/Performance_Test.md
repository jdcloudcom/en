# Cloud File Service Performance Test



## 1. Test Tool

You can use test tools such as FIO or IOZone to test the file service. This document will take FIO as the test tool for example.

 

## 2. Test Environment Setup and Installation of Test Tool

1) Create VM Instance for the test tool of running performance and log in this VM Instance. Note:

- Since the current Cloud File Service only supports NFS 4.0 and NFS 4.1, please create Linux instance.
- To avoid impact of the performance and bandwidth of the VM Instance on the performance test result of Cloud File Service, please create VM Instance with specification of 8 core 32GB or above.

Log in VM Instance. Refer to ["Log in Virtual Machines”](https://docs.jdcloud.com/en/virtual-machines/connect-to-linux-instance) for the operation.

2) Install fio tool through yum source, or you can choose to download and install it from fio official website:

`yum install fio`

Select “y” in the notification of downloading installation package size to complete the download and installation.
![fio_installed](../../../../image/Cloud-File-Service/fio_installed.png)
After installation, please enter:

`fio -v`

Verify fio version. Please confirm to install fio of v3.1 and above version for testing so as to obtain more accurate test results.

3) Install libaio engine:

`yum install libaio-devel`
![libaio_installed](../../../../image/Cloud-File-Service/libaio_installed.png)

The installation of the test tool is finished after installation of this engine.

4) Create Cloud File Service and attach it to this VM Instance. You can refer to [“Create File Storage”](https://docs.jdcloud.com/en/cloud-file-service/creating-file-system) and [“Attach File Storage”](https://docs.jdcloud.com/en/cloud-file-service/mount-file-system)

 

## 3. Notes before Test

1)Linux: Since the current Cloud File Service only supports NFS 4.0 and NFS 4.1, so please conduct the performance test in Linux environment. The operating system test environment in this document is: CentOS 7.4

2) Sunrpc_slot setting: Because Linux nfs client has limited the NFS requests issued simultaneously, the following commands shall be run after the cloud file system is attached:

`cat /proc/sys/sunrpc/tcp_slot_table_entries`

We can see the default configuration of this parameter is 2.

To avoid low IO performance caused by less configuration of this parameter, you need to appropriately increase the value of this parameter to prevent this configuration from affecting the test result. Please run the following commands as root:

`echo "options sunrpc tcp_slot_table_entries=64" >> /etc/modprobe.d/sunrpc.conf`

`echo "options sunrpc tcp_max_slot_table_entries=64" >>  /etc/modprobe.d/sunrpc.conf`

`sysctl -w sunrpc.tcp_slot_table_entries=64`

3) Bandwidth of VM Instance: VM Instances of different specifications have different bandwidth cap. To avoid impact of the performance and bandwidth of the VM Instance on the performance test result of Cloud File Service, please create VM Instance with specification of 8 core 32GB or above.

4) Test parameter: The following parameters will affect the performance test result or the cost of performance test. Please understand the configuration and use of these parameters before test or use the test example below for direct test.

 **Io Type (parameter: -rw):** Different IO types affect the performance test result. Common IO types include: write (sequential writes), read (sequential reads), randwrite (random writes), randread (random reads), readwrite (mixed sequential reads and writes), randrw (mixed random reads and writes);

**Block Size (parameter: -bs):** The size of use block affects the performance of IOPS and bandwidth;

**Io Size (parameter: -size):** The quantity of data required in this test. When the data bulk can be guaranteed to be sufficient for the test, it has no direct impact on the performance test result. But please note that because the test tool will in fact create a file of size set by the parameter, occupying storage space of your file system, a fee of storage will be generated. Please set this parameter at your own discretion;

**Io Depth (parameter: -iodepth):** Queue depth;

**Num of Jobs (parameter: -numjobs):** Threads shall be configured as 1 when the reads and writes of a single file is tested;


 

## 4. Typical Test Scenario

**Test environment:**

- **VM Instance Type:** Region: cn-south-1; Instance Type: g.n2.2xlarge
- **Operating system:** CentOS 7.4 64-bit

- **File system:** Region: cn-south-1

- **Date:** 2019-04-08

- **Test Tool:** Fio-3.1




**Random reads IOPS**

  **Test sentence:**

`fio -thread -ioengine=libaio -group_reporting -name=fiotest -randrepeat=0 -time_based -sync=1 -direct=1 -directory=/root/nfs/ -size=1G -rw=randread -bs=4k -iodepth=64 -numjob=1 -runtime=180`

  **Expected IOPS:** 5000

![randread_iops](../../../../image/Cloud-File-Service/randread_iops.png)



**Random writes IOPS**

  **Test sentence:**

`fio -thread -ioengine=libaio -group_reporting -name=fiotest -randrepeat=0 -time_based -sync=1 -direct=1 -directory=/root/nfs/ -size=1G -rw=randwrite -bs=4k -iodepth=64 -numjob=1 -runtime=180`

 **Expected IOPS:** 5000

![randwrite_iops](../../../../image/Cloud-File-Service/randwrite_iops.png)



**Random reads bandwidth**

  **Test sentence:**

`fio -thread -ioengine=libaio -group_reporting -name=fiotest -randrepeat=0 -time_based -sync=1 -direct=1 -directory=/root/nfs/ -size=1G -rw=randread -bs=1M -iodepth=64 -numjob=1 -runtime=180`

  **Expected bandwidth:** 50MiB/s

![randread_bw](../../../../image/Cloud-File-Service/randread_bw.png)



**Random writes bandwidth**

  **Test sentence:**

`fio -thread -ioengine=libaio -group_reporting -name=fiotest -randrepeat=0 -time_based -sync=1 -direct=1 -directory=/root/nfs/ -size=1G -rw=randwrite -bs=1M -iodepth=64 -numjob=1 -runtime=180`

  **Expected bandwidth:** 50MiB/s

![randwrite_bw](../../../../image/Cloud-File-Service/randwrite_bw.png)
