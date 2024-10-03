

# GetStatusDetailedResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**batchId** | **String** |  This is a system-generated unique identifier assigned to the Batch while it is processed. |  [optional] |
|**name** | **String** |  Name of the of Batch which consists of multiple shipments (shipments in bulk). |  [optional] |
|**groupName** | **String** | Indicates the name of the group of batches, which consists of multiple Batch groups. |  [optional] |
|**status** | [**JobStatus**](JobStatus.md) |  |  [optional] |
|**_import** | **ImportCountStatus** |  |  [optional] |
|**addressValidation** | **AddressCountStatus** |  |  [optional] |
|**rating** | **RatingCountStatus** |  |  [optional] |
|**labelGeneration** | **LabelGenerationCountStatus** |  |  [optional] |
|**voidLabel** | **VoidCountStatus** |  |  [optional] |
|**labelDetails** | [**GetStatusDetailedResponseLabelDetails**](GetStatusDetailedResponseLabelDetails.md) |  |  [optional] |



