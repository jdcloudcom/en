# Permission Control Overview

The authorization management mainly aims to solve the problem that how to safely authorize others to access the user’s resources without exposing the user’s account, password and AK/SK. Great potential safety hazards will be brought if the unified account and AK/SK are used by different users. This is because all users knowing the account password and AK/SK can operate all resources under the account at will and important information may be stolen. However, the authorization management avoids such case, facilitates the administrator assign permissions based on use demands of different users and improves resource utilization rate and resource security.

To fit to different customer scenarios of the users, the Message Queue authorization can be divided into two methods, i.e. the primary-primary authorization and the primary-sub authorization.

- Primary-primary authorization: The JD Cloud primary account is the basic main body for JD Cloud resource affiliation and resource consumption metering and billing. JD Cloud primary account authorizes another primary account on JD Cloud, namely the primary-primary authorization.
- Primary-sub authorization: JD Cloud primary account authorizes its own subsidiary account, namely the primary-sub authorization.

Authorization logic: Only if the primary account grants permission to a resource to another primary/sub-account, only the primary/sub-account has that permission. If no permission is granted, another primary/sub-account does not have that permission.
