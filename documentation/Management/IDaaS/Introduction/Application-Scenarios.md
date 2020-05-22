# Application Scenarios

## Single Sign-On

To implement the single sign-on of applications, the application program must support OAuth2.0 or SAML2.0 protocols. A trust protocol can be established between the Identity Pass beta and an application by adding the application and configuring trust information. When a user log in the Identity Pass beta, the Identity Pass beta can securely pass the user identify verification information to the application and the user is not required to log in the application again.

Users can directly use the Identity Pass beta account or a third-party account to log in the Identity Pass beta. The Identity Pass beta supports adding a 3rd Party IdP through OAuth2.0 protocol.

## Application Access Management

The Identity Pass beta supports the application authorization to a user, user group or organization unit. When an enterprise adds an application to the Identity Pass beta, users have no default access permission. The Identity Pass beta will only share the user’s identity authentication information to the application after the application is explicitly authorized to the user or its user group or organization unit. Otherwise, when a user attempts to log in an application by single sign-on through the Identity Pass beta, he will be refused due to lack of authorization.

The permission management of the Identity Pass beta is only limited to the application granularity, and doesn't support operations in the application.
