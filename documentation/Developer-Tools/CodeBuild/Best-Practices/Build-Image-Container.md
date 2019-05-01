# Build images and store them to Repository

The document takes an example of a building Golang software project to describe how to use CodeBuild.


The basic operation process is as follows:

1) Create source code in JD Cloud - CodeCommit

2) Create Registry and Repository in JD Cloud - Container Registry

3) Compile and build the example source code in JD Cloud - CodeBuild to produce images and complete pushing of the same

Please ensure that CodeBuild tasks and Container Registry are in the same region.

### Clone example codes to the CodeCommit

The code example address is: https://code.jdcloud.com/devops-demo/golang-demo

Please clone the example code to the CodeCommit and the address of the CodeCommit is https://code.jdcloud.com/

### Create Repository in Container Registry

**I. Creation of Registry**

 1. Turn on the Console, select [Elastic Compute - Container Registry - Registry](https://cns-console.jdcloud.com/host/containerregistry/list) and select **Create  
    ![](https://github.com/jdcloudcom/cn/blob/edit/image/Elastic-Compute/Container-Registry/创建注册表页面.png)  
 2. Select a region from cn-north-1, cn-east-2 and cn-south-1  
 3. Complete a name which is unique globally and is unchangeable; such name shall contain more than 3 characters but not more than 32 characters, started and ended with lower case letters and numbers; and the use of lower case letters, numbers and line-through (-) is supported  
 4. Description is not the compulsory item, which cannot exceed 256 characters and cannot be altered  
 5. The registry URI is automatically produced IN THE format of registry name-region abbreviation.jcr.service.jdcloud.com  
 6. Click **OK  

**II. Creation of Repository**

 1. Turn on [Elastic Compute - Container Registry - Repository](https://cns-console.jdcloud.com/host/containerrepository/list) and select **Create  
 ![](https://github.com/jdcloudcom/cn/blob/edit/image/Elastic-Compute/Container-Registry/新建镜像仓库.png)  
 2. Select a region from cn-north-1, cn-east-2 and cn-south-1  
 3. Select registry  
 4. Complete the name which shall contain more than 3 characters but not more than 255 characters; the name under the same registry is unique and unchangeable; the use of multiple namespace stages is supported, which are separated with a /; the namespace of each stage shall not be empty, started and ended with lower case letters and numbers; and the use of lower case letters, numbers, line-through (-) and underline (_) is supported  
 5. Description is not the compulsory item, which cannot exceed 256 characters and cannot be altered  
 6. Repository URI and registry URI/repository name are automatically produced  
 7. Click **OK  



### Create compilation task in the CodeBuild

Click **Create** task on the CodeBuild Task List Page.

Specific information is as shown below:

   ![](/image/codebuild/best-ct.PNG)
   
-  Application name: golang-demo
-  Image compilation: golang/golang 1.12
-  Code source: JD Cloud-CodeCommit
-  Codebase: Select an example code, devops-demo/golang-demo
-  Branch: master
-  Building command: Select and insert the building command
 ```
cmds:
  - name: Make output
    cmd: mkdir -p output;env
  - name: Unit Test
    cmd: go test ./... || exit 1
  - name: Build
    cmd: GOPATH=${WORKSPACE}/workspace; go install demo
  - name: Copy file
    cmd: cp -r bin output

# Package-extracting path is the required choice
out_dir: 'output'

 ```
-  Building type: Image
-  Repository: Select the created Repository
-  Advanced Configuration: Keep the default option


Save and run the setting. Compile and build tasks.

 
### View Building Logs

The latest building logs can be viewed in the Task Details Page or the building history can be viewed in the following building history page.

   ![](/image/codebuild/best-log.PNG)

### View pushed images by logging in Repository

When CodeBuild is successfully executed, the outputted image will be pushed to the Container Registry designated by the user.

The user can select Repository selected by CodeBuild in the Container Registry -- Image list to view the built and produced images.

   ![](/image/codebuild/best-image.PNG)


