## **Resolution Record Type Details**

| Type    | Description                                          | Record Value Format     |
| ------- | --------------------------------------------- | -------------- |
| A record | Point the domain name to an IPv4 address | IPv4 address |
| CNAME | Point the domain name to another domain | Domain |
| MX | Point domain name to mail server address | Domain name or IPV4 address|
TXT | can be filled in at any time, length limit 255, usually do SPF record | string |
| NS      | Domain Name Server Record, Specify Subdomain Name to Other DNS Server to Resolve | Domain Name | Domain Name           |
| AAAA    | Point the Domain Name to an IPV6 Address | IPv6 Address       |
| SRV     | Record Servers that Provide Specific Services                      | Domain Name           |
| CAA     | Certification Authority Authorization                              | Domain Name           |
| Explicit URL | Redirect Domain Name 301 to Another Address                   | Domain Name or URL Address  |
| Implicit URL | Similar to to Explicit URL But Hide the Real Destination Address           | Domain Name or URL Address  |

Domain Name Format:

1. Legal characters: az, AZ, 0-9, '-', '.', where '-' (connector) cannot be at the beginning, and cannot be adjacent to '.'. The domain name can contain Chinese characters. The Chinese domain name must contain at least one Chinese character (Simplified or Traditional) in addition to the legal character of the English domain name. The character length of Chinese domain name is based on the converted Punycode code.

2. Length limit: The '.' interval is up to 63 bytes, and the overall length of domain name is up to 253 bytes (with no '.' at the end). Chinese domain names will be limited in length after Punycode transcoding.

Host Record Format:

1. Legal characters: az, AZ, 0-9, '-', '_', '.', '*', '@', 'Chinese characters'. Among them, * is used for extensive resolution and can only be used as the first character, and can only be adjacent to '.' rather than other characters, if not configurable: *a.mydnstest01.top;@, indicating the main domain name; '-' (connector) , cannot be used at the beginning, and cannot be adjacent to '.', if not configurable: -a.mydnstest01.top.

2. Length limit: the host record length limit depends on the length of the main domain name, and the full-qualified domain name is up to 253 bytes (with no '.' at the end), specifically, "host record length + domain name main length" does not exceed 253 bytes.