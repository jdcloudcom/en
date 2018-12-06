## Performance Indicators

Through the geonames officially provided by Elasticsearch (3.3G in size, totaling 11,520,617 docs) and the benchmark script rally, we conducted a pressure test on JD JCS for Elasticsearch (V5.9) in the cn-north-1 region. The test results are as follows for reference.</br>


The performance test data of ES instance with 3 nodes and the specification of 2-core 8G are as follows:


|   Lap |                               Metric |                   Task |       Value |    Unit |
|------:|-------------------------------------:|-----------------------:|------------:|--------:|
|   All |                  Total indexing time |                        |     24.0342 |     min |
|   All |          Min indexing time per shard |                        | 0.000766667 |     min |
|   All |       Median indexing time per shard |                        |     4.89164 |     min |
|   All |          Max indexing time per shard |                        |     5.07303 |     min |
|   All |                     Total merge time |                        |     9.07312 |     min |
|   All |             Min merge time per shard |                        |           0 |     min |
|   All |          Median merge time per shard |                        |     1.83392 |     min |
|   All |             Max merge time per shard |                        |     1.89142 |     min |
|   All |            Total merge throttle time |                        |     1.47122 |     min |
|   All |    Min merge throttle time per shard |                        |           0 |     min |
|   All | Median merge throttle time per shard |                        |    0.288592 |     min |
|   All |    Max merge throttle time per shard |                        |     0.35915 |     min |
|   All |                   Total refresh time |                        |     1.26367 |     min |
|   All |           Min refresh time per shard |                        |     0.00105 |     min |
|   All |        Median refresh time per shard |                        |    0.248583 |     min |
|   All |           Max refresh time per shard |                        |    0.278817 |     min |
|   All |                     Total flush time |                        |      0.2837 |     min |
|   All |             Min flush time per shard |                        |           0 |     min |
|   All |          Median flush time per shard |                        |    0.052725 |     min |
|   All |             Max flush time per shard |                        |   0.0722667 |     min |
|   All |                   Total Young Gen GC |                        |       9.543 |       s |
|   All |                     Total Old Gen GC |                        |       1.188 |       s |
|   All |                           Store size |                        |     3.41974 |      GB |
|   All |                        Translog size |                        | 2.80328e-07 |      GB |
|   All |               Heap used for segments |                        |     18.7004 |      MB |
|   All |             Heap used for doc values |                        |    0.109951 |      MB |
|   All |                  Heap used for terms |                        |     17.5025 |      MB |
|   All |                  Heap used for norms |                        |   0.0725098 |      MB |
|   All |                 Heap used for points |                        |     0.21654 |      MB |
|   All |          Heap used for stored fields |                        |    0.798889 |      MB |
|   All |                        Segment count |                        |          97 |         |
|   All |                       Min Throughput |           index-append |      126366 |  docs/s |
|   All |                    Median Throughput |           index-append |      130938 |  docs/s |
|   All |                       Max Throughput |           index-append |      134976 |  docs/s |
|   All |              50th percentile latency |           index-append |      278.76 |      ms |
|   All |              90th percentile latency |           index-append |     404.473 |      ms |
|   All |              99th percentile latency |           index-append |     547.389 |      ms |
|   All |            99.9th percentile latency |           index-append |     642.308 |      ms |
|   All |             100th percentile latency |           index-append |     1071.42 |      ms |
|   All |         50th percentile service time |           index-append |      278.76 |      ms |
|   All |         90th percentile service time |           index-append |     404.473 |      ms |
|   All |         99th percentile service time |           index-append |     547.389 |      ms |
|   All |       99.9th percentile service time |           index-append |     642.308 |      ms |
|   All |        100th percentile service time |           index-append |     1071.42 |      ms |
|   All |                           error rate |           index-append |           0 |       % |
|   All |                       Min Throughput |            index-stats |      100.05 |   ops/s |
|   All |                    Median Throughput |            index-stats |      100.08 |   ops/s |
|   All |                       Max Throughput |            index-stats |      100.16 |   ops/s |
|   All |              50th percentile latency |            index-stats |     1.93088 |      ms |
|   All |              90th percentile latency |            index-stats |     2.19195 |      ms |
|   All |              99th percentile latency |            index-stats |     2.90881 |      ms |
|   All |            99.9th percentile latency |            index-stats |     8.87853 |      ms |
|   All |             100th percentile latency |            index-stats |     16.7437 |      ms |
|   All |         50th percentile service time |            index-stats |      1.8543 |      ms |
|   All |         90th percentile service time |            index-stats |     2.10295 |      ms |
|   All |         99th percentile service time |            index-stats |     2.82084 |      ms |
|   All |       99.9th percentile service time |            index-stats |     7.26796 |      ms |
|   All |        100th percentile service time |            index-stats |     16.6655 |      ms |
|   All |                           error rate |            index-stats |           0 |       % |
|   All |                       Min Throughput |             node-stats |      100.07 |   ops/s |
|   All |                    Median Throughput |             node-stats |      100.14 |   ops/s |
|   All |                       Max Throughput |             node-stats |      100.74 |   ops/s |
|   All |              50th percentile latency |             node-stats |     2.47716 |      ms |
|   All |              90th percentile latency |             node-stats |     2.71357 |      ms |
|   All |              99th percentile latency |             node-stats |     13.2403 |      ms |
|   All |            99.9th percentile latency |             node-stats |     14.7591 |      ms |
|   All |             100th percentile latency |             node-stats |     15.1666 |      ms |
|   All |         50th percentile service time |             node-stats |     2.37679 |      ms |
|   All |         90th percentile service time |             node-stats |     2.60474 |      ms |
|   All |         99th percentile service time |             node-stats |     12.3012 |      ms |
|   All |       99.9th percentile service time |             node-stats |     13.2979 |      ms |
|   All |        100th percentile service time |             node-stats |     14.4364 |      ms |
|   All |                           error rate |             node-stats |           0 |       % |
|   All |                       Min Throughput |                default |       46.09 |   ops/s |
|   All |                    Median Throughput |                default |       46.17 |   ops/s |
|   All |                       Max Throughput |                default |       46.24 |   ops/s |
|   All |              50th percentile latency |                default |     1712.33 |      ms |
|   All |              90th percentile latency |                default |     2319.36 |      ms |
|   All |              99th percentile latency |                default |     2482.24 |      ms |
|   All |            99.9th percentile latency |                default |     2489.96 |      ms |
|   All |             100th percentile latency |                default |     2491.03 |      ms |
|   All |         50th percentile service time |                default |     21.3526 |      ms |
|   All |         90th percentile service time |                default |     22.2536 |      ms |
|   All |         99th percentile service time |                default |     26.1064 |      ms |
|   All |       99.9th percentile service time |                default |     38.2416 |      ms |
|   All |        100th percentile service time |                default |     38.7758 |      ms |
|   All |                           error rate |                default |           0 |       % |
|   All |                       Min Throughput |                   term |      200.11 |   ops/s |
|   All |                    Median Throughput |                   term |      200.15 |   ops/s |
|   All |                       Max Throughput |                   term |      200.25 |   ops/s |
|   All |              50th percentile latency |                   term |     1.23644 |      ms |
|   All |              90th percentile latency |                   term |       1.342 |      ms |
|   All |              99th percentile latency |                   term |      1.6352 |      ms |
|   All |            99.9th percentile latency |                   term |     3.76925 |      ms |
|   All |             100th percentile latency |                   term |     7.55672 |      ms |
|   All |         50th percentile service time |                   term |     1.16165 |      ms |
|   All |         90th percentile service time |                   term |     1.25623 |      ms |
|   All |         99th percentile service time |                   term |     1.56184 |      ms |
|   All |       99.9th percentile service time |                   term |     1.74419 |      ms |
|   All |        100th percentile service time |                   term |     1.75608 |      ms |
|   All |                           error rate |                   term |           0 |       % |
|   All |                       Min Throughput |                 phrase |       200.1 |   ops/s |
|   All |                    Median Throughput |                 phrase |      200.13 |   ops/s |
|   All |                       Max Throughput |                 phrase |      200.22 |   ops/s |
|   All |              50th percentile latency |                 phrase |     1.70826 |      ms |
|   All |              90th percentile latency |                 phrase |     1.86393 |      ms |
|   All |              99th percentile latency |                 phrase |      4.4289 |      ms |
|   All |            99.9th percentile latency |                 phrase |     14.5744 |      ms |
|   All |             100th percentile latency |                 phrase |     15.1789 |      ms |
|   All |         50th percentile service time |                 phrase |     1.63952 |      ms |
|   All |         90th percentile service time |                 phrase |     1.78439 |      ms |
|   All |         99th percentile service time |                 phrase |     2.05865 |      ms |
|   All |       99.9th percentile service time |                 phrase |     14.5113 |      ms |
|   All |        100th percentile service time |                 phrase |     15.1151 |      ms |
|   All |                           error rate |                 phrase |           0 |       % |
|   All |                       Min Throughput |   country_agg_uncached |        4.56 |   ops/s |
|   All |                    Median Throughput |   country_agg_uncached |        4.57 |   ops/s |
|   All |                       Max Throughput |   country_agg_uncached |        4.57 |   ops/s |
|   All |              50th percentile latency |   country_agg_uncached |      4929.6 |      ms |
|   All |              90th percentile latency |   country_agg_uncached |     5655.55 |      ms |
|   All |              99th percentile latency |   country_agg_uncached |      5811.4 |      ms |
|   All |             100th percentile latency |   country_agg_uncached |     5827.97 |      ms |
|   All |         50th percentile service time |   country_agg_uncached |     217.388 |      ms |
|   All |         90th percentile service time |   country_agg_uncached |     220.945 |      ms |
|   All |         99th percentile service time |   country_agg_uncached |     227.139 |      ms |
|   All |        100th percentile service time |   country_agg_uncached |     241.988 |      ms |
|   All |                           error rate |   country_agg_uncached |           0 |       % |
|   All |                       Min Throughput |     country_agg_cached |      100.06 |   ops/s |
|   All |                    Median Throughput |     country_agg_cached |      100.09 |   ops/s |
|   All |                       Max Throughput |     country_agg_cached |      100.17 |   ops/s |
|   All |              50th percentile latency |     country_agg_cached |     1.48535 |      ms |
|   All |              90th percentile latency |     country_agg_cached |     1.66624 |      ms |
|   All |              99th percentile latency |     country_agg_cached |     1.99591 |      ms |
|   All |            99.9th percentile latency |     country_agg_cached |     2.41961 |      ms |
|   All |             100th percentile latency |     country_agg_cached |     3.13034 |      ms |
|   All |         50th percentile service time |     country_agg_cached |      1.3688 |      ms |
|   All |         90th percentile service time |     country_agg_cached |     1.55639 |      ms |
|   All |         99th percentile service time |     country_agg_cached |     1.86155 |      ms |
|   All |       99.9th percentile service time |     country_agg_cached |     2.33655 |      ms |
|   All |        100th percentile service time |     country_agg_cached |     2.98781 |      ms |
|   All |                           error rate |     country_agg_cached |           0 |       % |
|   All |                       Min Throughput |                 scroll |       25.05 | pages/s |
|   All |                    Median Throughput |                 scroll |       25.06 | pages/s |
|   All |                       Max Throughput |                 scroll |       25.07 | pages/s |
|   All |              50th percentile latency |                 scroll |     432.016 |      ms |
|   All |              90th percentile latency |                 scroll |     458.616 |      ms |
|   All |              99th percentile latency |                 scroll |      472.92 |      ms |
|   All |             100th percentile latency |                 scroll |     498.795 |      ms |
|   All |         50th percentile service time |                 scroll |     431.381 |      ms |
|   All |         90th percentile service time |                 scroll |     457.989 |      ms |
|   All |         99th percentile service time |                 scroll |     472.309 |      ms |
|   All |        100th percentile service time |                 scroll |     498.182 |      ms |
|   All |                           error rate |                 scroll |           0 |       % |
|   All |                       Min Throughput |             expression |           2 |   ops/s |
|   All |                    Median Throughput |             expression |           2 |   ops/s |
|   All |                       Max Throughput |             expression |           2 |   ops/s |
|   All |              50th percentile latency |             expression |     484.102 |      ms |
|   All |              90th percentile latency |             expression |     491.196 |      ms |
|   All |              99th percentile latency |             expression |     498.786 |      ms |
|   All |             100th percentile latency |             expression |     499.503 |      ms |
|   All |         50th percentile service time |             expression |     483.978 |      ms |
|   All |         90th percentile service time |             expression |     491.083 |      ms |
|   All |         99th percentile service time |             expression |     498.615 |      ms |
|   All |        100th percentile service time |             expression |      499.33 |      ms |
|   All |                           error rate |             expression |           0 |       % |
|   All |                       Min Throughput |        painless_static |         1.5 |   ops/s |
|   All |                    Median Throughput |        painless_static |         1.5 |   ops/s |
|   All |                       Max Throughput |        painless_static |         1.5 |   ops/s |
|   All |              50th percentile latency |        painless_static |     591.493 |      ms |
|   All |              90th percentile latency |        painless_static |     599.658 |      ms |
|   All |              99th percentile latency |        painless_static |     605.543 |      ms |
|   All |             100th percentile latency |        painless_static |     615.329 |      ms |
|   All |         50th percentile service time |        painless_static |     591.353 |      ms |
|   All |         90th percentile service time |        painless_static |     599.527 |      ms |
|   All |         99th percentile service time |        painless_static |     605.384 |      ms |
|   All |        100th percentile service time |        painless_static |      615.21 |      ms |
|   All |                           error rate |        painless_static |           0 |       % |
|   All |                       Min Throughput |       painless_dynamic |         1.5 |   ops/s |
|   All |                    Median Throughput |       painless_dynamic |         1.5 |   ops/s |
|   All |                       Max Throughput |       painless_dynamic |         1.5 |   ops/s |
|   All |              50th percentile latency |       painless_dynamic |      566.05 |      ms |
|   All |              90th percentile latency |       painless_dynamic |     572.654 |      ms |
|   All |              99th percentile latency |       painless_dynamic |     585.029 |      ms |
|   All |             100th percentile latency |       painless_dynamic |     585.476 |      ms |
|   All |         50th percentile service time |       painless_dynamic |      565.87 |      ms |
|   All |         90th percentile service time |       painless_dynamic |     572.505 |      ms |
|   All |         99th percentile service time |       painless_dynamic |     584.668 |      ms |
|   All |        100th percentile service time |       painless_dynamic |     585.329 |      ms |
|   All |                           error rate |       painless_dynamic |           0 |       % |
|   All |                       Min Throughput |   large_filtered_terms |        1.61 |   ops/s |
|   All |                    Median Throughput |   large_filtered_terms |        1.61 |   ops/s |
|   All |                       Max Throughput |   large_filtered_terms |        1.61 |   ops/s |
|   All |              50th percentile latency |   large_filtered_terms |     31284.9 |      ms |
|   All |              90th percentile latency |   large_filtered_terms |       35859 |      ms |
|   All |              99th percentile latency |   large_filtered_terms |     36773.4 |      ms |
|   All |             100th percentile latency |   large_filtered_terms |     36889.3 |      ms |
|   All |         50th percentile service time |   large_filtered_terms |     618.892 |      ms |
|   All |         90th percentile service time |   large_filtered_terms |     630.125 |      ms |
|   All |         99th percentile service time |   large_filtered_terms |     685.957 |      ms |
|   All |        100th percentile service time |   large_filtered_terms |     822.781 |      ms |
|   All |                           error rate |   large_filtered_terms |           0 |       % |
|   All |                       Min Throughput | large_prohibited_terms |        1.67 |   ops/s |
|   All |                    Median Throughput | large_prohibited_terms |        1.68 |   ops/s |
|   All |                       Max Throughput | large_prohibited_terms |        1.68 |   ops/s |
|   All |              50th percentile latency | large_prohibited_terms |     24776.7 |      ms |
|   All |              90th percentile latency | large_prohibited_terms |     28568.1 |      ms |
|   All |              99th percentile latency | large_prohibited_terms |     29540.7 |      ms |
|   All |             100th percentile latency | large_prohibited_terms |     29634.8 |      ms |
|   All |         50th percentile service time | large_prohibited_terms |     599.963 |      ms |
|   All |         90th percentile service time | large_prohibited_terms |     612.354 |      ms |
|   All |         99th percentile service time | large_prohibited_terms |     644.354 |      ms |
|   All |        100th percentile service time | large_prohibited_terms |      660.06 |      ms |
|   All |                           error rate | large_prohibited_terms |           0 |       % |


The performance test data of ES instance with 3 nodes and the specification of 4-core 16G are as follows:

|   Lap |                               Metric |                   Task |       Value |    Unit |
|------:|-------------------------------------:|-----------------------:|------------:|--------:|
|   All |                  Total indexing time |                        |     23.6021 |     min |
|   All |          Min indexing time per shard |                        |  0.00103333 |     min |
|   All |       Median indexing time per shard |                        |     4.84163 |     min |
|   All |          Max indexing time per shard |                        |     4.94317 |     min |
|   All |                     Total merge time |                        |     9.11618 |     min |
|   All |             Min merge time per shard |                        |           0 |     min |
|   All |          Median merge time per shard |                        |     1.79627 |     min |
|   All |             Max merge time per shard |                        |     1.91805 |     min |
|   All |            Total merge throttle time |                        |     1.53475 |     min |
|   All |    Min merge throttle time per shard |                        |           0 |     min |
|   All | Median merge throttle time per shard |                        |      0.3001 |     min |
|   All |    Max merge throttle time per shard |                        |     0.32955 |     min |
|   All |                   Total refresh time |                        |      1.2159 |     min |
|   All |           Min refresh time per shard |                        |  0.00108333 |     min |
|   All |        Median refresh time per shard |                        |    0.232375 |     min |
|   All |           Max refresh time per shard |                        |    0.269083 |     min |
|   All |                     Total flush time |                        |    0.320833 |     min |
|   All |             Min flush time per shard |                        |      0.0002 |     min |
|   All |          Median flush time per shard |                        |   0.0578167 |     min |
|   All |             Max flush time per shard |                        |   0.0775833 |     min |
|   All |                   Total Young Gen GC |                        |       9.235 |       s |
|   All |                     Total Old Gen GC |                        |       0.139 |       s |
|   All |                           Store size |                        |     3.41895 |      GB |
|   All |                        Translog size |                        | 2.80328e-07 |      GB |
|   All |               Heap used for segments |                        |     18.7536 |      MB |
|   All |             Heap used for doc values |                        |    0.125286 |      MB |
|   All |                  Heap used for terms |                        |     17.5401 |      MB |
|   All |                  Heap used for norms |                        |    0.074646 |      MB |
|   All |                 Heap used for points |                        |    0.218398 |      MB |
|   All |          Heap used for stored fields |                        |    0.795219 |      MB |
|   All |                        Segment count |                        |          99 |         |
|   All |                       Min Throughput |           index-append |      128637 |  docs/s |
|   All |                    Median Throughput |           index-append |      130872 |  docs/s |
|   All |                       Max Throughput |           index-append |      133826 |  docs/s |
|   All |              50th percentile latency |           index-append |     277.648 |      ms |
|   All |              90th percentile latency |           index-append |     394.701 |      ms |
|   All |              99th percentile latency |           index-append |     543.887 |      ms |
|   All |            99.9th percentile latency |           index-append |      636.84 |      ms |
|   All |             100th percentile latency |           index-append |     823.639 |      ms |
|   All |         50th percentile service time |           index-append |     277.648 |      ms |
|   All |         90th percentile service time |           index-append |     394.701 |      ms |
|   All |         99th percentile service time |           index-append |     543.887 |      ms |
|   All |       99.9th percentile service time |           index-append |      636.84 |      ms |
|   All |        100th percentile service time |           index-append |     823.639 |      ms |
|   All |                           error rate |           index-append |           0 |       % |
|   All |                       Min Throughput |            index-stats |      100.06 |   ops/s |
|   All |                    Median Throughput |            index-stats |      100.09 |   ops/s |
|   All |                       Max Throughput |            index-stats |      100.14 |   ops/s |
|   All |              50th percentile latency |            index-stats |     1.80275 |      ms |
|   All |              90th percentile latency |            index-stats |     2.01461 |      ms |
|   All |              99th percentile latency |            index-stats |     3.01406 |      ms |
|   All |            99.9th percentile latency |            index-stats |     12.7938 |      ms |
|   All |             100th percentile latency |            index-stats |     14.9448 |      ms |
|   All |         50th percentile service time |            index-stats |     1.71207 |      ms |
|   All |         90th percentile service time |            index-stats |      1.9216 |      ms |
|   All |         99th percentile service time |            index-stats |     2.73863 |      ms |
|   All |       99.9th percentile service time |            index-stats |     9.60035 |      ms |
|   All |        100th percentile service time |            index-stats |     14.8721 |      ms |
|   All |                           error rate |            index-stats |           0 |       % |
|   All |                       Min Throughput |             node-stats |      100.08 |   ops/s |
|   All |                    Median Throughput |             node-stats |      100.14 |   ops/s |
|   All |                       Max Throughput |             node-stats |      100.78 |   ops/s |
|   All |              50th percentile latency |             node-stats |     2.28203 |      ms |
|   All |              90th percentile latency |             node-stats |     2.56399 |      ms |
|   All |              99th percentile latency |             node-stats |     12.3799 |      ms |
|   All |            99.9th percentile latency |             node-stats |      13.993 |      ms |
|   All |             100th percentile latency |             node-stats |     14.4745 |      ms |
|   All |         50th percentile service time |             node-stats |     2.19141 |      ms |
|   All |         90th percentile service time |             node-stats |     2.43949 |      ms |
|   All |         99th percentile service time |             node-stats |     12.1121 |      ms |
|   All |       99.9th percentile service time |             node-stats |     12.8017 |      ms |
|   All |        100th percentile service time |             node-stats |     13.0204 |      ms |
|   All |                           error rate |             node-stats |           0 |       % |
|   All |                       Min Throughput |                default |       46.02 |   ops/s |
|   All |                    Median Throughput |                default |       46.11 |   ops/s |
|   All |                       Max Throughput |                default |       46.14 |   ops/s |
|   All |              50th percentile latency |                default |     1717.77 |      ms |
|   All |              90th percentile latency |                default |      2381.5 |      ms |
|   All |              99th percentile latency |                default |     2536.08 |      ms |
|   All |            99.9th percentile latency |                default |     2546.88 |      ms |
|   All |             100th percentile latency |                default |     2547.88 |      ms |
|   All |         50th percentile service time |                default |     21.8223 |      ms |
|   All |         90th percentile service time |                default |     22.4148 |      ms |
|   All |         99th percentile service time |                default |     23.9276 |      ms |
|   All |       99.9th percentile service time |                default |      25.643 |      ms |
|   All |        100th percentile service time |                default |     27.0261 |      ms |
|   All |                           error rate |                default |           0 |       % |
|   All |                       Min Throughput |                   term |      200.11 |   ops/s |
|   All |                    Median Throughput |                   term |      200.15 |   ops/s |
|   All |                       Max Throughput |                   term |      200.26 |   ops/s |
|   All |              50th percentile latency |                   term |     1.12038 |      ms |
|   All |              90th percentile latency |                   term |     1.20842 |      ms |
|   All |              99th percentile latency |                   term |     1.42328 |      ms |
|   All |            99.9th percentile latency |                   term |     4.36675 |      ms |
|   All |             100th percentile latency |                   term |     7.96463 |      ms |
|   All |         50th percentile service time |                   term |     1.05568 |      ms |
|   All |         90th percentile service time |                   term |     1.13993 |      ms |
|   All |         99th percentile service time |                   term |     1.34708 |      ms |
|   All |       99.9th percentile service time |                   term |     1.66427 |      ms |
|   All |        100th percentile service time |                   term |     1.91011 |      ms |
|   All |                           error rate |                   term |           0 |       % |
|   All |                       Min Throughput |                 phrase |      200.09 |   ops/s |
|   All |                    Median Throughput |                 phrase |      200.13 |   ops/s |
|   All |                       Max Throughput |                 phrase |      200.21 |   ops/s |
|   All |              50th percentile latency |                 phrase |     1.78378 |      ms |
|   All |              90th percentile latency |                 phrase |      2.0071 |      ms |
|   All |              99th percentile latency |                 phrase |     5.97353 |      ms |
|   All |            99.9th percentile latency |                 phrase |     12.3991 |      ms |
|   All |             100th percentile latency |                 phrase |     15.5448 |      ms |
|   All |         50th percentile service time |                 phrase |     1.71358 |      ms |
|   All |         90th percentile service time |                 phrase |     1.92839 |      ms |
|   All |         99th percentile service time |                 phrase |      2.5939 |      ms |
|   All |       99.9th percentile service time |                 phrase |     9.76056 |      ms |
|   All |        100th percentile service time |                 phrase |     15.4822 |      ms |
|   All |                           error rate |                 phrase |           0 |       % |
|   All |                       Min Throughput |   country_agg_uncached |        4.82 |   ops/s |
|   All |                    Median Throughput |   country_agg_uncached |        4.83 |   ops/s |
|   All |                       Max Throughput |   country_agg_uncached |        4.83 |   ops/s |
|   All |              50th percentile latency |   country_agg_uncached |     1978.21 |      ms |
|   All |              90th percentile latency |   country_agg_uncached |     2209.06 |      ms |
|   All |              99th percentile latency |   country_agg_uncached |     2268.16 |      ms |
|   All |             100th percentile latency |   country_agg_uncached |     2273.34 |      ms |
|   All |         50th percentile service time |   country_agg_uncached |     205.774 |      ms |
|   All |         90th percentile service time |   country_agg_uncached |     208.002 |      ms |
|   All |         99th percentile service time |   country_agg_uncached |     214.056 |      ms |
|   All |        100th percentile service time |   country_agg_uncached |     215.839 |      ms |
|   All |                           error rate |   country_agg_uncached |           0 |       % |
|   All |                       Min Throughput |     country_agg_cached |      100.06 |   ops/s |
|   All |                    Median Throughput |     country_agg_cached |      100.09 |   ops/s |
|   All |                       Max Throughput |     country_agg_cached |      100.15 |   ops/s |
|   All |              50th percentile latency |     country_agg_cached |     1.46253 |      ms |
|   All |              90th percentile latency |     country_agg_cached |     1.72566 |      ms |
|   All |              99th percentile latency |     country_agg_cached |     2.05252 |      ms |
|   All |            99.9th percentile latency |     country_agg_cached |     2.41064 |      ms |
|   All |             100th percentile latency |     country_agg_cached |     10.3264 |      ms |
|   All |         50th percentile service time |     country_agg_cached |     1.36585 |      ms |
|   All |         90th percentile service time |     country_agg_cached |     1.61544 |      ms |
|   All |         99th percentile service time |     country_agg_cached |     1.94105 |      ms |
|   All |       99.9th percentile service time |     country_agg_cached |     2.31253 |      ms |
|   All |        100th percentile service time |     country_agg_cached |       10.25 |      ms |
|   All |                           error rate |     country_agg_cached |           0 |       % |
|   All |                       Min Throughput |                 scroll |       25.04 | pages/s |
|   All |                    Median Throughput |                 scroll |       25.06 | pages/s |
|   All |                       Max Throughput |                 scroll |       25.07 | pages/s |
|   All |              50th percentile latency |                 scroll |     435.013 |      ms |
|   All |              90th percentile latency |                 scroll |     452.813 |      ms |
|   All |              99th percentile latency |                 scroll |     475.533 |      ms |
|   All |             100th percentile latency |                 scroll |     550.297 |      ms |
|   All |         50th percentile service time |                 scroll |     434.338 |      ms |
|   All |         90th percentile service time |                 scroll |     452.204 |      ms |
|   All |         99th percentile service time |                 scroll |      474.87 |      ms |
|   All |        100th percentile service time |                 scroll |     549.649 |      ms |
|   All |                           error rate |                 scroll |           0 |       % |
|   All |                       Min Throughput |             expression |           2 |   ops/s |
|   All |                    Median Throughput |             expression |           2 |   ops/s |
|   All |                       Max Throughput |             expression |           2 |   ops/s |
|   All |              50th percentile latency |             expression |     478.607 |      ms |
|   All |              90th percentile latency |             expression |     485.778 |      ms |
|   All |              99th percentile latency |             expression |     492.306 |      ms |
|   All |             100th percentile latency |             expression |     503.223 |      ms |
|   All |         50th percentile service time |             expression |     478.486 |      ms |
|   All |         90th percentile service time |             expression |     485.654 |      ms |
|   All |         99th percentile service time |             expression |     492.207 |      ms |
|   All |        100th percentile service time |             expression |     503.141 |      ms |
|   All |                           error rate |             expression |           0 |       % |
|   All |                       Min Throughput |        painless_static |         1.5 |   ops/s |
|   All |                    Median Throughput |        painless_static |         1.5 |   ops/s |
|   All |                       Max Throughput |        painless_static |         1.5 |   ops/s |
|   All |              50th percentile latency |        painless_static |     597.387 |      ms |
|   All |              90th percentile latency |        painless_static |     608.432 |      ms |
|   All |              99th percentile latency |        painless_static |     881.392 |      ms |
|   All |             100th percentile latency |        painless_static |     949.014 |      ms |
|   All |         50th percentile service time |        painless_static |     597.067 |      ms |
|   All |         90th percentile service time |        painless_static |     607.019 |      ms |
|   All |         99th percentile service time |        painless_static |     615.067 |      ms |
|   All |        100th percentile service time |        painless_static |     948.849 |      ms |
|   All |                           error rate |        painless_static |           0 |       % |
|   All |                       Min Throughput |       painless_dynamic |         1.5 |   ops/s |
|   All |                    Median Throughput |       painless_dynamic |         1.5 |   ops/s |
|   All |                       Max Throughput |       painless_dynamic |         1.5 |   ops/s |
|   All |              50th percentile latency |       painless_dynamic |     572.463 |      ms |
|   All |              90th percentile latency |       painless_dynamic |     579.477 |      ms |
|   All |              99th percentile latency |       painless_dynamic |     612.597 |      ms |
|   All |             100th percentile latency |       painless_dynamic |     618.297 |      ms |
|   All |         50th percentile service time |       painless_dynamic |     572.314 |      ms |
|   All |         90th percentile service time |       painless_dynamic |     579.316 |      ms |
|   All |         99th percentile service time |       painless_dynamic |     612.443 |      ms |
|   All |        100th percentile service time |       painless_dynamic |     618.049 |      ms |
|   All |                           error rate |       painless_dynamic |           0 |       % |
|   All |                       Min Throughput |   large_filtered_terms |        1.56 |   ops/s |
|   All |                    Median Throughput |   large_filtered_terms |        1.56 |   ops/s |
|   All |                       Max Throughput |   large_filtered_terms |        1.56 |   ops/s |
|   All |              50th percentile latency |   large_filtered_terms |     36193.2 |      ms |
|   All |              90th percentile latency |   large_filtered_terms |     41842.8 |      ms |
|   All |              99th percentile latency |   large_filtered_terms |       43112 |      ms |
|   All |             100th percentile latency |   large_filtered_terms |     43244.9 |      ms |
|   All |         50th percentile service time |   large_filtered_terms |     645.955 |      ms |
|   All |         90th percentile service time |   large_filtered_terms |     667.741 |      ms |
|   All |         99th percentile service time |   large_filtered_terms |      690.45 |      ms |
|   All |        100th percentile service time |   large_filtered_terms |     695.496 |      ms |
|   All |                           error rate |   large_filtered_terms |           0 |       % |
|   All |                       Min Throughput | large_prohibited_terms |        1.58 |   ops/s |
|   All |                    Median Throughput | large_prohibited_terms |        1.58 |   ops/s |
|   All |                       Max Throughput | large_prohibited_terms |        1.59 |   ops/s |
|   All |              50th percentile latency | large_prohibited_terms |     33462.5 |      ms |
|   All |              90th percentile latency | large_prohibited_terms |     38287.2 |      ms |
|   All |              99th percentile latency | large_prohibited_terms |     39492.2 |      ms |
|   All |             100th percentile latency | large_prohibited_terms |     39642.7 |      ms |
|   All |         50th percentile service time | large_prohibited_terms |     630.802 |      ms |
|   All |         90th percentile service time | large_prohibited_terms |     658.107 |      ms |
|   All |         99th percentile service time | large_prohibited_terms |     690.189 |      ms |
|   All |        100th percentile service time | large_prohibited_terms |     692.859 |      ms |
|   All |                           error rate | large_prohibited_terms |           0 |       % |


The comparison result of two performance tests is as follows:

|                               Metric |                   Task |    Baseline |   Contender |     Diff |    Unit |
|-------------------------------------:|-----------------------:|------------:|------------:|---------:|--------:|
|                  Total indexing time |                        |     23.6021 |     24.0342 |  0.43208 |     min |
|          Min indexing time per shard |                        |  0.00103333 | 0.000766667 | -0.00027 |     min |
|       Median indexing time per shard |                        |     4.84163 |     4.89164 |  0.05001 |     min |
|          Max indexing time per shard |                        |     4.94317 |     5.07303 |  0.12987 |     min |
|                     Total merge time |                        |     9.11618 |     9.07312 | -0.04307 |     min |
|             Min merge time per shard |                        |           0 |           0 |        0 |     min |
|          Median merge time per shard |                        |     1.79627 |     1.83392 |  0.03765 |     min |
|             Max merge time per shard |                        |     1.91805 |     1.89142 | -0.02663 |     min |
|            Total merge throttle time |                        |     1.53475 |     1.47122 | -0.06353 |     min |
|    Min merge throttle time per shard |                        |           0 |           0 |        0 |     min |
| Median merge throttle time per shard |                        |      0.3001 |    0.288592 | -0.01151 |     min |
|    Max merge throttle time per shard |                        |     0.32955 |     0.35915 |   0.0296 |     min |
|                   Total refresh time |                        |      1.2159 |     1.26367 |  0.04777 |     min |
|           Min refresh time per shard |                        |  0.00108333 |     0.00105 |   -3e-05 |     min |
|        Median refresh time per shard |                        |    0.232375 |    0.248583 |  0.01621 |     min |
|           Max refresh time per shard |                        |    0.269083 |    0.278817 |  0.00973 |     min |
|                     Total flush time |                        |    0.320833 |      0.2837 | -0.03713 |     min |
|             Min flush time per shard |                        |      0.0002 |           0 |  -0.0002 |     min |
|          Median flush time per shard |                        |   0.0578167 |    0.052725 | -0.00509 |     min |
|             Max flush time per shard |                        |   0.0775833 |   0.0722667 | -0.00532 |     min |
|                   Total Young Gen GC |                        |       9.235 |       9.543 |    0.308 |       s |
|                     Total Old Gen GC |                        |       0.139 |       1.188 |    1.049 |       s |
|                           Store size |                        |     3.41895 |     3.41974 |  0.00079 |      GB |
|                        Translog size |                        | 2.80328e-07 | 2.80328e-07 |        0 |      GB |
|               Heap used for segments |                        |     18.7536 |     18.7004 | -0.05322 |      MB |
|             Heap used for doc values |                        |    0.125286 |    0.109951 | -0.01534 |      MB |
|                  Heap used for terms |                        |     17.5401 |     17.5025 | -0.03756 |      MB |
|                  Heap used for norms |                        |    0.074646 |   0.0725098 | -0.00214 |      MB |
|                 Heap used for points |                        |    0.218398 |     0.21654 | -0.00186 |      MB |
|          Heap used for stored fields |                        |    0.795219 |    0.798889 |  0.00367 |      MB |
|                        Segment count |                        |          99 |          97 |       -2 |         |
|                       Min Throughput |           index-append |      128637 |      126366 | -2271.05 |  docs/s |
|                    Median Throughput |           index-append |      130872 |      130938 |  66.2306 |  docs/s |
|                       Max Throughput |           index-append |      133826 |      134976 |  1149.62 |  docs/s |
|              50th percentile latency |           index-append |     277.648 |      278.76 |  1.11145 |      ms |
|              90th percentile latency |           index-append |     394.701 |     404.473 |  9.77191 |      ms |
|              99th percentile latency |           index-append |     543.887 |     547.389 |  3.50215 |      ms |
|            99.9th percentile latency |           index-append |      636.84 |     642.308 |  5.46754 |      ms |
|             100th percentile latency |           index-append |     823.639 |     1071.42 |  247.779 |      ms |
|         50th percentile service time |           index-append |     277.648 |      278.76 |  1.11145 |      ms |
|         90th percentile service time |           index-append |     394.701 |     404.473 |  9.77191 |      ms |
|         99th percentile service time |           index-append |     543.887 |     547.389 |  3.50215 |      ms |
|       99.9th percentile service time |           index-append |      636.84 |     642.308 |  5.46754 |      ms |
|        100th percentile service time |           index-append |     823.639 |     1071.42 |  247.779 |      ms |
|                           error rate |           index-append |           0 |           0 |        0 |       % |
|                       Min Throughput |            index-stats |     100.059 |     100.051 | -0.00809 |   ops/s |
|                    Median Throughput |            index-stats |     100.087 |     100.084 | -0.00308 |   ops/s |
|                       Max Throughput |            index-stats |      100.14 |     100.164 |  0.02401 |   ops/s |
|              50th percentile latency |            index-stats |     1.80275 |     1.93088 |  0.12813 |      ms |
|              90th percentile latency |            index-stats |     2.01461 |     2.19195 |  0.17734 |      ms |
|              99th percentile latency |            index-stats |     3.01406 |     2.90881 | -0.10525 |      ms |
|            99.9th percentile latency |            index-stats |     12.7938 |     8.87853 | -3.91528 |      ms |
|             100th percentile latency |            index-stats |     14.9448 |     16.7437 |  1.79889 |      ms |
|         50th percentile service time |            index-stats |     1.71207 |      1.8543 |  0.14223 |      ms |
|         90th percentile service time |            index-stats |      1.9216 |     2.10295 |  0.18136 |      ms |
|         99th percentile service time |            index-stats |     2.73863 |     2.82084 |  0.08221 |      ms |
|       99.9th percentile service time |            index-stats |     9.60035 |     7.26796 | -2.33239 |      ms |
|        100th percentile service time |            index-stats |     14.8721 |     16.6655 |  1.79345 |      ms |
|                           error rate |            index-stats |           0 |           0 |        0 |       % |
|                       Min Throughput |             node-stats |     100.077 |     100.075 | -0.00236 |   ops/s |
|                    Median Throughput |             node-stats |     100.143 |     100.139 | -0.00432 |   ops/s |
|                       Max Throughput |             node-stats |     100.776 |     100.742 | -0.03413 |   ops/s |
|              50th percentile latency |             node-stats |     2.28203 |     2.47716 |  0.19513 |      ms |
|              90th percentile latency |             node-stats |     2.56399 |     2.71357 |  0.14959 |      ms |
|              99th percentile latency |             node-stats |     12.3799 |     13.2403 |  0.86039 |      ms |
|            99.9th percentile latency |             node-stats |      13.993 |     14.7591 |  0.76611 |      ms |
|             100th percentile latency |             node-stats |     14.4745 |     15.1666 |  0.69211 |      ms |
|         50th percentile service time |             node-stats |     2.19141 |     2.37679 |  0.18538 |      ms |
|         90th percentile service time |             node-stats |     2.43949 |     2.60474 |  0.16525 |      ms |
|         99th percentile service time |             node-stats |     12.1121 |     12.3012 |  0.18902 |      ms |
|       99.9th percentile service time |             node-stats |     12.8017 |     13.2979 |  0.49615 |      ms |
|        100th percentile service time |             node-stats |     13.0204 |     14.4364 |    1.416 |      ms |
|                           error rate |             node-stats |           0 |           0 |        0 |       % |
|                       Min Throughput |                default |     46.0204 |     46.0922 |  0.07179 |   ops/s |
|                    Median Throughput |                default |     46.1078 |     46.1749 |  0.06714 |   ops/s |
|                       Max Throughput |                default |     46.1356 |     46.2367 |  0.10111 |   ops/s |
|              50th percentile latency |                default |     1717.77 |     1712.33 | -5.43926 |      ms |
|              90th percentile latency |                default |      2381.5 |     2319.36 | -62.1379 |      ms |
|              99th percentile latency |                default |     2536.08 |     2482.24 | -53.8371 |      ms |
|            99.9th percentile latency |                default |     2546.88 |     2489.96 |  -56.924 |      ms |
|             100th percentile latency |                default |     2547.88 |     2491.03 | -56.8538 |      ms |
|         50th percentile service time |                default |     21.8223 |     21.3526 | -0.46978 |      ms |
|         90th percentile service time |                default |     22.4148 |     22.2536 | -0.16116 |      ms |
|         99th percentile service time |                default |     23.9276 |     26.1064 |  2.17885 |      ms |
|       99.9th percentile service time |                default |      25.643 |     38.2416 |  12.5986 |      ms |
|        100th percentile service time |                default |     27.0261 |     38.7758 |  11.7497 |      ms |
|                           error rate |                default |           0 |           0 |        0 |       % |
|                       Min Throughput |                   term |     200.111 |     200.108 | -0.00253 |   ops/s |
|                    Median Throughput |                   term |     200.154 |     200.152 | -0.00239 |   ops/s |
|                       Max Throughput |                   term |      200.26 |     200.249 | -0.01045 |   ops/s |
|              50th percentile latency |                   term |     1.12038 |     1.23644 |  0.11607 |      ms |
|              90th percentile latency |                   term |     1.20842 |       1.342 |  0.13358 |      ms |
|              99th percentile latency |                   term |     1.42328 |      1.6352 |  0.21192 |      ms |
|            99.9th percentile latency |                   term |     4.36675 |     3.76925 |  -0.5975 |      ms |
|             100th percentile latency |                   term |     7.96463 |     7.55672 | -0.40791 |      ms |
|         50th percentile service time |                   term |     1.05568 |     1.16165 |  0.10597 |      ms |
|         90th percentile service time |                   term |     1.13993 |     1.25623 |   0.1163 |      ms |
|         99th percentile service time |                   term |     1.34708 |     1.56184 |  0.21476 |      ms |
|       99.9th percentile service time |                   term |     1.66427 |     1.74419 |  0.07993 |      ms |
|        100th percentile service time |                   term |     1.91011 |     1.75608 | -0.15403 |      ms |
|                           error rate |                   term |           0 |           0 |        0 |       % |
|                       Min Throughput |                 phrase |      200.09 |     200.095 |  0.00517 |   ops/s |
|                    Median Throughput |                 phrase |     200.131 |     200.133 |  0.00144 |   ops/s |
|                       Max Throughput |                 phrase |     200.215 |     200.222 |  0.00665 |   ops/s |
|              50th percentile latency |                 phrase |     1.78378 |     1.70826 | -0.07553 |      ms |
|              90th percentile latency |                 phrase |      2.0071 |     1.86393 | -0.14317 |      ms |
|              99th percentile latency |                 phrase |     5.97353 |      4.4289 | -1.54463 |      ms |
|            99.9th percentile latency |                 phrase |     12.3991 |     14.5744 |  2.17522 |      ms |
|             100th percentile latency |                 phrase |     15.5448 |     15.1789 | -0.36591 |      ms |
|         50th percentile service time |                 phrase |     1.71358 |     1.63952 | -0.07406 |      ms |
|         90th percentile service time |                 phrase |     1.92839 |     1.78439 | -0.14401 |      ms |
|         99th percentile service time |                 phrase |      2.5939 |     2.05865 | -0.53525 |      ms |
|       99.9th percentile service time |                 phrase |     9.76056 |     14.5113 |  4.75076 |      ms |
|        100th percentile service time |                 phrase |     15.4822 |     15.1151 | -0.36707 |      ms |
|                           error rate |                 phrase |           0 |           0 |        0 |       % |
|                       Min Throughput |   country_agg_uncached |     4.82362 |     4.56486 | -0.25876 |   ops/s |
|                    Median Throughput |   country_agg_uncached |     4.82862 |     4.56885 | -0.25977 |   ops/s |
|                       Max Throughput |   country_agg_uncached |     4.83299 |     4.57095 | -0.26204 |   ops/s |
|              50th percentile latency |   country_agg_uncached |     1978.21 |      4929.6 |  2951.39 |      ms |
|              90th percentile latency |   country_agg_uncached |     2209.06 |     5655.55 |  3446.48 |      ms |
|              99th percentile latency |   country_agg_uncached |     2268.16 |      5811.4 |  3543.24 |      ms |
|             100th percentile latency |   country_agg_uncached |     2273.34 |     5827.97 |  3554.63 |      ms |
|         50th percentile service time |   country_agg_uncached |     205.774 |     217.388 |  11.6143 |      ms |
|         90th percentile service time |   country_agg_uncached |     208.002 |     220.945 |  12.9421 |      ms |
|         99th percentile service time |   country_agg_uncached |     214.056 |     227.139 |  13.0826 |      ms |
|        100th percentile service time |   country_agg_uncached |     215.839 |     241.988 |  26.1492 |      ms |
|                           error rate |   country_agg_uncached |           0 |           0 |        0 |       % |
|                       Min Throughput |     country_agg_cached |     100.061 |     100.062 |   0.0009 |   ops/s |
|                    Median Throughput |     country_agg_cached |      100.09 |      100.09 |  0.00011 |   ops/s |
|                       Max Throughput |     country_agg_cached |     100.154 |      100.17 |  0.01611 |   ops/s |
|              50th percentile latency |     country_agg_cached |     1.46253 |     1.48535 |  0.02282 |      ms |
|              90th percentile latency |     country_agg_cached |     1.72566 |     1.66624 | -0.05942 |      ms |
|              99th percentile latency |     country_agg_cached |     2.05252 |     1.99591 | -0.05661 |      ms |
|            99.9th percentile latency |     country_agg_cached |     2.41064 |     2.41961 |  0.00897 |      ms |
|             100th percentile latency |     country_agg_cached |     10.3264 |     3.13034 | -7.19609 |      ms |
|         50th percentile service time |     country_agg_cached |     1.36585 |      1.3688 |  0.00296 |      ms |
|         90th percentile service time |     country_agg_cached |     1.61544 |     1.55639 | -0.05905 |      ms |
|         99th percentile service time |     country_agg_cached |     1.94105 |     1.86155 |  -0.0795 |      ms |
|       99.9th percentile service time |     country_agg_cached |     2.31253 |     2.33655 |  0.02402 |      ms |
|        100th percentile service time |     country_agg_cached |       10.25 |     2.98781 | -7.26217 |      ms |
|                           error rate |     country_agg_cached |           0 |           0 |        0 |       % |
|                       Min Throughput |                 scroll |     25.0392 |     25.0462 |  0.00695 | pages/s |
|                    Median Throughput |                 scroll |     25.0557 |     25.0575 |   0.0018 | pages/s |
|                       Max Throughput |                 scroll |     25.0734 |       25.07 |  -0.0034 | pages/s |
|              50th percentile latency |                 scroll |     435.013 |     432.016 | -2.99698 |      ms |
|              90th percentile latency |                 scroll |     452.813 |     458.616 |   5.8024 |      ms |
|              99th percentile latency |                 scroll |     475.533 |      472.92 | -2.61283 |      ms |
|             100th percentile latency |                 scroll |     550.297 |     498.795 | -51.5016 |      ms |
|         50th percentile service time |                 scroll |     434.338 |     431.381 | -2.95693 |      ms |
|         90th percentile service time |                 scroll |     452.204 |     457.989 |  5.78516 |      ms |
|         99th percentile service time |                 scroll |      474.87 |     472.309 | -2.56081 |      ms |
|        100th percentile service time |                 scroll |     549.649 |     498.182 | -51.4667 |      ms |
|                           error rate |                 scroll |           0 |           0 |        0 |       % |
|                       Min Throughput |             expression |     1.99996 |     2.00001 |    5e-05 |   ops/s |
|                    Median Throughput |             expression |     2.00031 |     2.00025 |   -6e-05 |   ops/s |
|                       Max Throughput |             expression |      2.0005 |      2.0004 |  -0.0001 |   ops/s |
|              50th percentile latency |             expression |     478.607 |     484.102 |  5.49474 |      ms |
|              90th percentile latency |             expression |     485.778 |     491.196 |  5.41837 |      ms |
|              99th percentile latency |             expression |     492.306 |     498.786 |   6.4804 |      ms |
|             100th percentile latency |             expression |     503.223 |     499.503 | -3.71979 |      ms |
|         50th percentile service time |             expression |     478.486 |     483.978 |  5.49234 |      ms |
|         90th percentile service time |             expression |     485.654 |     491.083 |  5.42892 |      ms |
|         99th percentile service time |             expression |     492.207 |     498.615 |  6.40821 |      ms |
|        100th percentile service time |             expression |     503.141 |      499.33 |  -3.8113 |      ms |
|                           error rate |             expression |           0 |           0 |        0 |       % |
|                       Min Throughput |        painless_static |     1.49739 |     1.50048 |  0.00309 |   ops/s |
|                    Median Throughput |        painless_static |      1.5006 |     1.50068 |    8e-05 |   ops/s |
|                       Max Throughput |        painless_static |     1.50087 |     1.50089 |    2e-05 |   ops/s |
|              50th percentile latency |        painless_static |     597.387 |     591.493 | -5.89387 |      ms |
|              90th percentile latency |        painless_static |     608.432 |     599.658 | -8.77379 |      ms |
|              99th percentile latency |        painless_static |     881.392 |     605.543 | -275.849 |      ms |
|             100th percentile latency |        painless_static |     949.014 |     615.329 | -333.684 |      ms |
|         50th percentile service time |        painless_static |     597.067 |     591.353 | -5.71382 |      ms |
|         90th percentile service time |        painless_static |     607.019 |     599.527 | -7.49152 |      ms |
|         99th percentile service time |        painless_static |     615.067 |     605.384 | -9.68291 |      ms |
|        100th percentile service time |        painless_static |     948.849 |      615.21 | -333.639 |      ms |
|                           error rate |        painless_static |           0 |           0 |        0 |       % |
|                       Min Throughput |       painless_dynamic |     1.50067 |     1.50071 |    3e-05 |   ops/s |
|                    Median Throughput |       painless_dynamic |     1.50086 |      1.5009 |    4e-05 |   ops/s |
|                       Max Throughput |       painless_dynamic |      1.5011 |     1.50121 |   0.0001 |   ops/s |
|              50th percentile latency |       painless_dynamic |     572.463 |      566.05 | -6.41367 |      ms |
|              90th percentile latency |       painless_dynamic |     579.477 |     572.654 | -6.82253 |      ms |
|              99th percentile latency |       painless_dynamic |     612.597 |     585.029 | -27.5679 |      ms |
|             100th percentile latency |       painless_dynamic |     618.297 |     585.476 | -32.8209 |      ms |
|         50th percentile service time |       painless_dynamic |     572.314 |      565.87 | -6.44387 |      ms |
|         90th percentile service time |       painless_dynamic |     579.316 |     572.505 | -6.81055 |      ms |
|         99th percentile service time |       painless_dynamic |     612.443 |     584.668 | -27.7749 |      ms |
|        100th percentile service time |       painless_dynamic |     618.049 |     585.329 | -32.7194 |      ms |
|                           error rate |       painless_dynamic |           0 |           0 |        0 |       % |
|                       Min Throughput |   large_filtered_terms |     1.55616 |     1.60519 |  0.04903 |   ops/s |
|                    Median Throughput |   large_filtered_terms |     1.55696 |     1.60601 |  0.04905 |   ops/s |
|                       Max Throughput |   large_filtered_terms |     1.55977 |     1.60953 |  0.04976 |   ops/s |
|              50th percentile latency |   large_filtered_terms |     36193.2 |     31284.9 | -4908.29 |      ms |
|              90th percentile latency |   large_filtered_terms |     41842.8 |       35859 | -5983.78 |      ms |
|              99th percentile latency |   large_filtered_terms |       43112 |     36773.4 | -6338.65 |      ms |
|             100th percentile latency |   large_filtered_terms |     43244.9 |     36889.3 | -6355.57 |      ms |
|         50th percentile service time |   large_filtered_terms |     645.955 |     618.892 | -27.0622 |      ms |
|         90th percentile service time |   large_filtered_terms |     667.741 |     630.125 | -37.6153 |      ms |
|         99th percentile service time |   large_filtered_terms |      690.45 |     685.957 | -4.49316 |      ms |
|        100th percentile service time |   large_filtered_terms |     695.496 |     822.781 |  127.285 |      ms |
|                           error rate |   large_filtered_terms |           0 |           0 |        0 |       % |
|                       Min Throughput | large_prohibited_terms |     1.58108 |     1.66985 |  0.08877 |   ops/s |
|                    Median Throughput | large_prohibited_terms |     1.58397 |     1.67534 |  0.09137 |   ops/s |
|                       Max Throughput | large_prohibited_terms |     1.58661 |     1.67677 |  0.09017 |   ops/s |
|              50th percentile latency | large_prohibited_terms |     33462.5 |     24776.7 |  -8685.8 |      ms |
|              90th percentile latency | large_prohibited_terms |     38287.2 |     28568.1 | -9719.17 |      ms |
|              99th percentile latency | large_prohibited_terms |     39492.2 |     29540.7 |  -9951.4 |      ms |
|             100th percentile latency | large_prohibited_terms |     39642.7 |     29634.8 |   -10008 |      ms |
|         50th percentile service time | large_prohibited_terms |     630.802 |     599.963 | -30.8396 |      ms |
|         90th percentile service time | large_prohibited_terms |     658.107 |     612.354 | -45.7534 |      ms |
|         99th percentile service time | large_prohibited_terms |     690.189 |     644.354 | -45.8351 |      ms |
|        100th percentile service time | large_prohibited_terms |     692.859 |      660.06 | -32.7991 |      ms |
|                           error rate | large_prohibited_terms |           0 |           0 |        0 |       % |
