# PostgeSQL Plug-ins 
Because PostgreSQL provides rich Kernel program interfaces, developers are allowed to develop PostgreSQL extensions to implement dynamic loading by means of plug-in, leading to rich functions of PostgreSQL.

## How to use PostgreSQL plug-ins 
By default, the Cloud Database PostgreSQL is not installed with any plug-in. If you need to use a plug-in of PostgreSQL, please manually execute the `CREATE EXTENSION` command for installation operation.

Plug-ins currently supported by Cloud Database PostgreSQL will be listed in the following and those not in the list are not supported at present. We will successively increase more plug-ins in future.

## Plug-in List
|Plug-in|Description|
|---|---|
|[PostGIS](http://www.postgis.net/), postgis_topology, postgis_tiger_geocoder, postgis_sfcgal|PostgreSQL Space and Geographic Object|
|[postgres_fdw](https://www.postgresql.org/docs/9.6/static/postgres-fdw.html)|Foreign data wrapper, which is used to access data stored in the external PostgreSQL server|
