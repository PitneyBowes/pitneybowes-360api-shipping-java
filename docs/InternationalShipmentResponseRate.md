

# InternationalShipmentResponseRate


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**baseCharge** | **BigDecimal** | The base service charge is payable to the carrier, excluding special service charges. |  [optional] |
|**carrier** | **String** | Carrier is a service used to transport the parcels or couriers from one place to another. |  [optional] |
|**currencyCode** | **String** | A three-character (all uppercase letter) symbol of a currency according to the international ISO standard. As a rule, the first two letters denote the name of the country, and the third letter, the name of the currency thereof.For example, for US - the currency is Dollars and code is USD. Similarly for Canada, the currencycode is CAD, and for India, it is INR.  |  [optional] |
|**parcelType** | **String** | Parcel Type is required for creating a shipment while rating a parcel, which varies as per Carrier selection. ParcelType have categories like Package, Envelopes, Paks, Boxes, Tube, etc.  |  [optional] |
|**rateTypeId** | **String** | Its value can be CONTRACT_RATES, COMMERCIAL or COMMERCIAL_BASE for USPS and COMMERCIAL for other carriers depending on the Pitney Bowes contract/subscription |  [optional] |
|**serviceId** | **String** | The unique identifier given to the carrier specific service. |  [optional] |
|**specialServices** | [**List&lt;InternationalShipmentResponseRateSpecialServicesInner&gt;**](InternationalShipmentResponseRateSpecialServicesInner.md) |  This provides a carrier-service based special or extra sevice. |  [optional] |
|**totalCarrierCharge** | **BigDecimal** | The total amount payable to the carrier, including special service fees, surcharges, and any international taxes and duties, except as noted below: |  [optional] |



