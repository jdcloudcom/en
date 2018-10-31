# cr


## Introduction
Container Registry Service


### Revision
v1


## API
|Interface Name|Request Mehod|Function description|
|---|---|---|
|**checkRegistryName**|POST|Query whether the assigned registry name exists and is in conformity with the naming specification. </br>|
|**createRegistry**|POST|Create registry through parameters. </br>|
|**createRepository**|POST|Create repository through parameters. </br>Repository name may be broken down into multiple path names, and each name must contain at least one letter in lower case and figure, and consider URL specification. </br>Partition with segment line or underline is supported, but dot '.' and connection between multiple path names with ("/") are not allowed, the total length shall be no more than 256 characters, and currently only second-level directory is supported. </br>|
|**describeImages**|GET|Return the metadata of images in the assigned repository, including image size, image tags and creation date. </br>|
|**describeQuotas**|GET|Query Quota|
|**getAuthorizationToken**|POST|<p>Apply for a token with 12-hour valid period. Use <code>docker</code> CLI push and pull image. </p></br><p><code>authorizationToken</code> returns a base64 code character string for each registry, and <code>docker login</code>command</br> may complete the assigned registry authentication after decoding. JCR CLI provides <code>jcr get-login</code> for verification. </p></br>|
