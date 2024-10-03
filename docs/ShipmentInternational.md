

# ShipmentInternational


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**fromAddress** | [**ShipmentInternationalFromAddress**](ShipmentInternationalFromAddress.md) |  |  |
|**parcel** | [**ShipmentInternationalParcel**](ShipmentInternationalParcel.md) |  |  |
|**carrierAccountId** | **String** | A unique identifier associated with the Carrier account used by client users during shipment process. |  |
|**parcelType** | **String** | &gt;-Packaging type specific to the carrier, e.g., FRPKG, LGENV, TUBE,PKG. |  |
|**serviceId** | **String** | &gt;-The abbreviated name of the carrier-specific service. Required for creating a shipment. Optional for rating a parcel. |  |
|**dateOfShipment** | **String** | The date of the shipment. The format must be YYY:MM:DD. |  [optional] |
|**specialServices** | [**List&lt;SpecialService&gt;**](SpecialService.md) |  |  [optional] |
|**shipmentOptions** | [**ShipmentOptions**](ShipmentOptions.md) |  |  [optional] |
|**metadata** | [**List&lt;ShipmentInternationalMetadataInner&gt;**](ShipmentInternationalMetadataInner.md) | Additional metadata that needs to be stored for this shipment can be added here. For now, &#x60;costAccountName&#x60; is supported. |  [optional] |
|**toAddress** | [**ShipmentInternationalToAddress**](ShipmentInternationalToAddress.md) |  |  |
|**customs** | [**ShipmentInternationalCustoms**](ShipmentInternationalCustoms.md) |  |  |



