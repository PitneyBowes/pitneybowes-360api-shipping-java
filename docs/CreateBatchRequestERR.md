

# CreateBatchRequestERR


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** | Name of the of ERR Batch which is imported, e.g. ERR-Import-05. |  [optional] |
|**groupName** | **String** | Indicates the name of the group of batches, which consists of multiple Batch groups. |  [optional] |
|**size** | [**SizeEnum**](#SizeEnum) | This indicates the label size of the Bulk Shipment when it gets printed,i.e., DocSize. |  |
|**type** | [**TypeEnum**](#TypeEnum) | This indicates the type of the Batch Shipment, e.g., Shipping Label and Coversheet. |  |
|**format** | [**FormatEnum**](#FormatEnum) | This defines the type of the shipment which is printed, e.g., Shipping label gets printed in PDF form. |  [optional] |
|**carrierAccountId** | **String** | A unique identifier associated with the carrier account used by client users during shipment process. Default CarrierAccountID for this batch will be user&#39;s registered USPS account. |  |
|**serviceId** | **String** | A unique identifier given to the carrier-specific service. User can override this value by defining it at Shipment level. |  |
|**parcelType** | **String** | Parcel Type is required for creating a shipment while rating a parcel. And it varies as per USPS selected services, e.g. FRPKG, LGENV, TUBE, and PKG. |  |
|**specialServices** | [**List&lt;SpecialServiceBatchERR&gt;**](SpecialServiceBatchERR.md) |  |  [optional] |



## Enum: SizeEnum

| Name | Value |
|---- | -----|
| LABEL_DOC_8_X11_AND_DOC_4_X6_ | &quot;ERR Label - DOC_8X11 and DOC_4X6.&quot; |
| COVERSHEET_10_6_X_9_6_X_9_5_AND_9_5_X_12 | &quot;ERR Coversheet - 10, 6 X 9, 6 X 9.5, and 9.5 X 12&quot; |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| SHIPPING_LABEL | &quot;SHIPPING_LABEL&quot; |
| COVERSHEET | &quot;COVERSHEET&quot; |



## Enum: FormatEnum

| Name | Value |
|---- | -----|
| PDF | &quot;PDF&quot; |



