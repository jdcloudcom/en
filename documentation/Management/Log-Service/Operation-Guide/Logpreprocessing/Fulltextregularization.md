# Single Line and Full Text Regular Expression
## Overview
The single line full text regular expression refers to a single line log using a line break as the ending mark, which is subject to structural treatment as per the regular expression provided by a user. After being processed, log contents will be stored in the key-value pair form. While retrieving a log, a user can conduct key-value retrieval as per extracted fields.

## Log Pre-treatment
### Precondition
1. Log subjects of log sets have been created.
2. Select a business application log as the log source and complete log source setting.
3. Enter log pre-processing step.

### Operation Steps
1. Switch key-value extraction mode to "Single Line and Full Text Regular Expression"
2. Enter or paste log samples.
3. Enter or paste a regular expression.
4. Click **Extract Fields** and then key value will be extracted from a log among log samples as per the regular expressions entered. Extraction results will be displayed in the log extraction field list below. If such extraction fails, it needs to check if the entered log samples or the regular expressions filled in are correct.
