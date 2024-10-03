

# SchedulePickupUSPSRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**packageLocation** | **String** | It specifies the location from where packages would be collected. Applicable values are &#x60;Front Door&#x60;,&#x60;Back Door&#x60;,&#x60;Side Door&#x60;,&#x60;Knock on Door/Ring Bell&#x60;,&#x60;Mail Room&#x60;,&#x60;Office&#x60;,&#x60;Reception,In/At Mailbox&#x60;,&#x60;Other&#x60; |  |
|**carrierAccountId** | **String** | It specifies the carrier account id, its value can be referenced from the &#x60;Get Carrier Accounts&#x60; API. |  |
|**pickupAddress** | [**SchedulePickupDHLEXPRequestPickupAddress**](SchedulePickupDHLEXPRequestPickupAddress.md) |  |  |
|**shipmentIds** | **List&lt;String&gt;** | It indicates the shipmentIds for which pickup to be scheduled. |  [optional] |
|**pickupSummary** | [**List&lt;SchedulePickupUSPSRequestPickupSummaryInner&gt;**](SchedulePickupUSPSRequestPickupSummaryInner.md) | This can be used to add package details for which labels are not created yet but would want to schedule pickup in advance. |  [optional] |
|**additionalnotes** | **String** | It can be used to provide any additional comments or remarks, it would be printed on the scheduled pickup document It is required to provide when packageLocation is set to &#x60;Other&#x60; |  [optional] |
|**reference** | **String** | It is used for any reference purpose |  [optional] |



