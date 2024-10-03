

# ReprintShipment


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**correlationId** | **String** | This is a GUID (globally unique identifier) that&#39;s automatically generated for every request that the webserver receives. |  [optional] |
|**size** | [**SizeEnum**](#SizeEnum) | This defines the label size of the Shipment, e.g., Shipping Label having Doc Size (8&#39; X 11&#39;). |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) | This defines the type of the Shipment, e.g., Shipping Label. |  [optional] |
|**format** | [**FormatEnum**](#FormatEnum) | This defines the type of the shipment which is printed. For example Shipping label prints in PDF form. |  [optional] |
|**fromAddress** | [**ReprintShipmentFromAddress**](ReprintShipmentFromAddress.md) |  |  [optional] |
|**parcel** | [**ReprintShipmentParcel**](ReprintShipmentParcel.md) |  |  [optional] |
|**parcelTrackingNumber** | **String** | The Tracking number given to the Parcel for tracking purpose. |  [optional] |
|**rate** | [**ReprintShipmentRate**](ReprintShipmentRate.md) |  |  [optional] |
|**shipmentId** | **String** | A unique identifier associated with Shipment ID. |  [optional] |
|**shipmentOptions** | [**ShipmentOptions**](ShipmentOptions.md) |  |  [optional] |
|**toAddress** | [**ReprintShipmentToAddress**](ReprintShipmentToAddress.md) |  |  [optional] |



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



