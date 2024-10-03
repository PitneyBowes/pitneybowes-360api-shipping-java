

# SchedulePickupDHLEXPRequestPickupSummaryInner


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**serviceId** | **String** | The service id |  |
|**packageCount** | **BigDecimal** | The total number of packages |  |
|**totalWeight** | **BigDecimal** | The total weight of the packages |  |
|**weightUnit** | **String** | Weight Unit, supported values are &#x60;OZ&#x60; and &#x60;GM&#x60; |  |
|**currencyCode** | **String** | Currency code |  |
|**totalCustomsDeclaredValue** | **BigDecimal** | It indicates the custom declared value. It is required in case of international shipment. |  [optional] |
|**packageDetails** | [**List&lt;SchedulePickupDHLEXPRequestPickupSummaryInnerPackageDetailsInner&gt;**](SchedulePickupDHLEXPRequestPickupSummaryInnerPackageDetailsInner.md) | It descibes the individual package details |  |



