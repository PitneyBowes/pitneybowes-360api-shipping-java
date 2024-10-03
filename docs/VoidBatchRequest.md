

# VoidBatchRequest

The request to cancel Batch.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** | Indicates the name of the Batch, i.e., a list of shipments, which need to be cancelled. |  |
|**reason** | **String** | Reason to cancel the batch of shipments. |  [optional] |
|**shipmentIds** | **List&lt;String&gt;** | &gt;- Shipment ID is a unique identifier for an individual shipment. If ShipmentID(s) are passed in the array, then corresponding shipments will be cancelled. If ShipmentID(s) is/are not provided, then the entire shipments of the Batch will be cancelled. |  [optional] |



