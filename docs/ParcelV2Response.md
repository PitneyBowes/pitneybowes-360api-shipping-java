

# ParcelV2Response

The details of the Parcel.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**length** | **BigDecimal** | Length is always the greatest of the three dimensions. The other two dimensions are used in the calculation of the girth. |  [optional] |
|**width** | **BigDecimal** | There is no strict rule as to which element is the width or the height, but the width is the second greatest dimension of a parcel by convention. |  [optional] |
|**height** | **BigDecimal** | By convention, the height is the smallest dimension of the parcel. |  [optional] |
|**dimUnit** | **String** | DimUnit is a standard for measuring the physical quantities of specified dimension parameters. |  [optional] |
|**weightUnit** | **String** | WeightUnit is a standard for measuring the physical quantities of specified weight. &lt;br /&gt; For USPS shipments, this is OZ. |  |
|**weight** | **BigDecimal** | Weight measures the heaviness of an object (how heavy an object is) . |  [optional] |
|**packageValue** | **BigDecimal** | Indicates value of the package. |  [optional] |



