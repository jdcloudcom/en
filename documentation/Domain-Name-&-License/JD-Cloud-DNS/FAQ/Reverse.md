## **Reverse Resolution**

**What is reverse resolution?**

Domain name reverse resolution is the mapping from the IP address to the domain name, because the forward resolution is the mapping from the domain name to the IP address. If you want to confirm whether an IP address corresponds to one or more domain names, you need to check the entire domain name system from IP, it is impossible. Therefore, RFC1035 defines PTR (Pointer Record), the pointer record is a data type in the email system and corresponds to A record, the PTR record points the IP address to the domain name.

**Application Scenarios of Reverse Resolution**

Reverse resolution should be mainly in the mail server. You can refuse to receive all the information without registering the domain name when enabling reverse resolution. Because most SPAMs are sent by dynamic allocation or IP without registering domain name to avoid tracking, so it can refuse to receive information from an IP address that cannot be reversed and resolved to a domain name in the mail server, which could serve as a means for rejecting SPAMs.

**How does JD Cloud Achieve Reverse Resolution?**

Adding reverse resolution needs to be applied from the operator (ISP), so JD Cloud only support the reverse resolution whose IP address belongs to JD Cloud resources. Reverse resolution needs to open ticket for review and approval before it can be used.

Note:

Application for reverse resolution of non-bgp IP will incur costs (it is recommended that you use bgp IP), please note that consult JD Cloud technical service consultants for the detailed costs.

When opening ticket, please explain to JD Cloud engineers: domain name, EIP (belonging to JD Cloud resources), application purposes.

 