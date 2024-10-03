

# SchedulePickupUSPSResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**packageLocation** | **String** | It specifies the location from where packages would be collected. |  [optional] |
|**pickupConfirmationNumber** | **String** | It displays the unique confirmation number of the pickup |  [optional] |
|**pickupId** | **String** | It displays the unique pickup Id which can be further used to get scheduled PDF and cancel pdf if required. |  [optional] |
|**carrier** | **String** | It dispays the carrier |  [optional] |
|**carrierAccountId** | **String** | It displays the carrier acount id which is used to create the shipment |  [optional] |
|**pickupAddress** | [**SchedulePickupDHLEXPResponsePickupAddress**](SchedulePickupDHLEXPResponsePickupAddress.md) |  |  [optional] |
|**shipmentIds** | **List&lt;String&gt;** | It indicates the shipmentIds for which pickup is scheduled. |  [optional] |
|**pickupSummary** | [**List&lt;SchedulePickupUSPSResponsePickupSummaryInner&gt;**](SchedulePickupUSPSResponsePickupSummaryInner.md) | It displays the package details provided in the request. |  [optional] |
|**additionalnotes** | **String** | It displays additional comments or remarks provided in the request, it would be printed on the scheduled pickup document |  [optional] |
|**reference** | **String** | It displays any reference information provided in the request. |  [optional] |
|**pickupDateTime** | **String** | It displays the scheduled pickup date |  [optional] |
|**pickupTotalWeight** | **BigDecimal** | It displays the total package weight. |  [optional] |
|**pickupTotalWeightUnit** | **String** | It displays the weight unit. |  [optional] |



