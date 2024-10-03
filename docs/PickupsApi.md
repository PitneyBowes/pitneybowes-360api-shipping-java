# PickupsApi

All URIs are relative to *https://api-sandbox.sendpro360.pitneybowes.com/shipping*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**cancelPickups**](PickupsApi.md#cancelPickups) | **PUT** /api/v1/pickups/cancel | Cancel Pickups |
| [**cancelledPickupDocument**](PickupsApi.md#cancelledPickupDocument) | **POST** /api/v1/pickups/document | Cancelled Pickup Document |
| [**getPickupDocument**](PickupsApi.md#getPickupDocument) | **GET** /api/v1/pickups/{pickupId}/document | Get Pickup Document |
| [**getPickups**](PickupsApi.md#getPickups) | **GET** /api/v1/pickups | Get Pickups |
| [**schedulePickup**](PickupsApi.md#schedulePickup) | **POST** /api/v1/pickups | Schedule Pickup |



## cancelPickups

> SchedulePickupCancelResponse cancelPickups(schedulePickupCancelRequest, xPBDeveloperPartnerID)

Cancel Pickups

This operation is used to Cancel the scheduled pickup.

### Example

```java
// Import classes:
import com.pitneybowes.api360.ApiClient;
import com.pitneybowes.api360.ApiException;
import com.pitneybowes.api360.Configuration;
import com.pitneybowes.api360.auth.*;
import com.pitneybowes.api360.models.*;
import com.pitneybowes.api360.api.PickupsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-sandbox.sendpro360.pitneybowes.com/shipping");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        PickupsApi apiInstance = new PickupsApi(defaultClient);
        SchedulePickupCancelRequest schedulePickupCancelRequest = new SchedulePickupCancelRequest(); // SchedulePickupCancelRequest | 
        String xPBDeveloperPartnerID = "xPBDeveloperPartnerID_example"; // String | This is the Developer Partner ID. When the developer is the only partner, this field is not required.
        try {
            SchedulePickupCancelResponse result = apiInstance.cancelPickups(schedulePickupCancelRequest, xPBDeveloperPartnerID);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PickupsApi#cancelPickups");
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
| **schedulePickupCancelRequest** | [**SchedulePickupCancelRequest**](SchedulePickupCancelRequest.md)|  | |
| **xPBDeveloperPartnerID** | **String**| This is the Developer Partner ID. When the developer is the only partner, this field is not required. | [optional] |

### Return type

[**SchedulePickupCancelResponse**](SchedulePickupCancelResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Pick up cancelled successfully. |  -  |
| **400** | Invalid request. |  -  |
| **401** | The request could not be authorized. |  -  |
| **500** | The request could not be completed due to an internal error. |  -  |


## cancelledPickupDocument

> GetPickupCancelledDocumentResponse cancelledPickupDocument(type, getPickupCancelledDocumentRequest, xPBDeveloperPartnerID)

Cancelled Pickup Document

This operation is used to get receipt for pickup cancellation. The receipt generated is in PDF format. &lt;br&gt; This operation can create receipt for multiple pickups which are cancelled.

### Example

```java
// Import classes:
import com.pitneybowes.api360.ApiClient;
import com.pitneybowes.api360.ApiException;
import com.pitneybowes.api360.Configuration;
import com.pitneybowes.api360.auth.*;
import com.pitneybowes.api360.models.*;
import com.pitneybowes.api360.api.PickupsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-sandbox.sendpro360.pitneybowes.com/shipping");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        PickupsApi apiInstance = new PickupsApi(defaultClient);
        String type = "cancelled"; // String | Indicates type of pickup. Supported value is `cancelled`.
        GetPickupCancelledDocumentRequest getPickupCancelledDocumentRequest = new GetPickupCancelledDocumentRequest(); // GetPickupCancelledDocumentRequest | 
        String xPBDeveloperPartnerID = "xPBDeveloperPartnerID_example"; // String | This is the Developer Partner ID. When the developer is the only partner, this field is not required.
        try {
            GetPickupCancelledDocumentResponse result = apiInstance.cancelledPickupDocument(type, getPickupCancelledDocumentRequest, xPBDeveloperPartnerID);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PickupsApi#cancelledPickupDocument");
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
| **type** | **String**| Indicates type of pickup. Supported value is &#x60;cancelled&#x60;. | [enum: cancelled] |
| **getPickupCancelledDocumentRequest** | [**GetPickupCancelledDocumentRequest**](GetPickupCancelledDocumentRequest.md)|  | |
| **xPBDeveloperPartnerID** | **String**| This is the Developer Partner ID. When the developer is the only partner, this field is not required. | [optional] |

### Return type

[**GetPickupCancelledDocumentResponse**](GetPickupCancelledDocumentResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The pick up has been cancelled. |  -  |
| **400** | Invalid request. |  -  |
| **401** | The request could not be authorized. |  -  |
| **500** | The request could not be completed due to an internal error. |  -  |


## getPickupDocument

> GetPickupDocument getPickupDocument(pickupId, xPBDeveloperPartnerID)

Get Pickup Document

This operation returns the scheduled pickup or cancellation receipt in PDF format.

### Example

```java
// Import classes:
import com.pitneybowes.api360.ApiClient;
import com.pitneybowes.api360.ApiException;
import com.pitneybowes.api360.Configuration;
import com.pitneybowes.api360.auth.*;
import com.pitneybowes.api360.models.*;
import com.pitneybowes.api360.api.PickupsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-sandbox.sendpro360.pitneybowes.com/shipping");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        PickupsApi apiInstance = new PickupsApi(defaultClient);
        String pickupId = "pickupId_example"; // String | It specified the pickupId for which PDF receipt is needed.
        String xPBDeveloperPartnerID = "xPBDeveloperPartnerID_example"; // String | This is the Developer Partner ID. When the developer is the only partner, this field is not required.
        try {
            GetPickupDocument result = apiInstance.getPickupDocument(pickupId, xPBDeveloperPartnerID);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PickupsApi#getPickupDocument");
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
| **pickupId** | **String**| It specified the pickupId for which PDF receipt is needed. | |
| **xPBDeveloperPartnerID** | **String**| This is the Developer Partner ID. When the developer is the only partner, this field is not required. | [optional] |

### Return type

[**GetPickupDocument**](GetPickupDocument.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Pick up document have been fetched. |  * X-Pb-Transactionid - The X-PB-TransactionId is unique id for this request. <br>  |
| **400** | Invalid request. |  -  |
| **401** | The request could not be authorized. |  -  |
| **500** | The request could not be completed due to an internal error. |  -  |


## getPickups

> GetAllPickups getPickups(xPBDeveloperPartnerID, carrier, startDate, endDate, status, page, size)

Get Pickups

This operation is used to view the history of pickups scheduled or cancelled for your packages.

### Example

```java
// Import classes:
import com.pitneybowes.api360.ApiClient;
import com.pitneybowes.api360.ApiException;
import com.pitneybowes.api360.Configuration;
import com.pitneybowes.api360.auth.*;
import com.pitneybowes.api360.models.*;
import com.pitneybowes.api360.api.PickupsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-sandbox.sendpro360.pitneybowes.com/shipping");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        PickupsApi apiInstance = new PickupsApi(defaultClient);
        String xPBDeveloperPartnerID = "xPBDeveloperPartnerID_example"; // String | This is the Developer Partner ID. When the developer is the only partner, this field is not required.
        String carrier = "carrier_example"; // String | Indicates CarrierID. If not provided, it would show pickups for all the carriers.
        String startDate = "startDate_example"; // String | Indicates start date from when you want to see the history. If not provided, it will take today's date.
        String endDate = "endDate_example"; // String | Indicates end date till you want to see the pickups history. If not provide, it will take today's date.
        String status = "scheduled"; // String | Indicates status of the pickup(schedule or cancel). If not provided, it will show the response for both status.
        BigDecimal page = new BigDecimal(78); // BigDecimal | Indicates page number, if not provided page would be 1.
        BigDecimal size = new BigDecimal(78); // BigDecimal | Indicates size of records, if not provided size would be 20
        try {
            GetAllPickups result = apiInstance.getPickups(xPBDeveloperPartnerID, carrier, startDate, endDate, status, page, size);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PickupsApi#getPickups");
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
| **carrier** | **String**| Indicates CarrierID. If not provided, it would show pickups for all the carriers. | [optional] |
| **startDate** | **String**| Indicates start date from when you want to see the history. If not provided, it will take today&#39;s date. | [optional] |
| **endDate** | **String**| Indicates end date till you want to see the pickups history. If not provide, it will take today&#39;s date. | [optional] |
| **status** | **String**| Indicates status of the pickup(schedule or cancel). If not provided, it will show the response for both status. | [optional] [enum: scheduled, cancelled] |
| **page** | **BigDecimal**| Indicates page number, if not provided page would be 1. | [optional] |
| **size** | **BigDecimal**| Indicates size of records, if not provided size would be 20 | [optional] |

### Return type

[**GetAllPickups**](GetAllPickups.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | List of pickups. |  -  |
| **400** | Invalid request. |  -  |
| **401** | The request could not be authorized. |  -  |
| **500** | The request could not be completed due to an internal error. |  -  |


## schedulePickup

> SchedulePickup200Response schedulePickup(schedulePickupRequest, xPBDeveloperPartnerID)

Schedule Pickup

This operation allows to schedule Pickups with USPS, UPS, FedEx and DHLExpress for eligible shipments. &lt;br&gt; Below are four possible combinations for scheduling pickup &lt;br&gt;  &lt;br&gt; 1. When request does not specify &#x60;pickupSummary&#x60; and &#x60;shipmentIds&#x60;- The system would consider all eligible shipments created in a current day. &lt;br&gt; 2. When request specifies only &#x60;shipmentIds&#x60;- Pickup will be created for the shipmentIds mentioned &lt;br&gt; 3. When request specifies only &#x60;pickupSummary&#x60;- Pickup will be created for the pickup details mentioned in the pickupSummary &lt;br&gt; 4. When request specifies both &#x60;pickupSummary&#x60; and &#x60;shipmentIds&#x60;- Pickup will be created including details mentioned in both objects.

### Example

```java
// Import classes:
import com.pitneybowes.api360.ApiClient;
import com.pitneybowes.api360.ApiException;
import com.pitneybowes.api360.Configuration;
import com.pitneybowes.api360.auth.*;
import com.pitneybowes.api360.models.*;
import com.pitneybowes.api360.api.PickupsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-sandbox.sendpro360.pitneybowes.com/shipping");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        PickupsApi apiInstance = new PickupsApi(defaultClient);
        SchedulePickupRequest schedulePickupRequest = new SchedulePickupRequest(); // SchedulePickupRequest | 
        String xPBDeveloperPartnerID = "xPBDeveloperPartnerID_example"; // String | This is the Developer Partner ID. When the developer is the only partner, this field is not required.
        try {
            SchedulePickup200Response result = apiInstance.schedulePickup(schedulePickupRequest, xPBDeveloperPartnerID);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PickupsApi#schedulePickup");
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
| **schedulePickupRequest** | [**SchedulePickupRequest**](SchedulePickupRequest.md)|  | |
| **xPBDeveloperPartnerID** | **String**| This is the Developer Partner ID. When the developer is the only partner, this field is not required. | [optional] |

### Return type

[**SchedulePickup200Response**](SchedulePickup200Response.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The Pick up has been created successfully. |  -  |
| **400** | Invalid request. |  -  |
| **401** | The request could not be authorized. |  -  |
| **500** | The request could not be completed due to an internal error. |  -  |

