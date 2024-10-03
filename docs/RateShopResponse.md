

# RateShopResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**fromAddress** | [**RateShopResponseFromAddress**](RateShopResponseFromAddress.md) |  |  [optional] |
|**parcel** | [**RateShopResponseParcel**](RateShopResponseParcel.md) |  |  [optional] |
|**rates** | [**List&lt;RateShopResponseRatesInner&gt;**](RateShopResponseRatesInner.md) | It displays all available rates for each services |  [optional] |
|**toAddress** | [**RateShopResponseToAddress**](RateShopResponseToAddress.md) |  |  [optional] |
|**isHazmat** | **Boolean** | isHazmat if set to true,only services which support Hazardous material shipment would be visible in the response |  [optional] |
|**errors** | [**List&lt;RateShopResponseErrorsInner&gt;**](RateShopResponseErrorsInner.md) | It display any error while getting rates |  [optional] |



