# Restrictions

See Table 1 for account resource restriction rules.

Table 1: Account Resource Description Table

| Resource                               | Default Value            |
| ---------------------------------- | ----------------- |
| Maximum number of functions allowed to be created under a single account   | 100 (can be increased by the ticket) |
| Maximum number of versions allowed to be created under a single function   | 10                |
| Maximum number of aliases allowed to be created under a single function   | 10                |
| Maximum number of triggers allowed to be created under a single function   | 10                |
| Support the number of triggers created synchronously when creating a new function | 1                 |
| Size of code allowed by a single online editing function       | 10KB              |
| Code deployment package size (compressed to be .zip file)   | 50MB              |
| Original code size                       | 250MB             |
| Maximum allowable deployment package size in a single region       | 1GB               |
| Function concurrency in a single region               |20 (can be increased by the ticket) |
| Environment variable number under a single function             | 128      |

Note: if you want to increase the account quota, you can get the increase of quota limit by opening ticket indicating what you want to increase and the number of expected increase.

 

See Table 2 for resource restriction rules upon function running.

Table 2: Resource Restriction Upon Function Running

| Resource                               | Default Value                       |
| -------------------------- | ---------------------------- |
| Temporary Disk Space ("/tmp" space) | 512MB                        |
| File Descriptor                 | 1024                         |
| Number of Process and Thread (Sum)       | 1024                         |
| Function Maximum Application Memory           | 128MB-1GB, step size 128MB         |
| Maximum Run Time of Function           | 1 second-300 seconds                    |
| Function Synchronization Request Event Size       | 6MB                          |
| Function Synchronization Response Event Size       | 6MB                          |
| Function Synchronization Request Event Size       | 128KB                        |
| Size of Resource Imported by Function           | .zip format compressed file, with the size of within 50M |
| Size of Resource Exported by Function          | within 50M                      |

