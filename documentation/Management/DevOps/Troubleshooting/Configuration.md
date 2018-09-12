# Configuration class problems

**1. How to program build.sh**

You need to add compilation scripts in the root directory of the code library, 

Compilation steps: 

1) Construct code 

2) copy output package to Output directory 
The online deployment directory is as follows:
```
/export/ 
- servers/ # 基础系统软件目录 
- Backup/ # 【包部署】存放编译包的备份目录 
- Packages/ # 程序目录（包+配置文件） 
- moduleName/ # 【镜像部署】应用键值 
- appKey/ # 【包部署】应用键值 
- latest -> /export/Packages/moduleName/version # 软链到对应最新版本 
- version # 版本号 
- Instances/ # 实例目录 
- appKey/ # 应用键值名称 
- 0.app_key/ # 实例名称 
- runtme ->/export/Packages/moduleName/version # 软链到部署的版本号包的存放目录 
- log ->/export/Logs/appKey/0.app_key # 软链到log目录 
- data ->/export/Data/appKey/0.app_key # 软链到data目录 
- Logs/ # 日志目录 
- appKey # 应用键值 
- 0.app_key/ # 实例名称 
- Data/ # 数据存放目录 
- appKey/ # 应用键值 
- 0.app_key/ # 实例名称
```


**2. What is Control script**

Add control script under code root directory bin/ to start, stop or check the service health 

Available reference example: in java-demo, src/main/scripts/control
