## Access Cluster
JCS for Elasticsearch supports access to clusters via Kibana, JD Cloud Virtual Machines or Client Method.

### Access by kibana
1. Log in [JCS for Elasticsearch Console](https://es-console.jdcloud.com/clusters), [Create JCS for Elasticsearch Cluster](../Getting-Started/Create-ES.md)</br>
2. Click **Operation-kibana** to enter the kibana visual interface, and enter Developer Tools through [Dev Tools] in the navigation bar, [Access JCS for Elasticsearch Cluster](../Getting-Started/dataview.md).</br>

### Access via JD Cloud Virtual Machines
1. Log in [JCS for Elasticsearch Console](https://es-console.jdcloud.com/clusters), [Create JCS for Elasticsearch Cluster](../Getting-Started/Create-ES.md), and click the cluster name to enter the Details to obtain **Intranet Access Domain Name**.</br>
2. Log in [Virtual Machine Console](https://cns-console.jdcloud.com/host/compute/list) to create a Virtual Machine having the same VPC and Subnet with JCS for Elasticsearch Cluster and [Obtain EIP](https://docs.jdcloud.com/cn/virtual-machines/associate-elastic-ip).</br>
3. Log in Virtual Machines locally via SSH to access the port 9200 of JCS for Elasticsearch instance through the curl command. Instruction descriptions are as follows:</br>
```
ssh user name @ EIP

curl -XGET Intranet Domain Name/_cat

```
The responses below indicate successful access:
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


### Access by Client
JCS for Elasticsearch is fully compatible with native Elasticsearch, and supports all native API. Users can access Elasticsearch by using native client library, or some community-packaged library, such as spring-data-elasticsearch.</br>
1. Log in [JCS for Elasticsearch Console](https://es-console.jdcloud.com/clusters), [Create JCS for Elasticsearch Cluster](../Getting-Started/Create-ES.md), and click the cluster name to enter the Details to obtain **Intranet Access Domain Name**.</br>
2. Initialize Client Code.</br>

   - [5.X Version HTTP Client Initialization](https://www.elastic.co/guide/en/elasticsearch/client/java-rest/5.6/java-rest-high-getting-started-initialization.html) and [5.X Version HTTP Client library](https://www.elastic.co/guide/en/elasticsearch/client/java-rest/5.6/java-rest-high-getting-started-initialization.html). Code sample is as follows:
   
   ```
   RestHighLevelClient client = new RestHighLevelClient(
        RestClient.builder(new HttpHost("es-nlb-es-gukc9h9e0g.jvessel-open-hb.jdcloud.com", 9200, "http")).build());  
   ```
   
   - [6.X Version HTTP Client Initialization]( https://www.elastic.co/guide/en/elasticsearch/client/java-rest/6.5/java-rest-high-getting-started-initialization.html) and [6.X Version HTTP Client library](https://www.elastic.co/guide/en/elasticsearch/client/java-rest/6.5/java-rest-high-getting-started-maven.html). Code sample is as follows:
   
   ```
   RestHighLevelClient client = new RestHighLevelClient(
        RestClient.builder(
                new HttpHost("es-nlb-es-gukc9h9e0g.jvessel-open-hb.jdcloud.com", 9200, "http")));
   ```
   
