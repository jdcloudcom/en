# Searching by Tags

## 1. Tag Filter 
Click the icon of ***Tag Management*** at the upper right of the instance list to display the filter interface.

Click the icon of ***Tag Management*** again to hide the filtering interface.

![Search Tag1](../../../image/RDS/Search-Tag-1.png)

## 2. Select Tags to be Filtered
Fuzzy search can be carried out based on input keys/values.

Different values of the same key are logical or relational. For example, if the "department" is selected as the tag for "Test Department" and "R&D department", the "department" is filtered out as the instance of "R&D Department" or "Test Department".

![Search Tag 2](../../../image/RDS/Search-Tag-2.png)

Selecting some tag key/value indicates that it is required to filter out the instance bound to such key value. For example, if users select the tag of "Department: R&D Department", only the R&D department will be filtered out.

Different keys are logical and relational. If the "Department: R&D Department" and "Purpose: ERP Development" are selected, the database instance involving the "R&D department" with the purpose of ""ERP Development" shall be filtered out.

![Search Tag 3](../../../image/RDS/Search-Tag-3.png)

## 3. Confirmation
Click ***Query*** to filter the database instance after the selection.
