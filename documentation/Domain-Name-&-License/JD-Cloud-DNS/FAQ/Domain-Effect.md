## **Domain Name Validation Principle**

The domain name resolution process involves many nodes, with www.jdcloud.com as an example, the simplified flowchart is as follows:

![Domain Name Validation.png](http://img1.jcloudcs.com/cms/57f6ff37-9e3b-49c8-ac9b-04a060f6342f20180301151740.png)

1. The user initiates a DNS query request, carrying the domain name www.jdcloud.com

2. Local DNS receives the DNS resolution request and returns directly if there is a cache

3. Local DNS receives the DNS resolution request, and if there is no cache, it initiates a request to the root domain authoritative server

4. The root domain authoritative server returns to the top-level domain com server

5. Local DNS sends a request to the top-level domain com server, querying the authoritative server of the jdcloud.com domain

6. The top-level domain com server returns to the authoritative server of the jdcloud.com domain

7. Local DNS sends a request to the jdcloud.com authoritative server, that is, the cloud resolution server

8. Cloud resolution server, which resolves according to configuration issued by the user through the console, then returns to the IP address corresponding to domain name www.jdcloud.com

The above is the simplified process of complete domain name resolution. The customer initiates a DNS query request to Local DNS. The Local DNS is responsible for obtaining the resolution result step by step, and finally obtains the required data through cloud resolution

**Effective Time of Domain Name NS Modification**

The domain NS records can only be modified through the domain name registrar, and it needs to be synchronized to the root domain server to take effect across the network after the modification. The synchronization time is not consistent everywhere, which usually takes 24-48 hours. If it is not in effect more than 48 hours, you need to contact the corresponding domain registrar for location analysis.

**Resolution Record Adding and Effective Process Modification**

1. New Resolution Record

The cloud resolution server quickly synchronizes to all nodes and the resolution configuration takes effect in seconds. The customer initiates a DNS request, and as Local DNS does not have a cache, it iterates the query directly to get the new resolution record. The customer theory take effects in seconds as well, but some Local DNS without caches will jump to its own ad notification page, etc., the actual effective time depends on the local DNS behavior where the customer locates, which is typically no more than 1 hour.

2. Resolution Change Record

The cloud resolution server will quickly synchronize to all nodes as well and the resolution configuration will take effect in seconds. All nodes in the entire domain name resolution process have caches, the cache aging is constrained by the TTL of the record value. Only after the TTL expires, the Local DNS will re-iterate the query to get the new record value. The theoretical refresh time is roughly the same as the record TTL. However, some Local DNS will modify the TTL values obtained from the authoritative server, and the actual refresh time will depend on the Local DNS behavior configured by the customer.
