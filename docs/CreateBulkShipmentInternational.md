

# CreateBulkShipmentInternational

ShipmentBatch information contains the `BatchId`, `Carrier`,`To` and `From` addresses, `Tracking details`, and `Event information` of the Ship Request.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**groupName** | **String** |  |  [optional] |
|**size** | [**SizeEnum**](#SizeEnum) | This indicates the label size of the Bulk Shipment, e.g., DocSize can be 8&#39; X 11&#39;. |  |
|**type** | [**TypeEnum**](#TypeEnum) | This indicates the type of the Batch Shipment, e.g., Shipping Label. |  |
|**format** | [**FormatEnum**](#FormatEnum) | This defines the type of the shipment which is printed, e.g., Shipping label gets printed in PDF form. |  [optional] |
|**name** | **String** |  |  |
|**carrierAccountId** | **String** | Default &#x60;carrierAccountId&#x60; to be used for this batch. You can override this value by defining it at shipment level. |  |
|**parcelType** | **String** | Default &#x60;parcelType&#x60; specific to the carrier, e.g., FRPKG, LGENV, TUBE,PKG to be used for this batch. You can override this value by defining it at shipment level. |  |
|**serviceId** | **String** | Default abbreviated name &#x60;serviceId&#x60; of the carrier-specific service to be used for this batch. You can override this value by defining it at shipment level. |  |
|**specialServices** | [**List&lt;SpecialService&gt;**](SpecialService.md) | Default &#x60;specialServices&#x60; to be used for this batch. You can override this value by defining it at shipment level. |  [optional] |
|**shipments** | [**List&lt;ShipmentInternational&gt;**](ShipmentInternational.md) |  |  |



## Enum: SizeEnum

| Name | Value |
|---- | -----|
| DOC_8_X11 | &quot;DOC_8X11&quot; |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| SHIPPING_LABEL | &quot;SHIPPING_LABEL&quot; |



## Enum: FormatEnum

| Name | Value |
|---- | -----|
| PDF | &quot;PDF&quot; |



