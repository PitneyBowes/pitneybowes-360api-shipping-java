

# ReturnLabelResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**fromAddress** | [**ReturnLabelFromAddress**](ReturnLabelFromAddress.md) |  |  [optional] |
|**parcel** | [**ShipmentDomesticParcel**](ShipmentDomesticParcel.md) |  |  [optional] |
|**correlationId** | **String** | correction id |  [optional] |
|**serviceId** | **String** | &gt;-A unique identifier given to the carrier-specific service. This is required for creating a shipment, while it is optional for rating a parcel. |  [optional] |
|**parcelTrackingNumber** | **String** | &gt;-A unique identifier parcel tracking number |  [optional] |
|**shipmentId** | **String** | &gt;-A unique identifier shipment tracking number |  [optional] |
|**shipmentOptions** | [**ShipmentOptionsV2**](ShipmentOptionsV2.md) |  |  [optional] |
|**labelLayout** | [**List&lt;ReturnLabelResponseLabelLayoutInner&gt;**](ReturnLabelResponseLabelLayoutInner.md) | labelLayout details |  [optional] |
|**toAddress** | [**ReturnLabelResponseToAddress**](ReturnLabelResponseToAddress.md) |  |  [optional] |
|**rate** | [**ReturnLabelResponseRate**](ReturnLabelResponseRate.md) |  |  [optional] |



