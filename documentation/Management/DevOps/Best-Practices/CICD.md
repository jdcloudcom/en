# Continuous delivery

Let’s take Java as an example to demonstrate the whole process from compilation and construction to deployment.

**Operation steps**

I. Create elastic deployment application in the Service Tree

Click add application at the left side of Service Tree system (Department-Product line-System).

Carry out basic settings, role settings, group and instance settings of the application. Select Elasticity.

Thus, an elastic deployment application is created.

II. Compilation and Construction

Select Application in Service Tree at the left side, then enter Continuous Delivery - Compilation and Construction page, click New button at top right, enter the following information on the New Construction page:

Application name: The default Application Name in the selected Service Tree 

Git code address: please enter the code library is Java example address

Enable LFS: No 

Module name: devops-demo java-demo 

Code branch: master 

Create image: library/maven 3.5.0-jdk-8u20 

Compilation: none 

Construction method: build.sh 

Construction parameter: none 

Trigger condition: construct manually 

Construction type: code package 

Revision rules: optional 

Cache compiling workspace: no 

Construct upload location: optional

Click Save, then click Construct Now button at the right side

Jump to the Construction History page, the construction result will be refreshed in real time. Wait for a moment, success will be displayed inn green as the construction result 
Then, the compilation construction is completed

III. Online release

The next step is online release 

Ensure to select Application at the left side, then enter Continuous Delivery–>Online Release

1) Basic settings (it shall be configured at the initial use)

Executive account: root 

Port: 8080 

Belonged module: devops-demo/java-demo

2) Group configuration

Confirm that group is created

3) Online

Click to select Group button, then select the group created above and enter:

Concurrency between groups 

Concurrency within group 

Time-out period 

Select construction package+latest configuration as the online contents 

Package revision: the package revision compiled in the above

Click Online, it will jump to Online Detail page, the refreshed online progress in real time can be seen. In the JD Cloud console (https://console.jdcloud.com/),
the Virtual Machine automatically created according to the group configuration can be seen

IV. Verification

Access Public IP:9011, you will see the Welcome webpage
