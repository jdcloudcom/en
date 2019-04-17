## Data Access Cluster

ES is constructed in VPC, so that users can conveniently use various data synchronization plug-ins to connect data to ES clusters. Users can access the cluster by the way the JCS for Elasticsearch REST client writing code and access data, as well as through officially available components such as logstash and Beats to access data.


 * When the data bulk is particularly small, you can use filebeat to connect the data to the cluster.

 * When there is a certain data bulk, you can use filebeat to collect logs, send them to the logstash server, or use logstash directly to connect the data to ES cluster.

 * When the data bulk is particularly large, you can use filebeat to collect logs, send the log information to the logstash server via kafka, then connect the data to ES cluster.

![查询1](https://github.com/jdcloudcom/cn/blob/Elasticsearch/image/Internet-Middleware/JCS%20for%20Elasticsearch/logstash.png)

### Premise of Data Access
Since the ES is created in the user VPC, the user needs to create a Virtual Machine with the same VPC as the ES cluster.

### Use Beats for Connection to the Cluster
Beats contains fileBeat for collecting file type data, metricBeat for collecting monitoring indicator data, packetBeat for collecting network packet data, winlogbeat for collecting Windows system log, auditbeat for collecting audit data, and other single use collectors. These collectors are relatively lightweight compared to logstash with fewer system resources usage, can be used to collect logs, monitoring and other data. Users can also develop their own Beats components according to its own needs based on the official libbeat library.</br>

Filebeat is equivalent to a lightweight logstash. When the machine configuration or resources that you need to collect information for is not much, you can use filebeat to collect logs. The operation steps are as follows:</br>

1. Install and deploy filebeat

```
wget https://artifacts.elastic.co/downloads/beats/filebeat/filebeat-5.6.9-linux-x86_64.tar.gz
tar xvf filebeat-5.6.9.tar.gz
```

2. Edit the configuration file/filebeat/filebeat.xml

```
// Define the path of the log file
filebeat.prospectors:
- input_type: log
    paths:
    - /usr/local/services/testlogs/*.log
 
// Set IP address and port that output to ES
output.elasticsearch:
  # Array of hosts to connect to.
  hosts: ["172.16.0.39:9200"]
  ```
  
3. Execute filebeat

```
nohup ./filebeat 2>&1 >/dev/null &
```

### Use logstasg for Cluster Access
Logstash is a lightweight log collection and processing tool that uses pipeline method for data transfer, format processing, and formatted output. It is often used for log processing or for importing data of certain formats into the ES. For ES data import, you must firstly create index, mapping; index, mapping are not directly created in logstash, only index, type and other parameters are directly imported. Logstash is created by the ES mapping template, this template file does not need to specify the field, and it can be generated automatically based on input. The operation steps are as follows:

1. Install and deploy logstash and java</br>
 
 ```
wget https://artifacts.elastic.co/downloads/logstash/logstash-5.6.9.tar.gz

tar xvf logstash-5.6.9.tar.gz

yum install java-1.8.0-openjdk  java-1.8.0-openjdk-devel -y
```

2. Customize and configure the file *.conf according to the data source type.

#### File Data Source 

```
input {

    file {

        path => "/var/log/nginx/access.log" # File Path

        }

}

filter {

}

output {

  elasticsearch {

    hosts => ["http://172.16.0.89:9200"] # The Intranet VIP Address and Port of JCS for Elasticsearch cluster

    index => "nginx_access-%{+YYYY.MM.dd}" # Customize index name with the suffix of date; one index generated per day

 }

}
```


For more details, please refer to the official document [file input plugin](https://www.elastic.co/guide/en/logstash/5.6/plugins-inputs-file.html).</br>

#### Kafka Data Source
```
input{

      kafka{

        bootstrap_servers => ["172.16.16.22:9092"]

        client_id => "test"

        group_id => "test"

        auto_offset_reset => "latest" #Consume from the newest offset

        consumer_threads => 5

        decorate_events => true #This attribute will also bring the current topic, offset, group, partition and other information to the message

        topics => ["test1","test2"] #Array type, may configure multiple topics

        type => "test" #Data Source mark field

      }

}



output {

  elasticsearch {

    hosts => ["http://172.16.0.89:9200"] # The Intranet VIP Address and Port of JCS for Elasticsearch cluster

    index => "test_kafka"

 }

}
```


For more details, please refer to the official document [kafka input plugin](https://www.elastic.co/guide/en/logstash/5.6/plugins-inputs-kafka.html).</br>

3. Execute logstash</br>

```
nohup ./bin/logstash -f ~/*.conf 2>&1 >/dev/null &
```
