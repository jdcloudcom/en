## **Extensive Resolution**

Example Description:

Aaa.com sets up extensive resolution records on China Unicom, Telecom and Mobile respectively

1.* Unicom A 1.1.1.1

2.* Telecom A 1.1.1.1

3.* Mobile A 1.1.1.1

Then add a www record for aaa.com under the default line.

1.* Unicom A 1.1.1.1

2.* Telecom A 1.1.1.1

3.* Mobile A 1.1.1.1

4.www is A 4.4.4.4 by default

At this time, China Unicom, Telecom, Mobile users will not resolve the 4.4.4.4 when visiting www.aaaa.com. According to the rules of line prioritized matching, it will first match the extensive domain name under the subdivision of the line, then resolves the corresponding extensive domain name.

If you want to make the Unicom, Telecom, Mobile users access to www.aaa.com, and resolve 4.4.4.4, you should add a www fixed domain name record for aaa.com under three lines with an extensive domain name, as shown below.

1.* Unicom A 1.1.1.1

2.www Unicom A 4.4.4.4

3.* Telecom A 1.1.1.1

4.www Telecom A 4.4.4.4

5.* Mobile A 1.1.1.1

6.www Mobile A 4.4.4.4

7.www Default A 4.4.4.4

At this time, the Unicom, Telecom, and Mobile users can resolve 4.4.4.4 when they access www.aaa.com.

 
