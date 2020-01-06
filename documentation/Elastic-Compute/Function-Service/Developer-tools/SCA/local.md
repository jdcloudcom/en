# Local Invoking Function (local invoke)

Via debugging local functions, users can run codes in local simulated environment before deployment, send simulated test event, verify function execution and get running information and log.        
## Rely on docker
Before running local debugging, please make sure that Docker has been installed and started in local environment. For installation and configuration of Docker, please refer to [Installation and Configuration](install.md).
## Local Debugging Command
`sca local invoke`  sca sli can start container instance according to appointed function template configuration file, mount code directory to appointed directory of container instance, run codes via appointed trigger event and realize simulated running of local cloud functions.

## Parameter Description


| Abbreviation | Parameter       | Required | Description                                                         | Example           |
| ---- | ---------- | ---- | ------------------------------------------------------------ | -------------- |
| -e  | event     | N    | Simulate file source of test event. File content must be in JSON format. If no test template is appointed, the character string key:value will be transmitted by default                 | event.json   |
| -t  | template   | N    | Path or file name of project description configuration file is template.yaml |template.yaml by default    |
| -n  | env-vars | N    | For environment variable configuration when functions are running, environment variable configuration files shall be appointed and such files must be in the JSON format    | env.json |

## Use Example 
