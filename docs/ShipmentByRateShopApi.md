# ShipmentByRateShopApi

All URIs are relative to *https://api-sandbox.sendpro360.pitneybowes.com/shipping*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**cancelShipmentByIdV2**](ShipmentByRateShopApi.md#cancelShipmentByIdV2) | **POST** /api/v2/shipments/cancel | Cancel Shipment |
| [**createShipmentV2**](ShipmentByRateShopApi.md#createShipmentV2) | **POST** /api/v2/shipments | Create Shipment |
| [**reprintShipmentByIdV2**](ShipmentByRateShopApi.md#reprintShipmentByIdV2) | **POST** /api/v2/shipments/reprint | Reprint Shipment |



## cancelShipmentByIdV2

> CancelShipmentV2 cancelShipmentByIdV2(shipmentCancelV2, xPBDeveloperPartnerId, xPBLocationId, xPBTransactionId)

Cancel Shipment

The operation cancel/void shipment.

### Example

```java
// Import classes:
import com.pitneybowes.api360.ApiClient;
import com.pitneybowes.api360.ApiException;
import com.pitneybowes.api360.Configuration;
import com.pitneybowes.api360.auth.*;
import com.pitneybowes.api360.models.*;
import com.pitneybowes.api360.api.ShipmentByRateShopApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-sandbox.sendpro360.pitneybowes.com/shipping");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        ShipmentByRateShopApi apiInstance = new ShipmentByRateShopApi(defaultClient);
        ShipmentCancelV2 shipmentCancelV2 = new ShipmentCancelV2(); // ShipmentCancelV2 | 
        String xPBDeveloperPartnerId = "xPBDeveloperPartnerId_example"; // String | The Developer Partner ID is assigned by PB to uniquely identify a Developer's strategic business partners. If the developer is the sole business partner, this field isn't required.
        String xPBLocationId = "xPBLocationId_example"; // String | This is the Location ID assigned as per the Developer's and Partner's parsed locations, to which all transactions will be billed. <br /> Partner's location will be used for billing if it is configured, however, in case Partner's location is not given, then the Developer's location will be taken. Developer's location will be the default value. <br /> Additionally, Developers and Partners can use carriers belong to this location only.
        String xPBTransactionId = "xPBTransactionId_example"; // String | A unique Transaction ID provided by the partner which is used to enable debugging and linking between the client's transaction and the system.
        try {
            CancelShipmentV2 result = apiInstance.cancelShipmentByIdV2(shipmentCancelV2, xPBDeveloperPartnerId, xPBLocationId, xPBTransactionId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ShipmentByRateShopApi#cancelShipmentByIdV2");
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
| **shipmentCancelV2** | [**ShipmentCancelV2**](ShipmentCancelV2.md)|  | |
| **xPBDeveloperPartnerId** | **String**| The Developer Partner ID is assigned by PB to uniquely identify a Developer&#39;s strategic business partners. If the developer is the sole business partner, this field isn&#39;t required. | [optional] |
| **xPBLocationId** | **String**| This is the Location ID assigned as per the Developer&#39;s and Partner&#39;s parsed locations, to which all transactions will be billed. &lt;br /&gt; Partner&#39;s location will be used for billing if it is configured, however, in case Partner&#39;s location is not given, then the Developer&#39;s location will be taken. Developer&#39;s location will be the default value. &lt;br /&gt; Additionally, Developers and Partners can use carriers belong to this location only. | [optional] |
| **xPBTransactionId** | **String**| A unique Transaction ID provided by the partner which is used to enable debugging and linking between the client&#39;s transaction and the system. | [optional] |

### Return type

[**CancelShipmentV2**](CancelShipmentV2.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The Shipment has been cancelled. |  -  |
| **400** | Invalid request. |  -  |
| **401** | The request could not be authorized. |  -  |
| **404** | The requested resource was not found. |  -  |
| **500** | The request could not be completed due to an internal error. |  -  |


## createShipmentV2

> DomesticShipmentResponseV2 createShipmentV2(createShipmentV2Request, xPBDeveloperPartnerId, xPBLocationId, xPBTransactionId)

Create Shipment

The operation creates a new Shipment or generate a Shipment Label. - To create a domestic shipment, the operation requires   - Domestic addresses &#39;To&#39; and &#39;From&#39; locations respectively within the same country   - carrier services, and   - associated special services. - While for the International shipment, the operation requires   - International address(es) for delivery, that is &#39;To&#39; address must be the international country location(s) and not the same country mentioned in &#39;From&#39; address   - supported international carrier services   - associated special service(s), and    - customs information. 

### Example

```java
// Import classes:
import com.pitneybowes.api360.ApiClient;
import com.pitneybowes.api360.ApiException;
import com.pitneybowes.api360.Configuration;
import com.pitneybowes.api360.auth.*;
import com.pitneybowes.api360.models.*;
import com.pitneybowes.api360.api.ShipmentByRateShopApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-sandbox.sendpro360.pitneybowes.com/shipping");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        ShipmentByRateShopApi apiInstance = new ShipmentByRateShopApi(defaultClient);
        CreateShipmentV2Request createShipmentV2Request = new CreateShipmentV2Request(); // CreateShipmentV2Request | 
        String xPBDeveloperPartnerId = "xPBDeveloperPartnerId_example"; // String | The Developer Partner ID is assigned by PB to uniquely identify a Developer's strategic business partners. If the developer is the sole business partner, this field isn't required.
        String xPBLocationId = "xPBLocationId_example"; // String | This is the Location ID assigned as per the Developer's and Partner's parsed locations, to which all transactions will be billed. <br /> Partner's location will be used for billing if it is configured, however, in case Partner's location is not given, then the Developer's location will be taken. Developer's location will be the default value. <br /> Additionally, Developers and Partners can use carriers belong to this location only.
        String xPBTransactionId = "xPBTransactionId_example"; // String | A unique Transaction ID provided by the partner, which is used to enable debugging and linking between the client's transaction and the system.
        try {
            DomesticShipmentResponseV2 result = apiInstance.createShipmentV2(createShipmentV2Request, xPBDeveloperPartnerId, xPBLocationId, xPBTransactionId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ShipmentByRateShopApi#createShipmentV2");
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
| **createShipmentV2Request** | [**CreateShipmentV2Request**](CreateShipmentV2Request.md)|  | |
| **xPBDeveloperPartnerId** | **String**| The Developer Partner ID is assigned by PB to uniquely identify a Developer&#39;s strategic business partners. If the developer is the sole business partner, this field isn&#39;t required. | [optional] |
| **xPBLocationId** | **String**| This is the Location ID assigned as per the Developer&#39;s and Partner&#39;s parsed locations, to which all transactions will be billed. &lt;br /&gt; Partner&#39;s location will be used for billing if it is configured, however, in case Partner&#39;s location is not given, then the Developer&#39;s location will be taken. Developer&#39;s location will be the default value. &lt;br /&gt; Additionally, Developers and Partners can use carriers belong to this location only. | [optional] |
| **xPBTransactionId** | **String**| A unique Transaction ID provided by the partner, which is used to enable debugging and linking between the client&#39;s transaction and the system. | [optional] |

### Return type

[**DomesticShipmentResponseV2**](DomesticShipmentResponseV2.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The shipment has been created successfully. |  -  |
| **400** | Invalid request. |  -  |
| **401** | The request could not be authorized. |  -  |
| **500** | The request could not be completed due to an internal error. |  -  |


## reprintShipmentByIdV2

> ReprintShipmentV2 reprintShipmentByIdV2(shipmentReprintV2, xPBDeveloperPartnerId, xPBLocationId, xPBTransactionId)

Reprint Shipment

The operation reprints Shipment by the shipmentId. It retrieves an existing shipping label to reprint. The API sends the shipmentID returned by the original created shipment request. Use this only if the shipping label in the Create Shipment response is missing or lost.

### Example

```java
// Import classes:
import com.pitneybowes.api360.ApiClient;
import com.pitneybowes.api360.ApiException;
import com.pitneybowes.api360.Configuration;
import com.pitneybowes.api360.auth.*;
import com.pitneybowes.api360.models.*;
import com.pitneybowes.api360.api.ShipmentByRateShopApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-sandbox.sendpro360.pitneybowes.com/shipping");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        ShipmentByRateShopApi apiInstance = new ShipmentByRateShopApi(defaultClient);
        ShipmentReprintV2 shipmentReprintV2 = new ShipmentReprintV2(); // ShipmentReprintV2 | 
        String xPBDeveloperPartnerId = "xPBDeveloperPartnerId_example"; // String | The Developer Partner ID is assigned by PB to uniquely identify a Developer's strategic business partners. If the developer is the sole business partner, this field isn't required.
        String xPBLocationId = "xPBLocationId_example"; // String | This is the Location ID assigned as per the Developer's and Partner's parsed locations, to which all transactions will be billed. <br /> Partner's location will be used for billing if it is configured, however, in case Partner's location is not given, then the Developer's location will be taken. Developer's location will be the default value. <br /> Additionally, Developers and Partners can use carriers belong to this location only.
        String xPBTransactionId = "xPBTransactionId_example"; // String | A unique transaction Id provided by the partner which is used to enable debugging and linking between the client's transaction and the system.
        try {
            ReprintShipmentV2 result = apiInstance.reprintShipmentByIdV2(shipmentReprintV2, xPBDeveloperPartnerId, xPBLocationId, xPBTransactionId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ShipmentByRateShopApi#reprintShipmentByIdV2");
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
| **shipmentReprintV2** | [**ShipmentReprintV2**](ShipmentReprintV2.md)|  | |
| **xPBDeveloperPartnerId** | **String**| The Developer Partner ID is assigned by PB to uniquely identify a Developer&#39;s strategic business partners. If the developer is the sole business partner, this field isn&#39;t required. | [optional] |
| **xPBLocationId** | **String**| This is the Location ID assigned as per the Developer&#39;s and Partner&#39;s parsed locations, to which all transactions will be billed. &lt;br /&gt; Partner&#39;s location will be used for billing if it is configured, however, in case Partner&#39;s location is not given, then the Developer&#39;s location will be taken. Developer&#39;s location will be the default value. &lt;br /&gt; Additionally, Developers and Partners can use carriers belong to this location only. | [optional] |
| **xPBTransactionId** | **String**| A unique transaction Id provided by the partner which is used to enable debugging and linking between the client&#39;s transaction and the system. | [optional] |

### Return type

[**ReprintShipmentV2**](ReprintShipmentV2.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The shipment has been reprinted. |  -  |
| **400** | Invalid request. |  -  |
| **401** | The request could not be authorized. |  -  |
| **404** | The requested resource was not found. |  -  |
| **500** | The request could not be completed due to an internal error. |  -  |

