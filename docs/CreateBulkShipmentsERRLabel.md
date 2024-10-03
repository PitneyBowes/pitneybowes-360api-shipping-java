

# CreateBulkShipmentsERRLabel

This ShipmentBatch contains the schema information for ERR Label.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** | Name of the of ERR Batch which consists of multiple shipments (shipments in bulk) for Label printing, e.g. ERR-Bulk05. |  |
|**groupName** | **String** | Indicates the name of the group of batches, which consists of multiple Batch groups. |  [optional] |
|**size** | [**SizeEnum**](#SizeEnum) | This indicates the label size of the Bulk Shipment when it gets printed,i.e., DocSize. This has two options 8&#39; X 11&#39; or 4&#39; X 6&#39;. |  |
|**type** | [**TypeEnum**](#TypeEnum) | Indicates the type of the Batch Shipment, e.g., Shipping Label. |  |
|**format** | [**FormatEnum**](#FormatEnum) | Defines the type of the shipment which is printed, e.g., Shipping label gets printed in PDF form. |  [optional] |
|**carrierAccountId** | **String** | A unique identifier associated with the Carrier account used by client users during shipment process. Default CarrierAccountID for this batch will be user&#39;s registered USPS account. User can override this value by defining it at Shipment level. |  |
|**serviceId** | **String** | A unique identifier given to the carrier-specific service. User can override this value by defining it at Shipment level. |  |
|**parcelType** | **String** | Parcel Type is required for creating a shipment while rating a parcel. And it varies as per USPS selected services, e.g. FRPKG, LGENV, TUBE, and PKG. User can override this value by defining it at Shipment level. |  |
|**parcelID** | **String** | A unique identifier given to the parcel or package corresponding to the selected service. This is optional field, but is used in few cases. Examples include BLM10, B1095, MT1098, etc. User can override this value by defining it at Shipment level. |  [optional] |
|**specialServices** | [**List&lt;SpecialServiceERRInner&gt;**](SpecialServiceERRInner.md) |  |  [optional] |
|**shipments** | [**List&lt;ShipmentERR&gt;**](ShipmentERR.md) |  |  |



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



