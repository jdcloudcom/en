
# HTTP2 Plug-in Support
## Construct http2 sampler
Now, construction of http2 sampler shall be based on jmeter, with specific construction details below:
### Install http2 plug-in in jmeter
![](https://github.com/jdcloudcom/cn/blob/cn-perftest-v1/image/Perftest/40.png)
![](https://github.com/jdcloudcom/cn/blob/cn-perftest-v1/image/Perftest/41.png)
Description: Select "HTTP/2 sampler", select an application from the lower right and restart jmeter, then you can start to construct the http2 sampler
### Construct http2 sampler
![](https://github.com/jdcloudcom/cn/blob/ccn-perftest-v1/image/Perftest/42.png)
Description: If JDK version is higher than 1.8, http2 Request can be constructed immediately after plug-in is installed. If JDK version is 1.8 and below, the following dependency configuration shall be made
### Related dependency configuration (the following configuration is required for version lower than jdk1.8)
- jdk1.8 and below version do not support the h2 protocol and need to rely on alpn-boot.jar
It needs to be mentioned that the small version of jdk and that of alpn-boot.jar shall be in one-one correspondence. Please view the correspondence in the website: 
https://www.eclipse.org/jetty/documentation/9.4.x/alpn-chapter.html
![](https://github.com/jdcloudcom/cn/blob/cn-perftest-v1/image/Perftest/43.png)
If the jdk version is 1.8.0_161, corresponding alpn-boot version shall be 8.1.12.v20180117.
Go to https://mvnrepository.com/artifact/org.mortbay.jetty.alpn/alpn-boot  Download jar package of corresponding version and save in the local directory "apache-jmeter-5.0\lib\ext".

- Modify the jmeter.bat file and execute jvm. The configuration parameter value is the path where the alpn-boot.jar package is located
Modify jmeter.bat file in windows by adding set JVM_ARGS= -Xbootclasspath/p: in the file<path.to.jar>
For example: set JVM_ARGS= -Xbootclasspath/p:C:\Users\liqian55\Documents\software\apache-jmeter-5.0\apache-jmeter-5.0\lib\ext\alpn-boot-8.1.12.v20180117.jar
Modify jmeter.sh file in linux/macos, add set JVM_ARGS= -Xbootclasspath/p: in the file<path.to.jar>
For example: set JVM_ARGS= -Xbootclasspath/p:C:\Users\liqian55\Documents\software\apache-jmeter-5.0\apache-jmeter-5.0\lib\ext\alpn-boot-8.1.12.v20180117.jar
The jmeter.bat file is under the bin directory corresponding to the jmeter application. For example, such file is under the author’s file directory: C:\Users\liqian55\Documents\software\apache-jmeter-5.0\apache-jmeter-5.0\bin
![](https://github.com/jdcloudcom/cn/blob/cn-perftest-v1/image/Perftest/44.png)
Open the jmeter.bat file in an edition way and add jvm parameter configuration
![](https://github.com/jdcloudcom/cn/blob/cn-perftest-v1/image/Perftest/45.png)
### The h2 sampler can be constructed after the above configuration, taking m.jd.com as example
![](https://github.com/jdcloudcom/cn/blob/cn-perftest-v1/image/Perftest/46.png)
Note: protocol is https
### Execute, view result tree and request succeeds
![](https://github.com/jdcloudcom/cn/blob/cn-perftest-v1/image/Perftest/47.png)
Corresponding Data:
![](https://github.com/jdcloudcom/cn/blob/cn-perftest-v1/image/Perftest/48.png)
In addition, it shall be noted that h2 is an asynchronous protocol. This means that client does not need to wait for server response for further communication. As a result, if we intend to add assertion or postprocessor to h2 request, i.e., processing response, we need to select the check box of Synchronized Request in the h2 sampler to keep jmeter wait for response before sending more requests.



