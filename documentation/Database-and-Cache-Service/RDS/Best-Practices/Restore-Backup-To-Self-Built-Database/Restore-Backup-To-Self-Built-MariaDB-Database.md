# Recover backup file to self-created database MariaDB 
You can recover the instance backup of JCS for MariaDB to self-created database.

## Precautions
* The version of self-created database needs to be consistent with that of source database of backup file.
* The backup unzip software only supports execution under Linux.
* The system dependences of decompression tool are: openssl, gzip, tee, python (version>=2.7).
* Percona xtrabackup >= 2.4 has been installed on the current system; If it is not installed, see [Official manual] (https://www.percona.com/doc/percona-xtrabackup/2.4/index.html).

## Operation Description
1. Install environmental dependence, see precautions
2. Download backup unpzip tool, Click **Download** (http://jddb-common-public.oss.cn-north-1.jcloudcs.com/mariadb_backup_extract_tool.tar.gz) and decompress with the tool name of ‘mariadb_backup_exztract.py’, use example is shown as bellow
    
    ```
    # View Help Manual
    ./mariadb_backup_extract.py -h
     
     # Decompress backup data of JCS for MariaDB instance
     ./mariadb_backup_extract.py  -v 5.7 -f ./backup.xbstream.gz.enc
    ```
3. Download Backup File

    ```
    wget -c ‘<Data backup download link>' -O <Customized backup file name>.xbstream.gz.enc

    -c: Start Breakpoint Upload
    -O: Save the downloaded results as the designated files. Note: the suffix of the file must be .xbstream.gz.enc
    ```

4. Decompress the backup data and the decompressed files in the sub-directory tmp_snapshot of current directory. It assumes that the current directory is $HOME.

    ```
    ./mariadb_backup_extract.py -v 10.2 -f <customized backup file name>.xbstream.gz.enc
    
    -Parameter V may not be specified, default: 10.2, you can view help manual by -h to know what specific variables should follow -v
    ```

5. Restore decompressed backup file

    ```
    innobackupex --defaults-file=$HOME/tmp_snapshot/backup-my.cnf --apply-log $HOME/tmp_snapshot
    ``` 
    When you see ***innobackupex completed OK!***, it means that the execution is successful. You can go on to the next operation.

6. Modify configuration file backup-my.cnf

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

7. Modify file owner and confirm that the file belongs to JCS for MySQL user

    ```
    chown -R mysql:mysql $HOME/tmp_snapshot
    ```

8 Start JCS for MariaDB process

    ```
    mysqld --defaults-file=/export/tmp_snapshot/backup-my.cnf --user=mysql --datadir=/export/tmp_snapshot
    ```

9 Login JCS for MariaDB database

    ```
    mysql -uroot -p
    ```

* The default password is null, directly press return key.
