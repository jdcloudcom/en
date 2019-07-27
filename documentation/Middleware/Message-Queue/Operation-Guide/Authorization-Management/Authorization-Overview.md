# Permission Control Overview

The authorization management mainly aims to solve the problem that how to safely authorize others to access the user’s resources without exposing the user’s account, password and AK/SK. Great potential safety hazards will be brought if the unified account and AK/SK are used by different users. This is because all users knowing the account password and AK/SK can operate all resources under the account at will and important information may be stolen. However, the authorization management avoids such case, facilitates the administrator assign permissions based on use demands of different users and improves resource utilization rate and resource security.

To fit to different customer scenarios of the users, the Message Queue authorization can be divided into three methods, i.e. the primary-primary authorization, the primary-sub authorization and role authorization.

- Primary-primary authorization: The JD Cloud primary account is the basic main body for JD Cloud resource affiliation and resource consumption metering and billing. JD Cloud primary account authorizes another primary account on JD Cloud, namely the primary-primary authorization. The primary-primary authorization is mainly used for the long-term authorization scenario across accounts.
- Primary-sub authorization: JD Cloud primary account authorizes its own subsidiary account, namely the primary-sub authorization. The primary-sub authorization is mainly used for the scenario of further dividing resources under the primary account by different sub-accounts.
- Role authorization: The role is a virtual identity type required to be played by a credited entity user. If the role successfully played, the entity user can get the temporary security credential of the role, i.e., the temporary security token with which the authorized resources can be accessed with the role identity. This is called role authorization. Role authorization is mainly used for the cross-primary account access and temporary authorization scenarios.

Authorization logic: Only if the primary account grants permission of a resource to another primary, sub-account or role, the account has that permission. If no permission is granted, other primary accounts, sub-accounts or roles are not granted with the permission.

