# Core Concepts

| Concept | Interpretation |  
| --- | --- | 
| Registry | Registry is a server application program of no state and elastic height, which is used for storing and distributing docker images. |     
|Repository|Repository refers to the specific location for storing docker image in the registry, which is the set of one or more image versions. | 
|Image|A special file system, which contains configuration parameters for operation (such as anonymous volume, environment variable, and user), in addition to programs, libraries, resources, configuration and other files necessary for container operation. The image contains no dynamic data and its contents will not be changed after construction. | 
|Token|The token refers to an authorization token with expiry period, used for management of registry and repository. |     

**Relationship between Registry, Repository and Images.**
Registry is composed of one or more repositories and the repository is composed of one or more image versions.
