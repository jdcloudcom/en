# Add Application and Authorization

Identity Pass beta supports applications of OAuth2.0 and SAML2.0 types. OAuth2.0 supports [Authorization Code Mode](https://tools.ietf.org/html/rfc6749#page-24) (Authorization Code Grant) and [Implicit Mode](https://tools.ietf.org/html/rfc6749#page-31) (Implicit Grant), through HTTP-POST Bindings, SAML2.0 supports [SSO Profile](https://docs.oasis-open.org/security/saml/v2.0/saml-profiles-2.0-os.pdf).

## Create Application

Log in the Application Management Page, click **Create Application** and select the type of application to be created - OAuth2.0 Application or SAML2.0 Application. After filling in the application name and description, click **Next** to create the application. The application type cannot be modified after the application is created.

![创建应用](../../../../image/IDaaS/create-app-0.png)

## Configure Application

The "Configuration Information" Page of the application is composed of two parts.

Part I, "Identity Provider Information", includes metadata information of the Identity as IdP, which will be required by application programs to be added. The OAuth2.0 IdP metadata information can be viewed at https://idaas-idp-oauth2.jdcloud.com. The SAML2.0 IdP metadata can be viewed at https://idaas-idp-saml.jdcloud.com/{appID}/metadata

Part II, "Application Information Configuration" requires SP trust information. Please confirm such information with the service provider.

## Authorize Application

In the "Application Management" List, you can either select applications in batch and authorize them to users, or select **Authorize** on the right side of the list and perform authorization by user, user group or organization. When a user group is authorized, the group members will inherit this authorization; when an organization unit is authorized, the organization members will inherit this authorization.

![应用授权](../../../../image/IDaaS/app-auth.png)

On a user's details, you can view, add or cancel the authorized applications of this user. You can only cancel authorizations directly authorized to applications of this user, and cannot separately cancel authorizations that are inherited from applications of a user group and organization unit.

![用户应用授权](../../../../image/IDaaS/user-app.png)

## Use Application

Users log through a URL of an enterprise portal and enter the view of "My Application" to view and access all authorized applications. If you haven't obtained any application authorization, there will be no application displayed on the page.

![用户应用授权](../../../../image/IDaaS/my-apps-0.png)

Users can also initiate a single sign-on request from the application side, enabling the application program to redirect the user to Identity Pass beta for login verification.

The user should first designate the enterprise name of his enterprise and the information is designated by the administrator in "Enterprise Settings"; after entering the enterprise portal login page, the user can perform login. If the application initiating the single sign-on request has authorized the user, then the user can complete the application login; otherwise, the unauthorized application access will be intercepted by Identity Pass beta.

![用户应用授权](../../../../image/IDaaS/sso.png)
