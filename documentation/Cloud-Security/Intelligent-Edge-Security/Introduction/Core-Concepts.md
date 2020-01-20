# Core Concepts

See the following for the concepts and their interpretations used in the Intelligent Edge Security Help Documentation.

- **DoS (Denial of Service)**: namely denial of service attack. The attack takes advantage of the functional defects of the network service of the target system or directly consumes its system resources, with the aim to make the target customer's system unavailable and unable to provide normal service.
- **DDoS (Distributed Denial of Service attack)**: namely distributed denial of service attack. It refers to combine multiple computers to change into "zombie hosts" by the use of hacker technology, and jointly launch DDoS attacks on one or more targets to deny power of service attack in multiple times, making it impossible for the victims to provide network services.
- **CC: (ChallengeCoHapsar, challenge black hole): ** attack is one type of DDoS attacks, which means that based on the hacker technologies, attackers control some machines and send a greater number of data packages to the victim servers, resulting that the server resources are exhausted and the system breaks down.
- **CNAME record**: Alias record. It means implementing resolution from one domain to another. CNAME can make multiple machine names point to an alias so as to implement fast change of IP address.
- **Black hole**: Black hole means that JD Cloud Anti-DDoS Pro will shield Internet access to the server when the attack traffic suffered by the server exceeds the protection cap of the Anti-DDoS Pro package purchased by the user.
- **CNAME domain**: CDN domain acceleration needs to use the CNAME record. After CDN acceleration is configured on the JD Cloud Console, the user will get an accelerated CNAME domain (*.*.jcloud-cdn.com), and the user needs to configure a CNAME record at the domain service provider and point his/her domain to the domain of *.* .jcloud-cdn.com as CNAME, so that all requests of the domain will be redirected to the node of JD Cloud CDN.

- **Edge node*: Also known as CDN node, Cache node, etc., that is, a server cluster distributed in various regions and among various operators and used for caching the origin server contents. Because it is physically the closest to users, users can obtain content faster, thus realizing acceleration of website or application content.

