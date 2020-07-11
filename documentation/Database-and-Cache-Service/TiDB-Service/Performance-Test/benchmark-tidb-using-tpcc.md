# : How to Conduct TPC-C Test for TiDB
> The document is from the official documents of PingCAP. Please refer to the official document of PingCAP for more details

The document specifies how to conduct the [TPC-C](http://www.tpc.org/tpcc/) test for TiDB.

## Preparation of Testing Procedure

TPC-C is a testing specification for OLTP (online transaction processing) system. When one commodity sales model is used for testing the OLTP system, the following five transactions are included:

* NewOrder – Production of new order
* Payment – Order payment
* OrderStatus – Latest order query
* Delivery – Delivery
* StockLevel – Stockout status analysis

Before testing, TPC-C Benchmark specifies the initial status of database, i.e., data production rules of database. The Table ITEM regularly contains 100,000 commodities, but warehouse number is adjustable. For example, if the Table WAREHOUSE contains W records, then:

* The Table STOCK shall contain W \* 100,000 records (each warehouse corresponds to stock data of 100,000 commodities)
* The Table DISTRICT shall contain W \* 10 records (each warehouse provides service to 10 districts)
* The Table CUSTOMER shall contain W \* 10 \* 3,000 records (each district has 3,000 customers)
* The Table HISTORY shall contain W \* 10 \* 3,000 records (one customer has one transaction history)
* The Table ORDER shall have W \* 10 \* 3,000 records (3,000 orders per district), with the last produced 900 orders added to the Table NEW-ORDER and 5~15 ORDER-LINE records produced per order at random.

We are going to test the 1,000 WAREHOUSES.

TPC-C uses the value tpmC (Transactions per Minute) to measure the Max Qualified Throughput (MQTh), with Transactions subject to NewOrder Transaction. In other words, the final measurement unit is new order transactions processed per minute.

The documents uses the open source BenchmarkSQL 5.0 for TPC-C testing, thus realizing and adding support to the MySQL protocol. The testing procedures can be downloaded via commands below:

```shell
git clone -b 5.0-mysql-support-opt-2.1 https://github.com/pingcap/benchmarksql.git
```

Install java and ant. Taking CentOS for example, the following commands shall be executed for installation

```shell
sudo yum install -y java ant
```

Enter the benchmarksql directory and execute ant establishment

```shell
cd benchmarksql
ant
```

## Deploy TiDB Cluster

For 1,000 WAREHOUSES, clusters are deployed on 3 servers.

If 3 servers are available, it is suggested 1 TiDB, 1 PD and 1 TiKV instance shall be deployed for one machine.

For example, the hardware configuration of machine is as follows:

| Type | Name |
| :-: | :-: |
| OS | Linux (CentOS 7.3.1611) |
| CPU | 40 vCPUs, Intel(R) Xeon(R) CPU E5-2630 v4 @ 2.20GHz |
| RAM | 128GB |
| DISK | Optane 500GB SSD |

As the CPU model uses the NUMA architecture, it is suggested to set affinity with `numactl`.

1. [Install numactl Tool](https://docs.pingcap.com/zh/tidb/v4.0/check-before-deployment#install-numactl-too) .

2. View NUMA node with `lscpu`, for example:

    ```text
    NUMA node0 CPU(s):     0,2,4,6,8,10,12,14,16,18,20,22,24,26,28,30,32,34,36,38
    NUMA node1 CPU(s):     1,3,5,7,9,11,13,15,17,19,21,23,25,27,29,31,33,35,37,39
    ```

3. Start the script by modifying `{tidb_deploy_path}/scripts/run_tidb.sh` and add `numactl` to start TiDB:

    ```text
    #!/bin/bash
    set -e

    ulimit -n 1000000

    # WARNING: This file was auto-generated. Do not edit!
    #          All your edit might be overwritten!
    DEPLOY_DIR=/home/damon/deploy/tidb1-1

    cd "${DEPLOY_DIR}" || exit 1

    export TZ=Asia/Shanghai

    # Different cpunodebinds and membinds shall be designated for TiDB instances of the same machine. To associate different Numa nodes
    exec numactl --cpunodebind=0  --membind=0 bin/tidb-server \
        -P 4111 \
        --status="10191" \
        --advertise-address="172.16.4.53" \
        --path="172.16.4.10:2490" \
        --config=conf/tidb.toml \
        --log-slow-query="/home/damon/deploy/tidb1-1/log/tidb_slow_query.log" \
        --log-file="/home/damon/deploy/tidb1-1/log/tidb.log" 2>> "/home/damon/deploy/tidb1-1/log/tidb_stderr.log"
    ```

    > ** Note:**
    >
    > The directly modified `run_tidb.sh` may be replaced. Therefore, if there are affinity setting demands in the production environment, it is suggested to do so by using TiUP.

4. One HAproxy is selected and deployed to conduct load balance for multiple TiDB nodes and the recommended configuration nbproc is the CPU core number.

## Configuration Adjustment

### TiDB Configuration

```toml
[log]
level = "error"

[performance]
# Set the maximum CPU cores available for use according to the NUMA configuration
max-procs = 20

[prepared_plan_cache]
# Enable prepared plan cache in TiDB configuration, so as to reduce expense incurred by optimizing the execution schedule
enabled = true
```

### TiKV Configuration

At the beginning, basic configuration can be used. After pressure test, adjustment can be made by observing Grafana and refer to [Adjustment and Optimization Instruction to TiKV Thread Pool](https://docs.pingcap.com/zh/tidb/v4.0/tune-tikv-thread-performance).

### BenchmarkSQL Configuration

Modify `benchmarksql/run/props.mysql`:

```text
conn=jdbc:mysql://{HAPROXY-HOST}:{HAPROXY-PORT}/tpcc?useSSL=false&useServerPrepStmts=true&useConfigs=maxPerformance
warehouses=1000 # uses 1,000 warehouses
terminals=500   # Use 500 terminals
loadWorkers=32  # Import data concurrency number
```

## Data Import

**Generally, data import is the stage which consumes the most time and fails most likely in the entire TPC-C testing process.**

At first, the MySQL client is connected to TiDB-Server and then executed:

```sql
create database tpcc
```

Then, BenchmarkSQL is run in shell and table scripts are built:

```shell
cd run && \
./runSQL.sh props.mysql sql.mysql/tableCreates.sql && \
./runSQL.sh props.mysql sql.mysql/indexCreates.sql
```

### Import directly with BenchmarkSQL

Run imported data scripts:

```shell
./runLoader.sh props.mysql
```

The process may last for hours, depending on machine configuration.

### Import via TiDB Lightning

As imported data volume increases with growth of warehouse, when it needs to import more than 1,000 warehouse data, please product csv files with BenchmarkSQL at first and then quickly import such data through TiDB Lightning (hereinafter referred to as lightning) by virtual of such files. Produced csv files can be reused for several times, saving time required by each production.

#### Modify configuration file of BenchmarkSQL

1. The csv files in warehouse require 77 MB disk spaces. Before production, please assign sufficient disk space according to demands for saving csv files. One row can be added in the `benchmarksql/run/props.mysql` file:

```text
fileLocation=/home/user/csv//  # The absolute path for storing directory of csv file shall have sufficient space
```

As Lightning is finally used for importing data, the csv file name shall preferably comply with Lighting requirements, i.e., naming method of `{database}.{table}.csv`. The above configuration can be changed here:

```text
fileLocation=/home/user/csv/tpcc.  # Absolute path for storing directory of csv file + file name prefix (database)
```

The csv file name produced in this way is similar to the pattern of `tpcc.bmsql_warehouse.csv` and complies with requirements of Lightning.

#### Produce csv files

```shell
./runLoader.sh props.mysql
```

#### Import via Lightning

For data import via Lightning, please refer to the section [Execute Lightning Deployment](https://docs.pingcap.com/zh/tidb/v4.0/deploy-tidb-lightning). The method of deploying Lightning import data via TiDB Ansible is introduced below.

##### Modify inventory.ini

You had better to manually designate IP, port and directory which are clearly deployed, to avoid exceptions caused by various conflicts. For disc space of import_dir, please refer to [Lightning Deployment Execution](https://docs.pingcap.com/zh/tidb/v4.0/deploy-tidb-lightning), and data_source_dir is the directory used for storing data of csv specified in last section.

```ini
[importer_server]
IS1 ansible_host=172.16.5.34 deploy_dir=/data2/is1 tikv_importer_port=13323 import_dir=/data2/import

[lightning_server]
LS1 ansible_host=172.16.5.34 deploy_dir=/data2/ls1 tidb_lightning_pprof_port=23323 data_source_dir=/home/user/csv
```

##### Modify conf/tidb-lightning.yml

```yaml
mydumper:
    no-schema: true
    csv:
        separator: ','
        delimiter: ''
        header: false
        not-null: false
        'null': 'NULL'
        backslash-escape: true
        trim-last-separator: false
```

##### Deploy Lightning and Importer

```shell
ansible-playbook deploy.yml --tags=lightning
```

##### Start

* Log in servers where Lightning and Importer are deployed
* Log in deployment directory
* Execute `scripts/start_importer.sh` under the Importer directory and start Importer
* Execute `scripts/start_lightning.sh` under the Lightning directory and start to import data

As TiDB Ansible is used for deployment, import progress of Lightning can be viewed on the monitoring page or a log is used for checking if the import process is ended.

### After completion of import

After the data import is completed, you can run `sql.common/test.sql` to verify data correctness. If return results of all SQL sentences are null, the data testing process is correct.

## Operation Test

Execute BenchmarkSQL testing script:

```shell
nohup ./runBenchmark.sh props.mysql &> test.log &
```

View results via `test.log` after the running is ended:

```text
07:09:53,455 [Thread-351] INFO   jTPCC : Term-00, Measured tpmC (NewOrders) = 77373.25
07:09:53,455 [Thread-351] INFO   jTPCC : Term-00, Measured tpmTOTAL = 171959.88
07:09:53,455 [Thread-351] INFO   jTPCC : Term-00, Session Start     = 2019-03-21 07:07:52
07:09:53,456 [Thread-351] INFO   jTPCC : Term-00, Session End       = 2019-03-21 07:09:53
07:09:53,456 [Thread-351] INFO   jTPCC : Term-00, Transaction Count = 345240
```

The tpmC part is the test result.

After the testing is completed, you can also run `sql.common/test.sql` to verify data correctness. If return results of all SQL sentences are null, the data testing process is correct.
