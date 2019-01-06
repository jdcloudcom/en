
# API Gateway Trigger

API Gateway is an API hosting service. It provides full life cycle management for API, including release, management, running, maintenance, off-line, etc. In addition to self-system integration and service aggregation, a user can also conveniently and safely open its business functions and data, and connect with developers and partners via API Gateway.

You can implement Web backend services through writing Function and provide services externally through API Gateway. API Gateway will pass the request content to the function in the manner of a parameter and return the function returns as a response to the requester.

 

See Table 1 for the trigger configuration parameter description for API Gateway trigger, * is a compulsory item.
 
Table 1 API Gateway Trigger Information Table


| Field         | Description                                     |
| ----------- | ---------------------------------------- |
| * Trigger Type | Select the "API Gateway Trigger" in the drop-down list           |
| * Unreleased API group    | Select the created and unreleased API group from the created API groups  |
| * Version number     | Select API version number from the created version numbers     |
| * API        | Select API from the created APIs              |

Description: According to API Gateway rules, the unique API can be determined by API group, version number and API. Function can only associate with unreleased API to create the trigger, refer to API Gateway for details.

 
 

API Gateway Trigger Association Restrictions are as follows:

* In API Gateway, one API rule can only associate with one Function, but one Function can be associated as the backend by multiple API rules.
* Currently, API Gateway trigger only supports Function association in the same region.
