## Query User Refresh and Prewarm Block Quota (queryCdnUserQuota)

**API Description**

```reStructuredText
GET /v1/user:quota
```

### Request Parameter

### Response Parameter

| Name      | Type   | Description |
| --------- | ------ | ---- |
| result    | Result |      |
| requestId | String |      |

#### Result

| Name              | Type | Description                   |
| ----------------- | ---- | ---------------------- |
| dirAllCount           | int | Total Directory Refresh Quota |
| dirUsedCount         | int  | Used Directory Refresh Count                                              |
| dirRemainedCount      | int | Remained Directory Refresh Count                   |
| forbiddenUrlRemainedCount      | int | Remained Forbiddable URL Count                    |
| forbiddenUrlUsedCount      | int | Forbidden URL Count                   |
| forbiddenUrlAllCount      | int | Total Forbidden URL Quota                   |
| hasForbiddenDomainCount      | int | Blocked Domain Count, which is domains blocked for illegal contents under a user account  |
| prefetchRemainedCount           | int | Remained Available Prewarm URL Count |
| prefetchAllCount         | int  | Total Prewarm URL Quota                                              |
| prefetchUsedCount      | int | Used Prewarm URL Count                   |
| refreshAllCount      | int |         Total Refresh URL Quota            |
| refreshRemainedCount      | int | Remained Available Refresh URL Count                   |
| refreshUsedCount      | int | Used Refresh URL Count                  |
| totalUserDomainQuota      | int | Total User Domain Quota;  which is the total number of domains that can be added under an account|
| usedUserDomainQuota      | int | Used User Domain Count; which is the number of domains that have been added under an account, including disabled domains, blocked domains, etc.|
| remainUserDomainQuota      | int | Remained Configurable User Domain Count               |
