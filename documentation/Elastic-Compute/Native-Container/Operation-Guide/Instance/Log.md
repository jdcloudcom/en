
# Log

Operation Instructions

The containers in intermediate status shall not execute Check log operation

Print standard output of stdout,stderr of Docker container and save part of the history logs dating from current time and the log has a maximum capacity of 10M

Single log has a maximum number of bytes of 4K

Operation Guide

1. Open JD Cloud Console and select **Elastic Compute**-**Container Service**-**Container Instance** to enter into the Containers List page;

2.Select container of which you want to check the log and click **Check log** button in the operation column, then the page will skip to **Check log** of the details page; you can also select **Check log** Tab in the details page of the container directly to check the container log;

3. You may also enter query conditions in **Check log**, and it currently support selecting container log according to number of output rows of log, output time of log and maximum bytes of log.