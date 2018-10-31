# Customize Domain Names

API gateway offers the domain name association based on API group. The API gateway locates to an unique API group through the domain name, and then determines the unique API through the Path+HTTPMethod. The independent domain name requires to satisfy with following points:
- The independent domain name is analyzed to secondary domain name of this group by CNAME and then associate. Analyze and then associate, otherwise impossible to be associated.
- One domain name can only be associated to one group.
- Each group supports to associate up to 5 customized domain names.
- The domain name can be associated successfully only after putting on record;



## Relevant References:

- [Description of steps for customized domain configuration](../Operation-Guide/Create-Domain/Create-Domain.md)
