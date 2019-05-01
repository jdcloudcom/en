# FAQ
**What is the difference between Queue Service and Message Queue?**

- The message transmission model of Queue Service is a point-to-point queue model, which supports user's Pull consumption pattern and almost unlimited service expansion. For users who build new applications in the Cloud, using Queue Service is more convenient and quick, and it is easy to work with function service, object storage service and other services to build a new application of severless architecture.

- The message transmission model of Message Queue is a subject subscription model, which supports user's Push/Pull consumption pattern; supports richer consumption patterns, such as cluster consumption and broadcast consumption, and supports more message middleware operations such as message backtracking. For users who already have existing message middleware who want to migrate for JD Cloud Onboarding or have unique instance requirements for message queue, we recommend that such users use Message Queue.



**What are the limitations in the Queue Service?**

Users can create unlimited queues, where the standard queue has no TPS upper cap, the FIFO queue has a TPS cap of 300, and other restrictions can be viewed at [Restrictions](../Introduction/Restrictions.md).



**Does the Queue Service support public network/VPC service?**

The Queue Service supports users to access the service directly from the public network and will support uses to access the service directly in VPC.
