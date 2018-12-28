## FAQ

**Q: When deleting the deployment group or the deployment target (Virtual Machines) in the deployment group, how to operate the corresponding Load Balancer virtual server group or the Virtual Machines in the group?**

A: When deleting the deployment target (Virtual Machines) in the deployment group, it will determine whether it is carrying traffic or not. In light of business reliability, Virtual Machines that are carrying traffic cannot be deleted. Only when the deployment target in the deployment group is not carrying traffic, can this deployment group be deleted.

**Q: How to handle the cache of the previous deployment task?**

A: If this deployment is deployed, then the cache of the previous deployment task will be the backup; if not, then the cache in this time will be deleted.
