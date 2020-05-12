# PostgeSQL Plug-ins 
Because PostgreSQL provides rich Kernel program interfaces, developers are allowed to develop PostgreSQL extensions to implement dynamic loading by means of plug-in, leading to rich functions of PostgreSQL.

## How to use PostgreSQL plug-ins 
By default, the Cloud Database PostgreSQL is not installed with any plug-in. If you need to use a plug-in of PostgreSQL, please manually execute the `CREATE EXTENSION` command for installation operation.
If the added expansions are postgis, fuzzystrmatch, postgis_tiger_geocoder, postgis_topology, postgis_sfcgal and postgres_fdw, please directly execute the command `CREATE EXTENSION` in a manual way to carry out installation operation; if other extensions are added, white list permissions shall be created for installation. In such case, please open a ticket.

Plug-ins currently supported by Cloud Database PostgreSQL will be listed in the following and those not in the list are not supported at present. We will successively increase more plug-ins in future.

## Plug-in List
|Plug-in|10.6|11.2|12.2|Description|
|---|---|---|---|---|
|[PostGIS](http://www.postgis.net/)|√|√|√|PostGIS Spatial and Geological Information Related Extension|
|[postgres_fdw](https://www.postgresql.org/docs/9.6/static/postgres-fdw.html)|√|√|√|Search external data wrapper of remote database|
|postgis_topology|√|√|√|PostGIS Spatial and Geological Information Related Extension|
|postgis_tiger_geocoder|√|√|√|PostGIS Spatial and Geological Information Related Extension|
|postgis_sfcgal|√|√|√|PostGIS Spatial and Geological Information Related Extension|
|plpgsql|√|√|√|Support PL/pgSQL procedural language|
|pgstattuple|√|√|√|Provide various functions to get tuple-level statistic information|
|pgrowlocks|√|√|√|Provide the function of displaying line locking information of designated table|
|pgrouting|√|√|√|Provide path optimum planning|
|pgcrypto|√|√|√|Provide PostgreSQL with encryption function|
|pgaudit|√|√|√|Provide audit function|
|pg_visibility|√|√|√|Provide a method for checking visibility map (VM) of table and page-level visibility information|
|pg_trgm|√|√|√|Provide functions and operational character for determining similarity of letters, numbers and texts based on trigram match as well as supporting quick search for index operators of similar character strings|
|pg_stat_statements|√|√|√|Support track to sql execution information|
|pg_repack|√|√|√|Support processing to space expansion of table and index|
|pg_prewarm|√|√|√|Support data preheating and loading|
|pg_hint_plan|√|√|√|Support customized search schedule|
|pg_freespacemap|√|√|√|Check free space map (FSM)|
|pg_buffercache|√|√|√|Detect shared buffer in real time|
|pageinspect|√|√|√|The provided functions enable check of database page contents of a lower level|
|ogr_fdw|√|√|√| External data wrapper of GIS data format|
|moddatetime|√|√|√| Provide a method for tracking latest update time of lines in tables|
|ltree|√|√|√|Support tree structure data type|
|ltree_plpythonu|√|√|√| Used for conversion of ltree type for the language PL/Python|
|ltree_plpython2u|√|√|√|Used for conversion of ltree type for the language PL/Python|
|lo|√|√|√|Support PG Large Object maintenance|
|jsonb_plpythonu|√|√|√|Used for conversion of jsonb type for the language PL/Perl and PL/Python|
|jsonb_plpython2u|√|√|√|Used for conversion of jsonb type for the language PL/Perl and PL/Python|
|jsonb_plperlu|√|√|√|Used for conversion of jsonb type for the language PL/Perl and PL/Python|
|jsonb_plperl|√|√|√|Used for conversion of jsonb type for the language PL/Perl and PL/Python|
|isn|√|√|√|Provide isn data types and provide digital standards of EAN13, UPC, ISBN (books), ISMN (music), and ISSN (serials)|
|intarray|√|√|√|Provide multiple useful functions and operators for operation of integer arrays without null. Also support index search with some operational characters|
|intagg|√|√|√|Support integer aggregation function|
|insert_username|√|√|√|Method supporting track to modification of table operation|
|hstore|√|√|√|Support storage of key-value pair in a single value via the hstore data type|
|hstore_plpythonu|√|√|√|Used for conversion of hstore type for the language PL/Perl and PL/Python|
|hstore_plpython2u|√|√|√|Used for conversion of hstore type for the language PL/Perl and PL/Python|
|hstore_plperlu|√|√|√|Used for conversion of hstore type for the language PL/Perl and PL/Python|
|hstore_plperl|√|√|√|Used for conversion of hstore type for the language PL/Perl and PL/Python|
|fuzzystrmatch|√|√|√| Provide functions for determining similarity and distance between character strings|
|file_fdw|√|√|√|External data wrapper of file|
|earthdistance|√|√|√|Provide two methods for calculating great circle distance on earth surface|
|dict_xsyn|√|√|√|It is an example of additional dictionary template for full-text search. The dictionary type can replace words with their synonyms, therefore a word can be searched with its any synonym|
|dict_int|√|√|√|It is an example of additional dictionary template for full-text search. The example dictionary mainly controls the integer index|
|dblink|√|√|√|Support cross-library search|
|cube|√|√|√|Support multi-dimensional data type cube|
|citext|√|√|√|Support data type citext without distinguishing uppercase and lowercase character strings|
|btree_gist|√|√|√|Support gist index|
|btree_gin|√|√|√|Support gin index|
|bloom|√|√|√|Support bloom index|
|autoinc|√|√|√| functions for autoincrementing fields|
|amcheck|√|√|√|Provide functions used for verifying logic consistency of index structures|
|adminpack|√|√|√|Provides some support functions. pgAdmin and other management tools will provide additional functions with these functions, for example remote management on server log file|
|address_standardizer_data_us|√|√|√|Support address information|
|address_standardizer|√|√|√|Support address information|
|xml2|√|√|√|Provide XPath search and XSLT function|
|uuid-ossp|√|√|√|UUID Unique Mater Key|
|unaccent|√|√|√|It is a text-based search dictionary used for deleting accent mark (diacritics) from the view of morphology|
|tsm_system_time|√|√|√|Provide table sampling method SYSTEM_TIME|
|tsm_system_rows|√|√|√|Provide table sampling method SYSTEM_ROWS|
|timetravel|√|√|√|Provide tuple data of the specified function search period|
|tcn|√|√|√|Provide trigger function|
|tablefunc|√|√|√|Include various functions of return tables|
|sslinfo|√|√|√|Provide information of SSL certificate provided when the current client is connected to PostgreSQL|
|seg|√|√|√|Data type representing segment or floating-point interval|
|refint|√|√|√|Provide foreign key constraint management method|
|timescaleDB|√|√|√|Temporal database is supported|



