

# Parcel

The details of the Parcel.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**length** | **Float** | Length is always the greatest of the three dimensions. The other two dimensions are used in the calculation of the girth. |  [optional] |
|**width** | **Float** | There is no strict rule as to which element is the width or the height, but the width is the second greatest dimension of a parcel by convention. |  [optional] |
|**height** | **Float** | By convention the height is the smallest dimension of the parcel. |  [optional] |
|**dimUnit** | [**DimUnitEnum**](#DimUnitEnum) | DimUnit is a standard for measuring the physical quantities of specified dimension parameters.&lt;br /&gt; The valid values are: Inch and Centimeter. |  [optional] |
|**weightUnit** | [**WeightUnitEnum**](#WeightUnitEnum) | WeightUnit is a standard for measuring the physical quantities of specified weight.&lt;br /&gt; The valid values are: Ounces and Grams.&lt;br /&gt; For USPS shipments, set this to OZ. |  |
|**weight** | **Float** | Weight measures the heaviness of an object (how heavy an object is) . |  [optional] |



## Enum: DimUnitEnum

| Name | Value |
|---- | -----|
| IN | &quot;IN&quot; |
| CM | &quot;CM&quot; |



## Enum: WeightUnitEnum

| Name | Value |
|---- | -----|
| OZ | &quot;OZ&quot; |
| GM | &quot;GM&quot; |



