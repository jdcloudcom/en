## Release of WAF Back-to-Origin IP

  After your website has successfully accessed WAF protection, the traffic of all requests accessing your website will be transferred to WAF instance first and return to origin server after filtering by WAF instance. The operation that traffic returns to the origin server via WAF instance is called back-to-origin.
  As the number of WAF instance IP is limited, all requests received by the origin server are from such IP. However, such case is deemed as suspicious by the security software of the origin server (such as Safety Watch Dog and Jowto Lock) and the back-to-origin IP may be blocked. So, after accessing WAF protection, you need to set permitting through all WAF back-to-origin IPs in the security software on the origin servers.
  Please add the following IP segments to the white list of origin server:
  
101.124.31.248/30
101.124.23.116/30
