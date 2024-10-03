

# ManifestDetailedResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**carrierAccountId** | **String** | A unique identifier associated with the Carrier account which is used while creating Manifest. |  [optional] |
|**carrierName** | **String** | Name of the Carrier. |  [optional] |
|**manifestDocuments** | [**List&lt;ManifestDetailedResponseManifestDocumentsInner&gt;**](ManifestDetailedResponseManifestDocumentsInner.md) | The electronically generated document that has manifest (end-of-day) records of all shipments of the day. |  [optional] |
|**manifestID** | **String** | The unique manifest ID. This field is not returned for APAC Services. |  [optional] |
|**manifestTrackingNumber** | **String** | The manifest tracking number. This is returned only if the carrier has a pre-defined valid value, e.g., UPS, FedEX, or USPS. |  [optional] |
|**fromAddress** | [**ManifestDetailedResponseFromAddress**](ManifestDetailedResponseFromAddress.md) |  |  [optional] |
|**parcelTrackingNumbers** | **List&lt;Object&gt;** |  |  [optional] |
|**submissionDate** | **String** | The date the shipments are to be tendered to the carrier, entered as YYYY-MM-DD. |  [optional] |



