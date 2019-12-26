# FAQ

**Q: What domains are supported by short URL?**

A: Shorturl has provided default domains at present. But there will be certain risks because these domains are commonly used. To avoid such risks, users are expected to apply for a domain. The best way is to apply one with JD Cloud Domain Service for filing and then send to the customer service staff for configuration. Then users can separately use their own domains to generate short URLs.

**Q: How to configure a short URL to resolve a customized domain**

A: For customized domain, you need to configure the domain cname at the domain management to the on-line domain related to the api, and then inform the management personnel. It can be used when the customized domain is configured to the online grouping domain at the backend.

**Q: Why is the short URL not correctly generated when I use one same url for calling to enter different short link lengths?**

A: For the same one user, a url can only be corresponding to one short link, which cannot be repeatedly generated. You can slightly modify the long link, for example, adding an unused parameter, e.g. ranParameter=123, or modify it when the short link becomes invalid. Another solution is to modify the valid short link. Modify the related old long link to an unmapped long link, and then continue using the old long link to enter and generate a new mapping relation between short link and long link, that is the new short link.