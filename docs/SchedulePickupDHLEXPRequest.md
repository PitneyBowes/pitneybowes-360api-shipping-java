

# SchedulePickupDHLEXPRequest

It specifies the request body for scheduling pickup for DHL Express

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**packageLocation** | **String** | It specifies the location from where packages would be collected. Applicable values are &#x60;NONE&#x60;, &#x60;FRONT&#x60;,&#x60;RECEPTION&#x60;,&#x60;BACK&#x60;,&#x60;LOADING DOCK&#x60; |  |
|**carrierAccountId** | **String** | It specifies the carrier account id, its value can be referenced from the &#x60;Get Carrier Accounts&#x60; API. |  |
|**pickupAddress** | [**SchedulePickupDHLEXPRequestPickupAddress**](SchedulePickupDHLEXPRequestPickupAddress.md) |  |  |
|**shipmentIds** | **List&lt;String&gt;** | It indicates the shipmentIds for which pickup to be scheduled. |  [optional] |
|**pickupSummary** | [**List&lt;SchedulePickupDHLEXPRequestPickupSummaryInner&gt;**](SchedulePickupDHLEXPRequestPickupSummaryInner.md) | This can be used to add package details for which labels are not created yet but would want to schedule pickup in advance. |  [optional] |
|**additionalnotes** | **String** | It can be used to provide any additional comments or remarks, it would be printed on the scheduled pickup document |  [optional] |
|**reference** | **String** | It is used for any reference purpose |  [optional] |
|**pickupOptions** | [**SchedulePickupDHLEXPRequestPickupOptions**](SchedulePickupDHLEXPRequestPickupOptions.md) |  |  |



