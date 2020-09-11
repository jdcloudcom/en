## SQL Support
 JD Cloud & AI Elasticsearch supports SQL substituting for DSL in language searching. For ES beginners, using SQL language to search can reduce their learning costs to use ES</br>

### Usage Limits
Except for Version 7.5.2, all other open-source versions support SQL search

### Use SQL API to search via Kibana

```
POST /_sql
{
"sql":"select * from {index_name}"
}
```

### Use SQL API to search via Curl

```
curl -u {username}:{password} -H "Content-Type: application/json" -XPOST 'http://{domain}:9200/_sql' -d 'select * from {index_name}'
```
