# Analysis on Windows System Memory Usage
Mirror: Windows Server 2008 R2 Data Center Edition 64-bit Chinese version SQL Server 2008 R2 Enterprise Edition SP3. It can be seen from the console that the memory usage reaches 62%, equivalent to over 600M physical memory (the specification of 1G memory);

![](https://github.com/jdcloudcom/cn/blob/edit/image/Elastic-Compute/Virtual-Machine/Windows/Windows%E7%B3%BB%E7%BB%9F%E5%86%85%E5%AD%98%E5%8D%A0%E7%94%A8%E5%88%86%E6%9E%9001.png)

Login the server system and open the task manager, and the memory storage of the process is no more than 600M; (mssql, a large memory occupier, only occupies 39M) as shown below:
In fact, the memory of the task manager-process (WS Private) is occupied by the memory, is the physical memory exclusive to this process;

![](https://github.com/jdcloudcom/cn/blob/edit/image/Elastic-Compute/Virtual-Machine/Windows/Windows%E7%B3%BB%E7%BB%9F%E5%86%85%E5%AD%98%E5%8D%A0%E7%94%A8%E5%88%86%E6%9E%9002.png)

Then open the system-provided explorer:

![](https://github.com/jdcloudcom/cn/blob/edit/image/Elastic-Compute/Virtual-Machine/Windows/Windows%E7%B3%BB%E7%BB%9F%E5%86%85%E5%AD%98%E5%8D%A0%E7%94%A8%E5%88%86%E6%9E%9003.png)

The display here is accurate, and the use of physical memory consists of following sections:
Memory Reserved for Hardware
In Use: Memory occupied by processes, drivers and operating systems
Modified: Memory whose contents must be written into the disk before being used for another purpose
Standby: Memory that contains cached data and code that is not actively in use
Available: Memory that does not contain any valuable data, and that will be used first when processes, drivers or the operating systems require more memories.
Cache: When a file is opened, the system saves the file in the cache for the quick read/write next time. Windows 2008 R2 and later versions have the use limit on the cache: some physical memory will not be occupied by the cache to ensure that the system has available physical memory to meet the program demands even when the cache is too large.
After reading so much, I still didn't know where the memory was except for the memory occupied by the process.
Ok, here is the ultimate tool:
Name: RamMap
Version: v1.0
Homepage: http://technet.microsoft.com/zh-cn/sysinternals/ff700229(en-us).aspx
Writer: Windows Sysinternals

![](https://github.com/jdcloudcom/cn/blob/edit/image/Elastic-Compute/Virtual-Machine/Windows/Windows%E7%B3%BB%E7%BB%9F%E5%86%85%E5%AD%98%E5%8D%A0%E7%94%A8%E5%88%86%E6%9E%9004.png)

process private: Proprietary physical memory in use during the process;
paged pool: Paged Pool
Mapped File Memory-mapped Files
Nonpaged pool: Nonpaged Pool
MetaFile: System Cache 
It can be seen that the memory is  occupied by the process itself as well as by Mapped File, paged pool, Nonpaged pool, MetaFile, etc., which cannot be seen from the task manager;

When returning to the task manager, users can see that the working settings (memory), working set, memory (WS Private), and commit size (Private Bytes) in monitoring columns.

![](https://github.com/jdcloudcom/cn/blob/edit/image/Elastic-Compute/Virtual-Machine/Windows/Windows%E7%B3%BB%E7%BB%9F%E5%86%85%E5%AD%98%E5%8D%A0%E7%94%A8%E5%88%86%E6%9E%9005.png)

Working Settings (Memory): Physical memory in use during the process;
Memory (WS Private): Physical memory used by this process while others cannot;
Commit Size: The virtual memory size that the operating system reserved for the process;

Work Settings Memory = Memory WS Private + Physical Memory Shared with Other Processes.
Commit Size = Memory-WS Private + Exclusive Memory Saved in the Page Files.

**Therefore, the memory that can be viewed by the task manager is the memory occupied by the process. In other words, the memory management of the windows system is extremely complicated, it can be seen that the memory is occupied by the process itself as well as by the memory Mapped File, paged pool, Nonpaged pool, MetaFile, etc., which cannot be seen from the task manager.**
