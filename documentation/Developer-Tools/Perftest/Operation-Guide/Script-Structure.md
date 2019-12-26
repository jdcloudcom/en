# Script Structure
## JMETER constructs a script and uploads it to the performance test platform
Download and install JMETER in a local directory and then you can compile and debug your own scripts via JMeter. (Please use the latest JMeter 5.0 version to avoid issues caused by incompatible script versions. Installation and use are very simple. There is a quantity of tutorials)
### Script configuration description:
1. Add thread group
![](https://github.com/jdcloudcom/cn/blob/cn-perftest-v1/image/Perftest/6.png)
![](https://github.com/jdcloudcom/cn/blob/cn-perftest-v1/image/Perftest/7.png)
Parameter Description:
- Num of threads: Threads, equivalent to virtual user number
- Ramp up period: Total time required for starting all threads for the first time
- Loop count: Circulation Times
2. Add HTTP request
![](https://github.com/jdcloudcom/cn/blob/cn-perftest-v1/image/Perftest/8.png)
![](https://github.com/jdcloudcom/cn/blob/cn-perftest-v1/image/Perftest/9.png)
![](https://github.com/jdcloudcom/cn/blob/cn-perftest-v1/image/Perftest/10.png)
Parameter Description:
- Name: Request Name
- Server name or ip: Tested service domain or IP
- Path: Request Service
- Port numumber: Port Number
- Protocol: Protocol type
3. Add listener
![](https://github.com/jdcloudcom/cn/blob/cn-perftest-v1/image/Perftest/11.png)
![](https://github.com/jdcloudcom/cn/blob/cn-perftest-v1/image/Perftest/12.png)
A simple JMETER script structure is completed as above. Save the produced .jmx file and then upload it to the pressure test platform script of platform structure.
### Upload constructed JMETER script
1. Add script
![](https://github.com/jdcloudcom/cn/blob/cn-perftest-v1/image/Perftest/13.png)
2. Select script file
 ![](https://github.com/jdcloudcom/cn/blob/cn-perftest-v1/image/Perftest/14.png)
Parameter Description: 
- Task name: Test (Script) Name
- Script type (HTTP and JAVA): Now, only HTTP is supported
- Script file: Upload corresponding script files (Please upload jmx files and other CSV files necessary for test together (files not greater than 10M can be uploaded))
3. After upload is made, corresponding script information will be displayed in the script list
![](https://github.com/jdcloudcom/cn/blob/cn-perftest-v1/image/Perftest/15.png)
Operation description:
- Update script: For created scripts, script files shall be uploaded
- Execute: Execute produced scripts
- Execution history: View historical record of executed script
- Download script: Download the uploaded scripts. If the uploaded file is a single JMS file, please directly download it. If there are many files uploaded, please download them in a ZIP package
- Delete: Delete script
- Create timing: Create a timing task for this script
## Create script on-line
![](https://github.com/jdcloudcom/cn/blob/cn-perftest-v1/image/Perftest/16.png)
Parameter Description:
- Test name: test name
- Sampler name: name of a request
- Execution time interval of sampler (optional): Delay time of two requests (unit: ms)
- Method: GET/POST 
- Domain: www.baidu.com (corresponding service domain or IP)
- Port (optional): service port (80)  
- Path (optional): request path  
- BODY(form-data/raw) (optional): corresponding API parameter

Button description:
- + : Add a sampler and several samplers can be created
- Delete: Delete a sampler
- Test: Debug the API calling executed when a sampler is added
- Save: After completion, save record of a single sampler

Note: Click the upper right button to make a test before creation and creation can succeed only when the test is passed.
