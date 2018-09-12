## Agent Description<br>
The data bus supports data writing in the Agent mode, with the specific method for use as follows: <br><br>
1. **Download Address**<br>
https://xdata.jdcloud.com/map/spsdownload/downLoadAgent.action<br><br>
2. **Configuration Description**<br>
Unzip the downloaded Agent zip packages into the/home/flumedir path and add properties files, such as test.properties, in the conf folder, with the configuration files described in detail as follows: <br><br>
3. **Define Source**<br>
    <table>
        <tr>
            <th width="300">Attribute Name</th>
            <th width="300">Default Value</th>
            <th width="600">Description</th>
        </tr>
         <tr>
            <td>Type</td>
            <td></td>
            <td>Source Component Name</td>
        </tr>
        <tr>
            <td>filegroups</td>
            <td></td>
            <td>FilegroupName and space-separated filegroup list</td>
        </tr>
        <tr>
            <td>filegroups.</td>
            <td></td>
            <td>Specify the file path corresponding to filegroupName</td>
        </tr>
        <tr>
            <td>positionFile</td>
            <td>~/.flume/taildir_position.json</td>
            <td>Record the location of the current file access, and generates a json record and place it in the file</td>
        </tr>
        <tr>
            <td>headers..</td>
            <td></td>
            <td>Header information used to distinguish incoming data from different files</td>
        </tr>
        <tr>
            <td>byteOffsetHeader</td>
            <td>false</td>
            <td>Do you need to add a byte offset</td>
        </tr>
        <tr>
            <td>skipToEnd</td>
            <td>false</td>
            <td>Whether to skip the end of the file if no read location is recorded</td>
        </tr>
        <tr>
            <td>fileHeader</td>
            <td>false</td>
            <td>Whether to add headerKey to Event header</td>
        </tr>
        <tr>
            <td>fileHeaderKey</td>
            <td>file</td>
            <td>The key value corresponding to the file path information in event header</td>
        </tr>
    </table>
   <br>
    Configuration Example: <br>
    
    **Define the sources Name**<br>
    `streaming.sources=tailDirSrc`<br><br>
     **Define sourceype:**<br>
    TAILDIR Type: This type can read the log in the folder, and specify a folder when using, which can read all the files in the folder<br>
    `streaming.sources.tailDirSrc.type=TAILDIR`<br><br>
    exec type: Exec Source runs the given Unix command at startup and expects the process to produce contiguous data on standard output<br>
    `streaming.sources.tailDirSrc.type=exec`<br>
    `streaming.sources.tailDirSrc.command = tail -F /var/log/secure`<br>    
    **Define the file read location and storage location**
    `streaming.sources.tailDirSrc.positionFile=/home/flumedir/flumeplugin/data/taildir_position.json`<br><br>
    **Define upload file group**<br>
    `streaming.sources.tailDirSrc.filegroups=one two`<br><br>
    **Define file information separately**<br>
    `streaming.sources.tailDirSrc.filegroups.one=/home/flumedir/flumeplugin/data/test.txt`<br>
    `streaming.sources.tailDirSrc.headers.one.headerKey=one`<br><br>
    `streaming.sources.tailDirSrc.filegroups.two=/home/flumedir/flumeplugin/data/test2.txt`<br>
    `streaming.sources.tailDirSrc.headers.two.headerKey=two1`<br><br>
    **headerkeyheader**<br>
    `streaming.sources.tailDirSrc.fileHeader=true`<br><br>
    **header eventkey**<br>
    `streaming.sources.tailDirSrc.fileHeaderKey=file`<br><br>
4. **Define channel**<br>
The configuration example is as follows: <br>
**Define channel Name**<br>
`streaming.channels=memoryChannel`<br><br>
**Define the channel type, with the channel type that can be configured as memory and file, which is defined as memory here**<br>
`streaming.channels.memoryChannel.type=memory`<br><br>
**Define the size of the memory channel capacity**<br>
`streaming.channels.memoryChannel.capacity=1000`<br><br>
**Define the size of the transactionCapacity, the maximum number of event that the source ChannelProcessor can write to the channel at a time. This component is responsible for moving the event in the source to the channel in a transaction.<br>
`streaming.channels.memoryChannel.transactionCapacity =1000`<br><br>
5. **Defining sink**<br>
StreamingSink parameter description: <br>
    <table>
        <tr>
            <th width="150">Attribute Name</th>
            <th width="100">Whether it must be</th>
            <th width="600">Description</th>
        </tr>
         <tr>
            <td>Type</td>
            <td>Yes</td>
            <td>sinktype name: com.jcloud.flume.plugin.sink.streaming.StreamingSink</td>
        </tr>
        <tr>
            <td>uploadType</td>
            <td>Yes</td>
            <td>The marking is true: upload to a data stream with a schema; false: upload to a data stream without a schema</td>
        </tr>
        <tr>
            <td>appKey</td>
            <td>Yes</td>
            <td>Your JD Account App Key</td>
        </tr>
        <tr>
            <td>appSecret</td>
            <td>Yes</td>
            <td>Your JD Account App Secret</td>
        </tr>
        <tr>
            <td>streamingName</td>
            <td>Yes</td>
            <td>Upload the topic name corresponding to the data</td>
        </tr>
        <tr>
            <td>batchSize</td>
            <td>Yes</td>
            <td>Submit the quantity of information in bulk</td>
        </tr>
        <tr>
            <td>serverUrl</td>
            <td>No</td>
            <td>Upload server address corresponding to the data</td>
        </tr>
    <table>
                                
    **Name Corresponding to sink**<br>
    `streaming.sinks=streamingSink`<br><br>
    **Define the sink Type**<br>
    `streaming.sinks.streamingSink.type=com.jcloud.flume.plugin.sink.streaming.StreamingSink`<br><br>
    **Define whether scheam the uploaded exists in stream**<br>
    `streaming.sinks.streamingSink.uploadType=false`<br><br>
    **Define User Identity**<br>
    `streaming.sinks.streamingSink.appKey=＜your app key＞`<br>
    `streaming.sinks.streamingSink.appSecret=＜your app secret key＞`<br>
    `streaming.sinks.streamingSink.streamingName=＜stream bus topic name＞`<br>
    `streaming.sinks.streamingSink.batchSize=100`<br>
    `streaming.sinks.streamingSink.serverUrl=http://streamhub-gw.jcloud.com`<br><br>    
    (1)	 Public Network IP: <br>
    cn-south: http://streamhub-gw.jcloud.com<br>
    cn-north: http://hb-streamhub-gw.jcloud.com<br><br>	
    (2)	 Internal Network IP: <br>
    cn-south: streamhub-gw-inner.jcloud.com<br>
    cn-north: hb-streamhub-gw-inner.jcloud.com<br><br>
6. **Define the channel corresponding source**<br>
**sourcechannel**<br>
`streaming.sources.tailDirSrc.channels=memoryChannel`<br><br>
7. **Define the channel corresponding to sink**<br>
**sinkchannel**<br>
`streaming.sinks.streamingSink.channel=memoryChannel`<br><br>
8. **Start Agent**<br>
Note: Before starting Agent, please confirm that JDK has been properly installed and configure the environment variables. <br>
Execute the following command under the bin directory: <br>
`./flume-ng agent -nstreaming -c conf -f ../conf/test.properties -Dflume.root.logger=INFO,LOGFILE,console`<br><br>

**Tips: Common memory OOM problem solution**<br>
First limit the memory use of JVM, and then configure the JVM parameters in flume's flume-env.sh configuration file<br>
`JAVA_OPTS="-Xms1000m -Xmx1000m"`<br>
The example here is to configure 1000M, which can be flexibly configured according to the corresponding machine memory and at the same time can coordinate in modifying the capacity and transactionCapacity of the channel. If the memory of itself is small, the parameters here should be set relatively small. After configuring the parameters of the JVM, the agent should be started with the -c conf option, otherwise the configuration will not take effect. For example:  <br>
`bin/flume-ng agent -n streaming -c conf -f conf/flume-conf.properties -Dflume.root.logger=INFO,LOGFILE,console > faoling.log`<br>
Another option is that channel type uses files instead of memory, which is less efficient than using memory, and can be used flexibly according to the accrual situation, and you may consider using it if the local configuration is not high or the log generation speed is slow. <br>