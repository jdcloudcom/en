## Tag Overview
The tags provide a resource classification mode that supports multiple classification specifications (such as owner and purpose), which makes it convenient for users to quickly locate specific resources based on tags when they have a large number of similar resources.
A tag consists of a pair of Key-Values, all defined by the user. For example, users can identify their ES resources based on the ES owner. In addition, users are advised to use the same batch of tags for different types of resources such as JCS for Elasticsearch, Virtual Machine, and Cloud Database, which is more convenient for users to manage resources on JD Cloud.
### Supported Functions
* [Edit Tag](Edit-Tag.md)
* [Filter by Tag](Filter-by-Tag.md)
### Service Restrictions
* Each ES cluster can associate up to 10 tags.
* The maximum length of tag Key is 127 characters.
* The maximum length of tag Value is 255 characters.
* When an instance is associated to a tag, only one corresponding tag Value is allowed for the same tag Key. The value recently associated to the same tag key replaces the previously associated value.
* When disassociating a tag, if the tag has no associated resources after the disassociation, then the tag will be automatically deleted.
