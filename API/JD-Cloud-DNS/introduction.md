Welcome to use JD Cloud DNS.
JD Cloud DNS provides free intelligent resolution services to domains throughout the network, with massive processing capacity, flexible expansibility and security capabilities, so as to provide stable, secure and fast resolution experience for your site. The API provided in this document allows you to operate domain resolution in the manner of a request calling. Make sure you have a good understanding of the domain resolution products and their use methods before using these interfaces.

In the interface description part of this document, in case of any conflict between the optional range of any parameter and the value given on the official website of JD Cloud, **it shall be subject to the value given on the official website**.

## 1. Glossary

| Terminology      | Full Designation            | Chinese     | Description                                                         |
| --------- | --------------- | -------- | ------------------------------------------------------------ |
| domain    | Domain          | Primary Domain   | Corresponds to zone in dns rfc. For example, .com is a domain, while jdcloud.com is a primary domain, we can create a domain record under a primary domain, such as www.jdcloud.com. <br>After the primary domain is created in JD Cloud, JD Cloud will automatically assign a DNS nameserver address to you. If the primary domain is registered elsewhere, just modify the NS record of DNS at the domain registrar. When creating a primary domain in JD Cloud, you need to select a package type, and the nameserver will not be available until the order payment is completed. |
| subDomain | Sub Domain      | Subdomain   | The part of a domain that does not include a primary domain, such as www                            |
| RR        | Resource Record | Resolution Record | Host Record (A Record), alias Record (CName Record) etc. are common to see. <br> Under a subdomain, we can create many records according to the needs, and each record has a record type, such as A, AAAA, TXT, and CNAME, for A, AAAA, CNAME records, JD Cloud DNS supports setting the weight, to achieve the effect of weighted round robin. <br>In creating a domain record, if you want to implement setting intelligent resolution based on the user's location, you also need to pass in the view information and only create the domain record under the view. |
| view      | View            | View     | In the process of domain resolution, the view is used to distinguish clients of different geographical positions. The view relies on IP library to realize the location of the user's geographic position and even the location of the Operator. <br>At present, the domestic basic views of JD Cloud are subdivided into (province, Operator) categories, and the overseas basic views are subdivided into countries. Users can customize their own views according to their own needs. The conflict between the customized view IP and the basic view IP will replace the IP information of the basic view. <br>Getting all the base views can be done through the getViewTree interface, and there can be an inclusion relationship among the views. For example, China Mobile, will contain views of all provinces + Mobile. If you do not need to set a different resolution record for a sub-view under a parent view, you can use its parent view directly to set the domain record. |

## 2. API Quick Start

In order to use JD Cloud DNS, you need to do two basic operations:

1. Add domain resolution
   You can use the [Add Domain](./Domain-Name-v2/createDomain.md) API to add your domain in the JD Cloud DNS Platform.

2. Add resolution record
   After adding the domain, you need to use [Add Resolution Record](./Resolution-Record-v2/createResourceRecord.md) API to add a resolution record to your domain and specify the host record, record type, TTL, ISP Line type and the record value.

JD Cloud DNS also provides more APIs to facilitate your use. Please view [API Overview](./overview.md).