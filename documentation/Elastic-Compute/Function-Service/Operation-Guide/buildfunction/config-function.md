# Configuration Function

When a function is created, in addition to the code and any associated dependencies, the function attribute information shall also be configured. Function offers console and API to configure the function attribute. The function configuration information is shown as follows:

 

**name**(mandatory): Function Name It shall be unique within the current service and complies with the following restrictions:

   1. It can only contain letters, digits, underline and line-through
   2. It cannot begin with digits and line-through
   3. Case sensitive
   4. The length is between 1-128 characters
                         
**description**(optional): function description. Provide users with attributes for identification, recording, and you can easily describe your functions for annotation and differentiation. 

**entrance**(mandatory): processing function, which is the call entry for Function to run the user Function.

**memory**(optional): Memory resources required for the function to run, unit in MB. Value range is [128, 1024], the step size is 128 MB.

**runTime**(mandatory): Type upon function running.

**overTime**(optional): Maximum run time of function, unit in second.


**code**(mandatory): Code package. It must be zip type and uploaded locally.


**In addition to the above, the following can also be configured in the advanced configuration:**

**environment**(optional): Environment variables defined in the configuration are available from the environment when the function runs.

**vpcId**(optional): Configure VPC Virtual Private Cloud.

**subnetId**(optional): Configuration subnet, functions that have been configured in the VPC and subnet will be put in the configured Virtual Private Cloud to run.

Public network (require no configuration): The function opens public network access by default.

**logSetId**(optional): Designate log set.

**logTopicId**(optional): Designate log topic.

**Description**: Other attributes can be modified later, except the function name.
