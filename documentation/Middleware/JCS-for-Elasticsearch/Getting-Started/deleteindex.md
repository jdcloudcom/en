## Delete Data
### Delete the Entire Index
```
DELETE blog_index
```
The response below indicates index deleted:
```
{
  "acknowledged" : true
}
```
### One record deleted
```
DELETE blog_index/user/manager
```
The response below indicates index deleted:
```
{
  "_index" : "blog_index",
  "_type" : "user",
  "_id" : "manager",
  "_version" : 1,
  "result" : "not_found",
  "_shards" : {
    "total" : 2,
    "successful" : 2,
    "failed" : 0
  },
  "_seq_no" : 1,
  "_primary_term" : 1
}

```
