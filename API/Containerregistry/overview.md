# Container Registry


## Introduction
Container Registry Service


### Revision
v1


## API
|Interface Name|Request Mehod|Function description|
|---|---|---|
|**checkRegistryName**|POST|Query whether the assigned registry name exists and is in conformity with the naming specification. </br>|
|**checkRepositoryName**|POST|Query whether the Repository name exists and is in conformity with the naming specification. </br>|
|**createRegistry**|POST|Create registry through parameters. </br>|
|**createRepository**|POST|Create repository through parameters. </br>Repository name may be broken down into multiple path names, and each name must contain at least one letter in lower case and figure, and consider URL specification. </br>Partition with segment line or underline is supported, but dot '.' and connection between multiple path names with ("/") are not allowed, the total length shall be no more than 256 characters, and currently only second-level directory is supported. </br>|
|**deleteImage**|POST|Delete Images </br>imageDigest imageTag imageTagStatus One of the three must be uploaded. </br> Delete the Image according to the Tag status, for example delete all tagged images. </br> digest and tag only respectively represent a single image, sha256 hash for imageDigest and digest for image manifest. </br> For example, sha256:examplee6d1e504117a17000003d3753086354a38375961f2e665416ef4b1b2f; tag used by image, as “precise” </br>|
|**deleteRegistry**|DELETE|Delete a registry under a specified user. </br>|
|**deleteRepository**|DELETE|Delete a Repository under a specified user. </br>|
|**describeAuthorizationTokens**|GET|<p> Query tokens in batches. </p> </br><p> Paging and filtering conditions are not supported now. </p></br>|
|**describeImages**|GET|Return the metadata of images in the assigned repository, including image size, image tags and creation date. </br>|
|**describeQuotas**|GET|Query Quota|
|**describeRegistries**|GET|Query details of all registries under the specified user in batches. </br> filter is not supported now. </br>|
|**describeRegistry**|GET|Query details of a registry under the specified user. </br>|
|**describeRepositories**|POST|Describe repository under registry specified by the user. </br>|
|**getAuthorizationToken**|POST|<p>Apply for a token with 12-hour valid period. Use <code>docker</code> CLI push and pull image. </p></br><p><code>authorizationToken</code> returns a base64 code character string for each registry, and <code>docker login</code>command</br> may complete the assigned registry authentication after decoding. JCR CLI provides <code>jcr get-login</code> for verification. </p></br>|
|**releaseAuthorizationToken**|POST|Release token of the user’s registry. </br>|
