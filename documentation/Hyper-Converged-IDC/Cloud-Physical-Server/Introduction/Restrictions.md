# Limitation description
## Instance Purchase and Use Limit:
- User needs to complete real-name verification before purchase instances. Support the real-name verification of the individual user and the enterprise user.
- Only users passing the real-name verification can create and operate the Cloud Physical Server at console.
-	Each user can create at most 5 Cloud Physical Server instances per single order and the user can purchase at most 20 sets in a single region by default. If you need to enable more instances, you may apply for expansion by open ticket, JD Cloud will improve configuration upgrade quota after evaluation based on your actual demands. The actual situation is adjusted based on operation activities and subject to the activity descriptions.
-	Users can only create one Intranet CIDR address segment under the same availability zone, and each instance can be associated and only be associated with one purchased Public IP or not associated with any Public IP. If the user decides to associate no Public IP in the basic network mode, then Public IP cannot be added subsequently. If the user decides to associate no Public IP in the VPC mode, then Elastic IP can still be associated subsequently.
-	If the user intends to purchase the EIP at the time of purchasing instances, the system will allocate one EIP when creating the Cloud Physical Server, and associate such EIP with the Cloud Physical Server.
-	Hard disk, as an integral part of the cloud physical machine, does not support separate purchase.
