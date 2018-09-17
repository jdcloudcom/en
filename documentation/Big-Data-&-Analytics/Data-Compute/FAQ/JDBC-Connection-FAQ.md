# JDBC Connection FAQ

**Q: How to connect data computing service through JDBC?**

A: The data computing service JDBC drive is based on presto-jdbc development.
JDBC connection information configuration, for example:</br>
String url = "jdbc:xdata://gateway.jcloud.com/instance_name"；</br>
String accessId = "xxxxxx"；</br>
String accessKey = "xxxxxxx"；</br>

In which, instance_name in url is name of instance and instance can also be set by property, e.g.</br>
properties.setProperty("instance", "instance_name")；</br>

Currently we only support South China and North China. You need to add setting of region in properties, that is, South China is HN_GZ, North China is HB_BJ</br>
properties.setProperty("region", "HB_BJ")；。</br>

Click here to download new JDBC client</br>
