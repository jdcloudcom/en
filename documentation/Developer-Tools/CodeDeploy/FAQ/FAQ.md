## FAQ

**Q: Is the command executed by hooks in jdcloud-codedeploy.yml?**

A: Support, the command option to be filled in by hooks refers to the script location or the command itself used for executing the script.

**Q: How to handle the cache of the previous deployment task?**

A: If this deployment succeeds, then the cache of the previous deployment task will be the backup; if this deployment fails, then the cache in this time will be deleted.

**Q: What’s the port of Agent?**

A: agent adopts the ports 2001 and 2002. If the Security Group is adopted by Virtual Machines, please turn on the ports 2001 and 2002 for the Outbound Rules of Security Group.
