## What is HTTP DNS?

  HTTP DNS applies HTTP protocol, substituting the domain resolution based on UDP DNS protocol, and obtains resolution data directly from authoritative DNS/reliable Local DNS, so as to bypass the traditional Local DNS, and effectively avoid domain hijacking, slow validation, inaccurate source IP and other problems caused by the unreliability of Local DNS.

## Role of HTTP DNS?

  HTTP DNS aims at solving the DNS resolution exception and domain hijacking problems in the mobile Internet: NAT is done for Operator LocalDNS Exit based on the authoritative DNS target IP address, or the resolution request is forwarded to another DNS server, resulting that the authoritative DNS cannot correctively identify the Operator’s LocalDNS IP, leading to domain resolution error and cross-network traffic.
  After the domain is hijacked, the website will become inaccessible (you cannot connect to the server) or you may access to a phishing site, etc.
  Consequences of Cross-origin, Cross-province, Cross-operator, and Cross-nation Resolution Results: You may access to a website very slowly or even cannot access to it.
