package com.pitneybowes.api360.api;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestClientException;

import com.pitneybowes.api360.ApiClient;
import com.pitneybowes.api360.BaseApi;
import com.pitneybowes.api360.model.BulkShipmentResponse;
import com.pitneybowes.api360.model.BulkShipmentResponseERR;
import com.pitneybowes.api360.model.CreateBatchRequest;
import com.pitneybowes.api360.model.CreateBatchRequestERR;
import com.pitneybowes.api360.model.CreateBulkShipmentsAPIERRRequest;
import com.pitneybowes.api360.model.CreateBulkShipmentsAPIRequest;
import com.pitneybowes.api360.model.GetShipmentsForBatch;
import com.pitneybowes.api360.model.GetStatusDetailedResponse;
import com.pitneybowes.api360.model.ProcessShipmentResponse;
import com.pitneybowes.api360.model.ShipmentBatch;
import com.pitneybowes.api360.model.ShipmentBatchResponseERR;
import com.pitneybowes.api360.model.VoidBatchRequest;
import com.pitneybowes.api360.model.VoidBatchResponse;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-09-30T12:57:37.504069+05:30[Asia/Kolkata]", comments = "Generator version: 7.7.0")
public class BatchApi extends BaseApi {

    public BatchApi() {
        super(new ApiClient());
    }

    public BatchApi(ApiClient apiClient) {
        super(apiClient);
    }

    /**
     * Bulk Import Shipments
     * This operation imports the .CSV file, which includes all the required fields to create shipments in bulk. The payload contains information about the shipments you want to import, such as &#x60;carrier account&#x60;, &#x60;label layout&#x60;, &#x60;service&#x60;, and any &#x60;special services&#x60; required for the shipments. After batch is submitted, user needs to upload csv file of shipment transactions to the uploadURL returned in response.
     * <p><b>200</b> -  The bulk shipment has been successfully imported.
     * <p><b>400</b> - Invalid request.
     * <p><b>401</b> - The request could not be authorized.
     * <p><b>500</b> - The request could not be completed due to an internal error.
     * @param body  This is the Request body to bulk import shipments. (required)
     * @param xPBDeveloperPartnerID This is the Developer Partner ID. When the developer is the only partner, this field is not required. (optional)
     * @return ShipmentBatch
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ShipmentBatch bulkImportAPI(CreateBatchRequest body, String xPBDeveloperPartnerID) throws RestClientException {
        return bulkImportAPIWithHttpInfo(body, xPBDeveloperPartnerID).getBody();
    }

    /**
     * Bulk Import Shipments
     * This operation imports the .CSV file, which includes all the required fields to create shipments in bulk. The payload contains information about the shipments you want to import, such as &#x60;carrier account&#x60;, &#x60;label layout&#x60;, &#x60;service&#x60;, and any &#x60;special services&#x60; required for the shipments. After batch is submitted, user needs to upload csv file of shipment transactions to the uploadURL returned in response.
     * <p><b>200</b> -  The bulk shipment has been successfully imported.
     * <p><b>400</b> - Invalid request.
     * <p><b>401</b> - The request could not be authorized.
     * <p><b>500</b> - The request could not be completed due to an internal error.
     * @param body  This is the Request body to bulk import shipments. (required)
     * @param xPBDeveloperPartnerID This is the Developer Partner ID. When the developer is the only partner, this field is not required. (optional)
     * @return ResponseEntity&lt;ShipmentBatch&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ShipmentBatch> bulkImportAPIWithHttpInfo(CreateBatchRequest body, String xPBDeveloperPartnerID) throws RestClientException {
        Object localVarPostBody = body;
        
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'body' when calling bulkImportAPI");
        }
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        if (xPBDeveloperPartnerID != null)
        localVarHeaderParams.add("X-PB-Developer-Partner-ID", apiClient.parameterToString(xPBDeveloperPartnerID));

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/json"
         };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "bearerAuth" };

        ParameterizedTypeReference<ShipmentBatch> localReturnType = new ParameterizedTypeReference<ShipmentBatch>() {};
        return apiClient.invokeAPI("/api/v1/shipments/importUrl", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Bulk Import Shipments ERR
     * This operation imports the .CSV file which includes fields required for creating ERR (Electronic Return Receipt) Bulk Shipments.    The payload, which is used for shipment transactions, contains the following essential information in .CSV file:   - Carrier Account   - Output format: Shipping Label and Coversheet    - Services, and   - Special Services     The above-mentioned information are stored in AWS-S3 which in turn provides URL to users. When Batch is submitted, S3 returned URL along with .CSV file are uploaded, which generates BatchID.    The same BatchID is used to track the status of BulkImport. 
     * <p><b>200</b> -  ERR Bulk Shipment has been successfully imported.
     * <p><b>400</b> - Invalid request.
     * <p><b>401</b> - The request could not be authorized.
     * <p><b>500</b> - The request could not be completed due to an internal error.
     * @param body  This is the request body to import ERR Bulk shipments. (required)
     * @param xPBDeveloperPartnerID The PB-Developer-Partner-ID is assigned by PB to uniquely identify a developer&#39;s strategic business partners. If the developer is the sole business partner, this field is not required. (optional)
     * @return ShipmentBatchResponseERR
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ShipmentBatchResponseERR bulkImportAPIERR(CreateBatchRequestERR body, String xPBDeveloperPartnerID) throws RestClientException {
        return bulkImportAPIERRWithHttpInfo(body, xPBDeveloperPartnerID).getBody();
    }

    /**
     * Bulk Import Shipments ERR
     * This operation imports the .CSV file which includes fields required for creating ERR (Electronic Return Receipt) Bulk Shipments.    The payload, which is used for shipment transactions, contains the following essential information in .CSV file:   - Carrier Account   - Output format: Shipping Label and Coversheet    - Services, and   - Special Services     The above-mentioned information are stored in AWS-S3 which in turn provides URL to users. When Batch is submitted, S3 returned URL along with .CSV file are uploaded, which generates BatchID.    The same BatchID is used to track the status of BulkImport. 
     * <p><b>200</b> -  ERR Bulk Shipment has been successfully imported.
     * <p><b>400</b> - Invalid request.
     * <p><b>401</b> - The request could not be authorized.
     * <p><b>500</b> - The request could not be completed due to an internal error.
     * @param body  This is the request body to import ERR Bulk shipments. (required)
     * @param xPBDeveloperPartnerID The PB-Developer-Partner-ID is assigned by PB to uniquely identify a developer&#39;s strategic business partners. If the developer is the sole business partner, this field is not required. (optional)
     * @return ResponseEntity&lt;ShipmentBatchResponseERR&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ShipmentBatchResponseERR> bulkImportAPIERRWithHttpInfo(CreateBatchRequestERR body, String xPBDeveloperPartnerID) throws RestClientException {
        Object localVarPostBody = body;
        
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'body' when calling bulkImportAPIERR");
        }
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        if (xPBDeveloperPartnerID != null)
        localVarHeaderParams.add("X-PB-Developer-Partner-ID", apiClient.parameterToString(xPBDeveloperPartnerID));

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/json"
         };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "bearerAuth" };

        ParameterizedTypeReference<ShipmentBatchResponseERR> localReturnType = new ParameterizedTypeReference<ShipmentBatchResponseERR>() {};
        return apiClient.invokeAPI("/api/v1/err/shipments/importUrl", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Create Bulk Shipments
     * This operation creates a batch of bulk (larger quantities) shipments for single or multiple recipients. The shipments can be addressed to a single or multiple recipients with different combination of carrier, service special services and parcel type. &#x60;carrierAccountId&#x60;, &#x60;parcelType&#x60;, &#x60;serviceId&#x60; and &#x60;specialServices&#x60; are used as default when user do not wish to provide at shipment level. If user choose to provide these at Shipment level then it overrides the values provided at root level. At shipment level either you can wish to provide all of &#x60;carrierAccountId&#x60;, &#x60;parcelType&#x60;, &#x60;serviceId&#x60; and &#x60;specialServices&#x60; or not provide all of them if wants to use default ones from root level. If user do not provide any one out of &#x60;carrierAccountId&#x60;, &#x60;parcelType&#x60; and &#x60;serviceId&#x60; at shipment level it would result in validation error
     * <p><b>200</b> - The Batch Shipment has been created.
     * <p><b>400</b> - Invalid request.
     * <p><b>401</b> - The request could not be authorized.
     * <p><b>500</b> - The request could not be completed due to an internal error.
     * @param body This is the Request body to create bulk shipments. (required)
     * @param xPBDeveloperPartnerID This is the Developer Partner ID. When the developer is the only partner, this field is not required. (optional)
     * @return BulkShipmentResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public BulkShipmentResponse createBulkShipmentsAPI(CreateBulkShipmentsAPIRequest body, String xPBDeveloperPartnerID) throws RestClientException {
        return createBulkShipmentsAPIWithHttpInfo(body, xPBDeveloperPartnerID).getBody();
    }

    /**
     * Create Bulk Shipments
     * This operation creates a batch of bulk (larger quantities) shipments for single or multiple recipients. The shipments can be addressed to a single or multiple recipients with different combination of carrier, service special services and parcel type. &#x60;carrierAccountId&#x60;, &#x60;parcelType&#x60;, &#x60;serviceId&#x60; and &#x60;specialServices&#x60; are used as default when user do not wish to provide at shipment level. If user choose to provide these at Shipment level then it overrides the values provided at root level. At shipment level either you can wish to provide all of &#x60;carrierAccountId&#x60;, &#x60;parcelType&#x60;, &#x60;serviceId&#x60; and &#x60;specialServices&#x60; or not provide all of them if wants to use default ones from root level. If user do not provide any one out of &#x60;carrierAccountId&#x60;, &#x60;parcelType&#x60; and &#x60;serviceId&#x60; at shipment level it would result in validation error
     * <p><b>200</b> - The Batch Shipment has been created.
     * <p><b>400</b> - Invalid request.
     * <p><b>401</b> - The request could not be authorized.
     * <p><b>500</b> - The request could not be completed due to an internal error.
     * @param body This is the Request body to create bulk shipments. (required)
     * @param xPBDeveloperPartnerID This is the Developer Partner ID. When the developer is the only partner, this field is not required. (optional)
     * @return ResponseEntity&lt;BulkShipmentResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<BulkShipmentResponse> createBulkShipmentsAPIWithHttpInfo(CreateBulkShipmentsAPIRequest body, String xPBDeveloperPartnerID) throws RestClientException {
        Object localVarPostBody = body;
        
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'body' when calling createBulkShipmentsAPI");
        }
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        if (xPBDeveloperPartnerID != null)
        localVarHeaderParams.add("X-PB-Developer-Partner-ID", apiClient.parameterToString(xPBDeveloperPartnerID));

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/json"
         };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "bearerAuth" };

        ParameterizedTypeReference<BulkShipmentResponse> localReturnType = new ParameterizedTypeReference<BulkShipmentResponse>() {};
        return apiClient.invokeAPI("/api/v1/bulkShipments", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Create Bulk Shipments ERR
     * ERR (Electronic Return Receipt) is an official United States Postal Service® (USPS) document designed to be equivalent to the hardcopy &#39;green card&#39; Return Receipt. &lt;br /&gt;    It provides the following information:   - Name of the Recipient     - Time when article is delivered   - Signature (image) of the Recipient     - Address where the item is delivered, and    - Date when the article gets delivered.      ERR is combined with certain classes and categories of mails, which are as follow:   - First-Class Mail®    - Priority Mail®     ERR Batch supports two types of Shipment Document format:    - Shipping Label    - Coversheet       This API \&quot;Create Bulk Shipments with ERR\&quot; operation requires the following information:   - Recipient (Single or Multiple)   - Carrier - USPS   - Service   - Parcel Type, and   - Special Service.    The ERR API works at two levels: Shipment level and Root level. Root level is marked as Default, where multiple shipments are processed and entities are common for all shipments. While at Shipment level, entities might differ. &lt;br /&gt;   User can either define values for *CarrierAccountID*, *ParcelType*, *ServiceID*, and *SpecialService* respectively at the Root level for all shipments, or mention the values at Shipment level, i.e., for individual shipment(s).     If user does not provide values for the above-mentioned fields combinedly at Shipment level, then the default values for these fields provided at Root level will be considered. While, if user provides these values combinedly at Shipment Level for individual shipment(s), it will override the values defined at Root level. &lt;br /&gt;   &lt;br /&gt;   *Condition: The fields *CarrierAccountID*, *ParcelType*, *ServiceID* are treated as a combination, and values against each field must be provided if user selects Shipment level. In case any of these field(s) out of the mentioned combination is/are missing, it will return validation error.*    
     * <p><b>200</b> - The Bulk Shipment for ERR has been successfully created.
     * <p><b>400</b> - Invalid request.
     * <p><b>401</b> - The request could not be authorized.
     * <p><b>500</b> - The request could not be completed due to an internal error.
     * @param body This is the request body to create Bulk Shipment for ERR. (required)
     * @param xPBDeveloperPartnerID The Developer-Partner-ID is assigned by PB to uniquely identify a developer&#39;s strategic business partners. If the developer is the sole business partner, this field is not required. (optional)
     * @return BulkShipmentResponseERR
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public BulkShipmentResponseERR createBulkShipmentsAPIERR(CreateBulkShipmentsAPIERRRequest body, String xPBDeveloperPartnerID) throws RestClientException {
        return createBulkShipmentsAPIERRWithHttpInfo(body, xPBDeveloperPartnerID).getBody();
    }

    /**
     * Create Bulk Shipments ERR
     * ERR (Electronic Return Receipt) is an official United States Postal Service® (USPS) document designed to be equivalent to the hardcopy &#39;green card&#39; Return Receipt. &lt;br /&gt;    It provides the following information:   - Name of the Recipient     - Time when article is delivered   - Signature (image) of the Recipient     - Address where the item is delivered, and    - Date when the article gets delivered.      ERR is combined with certain classes and categories of mails, which are as follow:   - First-Class Mail®    - Priority Mail®     ERR Batch supports two types of Shipment Document format:    - Shipping Label    - Coversheet       This API \&quot;Create Bulk Shipments with ERR\&quot; operation requires the following information:   - Recipient (Single or Multiple)   - Carrier - USPS   - Service   - Parcel Type, and   - Special Service.    The ERR API works at two levels: Shipment level and Root level. Root level is marked as Default, where multiple shipments are processed and entities are common for all shipments. While at Shipment level, entities might differ. &lt;br /&gt;   User can either define values for *CarrierAccountID*, *ParcelType*, *ServiceID*, and *SpecialService* respectively at the Root level for all shipments, or mention the values at Shipment level, i.e., for individual shipment(s).     If user does not provide values for the above-mentioned fields combinedly at Shipment level, then the default values for these fields provided at Root level will be considered. While, if user provides these values combinedly at Shipment Level for individual shipment(s), it will override the values defined at Root level. &lt;br /&gt;   &lt;br /&gt;   *Condition: The fields *CarrierAccountID*, *ParcelType*, *ServiceID* are treated as a combination, and values against each field must be provided if user selects Shipment level. In case any of these field(s) out of the mentioned combination is/are missing, it will return validation error.*    
     * <p><b>200</b> - The Bulk Shipment for ERR has been successfully created.
     * <p><b>400</b> - Invalid request.
     * <p><b>401</b> - The request could not be authorized.
     * <p><b>500</b> - The request could not be completed due to an internal error.
     * @param body This is the request body to create Bulk Shipment for ERR. (required)
     * @param xPBDeveloperPartnerID The Developer-Partner-ID is assigned by PB to uniquely identify a developer&#39;s strategic business partners. If the developer is the sole business partner, this field is not required. (optional)
     * @return ResponseEntity&lt;BulkShipmentResponseERR&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<BulkShipmentResponseERR> createBulkShipmentsAPIERRWithHttpInfo(CreateBulkShipmentsAPIERRRequest body, String xPBDeveloperPartnerID) throws RestClientException {
        Object localVarPostBody = body;
        
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'body' when calling createBulkShipmentsAPIERR");
        }
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        if (xPBDeveloperPartnerID != null)
        localVarHeaderParams.add("X-PB-Developer-Partner-ID", apiClient.parameterToString(xPBDeveloperPartnerID));

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/json"
         };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "bearerAuth" };

        ParameterizedTypeReference<BulkShipmentResponseERR> localReturnType = new ParameterizedTypeReference<BulkShipmentResponseERR>() {};
        return apiClient.invokeAPI("/api/v1/err/bulkShipments", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get Batch Status
     * This operation retrieves the status of an existing Batch using *Batch ID*. Once the Job status is completed, the URL received from Response can be used to download the shipping label in PDF format.
     * <p><b>200</b> - Here, is the status of the Batch ID.
     * <p><b>400</b> - Invalid request.
     * <p><b>401</b> - The request could not be authorized.
     * <p><b>404</b> - The requested resource was not found.
     * <p><b>500</b> - The request could not be completed due to an internal error.
     * @param batchId This is a system-generated unique identifier assigned to the Batch while it is processed. (required)
     * @param xPBDeveloperPartnerID The Developer-Partner- ID is assigned by PB to uniquely identify a Developer&#39;s strategic business partners. If the developer is the sole business partner, this field is not required. (optional)
     * @return GetStatusDetailedResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public GetStatusDetailedResponse getBatchStatusAPI(String batchId, String xPBDeveloperPartnerID) throws RestClientException {
        return getBatchStatusAPIWithHttpInfo(batchId, xPBDeveloperPartnerID).getBody();
    }

    /**
     * Get Batch Status
     * This operation retrieves the status of an existing Batch using *Batch ID*. Once the Job status is completed, the URL received from Response can be used to download the shipping label in PDF format.
     * <p><b>200</b> - Here, is the status of the Batch ID.
     * <p><b>400</b> - Invalid request.
     * <p><b>401</b> - The request could not be authorized.
     * <p><b>404</b> - The requested resource was not found.
     * <p><b>500</b> - The request could not be completed due to an internal error.
     * @param batchId This is a system-generated unique identifier assigned to the Batch while it is processed. (required)
     * @param xPBDeveloperPartnerID The Developer-Partner- ID is assigned by PB to uniquely identify a Developer&#39;s strategic business partners. If the developer is the sole business partner, this field is not required. (optional)
     * @return ResponseEntity&lt;GetStatusDetailedResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<GetStatusDetailedResponse> getBatchStatusAPIWithHttpInfo(String batchId, String xPBDeveloperPartnerID) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'batchId' is set
        if (batchId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'batchId' when calling getBatchStatusAPI");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("batchId", batchId);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        if (xPBDeveloperPartnerID != null)
        localVarHeaderParams.add("X-PB-Developer-Partner-ID", apiClient.parameterToString(xPBDeveloperPartnerID));

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "bearerAuth" };

        ParameterizedTypeReference<GetStatusDetailedResponse> localReturnType = new ParameterizedTypeReference<GetStatusDetailedResponse>() {};
        return apiClient.invokeAPI("/api/v1/shipments/batch/{batchId}/status", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get Batch Shipment Details
     * \&quot;This API operation provides the shipment details for those shipments which are SUCCESS or FAILED during batch processing at the following levels: - addressValidation - rating - labelGeneration, and - voidLabel  Based on fields/data mentioned in Query Parameter, user can check shipment details for particular status at any levels. &lt;br /&gt; If no values are provided in the fields mentioned in Query Parameter, the default for each will be: - Page: 1  - Size: 20 - Status: SUCCESS/FAILED. 
     * <p><b>200</b> - Detailed status of processed shipments for the batch.
     * <p><b>400</b> - Invalid request.
     * <p><b>401</b> - The request could not be authorized.
     * <p><b>404</b> - The requested resource was not found.
     * <p><b>500</b> - The request could not be completed due to an internal error.
     * @param batchId This is a system-generated unique identifier assigned to the Batch while it is processed (required)
     * @param xPBDeveloperPartnerID The Developer-Partner- ID is assigned by PB to uniquely identify a Developer&#39;s strategic business partners. If the developer is the sole business partner, this field is not required. (optional)
     * @param page It returns detailed information for shipments status and it can cover in one or more pages. The default value for page number is 1. (optional)
     * @param size Indicates the number of records per page. The default value for records is 20. (optional)
     * @param status The status of the shipment. Values can be Failed or Success. (optional)
     * @param step Indicates various stages of the batch processing. (optional)
     * @return GetShipmentsForBatch
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public GetShipmentsForBatch getShipmentDetailsForBatchAPI(String batchId, String xPBDeveloperPartnerID, Integer page, Integer size, String status, String step) throws RestClientException {
        return getShipmentDetailsForBatchAPIWithHttpInfo(batchId, xPBDeveloperPartnerID, page, size, status, step).getBody();
    }

    /**
     * Get Batch Shipment Details
     * \&quot;This API operation provides the shipment details for those shipments which are SUCCESS or FAILED during batch processing at the following levels: - addressValidation - rating - labelGeneration, and - voidLabel  Based on fields/data mentioned in Query Parameter, user can check shipment details for particular status at any levels. &lt;br /&gt; If no values are provided in the fields mentioned in Query Parameter, the default for each will be: - Page: 1  - Size: 20 - Status: SUCCESS/FAILED. 
     * <p><b>200</b> - Detailed status of processed shipments for the batch.
     * <p><b>400</b> - Invalid request.
     * <p><b>401</b> - The request could not be authorized.
     * <p><b>404</b> - The requested resource was not found.
     * <p><b>500</b> - The request could not be completed due to an internal error.
     * @param batchId This is a system-generated unique identifier assigned to the Batch while it is processed (required)
     * @param xPBDeveloperPartnerID The Developer-Partner- ID is assigned by PB to uniquely identify a Developer&#39;s strategic business partners. If the developer is the sole business partner, this field is not required. (optional)
     * @param page It returns detailed information for shipments status and it can cover in one or more pages. The default value for page number is 1. (optional)
     * @param size Indicates the number of records per page. The default value for records is 20. (optional)
     * @param status The status of the shipment. Values can be Failed or Success. (optional)
     * @param step Indicates various stages of the batch processing. (optional)
     * @return ResponseEntity&lt;GetShipmentsForBatch&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<GetShipmentsForBatch> getShipmentDetailsForBatchAPIWithHttpInfo(String batchId, String xPBDeveloperPartnerID, Integer page, Integer size, String status, String step) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'batchId' is set
        if (batchId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'batchId' when calling getShipmentDetailsForBatchAPI");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("batchId", batchId);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "page", page));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "size", size));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "status", status));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "step", step));
        

        if (xPBDeveloperPartnerID != null)
        localVarHeaderParams.add("X-PB-Developer-Partner-ID", apiClient.parameterToString(xPBDeveloperPartnerID));

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "bearerAuth" };

        ParameterizedTypeReference<GetShipmentsForBatch> localReturnType = new ParameterizedTypeReference<GetShipmentsForBatch>() {};
        return apiClient.invokeAPI("/api/v1/shipments/batch/{batchId}/shipments", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Process Batch
     * This operation processes (executes) the existing Batch. The payload for this endpoint needs only an empty JSON object and no additional data is required in the request body. The BatchID parameter located in the endpoint specifies which batch of shipments to process.
     * <p><b>200</b> - The Batch has been processed successfully.
     * <p><b>400</b> - Invalid request.
     * <p><b>401</b> - The request could not be authorized.
     * <p><b>404</b> - The requested resource was not found.
     * <p><b>500</b> - The request could not be completed due to an internal error.
     * @param batchId This is a system-generated unique identifier assigned to the Batch while it is processed. (required)
     * @param xPBDeveloperPartnerID The Developer-Partner-ID is assigned by PB to uniquely identify a Developer&#39;s strategic business partners. If the developer is the sole business partner, this field is not required. (optional)
     * @return ProcessShipmentResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ProcessShipmentResponse processBatchAPI(String batchId, String xPBDeveloperPartnerID) throws RestClientException {
        return processBatchAPIWithHttpInfo(batchId, xPBDeveloperPartnerID).getBody();
    }

    /**
     * Process Batch
     * This operation processes (executes) the existing Batch. The payload for this endpoint needs only an empty JSON object and no additional data is required in the request body. The BatchID parameter located in the endpoint specifies which batch of shipments to process.
     * <p><b>200</b> - The Batch has been processed successfully.
     * <p><b>400</b> - Invalid request.
     * <p><b>401</b> - The request could not be authorized.
     * <p><b>404</b> - The requested resource was not found.
     * <p><b>500</b> - The request could not be completed due to an internal error.
     * @param batchId This is a system-generated unique identifier assigned to the Batch while it is processed. (required)
     * @param xPBDeveloperPartnerID The Developer-Partner-ID is assigned by PB to uniquely identify a Developer&#39;s strategic business partners. If the developer is the sole business partner, this field is not required. (optional)
     * @return ResponseEntity&lt;ProcessShipmentResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ProcessShipmentResponse> processBatchAPIWithHttpInfo(String batchId, String xPBDeveloperPartnerID) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'batchId' is set
        if (batchId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'batchId' when calling processBatchAPI");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("batchId", batchId);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        if (xPBDeveloperPartnerID != null)
        localVarHeaderParams.add("X-PB-Developer-Partner-ID", apiClient.parameterToString(xPBDeveloperPartnerID));

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "bearerAuth" };

        ParameterizedTypeReference<ProcessShipmentResponse> localReturnType = new ParameterizedTypeReference<ProcessShipmentResponse>() {};
        return apiClient.invokeAPI("/api/v1/shipments/batch/{batchId}/process", HttpMethod.POST, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Void Batch Shipping Labels
     * This operation cancels (voids) shipments which are created using the Batch API operation &#x60;createBulkShipments&#x60;. &lt;br /&gt; If user wants to cancel specific shipment(s) of the Batch, then s/he needs to pass the *Shipment ID* for the selected shipments in the &#x60;shipmentIDs&#x60; array. While if user wants to cancel all shipments of the Batch, then s/he does not need to provide any *Shipment ID* in the array under request body.
     * <p><b>200</b> - The indicated shipment(s) of Batch have been successfully cancelled.
     * <p><b>400</b> - Invalid request.
     * <p><b>401</b> - The request could not be authorized.
     * <p><b>404</b> - The requested resource was not found.
     * <p><b>500</b> - The request could not be completed due to an internal error.
     * @param batchId This is a system-generated unique identifier assigned to the Batch while it is processed. (required)
     * @param xPBDeveloperPartnerID The Developer-Partner-ID is assigned by PB to uniquely identify a Developer&#39;s strategic business partners. If the developer is the sole business partner, this field is not required. (optional)
     * @param voidBatchRequest  This is the request body for cancelling the selected shipments or entire Batch of shipments*. (optional)
     * @return VoidBatchResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public VoidBatchResponse voidShippingLabel(String batchId, String xPBDeveloperPartnerID, VoidBatchRequest voidBatchRequest) throws RestClientException {
        return voidShippingLabelWithHttpInfo(batchId, xPBDeveloperPartnerID, voidBatchRequest).getBody();
    }

    /**
     * Void Batch Shipping Labels
     * This operation cancels (voids) shipments which are created using the Batch API operation &#x60;createBulkShipments&#x60;. &lt;br /&gt; If user wants to cancel specific shipment(s) of the Batch, then s/he needs to pass the *Shipment ID* for the selected shipments in the &#x60;shipmentIDs&#x60; array. While if user wants to cancel all shipments of the Batch, then s/he does not need to provide any *Shipment ID* in the array under request body.
     * <p><b>200</b> - The indicated shipment(s) of Batch have been successfully cancelled.
     * <p><b>400</b> - Invalid request.
     * <p><b>401</b> - The request could not be authorized.
     * <p><b>404</b> - The requested resource was not found.
     * <p><b>500</b> - The request could not be completed due to an internal error.
     * @param batchId This is a system-generated unique identifier assigned to the Batch while it is processed. (required)
     * @param xPBDeveloperPartnerID The Developer-Partner-ID is assigned by PB to uniquely identify a Developer&#39;s strategic business partners. If the developer is the sole business partner, this field is not required. (optional)
     * @param voidBatchRequest  This is the request body for cancelling the selected shipments or entire Batch of shipments*. (optional)
     * @return ResponseEntity&lt;VoidBatchResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<VoidBatchResponse> voidShippingLabelWithHttpInfo(String batchId, String xPBDeveloperPartnerID, VoidBatchRequest voidBatchRequest) throws RestClientException {
        Object localVarPostBody = voidBatchRequest;
        
        // verify the required parameter 'batchId' is set
        if (batchId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'batchId' when calling voidShippingLabel");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("batchId", batchId);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        if (xPBDeveloperPartnerID != null)
        localVarHeaderParams.add("X-PB-Developer-Partner-ID", apiClient.parameterToString(xPBDeveloperPartnerID));

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/json"
         };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "bearerAuth" };

        ParameterizedTypeReference<VoidBatchResponse> localReturnType = new ParameterizedTypeReference<VoidBatchResponse>() {};
        return apiClient.invokeAPI("/api/v1/shipments/batch/{batchId}/void", HttpMethod.POST, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }

    @Override
    public <T> ResponseEntity<T> invokeAPI(String url, HttpMethod method, Object request, ParameterizedTypeReference<T> returnType) throws RestClientException {
        String localVarPath = url.replace(apiClient.getBasePath(), "");
        Object localVarPostBody = request;

        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/json"
         };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "bearerAuth" };

        return apiClient.invokeAPI(localVarPath, method, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, returnType);
    }
}
