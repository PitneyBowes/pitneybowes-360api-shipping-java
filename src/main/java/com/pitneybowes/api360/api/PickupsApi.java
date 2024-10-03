package com.pitneybowes.api360.api;

import java.math.BigDecimal;
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
import com.pitneybowes.api360.model.GetAllPickups;
import com.pitneybowes.api360.model.GetPickupCancelledDocumentRequest;
import com.pitneybowes.api360.model.GetPickupCancelledDocumentResponse;
import com.pitneybowes.api360.model.GetPickupDocument;
import com.pitneybowes.api360.model.SchedulePickup200Response;
import com.pitneybowes.api360.model.SchedulePickupCancelRequest;
import com.pitneybowes.api360.model.SchedulePickupCancelResponse;
import com.pitneybowes.api360.model.SchedulePickupRequest;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-09-30T12:57:37.504069+05:30[Asia/Kolkata]", comments = "Generator version: 7.7.0")
public class PickupsApi extends BaseApi {

    public PickupsApi() {
        super(new ApiClient());
    }

    public PickupsApi(ApiClient apiClient) {
        super(apiClient);
    }

    /**
     * Cancel Pickups
     * This operation is used to Cancel the scheduled pickup.
     * <p><b>200</b> - Pick up cancelled successfully.
     * <p><b>400</b> - Invalid request.
     * <p><b>401</b> - The request could not be authorized.
     * <p><b>500</b> - The request could not be completed due to an internal error.
     * @param schedulePickupCancelRequest  (required)
     * @param xPBDeveloperPartnerID This is the Developer Partner ID. When the developer is the only partner, this field is not required. (optional)
     * @return SchedulePickupCancelResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public SchedulePickupCancelResponse cancelPickups(SchedulePickupCancelRequest schedulePickupCancelRequest, String xPBDeveloperPartnerID) throws RestClientException {
        return cancelPickupsWithHttpInfo(schedulePickupCancelRequest, xPBDeveloperPartnerID).getBody();
    }

    /**
     * Cancel Pickups
     * This operation is used to Cancel the scheduled pickup.
     * <p><b>200</b> - Pick up cancelled successfully.
     * <p><b>400</b> - Invalid request.
     * <p><b>401</b> - The request could not be authorized.
     * <p><b>500</b> - The request could not be completed due to an internal error.
     * @param schedulePickupCancelRequest  (required)
     * @param xPBDeveloperPartnerID This is the Developer Partner ID. When the developer is the only partner, this field is not required. (optional)
     * @return ResponseEntity&lt;SchedulePickupCancelResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<SchedulePickupCancelResponse> cancelPickupsWithHttpInfo(SchedulePickupCancelRequest schedulePickupCancelRequest, String xPBDeveloperPartnerID) throws RestClientException {
        Object localVarPostBody = schedulePickupCancelRequest;
        
        // verify the required parameter 'schedulePickupCancelRequest' is set
        if (schedulePickupCancelRequest == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'schedulePickupCancelRequest' when calling cancelPickups");
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

        ParameterizedTypeReference<SchedulePickupCancelResponse> localReturnType = new ParameterizedTypeReference<SchedulePickupCancelResponse>() {};
        return apiClient.invokeAPI("/api/v1/pickups/cancel", HttpMethod.PUT, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Cancelled Pickup Document
     * This operation is used to get receipt for pickup cancellation. The receipt generated is in PDF format. &lt;br&gt; This operation can create receipt for multiple pickups which are cancelled.
     * <p><b>200</b> - The pick up has been cancelled.
     * <p><b>400</b> - Invalid request.
     * <p><b>401</b> - The request could not be authorized.
     * <p><b>500</b> - The request could not be completed due to an internal error.
     * @param type Indicates type of pickup. Supported value is &#x60;cancelled&#x60;. (required)
     * @param getPickupCancelledDocumentRequest  (required)
     * @param xPBDeveloperPartnerID This is the Developer Partner ID. When the developer is the only partner, this field is not required. (optional)
     * @return GetPickupCancelledDocumentResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public GetPickupCancelledDocumentResponse cancelledPickupDocument(String type, GetPickupCancelledDocumentRequest getPickupCancelledDocumentRequest, String xPBDeveloperPartnerID) throws RestClientException {
        return cancelledPickupDocumentWithHttpInfo(type, getPickupCancelledDocumentRequest, xPBDeveloperPartnerID).getBody();
    }

    /**
     * Cancelled Pickup Document
     * This operation is used to get receipt for pickup cancellation. The receipt generated is in PDF format. &lt;br&gt; This operation can create receipt for multiple pickups which are cancelled.
     * <p><b>200</b> - The pick up has been cancelled.
     * <p><b>400</b> - Invalid request.
     * <p><b>401</b> - The request could not be authorized.
     * <p><b>500</b> - The request could not be completed due to an internal error.
     * @param type Indicates type of pickup. Supported value is &#x60;cancelled&#x60;. (required)
     * @param getPickupCancelledDocumentRequest  (required)
     * @param xPBDeveloperPartnerID This is the Developer Partner ID. When the developer is the only partner, this field is not required. (optional)
     * @return ResponseEntity&lt;GetPickupCancelledDocumentResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<GetPickupCancelledDocumentResponse> cancelledPickupDocumentWithHttpInfo(String type, GetPickupCancelledDocumentRequest getPickupCancelledDocumentRequest, String xPBDeveloperPartnerID) throws RestClientException {
        Object localVarPostBody = getPickupCancelledDocumentRequest;
        
        // verify the required parameter 'type' is set
        if (type == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'type' when calling cancelledPickupDocument");
        }
        
        // verify the required parameter 'getPickupCancelledDocumentRequest' is set
        if (getPickupCancelledDocumentRequest == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'getPickupCancelledDocumentRequest' when calling cancelledPickupDocument");
        }
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "type", type));
        

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

        ParameterizedTypeReference<GetPickupCancelledDocumentResponse> localReturnType = new ParameterizedTypeReference<GetPickupCancelledDocumentResponse>() {};
        return apiClient.invokeAPI("/api/v1/pickups/document", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get Pickup Document
     * This operation returns the scheduled pickup or cancellation receipt in PDF format.
     * <p><b>200</b> - Pick up document have been fetched.
     * <p><b>400</b> - Invalid request.
     * <p><b>401</b> - The request could not be authorized.
     * <p><b>500</b> - The request could not be completed due to an internal error.
     * @param pickupId It specified the pickupId for which PDF receipt is needed. (required)
     * @param xPBDeveloperPartnerID This is the Developer Partner ID. When the developer is the only partner, this field is not required. (optional)
     * @return GetPickupDocument
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public GetPickupDocument getPickupDocument(String pickupId, String xPBDeveloperPartnerID) throws RestClientException {
        return getPickupDocumentWithHttpInfo(pickupId, xPBDeveloperPartnerID).getBody();
    }

    /**
     * Get Pickup Document
     * This operation returns the scheduled pickup or cancellation receipt in PDF format.
     * <p><b>200</b> - Pick up document have been fetched.
     * <p><b>400</b> - Invalid request.
     * <p><b>401</b> - The request could not be authorized.
     * <p><b>500</b> - The request could not be completed due to an internal error.
     * @param pickupId It specified the pickupId for which PDF receipt is needed. (required)
     * @param xPBDeveloperPartnerID This is the Developer Partner ID. When the developer is the only partner, this field is not required. (optional)
     * @return ResponseEntity&lt;GetPickupDocument&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<GetPickupDocument> getPickupDocumentWithHttpInfo(String pickupId, String xPBDeveloperPartnerID) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'pickupId' is set
        if (pickupId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'pickupId' when calling getPickupDocument");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("pickupId", pickupId);

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

        ParameterizedTypeReference<GetPickupDocument> localReturnType = new ParameterizedTypeReference<GetPickupDocument>() {};
        return apiClient.invokeAPI("/api/v1/pickups/{pickupId}/document", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get Pickups
     * This operation is used to view the history of pickups scheduled or cancelled for your packages.
     * <p><b>200</b> - List of pickups.
     * <p><b>400</b> - Invalid request.
     * <p><b>401</b> - The request could not be authorized.
     * <p><b>500</b> - The request could not be completed due to an internal error.
     * @param xPBDeveloperPartnerID This is the Developer Partner ID. When the developer is the only partner, this field is not required. (optional)
     * @param carrier Indicates CarrierID. If not provided, it would show pickups for all the carriers. (optional)
     * @param startDate Indicates start date from when you want to see the history. If not provided, it will take today&#39;s date. (optional)
     * @param endDate Indicates end date till you want to see the pickups history. If not provide, it will take today&#39;s date. (optional)
     * @param status Indicates status of the pickup(schedule or cancel). If not provided, it will show the response for both status. (optional)
     * @param page Indicates page number, if not provided page would be 1. (optional)
     * @param size Indicates size of records, if not provided size would be 20 (optional)
     * @return GetAllPickups
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public GetAllPickups getPickups(String xPBDeveloperPartnerID, String carrier, String startDate, String endDate, String status, BigDecimal page, BigDecimal size) throws RestClientException {
        return getPickupsWithHttpInfo(xPBDeveloperPartnerID, carrier, startDate, endDate, status, page, size).getBody();
    }

    /**
     * Get Pickups
     * This operation is used to view the history of pickups scheduled or cancelled for your packages.
     * <p><b>200</b> - List of pickups.
     * <p><b>400</b> - Invalid request.
     * <p><b>401</b> - The request could not be authorized.
     * <p><b>500</b> - The request could not be completed due to an internal error.
     * @param xPBDeveloperPartnerID This is the Developer Partner ID. When the developer is the only partner, this field is not required. (optional)
     * @param carrier Indicates CarrierID. If not provided, it would show pickups for all the carriers. (optional)
     * @param startDate Indicates start date from when you want to see the history. If not provided, it will take today&#39;s date. (optional)
     * @param endDate Indicates end date till you want to see the pickups history. If not provide, it will take today&#39;s date. (optional)
     * @param status Indicates status of the pickup(schedule or cancel). If not provided, it will show the response for both status. (optional)
     * @param page Indicates page number, if not provided page would be 1. (optional)
     * @param size Indicates size of records, if not provided size would be 20 (optional)
     * @return ResponseEntity&lt;GetAllPickups&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<GetAllPickups> getPickupsWithHttpInfo(String xPBDeveloperPartnerID, String carrier, String startDate, String endDate, String status, BigDecimal page, BigDecimal size) throws RestClientException {
        Object localVarPostBody = null;
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "carrier", carrier));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "startDate", startDate));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "endDate", endDate));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "status", status));
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

        ParameterizedTypeReference<GetAllPickups> localReturnType = new ParameterizedTypeReference<GetAllPickups>() {};
        return apiClient.invokeAPI("/api/v1/pickups", HttpMethod.GET, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Schedule Pickup
     * This operation allows to schedule Pickups with USPS, UPS, FedEx and DHLExpress for eligible shipments. &lt;br&gt; Below are four possible combinations for scheduling pickup &lt;br&gt;  &lt;br&gt; 1. When request does not specify &#x60;pickupSummary&#x60; and &#x60;shipmentIds&#x60;- The system would consider all eligible shipments created in a current day. &lt;br&gt; 2. When request specifies only &#x60;shipmentIds&#x60;- Pickup will be created for the shipmentIds mentioned &lt;br&gt; 3. When request specifies only &#x60;pickupSummary&#x60;- Pickup will be created for the pickup details mentioned in the pickupSummary &lt;br&gt; 4. When request specifies both &#x60;pickupSummary&#x60; and &#x60;shipmentIds&#x60;- Pickup will be created including details mentioned in both objects.
     * <p><b>200</b> - The Pick up has been created successfully.
     * <p><b>400</b> - Invalid request.
     * <p><b>401</b> - The request could not be authorized.
     * <p><b>500</b> - The request could not be completed due to an internal error.
     * @param schedulePickupRequest  (required)
     * @param xPBDeveloperPartnerID This is the Developer Partner ID. When the developer is the only partner, this field is not required. (optional)
     * @return SchedulePickup200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public SchedulePickup200Response schedulePickup(SchedulePickupRequest schedulePickupRequest, String xPBDeveloperPartnerID) throws RestClientException {
        return schedulePickupWithHttpInfo(schedulePickupRequest, xPBDeveloperPartnerID).getBody();
    }

    /**
     * Schedule Pickup
     * This operation allows to schedule Pickups with USPS, UPS, FedEx and DHLExpress for eligible shipments. &lt;br&gt; Below are four possible combinations for scheduling pickup &lt;br&gt;  &lt;br&gt; 1. When request does not specify &#x60;pickupSummary&#x60; and &#x60;shipmentIds&#x60;- The system would consider all eligible shipments created in a current day. &lt;br&gt; 2. When request specifies only &#x60;shipmentIds&#x60;- Pickup will be created for the shipmentIds mentioned &lt;br&gt; 3. When request specifies only &#x60;pickupSummary&#x60;- Pickup will be created for the pickup details mentioned in the pickupSummary &lt;br&gt; 4. When request specifies both &#x60;pickupSummary&#x60; and &#x60;shipmentIds&#x60;- Pickup will be created including details mentioned in both objects.
     * <p><b>200</b> - The Pick up has been created successfully.
     * <p><b>400</b> - Invalid request.
     * <p><b>401</b> - The request could not be authorized.
     * <p><b>500</b> - The request could not be completed due to an internal error.
     * @param schedulePickupRequest  (required)
     * @param xPBDeveloperPartnerID This is the Developer Partner ID. When the developer is the only partner, this field is not required. (optional)
     * @return ResponseEntity&lt;SchedulePickup200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<SchedulePickup200Response> schedulePickupWithHttpInfo(SchedulePickupRequest schedulePickupRequest, String xPBDeveloperPartnerID) throws RestClientException {
        Object localVarPostBody = schedulePickupRequest;
        
        // verify the required parameter 'schedulePickupRequest' is set
        if (schedulePickupRequest == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'schedulePickupRequest' when calling schedulePickup");
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

        ParameterizedTypeReference<SchedulePickup200Response> localReturnType = new ParameterizedTypeReference<SchedulePickup200Response>() {};
        return apiClient.invokeAPI("/api/v1/pickups", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
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
