# DefaultsApi

All URIs are relative to *https://api-sandbox.sendpro360.pitneybowes.com/shipping*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createDefaults**](DefaultsApi.md#createDefaults) | **POST** /api/v1/defaults | Create Defaults |
| [**deleteDefaultsById**](DefaultsApi.md#deleteDefaultsById) | **DELETE** /api/v1/defaults/{defaultID} | Delete Defaults by ID |
| [**getAllDefaults**](DefaultsApi.md#getAllDefaults) | **GET** /api/v1/defaults | Get All Defaults |
| [**getDefaultsById**](DefaultsApi.md#getDefaultsById) | **GET** /api/v1/defaults/{defaultID} | Get Defaults By ID |
| [**putDefaultsById**](DefaultsApi.md#putDefaultsById) | **PUT** /api/v1/defaults/{defaultID} | Update Defaults |



## createDefaults

> CreateDefaultsResponse createDefaults(createDefaults)

Create Defaults

While creating shipment, a few columns/ fields information are used mandatorily, and if the value for those columns are used repetitively, then it is always better to save last used values. And hence, this API has been introduced. Using this API, default values can be set up for frequently used columns/fields information like carrier, its linked services, and special services.  Setting up the defaults will save both time and efforts. 

### Example

```java
// Import classes:
import com.pitneybowes.api360.ApiClient;
import com.pitneybowes.api360.ApiException;
import com.pitneybowes.api360.Configuration;
import com.pitneybowes.api360.auth.*;
import com.pitneybowes.api360.models.*;
import com.pitneybowes.api360.api.DefaultsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-sandbox.sendpro360.pitneybowes.com/shipping");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        DefaultsApi apiInstance = new DefaultsApi(defaultClient);
        CreateDefaults createDefaults = new CreateDefaults(); // CreateDefaults | 
        try {
            CreateDefaultsResponse result = apiInstance.createDefaults(createDefaults);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultsApi#createDefaults");
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
| **createDefaults** | [**CreateDefaults**](CreateDefaults.md)|  | |

### Return type

[**CreateDefaultsResponse**](CreateDefaultsResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Defaults (i.e., default values) have been created successfully. |  -  |
| **400** | Invalid request. |  -  |
| **401** | The request could not be authorized. |  -  |
| **500** | The request could not be completed due to an internal error. |  -  |


## deleteDefaultsById

> deleteDefaultsById(defaultID)

Delete Defaults by ID

This operation deletes the existing Defaults.

### Example

```java
// Import classes:
import com.pitneybowes.api360.ApiClient;
import com.pitneybowes.api360.ApiException;
import com.pitneybowes.api360.Configuration;
import com.pitneybowes.api360.auth.*;
import com.pitneybowes.api360.models.*;
import com.pitneybowes.api360.api.DefaultsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-sandbox.sendpro360.pitneybowes.com/shipping");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        DefaultsApi apiInstance = new DefaultsApi(defaultClient);
        String defaultID = "defaultID_example"; // String | This is unique identifier assigned to Defaults while its creation using CreateDefaults API.
        try {
            apiInstance.deleteDefaultsById(defaultID);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultsApi#deleteDefaultsById");
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
| **defaultID** | **String**| This is unique identifier assigned to Defaults while its creation using CreateDefaults API. | |

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
| **200** | Defaults (i.e., default values) have been deleted successfully. |  -  |
| **400** | Invalid request. |  -  |
| **401** | The request could not be authorized. |  -  |
| **500** | The request could not be completed due to an internal error. |  -  |


## getAllDefaults

> AllDefaults getAllDefaults(xPBDeveloperPartnerID, page, size)

Get All Defaults

The operation fetches all created Defaults. If query parameters are not provided, it will consider default page as 1 and default size as 10.

### Example

```java
// Import classes:
import com.pitneybowes.api360.ApiClient;
import com.pitneybowes.api360.ApiException;
import com.pitneybowes.api360.Configuration;
import com.pitneybowes.api360.auth.*;
import com.pitneybowes.api360.models.*;
import com.pitneybowes.api360.api.DefaultsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-sandbox.sendpro360.pitneybowes.com/shipping");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        DefaultsApi apiInstance = new DefaultsApi(defaultClient);
        String xPBDeveloperPartnerID = "xPBDeveloperPartnerID_example"; // String | The Developer Partner ID is assigned by PB to uniquely identify a Developer's strategic business partners. If the developer is the sole business partner, this field isn't required.
        String page = "page_example"; // String | The page of the Defaults search result list.
        String size = "size_example"; // String | The size/count of the searched result list.
        try {
            AllDefaults result = apiInstance.getAllDefaults(xPBDeveloperPartnerID, page, size);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultsApi#getAllDefaults");
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
| **xPBDeveloperPartnerID** | **String**| The Developer Partner ID is assigned by PB to uniquely identify a Developer&#39;s strategic business partners. If the developer is the sole business partner, this field isn&#39;t required. | [optional] |
| **page** | **String**| The page of the Defaults search result list. | [optional] |
| **size** | **String**| The size/count of the searched result list. | [optional] |

### Return type

[**AllDefaults**](AllDefaults.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | List of Defaults. |  -  |
| **400** | Invalid request. |  -  |
| **401** | The request could not be authorized. |  -  |
| **500** | The request could not be completed due to an internal error. |  -  |


## getDefaultsById

> DefaultResponse getDefaultsById(defaultID)

Get Defaults By ID

This operation fetches the values set for the Defaults.

### Example

```java
// Import classes:
import com.pitneybowes.api360.ApiClient;
import com.pitneybowes.api360.ApiException;
import com.pitneybowes.api360.Configuration;
import com.pitneybowes.api360.auth.*;
import com.pitneybowes.api360.models.*;
import com.pitneybowes.api360.api.DefaultsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-sandbox.sendpro360.pitneybowes.com/shipping");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        DefaultsApi apiInstance = new DefaultsApi(defaultClient);
        String defaultID = "defaultID_example"; // String | This is unique identifier assigned to Defaults while its creation using CreateDefaults API.
        try {
            DefaultResponse result = apiInstance.getDefaultsById(defaultID);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultsApi#getDefaultsById");
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
| **defaultID** | **String**| This is unique identifier assigned to Defaults while its creation using CreateDefaults API. | |

### Return type

[**DefaultResponse**](DefaultResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Defaults values have been retrieved successfully. |  -  |
| **400** | Invalid request. |  -  |
| **401** | The request could not be authorized. |  -  |
| **500** | The request could not be completed due to an internal error. |  -  |


## putDefaultsById

> putDefaultsById(defaultID, createDefaults)

Update Defaults

This operation updates the values set for Defaults.

### Example

```java
// Import classes:
import com.pitneybowes.api360.ApiClient;
import com.pitneybowes.api360.ApiException;
import com.pitneybowes.api360.Configuration;
import com.pitneybowes.api360.auth.*;
import com.pitneybowes.api360.models.*;
import com.pitneybowes.api360.api.DefaultsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-sandbox.sendpro360.pitneybowes.com/shipping");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        DefaultsApi apiInstance = new DefaultsApi(defaultClient);
        String defaultID = "defaultID_example"; // String | This is unique identifier assigned to Defaults while its creation using CreateDefaults API.
        CreateDefaults createDefaults = new CreateDefaults(); // CreateDefaults | 
        try {
            apiInstance.putDefaultsById(defaultID, createDefaults);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultsApi#putDefaultsById");
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
| **defaultID** | **String**| This is unique identifier assigned to Defaults while its creation using CreateDefaults API. | |
| **createDefaults** | [**CreateDefaults**](CreateDefaults.md)|  | |

### Return type

null (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Defaults (i.e., default values) have been updated successfully. |  -  |
| **400** | Invalid request. |  -  |
| **401** | The request could not be authorized. |  -  |
| **500** | The request could not be completed due to an internal error. |  -  |

