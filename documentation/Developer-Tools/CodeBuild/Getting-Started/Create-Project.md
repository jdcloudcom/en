# Create Application

Log in the CodeBuild interface, click **Create Application** in the project list page and create a compiling task.

1. Or access JD Cloud Console and click **Developer Tools** - **CodeBuild** at the navigation bar on the left to enter the Application List page.

2. Select the region in which the new application is located; click **Create Application** button to enter the Create Compilation Task page.

 ![](/image/codebuild/appList.PNG) 

3. Application Configuration

 ![](/image/codebuild/createApp1.PNG) 
 
   * Application Name
   
     Name the compile task. The name cannot be null and it supports only Chinese, numbers, uppercase and lowercase letters, English underline “ _ ” and line-through “ - ”, with at most 32 characters
   
   * Use Customized Image
   
     Support users to use the image in the customized Container Registry. By default, it uses the compiling image provided by the JD Cloud CodeBuild service.
   
   * Compiling Image
   
     Select compiling environments; it supports main compiled language environments as Java, golang and nodejs. If a user customized image is used, please fill in the image name and version here.
 
4. Construction Source Code Configuration

 ![](/image/codebuild/createApp2.PNG) 
 
   * Source Provider
   
     Support Git Public Repository and GitHub Private/Public Repository as well as JD Cloud CodeCommit.
     
   * Repository Address
   
     The URL address of remote repository is as the same as that of the git clone command
     
   * Code Branch
   
     Select the code branch you want to compile

5. Construction Configuration

 ![](/image/codebuild/createApp3.PNG) 
 
   * Construction Specification
   
     Provide the compilation scripts; use page templates or provide build.yml files in the source code root directory.
     
   * Construction Command
   
     Construction specification: If you select Insert Construction Command, please fill in the construction command here.

 
6. Construction Deposit

 Construction types include application package and image.
 
   * Construction Type - Application Package
   
     If you select an application package, the construction produces the output in .tar.gz format and uploads it to the user oss repository.
     
     ![](/image/codebuild/createApp4.PNG) 
     
   * Bucket
   
     Select the bucket in the user Object Storage Service, and store the construction output package.
     
   * Storage Directory
   
     The construction output will be uploaded to this directory. If it is null here, the construction output will be uploaded to the root directory of bucket be default.
     
     
   * Construction Type - Image
   
     If you select an image, the output is pushed to the Container Registry. If you compile dockerfile, you need to provide the dockerfile file in the code root directory.
     
     ![](/image/codebuild/createApp5.PNG) 
     
   * Container Registry
   
     Select the user Container Registry and push the constructed image.

	
7. Advanced Settings

   ![](/image/codebuild/createApp6.PNG) 
 
   * Time-out
   
     Specify a value from 30min to 120min (2h) and any incomplete construction in such period shall be deemed as a timeout. The default value is 30 min.
     
   * Computing Type
   
     At present, compiling image of three specifications: 1c1g, 2c2g and 4c4g are provided.
     
   * Notification Frequency
   
     Users can customize to send notification emails at the time of construction abnormal sending, or send the notification email for each construction.


Click **Save/Save and Construct** to complete project **Creation/Construct Now**.
