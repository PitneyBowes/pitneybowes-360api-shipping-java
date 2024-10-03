

# InternationalShipmentResponseCustomsCustomsInfo


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**EELPFC** | **String** | A number provided by the Automated Export System (AES). This is required if the item is valued at more than $2,500 USD per Schedule B export codes. |  [optional] |
|**certificateNumber** | **String** | The certificate number associated with the commodity. |  [optional] |
|**comments** | **String** | Free-form comments regarding the exported shipment. |  [optional] |
|**currencyCode** | **String** | The currency used for declared value. Use three uppercase letters, per ISO 4217. |  [optional] |
|**fromCustomsReference** | **String** | Free-form reference information provided by the requestor of the shipment. Depending on the carrier this information may or may not be rendered on the customs documents. |  [optional] |
|**importerCustomsReference** | **String** | A reference number used by the importer, such as a VAT number, PO number, or insured number. |  [optional] |
|**invoiceNumber** | **String** | The commercial invoice number assigned by the exporter. It is rquired for DHL Express. |  [optional] |
|**licenseNumber** | **String** | The export license number associated with the commodity. |  [optional] |
|**reasonForExport** | **String** | The reason the commodity is being exported. |  [optional] |
|**sdrValue** | **BigDecimal** | When an international parcel is insured, the insured value must be expressed in Special Drawing Rights values. |  [optional] |
|**termsOfSale** | [**TermsOfSaleEnum**](#TermsOfSaleEnum) | Three-digit codes describing Terms of sale required for DHL Express shipments. Terms of sale is some sort of agreement between a buyer and seller which serves the purpose of creating uniform expectations between them. Possible values are- CFR (description- Cost and Freight), CIF (description- Cost, Insurance and Freight), CIP (description- Carriage and Insurance Paid To), DAF (description- Delivered at Frontier), DAP (description- Delivered At Place), DAT (description- Delivered At Terminal), DDP (description- Delivered Duty Paid), DDU (description- Delivered Duty Unpaid), DEQ (description- Delivery ex Quay), DES (description- Delivered ex Ship), DPU (description- Delivered At Place Unloaded), EXW (description- Ex Works), FAS (description- FAS Free Alongside Ship), FCA (description- Free Carrier), FOB (description- FOB Free On Board) |  [optional] |
|**recipientTaxType** | [**RecipientTaxTypeEnum**](#RecipientTaxTypeEnum) | The tax type to choose for recipient. |  [optional] |
|**recipientTaxID** | **String** | The respective taxID for the taxType chosen |  [optional] |
|**senderTaxType** | [**SenderTaxTypeEnum**](#SenderTaxTypeEnum) | The tax type to choose for recipient. |  [optional] |
|**senderTaxID** | **String** | The respective taxID for the taxType chosen |  [optional] |



## Enum: TermsOfSaleEnum

| Name | Value |
|---- | -----|
| CFR | &quot;CFR&quot; |
| CIF | &quot;CIF&quot; |
| CIP | &quot;CIP&quot; |
| CPT | &quot;CPT&quot; |
| DAF | &quot;DAF&quot; |
| DAP | &quot;DAP&quot; |
| DAT | &quot;DAT&quot; |
| DDP | &quot;DDP&quot; |
| DDU | &quot;DDU&quot; |
| DEQ | &quot;DEQ&quot; |
| DES | &quot;DES&quot; |
| DPU | &quot;DPU&quot; |
| EXW | &quot;EXW&quot; |
| FAS | &quot;FAS&quot; |
| FCA | &quot;FCA&quot; |
| FOB | &quot;FOB&quot; |



## Enum: RecipientTaxTypeEnum

| Name | Value |
|---- | -----|
| EIN | &quot;EIN&quot; |
| GST | &quot;GST&quot; |
| RFC | &quot;RFC&quot; |
| VAT | &quot;VAT&quot; |



## Enum: SenderTaxTypeEnum

| Name | Value |
|---- | -----|
| EIN | &quot;EIN&quot; |
| GST | &quot;GST&quot; |
| RFC | &quot;RFC&quot; |
| VAT | &quot;VAT&quot; |



