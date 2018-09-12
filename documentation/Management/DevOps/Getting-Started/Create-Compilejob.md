# Create construction task

Create compilation construction task to start code compilation.

**Operation steps**

1. Select one application in the Service Tree at the left side, select “Continuous Delivery-Compilation Construction” from the menu in the navigation bar, click “New Construction” button to set basic information of compilation construction. 

- Git code address: enter the source code address, example codes can be entered here
- Code branch: select code branch to be compiled
- Construct image: select compilation environment, new it supports Java, golang, node, static_resource and other compilation environments
- Construction method: it supports build.sh and makefile
- Trigger conditions: construct manually or trigger compilation construction automatically when submitting codes to branch(es)
- Revision rules: provide revision naming rules and archive them to the revision library

Here, it also supports to set construction parameters, message notification, webhook, LFS, cache compilation workspace and other functions

2. After saving, enter the compilation construction list, click “Construct Now” to perform compilation construction operation. If the construction is successful, module revision with compiled construction can be seen in Module-View Revision.
