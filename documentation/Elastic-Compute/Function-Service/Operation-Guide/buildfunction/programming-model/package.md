# Create Function Deployment Package

The function deployment package is the zip file of the function code and the dependency item. When creating the zip file, such file only includes codes and its dependency item and excludes a folder. The user can create a function deployment package locally and upload the same to Function or directly compile codes on-line in the console.


 

**Simple scenario**-The OSS and SDK library of API Gateway, provided by JD Cloud, can be used by the customized code dependency library. If there is only one code file, you can use the code editor of the console... The console will automatically compress codes and relevant configuration information into a deployment program package which is able to run.

 
**Senior scenario**-If the written codes require other resources (If the Web programming is conducted by using the Web frame, a database link library is used for performing database commands and the like), a function deployment program package shall be created in the local environment at first and then uploaded via the console.

 

**Package Requirement:**

Function specifies that the function deployment package must be in the .zip format. In case of packing, only the directory contents are packed rather than the directory itself. When being packed, the function entry file shall be located in the root directory of the package.

* When packing under Windows, the function code directory can be entered. Once all files are selected, click right key of the mouse, select "Compress to a .zip File" and a deployment program package is generated. The zip package unzipped for browsing shall directly contain the entry program and other libraries.

* When packing under Linux, the function code directory can be entered. The source files can be assigned as complete files under the code directory by calling the zip command and a deployment program package can be generated, such as `zip /codefile/func_code.zip * -r`.
