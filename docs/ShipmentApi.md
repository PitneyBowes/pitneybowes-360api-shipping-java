# ShipmentApi

All URIs are relative to *https://api-sandbox.sendpro360.pitneybowes.com/shipping*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**cancelShipmentById**](ShipmentApi.md#cancelShipmentById) | **PUT** /api/v1/shipments/{shipmentId}/cancel | Cancel Shipment |
| [**cancelStampsERR**](ShipmentApi.md#cancelStampsERR) | **POST** /api/v1/err/stamps/void | Cancel Stamps ERR |
| [**createReturnLabel**](ShipmentApi.md#createReturnLabel) | **POST** /api/v1/shipments/{shipmentId}/return | Create Return label shipment |
| [**createShipment**](ShipmentApi.md#createShipment) | **POST** /api/v1/shipments | Create Shipment |
| [**downloadBpodFiles**](ShipmentApi.md#downloadBpodFiles) | **POST** /api/v1/err/shipments/bpod | Download BPOD Files |
| [**getAllShipments**](ShipmentApi.md#getAllShipments) | **GET** /api/v1/shipments | Get All Shipments |
| [**getCarrierAccounts**](ShipmentApi.md#getCarrierAccounts) | **GET** /api/v1/carrierAccounts | Get Carrier Accounts |
| [**getCarriers**](ShipmentApi.md#getCarriers) | **GET** /api/v1/carriers | Get Carriers |
| [**getCountries**](ShipmentApi.md#getCountries) | **GET** /api/v1/countries | Get Countries |
| [**getParcelTypes**](ShipmentApi.md#getParcelTypes) | **GET** /api/v1/parcelTypes | Get Parcel Types |
| [**getRates**](ShipmentApi.md#getRates) | **POST** /api/v1/rates | Rate Shop and Get Single Rate |
| [**getServices**](ShipmentApi.md#getServices) | **GET** /api/v1/services | Get Services |
| [**getSignatureImageERR**](ShipmentApi.md#getSignatureImageERR) | **GET** /api/v1/err/shipments/{shipmentId}/signaturefile | Signature Image ERR |
| [**getSpecialServices**](ShipmentApi.md#getSpecialServices) | **GET** /api/v1/specialServices | Get Special Services |
| [**reprintShipmentById**](ShipmentApi.md#reprintShipmentById) | **GET** /api/v1/shipments/{shipmentId}/reprint | Reprint Shipment |
| [**shipmentById**](ShipmentApi.md#shipmentById) | **GET** /api/v1/shipments/{shipmentId} | Get Shipment by Id |



## cancelShipmentById

> CancelShipment cancelShipmentById(shipmentId, xPBDeveloperPartnerID)

Cancel Shipment

This operation cancel/void shipment.

### Example

```java
// Import classes:
import com.pitneybowes.api360.ApiClient;
import com.pitneybowes.api360.ApiException;
import com.pitneybowes.api360.Configuration;
import com.pitneybowes.api360.auth.*;
import com.pitneybowes.api360.models.*;
import com.pitneybowes.api360.api.ShipmentApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-sandbox.sendpro360.pitneybowes.com/shipping");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        ShipmentApi apiInstance = new ShipmentApi(defaultClient);
        String shipmentId = "shipmentId_example"; // String | This indicates the shipmentId, a unique identifier assigned for the Shipment.
        String xPBDeveloperPartnerID = "xPBDeveloperPartnerID_example"; // String | This is the Developer Partner ID. When the developer is the only partner, this field is not required.
        try {
            CancelShipment result = apiInstance.cancelShipmentById(shipmentId, xPBDeveloperPartnerID);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ShipmentApi#cancelShipmentById");
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
| **shipmentId** | **String**| This indicates the shipmentId, a unique identifier assigned for the Shipment. | |
| **xPBDeveloperPartnerID** | **String**| This is the Developer Partner ID. When the developer is the only partner, this field is not required. | [optional] |

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
| **200** | The Shipment has been cancelled. |  -  |
| **400** | Invalid request. |  -  |
| **401** | The request could not be authorized. |  -  |
| **404** | The requested resource was not found. |  -  |
| **500** | The request could not be completed due to an internal error. |  -  |


## cancelStampsERR

> CancelStampsResponseERR cancelStampsERR(cancelStampsRequestERR, xPBDeveloperPartnerID)

Cancel Stamps ERR

This operation cancels (voids) stamps generated for ERR (Electronic Return Receipt).  - User needs to provide *Stamp IDs* to cancel those specific ERR stamps.  - User can download the *Refund Form* having details of generated Postage.  - At once, maximum 1000 stamps can be requested for cancelation. 

### Example

```java
// Import classes:
import com.pitneybowes.api360.ApiClient;
import com.pitneybowes.api360.ApiException;
import com.pitneybowes.api360.Configuration;
import com.pitneybowes.api360.auth.*;
import com.pitneybowes.api360.models.*;
import com.pitneybowes.api360.api.ShipmentApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-sandbox.sendpro360.pitneybowes.com/shipping");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        ShipmentApi apiInstance = new ShipmentApi(defaultClient);
        CancelStampsRequestERR cancelStampsRequestERR = new CancelStampsRequestERR(); // CancelStampsRequestERR | 
        String xPBDeveloperPartnerID = "xPBDeveloperPartnerID_example"; // String | The Developer Partner ID is assigned by PB to uniquely identify a Developer's strategic business partners. If the developer is the sole business partner, this field is not required.
        try {
            CancelStampsResponseERR result = apiInstance.cancelStampsERR(cancelStampsRequestERR, xPBDeveloperPartnerID);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ShipmentApi#cancelStampsERR");
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
| **cancelStampsRequestERR** | [**CancelStampsRequestERR**](CancelStampsRequestERR.md)|  | |
| **xPBDeveloperPartnerID** | **String**| The Developer Partner ID is assigned by PB to uniquely identify a Developer&#39;s strategic business partners. If the developer is the sole business partner, this field is not required. | [optional] |

### Return type

[**CancelStampsResponseERR**](CancelStampsResponseERR.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/pdf, application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Stamps Refund Form has been generated. |  -  |
| **400** | Invalid request. |  -  |
| **401** | The request could not be authorized. |  -  |
| **500** | The request could not be completed due to an internal error. |  -  |


## createReturnLabel

> ReturnLabelResponse createReturnLabel(shipmentId, returnLabel, xPBDeveloperPartnerID)

Create Return label shipment

This operation creates a return label based on a previous shipment. &lt;br&gt; The return label can be created in two ways:  &lt;br&gt; 1. User need not to provide any details of package, address and service. The API would take all details from the shipmentId mentioned in the path parameter and would swap the address and create return label. However for UPS &#x60;specialServices&#x60; object is required as carrier mandates to provide package description with PRL special service. &lt;br&gt; 2. User can customize the request by passing &#x60;fromAddress&#x60;, &#x60;toAddress&#x60;, &#x60;parcelType&#x60;, &#x60;serviceId&#x60; in the request itself. &lt;br&gt; Please Note that for UPS it is required to pass &#x60;specialServices&#x60; object with &#x60;PRL&#x60; service id and  input parameters with name as &#x60;RETURN_PKG_DESCRIPTION&#x60;. &lt;br&gt; For FedEx &#x60;specialServices&#x60; object is not required and PRL is added by default while creating return.  If user wishes to provide RMA number, it can be passed in &#x60;specialServices&#x60; object in the request body. &lt;br&gt; Please Note If user provides any information in this request it overrides the information in onward shipment which was created &lt;br&gt; For example if user provides toAddress in the request the return label will get created with recipient as mentioned in toAddress and  if user provides fromAddress in the request, the return label will be created with sender as mentioned in fromAddress

### Example

```java
// Import classes:
import com.pitneybowes.api360.ApiClient;
import com.pitneybowes.api360.ApiException;
import com.pitneybowes.api360.Configuration;
import com.pitneybowes.api360.auth.*;
import com.pitneybowes.api360.models.*;
import com.pitneybowes.api360.api.ShipmentApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-sandbox.sendpro360.pitneybowes.com/shipping");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        ShipmentApi apiInstance = new ShipmentApi(defaultClient);
        String shipmentId = "shipmentId_example"; // String | It specifies the shipmentId of onward shipment against which return label has to be created.
        ReturnLabel returnLabel = new ReturnLabel(); // ReturnLabel | 
        String xPBDeveloperPartnerID = "xPBDeveloperPartnerID_example"; // String | This is the Developer Partner ID. When the developer is the only partner, this field is not required.
        try {
            ReturnLabelResponse result = apiInstance.createReturnLabel(shipmentId, returnLabel, xPBDeveloperPartnerID);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ShipmentApi#createReturnLabel");
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
| **returnLabel** | [**ReturnLabel**](ReturnLabel.md)|  | |
| **xPBDeveloperPartnerID** | **String**| This is the Developer Partner ID. When the developer is the only partner, this field is not required. | [optional] |

### Return type

[**ReturnLabelResponse**](ReturnLabelResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The Return Label has been created successfully. |  -  |
| **400** | Invalid request. |  -  |
| **401** | The request could not be authorized. |  -  |
| **500** | The request could not be completed due to an internal error. |  -  |


## createShipment

> CreateShipment200Response createShipment(createShipmentRequest, xPBDeveloperPartnerID)

Create Shipment

This operation creates a new Shipment or Shipment Label. This is for both Domestic and International.&lt;br&gt; For domestic, Create a shipment requires domestic addresses (within same country)- ToAddress and FromAddress, and  carrier service and special service.&lt;br&gt; While for International, Create a shipment requires international delivery, that is ToAddress must be the different country (and not the same country mentioned in From Address), selected services, special services, and customs information. &lt;br&gt; &lt;br&gt; Note- To create Return shipment using this API- If PRL (return special service) is used, user need to provide sender address (from where return shipment is to be created) in &#x60;fromAddress&#x60; object and recipient address (to where return is to be created) in &#x60;toAddress&#x60; object. System will not swap the address for return in this API. If you want to create return for the already created shipment, you may use &#x60;Create Return Label Shipment&#x60; API. &lt;br&gt; &lt;br&gt; Note: Currently Shipment created from below API gets assigned to the Default location of the subscription.

### Example

```java
// Import classes:
import com.pitneybowes.api360.ApiClient;
import com.pitneybowes.api360.ApiException;
import com.pitneybowes.api360.Configuration;
import com.pitneybowes.api360.auth.*;
import com.pitneybowes.api360.models.*;
import com.pitneybowes.api360.api.ShipmentApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-sandbox.sendpro360.pitneybowes.com/shipping");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        ShipmentApi apiInstance = new ShipmentApi(defaultClient);
        CreateShipmentRequest createShipmentRequest = new CreateShipmentRequest(); // CreateShipmentRequest | 
        String xPBDeveloperPartnerID = "xPBDeveloperPartnerID_example"; // String | This is the Developer Partner ID. When the developer is the only partner, this field is not required.
        try {
            CreateShipment200Response result = apiInstance.createShipment(createShipmentRequest, xPBDeveloperPartnerID);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ShipmentApi#createShipment");
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
| **createShipmentRequest** | [**CreateShipmentRequest**](CreateShipmentRequest.md)|  | |
| **xPBDeveloperPartnerID** | **String**| This is the Developer Partner ID. When the developer is the only partner, this field is not required. | [optional] |

### Return type

[**CreateShipment200Response**](CreateShipment200Response.md)

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


## downloadBpodFiles

> BPODDownloadResponse downloadBpodFiles(xPBDeveloperPartnerID, startDate, endDate, body)

Download BPOD Files

This API operation is used to download bulk of ERR (*Electronic Return Receipt*) - POD (*Proof of Delivery*) files, which are specific to USPS carrier. &lt;br /&gt;   User can download BPOD (*Bulk Proof of Delivery*) files either using *Shipment IDs* or *Date Range*.    If user wants to check records based on dates and download BPOD files accordingly, then *Start Date* and *End Date* need to be passed in the request body as filter. Else *Shipment IDs* will be used as default value when user does not provide *DateRange* filter. &lt;br /&gt;   User is restricted to download 1000 BPOD files as max limit. 

### Example

```java
// Import classes:
import com.pitneybowes.api360.ApiClient;
import com.pitneybowes.api360.ApiException;
import com.pitneybowes.api360.Configuration;
import com.pitneybowes.api360.auth.*;
import com.pitneybowes.api360.models.*;
import com.pitneybowes.api360.api.ShipmentApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-sandbox.sendpro360.pitneybowes.com/shipping");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        ShipmentApi apiInstance = new ShipmentApi(defaultClient);
        String xPBDeveloperPartnerID = "xPBDeveloperPartnerID_example"; // String | The Developer Partner ID is assigned by PB to uniquely identify a Developer's strategic business partners. If the developer is the sole business partner, this field is not required.
        String startDate = "startDate_example"; // String | The BPOD files to be downloaded from which Date is the startDate in the Date Range filter. This field is not required if the Shipment IDs provided in the request body.
        String endDate = "endDate_example"; // String | The BPOD files to be downloaded till which Date is the endDate in the Date Range filter. This field is not required if the Shipment IDs provided in the request body.
        BPODDownloadRequest body = new BPODDownloadRequest(); // BPODDownloadRequest | This is the request body to download BPOD files. Request body supports max of 1000 ShipmentIDs in a request.
        try {
            BPODDownloadResponse result = apiInstance.downloadBpodFiles(xPBDeveloperPartnerID, startDate, endDate, body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ShipmentApi#downloadBpodFiles");
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
| **xPBDeveloperPartnerID** | **String**| The Developer Partner ID is assigned by PB to uniquely identify a Developer&#39;s strategic business partners. If the developer is the sole business partner, this field is not required. | [optional] |
| **startDate** | **String**| The BPOD files to be downloaded from which Date is the startDate in the Date Range filter. This field is not required if the Shipment IDs provided in the request body. | [optional] |
| **endDate** | **String**| The BPOD files to be downloaded till which Date is the endDate in the Date Range filter. This field is not required if the Shipment IDs provided in the request body. | [optional] |
| **body** | [**BPODDownloadRequest**](BPODDownloadRequest.md)| This is the request body to download BPOD files. Request body supports max of 1000 ShipmentIDs in a request. | [optional] |

### Return type

[**BPODDownloadResponse**](BPODDownloadResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The ZIP URL for BPOD files has been created for download. |  -  |
| **400** | Invalid request. |  -  |
| **401** | The request could not be authorized. |  -  |
| **500** | The request could not be completed due to an internal error. |  -  |


## getAllShipments

> GetAllShipments getAllShipments(xPBDeveloperPartnerID, startDate, endDate, page, size)

Get All Shipments

This operation fetches all created Shipments. If query parameters are not provided, it will default endDate as current date, page as 1 and size as 10.

### Example

```java
// Import classes:
import com.pitneybowes.api360.ApiClient;
import com.pitneybowes.api360.ApiException;
import com.pitneybowes.api360.Configuration;
import com.pitneybowes.api360.auth.*;
import com.pitneybowes.api360.models.*;
import com.pitneybowes.api360.api.ShipmentApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-sandbox.sendpro360.pitneybowes.com/shipping");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        ShipmentApi apiInstance = new ShipmentApi(defaultClient);
        String xPBDeveloperPartnerID = "xPBDeveloperPartnerID_example"; // String | This is the Developer Partner ID. When the developer is the only partner, this field is not required.
        String startDate = "startDate_example"; // String | While searching shipments, user set a date range to get all created shipments. This indicatesthe start date of the set date range under shipment search criteria. The date format must be: YYYY-MM-DD.
        String endDate = "endDate_example"; // String | While searching shipments, user set a date range to get all created shipments. This indicatesthe end date of the set date range under shipment search criteria. The date format must be: YYYY-MM-DD.
        String page = "page_example"; // String | This indicates the page of the Shipments search result list.
        String size = "size_example"; // String | This indicates the size/count of the searched result list.
        try {
            GetAllShipments result = apiInstance.getAllShipments(xPBDeveloperPartnerID, startDate, endDate, page, size);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ShipmentApi#getAllShipments");
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
| **startDate** | **String**| While searching shipments, user set a date range to get all created shipments. This indicatesthe start date of the set date range under shipment search criteria. The date format must be: YYYY-MM-DD. | [optional] |
| **endDate** | **String**| While searching shipments, user set a date range to get all created shipments. This indicatesthe end date of the set date range under shipment search criteria. The date format must be: YYYY-MM-DD. | [optional] |
| **page** | **String**| This indicates the page of the Shipments search result list. | [optional] |
| **size** | **String**| This indicates the size/count of the searched result list. | [optional] |

### Return type

[**GetAllShipments**](GetAllShipments.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | List of shipments. |  -  |
| **400** | Invalid request. |  -  |
| **401** | The request could not be authorized. |  -  |
| **500** | The request could not be completed due to an internal error. |  -  |


## getCarrierAccounts

> GetCarrierAccounts200Response getCarrierAccounts(xPBDeveloperPartnerID)

Get Carrier Accounts

This operation retrieves onboarded Carriers with their Carrier Account Ids which uniquely identify multiple accounts of same carrier.

### Example

```java
// Import classes:
import com.pitneybowes.api360.ApiClient;
import com.pitneybowes.api360.ApiException;
import com.pitneybowes.api360.Configuration;
import com.pitneybowes.api360.auth.*;
import com.pitneybowes.api360.models.*;
import com.pitneybowes.api360.api.ShipmentApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-sandbox.sendpro360.pitneybowes.com/shipping");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        ShipmentApi apiInstance = new ShipmentApi(defaultClient);
        String xPBDeveloperPartnerID = "xPBDeveloperPartnerID_example"; // String | This is the Developer Partner ID. When the developer is the only partner, this field is not required.
        try {
            GetCarrierAccounts200Response result = apiInstance.getCarrierAccounts(xPBDeveloperPartnerID);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ShipmentApi#getCarrierAccounts");
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

### Return type

[**GetCarrierAccounts200Response**](GetCarrierAccounts200Response.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A list of Carrier Accounts has been fetched. |  -  |
| **400** | Invalid request. |  -  |
| **401** | The request could not be authorized. |  -  |
| **500** | The request could not be completed due to an internal error. |  -  |


## getCarriers

> Carriers getCarriers(xPBDeveloperPartnerID)

Get Carriers

This operation fetches all supported carriers. This service is used to get list of supported carriers and their properties.

### Example

```java
// Import classes:
import com.pitneybowes.api360.ApiClient;
import com.pitneybowes.api360.ApiException;
import com.pitneybowes.api360.Configuration;
import com.pitneybowes.api360.auth.*;
import com.pitneybowes.api360.models.*;
import com.pitneybowes.api360.api.ShipmentApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-sandbox.sendpro360.pitneybowes.com/shipping");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        ShipmentApi apiInstance = new ShipmentApi(defaultClient);
        String xPBDeveloperPartnerID = "xPBDeveloperPartnerID_example"; // String | This is the Developer Partner ID. When the developer is the only partner, this field is not required.
        try {
            Carriers result = apiInstance.getCarriers(xPBDeveloperPartnerID);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ShipmentApi#getCarriers");
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

### Return type

[**Carriers**](Carriers.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The available carriers have been fetched. |  * X-Pb-Transactionid - The X-PB-TransactionId is unique id for this request. <br>  |
| **400** | Invalid request. |  -  |
| **401** | The request could not be authorized. |  -  |
| **500** | The request could not be completed due to an internal error. |  -  |


## getCountries

> List&lt;CountriesInner&gt; getCountries(xPBDeveloperPartnerID, carrier, originCountryCode)

Get Countries

This operation fetches list of supported destination countries for a provided carrier and origin country. If query parameters are not provided, it will default to &#x60;USPS&#x60; as carrier and &#x60;US&#x60; as origin country.

### Example

```java
// Import classes:
import com.pitneybowes.api360.ApiClient;
import com.pitneybowes.api360.ApiException;
import com.pitneybowes.api360.Configuration;
import com.pitneybowes.api360.auth.*;
import com.pitneybowes.api360.models.*;
import com.pitneybowes.api360.api.ShipmentApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-sandbox.sendpro360.pitneybowes.com/shipping");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        ShipmentApi apiInstance = new ShipmentApi(defaultClient);
        String xPBDeveloperPartnerID = "xPBDeveloperPartnerID_example"; // String | This is the Developer Partner ID. When the developer is the only partner, this field is not required.
        String carrier = "carrier_example"; // String | This indicates the carrierID, a unique identifier given to  an individual carrier.
        String originCountryCode = "originCountryCode_example"; // String | This indicates the Source Country. The two-character ISO country code for the country where the Shipment originates.
        try {
            List<CountriesInner> result = apiInstance.getCountries(xPBDeveloperPartnerID, carrier, originCountryCode);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ShipmentApi#getCountries");
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
| **carrier** | **String**| This indicates the carrierID, a unique identifier given to  an individual carrier. | [optional] |
| **originCountryCode** | **String**| This indicates the Source Country. The two-character ISO country code for the country where the Shipment originates. | [optional] |

### Return type

[**List&lt;CountriesInner&gt;**](CountriesInner.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A list of Countries has been fetched. |  * X-Pb-Transactionid - The X-PB-TransactionId is unique id for this request. <br>  |
| **400** | Invalid request. |  -  |
| **401** | The request could not be authorized. |  -  |
| **500** | The request could not be completed due to an internal error. |  -  |


## getParcelTypes

> List&lt;ParcelTypesInner&gt; getParcelTypes(xPBDeveloperPartnerID, carrier, originCountryCode, destinationCountryCode)

Get Parcel Types

This operation fetches Parcel Types based on the provided carrier, origin county, and the destination country. If query parameters are not provided, this will default to &#x60;USPS&#x60; as carrier, &#x60;US&#x60; as both origin and destination country code.

### Example

```java
// Import classes:
import com.pitneybowes.api360.ApiClient;
import com.pitneybowes.api360.ApiException;
import com.pitneybowes.api360.Configuration;
import com.pitneybowes.api360.auth.*;
import com.pitneybowes.api360.models.*;
import com.pitneybowes.api360.api.ShipmentApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-sandbox.sendpro360.pitneybowes.com/shipping");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        ShipmentApi apiInstance = new ShipmentApi(defaultClient);
        String xPBDeveloperPartnerID = "xPBDeveloperPartnerID_example"; // String | This is the Developer Partner ID. When the developer is the only partner, this field is not required.
        String carrier = "carrier_example"; // String | This indicates the CarrierID, a unique identifier given to an individual carrier. It can be referred from the response of Get Carriers API
        String originCountryCode = "originCountryCode_example"; // String | This indicates the Source Country. The two-character ISO country code for the country where the Shipment originates.
        String destinationCountryCode = "destinationCountryCode_example"; // String | This indicates the Destination Country for the Shipment. The two-character ISO country code for the country where the shipment is to be delivered.
        try {
            List<ParcelTypesInner> result = apiInstance.getParcelTypes(xPBDeveloperPartnerID, carrier, originCountryCode, destinationCountryCode);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ShipmentApi#getParcelTypes");
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
| **carrier** | **String**| This indicates the CarrierID, a unique identifier given to an individual carrier. It can be referred from the response of Get Carriers API | [optional] |
| **originCountryCode** | **String**| This indicates the Source Country. The two-character ISO country code for the country where the Shipment originates. | [optional] |
| **destinationCountryCode** | **String**| This indicates the Destination Country for the Shipment. The two-character ISO country code for the country where the shipment is to be delivered. | [optional] |

### Return type

[**List&lt;ParcelTypesInner&gt;**](ParcelTypesInner.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A list of Parcel Types has been fetched. |  * X-Pb-Transactionid - The X-PB-TransactionId is unique id for this request. <br>  |
| **400** | Invalid request. |  -  |
| **401** | The request could not be authorized. |  -  |
| **500** | The request could not be completed due to an internal error. |  -  |


## getRates

> GetRates200Response getRates(getRatesRequest, xPBDeveloperPartnerID, compactResponse)

Rate Shop and Get Single Rate

This API contains 2 operations, rate shop and single rate. Rate shop will fetch rates for all carrier services based on the given addresses (From and To), weight, and dimension for given parcelType. If parcelType is not provided, it will default to &#x60;PKG&#x60;. Single rate will get rate for specific service and special service (if requested) based on the given addresses (From and To), weight, and dimension, parcelType and serviceId with or without specialServices. Single rate will be used mainly to a rate a shipment before creating shipment.

### Example

```java
// Import classes:
import com.pitneybowes.api360.ApiClient;
import com.pitneybowes.api360.ApiException;
import com.pitneybowes.api360.Configuration;
import com.pitneybowes.api360.auth.*;
import com.pitneybowes.api360.models.*;
import com.pitneybowes.api360.api.ShipmentApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-sandbox.sendpro360.pitneybowes.com/shipping");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        ShipmentApi apiInstance = new ShipmentApi(defaultClient);
        GetRatesRequest getRatesRequest = new GetRatesRequest(); // GetRatesRequest | 
        String xPBDeveloperPartnerID = "xPBDeveloperPartnerID_example"; // String | This is the Developer Partner ID. When the developer is the only partner, this field is not required.
        Boolean compactResponse = true; // Boolean | This header defines if the response required is detailed or compact. When value is set to true, it will only return rates object in response.
        try {
            GetRates200Response result = apiInstance.getRates(getRatesRequest, xPBDeveloperPartnerID, compactResponse);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ShipmentApi#getRates");
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
| **getRatesRequest** | [**GetRatesRequest**](GetRatesRequest.md)|  | |
| **xPBDeveloperPartnerID** | **String**| This is the Developer Partner ID. When the developer is the only partner, this field is not required. | [optional] |
| **compactResponse** | **Boolean**| This header defines if the response required is detailed or compact. When value is set to true, it will only return rates object in response. | [optional] |

### Return type

[**GetRates200Response**](GetRates200Response.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The Rating is done for the shipment(s). |  -  |
| **400** | Invalid request. |  -  |
| **401** | The request could not be authorized. |  -  |
| **500** | The request could not be completed due to an internal error. |  -  |


## getServices

> List&lt;ServicesInner&gt; getServices(xPBDeveloperPartnerID, carrier, originCountryCode, destinationCountryCode)

Get Services

This operation fetches a list of supported services for a carrier with respect to specific origin and destination country. If query parameters are not provided, this will default to &#x60;USPS&#x60; as carrier, &#x60;US&#x60; as both origin and destination country code.

### Example

```java
// Import classes:
import com.pitneybowes.api360.ApiClient;
import com.pitneybowes.api360.ApiException;
import com.pitneybowes.api360.Configuration;
import com.pitneybowes.api360.auth.*;
import com.pitneybowes.api360.models.*;
import com.pitneybowes.api360.api.ShipmentApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-sandbox.sendpro360.pitneybowes.com/shipping");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        ShipmentApi apiInstance = new ShipmentApi(defaultClient);
        String xPBDeveloperPartnerID = "xPBDeveloperPartnerID_example"; // String | This is the Developer Partner ID. When the developer is the only partner, this field is not required.
        String carrier = "carrier_example"; // String | This indicates the CarrierID, a unique identifier provided to an individual carrier. It can be referred from the response of Get Carriers API
        String originCountryCode = "originCountryCode_example"; // String | This indicates the Source Country. The two-character ISO country code for the country where the Shipment originates.
        String destinationCountryCode = "destinationCountryCode_example"; // String | This indicates the Destination Country for the Shipment. The two-character ISO country code for the country where the shipment is to be delivered.
        try {
            List<ServicesInner> result = apiInstance.getServices(xPBDeveloperPartnerID, carrier, originCountryCode, destinationCountryCode);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ShipmentApi#getServices");
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
| **carrier** | **String**| This indicates the CarrierID, a unique identifier provided to an individual carrier. It can be referred from the response of Get Carriers API | [optional] |
| **originCountryCode** | **String**| This indicates the Source Country. The two-character ISO country code for the country where the Shipment originates. | [optional] |
| **destinationCountryCode** | **String**| This indicates the Destination Country for the Shipment. The two-character ISO country code for the country where the shipment is to be delivered. | [optional] |

### Return type

[**List&lt;ServicesInner&gt;**](ServicesInner.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A list of services has been fetched. |  * X-Pb-Transactionid - The X-PB-TransactionId is unique id for this request. <br>  |
| **400** | Invalid request. |  -  |
| **401** | The request could not be authorized. |  -  |
| **500** | The request could not be completed due to an internal error. |  -  |


## getSignatureImageERR

> SignatureFileResponse getSignatureImageERR(shipmentId, xPBDeveloperPartnerID)

Signature Image ERR

This operation provides a downloadable link which consists of a signature image for specific ERR (Electronic Return Receipt) shipment, and this is known as POD. &lt;br /&gt; Proof of Delivery (POD) is a document or file that shows an evidence of shipment delivery. This file contains the digital copy of recipient&#39;s signature, i.e., the signature image, in the form of downloadable link or URL.

### Example

```java
// Import classes:
import com.pitneybowes.api360.ApiClient;
import com.pitneybowes.api360.ApiException;
import com.pitneybowes.api360.Configuration;
import com.pitneybowes.api360.auth.*;
import com.pitneybowes.api360.models.*;
import com.pitneybowes.api360.api.ShipmentApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-sandbox.sendpro360.pitneybowes.com/shipping");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        ShipmentApi apiInstance = new ShipmentApi(defaultClient);
        String shipmentId = "shipmentId_example"; // String | Shipment ID is a unique identifier for an individual shipment.
        String xPBDeveloperPartnerID = "xPBDeveloperPartnerID_example"; // String | The Developer Partner ID is assigned by PB to uniquely identify a Developer's strategic business partners. If the developer is the sole business partner, this field is not required.
        try {
            SignatureFileResponse result = apiInstance.getSignatureImageERR(shipmentId, xPBDeveloperPartnerID);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ShipmentApi#getSignatureImageERR");
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
| **shipmentId** | **String**| Shipment ID is a unique identifier for an individual shipment. | |
| **xPBDeveloperPartnerID** | **String**| The Developer Partner ID is assigned by PB to uniquely identify a Developer&#39;s strategic business partners. If the developer is the sole business partner, this field is not required. | [optional] |

### Return type

[**SignatureFileResponse**](SignatureFileResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Signature image as proof of delivered shipment. |  -  |
| **400** | Invalid request. |  -  |
| **401** | The request could not be authorized. |  -  |
| **500** | The request could not be completed due to an internal error. |  -  |


## getSpecialServices

> SpecialServices getSpecialServices(xPBDeveloperPartnerID, service, parcel, carrier, originCountryCode, destinationCountryCode)

Get Special Services

This operation fetches Special Services for a given carrier, service, origin country, and the destination country. If query parameters are not provided, it will default to &#x60;USPS&#x60; as carrier,&#x60;US&#x60; as both origin and destination country and would show for all service and parcel types

### Example

```java
// Import classes:
import com.pitneybowes.api360.ApiClient;
import com.pitneybowes.api360.ApiException;
import com.pitneybowes.api360.Configuration;
import com.pitneybowes.api360.auth.*;
import com.pitneybowes.api360.models.*;
import com.pitneybowes.api360.api.ShipmentApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-sandbox.sendpro360.pitneybowes.com/shipping");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        ShipmentApi apiInstance = new ShipmentApi(defaultClient);
        String xPBDeveloperPartnerID = "xPBDeveloperPartnerID_example"; // String | This is the Developer Partner ID. When the developer is the only partner, this field is not required.
        String service = "service_example"; // String | This indicates the serviceId. It can be referred from response of `Get Services` API
        String parcel = "parcel_example"; // String | This indicates the parcel Id, a unique identifier named to individual package. It can be referred from response of `Get Parcel Types` API
        String carrier = "carrier_example"; // String | This indicates the CarrierID, a unique identifier given to  an individual carrier. It can be referred from response of `Get Carriers` API
        String originCountryCode = "originCountryCode_example"; // String | This indicates the Source Country. The two-character ISO country code for the country where the Shipment originates.
        String destinationCountryCode = "destinationCountryCode_example"; // String | This indicates the Destination Country for the Shipment. The two-character ISO country code for the country where the shipment is to be delivered.
        try {
            SpecialServices result = apiInstance.getSpecialServices(xPBDeveloperPartnerID, service, parcel, carrier, originCountryCode, destinationCountryCode);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ShipmentApi#getSpecialServices");
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
| **service** | **String**| This indicates the serviceId. It can be referred from response of &#x60;Get Services&#x60; API | [optional] |
| **parcel** | **String**| This indicates the parcel Id, a unique identifier named to individual package. It can be referred from response of &#x60;Get Parcel Types&#x60; API | [optional] |
| **carrier** | **String**| This indicates the CarrierID, a unique identifier given to  an individual carrier. It can be referred from response of &#x60;Get Carriers&#x60; API | [optional] |
| **originCountryCode** | **String**| This indicates the Source Country. The two-character ISO country code for the country where the Shipment originates. | [optional] |
| **destinationCountryCode** | **String**| This indicates the Destination Country for the Shipment. The two-character ISO country code for the country where the shipment is to be delivered. | [optional] |

### Return type

[**SpecialServices**](SpecialServices.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The Special Service has been fetched successfully. |  * X-Pb-Transactionid - The X-PB-TransactionId is unique id for this request. <br>  |
| **400** | Invalid request. |  -  |
| **401** | The request could not be authorized. |  -  |
| **500** | The request could not be completed due to an internal error. |  -  |


## reprintShipmentById

> ReprintShipment reprintShipmentById(shipmentId, xPBDeveloperPartnerID, compactResponse)

Reprint Shipment

This operation reprints Shipment by the shipmentId. It retrieves an existing shipping label to reprint. The API sends the shipmentId returned by the original Created Shipment request. Use this only if the shipping label in the Create Shipment response was spoilt or lost.

### Example

```java
// Import classes:
import com.pitneybowes.api360.ApiClient;
import com.pitneybowes.api360.ApiException;
import com.pitneybowes.api360.Configuration;
import com.pitneybowes.api360.auth.*;
import com.pitneybowes.api360.models.*;
import com.pitneybowes.api360.api.ShipmentApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-sandbox.sendpro360.pitneybowes.com/shipping");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        ShipmentApi apiInstance = new ShipmentApi(defaultClient);
        String shipmentId = "shipmentId_example"; // String | This indicates the shipmentId, a unique identifier assigned to the Shipment.
        String xPBDeveloperPartnerID = "xPBDeveloperPartnerID_example"; // String | This is the Developer Partner ID. When the developer is the only partner, this field is not required.
        Boolean compactResponse = false; // Boolean | This header defines if the response required is detailed or compact. When value is set to true, it will only return label layout details and parcel tracking number object in response.
        try {
            ReprintShipment result = apiInstance.reprintShipmentById(shipmentId, xPBDeveloperPartnerID, compactResponse);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ShipmentApi#reprintShipmentById");
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
| **shipmentId** | **String**| This indicates the shipmentId, a unique identifier assigned to the Shipment. | |
| **xPBDeveloperPartnerID** | **String**| This is the Developer Partner ID. When the developer is the only partner, this field is not required. | [optional] |
| **compactResponse** | **Boolean**| This header defines if the response required is detailed or compact. When value is set to true, it will only return label layout details and parcel tracking number object in response. | [optional] |

### Return type

[**ReprintShipment**](ReprintShipment.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The shipment has been reprinted. |  -  |
| **400** | Invalid request. |  -  |
| **401** | The request could not be authorized. |  -  |
| **404** | The requested resource was not found. |  -  |
| **500** | The request could not be completed due to an internal error. |  -  |


## shipmentById

> GetSingleShipment shipmentById(shipmentId, xPBDeveloperPartnerID)

Get Shipment by Id

This operation retrieves shipment details using shipmentId.

### Example

```java
// Import classes:
import com.pitneybowes.api360.ApiClient;
import com.pitneybowes.api360.ApiException;
import com.pitneybowes.api360.Configuration;
import com.pitneybowes.api360.auth.*;
import com.pitneybowes.api360.models.*;
import com.pitneybowes.api360.api.ShipmentApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-sandbox.sendpro360.pitneybowes.com/shipping");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        ShipmentApi apiInstance = new ShipmentApi(defaultClient);
        String shipmentId = "shipmentId_example"; // String | This indicates the shipmentId, a unique identifier for an individual Shipment.
        String xPBDeveloperPartnerID = "xPBDeveloperPartnerID_example"; // String | This is the Developer Partner ID. When the developer is the only partner, this field is not required.
        try {
            GetSingleShipment result = apiInstance.shipmentById(shipmentId, xPBDeveloperPartnerID);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ShipmentApi#shipmentById");
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
| **shipmentId** | **String**| This indicates the shipmentId, a unique identifier for an individual Shipment. | |
| **xPBDeveloperPartnerID** | **String**| This is the Developer Partner ID. When the developer is the only partner, this field is not required. | [optional] |

### Return type

[**GetSingleShipment**](GetSingleShipment.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The shipment has been retrieved. |  -  |
| **400** | Invalid request. |  -  |
| **401** | The request could not be authorized. |  -  |
| **404** | The requested resource was not found. |  -  |
| **500** | The request could not be completed due to an internal error. |  -  |

