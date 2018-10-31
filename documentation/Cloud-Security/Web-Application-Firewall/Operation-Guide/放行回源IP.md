## **Release Back-to-origin IP**

  After your website has successfully accessed WAF protection, the traffic of all requests accessing your website will be transferred to WAF instance first and return to origin server after filtering by WAF instance. The operation that traffic returns to the origin server via WAF instance is called as back-to-origin.

  The back-to-origin IP may be blocked due to the existence of security rules of origin server (such as watch dog, cloud lock, Nsfocus products, etc.) So, after accessing WAF protection, you need to set permitting through all WAF back-to-origin IPs in the security software on the origin servers.

  Please add the following IP segments to the white list:

103.235.240.9/32   

103.235.240.10/32 

103.235.240.56/30  

103.235.240.60/30  

36.110.140.80/30  

36.110.140.84/30  

111.202.123.40/30  

111.202.123.44/30

116.196.126.9/32 

116.196.126.10/32  

101.124.16.145/32  

101.124.16.144/32

101.124.16.152/30 

101.124.16.156/30 