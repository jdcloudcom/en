# 将备份文件恢复到自建数据库 MariaDB 
您可以将云数据库 MariaDB 实例的备份数据恢复到自建数据库中。

## Precautions
* The self-built database version shall be consistent with the source database version of backup files.
* The backup unzipping software can only be used in Linux.
* System software of unzipping tools relies on openssl, gzip, tee and python, with version >= 2.7.
* The current system has already been installed with percona xtrabackup >= 2.4; If not, please refer to [Official Manual](https://www.percona.com/doc/percona-xtrabackup/2.4/index.html).

## Operation Instructions
1. See the requirements for installation environment in precautions.
2. 下载备份的解压工具，[点击下载](http://jddb-common-public.oss.cn-north-1.jcloudcs.com/mariadb_backup_extract_tool.tar.gz)，并解压，工具名 `mariadb_backup_exztract.py`，使用示例如下
    
    ```
    # View Help Manual
    ./mariadb_backup_extract.py -h
     
     # 解压云数据库 MariaDB 实例的备份数据
     ./mariadb_backup_extract.py  -v 5.7 -f ./backup.xbstream.gz.enc
    ```
3. Download backup files.

    ```
    wget -c ‘<Data backup download link>' -O <Customized backup file name>.xbstream.gz.enc

    -c: Start breakpoint upload
    -O: Save downloaded results as the assigned files and note that the suffix of files must be .xbstream.gz.enc
    ```

4. Unzip the backup data, and the unzipped files will be saved in tmp_snapshot, a sub-directory of the current directory, assuming that the current directory is $HOME.

    ```
    ./mariadb_backup_extract.py -v 10.2 -f <自定义备份文件名>.xbstream.gz.enc
    
    -v 参数可以不指定，默认：10.2，具体 -v 后面可以跟什么变量可以通过 -h 查看帮助手册得知。
    ```

5. Restore the unzipped backup files.

    ```
    innobackupex --defaults-file=$HOME/tmp_snapshot/backup-my.cnf --apply-log $HOME/tmp_snapshot
    ``` 
    ***innobackupex completed OK!*** indicates successful execution, and you can continue to the next step.

6. Modify the configuration file, backup-my.cnf.

    ```
    # The MySQL server
    [mysqld]
    innodb_checksum_algorithm=innodb
    #innodb_log_checksum_algorithm=strict_crc32
    innodb_data_file_path=ibdata1:512M;ibdata2:512M:autoextend
    innodb_log_files_in_group=3
    innodb_log_file_size=536870912
    #innodb_fast_checksum=false
    #innodb_page_size=16384
    #innodb_log_block_size=512
    innodb_undo_directory=.
    innodb_undo_tablespaces=0
    #redo_log_version=1
    ```

7. Modify the file owner and confirm that files are owned by the JCS for MySQL user.

    ```
    chown -R mysql:mysql $HOME/tmp_snapshot
    ```

8. 启动 MariaDB 进程

    ```
    mysqld --defaults-file=/export/tmp_snapshot/backup-my.cnf --user=mysql --datadir=/export/tmp_snapshot
    ```

9. 登录 MariaDB 数据库

    ```
    mysql -uroot -p
    ```

* Click ***Enter*** directly due to the default blank password.
