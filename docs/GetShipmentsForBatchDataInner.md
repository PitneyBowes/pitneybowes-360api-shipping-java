

# GetShipmentsForBatchDataInner


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**batchId** | **String** | This is a system-generated unique identifier assigned to the Batch while it is processed. |  [optional] |
|**carrierAccountId** | **String** | A unique identifier associated with the Carrier account used by client users during shipment process. |  [optional] |
|**externalId** | **String** | This is a user-defined value provided by users just for their reference. This is for mapping purpose against each shipment. |  [optional] |
|**fromAddress** | [**FromAddress**](FromAddress.md) |  |  [optional] |
|**labelLayout** | [**GetShipmentsForBatchDataInnerLabelLayout**](GetShipmentsForBatchDataInnerLabelLayout.md) |  |  [optional] |
|**metadata** | [**List&lt;GetShipmentsForBatchDataInnerMetadataInner&gt;**](GetShipmentsForBatchDataInnerMetadataInner.md) | Additional metadata that needs to be stored for this shipment can be added here. For now, &#x60;costAccountName&#x60; is supported. |  [optional] |
|**parcel** | [**Parcel**](Parcel.md) |  |  [optional] |
|**parcelType** | **String** | Parcel Type is required for creating a shipment while rating a parcel. And it varies as per carrier selection and corresponding services. |  [optional] |
|**serviceId** | **String** | A unique identifier given to the carrier-specific service. User can override this value by defining it at Shipment level. |  [optional] |
|**shipmentId** | **String** | Shipment ID is a unique identifier for an individual shipment |  [optional] |
|**shipmentIdentifier** | **String** | Unique identifier generated for each shipment, it can be either success or failed. |  [optional] |
|**shipmentOptions** | [**ShipmentOptions**](ShipmentOptions.md) |  |  [optional] |
|**specialServices** | [**List&lt;GetShipmentsForBatchDataInnerSpecialServicesInner&gt;**](GetShipmentsForBatchDataInnerSpecialServicesInner.md) | Special services used to create shipment |  [optional] |
|**stepStatus** | [**GetShipmentsForBatchDataInnerStepStatus**](GetShipmentsForBatchDataInnerStepStatus.md) |  |  [optional] |
|**toAddress** | [**ToAddress**](ToAddress.md) |  |  [optional] |



