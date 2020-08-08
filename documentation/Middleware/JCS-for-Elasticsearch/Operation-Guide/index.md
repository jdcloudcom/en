## Lifecycle Index Creation
Lifecycle Index Creation function can help users realize full lifecycle management of index from creation to deletion.

### Prerequisites
Before execution of Lifecycle Index Creation tasks, it is necessary to ensure that there have been available index templates.

### Create Index Tasks
On the List page, you can click **Operations - More - Lifecycle Index Creation** to enter the Lifecycle Index Creation page and click **Add** to enter Index Tasks Creation page.
- Index template: It can be created via command line tools or kibana-Dev Tools.</br>

Index template example created via command line tools:</br>
```
curl -XPUT localhost:9200/_template/template05 \
-H"Content-Type:application/json" \
-d '{
  "index_patterns": ["template05*"],    //is applicable to 6.X Version or above, and shall be replaced with "template": "xie- when applied to 6.X Version or below.", 
  "settings": {
    "number_of_shards": 2
  },
  "mappings": {
    "_doc": {
      "_source": {
        "enabled": false
      },
      "properties": {
        "name": {
          "type": "keyword"
        },
        "created_at": {
          "type": "date",
          "format": "EEE MMM dd HH:mm:ss Z YYYY"
        }
      }
    }
  }
}'
```
Index template example created via Kibana - Dev Tools:</br>

```
PUT /_template/my_logs 
{
  "index_patterns": ["template05*"],    //is applicable to 6.X Version or above, and shall be replaced with "template": "template05* when applied to 6.X Version or below.",  
  "order": 1, 
  "settings": {
    "number_of_shards": 1 
  },
  "mappings": {
    "_default_": { 
      "_all": {
        "enabled": false
      }
    }
  },
  "aliases": {
    "last_3_months": {} 
  }
}
```


- Index prefix: It corresponds to the results indexed from template matching, which means that index prefix is consistent with value of index_patterns field. In the example, corresponding index prefix is template05.</br>
- Start time of execution: The time for each execution of Lifecycle Index Task Creation.</br>
- Execution cycle: Support Execution by Day and Execution by Month.</br>
- Index suffix: Define time format. Example: "2018-10-10" corresponds to "yyyy-MM-dd".</br>
- Index Regular Deletion: Index storage time can be set at the time of turning on the switch, and index will be automatically deleted when the storage time expires.</br>
- Index Storage Time: After this function is set, index will be automatically deleted when the storage time expires.</br>
- Ignored Index Deletion: After this function is set, index will not be deleted regularly, and multiple indexes will be separated by (,). For example, if the template "pop_jd_log_" needs to be reserved for a long time, pop_jd_log_20180618,pop_jd_log_20181111 shall be filled in.</br>
- Index Template Content: Correspond to and display the content of selected index template.</br>

### Edit Index Tasks
After the task of Lifycycle Index Creation is added, you can click **Operations - Edit** to modify the task and this item supports modifications to index prefix, execution cycle, index suffix and index regular deletion.</br>

### View Index Tasks
After adding or editing the task of Lifycycle Index Creation, you can click **Operations - Detail** to view basic information and template information of index tasks.</br>

### Delete Index Tasks
After confirming that you will not use a cycle task any longer, you can click **Operations - Delete** to delete the cycle task.
