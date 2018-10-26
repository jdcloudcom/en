# Traffic Control Policy

API gateway offers the traffic control policy to govern the API calling. The traffic control policy can affect the API under group only when the traffic control policy for API gateway of JD Cloud shall be associated to the API group.

* The traffic control policy can limit for API group and the single access key limit.

* Mind that the single access key limit shall not be more than the API group traffic limit. That is, single access key limit <= API group traffic limit.

* The default traffic upper limit of each API group is 500QPS (this value can be increased by Open Ticket).

* The traffic control policy takes effect through associating the API group. One policy can associate several API groups and each API group takes effect separately.

* You can perform some basic operations of traffic control policy at API gateway control panel, such as creation, modification, deletion, check, associating and disassociating.

* Unit of traffic control: Minute, day.


## Relevant References

* [Description of steps for traffic control policy associating](../Operation-Guide/Create-Stream/Create-Stream.md)
