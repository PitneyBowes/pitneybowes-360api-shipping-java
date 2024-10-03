

# GetAllShipmentsDataInner


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**correlationId** | **String** | This is a GUID (globally unique identifier) that&#39;s automatically generated for every request that the webserver receives. |  [optional] |
|**fromAddress** | [**GetAllShipmentsDataInnerFromAddress**](GetAllShipmentsDataInnerFromAddress.md) |  |  [optional] |
|**parcel** | [**GetAllShipmentsDataInnerParcel**](GetAllShipmentsDataInnerParcel.md) |  |  [optional] |
|**metadata** | [**List&lt;GetAllShipmentsDataInnerMetadataInner&gt;**](GetAllShipmentsDataInnerMetadataInner.md) | Additional metadata that needs to be stored for this shipment can be added here. For now, &#x60;costAccountName&#x60; is supported. |  [optional] |
|**parcelTrackingNumber** | **String** | The Tracking number given to the Parcel for tracking purpose. |  [optional] |
|**rate** | [**GetAllShipmentsDataInnerRate**](GetAllShipmentsDataInnerRate.md) |  |  [optional] |
|**service** | **String** |  |  [optional] |
|**shipmentId** | **String** | A unique identifier associated with the Shipment. |  [optional] |
|**status** | **String** |  |  [optional] |
|**toAddress** | [**GetAllShipmentsDataInnerToAddress**](GetAllShipmentsDataInnerToAddress.md) |  |  [optional] |



