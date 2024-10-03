

# DomesticShipmentResponseV2


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**correlationId** | **String** | Key assigned by the shipping system to the transaction. |  [optional] |
|**shipmentId** | **String** | The shipmentId, a unique identifier for an individual Shipment. |  [optional] |
|**parcelTrackingNumber** | **String** | The Tracking number given to the Parcel for tracking purpose. |  [optional] |
|**labelLayout** | [**List&lt;DomesticShipmentResponseV2LabelLayoutInner&gt;**](DomesticShipmentResponseV2LabelLayoutInner.md) | It defines the layout of the shipping label. |  [optional] |
|**parcel** | [**ParcelV2**](ParcelV2.md) |  |  [optional] |
|**rate** | [**RateResponseV2**](RateResponseV2.md) |  |  [optional] |
|**references** | [**ReferenceV2**](ReferenceV2.md) |  |  [optional] |
|**printStatus** | **String** | Status of the Printed Label. |  [optional] |
|**printError** | [**DomesticShipmentResponseV2PrintError**](DomesticShipmentResponseV2PrintError.md) |  |  [optional] |
|**fromAddress** | [**FromAddressV2Response**](FromAddressV2Response.md) |  |  [optional] |
|**toAddress** | [**ToAddressV2Response**](ToAddressV2Response.md) |  |  [optional] |
|**shipmentOptions** | [**ShipmentOptions**](ShipmentOptions.md) |  |  [optional] |



