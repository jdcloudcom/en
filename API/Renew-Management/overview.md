# Renew Management


## Introduction
Renew Management APIs


### Version
v2


## API
|Interface Name|Request Method|Function Description|
|---|---|---|
|**queryInstance**|POST|Provide renewable instance information query.|
|**renewInstance**|POST|Renew related instances. Calling API creates a renewal order and automatically deducts the available coupons and balances from your account to complete the payment. If the payment fails for some reason, the order is automatically canceled.|
|**setRenewal**|PUT|Set automatic renewal services for one or more instances.|

## Common Parameter Description
<table>
    <tr>
        <th>Business Line</th>
        <th>Product Line</th>
        <th>Product Line Name</th>
    </tr>
    <tr>
        <td rowspan="20">jcloud</td>
        <td>vm</td>
        <td>Virtual Machines</td>
    </tr>
    <tr>
        <td>rds</td>
        <td>RDS</td>
    </tr>
    <tr>
        <td><span>mongodb</span></td>
        <td>JCS for MongoDB</td>
    </tr>
    <tr>
        <td>ip</td>
        <td>Public IP</td>
    </tr>
    <tr>
        <td>disk</td>
        <td>Cloud Disk Service</td>
    </tr>
    <tr>
        <td>redis</td>
        <td>Redis</td>
    </tr>
    <tr>
        <td>ipanti</td>
        <td>Anti-DDoS Pro</td>
    </tr>
    <tr>
        <td>sgw</td>
        <td>Application Security Gateway</td>
    </tr>
    <tr>
        <td>waf</td>
        <td>Web Application Firewall</td>
    </tr>
    <tr>
        <td>antipro</td>
        <td>Anti-DDoS Protection Package</td>
    </tr>
    <tr>
        <td>jdworkspace</td>
        <td>JD WorkSpaces</td>
    </tr>
    <tr>
        <td>memcached</td>
        <td>JCS for Memcached</td>
    </tr>
    <tr>
        <td>jdworkspacebw</td>
        <td>JD WorkSpaces Public Network Bandwidth</td>
    </tr>
    <tr>
        <td>csa</td>
        <td>Situation Awareness</td>
    </tr>
    <tr>
        <td>domainservice</td>
        <td>JD Cloud Resolution</td>
    </tr>
    <tr>
        <td>pod</td>
        <td>Native Container Pod</td>
    </tr>
    <tr>
        <td>nativecontainer</td>
        <td>Native Container Instance</td>
    </tr>
    <tr>
        <td>jdw</td>
        <td>Data Warehouse</td>
    </tr>
    <tr>
        <td>es</td>
        <td>JCS for Elasticsearch</td>
    </tr>
    <tr>
        <td>drds</td>
        <td>Distributed Relational Database DRDS</td>
    </tr>
    <tr>
        <td rowspan="4">aidc</td>
        <td>edcpseip</td>
        <td>Edge Cloud Public IP</td>
    </tr>
    <tr>
        <td>edcps</td>
        <td>Distributed Cloud Physical Server</td>
    </tr>
    <tr>
        <td>cpseip</td>
        <td>Physical Cloud Public IP</td>
    </tr>
    <tr>
        <td>cps</td>
        <td>Cloud Physical Server</td>
    </tr>
    <tr>
        <td rowspan="9">yunding</td>
        <td>yd-vm</td>
        <td>JD YunDing Virtual Machines</td>
    </tr>
    <tr>
        <td>yd-disk</td>
        <td>JD YunDing Cloud Disk Service</td>
    </tr>
    <tr>
        <td>yd-ip</td>
        <td>JD YunDing Public IP</td>
    </tr>
    <tr>
        <td>yd-sqlserver</td>
        <td>JD YunDing JCS for SQL Server</td>
    </tr>
    <tr>
        <td>yd-antipro</td>
        <td>JD YunDing Anti-DDoS Protection Package</td>
    </tr>
    <tr>
        <td>yd-csa</td>
        <td>JD YunDing Situation Awareness</td>
    </tr>
    <tr>
        <td>yd-redis</td>
        <td>JD YunDing JCS for Redis</td>
    </tr>
    <tr>
        <td>yd-sgw</td>
        <td>JD YunDing Application Security Gateway</td>
    </tr>
    <tr>
        <td>yd-database</td>
        <td>JD YunDing JCS for MySQL</td>
    </tr>
    <tr>
        <td rowspan="5">ccy</td>
        <td>ccyredis</td>
        <td>Industry Innovation Cloud JCS for Redis</td>
    </tr>
    <tr>
        <td>ccydatabase</td>
        <td>Industry Innovation Cloud JCS for MySQL</td>
    </tr>
    <tr>
        <td>ccydisk</td>
        <td>Industry Innovation Cloud Disk Service</td>
    </tr>
    <tr>
        <td>ccyip</td>
        <td>Industry Innovation Cloud Public IP</td>
    </tr>
    <tr>
        <td>ccyvm</td>
        <td>Industry Innovation Cloud Virtual Machines</td>
    </tr>
</table>