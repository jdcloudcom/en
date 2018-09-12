## Data Output<br>
Output Definition: <br>
What does the data require to be output after the completion of the computing<br><br>
![sc-020](https://github.com/jdcloudcom/cn/blob/edit/image/Streamcompute/SC-020.png?raw=true)<br><br>
Name: <br>
Enter the name of the source. In the later SQL statement searching for the job, the tablename in “into [tablename]” is the name which you define here. <br><br>
Output Location: <br>
You can choose the output locations for the data after it is computed. The currently available output locations are the “Data Computing Service” and “Streaming Data Bus”. In subsequent version's iteration, more abundant destinations for output will be provided<br><br>
A) 	 Output Location: Data Computing Service<br>
Database: <br>
Database Name under Data Computing Service: <br><br>
Data Sheet: <br>
Data Sheet Name under the Database<br><br>
B) Output Location: Streaming Data Bus<br>
Topic of Streaming Data Bus: <br>
Select the topic name which you create under streaming data bus<br><br>
Serialization Format for the Event: <br>
Select the event’s serialization format into JSON or CSV<br><br>
Treatment of Exception Data: <br>
Ignore the exception data without saving it: When exception data is encountered, the exception data will be ignored and it should continue <br>
![sc-021](https://github.com/jdcloudcom/cn/blob/edit/image/Streamcompute/SC-021.png?raw=true)<br>
The Later Data with Compliance<br>
Ignore the exception data and save it: When this option is opened, the exception data will be saved to the cloud storage’s bucket which you specified, as shown below<br><br>
After clicking OK, the output definition will be completed. <br>
