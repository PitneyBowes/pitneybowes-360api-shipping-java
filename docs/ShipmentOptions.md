

# ShipmentOptions


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**addToManifest** | **Boolean** | This option asks if the shipment is to be added for Manifest, so that the shipment will reflect in the Manifest Form while compilation. The value can be &#39;true&#39; or &#39;false&#39;. Applicable for USPS |  [optional] |
|**printCustomMessage** | **String** | This prints a custom message on shipping label |  [optional] |
|**receiptOption** | **String** | It provides options to print receipt with shipping label. Only applicable for USPS, can take values- RECEIPT_ONLY or RECEIPT_WITH_INSTRUCTIONS or NO_OPTIONS |  [optional] |
|**printDepartment** | **String** | This prints department on shipping label, applicable for FedEx |  [optional] |
|**printInvoiceNumber** | **String** | This prints invoice number on shipping label, applicable for FedEx |  [optional] |
|**printPONumber** | **String** | This prints po number on shipping label, applicable for FedEx |  [optional] |
|**packageDescription** | **String** | This is required for DHL Express shipment. It is used to provide description of package |  [optional] |



