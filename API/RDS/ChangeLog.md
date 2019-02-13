# Update History #
API Version: 0.4.1

|Release Time|Version Number| Update |Instructions|
|---|---|---|---|
|2018-12-24|0.4.1|SQL Server Interface Update |*  Searching SQL Server account list supports paging <br>* Create an instance support SQL Server based on time point <br>* Create an instance support SQL Server based on backup|
|2018-12-20|0.4.0|Support of filter and tagFilter |* Instance List supports filter and tagFilter filtering <br>* Instance List instance details return tag information|
|2018-12-17|0.3.9|Add MySQL Related Interface |* Searching availability zone interface supports MySQL<br>* Add clearing binlog interface <br>* Modify instance name interface support MySQL<br>* Add enabling and disabling high security model interface <br>* Add deleting and modifying parameter set interface<br>* Searching user quota interface supports MySQL|
|2018-12-12|0.3.8|Add SQL Server Related Interface |* Add searching availability zone interface <br>* Add cancelling authorization interface <br>* Add deleting Cloud on Single Database file interface <br>* Add obtaining performance information interface to SQL in the process of execution<br>* Modify the status of backupMode of searching backup list from Automated to auto|
|2018-12-10|0.3.7|Add PG Related Interface |*  Search resource list interface in batch|
|2018-11-15|0.3.6|Add interfaces related to MySQL |* add interfaces related to backup synchronization service <br>* add interfaces related to audit|
|2018-11-14|0.3.5|Add interfaces related to MySQL |* enable service after renewing and disable service after arrear|
|2018-11-13|0.3.4|Part of interfaces support PG |* interfaces related to instance and accounts support PG <br>* add interface for query user quota|
|2018-10-17|0.3.3|Data Type Change|* Bug Repair of Data Type Returned by Slow Log and Binlog Data Type|
|2018-10-11|0.3.2|API Name Optimization|* getBackupPolicy is changed to describeBackupPolicy, and post request is changed to get request<br>* setBackupPolicy is changed to modifyBackupPolicy<br>* getAuditDownloadURL is changed to describeAuditDownloadURL, and post request is changed to get request<br>* getAuditFiles is changed to describeAuditFiles, and post request is changed to get request<br>* getOptions is changed to describeAuditOptions, and post request is changed to get request<br>* setInstanceName is changed to modifyInstanceName<br>* Post request of describeIndexPerformance method is changed to get request<br>* Post request of describeQueryPerformance is changed to get request|
|2018-09-05|0.3.1|Add a new MySQL API* Add a new query backup download link API<br>* Add a new binglog API<br>* Add a new slow log analysis and slow slog breakdown API<br>* Add a new modification connection mode API|
|2018-08-30|0.3.0|MySQL APIs added|* Upgrade instance configuration APIs added<br>* Creating instance APIs according to time points and backup added<br>* Account authorization and account authorization cancellation added<br>* Creating backup and querying backup list APIs support MySQL<br>* Modifying and acquiring backup policy APIs support MySQL<br>* Open the white list modification function|
|2018-08-24|0.2.9|Official Website Internationalization|* Optimized API Description|
|2018-08-20|0.2.8|Support Android System|* Java SDK newly added the support for Android system|
|2018-08-08|0.2.7|White List|* White List modification function temporarily not supported|
|2018-08-07|0.2.6|Add APIs and some APIs support MySQL|* Add White List Related API<br>* Add External Network Access Related API<br>* Allow Backup Policy Access API<br>* Add Backup Replacement and Recovery Instance API<br>* Account related API supports MySQL <br>* Some database related APIs support MySQL<br>* Deletion backup API supports MySQL|
|2018-07-25|0.2.5|Add API|* Add Database Related API<br>* Add Deletion Backup API <br>* Add Error Log Related API<br>* Add Performance Statistics Related API|
|2018-05-22|0.2.4|Add API|* Add Instance Related API<br>* Add Backup Policy API<br>* Add Template Sharing API for Cloud on Single Database|
|2018-04-12|0.2.3|Perfect Description and Modify API|* Perfect API Description<br>* Modify backup file link API, fileName field modified as non-transfer-required|
|2018-03-29|0.2.2|Backup List|* New Filter Items of Backup List API|
|2018-03-28|0.2.1|Modify Single Database Recovery API Name|* restoreSingleDatabase modified as restoreDatabaseFromBackup|
|2018-03-18|0.2.0|Cloud on Single Database|* Add File List API for Cloud on Single Database<br>* Add File Recovery Database API for Cloud on Single Database<br>* New Timeout Parameter of File Backup Link|
|2018-01-31|0.1.0|Initial Version|* API Definition Basic API|
