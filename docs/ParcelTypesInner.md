

# ParcelTypesInner


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**brandedName** | **String** | The branded name of parcel type |  [optional] |
|**carrier** | **String** | A unique identifier associated with the specific carrier. |  [optional] |
|**dimensionRules** | [**List&lt;ParcelTypesInnerDimensionRulesInner&gt;**](ParcelTypesInnerDimensionRulesInner.md) | This defines the maximum and minimum dimension supported for given parcel type. |  [optional] |
|**groupName** | **String** |  |  [optional] |
|**brandedDimensions** | [**ParcelTypesInnerBrandedDimensions**](ParcelTypesInnerBrandedDimensions.md) |  |  [optional] |
|**parcelId** | **String** | A unique identifier associated with the Parcel type. |  [optional] |
|**isBranded** | **Boolean** | If the Parcel is Branded. If yees, it will take &#x60;true&#x60;, else will take &#x60;false&#x60;. |  [optional] |
|**parcelType** | **String** | This defines the type of Parcel. |  [optional] |
|**serviceId** | **String** | A unique identifier associated with the carrier based service. |  [optional] |
|**serviceName** | **String** | Name of the Carrier Service. |  [optional] |
|**suggestedTrackableSpecialserviceId** | **String** | This defines the parcel has feature to track special serviceID. |  [optional] |
|**weightRules** | [**List&lt;ParcelTypesInnerWeightRulesInner&gt;**](ParcelTypesInnerWeightRulesInner.md) | This defines the maximum and minimum weight supported for given parcel type. |  [optional] |



