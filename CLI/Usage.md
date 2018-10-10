
# Instructions for Use

## preposition condition

### Authentication AccessKey and SecretKey

Like JD Cloud Open API, the use of JD Cloud CLI requires application of AccessKey and SecretKey in advance, the user's AccessKey and SecretKey information are maintained uniformly by the user center, and the common key pair (basic cloud, data cloud, etc.) of each business line of Jingdong public cloud is shared;

The key pair allows enabling, disabling, and invoke the CLI after enabling it, and cannot call the CLI with it after being disabled;

The key pair refers to the account number function, and the key pair applied by the user belongs to the master key pair, and can be used for operating all resources under the account number of the user. The key pair applied by the user to the sub-account number belongs to the sub-key pair, and is used for the sub-account number to operate the authorized resource under the master account number.

### JD Cloud Python SDK

Currently, the CLI relies on the JD Cloud Python SDK, but it is automatically installed in the CLI installation process. If you need to manually install the Python SDK, refer to the installation method in the “Frequently Asked Questions“ if the version does not correspond to the problem that the CLI does not work properly.

### List of  JD Cloud CLI and Python SDK Version

Issue date|JD Cloud CLI|JD Cloud Python SDK
:---|:---|:---
2018.10.10 	|	0.7.1	|	1.2.16
2018.09.06  	|	0.7.0   |	1.2.13
2018.08.31  	|	0.6.0	|	1.2.12
2018.07.19  	|	0.3.0	|	1.2.0
2018.06.25	|	0.2.1	|	1.1.2
2018.06.23	|	0.2.0	|	1.1.1
2018.06.04	|	0.1.0	|	1.1.1



## structure model


	jdc [options] <command> <sub-command> [parameters and help]
options: Global options, including help, debug, quiet, output, etc.

command: cloud product service and tool commands

sub-command: corresponding to the OpenAPI interface in lowercase line-through

The parameter list corresponding to the operation entered in parameters and help: sub-command. The order of the list of parameters does not affect the use of the command. The parameters can be of various types of input values, such as numbers, strings, JSON structure.





## Input Parameters

The input parameters support three forms:

Standard CLI, operating parameter format is lowercase plus dash, parameter name front--(for example:--name)

For example:


	jdc nc describe-container --container-id c-8b23fwsb22



the parameter of the json format, the POST or PUT request of the OpenAPI, supports the direct entry of the json string or specifies the two sub-forms of the local file

For example:

a) Directly specify the json string


	jdc nc create-container --input-json
	'{
	    "maxCount": 1,
 	   "containerSpec":
	    {
        //The specific fields are omitted here, please refer to the example section for details.
	    }
	}'

b) Specify the json file


	jdc nc create-container --input-json 'file:///root/create.json'



Mixed formats for standard CLI and json, including standard CLI format and json format parameters (or files)

For example:


	jdc nc exec-create --container-id c-4rdi9c1jw3 --input-json '{"command": ["/bin/sh"]}'

 As shown, specific input parameter help interfaces when creating a VM explain where you need to be aware of.



Enter-h or--help to get this interface. The parameters enclosed in parentheses in the Usage are optional parameters and vice versa. Starting in the help of each parameter is a parameter type, a complex type (such as instanceSpec) can be entered using json, or a unified input-json parameter input can be used. The specific fields in the complex type can be generated using the generate-skeleton command under each product, and you can also refer to the JD Cloud official online document OpenAPI document: https://www.jdcloud.com/help/faq?act=3.



Note:

Simple parameters such as integers and strings, and no spaces between the spaces can be enclosed in quotes. Complex parameters, such as the json parameter, must be enclosed in single quotation marks to distinguish between the letters in the json string.

If no region-id parameter is entered in the specific command, the region-id value configured in the Profile is used by default.

If you need to set up an additional header, for example to call an interface that opens the MFA operation protection, you need to pass x-jdcloud-security-token, as follows:


	jdc nc delete-container --headers '{"x-jdcloud-security-token":"xxx"}' --container-id xxxxx

     




## Output Result

After the CLI service is called, the return data adopts a uniform format (same as the return format of the corresponding OpenAPI service), and the returned HTTP status code is 2xx, and the representative call is successful;The HTTP status code returned to 4xx or 5xx represents a call failure.

The data returned after the CLI successfully calls the CLI is in a unified format. The format is json. It is determined by the key in the request parameter, and the default is the json format. The current version only supports the data returned to the json format.

The return result needs to be fixed with the requestId property. Successful operations, if returned, need to be packaged in the result object. An error object needs to be provided in the return data when the operation fails. The error object's definition is defined in the error code. Some successful operations require simultaneous return to the result and error objects.

Examples of return results:

Success condition   


	{
    "result": {
        "instances": [Instance],
        "totalCount": 5
        },
    "requestId": " bc8gf89in0boc7bejvbikfecigrf3v1n"
	}

     

Failure condition


	{
    "requestId":" bc8gf89in0boc7bejvbikfecigrf3v1n",
    "error": {
        "code": 429,
        "message": "Out of resource quota",
        "status": "QUOTA_EXCEEDED",
        "details": [
        {
           "xxx": xx
        }
        ]
    }
	}




## interactive command

Two interactive commands for container products are currently supported: attach and exc-start.



- attach

Command Example:


	jdc nc attach --container-id c-afeqy1jcnb

Command Description: Attach an attach to a stdin of a container that has been run and then execute the action that the command executes. Execute Enter, the current interface is the command execution interface, for example, enter ls to display the list of directories.

Note that the command input from stdin is the command/args process dependent on the container. When command/args is/bin/sh, exit causes the exit of sh and to stop the container. You must use the exit shortcut Ctrl+PQ to exit the attach. If the container is having command, try restarting the container using the start-container command.



 

- exec-create

Command Example:


	jdc nc exec-create --container-id containerid --input-json '{"command": ["/bin/sh"] , "tty":true}'

command description: creating execution environment





- exec-start

Command Example:


	jdc nc exec-start --container-id containerid --exec-id execid

command description: execute the above-mentioned command to the inside of the container



Note: In Windows platforms, the container interaction command is in experimental stage. Before the command, you need to add a winpty prefix such as:


	winpty jdc nc attach --container-id c-abcdefg

Linux or Mac platforms are recommended.



## Skeleon generation

Each product command has a generate-senklet subcommand to generate an input parameter framework for a suboperation, that is, an empty json string. The user can copy the complex input parameter json string to a file for storage, fill specific parameters with optional information according to the parameters identified in the OpenAPI document, and then use--input-json 'file:// xx/ x.json' to create or modify resources.

OpenAPI documentation: https://www.jdcloud.com/help/faq?act=3


 
## multi-user use



As shown above, you can use the jdc configure command to configure multiple sets of profiles to distinguish between different users. Each Profile has a corresponding name, which can be switched using the use subcommand.

Note:

AccessKey and SecretKey are stored in clear text, and

Profile currently used cannot be deleted

Cannot duplicate name when adding Profile
