

# Address


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**addressLine1** | **String** | The addressLine1 can contain the Flat number, Building or Apartment Name/number (if any) or company name (if not residential). |  |
|**addressLine2** | **String** | The addressLine2 contains Street address or Landmark (if any). |  [optional] |
|**addressLine3** | **String** | The addressLine3 contains P.O.Box (if any) near the address. |  [optional] |
|**cityTown** | **String** |  This indicates the city or town in the Address. |  [optional] |
|**company** | **String** |  This indicates the name of the company. |  [optional] |
|**countryCode** | **String** | This indicates the two-character ISO code of the country. |  |
|**email** | **String** | The email address of the Recipient or Department where the delivery address is pointed to. |  [optional] |
|**name** | **String** | The first and last name of the Recipient or Department. |  [optional] |
|**phone** | **String** | &gt;-The phone number. Enter the digits with or without spaces or hyphens. When used for Pickups, the maximum is 10 digits. |  [optional] |
|**postalCode** | **String** | The postal code or ZIP code of the Address. |  |
|**residential** | **Boolean** | &gt;-Indicates whether this is a residential address. Pitney Bowes recommends including this parameter to improve address verification. |  [optional] |
|**stateProvince** | **String** | &gt;-The state or province. For a US or Canadian address, use the 2-letter state or province code. |  |
|**status** | [**StatusEnum**](#StatusEnum) | &gt;- This field applies to the Validate Address and Suggest Addresses APIs. The field indicates whether the submitted address is valid and whether the API made changes to the address. Possible values are: &#x60;VALIDATED_CHANGED&#x60;: The address is valid, but the API made changes to improve the address. For example, if an address has a valid street number and street name (e.g. “100 Elm”) but is missing the street suffix (e.g. “St”), the API would add the suffix. &#x60;VALIDATED_AND_NOT_CHANGED&#x60;: The address is valid. The API made no changes. |  [optional] |
|**taxId** | **String** | &gt;-Tax identification number (TIN) or Employer Identification number (EIN) or GST or VAT number or RFC or EORI. |  [optional] |
|**taxIdType** | [**TaxIdTypeEnum**](#TaxIdTypeEnum) | &gt;-Tax identification Type, valid values are EIN or GST or VAT or RFC or EORI. |  [optional] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| CHANGED | &quot;VALIDATED_CHANGED&quot; |
| AND_NOT_CHANGED | &quot;VALIDATED_AND_NOT_CHANGED&quot; |



## Enum: TaxIdTypeEnum

| Name | Value |
|---- | -----|
| EIN | &quot;EIN&quot; |
| GST | &quot;GST&quot; |
| VAT | &quot;VAT&quot; |
| EORI | &quot;EORI&quot; |



