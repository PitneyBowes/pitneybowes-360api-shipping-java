

# SingleRateResponseRatesInner


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**baseCharge** | **BigDecimal** | The base service charge is payable to the carrier, excluding special service charges. |  [optional] |
|**carrier** | **String** | Carrier is a service used to transport the parcels or couriers from one place to another. |  [optional] |
|**carrierAccount** | **String** | Carrier Account is the account associated to specific carrier service. |  [optional] |
|**deliveryCommitment** | [**RateShopResponseRatesInnerDeliveryCommitment**](RateShopResponseRatesInnerDeliveryCommitment.md) |  |  [optional] |
|**parcelType** | **String** | Parcel Type is required for creating a shipment while rating a parcel, which varies as per Carrier selection. ParcelType have categories like Package, Envelopes, Paks, Boxes, Tube, etc.  |  [optional] |
|**parcelId** | **String** | It indicates parcelId chosen in the request if was provided |  [optional] |
|**rateTypeId** | **String** | Its value can be CONTRACT_RATES, COMMERCIAL or COMMERCIAL_BASE for USPS and COMMERCIAL for other carriers depending on the Pitney Bowes contract/subscription |  [optional] |
|**serviceId** | **String** | The unique identifier given to the carrier specific service. |  [optional] |
|**specialServices** | [**List&lt;SingleRateResponseRatesInnerSpecialServicesInner&gt;**](SingleRateResponseRatesInnerSpecialServicesInner.md) |  This provides a carrier-service based special or extra sevice. |  [optional] |
|**totalCarrierCharge** | **BigDecimal** | The total amount payable to the carrier, including special service fees, surcharges, and any international taxes and duties. |  [optional] |
|**isHazmat** | **Boolean** | It indicated if isHazmat is supported by the service |  [optional] |



