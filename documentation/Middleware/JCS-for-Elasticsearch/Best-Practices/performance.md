## Performance Indicator Test Result

For different specifications of JCS for Elasticsearch, test results are listed below for reference:

* [Performance Test Data of Three 2-core 8G Nodes](performance#user-content-1)
* [Performance Test Data of Three 4-core 16G Nodes](performance#user-content-2)
* [Comparison Result of Two Performance Tests](performance#user-content-3)

### Performance Test Data of Three 2-core 8G Nodes
<div id="user-content-1"></div>

|   Lap |                               Metric |                   Task |       Value |    Unit |
|------:|-------------------------------------:|-----------------------:|------------:|--------:|
|   All |                  Total indexing time |                        |      30.552 |     min |
|   All |          Min indexing time per shard |                        | 0.000616667 |     min |
|   All |       Median indexing time per shard |                        |     4.13957 |     min |
|   All |          Max indexing time per shard |                        |     9.49823 |     min |
|   All |                     Total merge time |                        |     16.5894 |     min |
|   All |             Min merge time per shard |                        |           0 |     min |
|   All |          Median merge time per shard |                        |     2.55336 |     min |
|   All |             Max merge time per shard |                        |     4.83708 |     min |
|   All |            Total merge throttle time |                        |      1.4114 |     min |
|   All |    Min merge throttle time per shard |                        |           0 |     min |
|   All | Median merge throttle time per shard |                        |     0.25795 |     min |
|   All |    Max merge throttle time per shard |                        |    0.325433 |     min |
|   All |                   Total refresh time |                        |     6.59383 |     min |
|   All |           Min refresh time per shard |                        | 0.000816667 |     min |
|   All |        Median refresh time per shard |                        |      0.9831 |     min |
|   All |           Max refresh time per shard |                        |     1.95182 |     min |
|   All |                     Total flush time |                        |    0.282533 |     min |
|   All |             Min flush time per shard |                        | 0.000266667 |     min |
|   All |          Median flush time per shard |                        |      0.0547 |     min |
|   All |             Max flush time per shard |                        |      0.0627 |     min |
|   All |                   Total Young Gen GC |                        |      200.74 |       s |
|   All |                     Total Old Gen GC |                        |       1.792 |       s |
|   All |                           Store size |                        |     3.17049 |      GB |
|   All |                        Translog size |                        | 2.80328e-07 |      GB |
|   All |               Heap used for segments |                        |     18.1484 |      MB |
|   All |             Heap used for doc values |                        |    0.097908 |      MB |
|   All |                  Heap used for terms |                        |     16.9487 |      MB |
|   All |                  Heap used for norms |                        |   0.0726929 |      MB |
|   All |                 Heap used for points |                        |    0.216206 |      MB |
|   All |          Heap used for stored fields |                        |    0.812965 |      MB |
|   All |                        Segment count |                        |          96 |         |
|   All |                       Min Throughput |           index-append |       18145 |  docs/s |
|   All |                    Median Throughput |           index-append |     18820.2 |  docs/s |
|   All |                       Max Throughput |           index-append |     19774.6 |  docs/s |
|   All |              50th percentile latency |           index-append |     2041.05 |      ms |
|   All |              90th percentile latency |           index-append |     2792.47 |      ms |
|   All |              99th percentile latency |           index-append |     3716.86 |      ms |
|   All |            99.9th percentile latency |           index-append |     4291.14 |      ms |
|   All |             100th percentile latency |           index-append |     4428.68 |      ms |
|   All |         50th percentile service time |           index-append |     2041.05 |      ms |
|   All |         90th percentile service time |           index-append |     2792.47 |      ms |
|   All |         99th percentile service time |           index-append |     3716.86 |      ms |
|   All |       99.9th percentile service time |           index-append |     4291.14 |      ms |
|   All |        100th percentile service time |           index-append |     4428.68 |      ms |
|   All |                           error rate |           index-append |           0 |       % |
|   All |                       Min Throughput |            index-stats |      100.03 |   ops/s |
|   All |                    Median Throughput |            index-stats |      100.07 |   ops/s |
|   All |                       Max Throughput |            index-stats |      100.14 |   ops/s |
|   All |              50th percentile latency |            index-stats |     2.40418 |      ms |
|   All |              90th percentile latency |            index-stats |     3.28969 |      ms |
|   All |              99th percentile latency |            index-stats |      14.018 |      ms |
|   All |            99.9th percentile latency |            index-stats |     22.3686 |      ms |
|   All |             100th percentile latency |            index-stats |     24.6219 |      ms |
|   All |         50th percentile service time |            index-stats |     2.25166 |      ms |
|   All |         90th percentile service time |            index-stats |     3.03377 |      ms |
|   All |         99th percentile service time |            index-stats |     10.3106 |      ms |
|   All |       99.9th percentile service time |            index-stats |     22.1934 |      ms |
|   All |        100th percentile service time |            index-stats |     24.4795 |      ms |
|   All |                           error rate |            index-stats |           0 |       % |
|   All |                       Min Throughput |             node-stats |       99.19 |   ops/s |
|   All |                    Median Throughput |             node-stats |      100.14 |   ops/s |
|   All |                       Max Throughput |             node-stats |      100.76 |   ops/s |
|   All |              50th percentile latency |             node-stats |     2.78576 |      ms |
|   All |              90th percentile latency |             node-stats |     57.8865 |      ms |
|   All |              99th percentile latency |             node-stats |     124.952 |      ms |
|   All |            99.9th percentile latency |             node-stats |     179.015 |      ms |
|   All |             100th percentile latency |             node-stats |     185.806 |      ms |
|   All |         50th percentile service time |             node-stats |     2.53587 |      ms |
|   All |         90th percentile service time |             node-stats |     4.43647 |      ms |
|   All |         99th percentile service time |             node-stats |     71.4676 |      ms |
|   All |       99.9th percentile service time |             node-stats |       105.7 |      ms |
|   All |        100th percentile service time |             node-stats |     107.373 |      ms |
|   All |                           error rate |             node-stats |           0 |       % |
|   All |                       Min Throughput |                default |       24.78 |   ops/s |
|   All |                    Median Throughput |                default |       24.86 |   ops/s |
|   All |                       Max Throughput |                default |       25.36 |   ops/s |
|   All |              50th percentile latency |                default |     20245.4 |      ms |
|   All |              90th percentile latency |                default |     28478.9 |      ms |
|   All |              99th percentile latency |                default |     30327.1 |      ms |
|   All |            99.9th percentile latency |                default |     30494.6 |      ms |
|   All |             100th percentile latency |                default |     30515.1 |      ms |
|   All |         50th percentile service time |                default |     39.7821 |      ms |
|   All |         90th percentile service time |                default |     42.3616 |      ms |
|   All |         99th percentile service time |                default |     68.9103 |      ms |
|   All |       99.9th percentile service time |                default |     86.6771 |      ms |
|   All |        100th percentile service time |                default |     98.6355 |      ms |
|   All |                           error rate |                default |           0 |       % |
|   All |                       Min Throughput |                   term |      199.88 |   ops/s |
|   All |                    Median Throughput |                   term |       200.1 |   ops/s |
|   All |                       Max Throughput |                   term |       200.2 |   ops/s |
|   All |              50th percentile latency |                   term |     1.77077 |      ms |
|   All |              90th percentile latency |                   term |       3.274 |      ms |
|   All |              99th percentile latency |                   term |     13.5938 |      ms |
|   All |            99.9th percentile latency |                   term |     18.7991 |      ms |
|   All |             100th percentile latency |                   term |      21.992 |      ms |
|   All |         50th percentile service time |                   term |     1.67021 |      ms |
|   All |         90th percentile service time |                   term |     2.18404 |      ms |
|   All |         99th percentile service time |                   term |     8.68671 |      ms |
|   All |       99.9th percentile service time |                   term |     18.2481 |      ms |
|   All |        100th percentile service time |                   term |     21.9286 |      ms |
|   All |                           error rate |                   term |           0 |       % |
|   All |                       Min Throughput |                 phrase |      199.97 |   ops/s |
|   All |                    Median Throughput |                 phrase |      200.08 |   ops/s |
|   All |                       Max Throughput |                 phrase |      200.19 |   ops/s |
|   All |              50th percentile latency |                 phrase |      2.3951 |      ms |
|   All |              90th percentile latency |                 phrase |     6.60669 |      ms |
|   All |              99th percentile latency |                 phrase |     17.4791 |      ms |
|   All |            99.9th percentile latency |                 phrase |     22.7571 |      ms |
|   All |             100th percentile latency |                 phrase |     25.6412 |      ms |
|   All |         50th percentile service time |                 phrase |     2.25227 |      ms |
|   All |         90th percentile service time |                 phrase |     3.17436 |      ms |
|   All |         99th percentile service time |                 phrase |     13.4409 |      ms |
|   All |       99.9th percentile service time |                 phrase |     18.4939 |      ms |
|   All |        100th percentile service time |                 phrase |     21.6504 |      ms |
|   All |                           error rate |                 phrase |           0 |       % |
|   All |                       Min Throughput |   country_agg_uncached |        2.84 |   ops/s |
|   All |                    Median Throughput |   country_agg_uncached |        2.85 |   ops/s |
|   All |                       Max Throughput |   country_agg_uncached |        2.87 |   ops/s |
|   All |              50th percentile latency |   country_agg_uncached |       37897 |      ms |
|   All |              90th percentile latency |   country_agg_uncached |     44135.1 |      ms |
|   All |              99th percentile latency |   country_agg_uncached |     45503.2 |      ms |
|   All |             100th percentile latency |   country_agg_uncached |     45660.9 |      ms |
|   All |         50th percentile service time |   country_agg_uncached |      357.96 |      ms |
|   All |         90th percentile service time |   country_agg_uncached |     369.897 |      ms |
|   All |         99th percentile service time |   country_agg_uncached |     393.634 |      ms |
|   All |        100th percentile service time |   country_agg_uncached |     397.856 |      ms |
|   All |                           error rate |   country_agg_uncached |           0 |       % |
|   All |                       Min Throughput |     country_agg_cached |      100.04 |   ops/s |
|   All |                    Median Throughput |     country_agg_cached |      100.08 |   ops/s |
|   All |                       Max Throughput |     country_agg_cached |      100.16 |   ops/s |
|   All |              50th percentile latency |     country_agg_cached |     2.11152 |      ms |
|   All |              90th percentile latency |     country_agg_cached |     2.97139 |      ms |
|   All |              99th percentile latency |     country_agg_cached |     10.6774 |      ms |
|   All |            99.9th percentile latency |     country_agg_cached |     15.5726 |      ms |
|   All |             100th percentile latency |     country_agg_cached |     18.1987 |      ms |
|   All |         50th percentile service time |     country_agg_cached |      1.9665 |      ms |
|   All |         90th percentile service time |     country_agg_cached |     2.73417 |      ms |
|   All |         99th percentile service time |     country_agg_cached |       9.993 |      ms |
|   All |       99.9th percentile service time |     country_agg_cached |     15.4348 |      ms |
|   All |        100th percentile service time |     country_agg_cached |     18.0494 |      ms |
|   All |                           error rate |     country_agg_cached |           0 |       % |
|   All |                       Min Throughput |                 scroll |       25.04 | pages/s |
|   All |                    Median Throughput |                 scroll |       25.05 | pages/s |
|   All |                       Max Throughput |                 scroll |       25.07 | pages/s |
|   All |              50th percentile latency |                 scroll |     471.178 |      ms |
|   All |              90th percentile latency |                 scroll |     503.083 |      ms |
|   All |              99th percentile latency |                 scroll |       526.2 |      ms |
|   All |             100th percentile latency |                 scroll |      526.85 |      ms |
|   All |         50th percentile service time |                 scroll |     470.224 |      ms |
|   All |         90th percentile service time |                 scroll |      502.27 |      ms |
|   All |         99th percentile service time |                 scroll |     525.285 |      ms |
|   All |        100th percentile service time |                 scroll |     526.194 |      ms |
|   All |                           error rate |                 scroll |           0 |       % |
|   All |                       Min Throughput |             expression |        1.49 |   ops/s |
|   All |                    Median Throughput |             expression |         1.5 |   ops/s |
|   All |                       Max Throughput |             expression |         1.5 |   ops/s |
|   All |              50th percentile latency |             expression |     42320.9 |      ms |
|   All |              90th percentile latency |             expression |     49283.7 |      ms |
|   All |              99th percentile latency |             expression |     50784.3 |      ms |
|   All |             100th percentile latency |             expression |     51016.3 |      ms |
|   All |         50th percentile service time |             expression |     662.313 |      ms |
|   All |         90th percentile service time |             expression |     695.549 |      ms |
|   All |         99th percentile service time |             expression |     745.112 |      ms |
|   All |        100th percentile service time |             expression |     748.523 |      ms |
|   All |                           error rate |             expression |           0 |       % |
|   All |                       Min Throughput |        painless_static |        1.22 |   ops/s |
|   All |                    Median Throughput |        painless_static |        1.22 |   ops/s |
|   All |                       Max Throughput |        painless_static |        1.23 |   ops/s |
|   All |              50th percentile latency |        painless_static |       38473 |      ms |
|   All |              90th percentile latency |        painless_static |     45195.8 |      ms |
|   All |              99th percentile latency |        painless_static |     46826.6 |      ms |
|   All |             100th percentile latency |        painless_static |     47005.1 |      ms |
|   All |         50th percentile service time |        painless_static |     830.835 |      ms |
|   All |         90th percentile service time |        painless_static |     860.593 |      ms |
|   All |         99th percentile service time |        painless_static |     899.876 |      ms |
|   All |        100th percentile service time |        painless_static |     914.302 |      ms |
|   All |                           error rate |        painless_static |           0 |       % |
|   All |                       Min Throughput |       painless_dynamic |        1.25 |   ops/s |
|   All |                    Median Throughput |       painless_dynamic |        1.26 |   ops/s |
|   All |                       Max Throughput |       painless_dynamic |        1.26 |   ops/s |
|   All |              50th percentile latency |       painless_dynamic |     33236.9 |      ms |
|   All |              90th percentile latency |       painless_dynamic |       37948 |      ms |
|   All |              99th percentile latency |       painless_dynamic |     38511.3 |      ms |
|   All |             100th percentile latency |       painless_dynamic |     38571.9 |      ms |
|   All |         50th percentile service time |       painless_dynamic |     801.433 |      ms |
|   All |         90th percentile service time |       painless_dynamic |     826.274 |      ms |
|   All |         99th percentile service time |       painless_dynamic |     843.882 |      ms |
|   All |        100th percentile service time |       painless_dynamic |     845.679 |      ms |
|   All |                           error rate |       painless_dynamic |           0 |       % |
|   All |              50th percentile latency |            large_terms |     68342.9 |      ms |
|   All |              90th percentile latency |            large_terms |     78261.4 |      ms |
|   All |              99th percentile latency |            large_terms |     80569.4 |      ms |
|   All |             100th percentile latency |            large_terms |     80835.8 |      ms |
|   All |         50th percentile service time |            large_terms |     744.439 |      ms |
|   All |         90th percentile service time |            large_terms |     816.255 |      ms |
|   All |         99th percentile service time |            large_terms |     872.374 |      ms |
|   All |        100th percentile service time |            large_terms |     1008.23 |      ms |
|   All |                           error rate |            large_terms |         100 |       % |
|   All |                       Min Throughput |   large_filtered_terms |        0.68 |   ops/s |
|   All |                    Median Throughput |   large_filtered_terms |        0.68 |   ops/s |
|   All |                       Max Throughput |   large_filtered_terms |        0.68 |   ops/s |
|   All |              50th percentile latency |   large_filtered_terms |      244523 |      ms |
|   All |              90th percentile latency |   large_filtered_terms |      282439 |      ms |
|   All |              99th percentile latency |   large_filtered_terms |      290532 |      ms |
|   All |             100th percentile latency |   large_filtered_terms |      291504 |      ms |
|   All |         50th percentile service time |   large_filtered_terms |     1469.22 |      ms |
|   All |         90th percentile service time |   large_filtered_terms |     1547.79 |      ms |
|   All |         99th percentile service time |   large_filtered_terms |     1645.82 |      ms |
|   All |        100th percentile service time |   large_filtered_terms |     1674.17 |      ms |
|   All |                           error rate |   large_filtered_terms |           0 |       % |
|   All |                       Min Throughput | large_prohibited_terms |        0.71 |   ops/s |
|   All |                    Median Throughput | large_prohibited_terms |        0.71 |   ops/s |
|   All |                       Max Throughput | large_prohibited_terms |        0.71 |   ops/s |
|   All |              50th percentile latency | large_prohibited_terms |      227371 |      ms |
|   All |              90th percentile latency | large_prohibited_terms |      263557 |      ms |
|   All |              99th percentile latency | large_prohibited_terms |      272062 |      ms |
|   All |             100th percentile latency | large_prohibited_terms |      272999 |      ms |
|   All |         50th percentile service time | large_prohibited_terms |     1439.06 |      ms |
|   All |         90th percentile service time | large_prohibited_terms |      1515.6 |      ms |
|   All |         99th percentile service time | large_prohibited_terms |     1558.58 |      ms |
|   All |        100th percentile service time | large_prohibited_terms |     1620.91 |      ms |
|   All |                           error rate | large_prohibited_terms |           0 |       % |


### Performance Test Data of Three 4-core 16G Nodes
<div id="user-content-2"></div>

|   Lap |                               Metric |                   Task |       Value |    Unit |
|------:|-------------------------------------:|-----------------------:|------------:|--------:|
|   All |                  Total indexing time |                        |     27.8331 |     min |
|   All |          Min indexing time per shard |                        |      0.0005 |     min |
|   All |       Median indexing time per shard |                        |     3.29086 |     min |
|   All |          Max indexing time per shard |                        |     9.55602 |     min |
|   All |                     Total merge time |                        |     12.2841 |     min |
|   All |             Min merge time per shard |                        |           0 |     min |
|   All |          Median merge time per shard |                        |     1.51223 |     min |
|   All |             Max merge time per shard |                        |     3.92565 |     min |
|   All |            Total merge throttle time |                        |     1.43845 |     min |
|   All |    Min merge throttle time per shard |                        |           0 |     min |
|   All | Median merge throttle time per shard |                        |    0.275592 |     min |
|   All |    Max merge throttle time per shard |                        |    0.326783 |     min |
|   All |                   Total refresh time |                        |     3.60408 |     min |
|   All |           Min refresh time per shard |                        |     0.00095 |     min |
|   All |        Median refresh time per shard |                        |    0.543892 |     min |
|   All |           Max refresh time per shard |                        |     1.06875 |     min |
|   All |                     Total flush time |                        |     0.35635 |     min |
|   All |             Min flush time per shard |                        |      0.0005 |     min |
|   All |          Median flush time per shard |                        |      0.0651 |     min |
|   All |             Max flush time per shard |                        |   0.0931667 |     min |
|   All |                   Total Young Gen GC |                        |     104.394 |       s |
|   All |                     Total Old Gen GC |                        |       0.847 |       s |
|   All |                           Store size |                        |     3.23382 |      GB |
|   All |                        Translog size |                        | 2.80328e-07 |      GB |
|   All |               Heap used for segments |                        |     18.1036 |      MB |
|   All |             Heap used for doc values |                        |   0.0938606 |      MB |
|   All |                  Heap used for terms |                        |     16.9187 |      MB |
|   All |                  Heap used for norms |                        |   0.0733643 |      MB |
|   All |                 Heap used for points |                        |    0.210203 |      MB |
|   All |          Heap used for stored fields |                        |    0.807449 |      MB |
|   All |                        Segment count |                        |          95 |         |
|   All |                       Min Throughput |           index-append |     35567.1 |  docs/s |
|   All |                    Median Throughput |           index-append |     36912.3 |  docs/s |
|   All |                       Max Throughput |           index-append |     37848.3 |  docs/s |
|   All |              50th percentile latency |           index-append |     1055.28 |      ms |
|   All |              90th percentile latency |           index-append |     1412.81 |      ms |
|   All |              99th percentile latency |           index-append |     1717.94 |      ms |
|   All |            99.9th percentile latency |           index-append |     1920.02 |      ms |
|   All |             100th percentile latency |           index-append |     2065.48 |      ms |
|   All |         50th percentile service time |           index-append |     1055.28 |      ms |
|   All |         90th percentile service time |           index-append |     1412.81 |      ms |
|   All |         99th percentile service time |           index-append |     1717.94 |      ms |
|   All |       99.9th percentile service time |           index-append |     1920.02 |      ms |
|   All |        100th percentile service time |           index-append |     2065.48 |      ms |
|   All |                           error rate |           index-append |           0 |       % |
|   All |                       Min Throughput |            index-stats |      100.06 |   ops/s |
|   All |                    Median Throughput |            index-stats |      100.08 |   ops/s |
|   All |                       Max Throughput |            index-stats |      100.16 |   ops/s |
|   All |              50th percentile latency |            index-stats |     2.32228 |      ms |
|   All |              90th percentile latency |            index-stats |     2.65957 |      ms |
|   All |              99th percentile latency |            index-stats |     3.16584 |      ms |
|   All |            99.9th percentile latency |            index-stats |     9.18318 |      ms |
|   All |             100th percentile latency |            index-stats |     16.1511 |      ms |
|   All |         50th percentile service time |            index-stats |      2.1899 |      ms |
|   All |         90th percentile service time |            index-stats |     2.51514 |      ms |
|   All |         99th percentile service time |            index-stats |     2.98505 |      ms |
|   All |       99.9th percentile service time |            index-stats |     9.03948 |      ms |
|   All |        100th percentile service time |            index-stats |     15.9986 |      ms |
|   All |                           error rate |            index-stats |           0 |       % |
|   All |                       Min Throughput |             node-stats |       98.98 |   ops/s |
|   All |                    Median Throughput |             node-stats |       100.1 |   ops/s |
|   All |                       Max Throughput |             node-stats |      100.71 |   ops/s |
|   All |              50th percentile latency |             node-stats |     2.81659 |      ms |
|   All |              90th percentile latency |             node-stats |     53.8063 |      ms |
|   All |              99th percentile latency |             node-stats |     114.661 |      ms |
|   All |            99.9th percentile latency |             node-stats |     122.575 |      ms |
|   All |             100th percentile latency |             node-stats |     122.991 |      ms |
|   All |         50th percentile service time |             node-stats |     2.60933 |      ms |
|   All |         90th percentile service time |             node-stats |     3.10416 |      ms |
|   All |         99th percentile service time |             node-stats |     64.7022 |      ms |
|   All |       99.9th percentile service time |             node-stats |     68.7948 |      ms |
|   All |        100th percentile service time |             node-stats |     82.8829 |      ms |
|   All |                           error rate |             node-stats |           0 |       % |
|   All |                       Min Throughput |                default |       49.99 |   ops/s |
|   All |                    Median Throughput |                default |       50.01 |   ops/s |
|   All |                       Max Throughput |                default |       50.02 |   ops/s |
|   All |              50th percentile latency |                default |     16.8538 |      ms |
|   All |              90th percentile latency |                default |     22.7054 |      ms |
|   All |              99th percentile latency |                default |     76.0139 |      ms |
|   All |            99.9th percentile latency |                default |     87.9406 |      ms |
|   All |             100th percentile latency |                default |     88.9121 |      ms |
|   All |         50th percentile service time |                default |     15.1525 |      ms |
|   All |         90th percentile service time |                default |     18.3716 |      ms |
|   All |         99th percentile service time |                default |     33.6018 |      ms |
|   All |       99.9th percentile service time |                default |     54.2937 |      ms |
|   All |        100th percentile service time |                default |     55.4259 |      ms |
|   All |                           error rate |                default |           0 |       % |
|   All |                       Min Throughput |                   term |       200.1 |   ops/s |
|   All |                    Median Throughput |                   term |      200.13 |   ops/s |
|   All |                       Max Throughput |                   term |      200.22 |   ops/s |
|   All |              50th percentile latency |                   term |     1.69999 |      ms |
|   All |              90th percentile latency |                   term |      2.0368 |      ms |
|   All |              99th percentile latency |                   term |     13.1274 |      ms |
|   All |            99.9th percentile latency |                   term |       27.75 |      ms |
|   All |             100th percentile latency |                   term |     31.1873 |      ms |
|   All |         50th percentile service time |                   term |     1.62463 |      ms |
|   All |         90th percentile service time |                   term |     1.94375 |      ms |
|   All |         99th percentile service time |                   term |     2.38524 |      ms |
|   All |       99.9th percentile service time |                   term |     26.5261 |      ms |
|   All |        100th percentile service time |                   term |     31.1241 |      ms |
|   All |                           error rate |                   term |           0 |       % |
|   All |                       Min Throughput |                 phrase |      200.08 |   ops/s |
|   All |                    Median Throughput |                 phrase |      200.11 |   ops/s |
|   All |                       Max Throughput |                 phrase |       200.2 |   ops/s |
|   All |              50th percentile latency |                 phrase |     2.27815 |      ms |
|   All |              90th percentile latency |                 phrase |     2.85395 |      ms |
|   All |              99th percentile latency |                 phrase |     20.8926 |      ms |
|   All |            99.9th percentile latency |                 phrase |     30.6657 |      ms |
|   All |             100th percentile latency |                 phrase |     33.2973 |      ms |
|   All |         50th percentile service time |                 phrase |     2.17972 |      ms |
|   All |         90th percentile service time |                 phrase |     2.59037 |      ms |
|   All |         99th percentile service time |                 phrase |     5.60461 |      ms |
|   All |       99.9th percentile service time |                 phrase |     27.8504 |      ms |
|   All |        100th percentile service time |                 phrase |     33.2352 |      ms |
|   All |                           error rate |                 phrase |           0 |       % |
|   All |                       Min Throughput |   country_agg_uncached |        4.49 |   ops/s |
|   All |                    Median Throughput |   country_agg_uncached |        4.51 |   ops/s |
|   All |                       Max Throughput |   country_agg_uncached |        4.53 |   ops/s |
|   All |              50th percentile latency |   country_agg_uncached |     5709.87 |      ms |
|   All |              90th percentile latency |   country_agg_uncached |     6603.55 |      ms |
|   All |              99th percentile latency |   country_agg_uncached |     6739.35 |      ms |
|   All |             100th percentile latency |   country_agg_uncached |        6754 |      ms |
|   All |         50th percentile service time |   country_agg_uncached |     202.847 |      ms |
|   All |         90th percentile service time |   country_agg_uncached |     311.446 |      ms |
|   All |         99th percentile service time |   country_agg_uncached |     327.048 |      ms |
|   All |        100th percentile service time |   country_agg_uncached |     330.529 |      ms |
|   All |                           error rate |   country_agg_uncached |           0 |       % |
|   All |                       Min Throughput |     country_agg_cached |      100.06 |   ops/s |
|   All |                    Median Throughput |     country_agg_cached |      100.08 |   ops/s |
|   All |                       Max Throughput |     country_agg_cached |      100.16 |   ops/s |
|   All |              50th percentile latency |     country_agg_cached |     1.96492 |      ms |
|   All |              90th percentile latency |     country_agg_cached |     2.39189 |      ms |
|   All |              99th percentile latency |     country_agg_cached |     4.33621 |      ms |
|   All |            99.9th percentile latency |     country_agg_cached |     13.8494 |      ms |
|   All |             100th percentile latency |     country_agg_cached |     16.3209 |      ms |
|   All |         50th percentile service time |     country_agg_cached |     1.83241 |      ms |
|   All |         90th percentile service time |     country_agg_cached |     2.23993 |      ms |
|   All |         99th percentile service time |     country_agg_cached |     3.86116 |      ms |
|   All |       99.9th percentile service time |     country_agg_cached |     12.0147 |      ms |
|   All |        100th percentile service time |     country_agg_cached |     16.2515 |      ms |
|   All |                           error rate |     country_agg_cached |           0 |       % |
|   All |                       Min Throughput |                 scroll |       25.05 | pages/s |
|   All |                    Median Throughput |                 scroll |       25.06 | pages/s |
|   All |                       Max Throughput |                 scroll |       25.07 | pages/s |
|   All |              50th percentile latency |                 scroll |     417.828 |      ms |
|   All |              90th percentile latency |                 scroll |     442.312 |      ms |
|   All |              99th percentile latency |                 scroll |     465.759 |      ms |
|   All |             100th percentile latency |                 scroll |     470.647 |      ms |
|   All |         50th percentile service time |                 scroll |     416.954 |      ms |
|   All |         90th percentile service time |                 scroll |     440.984 |      ms |
|   All |         99th percentile service time |                 scroll |      465.06 |      ms |
|   All |        100th percentile service time |                 scroll |     469.696 |      ms |
|   All |                           error rate |                 scroll |           0 |       % |
|   All |                       Min Throughput |             expression |           2 |   ops/s |
|   All |                    Median Throughput |             expression |           2 |   ops/s |
|   All |                       Max Throughput |             expression |           2 |   ops/s |
|   All |              50th percentile latency |             expression |     447.707 |      ms |
|   All |              90th percentile latency |             expression |     645.457 |      ms |
|   All |              99th percentile latency |             expression |     797.761 |      ms |
|   All |             100th percentile latency |             expression |     800.635 |      ms |
|   All |         50th percentile service time |             expression |     415.194 |      ms |
|   All |         90th percentile service time |             expression |     578.452 |      ms |
|   All |         99th percentile service time |             expression |     657.037 |      ms |
|   All |        100th percentile service time |             expression |     658.901 |      ms |
|   All |                           error rate |             expression |           0 |       % |
|   All |                       Min Throughput |        painless_static |         1.5 |   ops/s |
|   All |                    Median Throughput |        painless_static |         1.5 |   ops/s |
|   All |                       Max Throughput |        painless_static |         1.5 |   ops/s |
|   All |              50th percentile latency |        painless_static |     537.655 |      ms |
|   All |              90th percentile latency |        painless_static |      616.08 |      ms |
|   All |              99th percentile latency |        painless_static |     671.851 |      ms |
|   All |             100th percentile latency |        painless_static |     709.106 |      ms |
|   All |         50th percentile service time |        painless_static |      536.75 |      ms |
|   All |         90th percentile service time |        painless_static |     615.588 |      ms |
|   All |         99th percentile service time |        painless_static |     671.551 |      ms |
|   All |        100th percentile service time |        painless_static |     708.876 |      ms |
|   All |                           error rate |        painless_static |           0 |       % |
|   All |                       Min Throughput |       painless_dynamic |         1.5 |   ops/s |
|   All |                    Median Throughput |       painless_dynamic |         1.5 |   ops/s |
|   All |                       Max Throughput |       painless_dynamic |         1.5 |   ops/s |
|   All |              50th percentile latency |       painless_dynamic |     496.759 |      ms |
|   All |              90th percentile latency |       painless_dynamic |     599.603 |      ms |
|   All |              99th percentile latency |       painless_dynamic |     731.211 |      ms |
|   All |             100th percentile latency |       painless_dynamic |     750.379 |      ms |
|   All |         50th percentile service time |       painless_dynamic |     496.493 |      ms |
|   All |         90th percentile service time |       painless_dynamic |      599.24 |      ms |
|   All |         99th percentile service time |       painless_dynamic |     730.824 |      ms |
|   All |        100th percentile service time |       painless_dynamic |     750.084 |      ms |
|   All |                           error rate |       painless_dynamic |           0 |       % |
|   All |                       Min Throughput |   large_filtered_terms |        1.33 |   ops/s |
|   All |                    Median Throughput |   large_filtered_terms |        1.33 |   ops/s |
|   All |                       Max Throughput |   large_filtered_terms |        1.34 |   ops/s |
|   All |              50th percentile latency |   large_filtered_terms |     62890.7 |      ms |
|   All |              90th percentile latency |   large_filtered_terms |     73323.6 |      ms |
|   All |              99th percentile latency |   large_filtered_terms |     75813.5 |      ms |
|   All |             100th percentile latency |   large_filtered_terms |     76013.6 |      ms |
|   All |         50th percentile service time |   large_filtered_terms |     744.717 |      ms |
|   All |         90th percentile service time |   large_filtered_terms |     856.755 |      ms |
|   All |         99th percentile service time |   large_filtered_terms |      899.04 |      ms |
|   All |        100th percentile service time |   large_filtered_terms |     954.063 |      ms |
|   All |                           error rate |   large_filtered_terms |           0 |       % |
|   All |                       Min Throughput | large_prohibited_terms |        1.34 |   ops/s |
|   All |                    Median Throughput | large_prohibited_terms |        1.35 |   ops/s |
|   All |                       Max Throughput | large_prohibited_terms |        1.36 |   ops/s |
|   All |              50th percentile latency | large_prohibited_terms |       60786 |      ms |
|   All |              90th percentile latency | large_prohibited_terms |     70698.7 |      ms |
|   All |              99th percentile latency | large_prohibited_terms |     73464.7 |      ms |
|   All |             100th percentile latency | large_prohibited_terms |     73519.4 |      ms |
|   All |         50th percentile service time | large_prohibited_terms |     744.162 |      ms |
|   All |         90th percentile service time | large_prohibited_terms |     855.295 |      ms |
|   All |         99th percentile service time | large_prohibited_terms |     891.476 |      ms |
|   All |        100th percentile service time | large_prohibited_terms |     937.429 |      ms |
|   All |                           error rate | large_prohibited_terms |           0 |       % |


### Comparison Result of Two Performance Tests
<div id="user-content-3"></div>

|                               Metric |                   Task |    Baseline |   Contender |     Diff |    Unit |
|-------------------------------------:|-----------------------:|------------:|------------:|---------:|--------:|
|                  Total indexing time |                        |      30.552 |     27.8331 | -2.71892 |     min |
|          Min indexing time per shard |                        | 0.000616667 |      0.0005 | -0.00012 |     min |
|       Median indexing time per shard |                        |     4.13957 |     3.29086 | -0.84872 |     min |
|          Max indexing time per shard |                        |     9.49823 |     9.55602 |  0.05778 |     min |
|                     Total merge time |                        |     16.5894 |     12.2841 | -4.30537 |     min |
|             Min merge time per shard |                        |           0 |           0 |        0 |     min |
|          Median merge time per shard |                        |     2.55336 |     1.51223 | -1.04113 |     min |
|             Max merge time per shard |                        |     4.83708 |     3.92565 | -0.91143 |     min |
|            Total merge throttle time |                        |      1.4114 |     1.43845 |  0.02705 |     min |
|    Min merge throttle time per shard |                        |           0 |           0 |        0 |     min |
| Median merge throttle time per shard |                        |     0.25795 |    0.275592 |  0.01764 |     min |
|    Max merge throttle time per shard |                        |    0.325433 |    0.326783 |  0.00135 |     min |
|                   Total refresh time |                        |     6.59383 |     3.60408 | -2.98975 |     min |
|           Min refresh time per shard |                        | 0.000816667 |     0.00095 |  0.00013 |     min |
|        Median refresh time per shard |                        |      0.9831 |    0.543892 | -0.43921 |     min |
|           Max refresh time per shard |                        |     1.95182 |     1.06875 | -0.88307 |     min |
|                     Total flush time |                        |    0.282533 |     0.35635 |  0.07382 |     min |
|             Min flush time per shard |                        | 0.000266667 |      0.0005 |  0.00023 |     min |
|          Median flush time per shard |                        |      0.0547 |      0.0651 |   0.0104 |     min |
|             Max flush time per shard |                        |      0.0627 |   0.0931667 |  0.03047 |     min |
|                   Total Young Gen GC |                        |      200.74 |     104.394 |  -96.346 |       s |
|                     Total Old Gen GC |                        |       1.792 |       0.847 |   -0.945 |       s |
|                           Store size |                        |     3.17049 |     3.23382 |  0.06333 |      GB |
|                        Translog size |                        | 2.80328e-07 | 2.80328e-07 |        0 |      GB |
|               Heap used for segments |                        |     18.1484 |     18.1036 | -0.04482 |      MB |
|             Heap used for doc values |                        |    0.097908 |   0.0938606 | -0.00405 |      MB |
|                  Heap used for terms |                        |     16.9487 |     16.9187 | -0.02993 |      MB |
|                  Heap used for norms |                        |   0.0726929 |   0.0733643 |  0.00067 |      MB |
|                 Heap used for points |                        |    0.216206 |    0.210203 |   -0.006 |      MB |
|          Heap used for stored fields |                        |    0.812965 |    0.807449 | -0.00552 |      MB |
|                        Segment count |                        |          96 |          95 |       -1 |         |
|                       Min Throughput |           index-append |       18145 |     35567.1 |  17422.2 |  docs/s |
|                    Median Throughput |           index-append |     18820.2 |     36912.3 |  18092.1 |  docs/s |
|                       Max Throughput |           index-append |     19774.6 |     37848.3 |  18073.7 |  docs/s |
|              50th percentile latency |           index-append |     2041.05 |     1055.28 | -985.765 |      ms |
|              90th percentile latency |           index-append |     2792.47 |     1412.81 | -1379.67 |      ms |
|              99th percentile latency |           index-append |     3716.86 |     1717.94 | -1998.92 |      ms |
|            99.9th percentile latency |           index-append |     4291.14 |     1920.02 | -2371.12 |      ms |
|             100th percentile latency |           index-append |     4428.68 |     2065.48 |  -2363.2 |      ms |
|         50th percentile service time |           index-append |     2041.05 |     1055.28 | -985.765 |      ms |
|         90th percentile service time |           index-append |     2792.47 |     1412.81 | -1379.67 |      ms |
|         99th percentile service time |           index-append |     3716.86 |     1717.94 | -1998.92 |      ms |
|       99.9th percentile service time |           index-append |     4291.14 |     1920.02 | -2371.12 |      ms |
|        100th percentile service time |           index-append |     4428.68 |     2065.48 |  -2363.2 |      ms |
|                           error rate |           index-append |           0 |           0 |        0 |       % |
|                       Min Throughput |            index-stats |     100.027 |     100.057 |  0.02979 |   ops/s |
|                    Median Throughput |            index-stats |     100.073 |     100.081 |  0.00781 |   ops/s |
|                       Max Throughput |            index-stats |     100.143 |     100.157 |  0.01489 |   ops/s |
|              50th percentile latency |            index-stats |     2.40418 |     2.32228 | -0.08191 |      ms |
|              90th percentile latency |            index-stats |     3.28969 |     2.65957 | -0.63012 |      ms |
|              99th percentile latency |            index-stats |      14.018 |     3.16584 | -10.8522 |      ms |
|            99.9th percentile latency |            index-stats |     22.3686 |     9.18318 | -13.1855 |      ms |
|             100th percentile latency |            index-stats |     24.6219 |     16.1511 | -8.47073 |      ms |
|         50th percentile service time |            index-stats |     2.25166 |      2.1899 | -0.06176 |      ms |
|         90th percentile service time |            index-stats |     3.03377 |     2.51514 | -0.51862 |      ms |
|         99th percentile service time |            index-stats |     10.3106 |     2.98505 | -7.32559 |      ms |
|       99.9th percentile service time |            index-stats |     22.1934 |     9.03948 | -13.1539 |      ms |
|        100th percentile service time |            index-stats |     24.4795 |     15.9986 | -8.48091 |      ms |
|                           error rate |            index-stats |           0 |           0 |        0 |       % |
|                       Min Throughput |             node-stats |     99.1942 |     98.9846 | -0.20967 |   ops/s |
|                    Median Throughput |             node-stats |     100.138 |     100.101 | -0.03696 |   ops/s |
|                       Max Throughput |             node-stats |     100.762 |      100.71 | -0.05179 |   ops/s |
|              50th percentile latency |             node-stats |     2.78576 |     2.81659 |  0.03083 |      ms |
|              90th percentile latency |             node-stats |     57.8865 |     53.8063 | -4.08021 |      ms |
|              99th percentile latency |             node-stats |     124.952 |     114.661 | -10.2909 |      ms |
|            99.9th percentile latency |             node-stats |     179.015 |     122.575 | -56.4391 |      ms |
|             100th percentile latency |             node-stats |     185.806 |     122.991 | -62.8153 |      ms |
|         50th percentile service time |             node-stats |     2.53587 |     2.60933 |  0.07346 |      ms |
|         90th percentile service time |             node-stats |     4.43647 |     3.10416 | -1.33231 |      ms |
|         99th percentile service time |             node-stats |     71.4676 |     64.7022 | -6.76531 |      ms |
|       99.9th percentile service time |             node-stats |       105.7 |     68.7948 | -36.9053 |      ms |
|        100th percentile service time |             node-stats |     107.373 |     82.8829 | -24.4904 |      ms |
|                           error rate |             node-stats |           0 |           0 |        0 |       % |
|                       Min Throughput |                default |     24.7774 |     49.9937 |  25.2162 |   ops/s |
|                    Median Throughput |                default |     24.8603 |     50.0116 |  25.1513 |   ops/s |
|                       Max Throughput |                default |     25.3624 |     50.0204 |  24.6579 |   ops/s |
|              50th percentile latency |                default |     20245.4 |     16.8538 | -20228.6 |      ms |
|              90th percentile latency |                default |     28478.9 |     22.7054 | -28456.2 |      ms |
|              99th percentile latency |                default |     30327.1 |     76.0139 | -30251.1 |      ms |
|            99.9th percentile latency |                default |     30494.6 |     87.9406 | -30406.7 |      ms |
|             100th percentile latency |                default |     30515.1 |     88.9121 | -30426.2 |      ms |
|         50th percentile service time |                default |     39.7821 |     15.1525 | -24.6296 |      ms |
|         90th percentile service time |                default |     42.3616 |     18.3716 |   -23.99 |      ms |
|         99th percentile service time |                default |     68.9103 |     33.6018 | -35.3085 |      ms |
|       99.9th percentile service time |                default |     86.6771 |     54.2937 | -32.3834 |      ms |
|        100th percentile service time |                default |     98.6355 |     55.4259 | -43.2096 |      ms |
|                           error rate |                default |           0 |           0 |        0 |       % |
|                       Min Throughput |                   term |     199.876 |       200.1 |   0.2245 |   ops/s |
|                    Median Throughput |                   term |     200.099 |     200.133 |   0.0342 |   ops/s |
|                       Max Throughput |                   term |     200.202 |     200.215 |  0.01285 |   ops/s |
|              50th percentile latency |                   term |     1.77077 |     1.69999 | -0.07078 |      ms |
|              90th percentile latency |                   term |       3.274 |      2.0368 |  -1.2372 |      ms |
|              99th percentile latency |                   term |     13.5938 |     13.1274 | -0.46647 |      ms |
|            99.9th percentile latency |                   term |     18.7991 |       27.75 |  8.95095 |      ms |
|             100th percentile latency |                   term |      21.992 |     31.1873 |  9.19533 |      ms |
|         50th percentile service time |                   term |     1.67021 |     1.62463 | -0.04558 |      ms |
|         90th percentile service time |                   term |     2.18404 |     1.94375 | -0.24029 |      ms |
|         99th percentile service time |                   term |     8.68671 |     2.38524 | -6.30147 |      ms |
|       99.9th percentile service time |                   term |     18.2481 |     26.5261 |  8.27804 |      ms |
|        100th percentile service time |                   term |     21.9286 |     31.1241 |   9.1955 |      ms |
|                           error rate |                   term |           0 |           0 |        0 |       % |
|                       Min Throughput |                 phrase |     199.975 |     200.081 |  0.10604 |   ops/s |
|                    Median Throughput |                 phrase |     200.076 |     200.106 |  0.03004 |   ops/s |
|                       Max Throughput |                 phrase |     200.186 |     200.199 |  0.01308 |   ops/s |
|              50th percentile latency |                 phrase |      2.3951 |     2.27815 | -0.11695 |      ms |
|              90th percentile latency |                 phrase |     6.60669 |     2.85395 | -3.75274 |      ms |
|              99th percentile latency |                 phrase |     17.4791 |     20.8926 |  3.41344 |      ms |
|            99.9th percentile latency |                 phrase |     22.7571 |     30.6657 |  7.90855 |      ms |
|             100th percentile latency |                 phrase |     25.6412 |     33.2973 |  7.65606 |      ms |
|         50th percentile service time |                 phrase |     2.25227 |     2.17972 | -0.07255 |      ms |
|         90th percentile service time |                 phrase |     3.17436 |     2.59037 | -0.58398 |      ms |
|         99th percentile service time |                 phrase |     13.4409 |     5.60461 | -7.83625 |      ms |
|       99.9th percentile service time |                 phrase |     18.4939 |     27.8504 |  9.35651 |      ms |
|        100th percentile service time |                 phrase |     21.6504 |     33.2352 |  11.5848 |      ms |
|                           error rate |                 phrase |           0 |           0 |        0 |       % |
|                       Min Throughput |   country_agg_uncached |     2.84487 |     4.49283 |  1.64796 |   ops/s |
|                    Median Throughput |   country_agg_uncached |      2.8532 |     4.51024 |  1.65704 |   ops/s |
|                       Max Throughput |   country_agg_uncached |     2.87273 |     4.53038 |  1.65765 |   ops/s |
|              50th percentile latency |   country_agg_uncached |       37897 |     5709.87 | -32187.1 |      ms |
|              90th percentile latency |   country_agg_uncached |     44135.1 |     6603.55 | -37531.5 |      ms |
|              99th percentile latency |   country_agg_uncached |     45503.2 |     6739.35 | -38763.8 |      ms |
|             100th percentile latency |   country_agg_uncached |     45660.9 |        6754 | -38906.9 |      ms |
|         50th percentile service time |   country_agg_uncached |      357.96 |     202.847 | -155.113 |      ms |
|         90th percentile service time |   country_agg_uncached |     369.897 |     311.446 | -58.4507 |      ms |
|         99th percentile service time |   country_agg_uncached |     393.634 |     327.048 | -66.5867 |      ms |
|        100th percentile service time |   country_agg_uncached |     397.856 |     330.529 | -67.3262 |      ms |
|                           error rate |   country_agg_uncached |           0 |           0 |        0 |       % |
|                       Min Throughput |     country_agg_cached |     100.043 |      100.06 |  0.01706 |   ops/s |
|                    Median Throughput |     country_agg_cached |     100.079 |     100.085 |  0.00537 |   ops/s |
|                       Max Throughput |     country_agg_cached |     100.156 |     100.158 |  0.00189 |   ops/s |
|              50th percentile latency |     country_agg_cached |     2.11152 |     1.96492 |  -0.1466 |      ms |
|              90th percentile latency |     country_agg_cached |     2.97139 |     2.39189 |  -0.5795 |      ms |
|              99th percentile latency |     country_agg_cached |     10.6774 |     4.33621 | -6.34122 |      ms |
|            99.9th percentile latency |     country_agg_cached |     15.5726 |     13.8494 | -1.72319 |      ms |
|             100th percentile latency |     country_agg_cached |     18.1987 |     16.3209 | -1.87776 |      ms |
|         50th percentile service time |     country_agg_cached |      1.9665 |     1.83241 | -0.13409 |      ms |
|         90th percentile service time |     country_agg_cached |     2.73417 |     2.23993 | -0.49424 |      ms |
|         99th percentile service time |     country_agg_cached |       9.993 |     3.86116 | -6.13183 |      ms |
|       99.9th percentile service time |     country_agg_cached |     15.4348 |     12.0147 | -3.42004 |      ms |
|        100th percentile service time |     country_agg_cached |     18.0494 |     16.2515 | -1.79787 |      ms |
|                           error rate |     country_agg_cached |           0 |           0 |        0 |       % |
|                       Min Throughput |                 scroll |     25.0409 |     25.0464 |  0.00557 | pages/s |
|                    Median Throughput |                 scroll |      25.052 |      25.058 |  0.00602 | pages/s |
|                       Max Throughput |                 scroll |     25.0689 |     25.0746 |  0.00575 | pages/s |
|              50th percentile latency |                 scroll |     471.178 |     417.828 | -53.3504 |      ms |
|              90th percentile latency |                 scroll |     503.083 |     442.312 | -60.7705 |      ms |
|              99th percentile latency |                 scroll |       526.2 |     465.759 |  -60.441 |      ms |
|             100th percentile latency |                 scroll |      526.85 |     470.647 | -56.2037 |      ms |
|         50th percentile service time |                 scroll |     470.224 |     416.954 | -53.2696 |      ms |
|         90th percentile service time |                 scroll |      502.27 |     440.984 | -61.2861 |      ms |
|         99th percentile service time |                 scroll |     525.285 |      465.06 | -60.2245 |      ms |
|        100th percentile service time |                 scroll |     526.194 |     469.696 | -56.4987 |      ms |
|                           error rate |                 scroll |           0 |           0 |        0 |       % |
|                       Min Throughput |             expression |      1.4903 |     1.99539 |  0.50509 |   ops/s |
|                    Median Throughput |             expression |     1.49677 |     2.00088 |  0.50411 |   ops/s |
|                       Max Throughput |             expression |     1.49942 |     2.00179 |  0.50237 |   ops/s |
|              50th percentile latency |             expression |     42320.9 |     447.707 | -41873.2 |      ms |
|              90th percentile latency |             expression |     49283.7 |     645.457 | -48638.2 |      ms |
|              99th percentile latency |             expression |     50784.3 |     797.761 | -49986.5 |      ms |
|             100th percentile latency |             expression |     51016.3 |     800.635 | -50215.7 |      ms |
|         50th percentile service time |             expression |     662.313 |     415.194 | -247.119 |      ms |
|         90th percentile service time |             expression |     695.549 |     578.452 | -117.097 |      ms |
|         99th percentile service time |             expression |     745.112 |     657.037 | -88.0755 |      ms |
|        100th percentile service time |             expression |     748.523 |     658.901 | -89.6215 |      ms |
|                           error rate |             expression |           0 |           0 |        0 |       % |
|                       Min Throughput |        painless_static |     1.21784 |     1.49963 |  0.28179 |   ops/s |
|                    Median Throughput |        painless_static |     1.22308 |     1.50109 |  0.27801 |   ops/s |
|                       Max Throughput |        painless_static |     1.22531 |     1.50161 |  0.27629 |   ops/s |
|              50th percentile latency |        painless_static |       38473 |     537.655 | -37935.3 |      ms |
|              90th percentile latency |        painless_static |     45195.8 |      616.08 | -44579.7 |      ms |
|              99th percentile latency |        painless_static |     46826.6 |     671.851 | -46154.7 |      ms |
|             100th percentile latency |        painless_static |     47005.1 |     709.106 |   -46296 |      ms |
|         50th percentile service time |        painless_static |     830.835 |      536.75 | -294.085 |      ms |
|         90th percentile service time |        painless_static |     860.593 |     615.588 | -245.006 |      ms |
|         99th percentile service time |        painless_static |     899.876 |     671.551 | -228.325 |      ms |
|        100th percentile service time |        painless_static |     914.302 |     708.876 | -205.426 |      ms |
|                           error rate |        painless_static |           0 |           0 |        0 |       % |
|                       Min Throughput |       painless_dynamic |     1.25417 |     1.49933 |  0.24517 |   ops/s |
|                    Median Throughput |       painless_dynamic |     1.25661 |     1.50155 |  0.24495 |   ops/s |
|                       Max Throughput |       painless_dynamic |     1.26066 |     1.50214 |  0.24148 |   ops/s |
|              50th percentile latency |       painless_dynamic |     33236.9 |     496.759 | -32740.2 |      ms |
|              90th percentile latency |       painless_dynamic |       37948 |     599.603 | -37348.4 |      ms |
|              99th percentile latency |       painless_dynamic |     38511.3 |     731.211 | -37780.1 |      ms |
|             100th percentile latency |       painless_dynamic |     38571.9 |     750.379 | -37821.5 |      ms |
|         50th percentile service time |       painless_dynamic |     801.433 |     496.493 | -304.941 |      ms |
|         90th percentile service time |       painless_dynamic |     826.274 |      599.24 | -227.034 |      ms |
|         99th percentile service time |       painless_dynamic |     843.882 |     730.824 | -113.059 |      ms |
|        100th percentile service time |       painless_dynamic |     845.679 |     750.084 | -95.5956 |      ms |
|                           error rate |       painless_dynamic |           0 |           0 |        0 |       % |
|              50th percentile latency |            large_terms |     68342.9 |     423.816 | -67919.1 |      ms |
|              90th percentile latency |            large_terms |     78261.4 |     478.494 | -77782.9 |      ms |
|              99th percentile latency |            large_terms |     80569.4 |     484.157 | -80085.3 |      ms |
|             100th percentile latency |            large_terms |     80835.8 |      490.81 |   -80345 |      ms |
|         50th percentile service time |            large_terms |     744.439 |     423.455 | -320.984 |      ms |
|         90th percentile service time |            large_terms |     816.255 |      478.12 | -338.135 |      ms |
|         99th percentile service time |            large_terms |     872.374 |      483.88 | -388.494 |      ms |
|        100th percentile service time |            large_terms |     1008.23 |     490.257 | -517.973 |      ms |
|                           error rate |            large_terms |         100 |         100 |        0 |       % |
|                       Min Throughput |   large_filtered_terms |    0.677264 |        1.33 |  0.65274 |   ops/s |
|                    Median Throughput |   large_filtered_terms |     0.67843 |     1.33416 |  0.65573 |   ops/s |
|                       Max Throughput |   large_filtered_terms |    0.680318 |      1.3395 |  0.65918 |   ops/s |
|              50th percentile latency |   large_filtered_terms |      244523 |     62890.7 |  -181632 |      ms |
|              90th percentile latency |   large_filtered_terms |      282439 |     73323.6 |  -209115 |      ms |
|              99th percentile latency |   large_filtered_terms |      290532 |     75813.5 |  -214718 |      ms |
|             100th percentile latency |   large_filtered_terms |      291504 |     76013.6 |  -215491 |      ms |
|         50th percentile service time |   large_filtered_terms |     1469.22 |     744.717 | -724.505 |      ms |
|         90th percentile service time |   large_filtered_terms |     1547.79 |     856.755 | -691.033 |      ms |
|         99th percentile service time |   large_filtered_terms |     1645.82 |      899.04 |  -746.78 |      ms |
|        100th percentile service time |   large_filtered_terms |     1674.17 |     954.063 | -720.106 |      ms |
|                           error rate |   large_filtered_terms |           0 |           0 |        0 |       % |
|                       Min Throughput | large_prohibited_terms |     0.71006 |     1.34404 |  0.63398 |   ops/s |
|                    Median Throughput | large_prohibited_terms |    0.711689 |     1.34935 |  0.63766 |   ops/s |
|                       Max Throughput | large_prohibited_terms |    0.713347 |      1.3557 |  0.64235 |   ops/s |
|              50th percentile latency | large_prohibited_terms |      227371 |       60786 |  -166585 |      ms |
|              90th percentile latency | large_prohibited_terms |      263557 |     70698.7 |  -192858 |      ms |
|              99th percentile latency | large_prohibited_terms |      272062 |     73464.7 |  -198598 |      ms |
|             100th percentile latency | large_prohibited_terms |      272999 |     73519.4 |  -199480 |      ms |
|         50th percentile service time | large_prohibited_terms |     1439.06 |     744.162 | -694.895 |      ms |
|         90th percentile service time | large_prohibited_terms |      1515.6 |     855.295 | -660.302 |      ms |
|         99th percentile service time | large_prohibited_terms |     1558.58 |     891.476 | -667.105 |      ms |
|        100th percentile service time | large_prohibited_terms |     1620.91 |     937.429 | -683.483 |      ms |
|                           error rate | large_prohibited_terms |           0 |           0 |        0 |       % |
