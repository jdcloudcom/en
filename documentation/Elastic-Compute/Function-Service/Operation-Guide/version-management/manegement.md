# Function Version Overview
Function service provides a feature of function version management for users to manage function codes and triggers in development, testing, and production environments. Users can implement continuous iteration in the software development cycle with the version and alias functions provided by version management.

## Version
With Function version control, you can release one or more versions of Function so that different versions of Function can be used in different phases or environments. Version refers to the snapshot of functions, including configuration and code of functions. The version number is automatically generated along with time stamp when a new version is released. The released version cannot be modified.

## Alias
Function supports creating aliases for versions of the function, which are pointers to a particular version of Function. You can use alias to release any version of functions to serve all kinds of environments and roll back to any previous version of functions.

**Description:**

Alias further helps users implement smooth iteration of businesses on the basis of versions. You can create the alias produnction to point to the stable version v20190501-101010 on the service line and associate the trigger on the service line with the alias produnction. When the on-line function updates the release version v20190505-121012, you can complete the on-line version upgrade by pointing the alias produnction to the new version v20190505-121012; in a similar way, you can also complete the on-line version switch by rolling back to any previous version without updating the trigger, avoiding business interruption caused by trigger update.

 
