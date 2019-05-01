# Application Scenarios

## Asynchronous decoupling, peak clipping and valley filling

When there is a gap between the processing power of the upstream and downstream systems, the queue is used as a data buffer to increase the availability and reliability of the system architecture, smooth the peak traffic, and decouple the system architecture to avoid the impact on the main business process.

![异步解耦削峰填谷](../../../../image/Internet-Middleware/Queue-Service/队列服务-02.png)



## Performance extension, fault tolerance processing

The queue service can decouple the processing process of the user application, for applications with extended requirements, the processing capability of the user application can be improved by increasing the sending and receiving rate of Queue Service. Some faulty modules can be removed from the entire system.

![性能扩展容错处理](../../../../image/Internet-Middleware/Queue-Service/队列服务-01.png)

