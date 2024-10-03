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
import com.pitneybowes.api360.model.CancelShipment;
import com.pitneybowes.api360.model.MultipieceDomesticShipmentResponse;
import com.pitneybowes.api360.model.MultipieceRates200Response;
import com.pitneybowes.api360.model.MultipieceRatesRequest;
import com.pitneybowes.api360.model.MultipieceShipment200Response;
import com.pitneybowes.api360.model.MultipieceShipmentRequest;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-09-30T12:57:37.504069+05:30[Asia/Kolkata]", comments = "Generator version: 7.7.0")
public class MultipieceApi extends BaseApi {

    public MultipieceApi() {
        super(new ApiClient());
    }

    public MultipieceApi(ApiClient apiClient) {
        super(apiClient);
    }

    /**
     * Multipiece Rateshop and Rates
     * This API contains 2 operations, rate shop and single rate. Rate shop will fetch rates for all carrier services based on the given addresses (From and To), weight, and dimension for given parcelType in multiPieceParcels object. Single rate will get rate for specific service and special service (if requested) based on the given addresses (From and To), weight, and dimension, parcelType and serviceId with or without specialServices. Single rate will be used mainly to a rate a shipment before creating shipment.  &lt;br&gt; For UPS- multipiece shipment with Envelopes (having parcel Type as LTR) is not supported.  &lt;br&gt; For FEDEX Multipiece, all parcels must be of same packaging type while creating multipiece shipment
     * <p><b>200</b> - The Multipiece Rates created successfully.
     * <p><b>400</b> - Invalid request.
     * <p><b>401</b> - The request could not be authorized.
     * <p><b>500</b> - The request could not be completed due to an internal error.
     * @param multipieceRatesRequest  (required)
     * @param xPBDeveloperPartnerID This is the Develover Partner ID. When the developer is the only partner, this field is not required. (optional)
     * @return MultipieceRates200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public MultipieceRates200Response multipieceRates(MultipieceRatesRequest multipieceRatesRequest, String xPBDeveloperPartnerID) throws RestClientException {
        return multipieceRatesWithHttpInfo(multipieceRatesRequest, xPBDeveloperPartnerID).getBody();
    }

    /**
     * Multipiece Rateshop and Rates
     * This API contains 2 operations, rate shop and single rate. Rate shop will fetch rates for all carrier services based on the given addresses (From and To), weight, and dimension for given parcelType in multiPieceParcels object. Single rate will get rate for specific service and special service (if requested) based on the given addresses (From and To), weight, and dimension, parcelType and serviceId with or without specialServices. Single rate will be used mainly to a rate a shipment before creating shipment.  &lt;br&gt; For UPS- multipiece shipment with Envelopes (having parcel Type as LTR) is not supported.  &lt;br&gt; For FEDEX Multipiece, all parcels must be of same packaging type while creating multipiece shipment
     * <p><b>200</b> - The Multipiece Rates created successfully.
     * <p><b>400</b> - Invalid request.
     * <p><b>401</b> - The request could not be authorized.
     * <p><b>500</b> - The request could not be completed due to an internal error.
     * @param multipieceRatesRequest  (required)
     * @param xPBDeveloperPartnerID This is the Develover Partner ID. When the developer is the only partner, this field is not required. (optional)
     * @return ResponseEntity&lt;MultipieceRates200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<MultipieceRates200Response> multipieceRatesWithHttpInfo(MultipieceRatesRequest multipieceRatesRequest, String xPBDeveloperPartnerID) throws RestClientException {
        Object localVarPostBody = multipieceRatesRequest;
        
        // verify the required parameter 'multipieceRatesRequest' is set
        if (multipieceRatesRequest == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'multipieceRatesRequest' when calling multipieceRates");
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

        ParameterizedTypeReference<MultipieceRates200Response> localReturnType = new ParameterizedTypeReference<MultipieceRates200Response>() {};
        return apiClient.invokeAPI("/api/v1/multipiece/rates", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Multipiece Shipment
     * This operation is used to create Multipiece Shipments. UPS, FedEx and DHL Express are supported for Multipiece Shipments.  &lt;br&gt; For UPS- multipiece shipment with Envelopes (having parcel Type as LTR) is not supported.  &lt;br&gt; For FEDEX Multipiece, all parcels must be of same packaging type while creating multipiece shipment
     * <p><b>200</b> - The Multipiece Shipment created successfully.
     * <p><b>400</b> - Invalid request.
     * <p><b>401</b> - The request could not be authorized.
     * <p><b>500</b> - The request could not be completed due to an internal error.
     * @param multipieceShipmentRequest  (required)
     * @param xPBDeveloperPartnerID This is the Develover Partner ID. When the developer is the only partner, this field is not required. (optional)
     * @return MultipieceShipment200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public MultipieceShipment200Response multipieceShipment(MultipieceShipmentRequest multipieceShipmentRequest, String xPBDeveloperPartnerID) throws RestClientException {
        return multipieceShipmentWithHttpInfo(multipieceShipmentRequest, xPBDeveloperPartnerID).getBody();
    }

    /**
     * Multipiece Shipment
     * This operation is used to create Multipiece Shipments. UPS, FedEx and DHL Express are supported for Multipiece Shipments.  &lt;br&gt; For UPS- multipiece shipment with Envelopes (having parcel Type as LTR) is not supported.  &lt;br&gt; For FEDEX Multipiece, all parcels must be of same packaging type while creating multipiece shipment
     * <p><b>200</b> - The Multipiece Shipment created successfully.
     * <p><b>400</b> - Invalid request.
     * <p><b>401</b> - The request could not be authorized.
     * <p><b>500</b> - The request could not be completed due to an internal error.
     * @param multipieceShipmentRequest  (required)
     * @param xPBDeveloperPartnerID This is the Develover Partner ID. When the developer is the only partner, this field is not required. (optional)
     * @return ResponseEntity&lt;MultipieceShipment200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<MultipieceShipment200Response> multipieceShipmentWithHttpInfo(MultipieceShipmentRequest multipieceShipmentRequest, String xPBDeveloperPartnerID) throws RestClientException {
        Object localVarPostBody = multipieceShipmentRequest;
        
        // verify the required parameter 'multipieceShipmentRequest' is set
        if (multipieceShipmentRequest == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'multipieceShipmentRequest' when calling multipieceShipment");
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

        ParameterizedTypeReference<MultipieceShipment200Response> localReturnType = new ParameterizedTypeReference<MultipieceShipment200Response>() {};
        return apiClient.invokeAPI("/api/v1/multipiece/shipments", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Cancel Multipiece Shipment
     * This operation is used to cancel the multipiece label. It takes the shipmentId of the multipiece shipment done.
     * <p><b>200</b> - The Multipiece Shipment created successfully.
     * <p><b>400</b> - Invalid request.
     * <p><b>401</b> - The request could not be authorized.
     * <p><b>500</b> - The request could not be completed due to an internal error.
     * @param shipmentId It specifies the shipmentId of onward shipment against which return label has to be created. (required)
     * @param xPBDeveloperPartnerID This is the Develover Partner ID. When the developer is the only partner, this field is not required. (optional)
     * @return CancelShipment
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public CancelShipment multipieceShipmentCancel(String shipmentId, String xPBDeveloperPartnerID) throws RestClientException {
        return multipieceShipmentCancelWithHttpInfo(shipmentId, xPBDeveloperPartnerID).getBody();
    }

    /**
     * Cancel Multipiece Shipment
     * This operation is used to cancel the multipiece label. It takes the shipmentId of the multipiece shipment done.
     * <p><b>200</b> - The Multipiece Shipment created successfully.
     * <p><b>400</b> - Invalid request.
     * <p><b>401</b> - The request could not be authorized.
     * <p><b>500</b> - The request could not be completed due to an internal error.
     * @param shipmentId It specifies the shipmentId of onward shipment against which return label has to be created. (required)
     * @param xPBDeveloperPartnerID This is the Develover Partner ID. When the developer is the only partner, this field is not required. (optional)
     * @return ResponseEntity&lt;CancelShipment&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<CancelShipment> multipieceShipmentCancelWithHttpInfo(String shipmentId, String xPBDeveloperPartnerID) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'shipmentId' is set
        if (shipmentId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'shipmentId' when calling multipieceShipmentCancel");
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
        return apiClient.invokeAPI("/api/v1/multipiece/shipments/{shipmentId}/cancel", HttpMethod.PUT, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Reprint Multipiece Shipment
     * This operation is used to reprint the multipiece label. It takes the shipmentId of the multipiece shipment done.
     * <p><b>200</b> - The Multipiece Shipment created successfully.
     * <p><b>400</b> - Invalid request.
     * <p><b>401</b> - The request could not be authorized.
     * <p><b>500</b> - The request could not be completed due to an internal error.
     * @param shipmentId It specifies the shipmentId of onward shipment against which return label has to be created. (required)
     * @param xPBDeveloperPartnerID This is the Develover Partner ID. When the developer is the only partner, this field is not required. (optional)
     * @return MultipieceDomesticShipmentResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public MultipieceDomesticShipmentResponse multipieceShipmentReprint(String shipmentId, String xPBDeveloperPartnerID) throws RestClientException {
        return multipieceShipmentReprintWithHttpInfo(shipmentId, xPBDeveloperPartnerID).getBody();
    }

    /**
     * Reprint Multipiece Shipment
     * This operation is used to reprint the multipiece label. It takes the shipmentId of the multipiece shipment done.
     * <p><b>200</b> - The Multipiece Shipment created successfully.
     * <p><b>400</b> - Invalid request.
     * <p><b>401</b> - The request could not be authorized.
     * <p><b>500</b> - The request could not be completed due to an internal error.
     * @param shipmentId It specifies the shipmentId of onward shipment against which return label has to be created. (required)
     * @param xPBDeveloperPartnerID This is the Develover Partner ID. When the developer is the only partner, this field is not required. (optional)
     * @return ResponseEntity&lt;MultipieceDomesticShipmentResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<MultipieceDomesticShipmentResponse> multipieceShipmentReprintWithHttpInfo(String shipmentId, String xPBDeveloperPartnerID) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'shipmentId' is set
        if (shipmentId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'shipmentId' when calling multipieceShipmentReprint");
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

        ParameterizedTypeReference<MultipieceDomesticShipmentResponse> localReturnType = new ParameterizedTypeReference<MultipieceDomesticShipmentResponse>() {};
        return apiClient.invokeAPI("/api/v1/multipiece/shipments/{shipmentId}/reprint", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
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
