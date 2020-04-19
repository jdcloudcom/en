# Cache Analysis
Cache analysis means access analysis, big Key and hot Key analysis and statistics carried to instance. Big Key, hot Key and access information are key indicators that affect the instance performance. Users can perform the performance tuning based on the analysis results. Users can set the time for daily automatic analysis or perform manual analysis in real time in the Console. The analysis process costs a while. Its duration depends on users’ Key. Please do not perform other operations during the process to prevent analysis failure. Cache analysis holds data for only one month and supports up to 12 analyses per day. The specific action steps are as follows:

1.	 Log in to [Redis Console](https://redis-console.jdcloud.com/redis)

2.	 Select a target instance and click the name of the instance to enter the Details of the instance

3.	 Click the **Cache Analysis** tag to enter the cache analysis page.
 ![缓存分析](https://github.com/jdcloudcom/cn/blob/master/image/Redis/CA1.png)

4.	 You can enable the **Analyze Automatically** button and drop down to select a time period.

 ![缓存分析](https://github.com/jdcloudcom/cn/blob/master/image/Redis/CA2.png)
 
5.	 You can also click **Analyze Manually** to perform cache analysis immediately. The analysis results can be checked only after waiting for a little while. 
 ![缓存分析](https://github.com/jdcloudcom/cn/blob/master/image/Redis/CA3.png)
 
6.	 The analysis results within one month can be searched. Select the date you want and then select the analysis results under the date.
 ![缓存分析](https://github.com/jdcloudcom/cn/blob/master/image/Redis/CA4.png)
 
 
Notes: As the versions are different, the analysis result returned by Redis 2.8 Version cannot count the memory size. Only the length of value can be displayed, and no hot Key analysis can be conducted. To check the hot Key analysis by Redis 4.0 Version, parameters of instance maxmemory-policy are required to be configured to either allkeys-lfu or volatile-lfu (the default parameters are	
volatile-lru）。
