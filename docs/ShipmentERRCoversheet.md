

# ShipmentERRCoversheet


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**externalId** | **String** | This is a user-defined value provided by users just for their reference. This is for mapping purpose against each shipment. |  [optional] |
|**fromAddress** | [**FromAddress**](FromAddress.md) |  |  |
|**toAddress** | [**ToAddress**](ToAddress.md) |  |  |
|**parcel** | [**Parcel**](Parcel.md) |  |  |
|**carrierAccountId** | **String** | A unique identifier associated with the user&#39;s registered USPS account which is used by client users while shipment process. |  [optional] |
|**parcelType** | **String** | &gt;-Packaging type varies as per USPS selected services, e.g., LTR, LGENV. |  [optional] |
|**serviceId** | **String** | &gt;-A unique identifier given to the carrier-specific service. ERR supports two services: First Class Mail (FCM) and Priority Mail (PM). |  [optional] |
|**dateOfShipment** | **String** | The date when shipment gets created. |  [optional] |
|**specialServices** | [**List&lt;SpecialServiceERRInner&gt;**](SpecialServiceERRInner.md) |  |  [optional] |
|**shipmentOptions** | [**ShipmentOptionsERR**](ShipmentOptionsERR.md) |  |  [optional] |
|**metadata** | [**List&lt;ShipmentERRCoversheetMetadataInner&gt;**](ShipmentERRCoversheetMetadataInner.md) | Additional metadata that needs to be stored for this shipment, can be added here. For now, &#x60;costAccountName&#x60; is supported. |  [optional] |



