

# ShipmentOptionsERR


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**addToManifest** | **Boolean** | This option asks if the shipment is to be added for Manifest, so that the shipment can be reflected in the Manifest Form while compilation. The value can be &#39;true&#39; or &#39;false&#39;. Applicable for USPS. |  [optional] |
|**printCustomMessage** | **String** | This prints a custom message on the Shipping Label. |  [optional] |
|**receiptOption** | [**ReceiptOptionEnum**](#ReceiptOptionEnum) | It provides options to print receipt with Shipping Label. This is only applicable for USPS, and takes values: &#x60;RECEIPT_ONLY&#x60;, &#x60;RECEIPT_WITH_INSTRUCTIONS&#x60;, or &#x60;NO_OPTIONS&#x60;. |  [optional] |
|**printDepartment** | **String** | It displays/prints the Department on the Shipping Label. |  [optional] |
|**printInvoiceNumber** | **String** | It displays/prints Invoice Number on the Shipping Label. |  [optional] |
|**printPONumber** | **String** | It displays/prints PO Number on the Shipping Label. |  [optional] |



## Enum: ReceiptOptionEnum

| Name | Value |
|---- | -----|
| RECEIPT_ONLY | &quot;RECEIPT_ONLY&quot; |
| RECEIPT_WITH_INSTRUCTIONS | &quot;RECEIPT_WITH_INSTRUCTIONS&quot; |
| NO_OPTIONS | &quot;NO_OPTIONS&quot; |



