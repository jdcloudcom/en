# Overview

Operation protection means that when you are performing sensitive operations, you are required to perform identity verification before the final execution of the operation, to prevent the false deletion and misoperation of resources to the greatest extent. Currently, the separate setting of primary accounts and sub-accounts is available, and three identity verification methods are provided: MFA verification, SMS verification, and Email verification.


At present, operation protection supports setting of primary account and sub-account levels. The Console operation and the verification method for the user’s directly calling Open API support are slightly different.

## Primary Account

The primary account supports three verification methods, including virtual MFA Verification, SMS Verification and Email Verification. The Console operation, the verification method for the user’s directly calling Open API support and the effective period of tokens are described in details as follows:

| 	|   Virtual MFA Verification	|  SMS Verification    	|  Email Verification 	| 
|:-------:|:-------:|:-------:|:-------:|
| Console	|  30s	| 5min 	|   5min	|
| The user directly calls Open API | the user can carry out setting independently, and support 1,800s at most 	| -   	| - 	| 

## Sub-user

The sub-user currently only supports virtual MFA.

| 	|   Virtual MFA Verification	|  SMS Verification    	|  Email Verification 	| 
|:-------:|:-------:|:-------:|:-------:|
| Console Operation	|  30s	| -	|   -	|
| The user directly calls Open API | the user can carry out setting independently, and support 1,800s at most 	| -   	| - 	| 
