# OSS Online Service Quick Verification Tools

## Introduction
JD Cloud Object Storage Service develops the service basic function verification tools based on shell script, supporting Linux, Mac OS systems and Windows by various Linux Shells; the verification scope of the tools includes:

- Basic Test: Connectivity of Online Domain Names and Basic Upload and Download Functions of Object Storage Service.

- Bandwidth Test: Upload and Download Bandwidth of Online Domain Names of Object Storage Service.

**System Demand**: Any POSIX system with bash, host, curl and openssl, which can access JD Cloud online services by Internet.

## Download and Use

### Download
Download Link: [JD Cloud OSS Online Quick Verification Tools](http://downloads.s3.cn-north-1.jcloudcs.com/tools/oss_verification_tool.tar.gz)

Take Linux for Example:

```
wget http://downloads.s3.cn-north-1.jcloudcs.com/tools/oss_verification_tool.tar.gz
tar -xzvf oss_verification_tool.tar.gz
```

### Basic Test

**Basic Test Coverage Points:**

- Standard Domain Name Resolution

- Extensive Domain Name Resolution

- Connectivity of VIPs

- Upload by Standard Domain Name

- Upload by Extensive Domain Name

- Download by Standard Domain Name and Check Data

- Download by Extensive Domain Name and Check Data

**Related Test Cases**

Related Test Case Scripts of Basic Test Locates under Directory `shest/test_suites/`
```
test_all_regions.sh
test_cn-east-1_internal.sh
test_cn-east-1.sh
test_cn-east-2_internal.sh
test_cn-east-2.sh
test_cn-north-1_internal.sh
test_cn-north-1.sh
test_cn-south-1_internal.sh
test_cn-south-1.sh
```

**Execute Basic Test** 

```
shest/test_suites/test_<region_id>.sh
```
Example:
```
shest/test_suites/test_cn-north-1.sh // Test Basic Functions of Public Network Domain Names in North China
shest/test_suites/test_cn-north-1_internal.sh // Test Basic Functions of Intranet Domain Names in North China
```

**Inspect Results of Basic Test**

Test tools will output test results summary to standard errors and finally indicate the number of successful and failed cases and the test log location. If there is no case failed (FAIL) indicated in the test results summary, you need to open the test log to check specific reasons for errors.
```
Test log: /root/shest/log/test_cn-east-1.log
--------------------------------------------------------------------------------
TC tc_oss_basic_test START @ 10/09/18-14:17:18.141
TP: tp_host_resolve  s3.cn-east-1.jcloudcs.com ... PASS
TP: tp_host_resolve  generic.s3.cn-east-1.jcloudcs.com ... PASS
TP: tp_vip_connectivity  222.187.243.43 ... PASS
TP: tp_put_object  s3.cn-east-1.jcloudcs.com/cn-east-1-simple-test ... PASS
TP: tp_put_object  cn-east-1-simple-test.s3.cn-east-1.jcloudcs.com ... PASS
TP: tp_get_object  s3.cn-east-1.jcloudcs.com/cn-east-1-simple-test/hosts ... PASS
TP: tp_get_object  cn-east-1-simple-test.s3.cn-east-1.jcloudcs.com/hosts ... PASS
TC tc_oss_basic_test END - 5 of 5 passed
--------------------------------------------------------------------------------
TC tc_oss_basic_test START @ 10/09/18-14:17:19.609
TP: tp_host_resolve  oss.cn-east-1.jcloudcs.com ... PASS
TP: tp_host_resolve  generic.oss.cn-east-1.jcloudcs.com ... PASS
TP: tp_vip_connectivity  222.187.243.43 ... PASS
TP: tp_vip_connectivity  222.187.243.47 ... PASS
TP: tp_put_object  oss.cn-east-1.jcloudcs.com/cn-east-1-simple-test ... PASS
TP: tp_put_object  cn-east-1-simple-test.oss.cn-east-1.jcloudcs.com ... PASS
TP: tp_get_object  oss.cn-east-1.jcloudcs.com/cn-east-1-simple-test/hosts ... PASS
TP: tp_get_object  cn-east-1-simple-test.oss.cn-east-1.jcloudcs.com/hosts ... PASS
TC tc_oss_basic_test END - 6 of 6 passed
--------------------------------------------------------------------------------
11 of 11 passed
Test log: /root/shest/log/test_cn-east-1.log
```

### Bandwidth Test

**Bandwidth Test Coverage Points:**

- Concurrently Upload and Obtain Throughput Data

- Concurrently Download and Obtain Throughput Data

- Delete in Batches

**Bandwidth Test Cases**

Related Test Case Scripts of Bandwidth Test Locate under Directory `shest/test_suites/`

```
test_throughput_cn-east-1.sh
test_throughput_cn-east-2.sh
test_throughput_cn-north-1.sh
test_throughput_cn-south-1.sh
```

**Execute Bandwidth Test**

```
shest/test_suites/test_throughput_<region_id>.sh
```

Example:

```
shest/test_suites/test_throughput_cn-north-1.sh // Conduct Bandwidth Test to Public Network Domain Names in North China
```

**Inspect Results of Basic Test**

Test tools will output test results summary to standard errors and finally indicate the number of successful and failed cases and the test log location. In which, the bandwidth data can be seen in the test summary.
```
Test log: /root/shest/log/test_throughput.log
--------------------------------------------------------------------------------
TC tc_oss_throughput_no_delete START @ 09/29/18-20:34:22.691
TP: tp_put_object_concurrent  s3.cn-north-1.jcloudcs.com/cn-north-1-simple-test 10485760 1 ... 13 MB/s - PASS
TP: tp_get_object_concurrent  s3.cn-north-1.jcloudcs.com/cn-north-1-simple-test 10485760 1 ... 38 MB/s - PASS
TP: tp_put_object_concurrent  s3.cn-north-1.jcloudcs.com/cn-north-1-simple-test 104857600 1 ... 17 MB/s - PASS
TP: tp_get_object_concurrent  s3.cn-north-1.jcloudcs.com/cn-north-1-simple-test 104857600 1 ... 94 MB/s - PASS
TC tc_oss_throughput_no_delete END - 4 of 4 passed
--------------------------------------------------------------------------------
TC tc_oss_throughput START @ 09/29/18-20:34:30.533
TP: tp_put_object_concurrent  s3.cn-north-1.jcloudcs.com/cn-north-1-simple-test 10485760 10 ... 91 MB/s - PASS
TP: tp_get_object_concurrent  s3.cn-north-1.jcloudcs.com/cn-north-1-simple-test 10485760 10 ... 104 MB/s - PASS
TP: tp_del_object_concurrent  s3.cn-north-1.jcloudcs.com/cn-north-1-simple-test 10485760 10 ... PASS
TP: tp_put_object_concurrent  s3.cn-north-1.jcloudcs.com/cn-north-1-simple-test 104857600 10 ... 142 MB/s - PASS
TP: tp_get_object_concurrent  s3.cn-north-1.jcloudcs.com/cn-north-1-simple-test 104857600 10 ... 223 MB/s - PASS
TP: tp_del_object_concurrent  s3.cn-north-1.jcloudcs.com/cn-north-1-simple-test 104857600 10 ... PASS
TC tc_oss_throughput END - 6 of 6 passed
--------------------------------------------------------------------------------
TC tc_oss_throughput START @ 09/29/18-20:34:44.495
TP: tp_put_object_concurrent  s3.cn-north-1.jcloudcs.com/cn-north-1-simple-test 10485760 20 ... 148 MB/s - PASS
TP: tp_get_object_concurrent  s3.cn-north-1.jcloudcs.com/cn-north-1-simple-test 10485760 20 ... 89 MB/s - PASS
TP: tp_del_object_concurrent  s3.cn-north-1.jcloudcs.com/cn-north-1-simple-test 10485760 20 ... PASS
TP: tp_put_object_concurrent  s3.cn-north-1.jcloudcs.com/cn-north-1-simple-test 104857600 20 ... 233 MB/s - PASS
TP: tp_get_object_concurrent  s3.cn-north-1.jcloudcs.com/cn-north-1-simple-test 104857600 20 ... 221 MB/s - PASS
TP: tp_del_object_concurrent  s3.cn-north-1.jcloudcs.com/cn-north-1-simple-test 104857600 20 ... PASS
TC tc_oss_throughput END - 6 of 6 passed
--------------------------------------------------------------------------------
16 of 16 passed
Test log: /root/shest/log/test_throughput.log
```

### Execute Test Cases in Batches

These tools support to execute test cases in bathes through executing `shest/test_suites/shest.sh`. You can define what test cases should be executed by editing `shest.sh`, and add or reduce the test cases to be executed by adding or noting certain “run_tc” statements.

```
run_tc tc_oss_simple_test s3.cn-north-1.jcloudcs.com cn-north-1
run_tc tc_oss_simple_test oss.cn-north-1.jcloudcs.com cn-north-1
run_tc tc_oss_simple_test s3.cn-south-1.jcloudcs.com cn-south-1
run_tc tc_oss_simple_test oss.cn-south-1.jcloudcs.com cn-south-1
run_tc tc_oss_simple_test s3.cn-east-1.jcloudcs.com cn-east-1
run_tc tc_oss_simple_test oss.cn-east-1.jcloudcs.com cn-east-1
run_tc tc_oss_simple_test s3.cn-east-2.jcloudcs.com cn-east-2
run_tc tc_oss_simple_test oss.cn-east-2.jcloudcs.com cn-east-2
run_tc tc_oss_throughput s3.cn-south-1.jcloudcs.com cn-east-1 1 $(( 10 * MB )) $(( 100 * MB ))
run_tc tc_oss_throughput s3.cn-south-1.jcloudcs.com cn-east-1 10 $(( 10 * MB )) $(( 100 * MB ))
run_tc tc_oss_throughput s3.cn-north-1.jcloudcs.com cn-east-1 1 $(( 10 * MB )) $(( 100 * MB ))
run_tc tc_oss_throughput s3.cn-north-1.jcloudcs.com cn-east-1 10 $(( 10 * MB )) $(( 100 * MB ))
run_tc tc_oss_throughput s3.cn-east-1.jcloudcs.com cn-east-1 1 $(( 10 * MB )) $(( 100 * MB ))
run_tc tc_oss_throughput s3.cn-east-1.jcloudcs.com cn-east-1 10 $(( 10 * MB )) $(( 100 * MB ))
run_tc tc_oss_throughput s3.cn-east-2.jcloudcs.com cn-east-1 1 $(( 10 * MB )) $(( 100 * MB ))
run_tc tc_oss_throughput s3.cn-east-2.jcloudcs.com cn-east-1 10 $(( 10 * MB )) $(( 100 * MB ))
```
