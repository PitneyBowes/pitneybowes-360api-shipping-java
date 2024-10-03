

# ShipmentInternationalCustomsCustomsInfo

This is additional customs information required along with item details.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**reasonForExport** | [**ReasonForExportEnum**](#ReasonForExportEnum) | The reason the commodity is being exported. Valid values are |  |
|**customsDeclaredValue** | **BigDecimal** | Item value in mentioned currencyCode |  |
|**currencyCode** | **String** | The currency used for declared value. Use three uppercase letters, per ISO 4217 |  |
|**EELPFC** | **String** | A number provided by the Automated Export System (AES). This is required if the item is valued at more than $2,500 USD per Schedule B export codes. |  [optional] |
|**certificateNumber** | **String** | The certificate number associated with the commodity. |  [optional] |
|**comments** | **String** | Free-form comments regarding the exported shipment. |  [optional] |
|**fromCustomsReference** | **String** | Free-form reference information provided by the requestor of the shipment. Depending on the carrier this information may or may not be rendered on the customs documents. |  [optional] |
|**importerCustomsReference** | **String** | A reference number used by the importer, such as a VAT number, PO number, or insured number. |  [optional] |
|**invoiceNumber** | **String** | The commercial invoice number assigned by the exporter. |  [optional] |
|**licenseNumber** | **String** | The export license number associated with the commodity. |  [optional] |
|**sdrValue** | **BigDecimal** | When an international parcel is insured, the insured value must be expressed in Special Drawing Rights values |  [optional] |



## Enum: ReasonForExportEnum

| Name | Value |
|---- | -----|
| GIFT | &quot;GIFT&quot; |
| COMMERCIAL_SAMPLE | &quot;COMMERCIAL_SAMPLE&quot; |
| MERCHANDISE | &quot;MERCHANDISE&quot; |
| DOCUMENTS | &quot;DOCUMENTS&quot; |
| RETURNED_GOODS | &quot;RETURNED_GOODS&quot; |
| OTHER | &quot;OTHER&quot; |



