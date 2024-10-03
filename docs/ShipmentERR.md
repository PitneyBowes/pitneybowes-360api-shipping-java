

# ShipmentERR


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**externalId** | **String** | This is a user-defined value provided by users just for their reference. This is for mapping purpose against each shipment. |  [optional] |
|**fromAddress** | [**FromAddress**](FromAddress.md) |  |  |
|**toAddress** | [**ToAddress**](ToAddress.md) |  |  |
|**parcel** | [**Parcel**](Parcel.md) |  |  |
|**carrierAccountId** | **String** | A unique identifier associated with the Carrier account used by client users during shipment process. |  [optional] |
|**parcelType** | **String** | &gt;-Packaging type varies as per selected carrier and its services, e.g., PKG, LGENV. |  [optional] |
|**serviceId** | **String** | &gt;-The unique identifier given to the carrier-specific service. ERR supports two services: First Class Mail (FCM) and Priority Mail (PM). |  [optional] |
|**dateOfShipment** | **String** | Indicates the date when shipment is created. |  [optional] |
|**specialServices** | [**List&lt;SpecialServiceERRInner&gt;**](SpecialServiceERRInner.md) |  |  [optional] |
|**shipmentOptions** | [**ShipmentOptionsERR**](ShipmentOptionsERR.md) |  |  [optional] |
|**metadata** | [**List&lt;ShipmentERRMetadataInner&gt;**](ShipmentERRMetadataInner.md) | Additional metadata that needs to be stored for this shipment can be added here. For now, &#x60;costAccountName&#x60; is supported. |  [optional] |



