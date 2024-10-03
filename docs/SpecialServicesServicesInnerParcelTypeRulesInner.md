

# SpecialServicesServicesInnerParcelTypeRulesInner


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**brandedName** | **String** | The branded name of Parcel Type |  [optional] |
|**parcelType** | **String** | Parcel Type is required for creating a shipment while rating a parcel, which varies as per Carrier selection. Here, it reflects as per the defined ParcelType Rules. ParcelType have categories like Package, Envelopes, Paks, Boxes, Tube, etc.  |  [optional] |
|**trackable** | **String** | Whether this parcel type is trackable. Valid Values are: TRACKABLE, NON_TRACKABLE, REQUIRES_TRACKABLE_SPECIAL_SERVICE |  [optional] |
|**suggestedTrackableSpecialService** | **String** | If trackable is set to REQUIRES_TRACKABLE_SPECIAL_SERVICE, this is a free or low-cost special service that allows the shipper to track the shipment. |  [optional] |
|**specialServiceRules** | [**List&lt;SpecialServicesServicesInnerParcelTypeRulesInnerSpecialServiceRulesInner&gt;**](SpecialServicesServicesInnerParcelTypeRulesInnerSpecialServiceRulesInner.md) | It displays all the available special services, their details and prerequisites and/or incompatible details with other special services |  [optional] |



