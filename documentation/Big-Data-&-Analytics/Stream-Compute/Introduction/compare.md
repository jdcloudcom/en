## Stream Compute and Batch Compute Comparison<br>
| Comparative indicators | Batch computing | Stream Compute |
|---|---|---|
Data integration method | Preloaded data | Real-time loading data and real-time computing
Usage mode | Business logic can be modified, data can be recalculated | Once the business logic is modified, the previous data cannot be recalculated (streaming data perish ability).
Data range | Querying or processing to all or most of the data in the data concentration. | Querying or processing data in the scroll time window or only data record recently.
Data size | Data on a large scale. | Single record or micro-batch data containing several records.
Performance | Delay of a few minutes to a few hours. | Only need a delay of a few seconds or a few milliseconds.
Analysis | Complicated analysis. | Simple response functions, aggregation and scrolling index