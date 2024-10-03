

# SendingOptions

Sending Options will include carrier and its account details, sender details, and parcel details.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**carrier** | [**CarrierEnum**](#CarrierEnum) | Name of the carrier. E.g., FedEx. |  [optional] |
|**service** | **String** | Name of the carrier-based service. E.g., 2DA. |  [optional] |
|**carrierAccounts** | [**SendingOptionsCarrierAccounts**](SendingOptionsCarrierAccounts.md) |  |  [optional] |
|**labelSize** | [**LabelSizeEnum**](#LabelSizeEnum) | Size of the label, e.g., DOC_4X6. |  [optional] |
|**labelType** | **String** | Type of the Label, e.g., Shipping_Label. |  [optional] |
|**labelFormat** | **String** | Format of the Label, e.g., PDF. |  [optional] |
|**fromAddress** | [**FromAddressV2**](FromAddressV2.md) |  |  [optional] |
|**parcel** | [**ParcelV2**](ParcelV2.md) |  |  [optional] |



## Enum: CarrierEnum

| Name | Value |
|---- | -----|
| FED_EX | &quot;FedEx&quot; |
| USPS | &quot;USPS&quot; |



## Enum: LabelSizeEnum

| Name | Value |
|---- | -----|
| DOC_4_X6 | &quot;DOC_4X6&quot; |



