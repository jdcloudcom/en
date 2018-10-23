## Access Cluster
### Based On Cloud Server Access
JCS for Elasticsearch and the dependent virtual machine must be under the same VPC, so the virtual machine of the same VPC and subnet must be created first; JCS for Elasticsearch service can be accessed only after obtaining “EIP” under the virtual machine.
### Curl Connection Test
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
### Data Loaded to ES
After successful access, import the data set (accounts.json) under the virtual machine via the curl command, decompress the same to our current directory, and load the same to our clusters, as follows:
```
curl -H“Content-Type：application / json”-XPOST“es-nlb-es-kgqo8zmgcv.jvessel-open-hb.jdcloud.com：9200 / bank / account / _bulk？pretty＆refresh”--data-binary“@ accounts.json”
curl “es-nlb-es-kgqo8zmgcv.jvessel-open-hb.jdcloud.com：9200 / _cat / indices？v”
```
This means that we only successfully index 1,000 documents in batches to the bank indexes (under the account type), i.e. successfully loading the data to the ES cluster.

