# MultipieceApi

All URIs are relative to *https://api-sandbox.sendpro360.pitneybowes.com/shipping*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**multipieceRates**](MultipieceApi.md#multipieceRates) | **POST** /api/v1/multipiece/rates | Multipiece Rateshop and Rates |
| [**multipieceShipment**](MultipieceApi.md#multipieceShipment) | **POST** /api/v1/multipiece/shipments | Multipiece Shipment |
| [**multipieceShipmentCancel**](MultipieceApi.md#multipieceShipmentCancel) | **PUT** /api/v1/multipiece/shipments/{shipmentId}/cancel | Cancel Multipiece Shipment |
| [**multipieceShipmentReprint**](MultipieceApi.md#multipieceShipmentReprint) | **GET** /api/v1/multipiece/shipments/{shipmentId}/reprint | Reprint Multipiece Shipment |



## multipieceRates

> MultipieceRates200Response multipieceRates(multipieceRatesRequest, xPBDeveloperPartnerID)

Multipiece Rateshop and Rates

This API contains 2 operations, rate shop and single rate. Rate shop will fetch rates for all carrier services based on the given addresses (From and To), weight, and dimension for given parcelType in multiPieceParcels object. Single rate will get rate for specific service and special service (if requested) based on the given addresses (From and To), weight, and dimension, parcelType and serviceId with or without specialServices. Single rate will be used mainly to a rate a shipment before creating shipment.  &lt;br&gt; For UPS- multipiece shipment with Envelopes (having parcel Type as LTR) is not supported.  &lt;br&gt; For FEDEX Multipiece, all parcels must be of same packaging type while creating multipiece shipment

### Example

```java
// Import classes:
import com.pitneybowes.api360.ApiClient;
import com.pitneybowes.api360.ApiException;
import com.pitneybowes.api360.Configuration;
import com.pitneybowes.api360.auth.*;
import com.pitneybowes.api360.models.*;
import com.pitneybowes.api360.api.MultipieceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-sandbox.sendpro360.pitneybowes.com/shipping");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        MultipieceApi apiInstance = new MultipieceApi(defaultClient);
        MultipieceRatesRequest multipieceRatesRequest = new MultipieceRatesRequest(); // MultipieceRatesRequest | 
        String xPBDeveloperPartnerID = "xPBDeveloperPartnerID_example"; // String | This is the Develover Partner ID. When the developer is the only partner, this field is not required.
        try {
            MultipieceRates200Response result = apiInstance.multipieceRates(multipieceRatesRequest, xPBDeveloperPartnerID);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MultipieceApi#multipieceRates");
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
| **multipieceRatesRequest** | [**MultipieceRatesRequest**](MultipieceRatesRequest.md)|  | |
| **xPBDeveloperPartnerID** | **String**| This is the Develover Partner ID. When the developer is the only partner, this field is not required. | [optional] |

### Return type

[**MultipieceRates200Response**](MultipieceRates200Response.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The Multipiece Rates created successfully. |  -  |
| **400** | Invalid request. |  -  |
| **401** | The request could not be authorized. |  -  |
| **500** | The request could not be completed due to an internal error. |  -  |


## multipieceShipment

> MultipieceShipment200Response multipieceShipment(multipieceShipmentRequest, xPBDeveloperPartnerID)

Multipiece Shipment

This operation is used to create Multipiece Shipments. UPS, FedEx and DHL Express are supported for Multipiece Shipments.  &lt;br&gt; For UPS- multipiece shipment with Envelopes (having parcel Type as LTR) is not supported.  &lt;br&gt; For FEDEX Multipiece, all parcels must be of same packaging type while creating multipiece shipment

### Example

```java
// Import classes:
import com.pitneybowes.api360.ApiClient;
import com.pitneybowes.api360.ApiException;
import com.pitneybowes.api360.Configuration;
import com.pitneybowes.api360.auth.*;
import com.pitneybowes.api360.models.*;
import com.pitneybowes.api360.api.MultipieceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-sandbox.sendpro360.pitneybowes.com/shipping");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        MultipieceApi apiInstance = new MultipieceApi(defaultClient);
        MultipieceShipmentRequest multipieceShipmentRequest = new MultipieceShipmentRequest(); // MultipieceShipmentRequest | 
        String xPBDeveloperPartnerID = "xPBDeveloperPartnerID_example"; // String | This is the Develover Partner ID. When the developer is the only partner, this field is not required.
        try {
            MultipieceShipment200Response result = apiInstance.multipieceShipment(multipieceShipmentRequest, xPBDeveloperPartnerID);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MultipieceApi#multipieceShipment");
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
| **multipieceShipmentRequest** | [**MultipieceShipmentRequest**](MultipieceShipmentRequest.md)|  | |
| **xPBDeveloperPartnerID** | **String**| This is the Develover Partner ID. When the developer is the only partner, this field is not required. | [optional] |

### Return type

[**MultipieceShipment200Response**](MultipieceShipment200Response.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The Multipiece Shipment created successfully. |  -  |
| **400** | Invalid request. |  -  |
| **401** | The request could not be authorized. |  -  |
| **500** | The request could not be completed due to an internal error. |  -  |


## multipieceShipmentCancel

> CancelShipment multipieceShipmentCancel(shipmentId, xPBDeveloperPartnerID)

Cancel Multipiece Shipment

This operation is used to cancel the multipiece label. It takes the shipmentId of the multipiece shipment done.

### Example

```java
// Import classes:
import com.pitneybowes.api360.ApiClient;
import com.pitneybowes.api360.ApiException;
import com.pitneybowes.api360.Configuration;
import com.pitneybowes.api360.auth.*;
import com.pitneybowes.api360.models.*;
import com.pitneybowes.api360.api.MultipieceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-sandbox.sendpro360.pitneybowes.com/shipping");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        MultipieceApi apiInstance = new MultipieceApi(defaultClient);
        String shipmentId = "shipmentId_example"; // String | It specifies the shipmentId of onward shipment against which return label has to be created.
        String xPBDeveloperPartnerID = "xPBDeveloperPartnerID_example"; // String | This is the Develover Partner ID. When the developer is the only partner, this field is not required.
        try {
            CancelShipment result = apiInstance.multipieceShipmentCancel(shipmentId, xPBDeveloperPartnerID);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MultipieceApi#multipieceShipmentCancel");
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
| **shipmentId** | **String**| It specifies the shipmentId of onward shipment against which return label has to be created. | |
| **xPBDeveloperPartnerID** | **String**| This is the Develover Partner ID. When the developer is the only partner, this field is not required. | [optional] |

### Return type

[**CancelShipment**](CancelShipment.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The Multipiece Shipment created successfully. |  -  |
| **400** | Invalid request. |  -  |
| **401** | The request could not be authorized. |  -  |
| **500** | The request could not be completed due to an internal error. |  -  |


## multipieceShipmentReprint

> MultipieceDomesticShipmentResponse multipieceShipmentReprint(shipmentId, xPBDeveloperPartnerID)

Reprint Multipiece Shipment

This operation is used to reprint the multipiece label. It takes the shipmentId of the multipiece shipment done.

### Example

```java
// Import classes:
import com.pitneybowes.api360.ApiClient;
import com.pitneybowes.api360.ApiException;
import com.pitneybowes.api360.Configuration;
import com.pitneybowes.api360.auth.*;
import com.pitneybowes.api360.models.*;
import com.pitneybowes.api360.api.MultipieceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-sandbox.sendpro360.pitneybowes.com/shipping");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        MultipieceApi apiInstance = new MultipieceApi(defaultClient);
        String shipmentId = "shipmentId_example"; // String | It specifies the shipmentId of onward shipment against which return label has to be created.
        String xPBDeveloperPartnerID = "xPBDeveloperPartnerID_example"; // String | This is the Develover Partner ID. When the developer is the only partner, this field is not required.
        try {
            MultipieceDomesticShipmentResponse result = apiInstance.multipieceShipmentReprint(shipmentId, xPBDeveloperPartnerID);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MultipieceApi#multipieceShipmentReprint");
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
| **shipmentId** | **String**| It specifies the shipmentId of onward shipment against which return label has to be created. | |
| **xPBDeveloperPartnerID** | **String**| This is the Develover Partner ID. When the developer is the only partner, this field is not required. | [optional] |

### Return type

[**MultipieceDomesticShipmentResponse**](MultipieceDomesticShipmentResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The Multipiece Shipment created successfully. |  -  |
| **400** | Invalid request. |  -  |
| **401** | The request could not be authorized. |  -  |
| **500** | The request could not be completed due to an internal error. |  -  |

