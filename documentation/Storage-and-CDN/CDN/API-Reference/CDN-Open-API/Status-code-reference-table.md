# **Notification Information Status Code Reference Table**

ACTIVE_EXCEPTION(-1, "Interface Calling Exception"),

ACTIVE_SUCCESS(0, "Succeeded"),

ACTIVE_FAILURE(1, "Failed"),

ERROR_PARAMS_NOT_NULL(2, "Must provide a parameter"),

ERROR_USERNAME_NOT_NULL(3, "Must provide a user name"),

ERROR_SIGNATURE_NOT_NULL(4, "Must provide a user signature"),

ERROR_TYPE_NOT_NULL(5, "Must provide a type"),

ERROR_INSTANCES_NULL(6, "Must provide a refreshed file or directory list"),

ERROR_INSTANCES_100(9, "A single refresh cannot exceed 100 URLs"),

ERROR_PUBLISH_URLS_50(10, "File urls to be prewarmed cannot exceed 50"),

ERROR_SIGNATURE(7, "User signature is incorrect "),

ERROR_FREEALL(8, "Calling interface failed"),

 

ERROR_TASKID_NOT_NULL(11, "Must provide a task id"),

ERROR_DOMAIN_NULL(12, "Must provide the domain name to be queried"),

ERROR_STARTTIME_NULL(13, "Must provide a start time"),

ERROR_DATE_FORMAT(14, "Time format does not conform to the requirement, please set the time format as yyyy-MM-dd HH:mm"),

ERROR_NOT_USERDOMAIN(15, "There is a domain name not owned by you in the refreshed domain names"),

 

ERROR_TYPEERROR_NULL(16, "Type Format Error"),

ERROR_URLHTTP_ERROR(17, "The domain name refreshed or prewarmed is illegal"),

ERROR_ONLY_USERDOMAIN(18, "A domain name not owned by you is detected"),

ERROR_STARTTIMELARGE(19, "Start time cannot be later than end time"),

ERROR_BEFOREMONTH(21, "The date must be within one month following the current date"),

ERROR_USERNAME_ERROR(20, "User name is absent),

ERROR_QUERY_DOMAIN_50(22, "The number of queried domain names cannot exceed the number of domain names accelerated by you"),

ERROR_DOMAINTYPE(23, "Accelerated domain name type error, must be one among web, download and vod"),

ERROR_DOMAIN_SOURCETYPE(24, “Back-to-origin type error, must be one among ips, domain and oss"),

ERROR_SOURCE(25, "Back-to-origin data must be in json array format"),

ERROR_DOMAINSTATUS(26, "Domain name operation must be selected among start, stop and delete"),

ERROR_WEIGHT_NOTNULL(27, "Must provide a cache configuration weight"),

ERROR_TTL_NOTNULL(28, "Must provide a cache configuration cache time"),

ERROR_CONTENT_NOTNULL(29, "Must provide cache configuration cache contents"),

ERROR_CONFIGID_NOTNULL(30, "Must provide a cache configuration ID"),

ERROR_CACHE_STATUS(31, "Cache configuration must be selected among add, update and delete"),

ERROR_SOURCEHOST_NOTNULL(32, "Must provide a back-to-origin host"),

ERROR_CERTIFICATE_NOTNULL(33, "If communication protocol is https, must provide a certificate"),

ERROR_RSAKEY_NOTNULL(34, "If communication protocol is https, must provide a private key"),

ERROR_IGNORE_NOTNULL(35, "Setting of ignoring parameter status cannot be blank"),

ERROR_REFERTYPE_NOTNULL(36, "refer type cannot be blank"),

ERROR_REFERLIST_NOTNULL(37, "referList cannot be blank"),

ERROR_ACCESSKEYTYPE_NOTNULL(38, "URL authentication type cannot be blank"),

ERROR_ACCESSKEYKEY_NOTNULL(39, "URL authentication password cannot be blank"),

ERROR_ACCESSKEYKEEP_NOTNULL(40, “URL back-to-origin authentication"),

ERROR_FIELD_NULL(41, "Must provide the field to be queried"),

ERROR_DATE_OUT(42, "Only allow to query data within 7 days"),

ERROR_DATE_OUTONE(43, "Only allow to query data within 1 day"),

ERROR_DATE_OUT31(44, "Only allow to query data within 31 days"),

ERROR_DATE_OUT30(45, "Only allow to query data within 30 days"),

ERROR_INSTANCES_5(46, "Directory refreshed in a single time cannot exceed 5"),

ERROR_NOT_REFRSHREPEAET(47, "The address refreshed or prewarmed is duplicate"),