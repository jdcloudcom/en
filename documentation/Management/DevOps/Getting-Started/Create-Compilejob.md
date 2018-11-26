# Create construction task

Create compilation construction task to start code compilation.

**Operation steps**

1. Select one application in the Service Tree on the left side, select “Continuous Delivery-Compilation and Construction” in the menu bar, click **New Construction** to set basic information of compilation and construction.

![Alt text](https://github.com/jdcloudcom/cn/blob/DevOps/image/DevOps/Starting8.png)


- Git code address: enter the source code address, example codes can be entered herettps://code.jdcloud.com/devops-demo/java-demo.git
- Module Name: The default name is acceptable.
- Code Branch: Please complete master
- Image Construction: official library/maven 3.5.0-jdk-8u20
- Construction Method: Support build.sh
- Trigger conditions: construct manually
- Revision rules: revision naming rules
- Upload position for construction: Please select the position as the same as that of the Virtual Machines.

Here, it also supports to set construction parameters, message notification, webhook, LFS, cache compilation workspace and other functions

2. After saving, enter the compilation construction list, click **Construct Now** to perform compilation and construction operation.

![Alt text](https://github.com/jdcloudcom/cn/blob/DevOps/image/DevOps/Starting9.png)

If the construction is successful, module version compiled and constructed can be seen in Module-View Version.
