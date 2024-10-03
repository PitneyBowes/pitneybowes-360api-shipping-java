# AddressApi

All URIs are relative to *https://api-sandbox.sendpro360.pitneybowes.com/shipping*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addressSuggest**](AddressApi.md#addressSuggest) | **POST** /api/v1/address/suggest | Address Suggest |
| [**addressValidate**](AddressApi.md#addressValidate) | **POST** /api/v1/address/verify | Address Validate |



## addressSuggest

> AddressSuggestResponse addressSuggest(addressSuggestRequest)

Address Suggest

This operation displays a valid address to match the entered address, only if the address does not seem valid to the system address map. User can select the suggested address or edit the entered address to make it valid.

### Example

```java
// Import classes:
import com.pitneybowes.api360.ApiClient;
import com.pitneybowes.api360.ApiException;
import com.pitneybowes.api360.Configuration;
import com.pitneybowes.api360.auth.*;
import com.pitneybowes.api360.models.*;
import com.pitneybowes.api360.api.AddressApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-sandbox.sendpro360.pitneybowes.com/shipping");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        AddressApi apiInstance = new AddressApi(defaultClient);
        AddressSuggestRequest addressSuggestRequest = new AddressSuggestRequest(); // AddressSuggestRequest | 
        try {
            AddressSuggestResponse result = apiInstance.addressSuggest(addressSuggestRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AddressApi#addressSuggest");
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
| **addressSuggestRequest** | [**AddressSuggestRequest**](AddressSuggestRequest.md)|  | |

### Return type

[**AddressSuggestResponse**](AddressSuggestResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The address is suggested to use. |  -  |
| **400** | Invalid request. |  -  |
| **401** | The request could not be authorized. |  -  |
| **500** | The request could not be completed due to an internal error. |  -  |


## addressValidate

> AddressValidateResponse addressValidate(addressValidateRequest, minimalAddressValidation)

Address Validate

This operation validates address. This improves postal addresses within the country (e.g., United States) to help ensure that parcels are rated accurately and shipments arrive at the final destination on time.&lt;br&gt; The verify address operation sends an address to be verified. The response indicates whether the address is valid.

### Example

```java
// Import classes:
import com.pitneybowes.api360.ApiClient;
import com.pitneybowes.api360.ApiException;
import com.pitneybowes.api360.Configuration;
import com.pitneybowes.api360.auth.*;
import com.pitneybowes.api360.models.*;
import com.pitneybowes.api360.api.AddressApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-sandbox.sendpro360.pitneybowes.com/shipping");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        AddressApi apiInstance = new AddressApi(defaultClient);
        AddressValidateRequest addressValidateRequest = new AddressValidateRequest(); // AddressValidateRequest | 
        Boolean minimalAddressValidation = true; // Boolean | If true, then only City, State, and PostalCode (zip) are validated. This option is specific for US domestic addresses only.
        try {
            AddressValidateResponse result = apiInstance.addressValidate(addressValidateRequest, minimalAddressValidation);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AddressApi#addressValidate");
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
| **addressValidateRequest** | [**AddressValidateRequest**](AddressValidateRequest.md)|  | |
| **minimalAddressValidation** | **Boolean**| If true, then only City, State, and PostalCode (zip) are validated. This option is specific for US domestic addresses only. | [optional] |

### Return type

[**AddressValidateResponse**](AddressValidateResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The address has been verified. |  -  |
| **400** | Invalid request. |  -  |
| **401** | The request could not be authorized. |  -  |
| **500** | The request could not be completed due to an internal error. |  -  |

