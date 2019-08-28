# Restrictions
## Maximum Connection Limit
### PostgreSQL 
|Instance Type|Maximum Connections|
|---|---|
|1-core 1GB|100|
|1-core 2GB|200|
|1-core 4GB|400|
|2-core 8GB|800|
|4-core 16GB|1500|
|8-core 32GB|2000|
|16-core 64GB|2000|

## Function Limit
### Contraction Operations
* It does not support expansion and shrinkage of instance.

### Create Instance
* The number of instance for a single region is limited. A region supports a maximum of 5 instances be default. If you need more instance, please open ticket.

### Reserved Keywords for Database Account
```
pg_signal_backend,rds_superuser,postgres,pg_read_all_stats,pg_monitor,rdsreplication,pg_read_all_settings,pg_stat_scan_tables,rds_replication,root,admin,eagleye,master,aurora,sa,sysadmin,administrator,mssqld,public,securityadmin,serveradmin,setupadmin,processadmin,diskadmin,dbcreator,bulkadmin,tempdb,msdb,model,distribution,mssqlsystemresource,guest,add,except,percent,all,exec,plan,alter,execute,precision,and,exists,primary,any,exit,print,as,fetch,proc,asc,file,procedure,authorization,fillfactor,public,backup,for,raiserror,begin,foreign,read,between,freetext,readtext,break,freetexttable,reconfigure,browse,from,references,bulk,full,replication,by,function,restore,cascade,goto,restrict,case,grant,return,check,group,revoke,checkpoint,having,right,close,holdlock,rollback,clustered,identity,rowcount,coalesce,identity_insert,rowguidcol,collate,identitycol,rule,column,if,save,commit,in,schema,compute,index,select,constraint,inner,session_user,contains,insert,set,containstable,intersect,setuser,continue,into,shutdown,convert,is,some,create,join,statistics,cross,key,system_user,current,kill,table,current_date,left,textsize,current_time,like,then,current_timestamp,lineno,to,current_user,load,top,cursor,national,tran,database,nocheck,transaction,dbcc,nonclustered,trigger,deallocate,not,truncate,declare,null,tsequal,default,nullif,union,delete,of,unique,deny,off,update,desc,offsets,updatetext,disk,on,use,distinct,open,user,distributed,opendatasource,values,double,openquery,varying,drop,openrowset,view,dummy,openxml,waitfor,dump,option,when,else,or,where,end,order,while,errlvl,outer,with,escape,over,writetext
```
