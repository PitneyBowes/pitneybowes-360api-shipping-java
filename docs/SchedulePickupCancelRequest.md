

# SchedulePickupCancelRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**pickupIds** | **List&lt;String&gt;** | It specifies the pickup Ids for which you would like to cancel the request. Only pickupIds of the same carrier should be provided in the array. |  |
|**options** | [**List&lt;SchedulePickupCancelRequestOptionsInner&gt;**](SchedulePickupCancelRequestOptionsInner.md) | It is required to be provided for DHL Express pickup cancellation. Both &#x60;REQUESTOR_NAME&#x60; and &#x60;REASON_FOR_CANCEL&#x60; are required for DHL Express. |  [optional] |



