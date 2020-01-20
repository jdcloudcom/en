# Session Audit

Session audit focuses on post event audit, which records all session logs generated during the machine operation by the operation and maintenance personnel. The administrator can position faults and follow faults roots via audit session. The session supports two view methods, i.e., on-line playing as well as download and off-line play.


Session audit supports filter by period, machine IP, source IP, protocol type and other conditions. Command search is supported that the execution process can be replayed.


**Historical Session**

1. Login Audit > Session page > Historical Session page. Session audit logs of last one month and within 7 days can be viewed.

   ![](/image/Bastion/historyAudit.png) 

2. In the historical session page, click **Play** to replay the session audit via the web method.

3. In the historical session page, click **Download** to download the origin session file and view it via an off-line player

4. In the historical session page, logs can be positioned and retrieved by periods, machine IP, source IP, protocol type and other conditions

**Command Search**

The command search module can be used for make global retrieval as per commands and view session details corresponding to commands.

1. Login Audit > Session Audit > Command Search page.

  ![](/image/Bastion/mingAudit.png) 

2. Click **Details**. Via the rightward arrow in the list, session records corresponding to commands can be viewed

 ![](/image/Bastion/mingAudit2.png) 

3. In the command search page, command execution logs can be positioned by periods, machine IP, source IP, operation type, content and other conditions

## Offline Player

The offline player is used for view downloaded session audit logs offline.

Mac system download link: https://open-tools.s3.cn-north-1.jdcloud-oss.com/release/bastion/darwin/20191219/BastionPlayer.tar.gz


Windows system download link: https://open-tools.s3.cn-north-1.jdcloud-oss.com/release/bastion/win64/20191219/BastionPlayer.tar.gz
