# Other Commands
## Track Task Command
Used for tracking task execution process. For example, if the --tail parameter is not added, only one task ID is returned for the create command. However, whether the task is successfully exceeded or not and errors occurred remain unknown. Now, the task command can be used for tracking the task execution process.
Command Format:
```bash
# task <taskId>
```
Parameters:
| Parameter Name | Parameter Description |
| ---- | ---- |
| --tail | Default parameter, tracking the task execution process or not |
Example:
```bash
task task-abc
```
