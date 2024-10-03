

# GetShipmentsForBatchDataInnerStepStatus

It displays different status of shipments at each level- addressValidation, rating, labelGeneration, and voidLabel.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**_import** | **String** | This is only visible for batch submitted during Import via .CSV. |  [optional] |
|**addressValidation** | **String** | It indicates the status of shipments at addressValidation stage. |  [optional] |
|**rating** | **String** | It indicates status of shipments at rating level. |  [optional] |
|**labelGeneration** | **String** | It indicates status of shipments at labelGeneration step. |  [optional] |
|**voidLabel** | **String** | It will only be visible when batch labels are cancelled. |  [optional] |



