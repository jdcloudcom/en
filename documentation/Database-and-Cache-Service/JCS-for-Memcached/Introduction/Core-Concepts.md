# Core Concepts
Terms|Descriptions
---|:---
Memcached|Memcached is a high-performance distributed memory object storage cache system. The JCS for Memcached is compatible to the Memcached binary protocol and the text protocol.
Instance ID	|An instance corresponds to a user space and is the only identifier of JCS for Memcached instance.
Connection address	|The host address is used to connect to JCS for Memcached, displayed as a domain name, and can be searched in Instance Information> Basic Information > Connection Information.
Connection password	|The password is used to connect to JCS for Memcached. The password can be set or not at the time of purchasing.
SASL	|SASL (Simple Authentication and Security Layer) is a mechanism use for expanding C/S mode verification capacity. Memcached supports SASL verification since its version 1.4.3. Due to the multi-tenant sharing feature of JCS for Memcached, the SASSL is used as the authentication mechanism as well. In nature, SASL can guarantee caching data security by using password. The policy of strong password and periodic password modification is recommended for use.
