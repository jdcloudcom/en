# JSON
## Overview
The JSON format refers to the JSON logs using the line break as the ending mark, which is subject to structural treatment as per rules of the JSON logs. KEY of the first layer shall be stored as the field key and VALUE of the first layer shall be stored as the field value. Resolution to object and array is not supported now, the two of which are directly resolved to value of string type.

## Log Pre-treatment
### Precondition
1. Log subjects of log sets have been created.
2. Select a business application log as the log source and complete log source setting.
3. Enter log pre-processing step.

### Operation Steps
1. Switch the key-value extraction mode to the "JSON Format".
2. Enter or paste log samples.
3. Click **Extract Fields** and then key value will be extracted from a log among log samples in the JSON mode. Extraction results will be displayed in the log extraction field list below. If the extraction fails, please check if log samples entered are of the JSON format.
4. By default, all fields are of string type. Users need to adjust field type according to actual conditions and only value type field supports aggregation calculation.
5. By default, all extracted fields will be stored and those not required to be stored or retrieved can be deleted by users.


