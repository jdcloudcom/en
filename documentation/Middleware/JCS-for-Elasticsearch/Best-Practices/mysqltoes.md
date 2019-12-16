## MySQL Data Synchronization

### Preconditions

- Virtual Machines in the same region, availability zone, VPC, and subnet with MySQL and ES have been created.
- MySq, JDK, Canal-server and Canal-adapter have been installed and.
- The indexes and mapping created in ES shall be consistent with the table names and fields created in MySQL.

### Operation Steps
1. Connect MySQL database test, and the command format is as follows:

```
mysql -h<The Intranet Address of MySQL Instance> -P<MySQL Instance Port, Normally is 3306> -u<MySQL Database Account> -p<Password to Log in the Database> -D< MySQL database name>
```

Command example is as follows:

```
mysql -hmysql-cn-north-1-9dae15cd77e84bb8.rds.jdcloud.com -P3306 -utestml -pmima -Dtestml
```

The following responses mean successful access:

```
mysql: [Warning] Using a password on the command line interface can be insecure.
Welcome to the MySQL monitor. Commands end with ; or \g.
Your MySQL connection id is 1489
Server version: 8.0.13 Source distribution



Copyright (c) 2000, 2019, Oracle and/or its affiliates. All rights reserved.



Oracle is a registered trademark of Oracle Corporation and/or its
affiliates. Other names may be trademarks of their respective
owners.



Type 'help;' or '\h' for help. Type '\c' to clear the current input statement.

```
2. Start Canal-server.</br>

1) Modify conf/example/instance.properties file.

```
vi conf/example/instance.properties
```

Parameter | Parameter Description
-- | --
canal.instance.master.address	| <The Intranet Address of MySQL Database>:<Intranet Port >, the relevant information is available on the basic information page of RDS for MySQL instance. For instance, mysql-cn-north-1-9dae15cd77e84bb8.rds.jdcloud.com:3306.
canal.instance.dbUsername	| The account name of MySQL Database is available on the account management page of the instance.
canal.instance.dbPassword	| Password of MySQL Database.

2) Start Canal-server.

```
./bin/startup.sh
```

3. Start Canal-adapter.</br>

1) Modify conf/application.yml file:
```
vi conf/application.yml
```

Parameter | Parameter Description
-- | --
canal.conf.canalServerHost	| canalDeployer Access Address. Keep the default option (127.0.0.1:11111).
canal.conf.srcDataSources.defaultDS.url	| jdbc:mysql://<MySQL Intranet Address>:<Intranet Port>/<Database Name>?useUnicode=true, the relevant information is available on the basic information page of MySQL instance. For instance, jdbc:mysql-cn-north-1-9dae15cd77e84bb8.rds.jdcloud.com:3306/testml?useUnicode=true.
canal.conf.srcDataSources.defaultDS.username	| The account name of MySQL Database is available on the account management page of the MySQL instance.
canal.conf.srcDataSources.defaultDS.password	| Password of MySQL Database.
canal.conf.canalAdapters.groups.outerAdapters.hosts	| Locate to the location of name:es and replace hosts with <The Intranet Address of JD Cloud ES Instance>:<Intranet Port>, the relevant information is available on the basic information overview page of ES instance. For instance, es-nlb-es-5gi2ck2s6w.jvessel-open-hb.jdcloud.com:9200:.
canal.conf.canalAdapters.groups.outerAdapters.mode	| Must be set as rest.
canal.conf.canalAdapters.groups.outerAdapters.properties.security.auth	| <The Account of JD Cloud ES Instance>:<Password>. For instance, elastic:es_password.
canal.conf.canalAdapters.groups.outerAdapters.properties.cluster.name	| The ID of JD Cloud ES instance is available on the basic information overview page of the instance.

2) Modify conf/es/*.yml file, and define the mapping fields from MySQL bata to ES data

```
vi conf/es/*.yml
```

Parameter | Parameter Description
-- | --
esMapping._index | The index name created in ES instance in creating table and field section. This document uses es_test.
esMapping._type	| The index type created in ES instance in creating table and field section. This document uses _doc.
esMapping._id	| The id of documents that need to be synchronized to ES instance can be customized. This document uses _id.
esMapping.sql	| Sql statement is used to search the fields the need to be synchronized to ES.

3) Start Canal-adapter service.

```
./bin/startup.sh
```

4. Export the incremental data.</br>

1) The data in testml table of the management database testml in MySQL Database. The newly added data as an example is shown below:

```
insert `testml`.`testml`(`count`,`id`,`name`,`operation`) values('5',8,'tom','delete');
```

2) Search the synchronized data on the DevTools page of Kibana.

```
GET /testml/_search
```

