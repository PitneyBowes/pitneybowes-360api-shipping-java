

# DomesticShipmentResponseLabelLayoutInner


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**contentType** | **String** | it shows the type of label generated |  [optional] |
|**contents** | **String** | it shows the label URL of the shipment |  [optional] |
|**size** | [**SizeEnum**](#SizeEnum) | This defines the label size of the Shipment, e.g., Shipping Label having Doc Size (4&#39; X 6&#39; or 8.5&#39; X 11&#39;). |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) | This defines the type of the Shipment, e.g., Shipping Label. |  [optional] |
|**fileFormat** | [**FileFormatEnum**](#FileFormatEnum) | This defines the type of the shipment which is printed. For example Shipping label prints in PDF form. |  [optional] |



## Enum: SizeEnum

| Name | Value |
|---- | -----|
| _8_X11 | &quot;DOC_8X11&quot; |
| _4_X6 | &quot;DOC_4X6&quot; |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| SHIPPING_LABEL | &quot;SHIPPING_LABEL&quot; |



## Enum: FileFormatEnum

| Name | Value |
|---- | -----|
| PDF | &quot;PDF&quot; |
| ZPL2 | &quot;ZPL2&quot; |



