
# Instance Configuration Recommendations

Native container provides universal type (CPU: Memory is mainly 1:4), compute-optimized type (CPU: Memory is mainly 1:2), memory-optimized type (CPU: Memory is mainly 1:8), from the minimum 1 core 1G to 56 cores 448G (At present, configuration more than 4 cores has not been opened and if you are in need of that, please open ticket to apply for open.) The user can select instance type and corresponding configurations according to different business scenarios.

Universal Type: Compute capacity for being used universally in variable customer scenario by enterprises, small and medium sized database; used for data processing and caching clusters that require certain memories and in scenarios of back end server of other enterprise applications;

Compute optimized type: It is designed for duty-type application scenario and used in scenarios of compute in batch, front end server of Web, data analysis and game service etc.;

Memory optimized type: It is designed for duty-type application scenarios; high performance database, data analysis and mining, main memory database, distributed memory cache, Hadoop, Spark cluster and other enterprises’ large memory requirement applications.


