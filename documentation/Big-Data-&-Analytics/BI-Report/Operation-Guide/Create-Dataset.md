# Create Data Set

By creating a data set, you can filter out the required data from the data source, govern the data, and use the created dataset for the next report. Self-service data sets have powerful and easy-to-use data query and governance functions. Visual drag-and-drop operations make it easy for you to prepare data without help. It takes self-service join data as an example in this section to show you how to join data to form a new data set.

The data set join effects are shown in the following figure:
You can use the sample data sets "Coffee Sales Data in Chinese Market" and "Coffee Order Data in Chinese Stores" built into the product to join the data following the steps below.

1. Access the self-service data set

In the navigation area of home page after login, select "Self-service Dataset" to enter the Create Self-service Dataset interface.

2. Edit data set:

a In the data set list, drag the "Coffee Sales Data in Chinese Market" and "Coffee Order Data in Chinese Stores" to the editing area of
self-service data sets.

b In the action list, drag "Join" to the editing area and connect "Join" to the two datasheets with a link.

c In the pop-up Join Dialog Box, set the join mode to "Inner Join" and the join column is the order ID. In this way, data of the same order
ID in the two sheets are combined, as shown in the figure below.

d Connect "Join" and "Query Results" with a link, and all metadata appear in the metadata area.

3. Create a new date expression

In data analysis, time is a common analytical dimension that helps to present data information or trends at a specific time. In order to present data information under the time dimension when creating a report
, you need to create the required time dimension in the metadata area.

a Select the column of "Transaction Time" and select Create a new date expression from the right-click menu.

b Select the date expression format as "Year and Month".

c The dimension area has the time dimension "YearMonth_transaction time" that you have just created, and the system automatically uses "Year and Month" as an alias for the time dimension.

4. Save data set

Click on the menu bar -> **Save** to save the data set as "Join Table of Chinese Market Coffee Data".


