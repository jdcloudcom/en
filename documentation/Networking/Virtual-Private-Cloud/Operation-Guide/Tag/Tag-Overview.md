# Tag Overview

The tags provide a resource classification mode that supports multiple classification specifications (such as owner and purpose), which makes it convenient for users to quickly locate specific resources based on tags when they have a large number of similar resources. A tag consists of a pair of Key-Values, all defined by the user. E.g., the user can identify the resources based on their owners. Moreover, we recommend users to adopt the same batch of tags for resources with different types such as Virtual Machines and Cloud Database to facilitate users to manage resources on JD Cloud.

## Supported Functions

* [Edit Tag](Edit-Tag.md)
* [Select Resources by Tag Filter](Filter-by-Tag.md)


## Use Restrictions

* Each public IP can associate 10 tags at most.
* The maximum length of tag Key is 127 characters.
* The maximum length of tag Value is 255 characters.
* Tag Key-Value cannot use jrn: as prefix, which only supports Chinese characters, numbers, upper case and lower case letters, blank and special symbols of _.:/=+-@. It cannot start with blank and it is case sensitive.
* When associating resources and tags, the same tag Key can only have one corresponding tag Value, which the most recently associated Value will replace the previously associated Value for the same tag Key.
* When disassociating a tag, if the tag has no associated resources after the disassociation, then the tag will be automatically deleted.

## Related References

[Edit Tag](Edit-Tag.md)

[Select Resources by Tag Filter](Filter-by-Tag.md)

