# Comparing OSS with file system

OSS is a distributed Object Storage Service, providing Object Storage Service in the form of Key-Value pair. User may obtain the contents of the Object based on the unique Object name (Key). Although users may use names similar to test1/test.jpg, this does not represent that the user’s Object is saved under the directory of test1. For OSS, test1/test.jpg is just a character string, without any essential difference from a.jpg. Therefore the resources consumed by access among Objects with different names are similar.

File system is a typical arborescence index structure. For a file named test1/test.jpg, the test1 directory shall be accessed first and the file named test.jpg shall be searched under the directory. File system may easily support folder actions, such as renaming directory, deleting directory, moving directory, etc., as these actions are just actions aiming at directory nodes. This organization structure determines that more resource consumption is required for accessing deeper directory of a file system, and the speed will be slower when the action has directories of a lot of files.

For OSS, similar functions may be simulated through some actions, but the costs are expensive. Taking renaming directory as an example, if test1 directory is to be renamed as test2, the actual action of OSS is to replicate all Objects beginning with test1/ into Objects beginning with test2/, which is a very resource-consuming action. Therefore, similar actions shall be prevented if possible when OSS is used.

Objects saved by OSS do not support modification. User is required to upload the whole Object again in case of modifying just one byte. Files in a file system support modification, such as modifying the specified contents in offset positions, truncating the end of files, etc., and such characteristics also make the file system has extensive applicability. However, on the other hand, OSS can support massive users to access concurrently, and the file system will be limited to the performance of one single device.

Thus, mapping OSS as a file system is low-efficiency and not recommended. If it has to be mounted as a file system, only writing new files, deleting files and reading files are suggested to be allowed if possible. Using OSS shall fully give play to its advantages, i.e. mass data processing ability, and priority shall be given to store mass unstructured data, such as pictures, videos, documents, etc.

The following is the comparison between OSS and file system:

|Object Storage Service OSS|File System|
|-|-|
|Object|File|
|Bucket|Primary Directory|
|Region|None|
|Endpoint|None|
|AccessKey|None|
|None|Multi-level Directory|
|GetService|Obtain Primary Directory List|
|GetBucket|Obtain File List|
|PutObject|Write File|
|GetObject|Read File|
|DeleteObject|Delete File|
|None|Modify File Content|
|CopyObject (Same Target and Source)|Modify File Attribute|
|CopyObject|Replicate File|
