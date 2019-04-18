## Plug-in Support
As the segmentation plug-ins are the default plug-ins of JCS for Elasticsearch officially, but the Chinese segmentation does not have the ideal effect. The IK segmentation plug-in is preset in JCS for Elasticsearch. You can set up the index for the Chinese key words in the data with such plug-in, so as to complete the search function better.</br>

| Plug-in Name	| Introduction	|
|:--|:--:|
| respository-s3 | upload snapshot to storage |
| analysis-ik | IK Word Segmentation	|
| analysis-icu | icu Analyzer |
| analysis-phonetic | Phonograph Analysis Plug-in	|
| analysis-pinyin | Pinyin Word Segmentation	|
| ingest-attachment | Extract content with Apache Tika	|
| ingest-user-agent | Extract information from user Agent	|
| mapper-size | Mapper size, which allows recording the size of the document before compression at the time of index	|
| mapper-murmur3 | The user is allowed to calculate the Hash value of the field value when creating the index and store the Hash value obtained in the index	|
| analysis-stconvert | Transformation plug-in of simplified and traditional Chinese characters	|
