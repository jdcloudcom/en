# Forwarding Rules Group Management

[Principle Introduction](urlmap-management#user-content-1)

[Add Forwarding Rule Group (Forwarding and Redirection)](urlmap-management#user-content-2)

[Manage Forwarding Rules Group](urlmap-management#user-content-3)

## Principle Introduction
<div id="user-content-1"></div>

The Application Load Balancer, if configured with a Forwarding Rule Group, can enable the access request-based domain and URL path to forward the access request to different backend services for processing or redirect such request to specified URLs. One Forwarding Rule Group can be configured with multiple forwarding rules. In the Forwarding Rule, the domain, URL path and executed action matching a request can be defined.

In the same Forwarding Rule Group, system is set by default that the multiple forwarding rules configured for you have been placed in sequence in accordance with the matching priority. The access requests will match various forwarding rules in sequence in accordance with the matching priority from high to low, and after an access request successfully matches a forwarding rule, such request will be forwarded to the backend service processing bound to such forwarding rule or redirected to a specified URL.

#### Regular domain

Domain supports entry of IPv4 address and domain. The domain supports exact match and wildcard match.

- Exact match: Enter format, such as www.jdcloud.com
- Wildcard match: The entry format must begin or end with "\*", such as \*.XXX or XXX.\*

When a client requests a domain that matches multiple forwarding rules simultaneously, the rule match priority is exact match > the longest wildcard match that starts with \* > the longest wildcard match that ends with \*.

#### Regular URL path

URL path supports exact match and prefix match.

- Exact match: Enter format, such as /path/abc
- Prefix match: The entry format must end with "\*", such as /path1\*

When a client requests multiple rules that match the same domain with different URL paths, the match priority is exact match > the longest prefix match.

#### Forwarding action (forwarding and redirection)

The action executed after a forwarding rule is matched and its values include forwarding and redirection.

- Forwarding: It means to forward the access requests matching rules to specified Backend Servers for processing
- Redirection: It means to redirect the access requests matching rules to specified URL addresses. Support configuring redirected protocols, domains, ports and URL paths, as well as querying parameters and ways for redirection.

#### Forwarding Process

Only seven-layer (HTTP/HTTPS) listening support association of forwarding rules groups. One listener only can be associated with one forwarding rules group; multiple listeners under the same Load Balancer can be reused to associate with the same forwarding rules group. After associating the Listener with forwarding rules group, the process that Application Load Balancer processes the request is as follows:
![转发规则组列表页](../../../../image/Networking/ALB/ALB-urlmap1.png)

## Add A Forwarding Rules Group
<div id="user-content-2"></div>

1. Enter the forwarding rules group list page by Application Load Balancer-Detail-Forwarding Rules Group.

	![转发规则组列表页](../../../../image/Networking/ALB/ALB-urlmap2.png)

2. Click **Create Forwarding Rules Group**，open forwarding rules group creation page, fill the name and description of forwarding rules group.

3. Click **Add Rules**, configure forwarding rules for forwarding rules group.
    - Domain: Domain for matching client request. Support entry of IPv4 address and domain, domain supports exact match and wildcard match, the entry limitations are as follows:
      - It only supports entry of uppercase and lowercase letters, numbers, English line-through "_" and ".", case insensitive, which cannot exceed 110 characters.
      - Include at least one dot "." and do not begin or end with dot "." and line-through "-", dot "." cannot be after or before line-through "-".
      - Wildcard match support includes one star "*", entry format is \*.XXX or XXX.\*.
    - URL path: URL path for matching client request, support exact match and prefix match.
      - Must begin with /.
      - Only support uppercase and lowercase letters, numbers and special characters: $-_.+!' ()%:@&=/, case sensitive, and the description cannot exceed 128 characters.
      - Wildcard match support includes one star "*", entry format is /XXX\* or /\*.
    - Action: The action executed after a rule is matched; its values include forwarding and redirection.
      - Forwarding: It means to forward access requests to specified backend services and the drop-down list only shows the backend services with HTTP as their backend protocols.
      - Redirection: It means to redirect access requests to specified URL addresses and can be configured with the following parameters
           - Redirected protocol: The values are HTTP and HTTPS, and the default value is #{protocol}. The default value means that the protocol of request will not be modified after redirection and such value is consistent with the protocol of client request.
	    - Redirected port: The value is 1~65535 and the default value is #{port}. The default value means that the port number of request will not be modified after redirection and such value is consistent with the port number of client request.
	    - Redirected domain: Support input of IPv4 address and domain. The restrictions for domain input are as follows: Only support capital and lower-case letters, figures and English line-through "-" and point "." (case-insensitive);include at least one point "."; do not start or end with a point "." or a line-through "-"; do not exceed 110 characters. The default value of #{domain} means that the domain of request will not be modified after redirection and such value is consistent with the domain of client request.
	    - Redirected URL path: Must start with / and only support capital and lower-case letters, figures and special characters $-_.+!'()%:@&=/ (case-sensitive) with no more than 128 characters. The default value of #{path} means that the URL address of request will not be modified after redirection and such value is consistent with the URL path of client request.
	    - Redirected query parameter: Do not need a manual input of ?; system is set by default to add the parameter with no more than 128 characters. The default value of #{query} means that the query parameter of request will not be modified after redirection and such value is consistent with the query parameter of client request.
	    - Redirecting methods: The values include 301 Permanently Moved and 302 Temporarily Moved.

4. Click **Edit** in the operation column in the forwarding rules list bar to edit the added rule.

5. Click **Delete** in the operation column in the forwarding rules list bar to delete the added rule.

      **Note**: Newly added Forwarding Rules Group shall be valid only after the listener is associated. For details, please see [Listener Configuration Guide](Listener-Management.md).

## Manage Forwarding Rules Group
<div id="user-content-3"></div>

1. View forwarding rules group: Click **Forwarding Rules Group Name** to enter Details of Forwarding Rules Group to view the detailed information of forwarding rules group.

1. Edit forwarding rules group: Click **Edit** under the operation column in the forwarding rules list to edit the forwarding rules group.

1. Delete forwarding rules group: Click **Delete** under the operation column in the forwarding rules list to delete the forwarding rules group. Once being deleted, the backend service associated with the forwarding rules group will be automatically disassociated the group.		
