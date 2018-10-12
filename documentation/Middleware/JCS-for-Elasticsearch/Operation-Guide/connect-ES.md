## Access Cluster
### Based On Cloud Server Access
JCS for Elasticsearch and the dependent virtual machine must be under the same VPC, so the virtual machine of the same VPC and subnet must be created first; JCS for Elasticsearch service can be accessed only after obtaining “EIP” under the virtual machine.
### curl Test
Access the port 9200 of JCS for Elasticsearch instance through the curl command in the Linux environment.
The access example format of specified account password is curl –XGET [domain name of public network], and the domain name of public network is the **Intranet access domain name** in the basic information interface of JCS for Elasticsearch. The command examples are as follows:
```
curl -XGET es-nlb-es-kgqo8zmgcv.jvessel-open-hb.jdcloud.com:9200
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

```
