

# CreateBatchRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** | Name of the Batch which consists of multiple shipments (shipments in bulk). |  [optional] |
|**groupName** | **String** | Indicates the name of the group of batches, which consists of multiple Batch groups. |  [optional] |
|**size** | [**SizeEnum**](#SizeEnum) | This indicates the label size of the Bulk Shipment, e.g., DocSize can be 8&#39; X 11&#39; or 4&#39; X 6&#39;. |  |
|**type** | [**TypeEnum**](#TypeEnum) | This indicates the type of the Batch Shipment, e.g., Shipping Label. |  |
|**format** | [**FormatEnum**](#FormatEnum) | This defines the type of the shipment which is printed, e.g., Shipping label gets printed in PDF form. |  [optional] |
|**carrierAccountId** | **String** | A unique identifier associated with the carrier account used by client users during shipment process. |  |
|**serviceId** | **String** | A unique identifier given to the carrier-specific service. This varies as per carrier selection. |  |
|**parcelType** | **String** | Parcel Type is required for creating a shipment while rating a parcel. And it varies as per USPS selected services, e.g. FRPKG, LGENV, TUBE, and PKG. |  |
|**specialServices** | [**List&lt;SpecialServiceBatch&gt;**](SpecialServiceBatch.md) |  |  [optional] |



## Enum: SizeEnum

| Name | Value |
|---- | -----|
| _8_X11 | &quot;DOC_8X11&quot; |
| _4_X6 | &quot;DOC_4X6&quot; |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| SHIPPING_LABEL | &quot;SHIPPING_LABEL&quot; |



## Enum: FormatEnum

| Name | Value |
|---- | -----|
| PDF | &quot;PDF&quot; |



