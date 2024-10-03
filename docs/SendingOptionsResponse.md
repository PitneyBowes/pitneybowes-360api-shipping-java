

# SendingOptionsResponse

Sending Options includes used carrier related details, sender details, and parcel details.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**carrier** | **String** | Name of the carrier. E.g., FedEx. |  [optional] |
|**service** | **String** | Name of the carrier-based service. E.g., 2DA. |  [optional] |
|**carrierAccounts** | [**SendingOptionsResponseCarrierAccounts**](SendingOptionsResponseCarrierAccounts.md) |  |  [optional] |
|**labelSize** | [**LabelSizeEnum**](#LabelSizeEnum) | Size of the label, e.g., DOC_4X6. |  [optional] |
|**labelType** | **String** | Type of the Label, e.g., Shipping_Label. |  [optional] |
|**labelFormat** | **String** | Format of the Label, e.g., PDF. |  [optional] |
|**fromAddress** | [**FromAddressV2Response**](FromAddressV2Response.md) |  |  [optional] |
|**parcel** | [**ParcelV2Response**](ParcelV2Response.md) |  |  [optional] |



## Enum: LabelSizeEnum

| Name | Value |
|---- | -----|
| DOC_4_X6 | &quot;DOC_4X6&quot; |



