

# ShipmentBatchResponseERR


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**batchId** | **String** | This is a system-generated unique identifier assigned to the ERR Batch while it is processed. |  [optional] |
|**name** | **String** | Name of the of ERR Batch which consists of multiple shipments (shipments in bulk). |  [optional] |
|**groupName** | **String** |  Indicates the name of the group of batches, which consists of multiple Batch groups. |  [optional] |
|**status** | [**JobStatus**](JobStatus.md) |  |  [optional] |
|**uploadURL** | **String** | For the stored Batch file under S3, this is the S3 returned URL. The URL is uploaded along with the .CSV file to get the BatchID, which is used to track the import status. |  [optional] |



