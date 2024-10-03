

# DocTabItem

This field will either be part of the request or response payload or will be marked as a custom field. We need to pass this field only if we need to print it on the label.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**displayName** | **String** | This is a mandatory field. It will be displayed on the label |  [optional] |
|**value** | **String** | If the field is part of a request or response, the value will be picked up from there. In the case of custom fields, the user-provided value will be printed. |  [optional] |
|**row** | **Integer** | Row Position of the Item. The min value is 1. |  [optional] |
|**column** | **Integer** | Column Position of the Item. The min value is 1. |  [optional] |



