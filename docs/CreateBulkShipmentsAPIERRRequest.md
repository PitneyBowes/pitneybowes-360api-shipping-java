

# CreateBulkShipmentsAPIERRRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** | Name of the of ERR Batch which consists of multiple shipments (shipments in bulk) for Coversheet printing., e.g. ERR-Coversheet07. |  |
|**groupName** | **String** | Indicates the name of the group of batches, which consists of multiple Batch groups. |  [optional] |
|**size** | [**SizeEnum**](#SizeEnum) | This indicates the envelope size of the ERR Bulk Shipment, i.e., DocSize. We have indicated the example values in enum. |  |
|**type** | [**TypeEnum**](#TypeEnum) | Indicates the type of the Batch Shipment, e.g., Shipping Label. |  |
|**format** | [**FormatEnum**](#FormatEnum) | This defines the format type of the shipment which is printed. For example Coversheet prints in PDF form. |  [optional] |
|**carrierAccountId** | **String** | The unique identifier associated with the user&#39;s registered USPS Account which will be required for this batch. User can override this value by defining it at Shipment level. |  |
|**serviceId** | **String** | A unique identifier given  to the carrier-specific service which is used for this BulkShipment. User can override this value by defining it at shipment level. |  |
|**parcelType** | **String** | Parcel Type is required for creating a shipment while rating a parcel. And it varies as per USPS selected services, e.g. LTR, LGENV. User can override this value by defining it at shipment level. |  |
|**parcelID** | **String** | A unique identifier given to the parcel or package corresponding to the selected service. This is optional field, but is used in few cases. Examples include BLM10, B1095, MT1098, etc. User can override this value by defining it at Shipment level. |  [optional] |
|**specialServices** | [**List&lt;SpecialServiceERRInner&gt;**](SpecialServiceERRInner.md) |  |  [optional] |
|**shipments** | [**List&lt;ShipmentERRCoversheet&gt;**](ShipmentERRCoversheet.md) |  |  |



## Enum: SizeEnum

| Name | Value |
|---- | -----|
| _10 | &quot;10&quot; |
| _6_X_9 | &quot;6 X 9&quot; |
| _6_X_9_5 | &quot;6 X 9.5&quot; |
| _9_5_X_12 | &quot;9.5 X 12&quot; |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| SHIPPING_LABEL | &quot;SHIPPING_LABEL&quot; |
| COVERSHEET | &quot;COVERSHEET&quot; |



## Enum: FormatEnum

| Name | Value |
|---- | -----|
| PDF | &quot;PDF&quot; |



