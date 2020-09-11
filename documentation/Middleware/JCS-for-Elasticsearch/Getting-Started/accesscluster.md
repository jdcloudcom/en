## Access Cluster
JCS for Elasticsearch supports access to clusters via Kibana, JD Cloud Virtual Machines or Client Method.

### Access by kibana
1. Log in [JCS for Elasticsearch Console](https://es-console.jdcloud.com/clusters), [Create JCS for Elasticsearch Cluster](../Getting-Started/Create-ES.md)</br>
2. Click **Operation-kibana** to enter the kibana visual interface, and enter Developer Tools through [Dev Tools] in the navigation bar, [Access JCS for Elasticsearch Cluster](../Getting-Started/dataview.md).</br>

### Access via JD Cloud Virtual Machines
1. Log in [JCS for Elasticsearch Console](https://es-console.jdcloud.com/clusters), [Create JCS for Elasticsearch Cluster](../Getting-Started/Create-ES.md), and click the cluster name to enter the Details to obtain **Intranet Access Domain Name**.</br>
2. Log in [Virtual Machine Console](https://cns-console.jdcloud.com/host/compute/list) to create a Virtual Machine having the same VPC and Subnet with JCS for Elasticsearch Cluster and [Obtain EIP](https://docs.jdcloud.com/en/virtual-machines/associate-elastic-ip).</br>
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


### Access via Client
Java REST Client is recommended ​by ​ES to connect to clusters and perform data operations. The bottom layer of Java REST Client library uses httpclient components and is encapsulated on es official website. It supports the multi-machine ip and simplifies the request method. Therefore, to reduce dependency on items, in the scenario with robust requirements on supporting functions, we can use this library to develop our businesses. There are two types of Java REST Client, namely Low Level and High Level.</br>
- Java Low Level REST Client: It communicates with Elasticsearch services through the Http protocol. Request encoding and response decoding are reserved for the user to implement, and it is compatible with all Elasticsearch versions.</br>
- Java High Level REST Client: It is based on the low-level client and is more convenient and efficient for use. It provides a specific method of API, and processes request encoding and response decoding. If the API provided by the current Java High Level REST Client version cannot meet your needs, you can upgrade the ES cluster version and Client version to resolve this problem.</br>

```
Description:
Transport Client connecting to the ES cluster via the TCP protocol is no longer officially maintained, and thus it is recommended to use Java High Level REST Client or Java Low Level REST Client connecting to the cluster via the HTTP protocol.

   ```


The following is an example showing how to access by Java High Level REST Client (Version 7.5.2). For the usage of other versions, please refer to [Java High Level REST Client](https://www.elastic.co/guide/en/elasticsearch/client/java-rest/7.5/java-rest-high.html). </br>
1. Log in [JCS for Elasticsearch Console](https://es-console.jdcloud.com/clusters), [Create JCS for Elasticsearch Cluster](../Getting-Started/Create-ES.md), click the cluster name, and enter the Details to get **Intranet Access Domain**.</br>
2. Create a Java Maven project and add the following pom dependencies into the pom.xml file of the Java engineering.</br>

   ```
Please note:
- Java JDK must be 1.8 or above versions.
- The Demo is applicable for ES Version 7.5.2, and the Client version is required to be consistent with the ES cluster version. Otherwise, the incompatibility problem may occur.
- Check configuration such as vpc and subnet for internetworking.
   ```
Index API is used to create indexes for the following codes. Use Get API and Delete API to read and delete such indexes respectively. The parameters with {} in the sample codes shall be replaced by your specific business parameters.
```
import org.apache.http.HttpHost;
import org.apache.http.client.CredentialsProvider;
import org.apache.http.impl.client.BasicCredentialsProvider;
import org.apache.http.auth.AuthScope;
import org.apache.http.auth.UsernamePasswordCredentials;
import org.apache.http.impl.nio.client.HttpAsyncClientBuilder;

import org.elasticsearch.ElasticsearchException;
import org.elasticsearch.action.delete.DeleteRequest;
import org.elasticsearch.action.delete.DeleteResponse;
import org.elasticsearch.action.get.GetRequest;
import org.elasticsearch.action.get.GetResponse;
import org.elasticsearch.action.index.IndexRequest;
import org.elasticsearch.action.index.IndexResponse;
import org.elasticsearch.client.*;
import org.elasticsearch.rest.RestStatus;

import java.util.HashMap;
import java.util.Map;

public class RestClientDemo 
{
    private static final RequestOptions COMMON_OPTIONS;
    static {
        RequestOptions.Builder builder = RequestOptions.DEFAULT.toBuilder();
        COMMON_OPTIONS = builder.build();
    }
    public static void main( String[] args )
    {
        final CredentialsProvider credentialsProvider = new BasicCredentialsProvider();
        credentialsProvider.setCredentials(AuthScope.ANY,
                new UsernamePasswordCredentials("{username}", "{password}"));//This part can be removed if the password access is not enabled
        RestClientBuilder builder = RestClient.builder(new HttpHost({domain}, 9200))
                .setHttpClientConfigCallback(new RestClientBuilder.HttpClientConfigCallback() {
                    @Override
                    public HttpAsyncClientBuilder customizeHttpClient(HttpAsyncClientBuilder httpClientBuilder) {
                        return httpClientBuilder.setDefaultCredentialsProvider(credentialsProvider);
                    }
                });
        RestHighLevelClient highClient = new RestHighLevelClient(builder);
        //Create and update
        try {
            Map<String, Object> jsonMap = new HashMap<>();
            jsonMap.put({key}, {value});
            IndexRequest indexRequest = new IndexRequest({index_name}, "_doc", {doc_id}).source(jsonMap);
            IndexResponse indexResponse = highClient.index(indexRequest,COMMON_OPTIONS);
            long version = indexResponse.getVersion();
            System.out.println("Index successfully, version: " + version);
        } catch (Exception e) {
            System.out.println("Index exception: "+e.toString());
        }
        //Search
        GetRequest getRequest = new GetRequest({index_name}, "_doc", {doc_id});
        try {
            GetResponse getResponse = highClient.get(getRequest,COMMON_OPTIONS);
            String index = getResponse.getIndex();
            String type = getResponse.getType();
            String id = getResponse.getId();
            if (getResponse.isExists()) {
                long version = getResponse.getVersion();
                String sourceAsString = getResponse.getSourceAsString();
                System.out.println("Got doc, index: "+ index +", type:"+ type +",id:"+ id+",version:"+version +", source:"+ sourceAsString);
            }
        }catch (ElasticsearchException e) {
            if (e.status() == RestStatus.NOT_FOUND) {
                System.out.println("Not found: "+e);
            }
        }
        catch(Exception e){
            System.out.println("Get exception: "+ e.toString());
        }
        //Delete
        try{
            DeleteRequest request = new DeleteRequest({index_name}, "_doc", {doc_id});
            DeleteResponse deleteResponse = highClient.delete(request, COMMON_OPTIONS);
            System.out.println("Delete successfully， response: " + deleteResponse.toString() + ", status: " + deleteResponse.status());
        }catch (Exception e){
            System.out.println("Delete exception: "+ e.toString());
        }
        //Close connection
        try {
            highClient.close();
        }catch (Exception e){
            System.out.println("Close exception:"+ e.toString());
        }
    }
}
```
   
   
