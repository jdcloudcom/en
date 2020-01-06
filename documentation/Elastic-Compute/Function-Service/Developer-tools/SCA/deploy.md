# Packing Deployment
You can packing and deploy local projects to cloud via simple commands of sca cli.
## Deployment Command

` sca deploy`     According to appointed function template configuration file, information such as appointed code package and function configuration is packed and deployed to cloud.

## Parameter Description

| Abbreviation | Parameter          | Required | Description                                                   | Example        |
| ---- | ------------- | ---- | ------------------------------------------------------ | ----------- |
| -t   | template-file | N    | Configuration file for function project deployment supports yaml format.         | deploy.yaml |


Remark: When there are functions, original functions will be updated and replaced by force

## Use Example

