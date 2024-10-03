

# CustomsInfo


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**reasonForExport** | **String** | &gt;-The reason the commodity is being exported. Valid values are: Valid Values : [GIFT COMMERCIAL_SAMPLE MERCHANDISE DOCUMENTS RETURNED_GOODS OTHER SOLD NOT_SOLD] |  [optional] |
|**currencyCode** | **String** | &gt;-The type of currency used for the monetary values in this API request. Use three uppercase letters, per ISO 4217. For example, use USD for US Dollars, CAD for Canadian Dollars, and EUR for Euros. |  |
|**EELPFC** | **String** | &gt;- A number provided by the Automated Export System (AES). This field is required if the item is valued at more than $2,500 USD per Schedule B export codes. |  [optional] |
|**certificateNumber** | **String** | The certificate number associated with the commodity. |  [optional] |
|**comments** | **String** | &gt;-Free form comments regarding the exported shipment entered by the shipper. |  [optional] |
|**fromCustomsReference** | **String** | &gt;-Free form reference information provided by the requestor of the shipment. Depending on the carrier this information may or may not be rendered on the customs documents. |  [optional] |
|**importerCustomsReference** | **String** | &gt;- A reference number used by the importer, such as a VAT number, PO number, or insured number. &#x60;Shipments to the EU&#x60; : Merchants shipping to the European Union (EU) from outside the EU must provide a VAT or IOSS number. Enter the number in this field and specify the reference type in the importerCustomsReferenceType field. |  [optional] |
|**invoiceNumber** | **String** | The commercial invoice number assigned by the exporter. It is rquired for DHL Express |  [optional] |
|**licenseNumber** | **String** | The export license number associated with the commodity. |  [optional] |
|**declarationStatement** | **String** | This is declaration statement from the Shipper for the items being shipped. |  [optional] |
|**importerCustomsReferenceType** | **String** | &gt;-A reference type used by the importer to determine the type of importerCustomsReference. Valid Values are TAX_CODE, IMPORTER_CODE, VAT_NUMBER, IOSS_NUMBER. |  [optional] |
|**insuredAmount** | **Double** | Enter the insurance fee, if applicable. |  [optional] |
|**insuredNumber** | **String** | &gt;- If the sender wishes to insure the contents, they complete an insurance receipt and affix the insured numbered label to the package. The insured number label is what this field represents. |  [optional] |
|**sdrValue** | **Double** | &gt;-When an international parcel is insured, the insured value must be expressed in Special Drawing Rights values. E.g. $100 USD &#x3D; 66.87 SDR. |  [optional] |
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



