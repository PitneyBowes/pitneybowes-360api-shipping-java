

# GetAllPickupsDataInnerPickupOptions

It is used to provide any pickup options while scheduling pickups

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**pickupStartDateTime** | **String** | It specifies the earliest date and time that your parcels will be available for pickup (UTC time) |  [optional] |
|**pickupEndDateTime** | **String** | It specifies the latest date and time that your parcels will be available for pickup (UTC time) |  [optional] |
|**overweight** | **BigDecimal** | It specifies the count of packages which are overwight (weight&gt; 70 lbs) |  [optional] |
|**carrierType** | **String** | It specifies the type of pickup service - &#x60;Ground&#x60; or &#x60;Express&#x60;. Choose &#x60;Ground&#x60; to schedule pickup for next business day or up to two weeks later for Ground packages only (i.e. GRD,HOM,STD,SP_MEDIA,SP_PRCLSEL,SP_PRE_PRINT,SP_PRE_STD,SP_RETURNS). Choose &#x60;Express&#x60; to schedule pickup a same day or a next day pickup for express packages only (i.e. NDA_AM,NDA,NDA_SVR,NDA_AM_EH,NDA_EH,NDA_SVR_EH,2DA_AM,2DA,3DA,XPP,EXP,EXP_X,EXP_CP,XPD). |  [optional] |



