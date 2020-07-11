
# How to Test TiDB with Sysbench
> Testing methods and testing data in the document are from official documents of PingCap. Users can conduct their own performance tests while planning and deploying by referring to testing schemes of the document.

TiDB 3.0 Beta and Sysbench 1.0.14 are used for this test. It is suggested to use Sysbench 1.0 or higher update version, which can be downloaded on the [Sysbench Release 1.0.14 Page](https://github.com/akopytov/sysbench/releases/tag/1.0.14).

## Test Environment

- [Hardware Requirement](https://docs.pingcap.com/zh/tidb/v4.0/hardware-and-software-requirements)

- Refer to [TiDB Deployment Document](https://pingcap.com/docs-cn/v3.0/how-to/deploy/orchestrated/ansible/) for TiDB cluster deployment. If 3 servers are available, it is suggested 1 TiDB, 1 PD and 1 TiKV instance shall be deployed for one machine. For disks, taking 32 tables and 10M line data per table for example, it is suggested that the disk space where data directory of TiKV is located is greater than 512 GB.
    It is suggested to control the concurrent connections per single TiDB within 500. If you need to increase the concurrent pressure of the whole system, you can increase TiDB instances. The specific increase number of TiDB is subject to the testing pressure.

IDC machine:

| Type | Name |
|:---- |:---- |
| OS | Linux (CentOS 7.3.1611) |
| CPU | 40 vCPUs, Intel® Xeon® CPU E5-2630 v4 @ 2.20GHz |
| RAM | 128GB |
| DISK | Intel Optane SSD P4800X 375G * 1 |
| NIC | 10Gb Ethernet |

## Testing Scheme

### TiDB Version Information

| Component | GitHash |
|:---- |:---- |
| TiDB | 7a240818d19ae96e4165af9ea35df92466f59ce6 |
| TiKV | e26ceadcdfe94fb6ff83b5abb614ea3115394bcd |
| PD | 5e81548c3c1a1adab056d977e7767307a39ecb70 |

### Cluster Topology

| Machine IP | Deployment Instance |
|:---- |:---- |
| 172.16.30.31 | 3*sysbench |
| 172.16.30.33 | 1\*tidb 1\*pd 1\*tikv |
| 172.16.30.34 | 1\*tidb 1\*pd 1\*tikv |
| 172.16.30.35 | 1\*tidb 1\*pd 1\*tikv |

### TiDB Configuration

Increasing log level can reduce number of logs to be printed and has positive influence to TiDB performance. Enable `prepared plan cache` in TiDB configuration, so as to reduce expense incurred by optimizing the execution schedule. Specifically, the following items will be added to TiDB configuration files:

```toml
[log]
level = "error"
[prepared-plan-cache]
enabled = true
```

### TiKV Configuration

Increasing log level of TiKV is also beneficial to improve performance.

As TiKV is deployed in the cluster form, it is certain that most nodes are written in data under the function of the Raft algorithm. Therefore, apart from scenarios which are extremely sensitive to data security, the option `sync-log` in raftstore can be disabled.

The TiKV cluster has two Column Families (Default CF and Write CF), which are mainly used for storing different data types. For the Sysbench test, the proportion of Column Family of imported data to the TiDB cluster is fixed. The proportion is as follows:

Default CF : Write CF = 4 : 1

It needs to configure block cache of RocksDB in TiKV according to memory size of the machine, in order to fully make use of the memory. Taking deployment of one TiKV on a virtual machine with a 40 GB memory for example, it is suggested that its block cache shall be configured as follows:

```toml
log-level = "error"
[raftstore]
sync-log = false
[rocksdb.defaultcf]
block-cache-size = "24GB"
[rocksdb.writecf]
block-cache-size = "6GB"
```

For 3.0 and higher versions, setting can be made by sharing block cache.

```toml
log-level = "error"
[raftstore]
sync-log = false
[storage.block-cache]
capacity = "30GB"
```

For adjustment and optimization details of TiKV parameters, please refer to [TiKV Memory Parameter Performance Adjustment and Optimization](https://docs.pingcap.com/zh/tidb/v4.0/tune-tikv-memory-performance).

## Testing Process

> ** Note:**
>
> In this test, Load Balancer tools such as HAproxy are not used. Carry out the Sysbench test for a single node of TiDB and add the results. The Load Balancer tool and parameters of different versions also will affect performance.

### Sysbench Configuration

Taking Sysbench configuration files for example:

```txt
mysql-host={TIDB_HOST}
mysql-port=4000
mysql-user=root
mysql-password=password
mysql-db=sbtest
time=600
threads={8, 16, 32, 64, 128, 256}
report-interval=10
db-driver=mysql
```

Their parameters can be adjusted according to real demands, wherein `TIDB_HOST` is the IP address of TiDB server (multiple addresses cannot be written in the configuration files) and `threads` refer to the concurrency number during testing. The adjustment can be made among "8, 16, 32, 64, 128 or 256". When data are imported, the setting of threads = 8 or 16 is suggested. After adjustment, the file is saves at the file in the name of **config**.

**Reference examples of configuration files** are as shown below:

```txt
mysql-host=172.16.30.33
mysql-port=4000
mysql-user=root
mysql-password=password
mysql-db=sbtest
time=600
threads=16
report-interval=10
db-driver=mysql
```

### Data Import

Before importing data, simple setting shall be made to TiDB. Execute commands at the MySQL client:

{{< copyable "sql" >}}

```sql
set global tidb_disable_txn_auto_retry = off;
```

Then, log out the client. TiDB uses the optimistic transaction model. In case that a concurrent conflict is discovered, transactions will be rolled back. If `tidb_disable_txn_auto_retry` is set as `off`, the automatic retry mechanism will be enabled after transaction conflict and the problem that the Sysbench program is logged out due to transaction conflict error can be avoided as much as possible.

Restart the MySQL client, carry out the following SQL sentences and create the database `sbtest`:

{{< copyable "sql" >}}

```sql
create database sbtest;
```

Adjust the Sysbench script to create index sequence. For Sysbench, data are imported as per the sequence of "Establish a table->Insert data->Create index". For TiDB, the method requires more import time. Users can accelerate data import by adjusting the sequence.

Suppose the user uses the [Sysbench](https://github.com/akopytov/sysbench/tree/1.0.14) version. We can make modification via the two methods below.

1. Directly download the [oltp_common.lua](https://raw.githubusercontent.com/pingcap/tidb-bench/master/sysbench/sysbench-patch/oltp_common.lua) file modified with TiDB and replace the `/usr/share/sysbench/oltp_common.lua` file.
2. Move the [235th](https://github.com/akopytov/sysbench/blob/1.0.14/src/lua/oltp_common.lua#L235) line to the [240th](https://github.com/akopytov/sysbench/blob/1.0.14/src/lua/oltp_common.lua#L240) line of `/usr/share/sysbench/oltp_common.lua` behind the 198th line.

> ** Note:**
>
> This operation is optional, which saves data import time only.

Enter the following commands below in the command line, start to import data and adopt the file configured in the last step in the config file:

{{< copyable "shell-regular" >}}

```bash
sysbench --config-file=config oltp_point_select --tables=32 --table-size=10000000 prepare
```

### Data Pre-heating and Statistic Information Collection

With data preheating, data in disks can be loaded into block cache of memory. After preheating, the overall system performance will be greatly improved. It is suggested that data preheating is conducted once per cluster rebooting.

As Sysbench 1.0.14 does not provide data warm-up function, the data shall be warmed up manually. If the updated Sysbench version is used, the built-in warm-up function shall be applied.

Taking the Table sbtest7 in Sysbench for example, execute the following SQL sentence below for data preheating:

{{< copyable "sql" >}}

```sql
SELECT COUNT(pad) FROM sbtest7 USE INDEX (k_7);
```

Collecting statistic information is conducive to select a more accurate execution schedule by the optimizer. Statistic information in the Table sbtest can be collected via the command `analyze` and information of each table shall be counted.

{{< copyable "sql" >}}

```sql
ANALYZE TABLE sbtest7;
```

### Point select Testing Command

{{< copyable "shell-regular" >}}

```bash
sysbench --config-file=config oltp_point_select --tables=32 --table-size=10000000 run
```

### Update index Testing Command

{{< copyable "shell-regular" >}}

```bash
sysbench --config-file=config oltp_update_index --tables=32 --table-size=10000000 run
```

### Read-only Testing Command

{{< copyable "shell-regular" >}}

```bash
sysbench --config-file=config oltp_read_only --tables=32 --table-size=10000000 run
```

## Testing Result

32 data tables are tested, each of which contains 10M data.

Carry out the Sysbench test for each tidb-server, add the testing results together to obtain the final result:

### oltp_point_select

| Type | Thread | TPS | QPS | avg.latency(ms) | .95.latency(ms) | max.latency(ms) |
|:---- |:---- |:---- |:---- |:----------------|:----------------- |:---- |
| point_select | 3\*8 | 67502.55 | 67502.55 | 0.36 | 0.42 | 141.92 |
| point_select | 3\*16 | 120141.84 | 120141.84 | 0.40 | 0.52 | 20.99 |
| point_select | 3\*32 | 170142.92 | 170142.92 | 0.58 | 0.99 | 28.08 |
| point_select | 3\*64 | 195218.54 | 195218.54 | 0.98 | 2.14 | 21.82 |
| point_select | 3\*128 | 208189.53 | 208189.53 | 1.84 | 4.33 | 31.02 |

![oltp_point_select](../../../../image/TiDB/oltp_point_select.png)

### oltp_update_index

| Type | Thread | TPS | QPS | avg.latency(ms) | .95.latency(ms) | max.latency(ms) |
|:---- |:---- |:---- |:---- |:----------------|:----------------- |:---- |
| oltp_update_index | 3\*8 | 9668.98 | 9668.98 | 2.51 | 3.19 | 103.88|
| oltp_update_index | 3\*16 | 12834.99 | 12834.99 | 3.79 | 5.47 | 176.90 |
| oltp_update_index | 3\*32 | 15955.77 | 15955.77 | 6.07 | 9.39 | 4787.14 |
| oltp_update_index | 3\*64 | 18697.17 | 18697.17 | 10.34 | 17.63 | 4539.04 |
| oltp_update_index | 3\*128 | 20446.81 | 20446.81 | 18.98 | 40.37 | 5394.75 |
| oltp_update_index | 3\*256 | 23563.03 | 23563.03 | 32.86 | 78.60 | 5530.69 |

![oltp_update_index](../../../../image/TiDB/oltp_update_index.png)

### oltp_read_only

| Type | Thread | TPS | QPS | avg.latency(ms) | .95.latency(ms) | max.latency(ms) |
|:---- |:---- |:---- |:---- |:----------------|:----------------- |:---- |
| oltp_read_only | 3\*8 | 2411.00 | 38575.96 | 9.92 | 20.00 | 92.23 |
| oltp_read_only | 3\*16 | 3873.53 | 61976.50 | 12.25 | 16.12 | 56.94 |
| oltp_read_only | 3\*32 | 5066.88 | 81070.16 | 19.42 | 26.20 | 123.41 |
| oltp_read_only | 3\*64 | 5466.36 | 87461.81 | 34.65 | 63.20 | 231.19 |
| oltp_read_only | 3\*128 | 6684.16 | 106946.59 | 57.29 | 97.55 | 180.85 |

![oltp_read_only](../../../../image/TiDB/oltp_read_only.png)

## FAQ

### Why the overall performance is very low when configurations of TiDB and TiKV are reasonable under the high concurrent pressure?

Probably, this is because proxy is used. Attempts can be made to put pressure on a single TiDB and compare the sum results with conditions of using proxy.

Taking HAproxy as an example, the parameter `nbproc` can increase the maximum starting process number, and HAproxy of latest versions also support `nbthread`, `cpu-map`, etc. These also can reduce adverse influence to its performance.

### Why CPU utilization rate of TiKV is still very low under high concurrent pressure?

Although CPU utilization rate of TiKV is very low as a whole, the CPU utilization rate of some modules is very high.

The maximum concurrency restriction of other modules of TiKV, such as storage readpool, coprocessor and gRPC, can be adjusted via configuration files of TiKV.

Their actual utilization rate can be observed via the TiKV Thread CPU monitoring panel of Grafana. In case of multi-thread module bottle neck, the concurrency can be adjusted by increase concurrency of this module.

### Why TiDB CPU utilization rate is still very low if TiKV does not reach CPU utilization bottle neck under high concurrent pressure?

As some high-end devices use the CPU of NUMA architecture, performance will be greatly degraded if remote memories are accessed across CPUs. By default, TiDB will use all CPUs of a server and the goroutine schedule unavoidably will access memories of different CPUs.

Therefore, it is suggested that *n* TiDB shall be deployed on the server of NUMA architecture (*n* = number of NUMA CPU), and `max-procs` variable value of TiDB shall be set as the same as core number of NUMA CPU.
