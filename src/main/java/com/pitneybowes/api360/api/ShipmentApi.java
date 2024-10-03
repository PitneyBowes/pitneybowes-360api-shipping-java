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
import com.pitneybowes.api360.model.BPODDownloadRequest;
import com.pitneybowes.api360.model.BPODDownloadResponse;
import com.pitneybowes.api360.model.CancelShipment;
import com.pitneybowes.api360.model.CancelStampsRequestERR;
import com.pitneybowes.api360.model.CancelStampsResponseERR;
import com.pitneybowes.api360.model.Carriers;
import com.pitneybowes.api360.model.CountriesInner;
import com.pitneybowes.api360.model.CreateShipment200Response;
import com.pitneybowes.api360.model.CreateShipmentRequest;
import com.pitneybowes.api360.model.GetAllShipments;
import com.pitneybowes.api360.model.GetCarrierAccounts200Response;
import com.pitneybowes.api360.model.GetRates200Response;
import com.pitneybowes.api360.model.GetRatesRequest;
import com.pitneybowes.api360.model.GetSingleShipment;
import com.pitneybowes.api360.model.ParcelTypesInner;
import com.pitneybowes.api360.model.ReprintShipment;
import com.pitneybowes.api360.model.ReturnLabel;
import com.pitneybowes.api360.model.ReturnLabelResponse;
import com.pitneybowes.api360.model.ServicesInner;
import com.pitneybowes.api360.model.SignatureFileResponse;
import com.pitneybowes.api360.model.SpecialServices;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-09-30T12:57:37.504069+05:30[Asia/Kolkata]", comments = "Generator version: 7.7.0")
public class ShipmentApi extends BaseApi {

    public ShipmentApi() {
        super(new ApiClient());
    }

    public ShipmentApi(ApiClient apiClient) {
        super(apiClient);
    }

    /**
     * Cancel Shipment
     * This operation cancel/void shipment.
     * <p><b>200</b> - The Shipment has been cancelled.
     * <p><b>400</b> - Invalid request.
     * <p><b>401</b> - The request could not be authorized.
     * <p><b>404</b> - The requested resource was not found.
     * <p><b>500</b> - The request could not be completed due to an internal error.
     * @param shipmentId This indicates the shipmentId, a unique identifier assigned for the Shipment. (required)
     * @param xPBDeveloperPartnerID This is the Developer Partner ID. When the developer is the only partner, this field is not required. (optional)
     * @return CancelShipment
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public CancelShipment cancelShipmentById(String shipmentId, String xPBDeveloperPartnerID) throws RestClientException {
        return cancelShipmentByIdWithHttpInfo(shipmentId, xPBDeveloperPartnerID).getBody();
    }

    /**
     * Cancel Shipment
     * This operation cancel/void shipment.
     * <p><b>200</b> - The Shipment has been cancelled.
     * <p><b>400</b> - Invalid request.
     * <p><b>401</b> - The request could not be authorized.
     * <p><b>404</b> - The requested resource was not found.
     * <p><b>500</b> - The request could not be completed due to an internal error.
     * @param shipmentId This indicates the shipmentId, a unique identifier assigned for the Shipment. (required)
     * @param xPBDeveloperPartnerID This is the Developer Partner ID. When the developer is the only partner, this field is not required. (optional)
     * @return ResponseEntity&lt;CancelShipment&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<CancelShipment> cancelShipmentByIdWithHttpInfo(String shipmentId, String xPBDeveloperPartnerID) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'shipmentId' is set
        if (shipmentId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'shipmentId' when calling cancelShipmentById");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("shipmentId", shipmentId);

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

        ParameterizedTypeReference<CancelShipment> localReturnType = new ParameterizedTypeReference<CancelShipment>() {};
        return apiClient.invokeAPI("/api/v1/shipments/{shipmentId}/cancel", HttpMethod.PUT, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Cancel Stamps ERR
     * This operation cancels (voids) stamps generated for ERR (Electronic Return Receipt).  - User needs to provide *Stamp IDs* to cancel those specific ERR stamps.  - User can download the *Refund Form* having details of generated Postage.  - At once, maximum 1000 stamps can be requested for cancelation. 
     * <p><b>200</b> - Stamps Refund Form has been generated.
     * <p><b>400</b> - Invalid request.
     * <p><b>401</b> - The request could not be authorized.
     * <p><b>500</b> - The request could not be completed due to an internal error.
     * @param cancelStampsRequestERR  (required)
     * @param xPBDeveloperPartnerID The Developer Partner ID is assigned by PB to uniquely identify a Developer&#39;s strategic business partners. If the developer is the sole business partner, this field is not required. (optional)
     * @return CancelStampsResponseERR
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public CancelStampsResponseERR cancelStampsERR(CancelStampsRequestERR cancelStampsRequestERR, String xPBDeveloperPartnerID) throws RestClientException {
        return cancelStampsERRWithHttpInfo(cancelStampsRequestERR, xPBDeveloperPartnerID).getBody();
    }

    /**
     * Cancel Stamps ERR
     * This operation cancels (voids) stamps generated for ERR (Electronic Return Receipt).  - User needs to provide *Stamp IDs* to cancel those specific ERR stamps.  - User can download the *Refund Form* having details of generated Postage.  - At once, maximum 1000 stamps can be requested for cancelation. 
     * <p><b>200</b> - Stamps Refund Form has been generated.
     * <p><b>400</b> - Invalid request.
     * <p><b>401</b> - The request could not be authorized.
     * <p><b>500</b> - The request could not be completed due to an internal error.
     * @param cancelStampsRequestERR  (required)
     * @param xPBDeveloperPartnerID The Developer Partner ID is assigned by PB to uniquely identify a Developer&#39;s strategic business partners. If the developer is the sole business partner, this field is not required. (optional)
     * @return ResponseEntity&lt;CancelStampsResponseERR&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<CancelStampsResponseERR> cancelStampsERRWithHttpInfo(CancelStampsRequestERR cancelStampsRequestERR, String xPBDeveloperPartnerID) throws RestClientException {
        Object localVarPostBody = cancelStampsRequestERR;
        
        // verify the required parameter 'cancelStampsRequestERR' is set
        if (cancelStampsRequestERR == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'cancelStampsRequestERR' when calling cancelStampsERR");
        }
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        if (xPBDeveloperPartnerID != null)
        localVarHeaderParams.add("X-PB-Developer-Partner-ID", apiClient.parameterToString(xPBDeveloperPartnerID));

        final String[] localVarAccepts = { 
            "application/pdf", "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/json"
         };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "bearerAuth" };

        ParameterizedTypeReference<CancelStampsResponseERR> localReturnType = new ParameterizedTypeReference<CancelStampsResponseERR>() {};
        return apiClient.invokeAPI("/api/v1/err/stamps/void", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Create Return label shipment
     * This operation creates a return label based on a previous shipment. &lt;br&gt; The return label can be created in two ways:  &lt;br&gt; 1. User need not to provide any details of package, address and service. The API would take all details from the shipmentId mentioned in the path parameter and would swap the address and create return label. However for UPS &#x60;specialServices&#x60; object is required as carrier mandates to provide package description with PRL special service. &lt;br&gt; 2. User can customize the request by passing &#x60;fromAddress&#x60;, &#x60;toAddress&#x60;, &#x60;parcelType&#x60;, &#x60;serviceId&#x60; in the request itself. &lt;br&gt; Please Note that for UPS it is required to pass &#x60;specialServices&#x60; object with &#x60;PRL&#x60; service id and  input parameters with name as &#x60;RETURN_PKG_DESCRIPTION&#x60;. &lt;br&gt; For FedEx &#x60;specialServices&#x60; object is not required and PRL is added by default while creating return.  If user wishes to provide RMA number, it can be passed in &#x60;specialServices&#x60; object in the request body. &lt;br&gt; Please Note If user provides any information in this request it overrides the information in onward shipment which was created &lt;br&gt; For example if user provides toAddress in the request the return label will get created with recipient as mentioned in toAddress and  if user provides fromAddress in the request, the return label will be created with sender as mentioned in fromAddress
     * <p><b>200</b> - The Return Label has been created successfully.
     * <p><b>400</b> - Invalid request.
     * <p><b>401</b> - The request could not be authorized.
     * <p><b>500</b> - The request could not be completed due to an internal error.
     * @param shipmentId It specifies the shipmentId of onward shipment against which return label has to be created. (required)
     * @param returnLabel  (required)
     * @param xPBDeveloperPartnerID This is the Developer Partner ID. When the developer is the only partner, this field is not required. (optional)
     * @return ReturnLabelResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ReturnLabelResponse createReturnLabel(String shipmentId, ReturnLabel returnLabel, String xPBDeveloperPartnerID) throws RestClientException {
        return createReturnLabelWithHttpInfo(shipmentId, returnLabel, xPBDeveloperPartnerID).getBody();
    }

    /**
     * Create Return label shipment
     * This operation creates a return label based on a previous shipment. &lt;br&gt; The return label can be created in two ways:  &lt;br&gt; 1. User need not to provide any details of package, address and service. The API would take all details from the shipmentId mentioned in the path parameter and would swap the address and create return label. However for UPS &#x60;specialServices&#x60; object is required as carrier mandates to provide package description with PRL special service. &lt;br&gt; 2. User can customize the request by passing &#x60;fromAddress&#x60;, &#x60;toAddress&#x60;, &#x60;parcelType&#x60;, &#x60;serviceId&#x60; in the request itself. &lt;br&gt; Please Note that for UPS it is required to pass &#x60;specialServices&#x60; object with &#x60;PRL&#x60; service id and  input parameters with name as &#x60;RETURN_PKG_DESCRIPTION&#x60;. &lt;br&gt; For FedEx &#x60;specialServices&#x60; object is not required and PRL is added by default while creating return.  If user wishes to provide RMA number, it can be passed in &#x60;specialServices&#x60; object in the request body. &lt;br&gt; Please Note If user provides any information in this request it overrides the information in onward shipment which was created &lt;br&gt; For example if user provides toAddress in the request the return label will get created with recipient as mentioned in toAddress and  if user provides fromAddress in the request, the return label will be created with sender as mentioned in fromAddress
     * <p><b>200</b> - The Return Label has been created successfully.
     * <p><b>400</b> - Invalid request.
     * <p><b>401</b> - The request could not be authorized.
     * <p><b>500</b> - The request could not be completed due to an internal error.
     * @param shipmentId It specifies the shipmentId of onward shipment against which return label has to be created. (required)
     * @param returnLabel  (required)
     * @param xPBDeveloperPartnerID This is the Developer Partner ID. When the developer is the only partner, this field is not required. (optional)
     * @return ResponseEntity&lt;ReturnLabelResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ReturnLabelResponse> createReturnLabelWithHttpInfo(String shipmentId, ReturnLabel returnLabel, String xPBDeveloperPartnerID) throws RestClientException {
        Object localVarPostBody = returnLabel;
        
        // verify the required parameter 'shipmentId' is set
        if (shipmentId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'shipmentId' when calling createReturnLabel");
        }
        
        // verify the required parameter 'returnLabel' is set
        if (returnLabel == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'returnLabel' when calling createReturnLabel");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("shipmentId", shipmentId);

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

        ParameterizedTypeReference<ReturnLabelResponse> localReturnType = new ParameterizedTypeReference<ReturnLabelResponse>() {};
        return apiClient.invokeAPI("/api/v1/shipments/{shipmentId}/return", HttpMethod.POST, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Create Shipment
     * This operation creates a new Shipment or Shipment Label. This is for both Domestic and International.&lt;br&gt; For domestic, Create a shipment requires domestic addresses (within same country)- ToAddress and FromAddress, and  carrier service and special service.&lt;br&gt; While for International, Create a shipment requires international delivery, that is ToAddress must be the different country (and not the same country mentioned in From Address), selected services, special services, and customs information. &lt;br&gt; &lt;br&gt; Note- To create Return shipment using this API- If PRL (return special service) is used, user need to provide sender address (from where return shipment is to be created) in &#x60;fromAddress&#x60; object and recipient address (to where return is to be created) in &#x60;toAddress&#x60; object. System will not swap the address for return in this API. If you want to create return for the already created shipment, you may use &#x60;Create Return Label Shipment&#x60; API. &lt;br&gt; &lt;br&gt; Note: Currently Shipment created from below API gets assigned to the Default location of the subscription.
     * <p><b>200</b> - The shipment has been created successfully.
     * <p><b>400</b> - Invalid request.
     * <p><b>401</b> - The request could not be authorized.
     * <p><b>500</b> - The request could not be completed due to an internal error.
     * @param createShipmentRequest  (required)
     * @param xPBDeveloperPartnerID This is the Developer Partner ID. When the developer is the only partner, this field is not required. (optional)
     * @return CreateShipment200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public CreateShipment200Response createShipment(CreateShipmentRequest createShipmentRequest, String xPBDeveloperPartnerID) throws RestClientException {
        return createShipmentWithHttpInfo(createShipmentRequest, xPBDeveloperPartnerID).getBody();
    }

    /**
     * Create Shipment
     * This operation creates a new Shipment or Shipment Label. This is for both Domestic and International.&lt;br&gt; For domestic, Create a shipment requires domestic addresses (within same country)- ToAddress and FromAddress, and  carrier service and special service.&lt;br&gt; While for International, Create a shipment requires international delivery, that is ToAddress must be the different country (and not the same country mentioned in From Address), selected services, special services, and customs information. &lt;br&gt; &lt;br&gt; Note- To create Return shipment using this API- If PRL (return special service) is used, user need to provide sender address (from where return shipment is to be created) in &#x60;fromAddress&#x60; object and recipient address (to where return is to be created) in &#x60;toAddress&#x60; object. System will not swap the address for return in this API. If you want to create return for the already created shipment, you may use &#x60;Create Return Label Shipment&#x60; API. &lt;br&gt; &lt;br&gt; Note: Currently Shipment created from below API gets assigned to the Default location of the subscription.
     * <p><b>200</b> - The shipment has been created successfully.
     * <p><b>400</b> - Invalid request.
     * <p><b>401</b> - The request could not be authorized.
     * <p><b>500</b> - The request could not be completed due to an internal error.
     * @param createShipmentRequest  (required)
     * @param xPBDeveloperPartnerID This is the Developer Partner ID. When the developer is the only partner, this field is not required. (optional)
     * @return ResponseEntity&lt;CreateShipment200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<CreateShipment200Response> createShipmentWithHttpInfo(CreateShipmentRequest createShipmentRequest, String xPBDeveloperPartnerID) throws RestClientException {
        Object localVarPostBody = createShipmentRequest;
        
        // verify the required parameter 'createShipmentRequest' is set
        if (createShipmentRequest == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'createShipmentRequest' when calling createShipment");
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

        ParameterizedTypeReference<CreateShipment200Response> localReturnType = new ParameterizedTypeReference<CreateShipment200Response>() {};
        return apiClient.invokeAPI("/api/v1/shipments", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Download BPOD Files
     * This API operation is used to download bulk of ERR (*Electronic Return Receipt*) - POD (*Proof of Delivery*) files, which are specific to USPS carrier. &lt;br /&gt;   User can download BPOD (*Bulk Proof of Delivery*) files either using *Shipment IDs* or *Date Range*.    If user wants to check records based on dates and download BPOD files accordingly, then *Start Date* and *End Date* need to be passed in the request body as filter. Else *Shipment IDs* will be used as default value when user does not provide *DateRange* filter. &lt;br /&gt;   User is restricted to download 1000 BPOD files as max limit. 
     * <p><b>200</b> - The ZIP URL for BPOD files has been created for download.
     * <p><b>400</b> - Invalid request.
     * <p><b>401</b> - The request could not be authorized.
     * <p><b>500</b> - The request could not be completed due to an internal error.
     * @param xPBDeveloperPartnerID The Developer Partner ID is assigned by PB to uniquely identify a Developer&#39;s strategic business partners. If the developer is the sole business partner, this field is not required. (optional)
     * @param startDate The BPOD files to be downloaded from which Date is the startDate in the Date Range filter. This field is not required if the Shipment IDs provided in the request body. (optional)
     * @param endDate The BPOD files to be downloaded till which Date is the endDate in the Date Range filter. This field is not required if the Shipment IDs provided in the request body. (optional)
     * @param body This is the request body to download BPOD files. Request body supports max of 1000 ShipmentIDs in a request. (optional)
     * @return BPODDownloadResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public BPODDownloadResponse downloadBpodFiles(String xPBDeveloperPartnerID, String startDate, String endDate, BPODDownloadRequest body) throws RestClientException {
        return downloadBpodFilesWithHttpInfo(xPBDeveloperPartnerID, startDate, endDate, body).getBody();
    }

    /**
     * Download BPOD Files
     * This API operation is used to download bulk of ERR (*Electronic Return Receipt*) - POD (*Proof of Delivery*) files, which are specific to USPS carrier. &lt;br /&gt;   User can download BPOD (*Bulk Proof of Delivery*) files either using *Shipment IDs* or *Date Range*.    If user wants to check records based on dates and download BPOD files accordingly, then *Start Date* and *End Date* need to be passed in the request body as filter. Else *Shipment IDs* will be used as default value when user does not provide *DateRange* filter. &lt;br /&gt;   User is restricted to download 1000 BPOD files as max limit. 
     * <p><b>200</b> - The ZIP URL for BPOD files has been created for download.
     * <p><b>400</b> - Invalid request.
     * <p><b>401</b> - The request could not be authorized.
     * <p><b>500</b> - The request could not be completed due to an internal error.
     * @param xPBDeveloperPartnerID The Developer Partner ID is assigned by PB to uniquely identify a Developer&#39;s strategic business partners. If the developer is the sole business partner, this field is not required. (optional)
     * @param startDate The BPOD files to be downloaded from which Date is the startDate in the Date Range filter. This field is not required if the Shipment IDs provided in the request body. (optional)
     * @param endDate The BPOD files to be downloaded till which Date is the endDate in the Date Range filter. This field is not required if the Shipment IDs provided in the request body. (optional)
     * @param body This is the request body to download BPOD files. Request body supports max of 1000 ShipmentIDs in a request. (optional)
     * @return ResponseEntity&lt;BPODDownloadResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<BPODDownloadResponse> downloadBpodFilesWithHttpInfo(String xPBDeveloperPartnerID, String startDate, String endDate, BPODDownloadRequest body) throws RestClientException {
        Object localVarPostBody = body;
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "startDate", startDate));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "endDate", endDate));
        

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

        ParameterizedTypeReference<BPODDownloadResponse> localReturnType = new ParameterizedTypeReference<BPODDownloadResponse>() {};
        return apiClient.invokeAPI("/api/v1/err/shipments/bpod", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get All Shipments
     * This operation fetches all created Shipments. If query parameters are not provided, it will default endDate as current date, page as 1 and size as 10.
     * <p><b>200</b> - List of shipments.
     * <p><b>400</b> - Invalid request.
     * <p><b>401</b> - The request could not be authorized.
     * <p><b>500</b> - The request could not be completed due to an internal error.
     * @param xPBDeveloperPartnerID This is the Developer Partner ID. When the developer is the only partner, this field is not required. (optional)
     * @param startDate While searching shipments, user set a date range to get all created shipments. This indicatesthe start date of the set date range under shipment search criteria. The date format must be: YYYY-MM-DD. (optional)
     * @param endDate While searching shipments, user set a date range to get all created shipments. This indicatesthe end date of the set date range under shipment search criteria. The date format must be: YYYY-MM-DD. (optional)
     * @param page This indicates the page of the Shipments search result list. (optional)
     * @param size This indicates the size/count of the searched result list. (optional)
     * @return GetAllShipments
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public GetAllShipments getAllShipments(String xPBDeveloperPartnerID, String startDate, String endDate, String page, String size) throws RestClientException {
        return getAllShipmentsWithHttpInfo(xPBDeveloperPartnerID, startDate, endDate, page, size).getBody();
    }

    /**
     * Get All Shipments
     * This operation fetches all created Shipments. If query parameters are not provided, it will default endDate as current date, page as 1 and size as 10.
     * <p><b>200</b> - List of shipments.
     * <p><b>400</b> - Invalid request.
     * <p><b>401</b> - The request could not be authorized.
     * <p><b>500</b> - The request could not be completed due to an internal error.
     * @param xPBDeveloperPartnerID This is the Developer Partner ID. When the developer is the only partner, this field is not required. (optional)
     * @param startDate While searching shipments, user set a date range to get all created shipments. This indicatesthe start date of the set date range under shipment search criteria. The date format must be: YYYY-MM-DD. (optional)
     * @param endDate While searching shipments, user set a date range to get all created shipments. This indicatesthe end date of the set date range under shipment search criteria. The date format must be: YYYY-MM-DD. (optional)
     * @param page This indicates the page of the Shipments search result list. (optional)
     * @param size This indicates the size/count of the searched result list. (optional)
     * @return ResponseEntity&lt;GetAllShipments&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<GetAllShipments> getAllShipmentsWithHttpInfo(String xPBDeveloperPartnerID, String startDate, String endDate, String page, String size) throws RestClientException {
        Object localVarPostBody = null;
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "startDate", startDate));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "endDate", endDate));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "page", page));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "size", size));
        

        if (xPBDeveloperPartnerID != null)
        localVarHeaderParams.add("X-PB-Developer-Partner-ID", apiClient.parameterToString(xPBDeveloperPartnerID));

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "bearerAuth" };

        ParameterizedTypeReference<GetAllShipments> localReturnType = new ParameterizedTypeReference<GetAllShipments>() {};
        return apiClient.invokeAPI("/api/v1/shipments", HttpMethod.GET, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get Carrier Accounts
     * This operation retrieves onboarded Carriers with their Carrier Account Ids which uniquely identify multiple accounts of same carrier.
     * <p><b>200</b> - A list of Carrier Accounts has been fetched.
     * <p><b>400</b> - Invalid request.
     * <p><b>401</b> - The request could not be authorized.
     * <p><b>500</b> - The request could not be completed due to an internal error.
     * @param xPBDeveloperPartnerID This is the Developer Partner ID. When the developer is the only partner, this field is not required. (optional)
     * @return GetCarrierAccounts200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public GetCarrierAccounts200Response getCarrierAccounts(String xPBDeveloperPartnerID) throws RestClientException {
        return getCarrierAccountsWithHttpInfo(xPBDeveloperPartnerID).getBody();
    }

    /**
     * Get Carrier Accounts
     * This operation retrieves onboarded Carriers with their Carrier Account Ids which uniquely identify multiple accounts of same carrier.
     * <p><b>200</b> - A list of Carrier Accounts has been fetched.
     * <p><b>400</b> - Invalid request.
     * <p><b>401</b> - The request could not be authorized.
     * <p><b>500</b> - The request could not be completed due to an internal error.
     * @param xPBDeveloperPartnerID This is the Developer Partner ID. When the developer is the only partner, this field is not required. (optional)
     * @return ResponseEntity&lt;GetCarrierAccounts200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<GetCarrierAccounts200Response> getCarrierAccountsWithHttpInfo(String xPBDeveloperPartnerID) throws RestClientException {
        Object localVarPostBody = null;
        

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

        ParameterizedTypeReference<GetCarrierAccounts200Response> localReturnType = new ParameterizedTypeReference<GetCarrierAccounts200Response>() {};
        return apiClient.invokeAPI("/api/v1/carrierAccounts", HttpMethod.GET, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get Carriers
     * This operation fetches all supported carriers. This service is used to get list of supported carriers and their properties.
     * <p><b>200</b> - The available carriers have been fetched.
     * <p><b>400</b> - Invalid request.
     * <p><b>401</b> - The request could not be authorized.
     * <p><b>500</b> - The request could not be completed due to an internal error.
     * @param xPBDeveloperPartnerID This is the Developer Partner ID. When the developer is the only partner, this field is not required. (optional)
     * @return Carriers
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Carriers getCarriers(String xPBDeveloperPartnerID) throws RestClientException {
        return getCarriersWithHttpInfo(xPBDeveloperPartnerID).getBody();
    }

    /**
     * Get Carriers
     * This operation fetches all supported carriers. This service is used to get list of supported carriers and their properties.
     * <p><b>200</b> - The available carriers have been fetched.
     * <p><b>400</b> - Invalid request.
     * <p><b>401</b> - The request could not be authorized.
     * <p><b>500</b> - The request could not be completed due to an internal error.
     * @param xPBDeveloperPartnerID This is the Developer Partner ID. When the developer is the only partner, this field is not required. (optional)
     * @return ResponseEntity&lt;Carriers&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Carriers> getCarriersWithHttpInfo(String xPBDeveloperPartnerID) throws RestClientException {
        Object localVarPostBody = null;
        

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

        ParameterizedTypeReference<Carriers> localReturnType = new ParameterizedTypeReference<Carriers>() {};
        return apiClient.invokeAPI("/api/v1/carriers", HttpMethod.GET, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get Countries
     * This operation fetches list of supported destination countries for a provided carrier and origin country. If query parameters are not provided, it will default to &#x60;USPS&#x60; as carrier and &#x60;US&#x60; as origin country.
     * <p><b>200</b> - A list of Countries has been fetched.
     * <p><b>400</b> - Invalid request.
     * <p><b>401</b> - The request could not be authorized.
     * <p><b>500</b> - The request could not be completed due to an internal error.
     * @param xPBDeveloperPartnerID This is the Developer Partner ID. When the developer is the only partner, this field is not required. (optional)
     * @param carrier This indicates the carrierID, a unique identifier given to  an individual carrier. (optional)
     * @param originCountryCode This indicates the Source Country. The two-character ISO country code for the country where the Shipment originates. (optional)
     * @return List&lt;CountriesInner&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<CountriesInner> getCountries(String xPBDeveloperPartnerID, String carrier, String originCountryCode) throws RestClientException {
        return getCountriesWithHttpInfo(xPBDeveloperPartnerID, carrier, originCountryCode).getBody();
    }

    /**
     * Get Countries
     * This operation fetches list of supported destination countries for a provided carrier and origin country. If query parameters are not provided, it will default to &#x60;USPS&#x60; as carrier and &#x60;US&#x60; as origin country.
     * <p><b>200</b> - A list of Countries has been fetched.
     * <p><b>400</b> - Invalid request.
     * <p><b>401</b> - The request could not be authorized.
     * <p><b>500</b> - The request could not be completed due to an internal error.
     * @param xPBDeveloperPartnerID This is the Developer Partner ID. When the developer is the only partner, this field is not required. (optional)
     * @param carrier This indicates the carrierID, a unique identifier given to  an individual carrier. (optional)
     * @param originCountryCode This indicates the Source Country. The two-character ISO country code for the country where the Shipment originates. (optional)
     * @return ResponseEntity&lt;List&lt;CountriesInner&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<CountriesInner>> getCountriesWithHttpInfo(String xPBDeveloperPartnerID, String carrier, String originCountryCode) throws RestClientException {
        Object localVarPostBody = null;
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "carrier", carrier));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "originCountryCode", originCountryCode));
        

        if (xPBDeveloperPartnerID != null)
        localVarHeaderParams.add("X-PB-Developer-Partner-ID", apiClient.parameterToString(xPBDeveloperPartnerID));

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "bearerAuth" };

        ParameterizedTypeReference<List<CountriesInner>> localReturnType = new ParameterizedTypeReference<List<CountriesInner>>() {};
        return apiClient.invokeAPI("/api/v1/countries", HttpMethod.GET, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get Parcel Types
     * This operation fetches Parcel Types based on the provided carrier, origin county, and the destination country. If query parameters are not provided, this will default to &#x60;USPS&#x60; as carrier, &#x60;US&#x60; as both origin and destination country code.
     * <p><b>200</b> - A list of Parcel Types has been fetched.
     * <p><b>400</b> - Invalid request.
     * <p><b>401</b> - The request could not be authorized.
     * <p><b>500</b> - The request could not be completed due to an internal error.
     * @param xPBDeveloperPartnerID This is the Developer Partner ID. When the developer is the only partner, this field is not required. (optional)
     * @param carrier This indicates the CarrierID, a unique identifier given to an individual carrier. It can be referred from the response of Get Carriers API (optional)
     * @param originCountryCode This indicates the Source Country. The two-character ISO country code for the country where the Shipment originates. (optional)
     * @param destinationCountryCode This indicates the Destination Country for the Shipment. The two-character ISO country code for the country where the shipment is to be delivered. (optional)
     * @return List&lt;ParcelTypesInner&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<ParcelTypesInner> getParcelTypes(String xPBDeveloperPartnerID, String carrier, String originCountryCode, String destinationCountryCode) throws RestClientException {
        return getParcelTypesWithHttpInfo(xPBDeveloperPartnerID, carrier, originCountryCode, destinationCountryCode).getBody();
    }

    /**
     * Get Parcel Types
     * This operation fetches Parcel Types based on the provided carrier, origin county, and the destination country. If query parameters are not provided, this will default to &#x60;USPS&#x60; as carrier, &#x60;US&#x60; as both origin and destination country code.
     * <p><b>200</b> - A list of Parcel Types has been fetched.
     * <p><b>400</b> - Invalid request.
     * <p><b>401</b> - The request could not be authorized.
     * <p><b>500</b> - The request could not be completed due to an internal error.
     * @param xPBDeveloperPartnerID This is the Developer Partner ID. When the developer is the only partner, this field is not required. (optional)
     * @param carrier This indicates the CarrierID, a unique identifier given to an individual carrier. It can be referred from the response of Get Carriers API (optional)
     * @param originCountryCode This indicates the Source Country. The two-character ISO country code for the country where the Shipment originates. (optional)
     * @param destinationCountryCode This indicates the Destination Country for the Shipment. The two-character ISO country code for the country where the shipment is to be delivered. (optional)
     * @return ResponseEntity&lt;List&lt;ParcelTypesInner&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<ParcelTypesInner>> getParcelTypesWithHttpInfo(String xPBDeveloperPartnerID, String carrier, String originCountryCode, String destinationCountryCode) throws RestClientException {
        Object localVarPostBody = null;
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "carrier", carrier));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "originCountryCode", originCountryCode));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "destinationCountryCode", destinationCountryCode));
        

        if (xPBDeveloperPartnerID != null)
        localVarHeaderParams.add("X-PB-Developer-Partner-ID", apiClient.parameterToString(xPBDeveloperPartnerID));

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "bearerAuth" };

        ParameterizedTypeReference<List<ParcelTypesInner>> localReturnType = new ParameterizedTypeReference<List<ParcelTypesInner>>() {};
        return apiClient.invokeAPI("/api/v1/parcelTypes", HttpMethod.GET, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Rate Shop and Get Single Rate
     * This API contains 2 operations, rate shop and single rate. Rate shop will fetch rates for all carrier services based on the given addresses (From and To), weight, and dimension for given parcelType. If parcelType is not provided, it will default to &#x60;PKG&#x60;. Single rate will get rate for specific service and special service (if requested) based on the given addresses (From and To), weight, and dimension, parcelType and serviceId with or without specialServices. Single rate will be used mainly to a rate a shipment before creating shipment.
     * <p><b>200</b> - The Rating is done for the shipment(s).
     * <p><b>400</b> - Invalid request.
     * <p><b>401</b> - The request could not be authorized.
     * <p><b>500</b> - The request could not be completed due to an internal error.
     * @param getRatesRequest  (required)
     * @param xPBDeveloperPartnerID This is the Developer Partner ID. When the developer is the only partner, this field is not required. (optional)
     * @param compactResponse This header defines if the response required is detailed or compact. When value is set to true, it will only return rates object in response. (optional)
     * @return GetRates200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public GetRates200Response getRates(GetRatesRequest getRatesRequest, String xPBDeveloperPartnerID, Boolean compactResponse) throws RestClientException {
        return getRatesWithHttpInfo(getRatesRequest, xPBDeveloperPartnerID, compactResponse).getBody();
    }

    /**
     * Rate Shop and Get Single Rate
     * This API contains 2 operations, rate shop and single rate. Rate shop will fetch rates for all carrier services based on the given addresses (From and To), weight, and dimension for given parcelType. If parcelType is not provided, it will default to &#x60;PKG&#x60;. Single rate will get rate for specific service and special service (if requested) based on the given addresses (From and To), weight, and dimension, parcelType and serviceId with or without specialServices. Single rate will be used mainly to a rate a shipment before creating shipment.
     * <p><b>200</b> - The Rating is done for the shipment(s).
     * <p><b>400</b> - Invalid request.
     * <p><b>401</b> - The request could not be authorized.
     * <p><b>500</b> - The request could not be completed due to an internal error.
     * @param getRatesRequest  (required)
     * @param xPBDeveloperPartnerID This is the Developer Partner ID. When the developer is the only partner, this field is not required. (optional)
     * @param compactResponse This header defines if the response required is detailed or compact. When value is set to true, it will only return rates object in response. (optional)
     * @return ResponseEntity&lt;GetRates200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<GetRates200Response> getRatesWithHttpInfo(GetRatesRequest getRatesRequest, String xPBDeveloperPartnerID, Boolean compactResponse) throws RestClientException {
        Object localVarPostBody = getRatesRequest;
        
        // verify the required parameter 'getRatesRequest' is set
        if (getRatesRequest == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'getRatesRequest' when calling getRates");
        }
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        if (xPBDeveloperPartnerID != null)
        localVarHeaderParams.add("X-PB-Developer-Partner-ID", apiClient.parameterToString(xPBDeveloperPartnerID));
        if (compactResponse != null)
        localVarHeaderParams.add("compactResponse", apiClient.parameterToString(compactResponse));

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/json"
         };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "bearerAuth" };

        ParameterizedTypeReference<GetRates200Response> localReturnType = new ParameterizedTypeReference<GetRates200Response>() {};
        return apiClient.invokeAPI("/api/v1/rates", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get Services
     * This operation fetches a list of supported services for a carrier with respect to specific origin and destination country. If query parameters are not provided, this will default to &#x60;USPS&#x60; as carrier, &#x60;US&#x60; as both origin and destination country code.
     * <p><b>200</b> - A list of services has been fetched.
     * <p><b>400</b> - Invalid request.
     * <p><b>401</b> - The request could not be authorized.
     * <p><b>500</b> - The request could not be completed due to an internal error.
     * @param xPBDeveloperPartnerID This is the Developer Partner ID. When the developer is the only partner, this field is not required. (optional)
     * @param carrier This indicates the CarrierID, a unique identifier provided to an individual carrier. It can be referred from the response of Get Carriers API (optional)
     * @param originCountryCode This indicates the Source Country. The two-character ISO country code for the country where the Shipment originates. (optional)
     * @param destinationCountryCode This indicates the Destination Country for the Shipment. The two-character ISO country code for the country where the shipment is to be delivered. (optional)
     * @return List&lt;ServicesInner&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<ServicesInner> getServices(String xPBDeveloperPartnerID, String carrier, String originCountryCode, String destinationCountryCode) throws RestClientException {
        return getServicesWithHttpInfo(xPBDeveloperPartnerID, carrier, originCountryCode, destinationCountryCode).getBody();
    }

    /**
     * Get Services
     * This operation fetches a list of supported services for a carrier with respect to specific origin and destination country. If query parameters are not provided, this will default to &#x60;USPS&#x60; as carrier, &#x60;US&#x60; as both origin and destination country code.
     * <p><b>200</b> - A list of services has been fetched.
     * <p><b>400</b> - Invalid request.
     * <p><b>401</b> - The request could not be authorized.
     * <p><b>500</b> - The request could not be completed due to an internal error.
     * @param xPBDeveloperPartnerID This is the Developer Partner ID. When the developer is the only partner, this field is not required. (optional)
     * @param carrier This indicates the CarrierID, a unique identifier provided to an individual carrier. It can be referred from the response of Get Carriers API (optional)
     * @param originCountryCode This indicates the Source Country. The two-character ISO country code for the country where the Shipment originates. (optional)
     * @param destinationCountryCode This indicates the Destination Country for the Shipment. The two-character ISO country code for the country where the shipment is to be delivered. (optional)
     * @return ResponseEntity&lt;List&lt;ServicesInner&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<ServicesInner>> getServicesWithHttpInfo(String xPBDeveloperPartnerID, String carrier, String originCountryCode, String destinationCountryCode) throws RestClientException {
        Object localVarPostBody = null;
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "carrier", carrier));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "originCountryCode", originCountryCode));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "destinationCountryCode", destinationCountryCode));
        

        if (xPBDeveloperPartnerID != null)
        localVarHeaderParams.add("X-PB-Developer-Partner-ID", apiClient.parameterToString(xPBDeveloperPartnerID));

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "bearerAuth" };

        ParameterizedTypeReference<List<ServicesInner>> localReturnType = new ParameterizedTypeReference<List<ServicesInner>>() {};
        return apiClient.invokeAPI("/api/v1/services", HttpMethod.GET, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Signature Image ERR
     * This operation provides a downloadable link which consists of a signature image for specific ERR (Electronic Return Receipt) shipment, and this is known as POD. &lt;br /&gt; Proof of Delivery (POD) is a document or file that shows an evidence of shipment delivery. This file contains the digital copy of recipient&#39;s signature, i.e., the signature image, in the form of downloadable link or URL.
     * <p><b>200</b> - Signature image as proof of delivered shipment.
     * <p><b>400</b> - Invalid request.
     * <p><b>401</b> - The request could not be authorized.
     * <p><b>500</b> - The request could not be completed due to an internal error.
     * @param shipmentId Shipment ID is a unique identifier for an individual shipment. (required)
     * @param xPBDeveloperPartnerID The Developer Partner ID is assigned by PB to uniquely identify a Developer&#39;s strategic business partners. If the developer is the sole business partner, this field is not required. (optional)
     * @return SignatureFileResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public SignatureFileResponse getSignatureImageERR(String shipmentId, String xPBDeveloperPartnerID) throws RestClientException {
        return getSignatureImageERRWithHttpInfo(shipmentId, xPBDeveloperPartnerID).getBody();
    }

    /**
     * Signature Image ERR
     * This operation provides a downloadable link which consists of a signature image for specific ERR (Electronic Return Receipt) shipment, and this is known as POD. &lt;br /&gt; Proof of Delivery (POD) is a document or file that shows an evidence of shipment delivery. This file contains the digital copy of recipient&#39;s signature, i.e., the signature image, in the form of downloadable link or URL.
     * <p><b>200</b> - Signature image as proof of delivered shipment.
     * <p><b>400</b> - Invalid request.
     * <p><b>401</b> - The request could not be authorized.
     * <p><b>500</b> - The request could not be completed due to an internal error.
     * @param shipmentId Shipment ID is a unique identifier for an individual shipment. (required)
     * @param xPBDeveloperPartnerID The Developer Partner ID is assigned by PB to uniquely identify a Developer&#39;s strategic business partners. If the developer is the sole business partner, this field is not required. (optional)
     * @return ResponseEntity&lt;SignatureFileResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<SignatureFileResponse> getSignatureImageERRWithHttpInfo(String shipmentId, String xPBDeveloperPartnerID) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'shipmentId' is set
        if (shipmentId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'shipmentId' when calling getSignatureImageERR");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("shipmentId", shipmentId);

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

        ParameterizedTypeReference<SignatureFileResponse> localReturnType = new ParameterizedTypeReference<SignatureFileResponse>() {};
        return apiClient.invokeAPI("/api/v1/err/shipments/{shipmentId}/signaturefile", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get Special Services
     * This operation fetches Special Services for a given carrier, service, origin country, and the destination country. If query parameters are not provided, it will default to &#x60;USPS&#x60; as carrier,&#x60;US&#x60; as both origin and destination country and would show for all service and parcel types
     * <p><b>200</b> - The Special Service has been fetched successfully.
     * <p><b>400</b> - Invalid request.
     * <p><b>401</b> - The request could not be authorized.
     * <p><b>500</b> - The request could not be completed due to an internal error.
     * @param xPBDeveloperPartnerID This is the Developer Partner ID. When the developer is the only partner, this field is not required. (optional)
     * @param service This indicates the serviceId. It can be referred from response of &#x60;Get Services&#x60; API (optional)
     * @param parcel This indicates the parcel Id, a unique identifier named to individual package. It can be referred from response of &#x60;Get Parcel Types&#x60; API (optional)
     * @param carrier This indicates the CarrierID, a unique identifier given to  an individual carrier. It can be referred from response of &#x60;Get Carriers&#x60; API (optional)
     * @param originCountryCode This indicates the Source Country. The two-character ISO country code for the country where the Shipment originates. (optional)
     * @param destinationCountryCode This indicates the Destination Country for the Shipment. The two-character ISO country code for the country where the shipment is to be delivered. (optional)
     * @return SpecialServices
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public SpecialServices getSpecialServices(String xPBDeveloperPartnerID, String service, String parcel, String carrier, String originCountryCode, String destinationCountryCode) throws RestClientException {
        return getSpecialServicesWithHttpInfo(xPBDeveloperPartnerID, service, parcel, carrier, originCountryCode, destinationCountryCode).getBody();
    }

    /**
     * Get Special Services
     * This operation fetches Special Services for a given carrier, service, origin country, and the destination country. If query parameters are not provided, it will default to &#x60;USPS&#x60; as carrier,&#x60;US&#x60; as both origin and destination country and would show for all service and parcel types
     * <p><b>200</b> - The Special Service has been fetched successfully.
     * <p><b>400</b> - Invalid request.
     * <p><b>401</b> - The request could not be authorized.
     * <p><b>500</b> - The request could not be completed due to an internal error.
     * @param xPBDeveloperPartnerID This is the Developer Partner ID. When the developer is the only partner, this field is not required. (optional)
     * @param service This indicates the serviceId. It can be referred from response of &#x60;Get Services&#x60; API (optional)
     * @param parcel This indicates the parcel Id, a unique identifier named to individual package. It can be referred from response of &#x60;Get Parcel Types&#x60; API (optional)
     * @param carrier This indicates the CarrierID, a unique identifier given to  an individual carrier. It can be referred from response of &#x60;Get Carriers&#x60; API (optional)
     * @param originCountryCode This indicates the Source Country. The two-character ISO country code for the country where the Shipment originates. (optional)
     * @param destinationCountryCode This indicates the Destination Country for the Shipment. The two-character ISO country code for the country where the shipment is to be delivered. (optional)
     * @return ResponseEntity&lt;SpecialServices&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<SpecialServices> getSpecialServicesWithHttpInfo(String xPBDeveloperPartnerID, String service, String parcel, String carrier, String originCountryCode, String destinationCountryCode) throws RestClientException {
        Object localVarPostBody = null;
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "service", service));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "parcel", parcel));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "carrier", carrier));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "originCountryCode", originCountryCode));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "destinationCountryCode", destinationCountryCode));
        

        if (xPBDeveloperPartnerID != null)
        localVarHeaderParams.add("X-PB-Developer-Partner-ID", apiClient.parameterToString(xPBDeveloperPartnerID));

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "bearerAuth" };

        ParameterizedTypeReference<SpecialServices> localReturnType = new ParameterizedTypeReference<SpecialServices>() {};
        return apiClient.invokeAPI("/api/v1/specialServices", HttpMethod.GET, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Reprint Shipment
     * This operation reprints Shipment by the shipmentId. It retrieves an existing shipping label to reprint. The API sends the shipmentId returned by the original Created Shipment request. Use this only if the shipping label in the Create Shipment response was spoilt or lost.
     * <p><b>200</b> - The shipment has been reprinted.
     * <p><b>400</b> - Invalid request.
     * <p><b>401</b> - The request could not be authorized.
     * <p><b>404</b> - The requested resource was not found.
     * <p><b>500</b> - The request could not be completed due to an internal error.
     * @param shipmentId This indicates the shipmentId, a unique identifier assigned to the Shipment. (required)
     * @param xPBDeveloperPartnerID This is the Developer Partner ID. When the developer is the only partner, this field is not required. (optional)
     * @param compactResponse This header defines if the response required is detailed or compact. When value is set to true, it will only return label layout details and parcel tracking number object in response. (optional)
     * @return ReprintShipment
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ReprintShipment reprintShipmentById(String shipmentId, String xPBDeveloperPartnerID, Boolean compactResponse) throws RestClientException {
        return reprintShipmentByIdWithHttpInfo(shipmentId, xPBDeveloperPartnerID, compactResponse).getBody();
    }

    /**
     * Reprint Shipment
     * This operation reprints Shipment by the shipmentId. It retrieves an existing shipping label to reprint. The API sends the shipmentId returned by the original Created Shipment request. Use this only if the shipping label in the Create Shipment response was spoilt or lost.
     * <p><b>200</b> - The shipment has been reprinted.
     * <p><b>400</b> - Invalid request.
     * <p><b>401</b> - The request could not be authorized.
     * <p><b>404</b> - The requested resource was not found.
     * <p><b>500</b> - The request could not be completed due to an internal error.
     * @param shipmentId This indicates the shipmentId, a unique identifier assigned to the Shipment. (required)
     * @param xPBDeveloperPartnerID This is the Developer Partner ID. When the developer is the only partner, this field is not required. (optional)
     * @param compactResponse This header defines if the response required is detailed or compact. When value is set to true, it will only return label layout details and parcel tracking number object in response. (optional)
     * @return ResponseEntity&lt;ReprintShipment&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ReprintShipment> reprintShipmentByIdWithHttpInfo(String shipmentId, String xPBDeveloperPartnerID, Boolean compactResponse) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'shipmentId' is set
        if (shipmentId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'shipmentId' when calling reprintShipmentById");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("shipmentId", shipmentId);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        if (xPBDeveloperPartnerID != null)
        localVarHeaderParams.add("X-PB-Developer-Partner-ID", apiClient.parameterToString(xPBDeveloperPartnerID));
        if (compactResponse != null)
        localVarHeaderParams.add("compactResponse", apiClient.parameterToString(compactResponse));

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "bearerAuth" };

        ParameterizedTypeReference<ReprintShipment> localReturnType = new ParameterizedTypeReference<ReprintShipment>() {};
        return apiClient.invokeAPI("/api/v1/shipments/{shipmentId}/reprint", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get Shipment by Id
     * This operation retrieves shipment details using shipmentId.
     * <p><b>200</b> - The shipment has been retrieved.
     * <p><b>400</b> - Invalid request.
     * <p><b>401</b> - The request could not be authorized.
     * <p><b>404</b> - The requested resource was not found.
     * <p><b>500</b> - The request could not be completed due to an internal error.
     * @param shipmentId This indicates the shipmentId, a unique identifier for an individual Shipment. (required)
     * @param xPBDeveloperPartnerID This is the Developer Partner ID. When the developer is the only partner, this field is not required. (optional)
     * @return GetSingleShipment
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public GetSingleShipment shipmentById(String shipmentId, String xPBDeveloperPartnerID) throws RestClientException {
        return shipmentByIdWithHttpInfo(shipmentId, xPBDeveloperPartnerID).getBody();
    }

    /**
     * Get Shipment by Id
     * This operation retrieves shipment details using shipmentId.
     * <p><b>200</b> - The shipment has been retrieved.
     * <p><b>400</b> - Invalid request.
     * <p><b>401</b> - The request could not be authorized.
     * <p><b>404</b> - The requested resource was not found.
     * <p><b>500</b> - The request could not be completed due to an internal error.
     * @param shipmentId This indicates the shipmentId, a unique identifier for an individual Shipment. (required)
     * @param xPBDeveloperPartnerID This is the Developer Partner ID. When the developer is the only partner, this field is not required. (optional)
     * @return ResponseEntity&lt;GetSingleShipment&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<GetSingleShipment> shipmentByIdWithHttpInfo(String shipmentId, String xPBDeveloperPartnerID) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'shipmentId' is set
        if (shipmentId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'shipmentId' when calling shipmentById");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("shipmentId", shipmentId);

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

        ParameterizedTypeReference<GetSingleShipment> localReturnType = new ParameterizedTypeReference<GetSingleShipment>() {};
        return apiClient.invokeAPI("/api/v1/shipments/{shipmentId}", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
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
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "bearerAuth" };

        return apiClient.invokeAPI(localVarPath, method, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, returnType);
    }
}
