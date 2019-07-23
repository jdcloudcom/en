# Threat Overview

### Interface

  ![](../../../../image/Website-Threat-Inspector/webscan-gl.png)

### Risk Level

Risk level: Risk values of all assets under PIN, scope of risk level: High, moderate, low

Definition of PIN risk value

|Criticality |	 Hazard Value Region |
| ------ | ------ |
|High |	5<= Vulnerability Risk Value<= 10
|Moderate |   3 <= Vulnerability Risk Value <= 4
|Low |	 1 <= Vulnerability Risk Value < 3

Definition of a single asset risk value:

Definition of high risk asset: With 1 high risk vulnerability or 5 moderate risk vulnerabilities or 10 low risk vulnerabilities  
Definition of moderate risk asset: With 0 high risk vulnerabilities or 3 moderate risk vulnerabilities or 5 low risk vulnerabilities  
Definition of low risk asset: With 0 high risk vulnerabilities or 0 moderate risk vulnerabilities or 1 low risk vulnerabilities  

Definition of a vulnerability risk value:

| Criticality | Hazard Value Region | Criticality Description |
| ------ | ------ | ------ |
| High | 8<= Vulnerability Risk Value <= 10 | The attacker can execute any commands or codes remotely, or carry out a remote service denying attack against the system |
| Moderate | 5 <= Vulnerability Risk Value <= 7 | The attacker can remotely create, modify and delete files or data, or carry out a service denying attack against common service |
| High | 1 <= Vulnerability Risk Value <= 4 | The attacker can obtain the information of some systems and service, or read system files and data |


### Vulnerability Development Trend

The statistical data about the count of vulnerabilities found every day, count of vulnerability treated, vulnerability IPs, vulnerability domains are displayed, within a scope of 7 days/30 days.


### Top10 Risk Assets

The Top10 risk assets are displayed respectively from the dimensions of IP and domain, with an abscissa of vulnerability count. Meanwhile, the high, moderate and low risk levels are supported.  


#### Categories of Top10 Vulnerabilities

The names of Top 10 vulnerabilities are displayed from the perspective of vulnerability categories, with an abscissa of vulnerability count.


#### Threat Count & Threat Object

Click **Threat Count**->**Count of Vulnerabilities Found**, to redirect to **Risk Management**-> **Vulnerability Dimension

  ![](../../../../image/Website-Threat-Inspector/webscan-risk1.png)
  
Click **Threat Object**->**Vulnerability IP** to redirect to **Risk Management**-> **IP Dimension

  ![](../../../../image/Website-Threat-Inspector/webscan-risk3.png)

Click **Threat Object**->**Vulnerability Domain** to redirect to **Risk Management**-> **IP Dimension

  ![](../../../../image/Website-Threat-Inspector/webscan-risk4.png)
