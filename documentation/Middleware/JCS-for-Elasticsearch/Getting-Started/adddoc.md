## Create Documents

### Create a Single Document

```
POST blog_index/user
{

"title": "manager",

"name": "Tom Jerry",

"age": 34

}
```
The responses below indicate that creation succeeded:
```
{
  "_index" : "blog_index",
  "_type" : "user",
  "_id" : "8Hf_JG4BmdCR56kZg33c",
  "_version" : 1,
  "result" : "created",
  "_shards" : {
    "total" : 2,
    "successful" : 2,
    "failed" : 0
  },
  "_seq_no" : 0,
  "_primary_term" : 1
}

```

### Create Multiple Documents
```
POST _bulk
{"index":{"_index":"blog_index","_type":"user"}}
{"title":"manager1","name":"Tom1","age":35}
{"index":{"_index":"blog_index","_type":"user"}}
{"title":"manager2","name":"Tom2","age":36}
{"index":{"_index":"blog_index","_type":"user"}}
{"title":"manager3","name":"Tom3","age":37}
```
The responses below indicate that creation succeeded:
```
{
  "took" : 11,
  "errors" : false,
  "items" : [
    {
      "index" : {
        "_index" : "blog_index",
        "_type" : "user",
        "_id" : "8Xf_JG4BmdCR56kZ2H2v",
        "_version" : 1,
        "result" : "created",
        "_shards" : {
          "total" : 2,
          "successful" : 2,
          "failed" : 0
        },
        "_seq_no" : 2,
        "_primary_term" : 1,
        "status" : 201
      }
    },
    {
      "index" : {
        "_index" : "blog_index",
        "_type" : "user",
        "_id" : "8nf_JG4BmdCR56kZ2H2v",
        "_version" : 1,
        "result" : "created",
        "_shards" : {
          "total" : 2,
          "successful" : 2,
          "failed" : 0
        },
        "_seq_no" : 3,
        "_primary_term" : 1,
        "status" : 201
      }
    },
    {
      "index" : {
        "_index" : "blog_index",
        "_type" : "user",
        "_id" : "83f_JG4BmdCR56kZ2H2v",
        "_version" : 1,
        "result" : "created",
        "_shards" : {
          "total" : 2,
          "successful" : 2,
          "failed" : 0
        },
        "_seq_no" : 1,
        "_primary_term" : 1,
        "status" : 201
      }
    }
  ]
}

```
