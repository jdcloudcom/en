# Configuration class problems

**1. How to program build.sh**

You need to add compilation scripts in the root directory of the code library, 

Compilation steps: 

1) Construct code 

2) copy output package to Output directory 
The online deployment directory is as follows:
```
/export/ 
- servers/ # Basic system software directory 
- Backup/ # 【package deployment】Spare directory saving compilation package 
- Packages/ # Program directory (package + configuration file) 
- moduleName/ # 【image deployment】Application key value 
- appKey/ # 【package deployment】Application key value 
- latest -> /export/Packages/moduleName/version # Soft link to the latest version correspondingly 
- version # Version number 
- Instances/ # Instance directory 
- appKey/ # Name of application key value 
- 0.app_key/ # Instance name 
- runtme ->/export/Packages/moduleName/version # Soft link to the saving directory of the deployed version number package 
- log ->/export/Logs/appKey/0.app_key # Soft link to log directory 
- data ->/export/Data/appKey/0.app_key # Soft link to data directory 
- Logs/ # Log directory 
- appKey # Application key value 
- 0.app_key/ # Instance name 
- Data/ # Data saving directory 
- appKey/ # Application key value 
- 0.app_key/ # Instance name
```


**2. What is Control script**

Add control script under code root directory bin/ to start, stop or check the service health 

Available reference example: in java-demo, src/main/scripts/control
