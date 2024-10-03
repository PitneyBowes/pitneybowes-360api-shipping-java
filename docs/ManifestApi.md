# ManifestApi

All URIs are relative to *https://api-sandbox.sendpro360.pitneybowes.com/shipping*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createManifest**](ManifestApi.md#createManifest) | **POST** /api/v1/manifests | Create Manifest |
| [**reprintManifest**](ManifestApi.md#reprintManifest) | **POST** /api/v1/manifests/reprint | Reprint manifest |



## createManifest

> CreateManifest200Response createManifest(xPBDeveloperPartnerID, compactResponse, createManifestRequest)

Create Manifest

This operation creates an end-of-day manifest (a compilation of information about all shipments) that combines all shipments of the day into a single form or electronic record, depending on the carrier. For different carriers, the Manifest process varies, e.g., USPS use SCAN Form while FedEx has Manifest Form.

### Example

```java
// Import classes:
import com.pitneybowes.api360.ApiClient;
import com.pitneybowes.api360.ApiException;
import com.pitneybowes.api360.Configuration;
import com.pitneybowes.api360.auth.*;
import com.pitneybowes.api360.models.*;
import com.pitneybowes.api360.api.ManifestApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-sandbox.sendpro360.pitneybowes.com/shipping");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        ManifestApi apiInstance = new ManifestApi(defaultClient);
        String xPBDeveloperPartnerID = "xPBDeveloperPartnerID_example"; // String | This is the Developer Partner ID. When the developer is the only partner, this field is not required.
        Boolean compactResponse = false; // Boolean | This header defines if the response required is detailed or compact. When value is set to true, it will only return manifest details in response. 
        CreateManifestRequest createManifestRequest = new CreateManifestRequest(); // CreateManifestRequest | 
        try {
            CreateManifest200Response result = apiInstance.createManifest(xPBDeveloperPartnerID, compactResponse, createManifestRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ManifestApi#createManifest");
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
| **xPBDeveloperPartnerID** | **String**| This is the Developer Partner ID. When the developer is the only partner, this field is not required. | [optional] |
| **compactResponse** | **Boolean**| This header defines if the response required is detailed or compact. When value is set to true, it will only return manifest details in response.  | [optional] |
| **createManifestRequest** | [**CreateManifestRequest**](CreateManifestRequest.md)|  | [optional] |

### Return type

[**CreateManifest200Response**](CreateManifest200Response.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The Manifest has been generated for the given carrier. |  -  |
| **400** | Invalid request. |  -  |
| **401** | The request could not be authorized. |  -  |
| **500** | The request could not be completed due to an internal error. |  -  |


## reprintManifest

> CreateManifest200Response reprintManifest(xPBDeveloperPartnerID, compactResponse, reprintManifestRequest)

Reprint manifest

This operation reprints a manifest for which the initial created manifest request was successful.

### Example

```java
// Import classes:
import com.pitneybowes.api360.ApiClient;
import com.pitneybowes.api360.ApiException;
import com.pitneybowes.api360.Configuration;
import com.pitneybowes.api360.auth.*;
import com.pitneybowes.api360.models.*;
import com.pitneybowes.api360.api.ManifestApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-sandbox.sendpro360.pitneybowes.com/shipping");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        ManifestApi apiInstance = new ManifestApi(defaultClient);
        String xPBDeveloperPartnerID = "xPBDeveloperPartnerID_example"; // String | This is the Developer Partner ID. When the developer is the only partner, this field is not required.
        Boolean compactResponse = false; // Boolean | This header defines if the response required is detailed or compact. When value is set to true, it will only return manifest details in response.
        ReprintManifestRequest reprintManifestRequest = new ReprintManifestRequest(); // ReprintManifestRequest | 
        try {
            CreateManifest200Response result = apiInstance.reprintManifest(xPBDeveloperPartnerID, compactResponse, reprintManifestRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ManifestApi#reprintManifest");
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
| **xPBDeveloperPartnerID** | **String**| This is the Developer Partner ID. When the developer is the only partner, this field is not required. | [optional] |
| **compactResponse** | **Boolean**| This header defines if the response required is detailed or compact. When value is set to true, it will only return manifest details in response. | [optional] |
| **reprintManifestRequest** | [**ReprintManifestRequest**](ReprintManifestRequest.md)|  | [optional] |

### Return type

[**CreateManifest200Response**](CreateManifest200Response.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The Manifest has been printed successfully. |  -  |
| **400** | Invalid request. |  -  |
| **401** | The request could not be authorized. |  -  |
| **404** | The requested resource was not found. |  -  |
| **500** | The request could not be completed due to an internal error. |  -  |

