# Cloud Log   
You can view cloud function execution log via simple commands of sca cli.

## Log Search Command

`sca log`   Search execution logs within an appointed cloud function period.

## Parameter Description

| Abbreviation | Parameter          | Required | Description                                                   | Example        |
| ---- | ------------- | ---- | ------------------------------------------------------ | ----------- |
| -n   | name | Y    | Get appointed cloud function log       | -n hello_world |
| -s  | start-time | N    | Get logs after the appointed start time. If start-time is unavailable, logs after 10min will be gotten by default    |-s "2019-7-12 00:00:00" |
| -e   | end-time | N    | Get logs before the appointed start time. If start-time is unavailable, logs before 10min will be gotten by default         | -e "2019-7-12 00:10:00" |
| -d   |d uration | N    | Get logs of latest x second(s)         | 	-d 600 |

Remark: The --duration parameter is not added and logs of last 10min will be gotten by default.

## Use Example
