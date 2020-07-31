# Sensitive word
In order to meet the demands of enterprise-level applications for supervision and audit, JD Blockchain Open Platform provides the sensitive word management function, supporting functions such as sensitive word filtering, blacklist and operation log.

## Sensitive word management
The initiator (creator) of the current blockchain network can manage sensitive words through the sensitive word management function Tab. The operations currently supported are: **Add Sensitive Word** and **Sensitive Word Update**.

> This function is permissible only to the blockchain initiator (creator)

### Add Sensitive Word
The administrator can click the **Add Sensitive Word** button in the management interface to open the interface to add sensitive words, as shown in the figure:

![图片](../../../../../image/JD-Blockchain-Open-Platform/Getting-Started/Pic/consortium62.png)

Categories and types of selectable sensitive words are as follows:

* Political
    * Military
    * Confidential
* Public
    * Inclined to violence
    * Inclined to porns, gambling and drugs

The time interval value range is from the start time at 00:00:00 to the end time at 23:59:59 (open interval), and the default time span is 1 year.
> If the current date is not in the time interval, the sensitive words will not be effective

### Sensitive words list
The sensitive words that have already existed in the blockchain network will be displayed in the form of a list, with main fields including:

* Sensitive words: the words that the administrator has added but hopes to be filtered
* Validity: the effective time interval corresponding to the sensitive word
* Status: display whether the sensitive words are being used in real time
* Operations: be used to update the attributes related to the sensitive words

![图片](../../../../../image/JD-Blockchain-Open-Platform/Getting-Started/Pic/consortium63.png)

### Sensitive Word Update
Be used to update the attributes of sensitive words for the second time, and the updateable fields are:

* Types of sensitive words
* Categories of sensitive words
* Period of validity of sensitive words
* Sensitive keywords

> If you want to delete a sensitive word, you can set the validity of the sensitive word before yesterday
> After being successfully updated, the sensitive word filtering will take effect after 5 minutes

## Sensitive word user management
Sensitive word user management is mainly used to list out the API operation users that have been monitored in the current network (that is, the API users filled in during the network creation and the joining process).

> This function is permissible only to the blockchain initiator (creator)

![图片](../../../../../image/JD-Blockchain-Open-Platform/Getting-Started/Pic/consortium64.png)

Main fields shown in the list are:

* User name: API user name
* Organization name: the organization to which the API users belong
* Time joining network: when the current users join the current network
* Sensitive word count: the times that the user initiates the sensitive word transactions after the sensitive words filtering function is enabled
* Operations: be used to suspend or activate the current API user

> Notes:
> 
> * When the sensitive word count is greater than 100 times, the system will automatically suspend the user, and then the user cannot start any transaction after the suspension. After the administrator reactivates the user, the sensitive word count will be reset and recounted.
> * When the user is activated, the ledger can be normally read and written and the contract can be normally called; when the user is suspended, the ledger cannot be read and written and the contract cannot be called.

## Sensitive transaction management
The sensitive transaction management is used to list out the list of transactions blocked, and used for the administrator to troubleshoot and ascertain where the responsibility lies.

> This function is permissible only to the blockchain initiator (creator)

![图片](../../../../../image/JD-Blockchain-Open-Platform/Getting-Started/Pic/consortium65.png)

Main fields shown in the list are:

* Transaction number: *-* is shown before a transaction is intercepted; the transaction number is shown after a transaction is intercepted
* Transaction type: There are two transaction types, which are call and search. Read or write corresponding to the blockchain
* Parameters: The transaction parameters at the time of transaction submission. If they are blocked after a transaction, the parameters will be shown as*-*
* Return value: the return value after a transaction is executed, which will be *- if the transaction is intercepted before execution*-*
* Organization name: mark the organization initiating the transaction
* Transaction time: the specific time of attempting to initiate a transaction

## Complaint and Reporting Management
Network participants can bring up problems existing in the current network, for decision-making by the network creator.

![图片](../../../../../image/JD-Blockchain-Open-Platform/Getting-Started/Pic/consortium66.png)

Specific feasible operations are:

* Complaint
    * Business Complaints
    * Content Complaints
* Reporting
    * Reporting of Sensitive Words
    * Reporting of Major Events

![图片](../../../../../image/JD-Blockchain-Open-Platform/Getting-Started/Pic/consortium67.png)    

## Operation Log Management
Any of the operations of network participants at BaaS Console will be recorded for supporting the audit function.

> This function is permissible only to the blockchain initiator (creator)

Data fields to be recorded at the current stage are:

* User name: current JD Cloud login user PIN
* Creation time: specific time of triggering the action
* Behavior: specific operations in the network

![图片](../../../../../image/JD-Blockchain-Open-Platform/Getting-Started/Pic/consortium68.png)    