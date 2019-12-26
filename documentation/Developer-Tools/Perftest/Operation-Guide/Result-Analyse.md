
# Pressure Test Result Analysis
## Result Data Analysis
### Overall Data Analysis
![](https://github.com/jdcloudcom/cn/blob/cn-perftest-v1/image/Perftest/26.png)

Description: The latest processing result of test result will be refreshed 5s per time and will be updated in real time over time
Indicator Description:
- qps: Requests Processed per Second During this Test
- Success rate of verification point: return count/total number of successes in the state of true returned by JMETER within 5s, varying with time
- Success rate of return code: return count/total number of responsecode=200 returned by JMETER within 5s, varying with time
- Average return body size: average size of return body displayed within 5s (per 5s), varying with time
- Elapsed time trend chart: request period displayed within 5s (per 5s), varying with time
- Active threads of user: active threads per 5s, varying with time
### Detailed Data Analysis
![](https://github.com/jdcloudcom/cn/blob/cn-perftest-v1/image/Perftest/27.png)
Detailed data item:
- Operation page: Specific operation page corresponding to the test
- Average time: Average response time of requests on each page
- Maximum time: Maximum duration of all requests on each page
- Minimum time: Minimum duration based on all requests on each page
- Average response size: average response body size of each page
- Sample size: total requests on each page
- TP90: Based on ranking of request response time in positive sequence of each page in real time, calculate average value of top 90% data
- TP95: Based on ranking of request response time in positive sequence of each page in real time, calculate average value of top 95% data
- TP99: Based on ranking of request response time in positive sequence of each page in real time, calculate average value of top 99% data
- Variance: Calculate response time variance of each page
- Success rate of return code: the same as above, the benchmark is based on each page
- Success rate of verification point: the same as above, the benchmark is based on each page
- qps : the same as above, the benchmark is based on each page

Example Analysis
- Total throughput of 64qps (i.e., 64 request per second): The total time is 1 min and the total data volume is about: 64*60=3840; the total sample size is 826+815+465+400+866+500=3872; and the total test sample number 3872 basically conforms to 3840
- Average response time: 569ms is based on one test and the average response time of detailed information is based on each page. The average response time of detailed information is about 423. Although the statistical dimensions are different, the response time is of little difference appropriately
- Real-time samples: 323 will vary with time in real time and refer to the total sampling number of the last 5S based the entire best
- Response time decomposition: For corresponding data, please click a single corresponding data to view. Tag creation and memo list will consume the minimum response time, nearly 1S; but display of new memo and display of login page will consume the minimum response time, only dozens of milliseconds
- Average response body size: The response body size varies a lot. The created memo and the memo list are in the M level, while other operation response bodies are in K level. The average calculation response body size is about 500K
- The active concurrent number and the starting number are both set as 100, which means that the set threads are active
- The test success rate (return code 200 and success rate) shall be 100% both, based on consistent test and operation results
## Result Comparison
### Select, compare and analyze execution results of the same script
Operation access: Test script→execution history, select all or part of execution histories, click **Compare** to log in the result comparison page
![](https://github.com/jdcloudcom/cn/blob/cn-perftest-v1/image/Perftest/28.png)
![](https://github.com/jdcloudcom/cn/blob/cn-perftest-v1/image/Perftest/29.png)
## Monitoring Situation of Tested System
![](https://github.com/jdcloudcom/cn/blob/cn-perftest-v1/image/Perftest/30.png)
## Pressure Test Engine Monitoring
![](https://github.com/jdcloudcom/cn/blob/cn-perftest-v1/image/Perftest/31.png)


