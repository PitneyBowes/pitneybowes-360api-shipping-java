

# Shipment


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**externalId** | **String** | The external ID of the shipment. User can provide any custom value to it for its own reference |  [optional] |
|**fromAddress** | [**MultipieceDomesticShipmentRequestFromAddress**](MultipieceDomesticShipmentRequestFromAddress.md) |  |  |
|**parcel** | [**ShipmentDomesticParcel**](ShipmentDomesticParcel.md) |  |  |
|**carrierAccountId** | **String** | A unique identifier associated with the Carrier account used by client users during shipment process. |  |
|**parcelType** | **String** | &gt;-Packaging type specific to the carrier, e.g., FRPKG, LGENV, TUBE,PKG. |  |
|**serviceId** | **String** | &gt;-The abbreviated name of the carrier-specific service. Required for creating a shipment. Optional for rating a parcel. |  |
|**dateOfShipment** | **String** | Current Shipment date |  [optional] |
|**specialServices** | [**List&lt;SpecialService&gt;**](SpecialService.md) |  |  [optional] |
|**shipmentOptions** | [**ShipmentOptions**](ShipmentOptions.md) |  |  [optional] |
|**metadata** | [**List&lt;ShipmentMetadataInner&gt;**](ShipmentMetadataInner.md) | Additional metadata that needs to be stored for this shipment can be added here. For now, &#x60;costAccountName&#x60; is supported. |  [optional] |
|**toAddress** | [**ShipmentToAddress**](ShipmentToAddress.md) |  |  |



