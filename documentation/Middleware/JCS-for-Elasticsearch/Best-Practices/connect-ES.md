## Access Cluster
### Based On Cloud Server Access
JCS for Elasticsearch and the dependent virtual machine must be under the same VPC, so the virtual machine of the same VPC and subnet must be created first; JCS for Elasticsearch service can be accessed only after obtaining “EIP” under the virtual machine.
### Access intranet domain name through curl test
1. Ssh user name @ Public IP, enter the password.</br>
2. Access the port 9200 of JCS for Elasticsearch instance through the curl command in the Linux environment. The access example format of specified account password is curl –XGET [Intranet access domain name of instance]/_cat, and Intranet access domain name is the **Intranet access domain name** in the basic information interface of ES instance. The command examples are as follows:

```
curl -XGET es-nlb-es-kgqo8zmgcv.jvessel-open-hb.jdcloud.com:9200/_cat
```
The following responses mean successful access:
```
{
  =^.^=
/_cat/allocation
/_cat/shards
/_cat/shards/{index}
/_cat/master
/_cat/nodes
/_cat/tasks
/_cat/indices
/_cat/indices/{index}
/_cat/segments
/_cat/segments/{index}
/_cat/count
/_cat/count/{index}
/_cat/recovery
/_cat/recovery/{index}
}
```
### Import Data
1. Download the data set example (this step is required when first log in to the Virtual Machine)</br>
```
wget https://download.elastic.co/demos/kibana/gettingstarted/shakespeare.json
wget https://download.elastic.co/demos/kibana/gettingstarted/accounts.zip
wget https://download.elastic.co/demos/kibana/gettingstarted/logs.jsonl.gz
```
2. Decompress the data set example
```
unzip accounts.zip
gunzip logs.jsonl.gz
```
3. Create mapping for Shakespeare data set. The format is curl -X PUT “[Intranet access domain name of instance]/shakespeare” -H ‘Content-Type: application/json' -d'
 {
  "mappings" : {
   "_default_" : {
    "properties" : {
     "speaker" : {"type": "keyword" },
     "play_name" : {"type": "keyword" },
     "line_id" : { "type" : "integer" },
     "speech_number" : { "type" : "integer" }
    }
   }
 }
}
'. The examples are as follows:

```
curl -X PUT "es-nlb-es-u92rc1eulw.jvessel-open-hb.jdcloud.com:9200/shakespeare" -H 'Content-Type: application/json' -d' { "mappings" : { "_default_" : { "properties" : { "speaker" : {"type": "keyword" }, "play_name" : {"type": "keyword" }, "line_id" : { "type" : "integer" }, "speech_number" : { "type" : "integer" } } } } } '

 
```
The response below indicates mapping created:
```
{"acknowledged":true,"shards_acknowledged":true,"index":"shakespeare"}
```
4. Create mapping for logstash. The format is curl -X PUT “[Intranet access domain name of instance]/logstash-20181010” -H ‘Content-Type: application/json' -d'
{
  "mappings": {
    "log": {
      "properties": {
        "geo": {
          "properties": {
            "coordinates": {
              "type": "geo_point"
            }
          }
        }
      }
    }
  }
}'. The examples are as follows:

```
curl -X PUT "es-nlb-es-u92rc1eulw.jvessel-open-hb.jdcloud.com:9200/logstash-20181011" -H 'Content-Type: application/json' -d' { "mappings": { "log": { "properties": { "geo": { "properties": { "coordinates": { "type": "geo_point" } } } } } } }' 

```
5. Load the data set and check if data set is loaded. The examples are as follows:
```
curl -H 'Content-Type: application/x-ndjson' -XPOST 'es-nlb-es-u92rc1eulw.jvessel-open-hb.jdcloud.com:9200/bank/account/_bulk?pretty' --data-binary @accounts.json

curl -H 'Content-Type: application/x-ndjson' -XPOST 'es-nlb-es-u92rc1eulw.jvessel-open-hb.jdcloud.com:9200/shakespeare/_bulk?pretty' --data-binary @shakespeare.json

curl -H 'Content-Type: application/x-ndjson' -XPOST 'es-nlb-es-u92rc1eulw.jvessel-open-hb.jdcloud.com:9200/_bulk?pretty' --data-binary @logs.jsonl

curl -X GET "es-nlb-es-u92rc1eulw.jvessel-open-hb.jdcloud.com:9200/_cat/indices?v"

```
When the output similar to the following appears, the data is loaded:
```
health status index uuid pri rep docs.count docs.deleted store.size pri.store.size
green open logstash-20181010 kUP-0TEJTxCTJLRZzTGeWg  5  1          0            0      1.5kb           810b
green  open   logstash-2015.05.18 GLLhXFRhQIaEmCE-JjYUew   5   1       4631            0       65mb         32.7mb
green  open   logstash-2015.05.19 MYvyilYSRNitM1cP4cn5cQ   5   1       4624            0     63.8mb         32.4mb
green  open   bank                AI80JfMGTY2zf916VqqnmQ   5   1       1000            0      1.2mb        640.8kb
green  open   shakespeare         y9zglGy5TqmNJ-AdtQKblg   5   1     111396            0     57.8mb         29.1mb
green  open   .kibana             Wui_-I2FR0eyu2IIvf7SZQ   1   1          1            0      6.4kb          3.2kb
green  open   logstash-2015.05.20 ssOTajNfRsO0FmXMmO2qvA   5   1       4750            0     65.8mb         33.1mb

```
