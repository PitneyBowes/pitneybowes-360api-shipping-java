

# RatingCountStatusERR

This indicates the status count of shipments which are at Rating stage. Rating is a process of assessing the shipping/freight charge associated with the ERR Bulk shipment. Rates are calculated based on selected special/extra services corresponding to the selected Services and ParcelType for USPS.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**success** | **BigDecimal** | The number of shipments that have been successfully processed for Ratings. |  [optional] |
|**failed** | **BigDecimal** | The number of shipments which failed processing at Ratings due to some scenarios like unsupported extra services or incompatible extra services combined for a shipment. |  [optional] |
|**pending** | **BigDecimal** | The number of shipments which are pending and in-queue to be processed. |  [optional] |



