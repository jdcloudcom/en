
## Create Index
If the automatic index creation is not enabled, an index needs to be created first.

```
PUT blog_index
{

"mappings": {

"user": {

"properties": {

"title": { "type": "text" },

"name": { "type": "text" },

"age": { "type": "integer" }

}
}
}
}
```
The responses below indicate that creation succeeded:

```
{
  "acknowledged" : true,
  "shards_acknowledged" : true,
  "index" : "blog_index"
}
```

