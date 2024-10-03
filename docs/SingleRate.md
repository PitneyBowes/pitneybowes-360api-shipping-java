

# SingleRate


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**dateOfShipment** | **String** | This defines the date of the Shipment in the format YYYY:MM:DD, required for future shipment rating |  [optional] |
|**fromAddress** | [**SingleRateFromAddress**](SingleRateFromAddress.md) |  |  |
|**parcel** | [**SingleRateParcel**](SingleRateParcel.md) |  |  |
|**carrierAccounts** | **List&lt;String&gt;** |  This provides a single carrier account Id in case of single rate request. It can be referred from response of &#x60;Get Carrier Accounts&#x60; API. |  |
|**parcelType** | **String** | Parcel Type its value can be referred from response of &#x60;Get Parcel Types&#x60; API. |  |
|**parcelId** | **String** | &gt;-Parcel Id is optional and required to be given in case of branded parcels which have brandedDimension and/or brandedWeight. If parcel has brandedDimension, in that case user need not to pass dimensionUnit and dimension details(length, width and height) in the parcel object. And if brandedWeight is also available for the parcel then in that case weightUnit and weight need not to be passed  in parcel object   |  [optional] |
|**serviceId** | **String** | Service to be used for rating, it can be referred from response of &#x60;Get Services&#x60; API |  |
|**specialServices** | [**List&lt;SpecialService&gt;**](SpecialService.md) | Special services to be used for rating, it can be referred from response of &#x60;Get Special Services&#x60; API |  [optional] |
|**toAddress** | [**SingleRateToAddress**](SingleRateToAddress.md) |  |  |



