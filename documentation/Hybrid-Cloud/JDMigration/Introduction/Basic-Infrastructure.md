# Basic Architecture
![创建实例](https://github.com/jdcloudcom/cn/blob/JDMigration/image/JDMigration/JDMigration-jcjg.png)
   The main interactive method between JDMigration and the user includes the Console interface, CLI and API, wherein:
 - Console: It is the main delivery method provided, providing visual and concise operation experience to the user.
 - CLI tool: Based on the command line tool under the Bash environment, it can access JDMigration via scripts.
 - API: The standard RestfulAPI based on HTTP protocol will be provided in future, and other systems can be integrated with the JDMigration via API. Functions realized via the Console can also be realized via API by the user.
 - Scheduling platform: A set of service capabilities required for user migration and disaster recovery has been defined, and rich customized scenarios can be achieved by orchestration engines.
 - Plug-in: The plug-in is used for accessing services provides by a partner or a third party, used for enriching and expanding capacities provided by the existing JDFusion platform

# Related References
- [Core Concepts](Core-Concepts.md)
- [Application Scenarios](Application-Scenarios.md)
- [Features](Features.md)


