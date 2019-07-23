## Billing Case

This paper introduces the calculation method of OSS cost in the form of a case. The unit price in the case is from the price information published on the official website of JD Cloud. See [Pricing Description](./Price-Overview.md) for the price details. For free tier change used in the case,
[Free-Tier](./Free-Tier-For-Oss.md) shall prevail.

**Case background : Use standard storage + data access**

Company A is a media enterprise which stores a huge number of picture material files on the Object Storage Service cn-north-1 Region. The file type is standard storage. There are about 110GB picture files. The monthly Internet downlink traffic of picture files is about 500GB. It does not use CDN acceleration and the times of read or write requests are about 2 million per month.

#### Cost Composition

* Storage capacity cost: (Actual storage capacity-free tier)\* daily unit price (RMB/GB)\* 30, namely (110-10)\* RMB 0.00427/GB/day \*30(day) = RMB 12.81

*  Internet downlink traffic cost: 500 (GB) \* RMB 0.50/GB = RMB 250.00

*  Cost of times of request: It is free temporarily, if it is charged, then the cost of this part is 200 (million times)\* Unit price/10,000 times

*  Monthly consumption = Storage capacity cost + Internet downlink traffic cost = 12.81 + 250.00 = RMB 262.81

**Case background: Use standard storage + CDN**

Company B is a video website enterprise which stores a huge number of video files on the Object Storage Service cn-south-1 Region. The file type is standard storage. There are about 210GB video files. In each month, the video files use CDN acceleration, with the CDN back-to-origin traffic being about 800GB (if the files to be accessed are not hit in the CDN nodes, then the files will be fetched from the Object Storage Service by back-to-origin) and the times of read or write requests are 5 million.

#### Cost Composition

* Storage capacity cost: (Actual storage capacity-free tier)\* daily unit price (RMB/GB)\* 30, storage capacity cost: (210-10)(GB) \* RMB 0.00427/GB/day\* 30(day) = RMB 25.62

* CDN back-to-origin traffic cost: 800(GB) \*RMB 0.14/GB = RMB 112.00

* Cost of times of request: It is free temporarily, if it is charged, then the cost of this part is 500 (million times)\* Unit price/10,000 times

* Monthly consumption = Storage capacity cost + CDN back-to-origin traffic cost = 25.62 + 112.00 = RMB 137.62

**Case Background: Use standard archival type storage**

Company C is an E-commerce enterprise which stores a huge number of electronic invoice files on the Object Storage Service as cold standby of data. The file type is archival storage. There are about 500TB electronic invoice files, with access volume being little. In the month, there were only 2 times to retrieve the file in the fast mode, the two files were 2GB in total, the access to the file generated a total of 10GB of Internet downlink traffic, and the times of requests could be ignored.


#### Cost Composition

* Storage capacity cost: 500(TB) \* 1024 \*  ¥0.001/GB/day \* 30(days) = RMB 15,360

* Internet downlink traffic cost: 10GB \*  RMB 0.5/GB =RMB 5

*  Data retrieval cost: 2GB \* RMB 0.2/GB (quick retrieval mode) = RMB 0.4

*  Number of request cost: temporarily free

*  Monthly consumption = Storage capacity cost + Internet downlink traffic cost + data retrieval cost = 15360 + 5 + 0.4 = RMB 15365.4
