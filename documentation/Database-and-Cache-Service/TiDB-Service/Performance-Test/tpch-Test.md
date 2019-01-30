# TiDB TPC-H 50G Performance Test Report
The test methods and test data in the Document are originated from official documents of PingCap, users can reference the test scheme in the Document to conduct its own performance test when planning deployment.

## Test Purpose

Test performance comparison between version 1.0 and version 2.0 of TiDB in OLAP scenario

> **Note**: Different test environments may lead to changes of test results.

## Test Environment

### Test Machines Information

1. System Information

| Machine IP      | Operating System               | Kernel Version                     | File System Type |
|--------------|------------------------|------------------------------|--------------|
| 172.16.31.2  | Ubuntu 17.10 64bit     | 4.13.0-16-generic            | ext4         |
| 172.16.31.3  | Ubuntu 17.10 64bit     | 4.13.0-16-generic            | ext4         |
| 172.16.31.4  | Ubuntu 17.10 64bit     | 4.13.0-16-generic            | ext4         |
| 172.16.31.6  | CentOS 7.4.1708 64bit  | 3.10.0-693.11.6.el7.x86\_64  | ext4         |
| 172.16.31.8  | CentOS 7.4.1708 64bit  | 3.10.0-693.11.6.el7.x86\_64  | ext4         |
| 172.16.31.10 | CentOS 7.4.1708 64bit  | 3.10.0-693.11.6.el7.x86\_64  | ext4         |

2. Hardware Information

| Category       |  Name                                                |
|------------|------------------------------------------------------|
| CPU        | 40 vCPUs, Intel(R) Xeon(R) CPU E5-2630 v4 @ 2.20GHz  |
| Memory       | 128GB, 8 x 16GB RDIMM, 2400MT/s, Dual-inline, x8 Bandwidth        |
| Disk       | 2 Intel P4500 series 4T SSD Hard Disks                    |
| Network Interface       | 10 Gigabit Network Interface                                             |

### TPC-H

[tidb-bench/tpch](https://github.com/pingcap/tidb-bench/tree/master/tpch)

### Cluster Topology

| Machine IP      | Deployed Instances |
|--------------|------------|
| 172.16.31.2  | TiKV \* 2  |
| 172.16.31.3  | TiKV \* 2  |
| 172.16.31.6  | TiKV \* 2  |
| 172.16.31.8  | TiKV \* 2  |
| 172.16.31.10 | TiKV \* 2  |
| 172.16.31.10 | PD \* 1    |
| 172.16.31.4  | TiDB \* 1  |

### TiDB Version Information

TiDB 1.0：

| Component Name | Version Number      | commit hash                                |
|--------|-------------|--------------------------------------------|
| TiDB   | v1.0.9      | 4c7ee3580cd0a69319b2c0c08abdc59900df7344   |
| TiKV   | v1.0.8      | 2bb923a4cd23dbf68f0d16169fd526dc5c1a9f4a   |
| PD     | v1.0.8      | 137fa734472a76c509fbfd9cb9bc6d0dc804a3b7   |

TiDB 2.0：

| Component Name | Version Number      | commit hash                                |
|--------|-------------|--------------------------------------------|
| TiDB   | v2.0.0-rc.6 | 82d35f1b7f9047c478f4e1e82aa0002abc8107e7   |
| TiKV   | v2.0.0-rc.6 | 8bd5c54966c6ef42578a27519bce4915c5b0c81f   |
| PD     | v2.0.0-rc.6 | 9b824d288126173a61ce7d51a71fc4cb12360201   |

## Test Results

| Query ID  | TiDB 2.0           | TiDB 1.0         |
|-----------|--------------------|------------------|
| 1         | 33.915s            | 215.305s         |
| 2         | 25.575s            | NaN              |
| 3         | 59.631s            | 196.003s         |
| 4         | 30.234s            | 249.919s         |
| 5         | 31.666s            | OOM              |
| 6         | 13.111s            | 118.709s         |
| 7         | 31.710s            | OOM              |
| 8         | 31.734s            | 800.546s         |
| 9         | 34.211s            | 630.639s         |
| 10        | 30.774s            | 133.547s         |
| 11        | 27.692s            | 78.026s          |
| 12        | 27.962s            | 124.641s         |
| 13        | 27.676s            | 174.695s         |
| 14        | 19.676s            | 110.602s         |
| 15        | View Required      | View Required    |
| 16        | 24.890s            | 40.529s          |
| 17        | 245.796s           | NaN              |
| 18        | 91.256s            | OOM              |
| 19        | 37.615s            | NaN              |
| 20        | 44.167s            | 212.201s         |
| 21        | 31.466s            | OOM              |
| 22        | 31.539s            | 125.471s         |

![tpch1](../../../../image/TiDB/tpch-1.png)

Description:

- In the figure, orange color presents Release 1.0 and blue color presents Release 2.0; vertical coordinate presents processing time of Query, which is the lower, the better
- For Query 15, the results are marked as "View Required because both version 1.0 and version 2.0 do not support view"
- For Query 2, 17 and 19, the results are marked as "Nan because no results were generated within the period by TiDB version 1.0"
- For Query 5, 7, 18 and 21, the results are marked as "OOM because TiDB version 1.0 was killed by oom-killer due to excessive memory usage in running process"
