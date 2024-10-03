

# CreateBulkShipments

ShipmentBatch information contains following schema

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**groupName** | **String** |  |  [optional] |
|**size** | [**SizeEnum**](#SizeEnum) | This indicates the label size of the Bulk Shipment, e.g., DocSize can be 8&#39; X 11&#39; or 4&#39; X 6&#39;. |  |
|**type** | [**TypeEnum**](#TypeEnum) | This indicates the type of the Batch Shipment, e.g., Shipping Label. |  |
|**format** | [**FormatEnum**](#FormatEnum) | This defines the type of the shipment which is printed, e.g., Shipping label gets printed in PDF form. |  [optional] |
|**name** | **String** |  |  |
|**carrierAccountId** | **String** | A unique identifier associated with the Carrier account used by client users during shipment process. Default CarrierAccountID for this batch will be user&#39;s registered carrier account. User can override this value by defining it at shipment level. |  |
|**parcelType** | **String** | Parcel Type is required for creating a shipment while rating a parcel, which varies as per Carrier selection. Different carriers have different ParcelTypes, e.g., FRPKG, LGENV, TUBE, and PKG. User can override this value by defining it at Shipment level. |  |
|**serviceId** | **String** | A unique identifier given to the carrier-specific service. It varies with carrier selection. This is required for creating a shipment, while it is optional for rating a parcel. User can override this value by defining it at Shipment level. |  |
|**specialServices** | [**List&lt;SpecialService&gt;**](SpecialService.md) | It provides a carrier-service based special or extra service, which also varies based on services and parcel types. User can override this value by defining it at shipment level. |  [optional] |
|**shipments** | [**List&lt;Shipment&gt;**](Shipment.md) |  |  |



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



