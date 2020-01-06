# Function Management

Via sca cli, you can view cloud function information and conduct operation of deletion.

## Function Management Command    
### View function list information
`sca function list`  View existing function resource list on cloud.
### View function configuration
`sca function info`  View deployed cloud function configuration.
### Delete cloud function
`sca function del`   Delete deployed cloud functions

#### Parameter Description

| Abbreviation | Parameter       | Required | Description                                                         | Example           |
| ---- | ---------- | ---- | ------------------------------------------------------------ | -------------- |
| -n   | name       | Y    | Delete specified function                  | -n hello-world    |


## Use Example  
View cloud function list.    
```
$ sca function list
FunctionName     DESCRIPTION      Runtime      CODE URL                                                            CREATE TIME  
hello_world                       Python3.6    http://oss-function-hb.s3.cn-north-1.jcloudcs.com/xxxxLATEST.zip    2019-12-20T07:47:55Z    hello_world2                      Python3.6    http://oss-function-hb.s3.cn-north-1.jcloudcs.com/xxxxLATEST.zip    2019-01-24T07:51:47Z
hello_world3                      Python2.7    http://oss-function-hb.s3.cn-north-1.jcloudcs.com/xxxxLATEST.zip    2019-01-16T14:09:50Z 
``` 
Delete cloud function in the name of hello_world.
```
$ sca function del -n hello_world
FunctionName     Runtime              Status          CreateTime                  ModTime       
hello_world      Python3.6            Active          2019-12-17 11:23:47         2019-12-17 11:23:47
ensure to delete or not? Y/N
N
``` 
