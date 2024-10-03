

# ShipmentDomestic


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**size** | [**SizeEnum**](#SizeEnum) | This defines the label size of the Shipment, e.g., Shipping Label having Doc Size (4&#39; X 6&#39; or 8.5&#39; X 11&#39;). For NORATE carrier- only supported is &#x60;DOC_4X6&#x60; |  |
|**type** | [**TypeEnum**](#TypeEnum) | This defines the type of the Shipment, e.g., Shipping Label. |  |
|**format** | [**FormatEnum**](#FormatEnum) | This defines the type of the shipment which is printed. For example Shipping label prints in PDF form. |  [optional] |
|**dateOfShipment** | **String** | This defines the date of the Shipment in the format YYYY:MM:DD. |  [optional] |
|**fromAddress** | [**ShipmentDomesticFromAddress**](ShipmentDomesticFromAddress.md) |  |  |
|**parcel** | [**ShipmentDomesticParcel**](ShipmentDomesticParcel.md) |  |  |
|**carrierAccountId** | **String** |  A unique identifier associated with the Carrier account used by client users during shipment process. |  |
|**parcelType** | **String** | &gt;-Parcel Type is required for creating a shipment while rating a parcel, which varies as per Carrier selection. It has categories like Package, Envelopes, Paks, Boxes, Tube, defined per specific carrier and used in abbreviated form, e.g., FRPKG, LGENV, TUBE,PKG. |  |
|**parcelId** | **String** | &gt;-Parcel Id is optional and required to be given in case of branded parcels which have brandedDimension and/or brandedWeight. If parcel has brandedDimension, in that case user need not to pass dimensionUnit and dimension details(length, width and height) in the parcel object. And if brandedWeight is also available for the parcel then in that case weightUnit and weight need not to be passed  in parcel object |  [optional] |
|**serviceId** | **String** | &gt;-A unique identifier given to the carrier-specific service. This is required for creating a shipment, while it is optional for rating a parcel. |  |
|**specialServices** | [**List&lt;SpecialService&gt;**](SpecialService.md) |  This provides a carrier-service based special or extra sevice. |  [optional] |
|**shipmentOptions** | [**ShipmentOptionsV2**](ShipmentOptionsV2.md) |  |  [optional] |
|**metadata** | [**List&lt;ShipmentDomesticMetadataInner&gt;**](ShipmentDomesticMetadataInner.md) | Additional metadata that needs to be stored for this shipment can be added here. |  [optional] |
|**toAddress** | [**ShipmentDomesticToAddress**](ShipmentDomesticToAddress.md) |  |  |



## Enum: SizeEnum

| Name | Value |
|---- | -----|
| _8_X11 | &quot;DOC_8X11&quot; |
| _4_X6 | &quot;DOC_4X6&quot; |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| SHIPPING_LABEL | &quot;SHIPPING_LABEL&quot; |



## Enum: FormatEnum

| Name | Value |
|---- | -----|
| PDF | &quot;PDF&quot; |
| ZPL2 | &quot;ZPL2&quot; |



