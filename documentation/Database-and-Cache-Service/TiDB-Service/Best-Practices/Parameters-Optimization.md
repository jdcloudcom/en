# Optimize TiKV Performance Parameters

This document describes how to adjust the parameters of TiKV according to machine configuration, to optimize the performance of TiKV.

The bottom tier of TiKV uses RocksDB as persistent storage, so many of TiKV's performance-related parameters are related to RocksDB. TiKV uses two RocksDB instances. By default, RocksDB instance stores KV data, and the Raft RocksDB instance (referred to as RaftDB) stores Raft data.

TiKV uses the `Column Families` feature of RocksDB.

- By default, RocksDB instance stores KV data in the three CFs of internal `default`, `write` and `lock`.

    - `default` CF stores the real data and its corresponding parameters are in`[rocksdb.defaultcf]`;
    - `write` CF stores the version information (MVCC) of the data and index-related data, with the relevant parameters in `[rocksdb.writecf]`;
    - `lock` CF stores the lock information, and the system uses default parameters.

- Raft RocksDB instance stores Raft log.
    
    - `default` CF mainly stores Raft log, and its corresponding parameters are in`[raftdb.defaultcf].

Each CF has a separate `block-cache`, which is used to cache data blocks, to speed up the read speed of RocksDB. The size of block-cache is controlled by the parameter `block-cache-size`. The larger the block-cache-size is, the more hot data can be cached which is better for the operation of reading, and more system memory is occupied, too.

Each CF has its own `write-buffer`, the size of which can be controlled by `write-buffer-size`.

## Parameter Description

```toml
# Log Level. Optional values are trace, debug, info, warn, error and off
log-level = "info"

[server]
# Monitoring Address
# addr = "127.0.0.1:20160"

# It is recommended to use default values
# notify-capacity = 40960
# messages-per-tick = 4096

# Size of gRPC Thread Pool
# grpc-concurrency = 4
# The number of gRPC connections between every two instances of TiKV
# grpc-raft-conn-num = 10

# Most read requests from TiDB are sent to the coprocessor of TiKV for processing, and this parameter is used to set
# the number of coprocessor threads. If there are relatively more read requests in the business, increase the number of coprocessor threads, but which should be
# less than the number of CPU cores. E.g: The machine where TiKV is located has 32 cores, and in the re-read scenario, this parameter can be set to 30. If
# this parameter is not set, TiKV will automatically set the value to the number of total CPU cores multiplied by 0.8.
# end-point-concurrency = 8

# TiKV instances can be tagged for scheduling of replicas.
# labels = {zone = "cn-east-1", host = "118", disk = "ssd"}

[storage]
# Data Directory
# data-dir = "/tmp/tikv/store"

# Usually, you can use default values. In case of importing data, it is recommended to set the parameter to 1024000.
# scheduler-concurrency = 102400
# This parameter controls the number of write threads, which needs to be enlarged when the write operation is frequent. Use top -H -p tikv-pid
# to find that threads named sched-worker-pool are all particularly busy, and at this point you need to
# enlarge the parameter of schedule-worker-pool-size and increase the number of write threads.
# scheduler-worker-pool-size = 4

[pd]
# Address of pd
# endpoints = ["127.0.0.1:2379","127.0.0.2:2379","127.0.0.3:2379"]

[metric]
# Time interval between every two operations of pushing metrics to Prometheus pushgateway
interval = "15s"
# Address of Prometheus pushgateway
address = ""
job = "tikv"

[raftstore]
# The default is true, which means that the data is forced to be flushed to the disk. If it is a non-financial security level business scenario, it is recommended to be set to false,
# in order to achieve better performance.
sync-log = true

# Raft RocksDB Directory. The default value is the subdirectory of raft of [storage.data-dir].
# If you have multiple disks in your machine, you can store Raft RocksDB data in different disks to improve TiKV performance.
# raftdb-dir = "/tmp/tikv/store/raft"

region-max-size = "384MB"
# region Splitting Threshold
region-split-size = "256MB"
# When the amount of data written exceeds this threshold, TiKV will check whether the region needs to be split or not. In order to reduce the cost of scanning data
# during the inspection process, this value can be set to 32 MB in the data scanning process, which is advisable to be based on the default values in normal operation.
region-split-check-diff = "32MB"

[rocksdb]
# The maximum number of threads for RocksDB to carry out the background tasks which include compaction and flush. For the reason why RocksDB needs compaction,
# please refer to RocksDB's relevant information. It is recommended to start up more threads when write traffic is large (such as import data),
# but less than the number of CPU cores. For example, if a machine having 32 cores, the number of threads can be set to 28 when importing the data.
# max-background-jobs = 8

# The maximum number of file handles that RocksDB can open.
# max-open-files = 40960

# Limit of the size of RocksDB MANIFEST file. # For more detailed information, please refer to: https://github.com/facebook/rocksdb/wiki/MANIFEST
max-manifest-file-size = "20MB"

# RocksDB write-ahead logs Directory. If there are two disks in the machine, you can store the RocksDB data and the WAL log in
# different disks to improve TiKV performance.
# wal-dir = "/tmp/tikv/store"

# The following two parameters are used to handle how RocksDB are filed to WAL.
# For more detailed information, please refer to: https://github.com/facebook/rocksdb/wiki/How-to-persist-in-memory-RocksDB-database%3F
# wal-ttl-seconds = 0
# wal-size-limit = 0

# For the maximum total size of RocksDB WAL log, usually default values are used.
# max-total-wal-size = "4GB"

# The RocksDB can be opened or closed by this parameter.
# enable-statistics = true

# Open the pre-read function in the RocksDB compaction process. If you are using a mechanical disk, this value is recommended to be 2MB at least.
# compaction-readahead-size = "2MB"

[rocksdb.defaultcf]
# Size of Data Block. RocksDB compresses data in units of block, while block is in the smallest unit cached in
# the block-cache (similar to the concept of page in other databases), too.
block-size = "64KB"

# RocksDB the compression method of the data of each layer, and the optional values are no, snappy, zlib, bzip2, lz4, lz4hc and zstd.
# no:no:lz4:lz4:lz4:zstd:zstd denotes that level0 and level1 don’t need to be compressed, lz4 compression algorithm is used from level2 to level4,
# and zstd compression algorithm is used from level5 to level6.
# “no” means no compression, lz4 is a compression algorithm with moderate speed and compression ratio. The compression ratio of zlib is high which is
# more memory-friendly, but the compression speed is slow, and more CPU resources are occupied during compression. Different machines need to configure
# the compression method according to their CPU and I/O resources. E.g: Suppose that "no: lz4: lz4: lz4: zstd: zstd" compression method is used. When
# writing a large amount of data (import data), you find that the system I/O is under high pressure (using iostat to find that %util keeps 100% or
# using top command to find that iowait is particularly large) while the CPU resources are relatively abundant, you should consider starting to compress Level0 and
# level1, using CPU resources to exchange for I/O resources. Suppose that
# "no:no:lz4:lz4:lz4:zstd:zstd" compression method is used. When writing a large amount of data and the system I/O is not under high pressure while the CPU
# resources have been exhausted, and top-H finds a large number of bg-beginning threads (compaction threads of RocksDB) running,
# you should consider using I/Oresources to exchange for CPU resources, changing the compression method to "no:no:no:lz4:lz4:zstd:zstd". In a word,
# the purpose is to maximize the use of existing system resources, to fully exploit TiKV performance under the existing resources.
compression-per-level = ["no", "no", "lz4", "lz4", "lz4", "zstd", "zstd"]

# Size of RocksDB memtable.
write-buffer-size = "128MB"

# The maximum number of allowable memtable. The data to be written to RocksDB is firstly recorded in the WAL log, and then inserted into
# memtable. When the size of memtable reaches the limit specified by write-buffer-size, the current
# memtable becomes read-only, and a new memtable is generated to receive the new write. The read-only memtable is
# flushed to disk by the flush thread of RocksDB's (max-background-flushes parameter controls the maximum number of flush threads)
# and becomes an sst file of level0. When the flush threads are too busy, which leads the number of
# memtable waiting to be flushed to disk reaches the number limited number by max-write-buffer-number, RocksDB will stall the newly written ones.
# And stall is a flow control mechanism of RocksDB. When you import data, you can set the max-write-buffer-number
# value a bit larger, for example, 10.
max-write-buffer-number = 5

# When the number of sst files of level0 reaches the limit specified by level0-slowdown-writes-trigger,
# RocksDB will try to slow down the write speed, because too many sst files of level0 may cause the read of RocksDB to be amplified and increased.
# level0-slowdown-writes-trigger and level0-stop-writes-trigger are another manifestation
# of RocksDB's flow control. When the number of sst files of level0 reaches 4 (default),
# the sst files for level0 and sst files containing overlap of level1 will be compacted, to solve the problem of amplifying read.
level0-slowdown-writes-trigger = 20

# When the number of sst files for level0 reaches the limit specified by level0-stop-writes-trigger,
# RocksDB will stall the newly written ones.
level0-stop-writes-trigger = 36

# When the amount of data in level1 reaches the limit specified by the max-bytes-for-level-base, the compaction of sst files of level1
# and sst files containing overlap of level2 will be triggered.
# Golden Rule: The most important reference rule of setting max-bytes-for-level-base is to ensure that the data amount is approximately equal to the data amount of level0,
# which reduces unnecessary compaction. For example, if the compression method is "no:no:lz4:lz4:lz4:lz4:lz4", then
# the value of max-bytes-for-level-base is equal to the value of write-buffer-size multiplied by 4, because level0 and
# level1 both are not compressed and the condition to trigger the compaction is that the number of sst files reaches 4 (default). If
# level0 and level 1 both are compressed, then you need to analyze the RocksDB log, to see how large a memtable
# will be when compressed into an sst file. Taking 32MB as an example, then the suggested value of max-bytes-for-level-base is equal to
#32MB * 4 = 128MB.
max-bytes-for-level-base = "512MB"

# The size of sst file. The size of sst file of level0 is influenced by write-buffer-size and the compression algorithm used by level0.
# The target-file-size-base parameter is used to control the size of a single sst file for level1-level6.
target-file-size-base = "32MB"

# If not configuring this parameter, TiKV will set this value to 40% of the total system memory. If a single physical device needs to be deployed with multiple
# TiKV nodes, this parameter needs to be explicitly configured, otherwise TiKV is prone to OOM problems.
# block-cache-size = "1GB"

[rocksdb.writecf]
# Keep consistent with rocksdb.defaultcf.compression-per-level.
compression-per-level = ["no", "no", "lz4", "lz4", "lz4", "zstd", "zstd"]

# Keep consistent with rocksdb.defaultcf.write-buffer-size.
write-buffer-size = "128MB"
max-write-buffer-number = 5
min-write-buffer-number-to-merge = 1

# Keep consistent with rocksdb.defaultcf.max-bytes-for-level-base.
max-bytes-for-level-base = "512MB"
target-file-size-base = "32MB"

# If not configuring this parameter, TiKV will set this value to 15% of the total system memory. If a single physical device needs to be deployed with multiple
# TiKV nodes, it is necessary to to configure this parameter explicitly. Version information (MVCC) relevant data and indexes relevant data are all recorded in this cf of write.
# If the business table has more single-table indexes, this parameter can be set even bigger.
# block-cache-size = "256MB"

[raftdb]
# The maximum number of file handles that RaftDB can open.
# max-open-files = 40960

# Statistical information of RaftDB can be open or closed through this parameter.
# enable-statistics = true

# Open the pre-read function in the process of RaftDB compaction. If a mechanical disk is used, it is recommended that the value should be at least 2 MB.
# compaction-readahead-size = "2MB"

[raftdb.defaultcf]
# Keep consistent with rocksdb.defaultcf.compression-per-level.
compression-per-level = ["no", "no", "lz4", "lz4", "lz4", "zstd", "zstd"]

# Keep consistent with rocksdb.defaultcf.write-buffer-size.
write-buffer-size = "128MB"
max-write-buffer-number = 5
min-write-buffer-number-to-merge = 1

# Keep consistent with rocksdb.defaultcf.max-bytes-for-level-base.
max-bytes-for-level-base = "512MB"
target-file-size-base = "32MB"

# The normal configuration is around 256MB to 2GB. Default value would be fine in normal condition, while it can be adjusted to larger when the system resources are sufficient.
block-cache-size = "256MB"
```

## TiKV Memory Utilization

Besides, `block-cache` and `write-buffer` listed above will occupy system memory:

1.  It is necessary to reserve some memory as page cache of system
2.  TiKV can read data and then generate corresponding data structures in memory and reverse back to TiDB when processing large queries (e.g. `select * from ...`). TiKV of this process would occupy some memory.


## TiKV Machine Configuration Recommendation

1.  It is not recommended that TiKV can be deployed in the machine whose CPU core less than 8 or memory lower than 32 GB in the production environment.
2.  It is recommended that disks with better throughput should be used if the write throughput is relatively high.
3.  It is recommended that SSD disks with better IOPS be used if the latency for reading and writing is relatively high.

