# Restrictions

When you use Message Queue, there are some restrictions to pay attention.

| Restriction Items	| Adjust or Not	| Adjust Method |
| :- | :- | :- |
|TPS of each Topic is 5000 (Public Network Area is 500)|Yes|Ticket|
| The life cycle ( persistent storage time ) of the message is 3 days|No|-|
| The maximum size of the message is 256KB|No|-|
| After the failure of message consumption, the maximum number of attempts to retry is 16 times|No|-|


