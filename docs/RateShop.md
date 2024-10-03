

# RateShop


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**dateOfShipment** | **String** | This defines the date of the Shipment in the format YYYY:MM:DD.,required for future shipment rating |  [optional] |
|**fromAddress** | [**RateShopFromAddress**](RateShopFromAddress.md) |  |  |
|**parcel** | [**RateShopParcel**](RateShopParcel.md) |  |  |
|**carrierAccounts** | **List&lt;String&gt;** | This provide one or more carrier accounts Ids for rate shop. It can be referred from &#x60;Get Carrier Accounts&#x60; API |  [optional] |
|**parcelType** | **String** | Parcel Type required for rating, it&#39;s value can be referred from response of &#x60;Get Parcel Types&#x60; API |  [optional] |
|**parcelId** | **String** | &gt;-Parcel Id is optional and required to be given in case of branded parcels which have brandedDimension and/or brandedWeight. If parcel has brandedDimension, in that case user need not to pass dimensionUnit and dimension details(length, width and height) in the parcel object. And if brandedWeight is also available for the parcel then in that case weightUnit and weight need not to be passed  in parcel object |  [optional] |
|**toAddress** | [**SingleRateToAddress**](SingleRateToAddress.md) |  |  |
|**isHazmat** | **Boolean** | isHazmat if set to true,only services which support Hazardous material shipment would be visible in the response |  [optional] |



