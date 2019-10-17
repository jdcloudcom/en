# getSingleBucketCapacity


## Description
Obtain designated bucket consumption data by type

## Request Method
POST

## Request Address
https://ossopenapi.jdcloud-api.com/v1/regions/{regionId}/capacity/{bucketName}

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID|
|**bucketName**|String|True| |Designated bucket for consumption query|

## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**capacityTypes**|Integer[]|True| |<p>Consumption query data type:</p><br><code>1000040</code>:Standard storage<br><code>1000041</code>:Reduced redundancy storage<br><code>1000042</code>:Archival storage<br><code>1000043</code>Archiving overHead storage:<br><code>1000044</code>Infrequent access storage:<br><code>1000045</code>Infrequent overHead storage:<br><code>1</code>:Intranet GET traffic<br><code>2</code>:Intranet HEAD traffic<br><code>3</code>:Intranet PUT traffic<br><code>4</code>:Intranet POST traffic<br><code>5</code>:Intranet DELETE traffic<br><code>6</code>:Intranet OPTIONS traffic<br><code>7</code>:Intranet TRACE traffic<br><code>11</code>:Internet GET traffic<br><code>12</code>:Internet HEAD traffic<br><code>13</code>:Internet PUT traffic<br><code>14</code>:Internet POST traffic<br><code>15</code>:Internet DELETE traffic<br><code>16</code>:Internet OPTIONS traffic<br><code>17</code>:Internet TRACE traffic<br><code>21</code>:CDN GET traffic<br><code>22</code>:CDN HEAD traffic<br><code>23</code>:CDN PUT traffic<br><code>24</code>:CDN POST traffic<br><code>25</code>:CDN DELETE traffic<br><code>26</code>:CDN OPTIONS traffic<br><code>27</code>:CDN TRACE traffic<br><code>31</code>:Intranet GET count<br><code>32</code>:Intranet HEAD count<br><code>33</code>:Intranet PUT count<br><code>34</code>:Intranet POST count<br><code>35</code>:Intranet DELETE count<br><code>36</code>:Intranet OPTIONS count<br><code>37</code>:Intranet TRACE count<br><code>51</code>:Internet GET count<br><code>52</code>:Internet HEAD count<br><code>53</code>:Internet PUT count<br><code>54</code>:Internet POST count<br><code>55</code>:Internet DELETE count<br><code>56</code>:Internet OPTIONS count<br><code>57</code>:Internet TRACE count<br><code>61</code>:CDN GET count<br><code>62</code>:CDN HEAD count<br><code>63</code>:CDN PUT count<br><code>64</code>:CDN POST count<br><code>65</code>:CDN DELETE count<br><code>66</code>:CDN OPTIONS count<br><code>67</code>:CDN TRACE count<br><code>71</code>:Advance deletion of archival<br><code>72</code>:Advance deletion of infrequent access<br><code>81</code>:Archival retrieve Bulk<br><code>82</code>:Archival retrieve Std<br><code>83</code>:Archival retrieve Exp<br><code>84</code>:Infrequent data retrieve<br>|
|**beginTime**|String|False| |Start time, use UTC time, format: YYYY-MM-DDTHH:mm:ss'Z'|
|**endTime**|String|False| |end time, use UTC time, format: YYYY-MM-DDTHH:mm:ss'Z'|
|**periodType**|Integer|False| |Aggregation method of query data:<br><code>0</code>:all, the maximum query interval is 365 days <br><code>1</code>:hour, and the maximum query interval is 31 days. Default 1<br><code>2</code>:day, the maximum query interval is 365 days.|
|**method**|Integer|True| |Method for returning data: <code>1</code>:recent(section value), <code>2</code>:current(current value. When method = 2, query the current value based on the time of beginTime if the beginTime is transferred; query the current value based on the time of backend system if the beginTime is not transferred.)|


## Return Parameter
|Name|Type|Description|
|---|---|---|
|**result**|Result| |
|**requestId**|String| |

### Result
|Name|Type|Description|
|---|---|---|
|**bucketCapacityQueryResult**|BucketCapacityQueryResult| |
### BucketCapacityQueryResult
|Name|Type|Description|
|---|---|---|
|**resultList**|BucketCapacityStatistic[]|bucket Consumption Statistics List|
### BucketCapacityStatistic
|Name|Type|Description|
|---|---|---|
|**bucketName**|String|Bucket Name|
|**value**|Long|Consumption value, unit Byte|
|**time**|String|Time|
|**capacityType**|Integer|Consumption Type|

## Return Code
|Return Code|Description|
|---|---|
|**200**|success|
|**400**|Invalid parameter|
|**500**|Internal server error|
