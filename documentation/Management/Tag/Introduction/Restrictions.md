# Restriction Description

 - Each tag only contains one key and one value. The key and the value shall not be blank. The leading and trailing spaces are automatically filtered, and multiple spaces contained in name characters are automatically processed into one space;

 - The key and value of the tag shall be case sensitive, and the tag with different case will be treated as different tag;

 - The keys and values of tag associated by resources can be modified at any time;

 - Under each primary account, total quantity of tag keys shall not exceed 500, and each key can add no more than 500 values;

 - Each resource can associate up to 10 tags (each tag with different key shall be counted as one tag);

 - Maximum length of the key is 127 characters; maximum length of the value is 255 characters. It is not recommended to give long name to the key or value, which is not conducive to tag’s use and understanding;

 - Tag supports Chinese and English, uppercase and lowercase, blanks, numbers and special symbols in Unicode characters, such as p{L}、 p{Z}、 p{N} and _.:/=+-@, etc. Tag does not support other special characters;

 - Prefix of "jrn:” cannot be used in tag key and value. The tag of this prefix is reserved by the system. Users cannot edit or delete such tags.

 - One resource instance (for example: a virtual machine instance, a Cloud Disk Service or an instance of SQL Server) is allowed to associate multiple tags, however the tags with the same “key” are only allowed to associate one tag simultaneously.

   E.g: One VM Instance is allowed to simultaneously associate multiple tags, such as “Departments: Basic R&D Department” and “Environment: Development Environment”, etc., however it is not allowed to associate the tags of “Department: Basic R&D Department” and “Environment: development department of the platform” simultaneously, because the “key” of these two tags are the same. The tag with the same “key” which is associated in subsequent will replace the former tag.
