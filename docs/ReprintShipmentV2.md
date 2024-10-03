

# ReprintShipmentV2


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**shipmentId** | **String** | The shipmentId, a unique identifier for an individual Shipment, which is used for Reprint or Cancel. |  [optional] |
|**parcelTrackingNumber** | **String** | The Tracking number given to the Parcel for tracking purpose. |  [optional] |
|**labelLayout** | [**List&lt;ReprintShipmentV2LabelLayoutInner&gt;**](ReprintShipmentV2LabelLayoutInner.md) | It defines the layout of the shipping label. |  [optional] |
|**parcel** | [**ParcelV2**](ParcelV2.md) |  |  [optional] |
|**rate** | [**RateResponseV2**](RateResponseV2.md) |  |  [optional] |
|**references** | [**CancelShipmentV2References**](CancelShipmentV2References.md) |  |  [optional] |
|**printStatus** | **String** | Status of the Printed Label. |  [optional] |



