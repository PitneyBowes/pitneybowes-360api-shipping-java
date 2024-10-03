# BatchApi

All URIs are relative to *https://api-sandbox.sendpro360.pitneybowes.com/shipping*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**bulkImportAPI**](BatchApi.md#bulkImportAPI) | **POST** /api/v1/shipments/importUrl | Bulk Import Shipments |
| [**bulkImportAPIERR**](BatchApi.md#bulkImportAPIERR) | **POST** /api/v1/err/shipments/importUrl | Bulk Import Shipments ERR |
| [**createBulkShipmentsAPI**](BatchApi.md#createBulkShipmentsAPI) | **POST** /api/v1/bulkShipments | Create Bulk Shipments |
| [**createBulkShipmentsAPIERR**](BatchApi.md#createBulkShipmentsAPIERR) | **POST** /api/v1/err/bulkShipments | Create Bulk Shipments ERR |
| [**getBatchStatusAPI**](BatchApi.md#getBatchStatusAPI) | **GET** /api/v1/shipments/batch/{batchId}/status | Get Batch Status |
| [**getShipmentDetailsForBatchAPI**](BatchApi.md#getShipmentDetailsForBatchAPI) | **GET** /api/v1/shipments/batch/{batchId}/shipments | Get Batch Shipment Details |
| [**processBatchAPI**](BatchApi.md#processBatchAPI) | **POST** /api/v1/shipments/batch/{batchId}/process | Process Batch |
| [**voidShippingLabel**](BatchApi.md#voidShippingLabel) | **POST** /api/v1/shipments/batch/{batchId}/void | Void Batch Shipping Labels |



## bulkImportAPI

> ShipmentBatch bulkImportAPI(body, xPBDeveloperPartnerID)

Bulk Import Shipments

This operation imports the .CSV file, which includes all the required fields to create shipments in bulk. The payload contains information about the shipments you want to import, such as &#x60;carrier account&#x60;, &#x60;label layout&#x60;, &#x60;service&#x60;, and any &#x60;special services&#x60; required for the shipments. After batch is submitted, user needs to upload csv file of shipment transactions to the uploadURL returned in response.

### Example

```java
// Import classes:
import com.pitneybowes.api360.ApiClient;
import com.pitneybowes.api360.ApiException;
import com.pitneybowes.api360.Configuration;
import com.pitneybowes.api360.auth.*;
import com.pitneybowes.api360.models.*;
import com.pitneybowes.api360.api.BatchApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-sandbox.sendpro360.pitneybowes.com/shipping");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        BatchApi apiInstance = new BatchApi(defaultClient);
        CreateBatchRequest body = new CreateBatchRequest(); // CreateBatchRequest |  This is the Request body to bulk import shipments.
        String xPBDeveloperPartnerID = "xPBDeveloperPartnerID_example"; // String | This is the Developer Partner ID. When the developer is the only partner, this field is not required.
        try {
            ShipmentBatch result = apiInstance.bulkImportAPI(body, xPBDeveloperPartnerID);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling BatchApi#bulkImportAPI");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **body** | [**CreateBatchRequest**](CreateBatchRequest.md)|  This is the Request body to bulk import shipments. | |
| **xPBDeveloperPartnerID** | **String**| This is the Developer Partner ID. When the developer is the only partner, this field is not required. | [optional] |

### Return type

[**ShipmentBatch**](ShipmentBatch.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  The bulk shipment has been successfully imported. |  -  |
| **400** | Invalid request. |  -  |
| **401** | The request could not be authorized. |  -  |
| **500** | The request could not be completed due to an internal error. |  -  |


## bulkImportAPIERR

> ShipmentBatchResponseERR bulkImportAPIERR(body, xPBDeveloperPartnerID)

Bulk Import Shipments ERR

This operation imports the .CSV file which includes fields required for creating ERR (Electronic Return Receipt) Bulk Shipments.    The payload, which is used for shipment transactions, contains the following essential information in .CSV file:   - Carrier Account   - Output format: Shipping Label and Coversheet    - Services, and   - Special Services     The above-mentioned information are stored in AWS-S3 which in turn provides URL to users. When Batch is submitted, S3 returned URL along with .CSV file are uploaded, which generates BatchID.    The same BatchID is used to track the status of BulkImport. 

### Example

```java
// Import classes:
import com.pitneybowes.api360.ApiClient;
import com.pitneybowes.api360.ApiException;
import com.pitneybowes.api360.Configuration;
import com.pitneybowes.api360.auth.*;
import com.pitneybowes.api360.models.*;
import com.pitneybowes.api360.api.BatchApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-sandbox.sendpro360.pitneybowes.com/shipping");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        BatchApi apiInstance = new BatchApi(defaultClient);
        CreateBatchRequestERR body = new CreateBatchRequestERR(); // CreateBatchRequestERR |  This is the request body to import ERR Bulk shipments.
        String xPBDeveloperPartnerID = "xPBDeveloperPartnerID_example"; // String | The PB-Developer-Partner-ID is assigned by PB to uniquely identify a developer's strategic business partners. If the developer is the sole business partner, this field is not required.
        try {
            ShipmentBatchResponseERR result = apiInstance.bulkImportAPIERR(body, xPBDeveloperPartnerID);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling BatchApi#bulkImportAPIERR");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **body** | [**CreateBatchRequestERR**](CreateBatchRequestERR.md)|  This is the request body to import ERR Bulk shipments. | |
| **xPBDeveloperPartnerID** | **String**| The PB-Developer-Partner-ID is assigned by PB to uniquely identify a developer&#39;s strategic business partners. If the developer is the sole business partner, this field is not required. | [optional] |

### Return type

[**ShipmentBatchResponseERR**](ShipmentBatchResponseERR.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  ERR Bulk Shipment has been successfully imported. |  -  |
| **400** | Invalid request. |  -  |
| **401** | The request could not be authorized. |  -  |
| **500** | The request could not be completed due to an internal error. |  -  |


## createBulkShipmentsAPI

> BulkShipmentResponse createBulkShipmentsAPI(body, xPBDeveloperPartnerID)

Create Bulk Shipments

This operation creates a batch of bulk (larger quantities) shipments for single or multiple recipients. The shipments can be addressed to a single or multiple recipients with different combination of carrier, service special services and parcel type. &#x60;carrierAccountId&#x60;, &#x60;parcelType&#x60;, &#x60;serviceId&#x60; and &#x60;specialServices&#x60; are used as default when user do not wish to provide at shipment level. If user choose to provide these at Shipment level then it overrides the values provided at root level. At shipment level either you can wish to provide all of &#x60;carrierAccountId&#x60;, &#x60;parcelType&#x60;, &#x60;serviceId&#x60; and &#x60;specialServices&#x60; or not provide all of them if wants to use default ones from root level. If user do not provide any one out of &#x60;carrierAccountId&#x60;, &#x60;parcelType&#x60; and &#x60;serviceId&#x60; at shipment level it would result in validation error

### Example

```java
// Import classes:
import com.pitneybowes.api360.ApiClient;
import com.pitneybowes.api360.ApiException;
import com.pitneybowes.api360.Configuration;
import com.pitneybowes.api360.auth.*;
import com.pitneybowes.api360.models.*;
import com.pitneybowes.api360.api.BatchApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-sandbox.sendpro360.pitneybowes.com/shipping");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        BatchApi apiInstance = new BatchApi(defaultClient);
        CreateBulkShipmentsAPIRequest body = new CreateBulkShipmentsAPIRequest(); // CreateBulkShipmentsAPIRequest | This is the Request body to create bulk shipments.
        String xPBDeveloperPartnerID = "xPBDeveloperPartnerID_example"; // String | This is the Developer Partner ID. When the developer is the only partner, this field is not required.
        try {
            BulkShipmentResponse result = apiInstance.createBulkShipmentsAPI(body, xPBDeveloperPartnerID);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling BatchApi#createBulkShipmentsAPI");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **body** | [**CreateBulkShipmentsAPIRequest**](CreateBulkShipmentsAPIRequest.md)| This is the Request body to create bulk shipments. | |
| **xPBDeveloperPartnerID** | **String**| This is the Developer Partner ID. When the developer is the only partner, this field is not required. | [optional] |

### Return type

[**BulkShipmentResponse**](BulkShipmentResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The Batch Shipment has been created. |  -  |
| **400** | Invalid request. |  -  |
| **401** | The request could not be authorized. |  -  |
| **500** | The request could not be completed due to an internal error. |  -  |


## createBulkShipmentsAPIERR

> BulkShipmentResponseERR createBulkShipmentsAPIERR(body, xPBDeveloperPartnerID)

Create Bulk Shipments ERR

ERR (Electronic Return Receipt) is an official United States Postal Service® (USPS) document designed to be equivalent to the hardcopy &#39;green card&#39; Return Receipt. &lt;br /&gt;    It provides the following information:   - Name of the Recipient     - Time when article is delivered   - Signature (image) of the Recipient     - Address where the item is delivered, and    - Date when the article gets delivered.      ERR is combined with certain classes and categories of mails, which are as follow:   - First-Class Mail®    - Priority Mail®     ERR Batch supports two types of Shipment Document format:    - Shipping Label    - Coversheet       This API \&quot;Create Bulk Shipments with ERR\&quot; operation requires the following information:   - Recipient (Single or Multiple)   - Carrier - USPS   - Service   - Parcel Type, and   - Special Service.    The ERR API works at two levels: Shipment level and Root level. Root level is marked as Default, where multiple shipments are processed and entities are common for all shipments. While at Shipment level, entities might differ. &lt;br /&gt;   User can either define values for *CarrierAccountID*, *ParcelType*, *ServiceID*, and *SpecialService* respectively at the Root level for all shipments, or mention the values at Shipment level, i.e., for individual shipment(s).     If user does not provide values for the above-mentioned fields combinedly at Shipment level, then the default values for these fields provided at Root level will be considered. While, if user provides these values combinedly at Shipment Level for individual shipment(s), it will override the values defined at Root level. &lt;br /&gt;   &lt;br /&gt;   *Condition: The fields *CarrierAccountID*, *ParcelType*, *ServiceID* are treated as a combination, and values against each field must be provided if user selects Shipment level. In case any of these field(s) out of the mentioned combination is/are missing, it will return validation error.*    

### Example

```java
// Import classes:
import com.pitneybowes.api360.ApiClient;
import com.pitneybowes.api360.ApiException;
import com.pitneybowes.api360.Configuration;
import com.pitneybowes.api360.auth.*;
import com.pitneybowes.api360.models.*;
import com.pitneybowes.api360.api.BatchApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-sandbox.sendpro360.pitneybowes.com/shipping");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        BatchApi apiInstance = new BatchApi(defaultClient);
        CreateBulkShipmentsAPIERRRequest body = new CreateBulkShipmentsAPIERRRequest(); // CreateBulkShipmentsAPIERRRequest | This is the request body to create Bulk Shipment for ERR.
        String xPBDeveloperPartnerID = "xPBDeveloperPartnerID_example"; // String | The Developer-Partner-ID is assigned by PB to uniquely identify a developer's strategic business partners. If the developer is the sole business partner, this field is not required.
        try {
            BulkShipmentResponseERR result = apiInstance.createBulkShipmentsAPIERR(body, xPBDeveloperPartnerID);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling BatchApi#createBulkShipmentsAPIERR");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **body** | [**CreateBulkShipmentsAPIERRRequest**](CreateBulkShipmentsAPIERRRequest.md)| This is the request body to create Bulk Shipment for ERR. | |
| **xPBDeveloperPartnerID** | **String**| The Developer-Partner-ID is assigned by PB to uniquely identify a developer&#39;s strategic business partners. If the developer is the sole business partner, this field is not required. | [optional] |

### Return type

[**BulkShipmentResponseERR**](BulkShipmentResponseERR.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The Bulk Shipment for ERR has been successfully created. |  -  |
| **400** | Invalid request. |  -  |
| **401** | The request could not be authorized. |  -  |
| **500** | The request could not be completed due to an internal error. |  -  |


## getBatchStatusAPI

> GetStatusDetailedResponse getBatchStatusAPI(batchId, xPBDeveloperPartnerID)

Get Batch Status

This operation retrieves the status of an existing Batch using *Batch ID*. Once the Job status is completed, the URL received from Response can be used to download the shipping label in PDF format.

### Example

```java
// Import classes:
import com.pitneybowes.api360.ApiClient;
import com.pitneybowes.api360.ApiException;
import com.pitneybowes.api360.Configuration;
import com.pitneybowes.api360.auth.*;
import com.pitneybowes.api360.models.*;
import com.pitneybowes.api360.api.BatchApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-sandbox.sendpro360.pitneybowes.com/shipping");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        BatchApi apiInstance = new BatchApi(defaultClient);
        String batchId = "batchId_example"; // String | This is a system-generated unique identifier assigned to the Batch while it is processed.
        String xPBDeveloperPartnerID = "xPBDeveloperPartnerID_example"; // String | The Developer-Partner- ID is assigned by PB to uniquely identify a Developer's strategic business partners. If the developer is the sole business partner, this field is not required.
        try {
            GetStatusDetailedResponse result = apiInstance.getBatchStatusAPI(batchId, xPBDeveloperPartnerID);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling BatchApi#getBatchStatusAPI");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **batchId** | **String**| This is a system-generated unique identifier assigned to the Batch while it is processed. | |
| **xPBDeveloperPartnerID** | **String**| The Developer-Partner- ID is assigned by PB to uniquely identify a Developer&#39;s strategic business partners. If the developer is the sole business partner, this field is not required. | [optional] |

### Return type

[**GetStatusDetailedResponse**](GetStatusDetailedResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Here, is the status of the Batch ID. |  -  |
| **400** | Invalid request. |  -  |
| **401** | The request could not be authorized. |  -  |
| **404** | The requested resource was not found. |  -  |
| **500** | The request could not be completed due to an internal error. |  -  |


## getShipmentDetailsForBatchAPI

> GetShipmentsForBatch getShipmentDetailsForBatchAPI(batchId, xPBDeveloperPartnerID, page, size, status, step)

Get Batch Shipment Details

\&quot;This API operation provides the shipment details for those shipments which are SUCCESS or FAILED during batch processing at the following levels: - addressValidation - rating - labelGeneration, and - voidLabel  Based on fields/data mentioned in Query Parameter, user can check shipment details for particular status at any levels. &lt;br /&gt; If no values are provided in the fields mentioned in Query Parameter, the default for each will be: - Page: 1  - Size: 20 - Status: SUCCESS/FAILED. 

### Example

```java
// Import classes:
import com.pitneybowes.api360.ApiClient;
import com.pitneybowes.api360.ApiException;
import com.pitneybowes.api360.Configuration;
import com.pitneybowes.api360.auth.*;
import com.pitneybowes.api360.models.*;
import com.pitneybowes.api360.api.BatchApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-sandbox.sendpro360.pitneybowes.com/shipping");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        BatchApi apiInstance = new BatchApi(defaultClient);
        String batchId = "batchId_example"; // String | This is a system-generated unique identifier assigned to the Batch while it is processed
        String xPBDeveloperPartnerID = "xPBDeveloperPartnerID_example"; // String | The Developer-Partner- ID is assigned by PB to uniquely identify a Developer's strategic business partners. If the developer is the sole business partner, this field is not required.
        Integer page = 56; // Integer | It returns detailed information for shipments status and it can cover in one or more pages. The default value for page number is 1.
        Integer size = 56; // Integer | Indicates the number of records per page. The default value for records is 20.
        String status = "SUCCESS"; // String | The status of the shipment. Values can be Failed or Success.
        String step = "rating"; // String | Indicates various stages of the batch processing.
        try {
            GetShipmentsForBatch result = apiInstance.getShipmentDetailsForBatchAPI(batchId, xPBDeveloperPartnerID, page, size, status, step);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling BatchApi#getShipmentDetailsForBatchAPI");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **batchId** | **String**| This is a system-generated unique identifier assigned to the Batch while it is processed | |
| **xPBDeveloperPartnerID** | **String**| The Developer-Partner- ID is assigned by PB to uniquely identify a Developer&#39;s strategic business partners. If the developer is the sole business partner, this field is not required. | [optional] |
| **page** | **Integer**| It returns detailed information for shipments status and it can cover in one or more pages. The default value for page number is 1. | [optional] |
| **size** | **Integer**| Indicates the number of records per page. The default value for records is 20. | [optional] |
| **status** | **String**| The status of the shipment. Values can be Failed or Success. | [optional] [enum: SUCCESS, FAILED] |
| **step** | **String**| Indicates various stages of the batch processing. | [optional] [enum: rating, addressValidation, labelGeneration, voidLabel] |

### Return type

[**GetShipmentsForBatch**](GetShipmentsForBatch.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Detailed status of processed shipments for the batch. |  -  |
| **400** | Invalid request. |  -  |
| **401** | The request could not be authorized. |  -  |
| **404** | The requested resource was not found. |  -  |
| **500** | The request could not be completed due to an internal error. |  -  |


## processBatchAPI

> ProcessShipmentResponse processBatchAPI(batchId, xPBDeveloperPartnerID)

Process Batch

This operation processes (executes) the existing Batch. The payload for this endpoint needs only an empty JSON object and no additional data is required in the request body. The BatchID parameter located in the endpoint specifies which batch of shipments to process.

### Example

```java
// Import classes:
import com.pitneybowes.api360.ApiClient;
import com.pitneybowes.api360.ApiException;
import com.pitneybowes.api360.Configuration;
import com.pitneybowes.api360.auth.*;
import com.pitneybowes.api360.models.*;
import com.pitneybowes.api360.api.BatchApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-sandbox.sendpro360.pitneybowes.com/shipping");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        BatchApi apiInstance = new BatchApi(defaultClient);
        String batchId = "batchId_example"; // String | This is a system-generated unique identifier assigned to the Batch while it is processed.
        String xPBDeveloperPartnerID = "xPBDeveloperPartnerID_example"; // String | The Developer-Partner-ID is assigned by PB to uniquely identify a Developer's strategic business partners. If the developer is the sole business partner, this field is not required.
        try {
            ProcessShipmentResponse result = apiInstance.processBatchAPI(batchId, xPBDeveloperPartnerID);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling BatchApi#processBatchAPI");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **batchId** | **String**| This is a system-generated unique identifier assigned to the Batch while it is processed. | |
| **xPBDeveloperPartnerID** | **String**| The Developer-Partner-ID is assigned by PB to uniquely identify a Developer&#39;s strategic business partners. If the developer is the sole business partner, this field is not required. | [optional] |

### Return type

[**ProcessShipmentResponse**](ProcessShipmentResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The Batch has been processed successfully. |  -  |
| **400** | Invalid request. |  -  |
| **401** | The request could not be authorized. |  -  |
| **404** | The requested resource was not found. |  -  |
| **500** | The request could not be completed due to an internal error. |  -  |


## voidShippingLabel

> VoidBatchResponse voidShippingLabel(batchId, xPBDeveloperPartnerID, voidBatchRequest)

Void Batch Shipping Labels

This operation cancels (voids) shipments which are created using the Batch API operation &#x60;createBulkShipments&#x60;. &lt;br /&gt; If user wants to cancel specific shipment(s) of the Batch, then s/he needs to pass the *Shipment ID* for the selected shipments in the &#x60;shipmentIDs&#x60; array. While if user wants to cancel all shipments of the Batch, then s/he does not need to provide any *Shipment ID* in the array under request body.

### Example

```java
// Import classes:
import com.pitneybowes.api360.ApiClient;
import com.pitneybowes.api360.ApiException;
import com.pitneybowes.api360.Configuration;
import com.pitneybowes.api360.auth.*;
import com.pitneybowes.api360.models.*;
import com.pitneybowes.api360.api.BatchApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-sandbox.sendpro360.pitneybowes.com/shipping");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        BatchApi apiInstance = new BatchApi(defaultClient);
        String batchId = "batchId_example"; // String | This is a system-generated unique identifier assigned to the Batch while it is processed.
        String xPBDeveloperPartnerID = "xPBDeveloperPartnerID_example"; // String | The Developer-Partner-ID is assigned by PB to uniquely identify a Developer's strategic business partners. If the developer is the sole business partner, this field is not required.
        VoidBatchRequest voidBatchRequest = new VoidBatchRequest(); // VoidBatchRequest |  This is the request body for cancelling the selected shipments or entire Batch of shipments*.
        try {
            VoidBatchResponse result = apiInstance.voidShippingLabel(batchId, xPBDeveloperPartnerID, voidBatchRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling BatchApi#voidShippingLabel");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **batchId** | **String**| This is a system-generated unique identifier assigned to the Batch while it is processed. | |
| **xPBDeveloperPartnerID** | **String**| The Developer-Partner-ID is assigned by PB to uniquely identify a Developer&#39;s strategic business partners. If the developer is the sole business partner, this field is not required. | [optional] |
| **voidBatchRequest** | [**VoidBatchRequest**](VoidBatchRequest.md)|  This is the request body for cancelling the selected shipments or entire Batch of shipments*. | [optional] |

### Return type

[**VoidBatchResponse**](VoidBatchResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The indicated shipment(s) of Batch have been successfully cancelled. |  -  |
| **400** | Invalid request. |  -  |
| **401** | The request could not be authorized. |  -  |
| **404** | The requested resource was not found. |  -  |
| **500** | The request could not be completed due to an internal error. |  -  |

