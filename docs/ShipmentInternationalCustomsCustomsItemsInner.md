

# ShipmentInternationalCustomsCustomsItemsInner


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**description** | **String** | A detailed description of the commodity, up to 255 characters. The description will appear on the customs form. If the shipment has multiple types of items, create a separate customsItems object for each. Each description will appear on the form. |  |
|**hSTariffCode** | **String** | The destination country’s tariff-classification number (HS code) for the commodity. Most countries use the six-digit Harmonized System (HS) as the basis for their tariff classifications and then add digits for more detail. The maximum length for an HS code is 14 characters. The HS code will appear on the customs form. If the shipment has multiple types of items, create a separate customsItems object for each. |  [optional] |
|**originCountryCode** | **String** | The two-character ISO country code of the shipment’s origin country. Use ISO 3166-1 alpha-2 standard values. |  [optional] |
|**quantity** | **BigDecimal** | Enter the total number of items of this type of commodity. |  |
|**unitPrice** | **BigDecimal** | The price of one item of this type of commodity. |  |
|**weightUnit** | [**WeightUnitEnum**](#WeightUnitEnum) | The unit of measurement. This field is required by the unitWeight object. |  [optional] |
|**weight** | **BigDecimal** | The weight of the item. |  [optional] |



## Enum: WeightUnitEnum

| Name | Value |
|---- | -----|
| OZ | &quot;OZ&quot; |



