# Forwarding Rules Group Management

[Principle Introduction](urlmap-management#user-content-1)

[Add A Forwarding Rules Group](urlmap-management#user-content-2)

[Manage Forwarding Rules Group](urlmap-management#user-content-3)

## Principle Introduction
<div id="user-content-1"></div>

Through configuration of forwarding rules, the Application Load Balancer can forward the traffic to different backend services for processing based on access requested domains and URL paths. Multiple forwarding rules can be configured in a forwarding rules group. The domain matching the request, the URL path, and the backend service to which it is forwarded can be defined in the forwarding rules.

In the same forwarding rules group, the system has sorted multiple forwarding rules configured by you based on match priority by default. In order of matching priority from high to low, the access request matches with each forwarding rule in order, after successful matching of certain rule, forward the request to the backend service associated with the rule for processing.

#### Domain

Domain supports entry of IPv4 address and domain. The domain supports exact match and wildcard match.

- Exact match: Enter format, such as www.jdcloud.com
- Wildcard match: The entry format must begin or end with "\*", such as \*.XXX or XXX.\*

When a client requests a domain that matches multiple forwarding rules simultaneously, the rule match priority is exact match > the longest wildcard match that starts with \* > the longest wildcard match that ends with \*.

#### URL Path

URL path supports exact match and prefix match.

- Exact match: Enter format, such as /path/abc
- Prefix match: The entry format must end with "\*", such as /path1\*

When a client requests multiple rules that match the same domain with different URL paths, the match priority is exact match > the longest prefix match.

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
    - Backend service: Backend service where Application Load Balancer forwards the packet of matching rules to. In the drop-down list, backend services that show the backend protocol as HTTP are shown.

4. Click **Edit** in the operation column in the forwarding rules list bar to edit the added rule.

5. Click **Delete** in the operation column in the forwarding rules list bar to delete the added rule.

      **Note**: Newly added Forwarding Rules Group shall be valid only after the listener is associated. For details, please see [Listener Configuration Guide](Listener-Management.md).

## Manage Forwarding Rules Group
<div id="user-content-3"></div>

1. View forwarding rules group: Click **Forwarding Rules Group Name** to enter Details of Forwarding Rules Group to view the detailed information of forwarding rules group.

1. Edit forwarding rules group: Click **Edit** under the operation column in the forwarding rules list to edit the forwarding rules group.

1. Delete forwarding rules group: Click **Delete** under the operation column in the forwarding rules list to delete the forwarding rules group. Once being deleted, the backend service associated with the forwarding rules group will be automatically disassociated the group.		
