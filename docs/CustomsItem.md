

# CustomsItem


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**description** | **String** | A detailed description of the commodity. |  |
|**hSTariffCode** | **String** | &gt;- The destination country&#39;s tariff-classification number for the commodity. Most countries use the six-digit Harmonized System (HS) as the basis for their tariff classifications and add additional digits for more detail. The maximum length is 14 characters.If you are issuing the HS Code API, you can use this field to help with the HS code prediction by entering the commodity&#39;s HS code from another country, such as from the origin country. Enter the country that the code comes from in the hSTariffCodeCountry field. |  [optional] |
|**quantity** | **Integer** | Enter the total number of items of this type of commodity. |  |
|**unitPrice** | **Double** | &gt;- The price of one item of this type of commodity. Currency should be declared under customsInfo. |  |
|**weightUnit** | [**WeightUnitEnum**](#WeightUnitEnum) | The unit of measurement. This field is required by the unitWeight object. |  |
|**weight** | **BigDecimal** | The weight of the item. |  |



## Enum: WeightUnitEnum

| Name | Value |
|---- | -----|
| OZ | &quot;OZ&quot; |



