

# ReprintShipmentV2LabelLayoutInner


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**contentType** | [**ContentTypeEnum**](#ContentTypeEnum) | This is used to encode binary data as printable text.&lt;br /&gt; ContentType of the document is URL if the fileformat is PDF, while it will be BASE64 if the fileFormat is ZPL2. |  [optional] |
|**contents** | **String** | Content/Identifier of document e.g. DOCUMENT_REFERECE_ID.&lt;br /&gt; Actual document name e.g. abc.pdf. [IN]. |  [optional] |
|**fileFormat** | [**FileFormatEnum**](#FileFormatEnum) | Defines the format of the document file the print takes. |  [optional] |
|**size** | [**SizeEnum**](#SizeEnum) | Defines the label size of the Shipment, that is, the Shipping Label is available in different Doc Size. |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) | Defines the type of the Shipment. |  [optional] |



## Enum: ContentTypeEnum

| Name | Value |
|---- | -----|
| URL | &quot;URL&quot; |
| BASE64 | &quot;BASE64&quot; |



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



