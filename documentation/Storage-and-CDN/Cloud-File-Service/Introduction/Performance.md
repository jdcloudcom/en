# Product Performance

Performance parameters of Cloud File Service are shown as below:


| **Indicator**    | **Type**    | **min** |**Description**                        |
| ----------- | ----------- | ------- |------------------------------- |
| Bandwidth throughput    | write       | 50MB/s  |According to file system capacity, the rate of increase is 0.1MB/s * V(GB)             |
|             |  read       |  50MB/s   |According to file system capacity, the rate of increase is 0.1MB/s * V(GB)          |
| IOPS        | write       | 5000    | IO size is 4K                     |
|             |  read       |   5000   |                IO size is 4K     |
| Number of file operations  | file create | 100 pieces/s | Number of concurrent operations of single- and multiple-directory        |
|            | file delete    | 100 pieces/s | Number of concurrent operations of single- and multiple-directory                |
|            |  dir create    |100 pieces/s | Number of concurrent operations of single- and multiple-directory                 |
|            |  dir delete    |100 pieces/s | Number of concurrent operations of single- and multiple-directory               |
| Latency        | write       | 10ms    |IO size is 4K, latency under pressure |
|             |  read      | 10ms     |IO size is 4K, latency under pressure |
