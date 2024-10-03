

# ReturnLabel


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**size** | [**SizeEnum**](#SizeEnum) | This defines the label size of the Shipment, e.g., Shipping Label having Doc Size (8&#39; X 11&#39;). |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) | This defines the type of the Shipment, e.g., Shipping Label. |  [optional] |
|**fromAddress** | [**ReturnLabelFromAddress**](ReturnLabelFromAddress.md) |  |  [optional] |
|**parcel** | [**ShipmentDomesticParcel**](ShipmentDomesticParcel.md) |  |  [optional] |
|**carrierAccountId** | **String** | The unique identifier associated with the Carrier account used by client users during shipment process. |  [optional] |
|**parcelType** | **String** | &gt;-Parcel Type is required for creating a shipment while rating a parcel, which varies as per Carrier selection. It has categories like Package, Envelopes, Paks, Boxes, Tube, defined per specific carrier and used in abbreviated form, e.g., FRPKG, LGENV, TUBE,PKG. |  [optional] |
|**parcelId** | **String** | A unique identifier associated with the Parcel. |  [optional] |
|**serviceId** | **String** | &gt;-A unique identifier given to the carrier-specific service. This is required for creating a shipment, while it is optional for rating a parcel. |  [optional] |
|**specialServices** | [**List&lt;ReturnLabelSpecialServicesInner&gt;**](ReturnLabelSpecialServicesInner.md) |  |  [optional] |
|**shipmentOptions** | [**ShipmentOptionsV2**](ShipmentOptionsV2.md) |  |  [optional] |
|**metadata** | [**List&lt;ShipmentInternationalMetadataInner&gt;**](ShipmentInternationalMetadataInner.md) | Additional metadata that needs to be stored for this shipment can be added here. For now, &#x60;costAccountName&#x60; is supported. |  [optional] |
|**toAddress** | [**ReturnLabelToAddress**](ReturnLabelToAddress.md) |  |  [optional] |



## Enum: SizeEnum

| Name | Value |
|---- | -----|
| DOC_8_X11 | &quot;DOC_8X11&quot; |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| SHIPPING_LABEL | &quot;SHIPPING_LABEL&quot; |



