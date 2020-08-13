# JSON Extraction Mode
## Overview
The JSON format refers to the JSON logs using the line break as the ending mark, which is subject to structural treatment as per rules of the JSON logs. KEY of the first layer shall be stored as the field key and VALUE of the first layer shall be stored as the field value. Resolution to object and array is not supported now, the two of which are directly resolved to value of string type.

## Precondition
1. Log subjects of log sets have been created.
2. Select a business application log as the log source and complete log source setting.
3. Enter log pre-processing step.

## Operation Steps
1. Switch the key-value extraction mode to the "JSON Format".
2. Enter or paste log samples.
3. Click **Extract Fields** and then key value will be extracted from a log among log samples in the JSON mode. Extraction results will be displayed in the log extraction field list below. If the extraction fails, please check if log samples entered are of the JSON format.
4. By default, all fields are of string type. Users need to **adjust field type according to actual conditions** and only value type field supports aggregation calculation.
5. By default, all extracted fields will be stored and those not required to be stored or retrieved can be deleted by users.

<img src="https://raw.githubusercontent.com/jdcloudcom/cn/zhangwenjie-only/image/LogService/operationguide/JSON.jpg" width=60% height=60% />

## Notes
1. The size of a JSON log sample shall not exceed 1K.
2. When key-value pair is extracted in JSON format, extraction of array and object is not supported temporarily.
3. Restrictions on extracted field quantity and types are as follows: String Type fields shall not exceed 30; Integer Type fields shall not exceed 30; Float Type fields shall not exceed 20; Time Type fields shall not exceed 5; IP Type fields shall not exceed 5.
4. At least one extracted field shall be reserved and deletion of all extracted fields is not allowed.
5. Users need to set time resolution format for Time Type fields with 64 characters to be input at most in resolution format.
6. When saving, each field extracted shall be compared with the log sample. If the verification on a field fails, then the field is prohibited from being saved. The relevant verification limits are as follows:
   - If the sample is a string type sample, the corresponding field extracted must be specified as the string type.
   - If key is timestamp, the field type must be specified as the time type.
   - If the sample is an IP address, the field type can be specified as the IP or string type.
   - If the sample is an integer, the field type shall be specified as the int type.
   - If the sample is a floating-point number, the field type shall be specified as the float type.
