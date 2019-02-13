## FAQ

**Q: Is the command executed by hooks in appSpec.yml?**

A: The location option to be filled in by hooks refers to the script location rather than the command itself used for executing the script. As a result, please avoid operating commands such as /home/app/control start.

**Q: How to handle the cache of the previous deployment task?**

A: If this deployment succeeds, then the cache of the previous deployment task will be the backup; if this deployment fails, then the cache in this time will be deleted.
