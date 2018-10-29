## Site Monitoring Restrictions and Quotas
This chapter mainly describes the management of site monitoring tasks, including the restrictions on creation, modification and others as well as the restrictions on quotas related to site monitoring.
### Site Monitoring Restrictions
 Limit Item | Restrictions 
 -- | --
 Name of Site Monitoring Tasks | It shall not be null, and only Chinese, digits, capital and lowercase letters, English underline “_” and line-through “-”, with at most 32 characters.
 Site Address | When the monitoring type is HTTP(S), you need to full fill the site address to indicate that whether it is http or https, for example, https://www.xx.com.
 HTTP Request Header | Up to 20 pairs of keys and values can be supported, no more than 1KB in total length.
 Cookie | Up to 20 pairs of keys and values can be supported, no more than 1KB in total length.
 Detection Frequency | The detection frequency shall not be greater than the statistical period in the alarm rules.
 POST Submitted Content | When detecting the site, the system will POST the filled-in and submitted content. It is recommended to enter the submitted content in English with the size not exceeding 1KB.
 TCP Request Content | Request content is recommended to use English, with the length of no more than 1KB.
 Match Response Content | Response content is recommended to use English, with the length of no more than 1KB.
 Alarm Rules | The statistical period in the alarm rules cannot be less than the detection frequency in the monitoring tasks.
 
 ### Site Monitoring Quotas
  Quota Items | Number of Quotas 
 -- | --
 Number of Site Monitoring Tasks | 20 site monitoring tasks
 Number of Site Addresses in One Detection | 1 site address
 Number of Custom Detection Points | 5 custom detection points
