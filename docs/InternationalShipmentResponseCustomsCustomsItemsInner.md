

# InternationalShipmentResponseCustomsCustomsItemsInner


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**description** | **String** | A detailed description of the commodity, up to 255 characters. The description will appear on the customs form. If the shipment has multiple types of items, create a separate customsItems object for each. Each description will appear on the form. |  [optional] |
|**hSTariffCode** | **String** | The destination country’s tariff-classification number (HS code) for the commodity. Most countries use the six-digit Harmonized System (HS) as the basis for their tariff classifications and then add digits for more detail. The maximum length for an HS code is 14 characters. The HS code will appear on the customs form. If the shipment has multiple types of items, create a separate customsItems object for each. |  [optional] |
|**originCountryCode** | **String** | The two-character ISO country code of the shipment’s origin country. Use ISO 3166-1 alpha-2 standard values. |  [optional] |
|**quantity** | **BigDecimal** | Enter the total number of items of this type of commodity. |  [optional] |
|**unitPrice** | **BigDecimal** | The price of one item of this type of commodity. |  [optional] |
|**weightUnit** | **String** | WeightUnit is a standard for measuring the physical quantities of specified weight. &lt;br&gt; The valid values are:  &lt;br&gt;- OZ: Ounces &lt;br&gt;- GM: Grams &lt;br&gt;- LB: Pounds &lt;br&gt;- KG: Kilograms For USPS shipments, set this to OZ. |  [optional] |
|**weight** | **BigDecimal** | Weight is the measure of how heavy an object is. |  [optional] |



