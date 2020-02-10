## Python Reference  
**I. Install JD Cloud Python SDK by pip installation or downloading sdk for manual installation.**  
JD Cloud Python SDK is applicable to Python 2.7.* and 3.* versions  
1. pip installation:  
```
pip install -U jdcloud_sdk
```  
 
2. Download sdk for manual installation:  
sdk download link: [SDK-1.6.39](https://files.pythonhosted.org/packages/99/9d/48054c24d9d940a173b11d5bd87a149a1ce418330cdafa9f9d077fc6a83e/jdcloud_sdk-1.6.39.tar.gz)  
Download SDK and decompress it, go to ./jdcloud_sdk-1.6.39 directory, and then install it with the following command  
```
python setup.py install
```  

For the latest version number of python SDK, please [View](https://pypi.org/project/jdcloud-sdk/#history)  
<br><br>
**II. Example Code**  

 ```
# coding=utf-8
from jdcloud_sdk.core.credential import Credential
from jdcloud_sdk.services.sms.client.SmsClient import SmsClient
from jdcloud_sdk.services.sms.apis.BatchSendRequest import BatchSendParameters, BatchSendRequest
from jdcloud_sdk.services.sms.apis.StatusReportRequest import StatusReportParameters, StatusReportRequest
from jdcloud_sdk.services.sms.apis.ReplyRequest import ReplyParameters, ReplyRequest
 
# It is unnecessary to modify region information
regionId = 'cn-north-1'
# Please fill in user aksk (You can view your own aksk on the page of Application Management - Overview)
access_key = 'xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx'
secret_key = 'xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx'
credential = Credential(access_key, secret_key)
client = SmsClient(credential)
 
 
# Send
def testBatchSendMsg():
    try:
        # Set Template Id
        templateId = 'bm_xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx'
        # Set Signature Id
        signId = 'qm_xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx'
        # Set Sending Mobile Phone Number
        phoneList = ['186xxxxxxxx', '183xxxxxxxx']
        parameters = BatchSendParameters(regionId=regionId, templateId=templateId,
                                         signId=signId, phoneList=phoneList)
        # Set Template Parameter, Optional
        params = []
        parameters.setParams(params=params)
        request = BatchSendRequest(parameters)
        resp = client.send(request)
        if resp.error is not None:
            print(resp.error.code, resp.error.message)
        print(resp.result)
    except Exception as e:
        print(e)
        # Error Processing
 
 
# Search Status Report
def testStatusReport():
    try:
        # Set SN. Get SN from Issued Interface response
        sequenceNumber = '1227185xxxxxxxxxxxxxx'
        parameters = StatusReportParameters(regionId=regionId, sequenceNumber=sequenceNumber)
        # Set List of Mobile Phone Number Requiring Receipt, Optional
        # phoneList = []
        # parameters.setPhoneList(phoneList=phoneList)
        request = StatusReportRequest(parameters)
 
        resp = client.send(request)
        if resp.error is not None:
            print(resp.error.code, resp.error.message)
        print(resp.result)
    except Exception as e:
        print(e)
 
 
# Search Reply Information
def testReply():
    try:
        # Set Application Id
        appId = '22ed9c2xxxxxxxxxxxxxxxxxxx'
        # Set Search Time
        dataDate = 'xxxx-xx-xx'
        parameters = ReplyParameters(regionId=regionId, appId=appId, dataDate=dataDate)
        # Set Search Mobile Phone Number
        phoneList = []
        parameters.setPhoneList(phoneList=phoneList)
        request = ReplyRequest(parameters)
        resp = client.send(request)
        if resp.error is not None:
            print(resp.error.code, resp.error.message)
        print(resp.result)
    except Exception as e:
        print(e)
 
 
if __name__ == '__main__':
    # Send SMS
    testBatchSendMsg()
    # Search Status Report
    # testStatusReport()
    # Search Reply Information
    # testReply()
 ```
