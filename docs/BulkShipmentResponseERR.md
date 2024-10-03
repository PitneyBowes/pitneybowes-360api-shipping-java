

# BulkShipmentResponseERR


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**batchId** | **String** |  This is a system-generated unique identifier assigned to the Batch while it is processed. |  [optional] |
|**name** | **String** |  Name of the of ERR Batch which consists of multiple shipments (shipments in bulk). |  [optional] |
|**groupName** | **String** | Indicates the name of the group of batches, which consists of multiple Batch groups. |  [optional] |
|**status** | [**JobStatus**](JobStatus.md) |  |  [optional] |
|**addressValidation** | **AddressCountStatus** |  |  [optional] |
|**rating** | **RatingCountStatusERR** |  |  [optional] |
|**labelGeneration** | **LabelGenerationCountStatus** |  |  [optional] |
|**labelDetails** | [**BulkShipmentResponseERRLabelDetails**](BulkShipmentResponseERRLabelDetails.md) |  |  [optional] |



