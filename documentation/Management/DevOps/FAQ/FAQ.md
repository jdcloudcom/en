# FAQ

**Q: What’s the name of my tenant?**

**A**: Upon logging in DevOps, leave the icon on the upper-right user name and the tenant name/user name will be displayed in the drop-down list.

![Alt text](https://github.com/jdcloudcom/cn/blob/DevOps/image/DevOps/FAQ1.png)

**Q: How to upload the program package well compiled locally to DevOps?**

**A**: Log in the menu bar -> compilation and construction page, select an application on the left side, log in the module page, click **Creation Module** to create a module.

Click **Upload** of the created module.

![Alt text](https://github.com/jdcloudcom/cn/blob/DevOps/image/DevOps/FAQ2.png)

**Q: How to compile different modules under the same git project?**

**A**: 1) Creation of build.sh can be made only when the compiled products are under the directory of the same level (output/). Different module names received by build.sh are used as parameters.

 2) You need to create the control start and startup scripts under the directory bin/. Similarly, decision of start a module can be made by accepting and using different module name as parameters.
 
 3) For compilation of different modules, you need to specify the construction parameters in the process of compilation and construction, make the parameter judgment via build.sh and finally select compilation of different modules.

The examples are as follows:

Demand: Structures under the code repository is as follows: /A/m and /A/n are two modules for the same repository, A refers to directory (rather than maven project) and m  and n are two maven projects.

Solutions: Add build.sh under m and n, with compiling commands and methods of the project. Then, provide a build.sh in the root directory of code base, with approximate contents below:

cd $1 //Enter into the subdirectory  

source ./build.sh //Run compiling script of subdirectory

Then, create parameters with <Subdirectory> in the creation and construction page.

Demand: Packages for different environments will be compiled under the m project (for example, test and production). How to set the parameter dynamically?

Solution: The build under the root directory accepts two parameters, build.sh m test. Please enter the first folder in accordance with the first parameter, then create build.sh test and define the compilation command of the test parameter in build.

![Alt text](https://github.com/jdcloudcom/cn/blob/DevOps/image/DevOps/FAQ3.png)

**Q: The image has been uploaded to the Container Registry. How to find it in Construction Image of the Creation, Compilation and Construction page?**

**A**: Modify the image type to be the compiling image in the image details of the Container Registry.

![Alt text](https://github.com/jdcloudcom/cn/blob/DevOps/image/DevOps/FAQ4.png)

**Q: What is the correspondence between the machine resource and the service tree node?**

**A**: If the machine belongs to a product line, such machine resource cannot be shared between product lines. The machine resource in a product line can be shared by different applications.
