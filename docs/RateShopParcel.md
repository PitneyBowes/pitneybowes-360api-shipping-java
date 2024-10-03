

# RateShopParcel

It provides Parcel dimension, weight and respective unit of measurement details

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**height** | **BigDecimal** | Height is a part of Dimension objet where it helps determine a parcel’s girth. |  |
|**length** | **BigDecimal** | Length is a part of Dimension objet having highest numeric value out of three required parameters (length, width, and height) of Dimension. It helps determine a parcel’s girth. |  |
|**width** | **BigDecimal** | Width is a part of Dimension object having lowest numeric value out of three required parameters of dimension (length, width, and height). This helps determine a parcel’s girth. |  |
|**dimUnit** | [**DimUnitEnum**](#DimUnitEnum) | DimUnit is a standard for measuring the physical quantities of specified dimension parameters. |  |
|**weightUnit** | [**WeightUnitEnum**](#WeightUnitEnum) | WeightUnit is a standard for measuring the physical quantities of specified weight. |  |
|**weight** | **BigDecimal** | Weight is the measure of how heavy an object is. |  |



## Enum: DimUnitEnum

| Name | Value |
|---- | -----|
| IN | &quot;IN&quot; |



## Enum: WeightUnitEnum

| Name | Value |
|---- | -----|
| OZ | &quot;OZ&quot; |



