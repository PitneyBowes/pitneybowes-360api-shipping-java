

# GetSingleShipment


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**correlationId** | **String** | This is a GUID (globally unique identifier) that&#39;s automatically generated for every request that the webserver receives. |  [optional] |
|**fromAddress** | [**GetSingleShipmentFromAddress**](GetSingleShipmentFromAddress.md) |  |  [optional] |
|**parcel** | [**ShipmentDomesticParcel**](ShipmentDomesticParcel.md) |  |  [optional] |
|**metadata** | [**List&lt;GetAllShipmentsDataInnerMetadataInner&gt;**](GetAllShipmentsDataInnerMetadataInner.md) | Additional metadata that needs to be stored for this shipment can be added here. For now, &#x60;costAccountName&#x60; is supported. |  [optional] |
|**parcelTrackingNumber** | **String** | The Tracking number given to the Parcel for tracking purpose. |  [optional] |
|**rate** | [**GetSingleShipmentRate**](GetSingleShipmentRate.md) |  |  [optional] |
|**service** | **String** | This indicates the carrier based service that is used for shipment. |  [optional] |
|**shipmentId** | **String** | A unique identifier associated with Shipment ID. |  [optional] |
|**status** | **String** | The status of the Shipment. |  [optional] |
|**toAddress** | [**GetSingleShipmentToAddress**](GetSingleShipmentToAddress.md) |  |  [optional] |



