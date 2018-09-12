## Input Data<br>
On the application list page, click on the created application name and go to the operation development page, as shown in below: <br>
![sc-015](https://github.com/jdcloudcom/cn/blob/edit/image/Streamcompute/SC-015.png?raw=true)<br><br>
For a complete streaming computing, it is required to define three parts. Firstly, it is required to define the “input” of the data, that is, where does the data in streaming computing come from. <br>
![sc-016](https://github.com/jdcloudcom/cn/blob/edit/image/Streamcompute/SC-016.png?raw=true)<br><br>
Click “create” to enter the input source definition page. <br>
![sc-017](https://github.com/jdcloudcom/cn/blob/edit/image/Streamcompute/SC-017.png?raw=true)<br><br>
Name: <br>
Enter the name of the source. In the later SQL statement searching for the job, the tablename in “from [tablename]” is the name which you define here. <br><br>
Source Type: <br>
You can choose the data from the “Streaming Data Bus”. In subsequent version's iteration, more abundant source type will be provided<br><br>
Topic: <br>
Topic name which you create in “Streaming Data Bus”. <br><br>
Batch Interval：<br>
Batch Interval is to generate mirco-batch (seconds) through streaming real-time data according to the time which you set here<br><br>
Message Format: <br>
Define the message format into JSON or CSV<br><br>
Separator: <br>
Define the separator of the message in streaming data bus for the analysis of data and the structured processing<br><br>
![sc-018](https://github.com/jdcloudcom/cn/blob/edit/image/Streamcompute/SC-018.png?raw=true)<br><br>
Schema: <br>
After the separator is defined, the parsed schema information shall be defined here. After the data is performed with structured processing, it can be performed with treatment and analysis in stream computing<br>
![sc-019](https://github.com/jdcloudcom/cn/blob/edit/image/Streamcompute/SC-019.png?raw=true)