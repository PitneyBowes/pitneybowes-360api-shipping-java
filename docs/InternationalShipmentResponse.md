

# InternationalShipmentResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**correlationId** | **String** | This is a GUID (globally unique identifier) that&#39;s automatically generated for every request that the webserver receives. |  [optional] |
|**labelLayout** | [**List&lt;DomesticShipmentResponseLabelLayoutInner&gt;**](DomesticShipmentResponseLabelLayoutInner.md) | This indicates the label layout and generated label details |  [optional] |
|**fromAddress** | [**ReprintShipmentFromAddress**](ReprintShipmentFromAddress.md) |  |  [optional] |
|**parcel** | [**ShipmentDomesticParcel**](ShipmentDomesticParcel.md) |  |  [optional] |
|**parcelId** | **String** | &gt;-Parcel Id is optional and would be visible in case when is present in the request. |  [optional] |
|**parcelTrackingNumber** | **String** | The Tracking number given to the Parcel for tracking purpose. |  [optional] |
|**rate** | [**InternationalShipmentResponseRate**](InternationalShipmentResponseRate.md) |  |  [optional] |
|**shipmentId** | **String** | A unique identifier associated with the Shipment. |  [optional] |
|**shipmentOptions** | [**ShipmentOptions**](ShipmentOptions.md) |  |  [optional] |
|**toAddress** | [**ReprintShipmentToAddress**](ReprintShipmentToAddress.md) |  |  [optional] |
|**customs** | [**InternationalShipmentResponseCustoms**](InternationalShipmentResponseCustoms.md) |  |  [optional] |



