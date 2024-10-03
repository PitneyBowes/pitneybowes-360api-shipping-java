

# ReprintShipmentToAddress


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**addressLine1** | **String** | The addressLine1 can contain the Flat number, Building or Apartment Name/number (if any) or company name (if not residential). |  [optional] |
|**addressLine2** | **String** | The addressLine2 contains Street address or Landmark (if any). |  [optional] |
|**addressLine3** | **String** | The addressLine3 contains P.O.Box (if any) near the address. |  [optional] |
|**cityTown** | **String** | The name of the city or town to where the address belongs. |  [optional] |
|**company** | **String** | This indicates the name of the company, in case if the Recipient address is not residential. |  [optional] |
|**countryCode** | **String** | This indicates the two-character ISO code of the destination country from the ISO country list. |  [optional] |
|**email** | **String** | The email address of the recipient. It can be person&#39;s email address or company email address (for non-residential). |  [optional] |
|**name** | **String** | Name of the recipient to which this address points. |  [optional] |
|**phone** | **String** | This is recipient&#39;s phone number. Enter the digits with or without spaces or hyphens. The maximum characters for Phone number is 10 digits.  |  [optional] |
|**postalCode** | **String** | The postal code or ZIP code of the address. For US addresses, use either the 5-digit or 9-digit ZIP code in one of the following formats: &#39;12345&#39; or &#39;12345-6789&#39;. If you use a different format, such as 12345- or 123451234, will receive an error. |  [optional] |
|**residential** | **Boolean** | The specified adress can be Residential or Official. In case if the adress is Residential, the boolean value will be &#39;true&#39;, else it will take &#39;false&#39;. |  [optional] |
|**stateProvince** | **String** | The State or Province of the address. For a US or Canadian address, it is the 2-letter state or province code.  |  [optional] |



