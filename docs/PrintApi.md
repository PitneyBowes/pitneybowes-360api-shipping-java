# PrintApi

All URIs are relative to *https://api-sandbox.sendpro360.pitneybowes.com/shipping*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**deletePrinterMapping**](PrintApi.md#deletePrinterMapping) | **DELETE** /api/v1/printer/mapping | Delete Printer mapping |
| [**getPrinterMapping**](PrintApi.md#getPrinterMapping) | **GET** /api/v1/printer/mapping | Get Printer mapping |
| [**jobStatus**](PrintApi.md#jobStatus) | **GET** /api/v1/jobs/{jobId} | Job status |
| [**printDocument**](PrintApi.md#printDocument) | **POST** /api/v1/document/print | Print Document |
| [**printerMapping**](PrintApi.md#printerMapping) | **POST** /api/v1/printer/mapping | Printer mapping |



## deletePrinterMapping

> deletePrinterMapping(alias, xPBDeveloperPartnerId, xPBLocationId, xPBTransactionId)

Delete Printer mapping

delete printer mapping document

### Example

```java
// Import classes:
import com.pitneybowes.api360.ApiClient;
import com.pitneybowes.api360.ApiException;
import com.pitneybowes.api360.Configuration;
import com.pitneybowes.api360.auth.*;
import com.pitneybowes.api360.models.*;
import com.pitneybowes.api360.api.PrintApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-sandbox.sendpro360.pitneybowes.com/shipping");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        PrintApi apiInstance = new PrintApi(defaultClient);
        String alias = "alias_example"; // String | Refers to a printer connected (directly or via network) to a computer.
        String xPBDeveloperPartnerId = "xPBDeveloperPartnerId_example"; // String | The Developer Partner ID is assigned by PB to uniquely identify a Developer's strategic business partners. If the developer is the sole business partner, this field isn't required.
        String xPBLocationId = "xPBLocationId_example"; // String | This is the Location ID assigned as per the Developer's and Partner's parsed locations, to which all transactions will be billed. <br /> Partner's location will be used for billing if it is configured, however, in case Partner's location is not given, then the Developer's location will be taken. Developer's location will be the default value. <br /> Additionally, Developers and Partners can use carriers belong to this location only.
        String xPBTransactionId = "xPBTransactionId_example"; // String | A unique transaction Id provided by the partner which is used to enable debugging and linking between the client's transaction and the system.
        try {
            apiInstance.deletePrinterMapping(alias, xPBDeveloperPartnerId, xPBLocationId, xPBTransactionId);
        } catch (ApiException e) {
            System.err.println("Exception when calling PrintApi#deletePrinterMapping");
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
| **alias** | **String**| Refers to a printer connected (directly or via network) to a computer. | |
| **xPBDeveloperPartnerId** | **String**| The Developer Partner ID is assigned by PB to uniquely identify a Developer&#39;s strategic business partners. If the developer is the sole business partner, this field isn&#39;t required. | [optional] |
| **xPBLocationId** | **String**| This is the Location ID assigned as per the Developer&#39;s and Partner&#39;s parsed locations, to which all transactions will be billed. &lt;br /&gt; Partner&#39;s location will be used for billing if it is configured, however, in case Partner&#39;s location is not given, then the Developer&#39;s location will be taken. Developer&#39;s location will be the default value. &lt;br /&gt; Additionally, Developers and Partners can use carriers belong to this location only. | [optional] |
| **xPBTransactionId** | **String**| A unique transaction Id provided by the partner which is used to enable debugging and linking between the client&#39;s transaction and the system. | [optional] |

### Return type

null (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successfully deleted printer mapping |  -  |
| **401** | The request could not be authorized. |  -  |


## getPrinterMapping

> PrinterMappingGetResponse getPrinterMapping(alias, xPBDeveloperPartnerId, xPBLocationId, xPBTransactionId)

Get Printer mapping

Get printer mapping document

### Example

```java
// Import classes:
import com.pitneybowes.api360.ApiClient;
import com.pitneybowes.api360.ApiException;
import com.pitneybowes.api360.Configuration;
import com.pitneybowes.api360.auth.*;
import com.pitneybowes.api360.models.*;
import com.pitneybowes.api360.api.PrintApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-sandbox.sendpro360.pitneybowes.com/shipping");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        PrintApi apiInstance = new PrintApi(defaultClient);
        String alias = "alias_example"; // String | Refers to a printer connected (directly or via network) to a computer.
        String xPBDeveloperPartnerId = "xPBDeveloperPartnerId_example"; // String | The Developer Partner ID is assigned by PB to uniquely identify a Developer's strategic business partners. If the developer is the sole business partner, this field isn't required.
        String xPBLocationId = "xPBLocationId_example"; // String | This is the Location ID assigned as per the Developer's and Partner's parsed locations, to which all transactions will be billed. <br /> Partner's location will be used for billing if it is configured, however, in case Partner's location is not given, then the Developer's location will be taken. Developer's location will be the default value. <br /> Additionally, Developers and Partners can use carriers belong to this location only.
        String xPBTransactionId = "xPBTransactionId_example"; // String | A unique transaction Id provided by the partner which is used to enable debugging and linking between the client's transaction and the system.
        try {
            PrinterMappingGetResponse result = apiInstance.getPrinterMapping(alias, xPBDeveloperPartnerId, xPBLocationId, xPBTransactionId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PrintApi#getPrinterMapping");
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
| **alias** | **String**| Refers to a printer connected (directly or via network) to a computer. | |
| **xPBDeveloperPartnerId** | **String**| The Developer Partner ID is assigned by PB to uniquely identify a Developer&#39;s strategic business partners. If the developer is the sole business partner, this field isn&#39;t required. | [optional] |
| **xPBLocationId** | **String**| This is the Location ID assigned as per the Developer&#39;s and Partner&#39;s parsed locations, to which all transactions will be billed. &lt;br /&gt; Partner&#39;s location will be used for billing if it is configured, however, in case Partner&#39;s location is not given, then the Developer&#39;s location will be taken. Developer&#39;s location will be the default value. &lt;br /&gt; Additionally, Developers and Partners can use carriers belong to this location only. | [optional] |
| **xPBTransactionId** | **String**| A unique transaction Id provided by the partner which is used to enable debugging and linking between the client&#39;s transaction and the system. | [optional] |

### Return type

[**PrinterMappingGetResponse**](PrinterMappingGetResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Mapping printer Get Successfully |  -  |
| **401** | The request could not be authorized. |  -  |


## jobStatus

> JobStatus jobStatus(jobId, xPBDeveloperPartnerId, xPBLocationId, xPBTransactionId)

Job status

job status

### Example

```java
// Import classes:
import com.pitneybowes.api360.ApiClient;
import com.pitneybowes.api360.ApiException;
import com.pitneybowes.api360.Configuration;
import com.pitneybowes.api360.auth.*;
import com.pitneybowes.api360.models.*;
import com.pitneybowes.api360.api.PrintApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-sandbox.sendpro360.pitneybowes.com/shipping");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        PrintApi apiInstance = new PrintApi(defaultClient);
        String jobId = "jobId_example"; // String | The jobId, a unique identifier assigned for the job.
        String xPBDeveloperPartnerId = "xPBDeveloperPartnerId_example"; // String | The Developer Partner ID is assigned by PB to uniquely identify a Developer's strategic business partners. If the developer is the sole business partner, this field isn't required.
        String xPBLocationId = "xPBLocationId_example"; // String | This is the Location ID assigned as per the Developer's and Partner's parsed locations, to which all transactions will be billed. <br /> Partner's location will be used for billing if it is configured, however, in case Partner's location is not given, then the Developer's location will be taken. Developer's location will be the default value. <br /> Additionally, Developers and Partners can use carriers belong to this location only.
        String xPBTransactionId = "xPBTransactionId_example"; // String | A unique transaction Id provided by the partner which is used to enable debugging and linking between the client's transaction and the system.
        try {
            JobStatus result = apiInstance.jobStatus(jobId, xPBDeveloperPartnerId, xPBLocationId, xPBTransactionId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PrintApi#jobStatus");
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
| **jobId** | **String**| The jobId, a unique identifier assigned for the job. | |
| **xPBDeveloperPartnerId** | **String**| The Developer Partner ID is assigned by PB to uniquely identify a Developer&#39;s strategic business partners. If the developer is the sole business partner, this field isn&#39;t required. | [optional] |
| **xPBLocationId** | **String**| This is the Location ID assigned as per the Developer&#39;s and Partner&#39;s parsed locations, to which all transactions will be billed. &lt;br /&gt; Partner&#39;s location will be used for billing if it is configured, however, in case Partner&#39;s location is not given, then the Developer&#39;s location will be taken. Developer&#39;s location will be the default value. &lt;br /&gt; Additionally, Developers and Partners can use carriers belong to this location only. | [optional] |
| **xPBTransactionId** | **String**| A unique transaction Id provided by the partner which is used to enable debugging and linking between the client&#39;s transaction and the system. | [optional] |

### Return type

[**JobStatus**](JobStatus.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The document has been printed successfully. |  -  |
| **401** | The request could not be authorized. |  -  |


## printDocument

> PrintDocumentResponse printDocument(printDocumentRequest, xPBDeveloperPartnerId, xPBLocationId, xPBTransactionId)

Print Document

It contains information about a label or a document, e.g. a shipping label, a customs form, manifest report etc., that pertains to a shipment or manifest.

### Example

```java
// Import classes:
import com.pitneybowes.api360.ApiClient;
import com.pitneybowes.api360.ApiException;
import com.pitneybowes.api360.Configuration;
import com.pitneybowes.api360.auth.*;
import com.pitneybowes.api360.models.*;
import com.pitneybowes.api360.api.PrintApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-sandbox.sendpro360.pitneybowes.com/shipping");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        PrintApi apiInstance = new PrintApi(defaultClient);
        PrintDocumentRequest printDocumentRequest = new PrintDocumentRequest(); // PrintDocumentRequest | 
        String xPBDeveloperPartnerId = "xPBDeveloperPartnerId_example"; // String | The Developer Partner ID is assigned by PB to uniquely identify a Developer's strategic business partners. If the developer is the sole business partner, this field isn't required.
        String xPBLocationId = "xPBLocationId_example"; // String | This is the Location ID assigned as per the Developer's and Partner's parsed locations, to which all transactions will be billed. <br /> Partner's location will be used for billing if it is configured, however, in case Partner's location is not given, then the Developer's location will be taken. Developer's location will be the default value. <br /> Additionally, Developers and Partners can use carriers belong to this location only.
        String xPBTransactionId = "xPBTransactionId_example"; // String | A unique Transaction ID provided by the partner, which is used to enable debugging and linking between the client's transaction and the system.
        try {
            PrintDocumentResponse result = apiInstance.printDocument(printDocumentRequest, xPBDeveloperPartnerId, xPBLocationId, xPBTransactionId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PrintApi#printDocument");
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
| **printDocumentRequest** | [**PrintDocumentRequest**](PrintDocumentRequest.md)|  | |
| **xPBDeveloperPartnerId** | **String**| The Developer Partner ID is assigned by PB to uniquely identify a Developer&#39;s strategic business partners. If the developer is the sole business partner, this field isn&#39;t required. | [optional] |
| **xPBLocationId** | **String**| This is the Location ID assigned as per the Developer&#39;s and Partner&#39;s parsed locations, to which all transactions will be billed. &lt;br /&gt; Partner&#39;s location will be used for billing if it is configured, however, in case Partner&#39;s location is not given, then the Developer&#39;s location will be taken. Developer&#39;s location will be the default value. &lt;br /&gt; Additionally, Developers and Partners can use carriers belong to this location only. | [optional] |
| **xPBTransactionId** | **String**| A unique Transaction ID provided by the partner, which is used to enable debugging and linking between the client&#39;s transaction and the system. | [optional] |

### Return type

[**PrintDocumentResponse**](PrintDocumentResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The document has been printed successfully. |  -  |
| **401** | The request could not be authorized. |  -  |


## printerMapping

> PrinterMappingResponse printerMapping(printerMappingRequest, xPBDeveloperPartnerId, xPBLocationId, xPBTransactionId)

Printer mapping

printer mapping document

### Example

```java
// Import classes:
import com.pitneybowes.api360.ApiClient;
import com.pitneybowes.api360.ApiException;
import com.pitneybowes.api360.Configuration;
import com.pitneybowes.api360.auth.*;
import com.pitneybowes.api360.models.*;
import com.pitneybowes.api360.api.PrintApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-sandbox.sendpro360.pitneybowes.com/shipping");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        PrintApi apiInstance = new PrintApi(defaultClient);
        PrinterMappingRequest printerMappingRequest = new PrinterMappingRequest(); // PrinterMappingRequest | 
        String xPBDeveloperPartnerId = "xPBDeveloperPartnerId_example"; // String | The Developer Partner ID is assigned by PB to uniquely identify a Developer's strategic business partners. If the developer is the sole business partner, this field isn't required.
        String xPBLocationId = "xPBLocationId_example"; // String | This is the Location ID assigned as per the Developer's and Partner's parsed locations, to which all transactions will be billed. <br /> Partner's location will be used for billing if it is configured, however, in case Partner's location is not given, then the Developer's location will be taken. Developer's location will be the default value. <br /> Additionally, Developers and Partners can use carriers belong to this location only.
        String xPBTransactionId = "xPBTransactionId_example"; // String | A unique transaction Id provided by the partner which is used to enable debugging and linking between the client's transaction and the system.
        try {
            PrinterMappingResponse result = apiInstance.printerMapping(printerMappingRequest, xPBDeveloperPartnerId, xPBLocationId, xPBTransactionId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PrintApi#printerMapping");
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
| **printerMappingRequest** | [**PrinterMappingRequest**](PrinterMappingRequest.md)|  | |
| **xPBDeveloperPartnerId** | **String**| The Developer Partner ID is assigned by PB to uniquely identify a Developer&#39;s strategic business partners. If the developer is the sole business partner, this field isn&#39;t required. | [optional] |
| **xPBLocationId** | **String**| This is the Location ID assigned as per the Developer&#39;s and Partner&#39;s parsed locations, to which all transactions will be billed. &lt;br /&gt; Partner&#39;s location will be used for billing if it is configured, however, in case Partner&#39;s location is not given, then the Developer&#39;s location will be taken. Developer&#39;s location will be the default value. &lt;br /&gt; Additionally, Developers and Partners can use carriers belong to this location only. | [optional] |
| **xPBTransactionId** | **String**| A unique transaction Id provided by the partner which is used to enable debugging and linking between the client&#39;s transaction and the system. | [optional] |

### Return type

[**PrinterMappingResponse**](PrinterMappingResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Successfully mapped printer |  -  |
| **401** | The request could not be authorized. |  -  |

