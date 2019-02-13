# Create New Items

Log in the CodeBuild interface, click **Create Project** in the project list page and create a compiling task.

1. Complete the project name (compulsory) in turn in the project creation page.

2. Image compilation: Select compiling environments, support main compiled language environments as Java, golang, node and static_resource and support user-customized compiling images.
 ![](../../../../image/codebuild/image.png)

3. Source provider: Support JD Cloud CodeCommit, GitHub private/public repository and other git public repositories

4. Repository address: The URL address of remote repository is as the same as that of the git clone command

5. Code branch: Complete code branches to be compiled

6. Creation specification: Output creation command as per the template, please refer below

	```
      ---
      # Set the required environment variables, it is not required to write if there is no need
      #envs:
      #  - name: 'name1' is Environment Variable Name here
      #    value: 'value1' is Environment Variable Value here
      #  - name: 'name2' sets multiple values in the listing manner
      #    value: 'value2'

      # Set compiled commands in the same setting manner as the environmental variables
      # For example:
      #cmds: 
      #  - name: 'do make' Step name
      #    cmd: 'make’ True command, if it’s not in the PATH, it needs to write the full path
      #  - name: 'do install'
      #    cmd: 'make install'
      cmds:
        - name: 'list current dir'
          cmd: 'ls'
        - name: 'make output dir'
          cmd: 'mkdir -p output'
        - name: 'touch some files'
          cmd: 'touch a b c'
        - name: 'copy to output dir'
          cmd: 'cp a b c output'

      # Package-extracting path is the required choice
      out_dir: 'output'
	```
7. Creation Type: Application Package\Image
 
  * When the application package is selected as the construction type, it is required to provide construction output storage oss address.
  
   ![](../../../../image/codebuild/package.png)
   
   Bucket: User’s Object Storage Service Bucket in the region where the compilation task resides
  
   Storage Directory: Directory under the Assigned Bucket
  
  * When the image is selected as the construction type, it is required to provide Container Registry address.
 
   ![](../../../../image/codebuild/docker.png)
   
   Container Registry: Select the Container Registry under the region where the compilation task resides If the corresponding Registry and Container Registry are not created, through creating repository link, redirect to the Container Registry page.

8. Display advanced settings:

Timeout: Specify a value from 30min to 120min (2h) and any incomplete creation in such period shall be deemed as a failure. The default value is 30 min.

Computing type: At present, 1c1g, 2c2g and 4c4g are provided.

Notification frequency: you can set the notification frequency as to send when there are creation exceptions or at every creation.

Click and Save/Save and Create Complete Project Creation/Create Now.
