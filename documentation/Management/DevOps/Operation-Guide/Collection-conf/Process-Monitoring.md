# Process Monitoring
## Monitoring Items Description
Making process monitoring collection is only required to fill in the process path. The following are monitoring indicators and meanings acquired by process collection.

| Names of Monitoring Items                | Meaning of Monitoring Items                     | Unit | Description                                                       |
| ------------------------- | ------------------------------ | ---- | ---------------------------------------------------------- |
| $ {name} .status          | Status of Process                    |      | 1 denotes normal, 0 denotes abnormal                                       |
| ${name} .thread_num       | Number of Threads                       | Nr. | If the process does not exist, the value is 0                                    |
| ${name} .process_num      | Number of Processes                     | Nr. | For example, in case of multiple processes, the value may be greater than 1. If the process does not exist, the value is 0 |
| $ {name} .io_read.kb      | ioRead Speed                     | kb   | Only when the process exists can the value be available                                   |
| $ {name} .io_write.kb     | ioWrite Speed                     | kb   | Only when the process exists can the value be available                                   |
| $ {name} .fd_num          | fdNumber of ...                       | Nr.  | Only when the process exists can the value be available                                   |
| ${name} .resident_mem.kb  | Physical Memory | kb  | Only when the process exists can the value be available                                   |
| ${name} .virtual_mem.kb   | Virtual Memory | kb  | Only when the process exists can the value be available                                   |
| ${name} .cpu_usage_core   | Occupied CPU                      |  core  | Only when the process exists can the value be available                                   |
| ${name}.cpu_usage_percent | cpuPercentage of consumption in total CPU resources of the machine | %    | Only when the process exists can the value be available                                   |
| ${name}.mem_usage_percent | Percentage of memory consumption in total memory of the machine   | %    | Only when the process exists can the value be available                                   |

## Operation Guide


Step 1: Select [Intelligent Monitoring] - [Monitoring Configuration] in the menu, select nodes at or below product lines in the service tree at the left side, click **New** on the Acquisition Configuration page as shown in the following figure.

![image](https://github.com/jdcloudcom/cn/blob/DevOps-guhezhu1/image/DevOps/Operation-Guide33.JPG)

Step 2: Open acquisition configuration new window as shown in the figure. In which,

**Monitoring Type**: Select process monitoring

**Name**: Name of this collection task will be used as the prefix of monitoring indicators, which supports letters, numbers and _, and must begin with a letter.

***Scope**: Scope of the process collection configuration is associated with the selected node in the service tree, with the principle of being selectable downward. When the application node in the service tree is selected, only "Application" can be selected in the scope; when system node in the service tree is selected, "System" or "Application" can be selected in the scope; when product line node in the service tree is selected, "Product Line", "System", "Application" can be selected in the scope

**Node**: Specific node of process collection configuration, when selecting a system or product line node, all the applications the node belongs to will be covered, that is to say, configure this process monitoring for all applications.

**Acquisition cycle**: Select acquisition cycle to be configured.

**Process path**: Fill in the process path
```
Filling in the path is supported by following methods are supported,
- Fill in the name of process that can be uniquely identified, such as “hawkeye-agent”, “nginx”; 
- Populated/initial absolute path of process such as /a/b/c, it is required to “file /a/b/c” at first to confirm whether the output result contains ELF; 
- Specify a specific java process, “process path parameter” can be filled in (what in the middle is space. Method: The process startup parameters acquired by ps -elf are separated by spaces. You can extract 1~2 fields from these parameters in sequence, as long as the process can be uniquely identified); 
- Name of jar package, such as “xxx.jar”", 
```
![image](https://github.com/jdcloudcom/cn/blob/DevOps-guhezhu1/image/DevOps/Operation-Guide34.jpg)
