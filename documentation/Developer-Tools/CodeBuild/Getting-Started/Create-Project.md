# Create New Items

Log in the CodeBuild interface, click **Create Project** in the project list page and create a compiling task.

1. Complete the project name (compulsory) in turn in the project creation page.

2. Image compilation: Select compiling environments, support main compiled language environments as Java, golang, node and static_resource and support user-customized compiling images.

3. Source provider: Support git public repository and GitHub private/public repository

4. Repository address: The URL address of remote repository is as the same as that of the git clone command

5. Code branch: Complete code branches to be compiled

6. Creation specification: Output creation command as per the template

7. Creation storage: The created product is uploaded to the specified bucket and directory under the user’s specified area.

8. Display advanced settings:

Timeout: Specify a value from 30min to 120min (2h) and any incomplete creation in such period shall be deemed as a failure. The default value is 30 min.

Computing type: At present, 1c1g, 2c2g and 4c4g are provided.

Notification frequency: you can set the notification frequency as to send when there are creation exceptions or at every creation.

Click and Save/Save and Create Complete Project Creation/Create Now.
