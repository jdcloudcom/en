# Core Concept

**CNAME Record**

It is a Canonical Name record; when DNS system is inquiring names on the left of CNAME,
it shall turn to names on the right of CNAME for inquiry again, until the final name of PTR or A is tracked;
it shall respond if the inquiry is successful or it is a failure.

**CNAME Domain Name**

To accelerate domain name, the CNAME record shall be used; after setting pushing and pulling streaming domain names in console of JD Cloud live broadcast, the user shall get an accelerated CNAME domain name and the user shall set a record according to the domain name service provider,
CNAME
taking his/her domain name as CNAME to point to the domain name and then all the requests of this domain name shall be redirected to nodes of JD Cloud CND.

