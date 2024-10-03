

# PrintDocumentRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**printerAliasName** | **String** | Name of the Printer connected (directly or via network) to a Computer. &#x60;Max length &#x3D; 30&#x60; |  |
|**data** | [**DataEnum**](#DataEnum) | Content/Identifier of document e.g. DOCUMENT_REFERECE_ID. Actual document name e.g. abc.pdf. [IN] i.e base64 string, URL, file path |  |
|**dataType** | [**DataTypeEnum**](#DataTypeEnum) | Data Type of the document e.g. DOCUMENT_REFERENCE. [IN/OUT] |  |
|**documentType** | [**DocumentTypeEnum**](#DocumentTypeEnum) | The format of the document file the print takes. |  |
|**formName** | [**FormNameEnum**](#FormNameEnum) | The name of the Document Form. |  |
|**orientation** | **String** | The orientation of the document layout: Portrait or Landscape. |  [optional] |
|**reference** | [**PrintDocumentRequestReference**](PrintDocumentRequestReference.md) |  |  [optional] |



## Enum: DataEnum

| Name | Value |
|---- | -----|
| PDF | &quot;PDF&quot; |
| URL | &quot;URL&quot; |



## Enum: DataTypeEnum

| Name | Value |
|---- | -----|
| BASE64 | &quot;BASE64&quot; |
| URL | &quot;URL&quot; |



## Enum: DocumentTypeEnum

| Name | Value |
|---- | -----|
| ZPL2 | &quot;ZPL2&quot; |
| PDF | &quot;PDF&quot; |



## Enum: FormNameEnum

| Name | Value |
|---- | -----|
| _8X11 | &quot;8x11&quot; |
| _4X6 | &quot;4x6&quot; |
| _2X1 | &quot;2x1&quot; |
| ENV10 | &quot;ENV10&quot; |
| ENV9 | &quot;ENV9&quot; |
| A1 | &quot;A1&quot; |



