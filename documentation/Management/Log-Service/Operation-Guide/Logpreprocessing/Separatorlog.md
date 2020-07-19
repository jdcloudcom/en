# Separator
## Overview
The separator log refers to a single log which can be subject to structural extraction by designated separators. Each log adopts a line break as the end mark. Log contents segmented by separators shall act as field value and users need to define field key and field type.

## Log Pre-treatment
### Precondition
1. Log subjects of log sets have been created.
2. Select a business application log as the log source and complete log source setting.
3. Enter log pre-processing step.

### Operation Steps
1. Switch the key-value extraction mode to the "Separator".
2. Select log separators. If separators provided by default cannot meet demands, customized separators can be selected or separators of users can be entered.
3. Enter or paste log samples.
4. Click **Extract Fields** and then entered log samples will be segmented as per the separators set by users. After segmentation, the segmentation results will be displayed in the log extraction field list. If such segmentation failed, the cause may be that the selected or entered separators or the entered log samples are wrong.
5. Users need to customize field key. By default all fields are of string type. Users need to adjust field type according to actual conditions and only value type field supports aggregation calculation.
6. For fields which are not required to be stored and monitored, a user can directly delete them from the log extraction fields.


