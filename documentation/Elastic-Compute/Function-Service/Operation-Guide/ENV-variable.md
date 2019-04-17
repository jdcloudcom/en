# Environment Variable Management

When creating or editing a function, you can add, modify, or delete environment variables for the function running environment through the console and SDK. Function provides your function code with the environment variables you configured.

With the environment variable of Function, you can pass the set dynamic parameters to the function code and library without any changes to the code.

## Application Scenarios

**Function access authorization**: By configuring environment variables, users can configure Function to access Bucket, databases, or caches of different Object Storage Service OSS.

**Configure key**: User name and password connected to the database, your JD Cloud AccessKey, or other security-sensitive authentication information can be set through environment variables.

**Configure variable**: For values that may change in the business, extract into environment variables so that it can avoid the need to modify code based on business changes.

**Environment differentiation**: configure corresponding configuration and database information for different development phases through environment variables, for different stages of testing, development, and release, different environment databases can be executed separately only by modifying the environment variables.

 

## Create environment variable

When creating a function or editing a function, the environment variable can be configured by editing the "environment variable" item. Environment variables usually appear as key-value pairs, please enter the required environment variable key in the previous environment variable input box and the required environment variable value in the latter environment variable input box.

 

## View environment variable

After the environment variable is configured, it can be viewed through the function configuration. The environment variable is displayed in the form of key=value.

 

## Use of Environment Variables

The configured environment variable will be configured to the running environment in which the function is running at run time, and specific values can be obtained by the method of code reading system environment variables and used in code.

In the Python running environment, the method to read environment variables is as follows:

```
import os
value = os.environ.get('key')
print(value)
```

 

**Use restrictions:**

* The total number of pieces of environment variables under a single function is 128.
* For each piece of record, the key size is up to 64 bytes and the value size is up to 128 bytes, and the value is not allowed to be null.
* The key must begin with a letter **[a-zA-Z]** and can only contain letters, digits, characters and underlines.
* The environment variables reserved by the system cannot be configured. For example: FUN_*, JVES_*, JCLOUD_*, HOSTNAME, PYTHON_VERSION, PATH and so on.
