# Test Environment

## Test Instructions
Since there is a large number of Redis commands with different data sizes and different time for execution, the given QPS value for each specification is only provided for your reference. In actual environment, different businesses correspond to different Redis Database operating commands and different performances. The test data given in this text, as a reference value under named parameters, can only be used for a reference, and real data test on businesses is needed in actual scenarios.

## Region and Availability Zone

All tests are completed in Availability Zone A (principal) and Availability Zone C (subordinate) in cn-east-2

## Virtual Machine Configuration

- Specification and quantity: CPU64C with a memory of 256G*3

- Network type: VPC

- Operating system: centos 7.4

## Redis Instance Configuration
- Specification of Redis instance is determined based on the test object
- Object under this test is 4.0 Version, and the test results of 4.0 Version are similar to that of 2.8 Version
