

# DomesticShipmentResponseV2LabelLayoutInner


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**contents** | **String** | Content/Identifier of document e.g. DOCUMENT_REFERECE_ID.&lt;br /&gt; Actual document name e.g. abc.pdf. [IN]. |  [optional] |
|**fileFormat** | [**FileFormatEnum**](#FileFormatEnum) | Defines the format of the document file the print takes. |  [optional] |
|**size** | [**SizeEnum**](#SizeEnum) | Defines the label size of the Shipment, that is, the Shipping Label is available in different Doc Size. |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) | Defines the type of the Shipment. |  [optional] |



## Enum: FileFormatEnum

| Name | Value |
|---- | -----|
| PDF | &quot;PDF&quot; |
| ZPL2 | &quot;ZPL2&quot; |



## Enum: SizeEnum

| Name | Value |
|---- | -----|
| _8_X11 | &quot;DOC_8X11&quot; |
| _4_X6 | &quot;DOC_4X6&quot; |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| SHIPPING_LABEL | &quot;Shipping Label&quot; |



