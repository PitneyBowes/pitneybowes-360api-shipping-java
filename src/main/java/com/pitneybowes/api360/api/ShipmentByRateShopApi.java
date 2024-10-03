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
import com.pitneybowes.api360.model.CancelShipmentV2;
import com.pitneybowes.api360.model.CreateShipmentV2Request;
import com.pitneybowes.api360.model.DomesticShipmentResponseV2;
import com.pitneybowes.api360.model.ReprintShipmentV2;
import com.pitneybowes.api360.model.ShipmentCancelV2;
import com.pitneybowes.api360.model.ShipmentReprintV2;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-09-30T12:57:37.504069+05:30[Asia/Kolkata]", comments = "Generator version: 7.7.0")
public class ShipmentByRateShopApi extends BaseApi {

    public ShipmentByRateShopApi() {
        super(new ApiClient());
    }

    public ShipmentByRateShopApi(ApiClient apiClient) {
        super(apiClient);
    }

    /**
     * Cancel Shipment
     * The operation cancel/void shipment.
     * <p><b>200</b> - The Shipment has been cancelled.
     * <p><b>400</b> - Invalid request.
     * <p><b>401</b> - The request could not be authorized.
     * <p><b>404</b> - The requested resource was not found.
     * <p><b>500</b> - The request could not be completed due to an internal error.
     * @param shipmentCancelV2  (required)
     * @param xPBDeveloperPartnerId The Developer Partner ID is assigned by PB to uniquely identify a Developer&#39;s strategic business partners. If the developer is the sole business partner, this field isn&#39;t required. (optional)
     * @param xPBLocationId This is the Location ID assigned as per the Developer&#39;s and Partner&#39;s parsed locations, to which all transactions will be billed. &lt;br /&gt; Partner&#39;s location will be used for billing if it is configured, however, in case Partner&#39;s location is not given, then the Developer&#39;s location will be taken. Developer&#39;s location will be the default value. &lt;br /&gt; Additionally, Developers and Partners can use carriers belong to this location only. (optional)
     * @param xPBTransactionId A unique Transaction ID provided by the partner which is used to enable debugging and linking between the client&#39;s transaction and the system. (optional)
     * @return CancelShipmentV2
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public CancelShipmentV2 cancelShipmentByIdV2(ShipmentCancelV2 shipmentCancelV2, String xPBDeveloperPartnerId, String xPBLocationId, String xPBTransactionId) throws RestClientException {
        return cancelShipmentByIdV2WithHttpInfo(shipmentCancelV2, xPBDeveloperPartnerId, xPBLocationId, xPBTransactionId).getBody();
    }

    /**
     * Cancel Shipment
     * The operation cancel/void shipment.
     * <p><b>200</b> - The Shipment has been cancelled.
     * <p><b>400</b> - Invalid request.
     * <p><b>401</b> - The request could not be authorized.
     * <p><b>404</b> - The requested resource was not found.
     * <p><b>500</b> - The request could not be completed due to an internal error.
     * @param shipmentCancelV2  (required)
     * @param xPBDeveloperPartnerId The Developer Partner ID is assigned by PB to uniquely identify a Developer&#39;s strategic business partners. If the developer is the sole business partner, this field isn&#39;t required. (optional)
     * @param xPBLocationId This is the Location ID assigned as per the Developer&#39;s and Partner&#39;s parsed locations, to which all transactions will be billed. &lt;br /&gt; Partner&#39;s location will be used for billing if it is configured, however, in case Partner&#39;s location is not given, then the Developer&#39;s location will be taken. Developer&#39;s location will be the default value. &lt;br /&gt; Additionally, Developers and Partners can use carriers belong to this location only. (optional)
     * @param xPBTransactionId A unique Transaction ID provided by the partner which is used to enable debugging and linking between the client&#39;s transaction and the system. (optional)
     * @return ResponseEntity&lt;CancelShipmentV2&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<CancelShipmentV2> cancelShipmentByIdV2WithHttpInfo(ShipmentCancelV2 shipmentCancelV2, String xPBDeveloperPartnerId, String xPBLocationId, String xPBTransactionId) throws RestClientException {
        Object localVarPostBody = shipmentCancelV2;
        
        // verify the required parameter 'shipmentCancelV2' is set
        if (shipmentCancelV2 == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'shipmentCancelV2' when calling cancelShipmentByIdV2");
        }
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        if (xPBDeveloperPartnerId != null)
        localVarHeaderParams.add("X-PB-Developer-Partner-Id", apiClient.parameterToString(xPBDeveloperPartnerId));
        if (xPBLocationId != null)
        localVarHeaderParams.add("X-PB-LocationId", apiClient.parameterToString(xPBLocationId));
        if (xPBTransactionId != null)
        localVarHeaderParams.add("X-PB-TransactionId", apiClient.parameterToString(xPBTransactionId));

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/json"
         };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "bearerAuth" };

        ParameterizedTypeReference<CancelShipmentV2> localReturnType = new ParameterizedTypeReference<CancelShipmentV2>() {};
        return apiClient.invokeAPI("/api/v2/shipments/cancel", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Create Shipment
     * The operation creates a new Shipment or generate a Shipment Label. - To create a domestic shipment, the operation requires   - Domestic addresses &#39;To&#39; and &#39;From&#39; locations respectively within the same country   - carrier services, and   - associated special services. - While for the International shipment, the operation requires   - International address(es) for delivery, that is &#39;To&#39; address must be the international country location(s) and not the same country mentioned in &#39;From&#39; address   - supported international carrier services   - associated special service(s), and    - customs information. 
     * <p><b>200</b> - The shipment has been created successfully.
     * <p><b>400</b> - Invalid request.
     * <p><b>401</b> - The request could not be authorized.
     * <p><b>500</b> - The request could not be completed due to an internal error.
     * @param createShipmentV2Request  (required)
     * @param xPBDeveloperPartnerId The Developer Partner ID is assigned by PB to uniquely identify a Developer&#39;s strategic business partners. If the developer is the sole business partner, this field isn&#39;t required. (optional)
     * @param xPBLocationId This is the Location ID assigned as per the Developer&#39;s and Partner&#39;s parsed locations, to which all transactions will be billed. &lt;br /&gt; Partner&#39;s location will be used for billing if it is configured, however, in case Partner&#39;s location is not given, then the Developer&#39;s location will be taken. Developer&#39;s location will be the default value. &lt;br /&gt; Additionally, Developers and Partners can use carriers belong to this location only. (optional)
     * @param xPBTransactionId A unique Transaction ID provided by the partner, which is used to enable debugging and linking between the client&#39;s transaction and the system. (optional)
     * @return DomesticShipmentResponseV2
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public DomesticShipmentResponseV2 createShipmentV2(CreateShipmentV2Request createShipmentV2Request, String xPBDeveloperPartnerId, String xPBLocationId, String xPBTransactionId) throws RestClientException {
        return createShipmentV2WithHttpInfo(createShipmentV2Request, xPBDeveloperPartnerId, xPBLocationId, xPBTransactionId).getBody();
    }

    /**
     * Create Shipment
     * The operation creates a new Shipment or generate a Shipment Label. - To create a domestic shipment, the operation requires   - Domestic addresses &#39;To&#39; and &#39;From&#39; locations respectively within the same country   - carrier services, and   - associated special services. - While for the International shipment, the operation requires   - International address(es) for delivery, that is &#39;To&#39; address must be the international country location(s) and not the same country mentioned in &#39;From&#39; address   - supported international carrier services   - associated special service(s), and    - customs information. 
     * <p><b>200</b> - The shipment has been created successfully.
     * <p><b>400</b> - Invalid request.
     * <p><b>401</b> - The request could not be authorized.
     * <p><b>500</b> - The request could not be completed due to an internal error.
     * @param createShipmentV2Request  (required)
     * @param xPBDeveloperPartnerId The Developer Partner ID is assigned by PB to uniquely identify a Developer&#39;s strategic business partners. If the developer is the sole business partner, this field isn&#39;t required. (optional)
     * @param xPBLocationId This is the Location ID assigned as per the Developer&#39;s and Partner&#39;s parsed locations, to which all transactions will be billed. &lt;br /&gt; Partner&#39;s location will be used for billing if it is configured, however, in case Partner&#39;s location is not given, then the Developer&#39;s location will be taken. Developer&#39;s location will be the default value. &lt;br /&gt; Additionally, Developers and Partners can use carriers belong to this location only. (optional)
     * @param xPBTransactionId A unique Transaction ID provided by the partner, which is used to enable debugging and linking between the client&#39;s transaction and the system. (optional)
     * @return ResponseEntity&lt;DomesticShipmentResponseV2&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<DomesticShipmentResponseV2> createShipmentV2WithHttpInfo(CreateShipmentV2Request createShipmentV2Request, String xPBDeveloperPartnerId, String xPBLocationId, String xPBTransactionId) throws RestClientException {
        Object localVarPostBody = createShipmentV2Request;
        
        // verify the required parameter 'createShipmentV2Request' is set
        if (createShipmentV2Request == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'createShipmentV2Request' when calling createShipmentV2");
        }
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        if (xPBDeveloperPartnerId != null)
        localVarHeaderParams.add("X-PB-Developer-Partner-Id", apiClient.parameterToString(xPBDeveloperPartnerId));
        if (xPBLocationId != null)
        localVarHeaderParams.add("X-PB-LocationId", apiClient.parameterToString(xPBLocationId));
        if (xPBTransactionId != null)
        localVarHeaderParams.add("X-PB-TransactionId", apiClient.parameterToString(xPBTransactionId));

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/json"
         };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "bearerAuth" };

        ParameterizedTypeReference<DomesticShipmentResponseV2> localReturnType = new ParameterizedTypeReference<DomesticShipmentResponseV2>() {};
        return apiClient.invokeAPI("/api/v2/shipments", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Reprint Shipment
     * The operation reprints Shipment by the shipmentId. It retrieves an existing shipping label to reprint. The API sends the shipmentID returned by the original created shipment request. Use this only if the shipping label in the Create Shipment response is missing or lost.
     * <p><b>200</b> - The shipment has been reprinted.
     * <p><b>400</b> - Invalid request.
     * <p><b>401</b> - The request could not be authorized.
     * <p><b>404</b> - The requested resource was not found.
     * <p><b>500</b> - The request could not be completed due to an internal error.
     * @param shipmentReprintV2  (required)
     * @param xPBDeveloperPartnerId The Developer Partner ID is assigned by PB to uniquely identify a Developer&#39;s strategic business partners. If the developer is the sole business partner, this field isn&#39;t required. (optional)
     * @param xPBLocationId This is the Location ID assigned as per the Developer&#39;s and Partner&#39;s parsed locations, to which all transactions will be billed. &lt;br /&gt; Partner&#39;s location will be used for billing if it is configured, however, in case Partner&#39;s location is not given, then the Developer&#39;s location will be taken. Developer&#39;s location will be the default value. &lt;br /&gt; Additionally, Developers and Partners can use carriers belong to this location only. (optional)
     * @param xPBTransactionId A unique transaction Id provided by the partner which is used to enable debugging and linking between the client&#39;s transaction and the system. (optional)
     * @return ReprintShipmentV2
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ReprintShipmentV2 reprintShipmentByIdV2(ShipmentReprintV2 shipmentReprintV2, String xPBDeveloperPartnerId, String xPBLocationId, String xPBTransactionId) throws RestClientException {
        return reprintShipmentByIdV2WithHttpInfo(shipmentReprintV2, xPBDeveloperPartnerId, xPBLocationId, xPBTransactionId).getBody();
    }

    /**
     * Reprint Shipment
     * The operation reprints Shipment by the shipmentId. It retrieves an existing shipping label to reprint. The API sends the shipmentID returned by the original created shipment request. Use this only if the shipping label in the Create Shipment response is missing or lost.
     * <p><b>200</b> - The shipment has been reprinted.
     * <p><b>400</b> - Invalid request.
     * <p><b>401</b> - The request could not be authorized.
     * <p><b>404</b> - The requested resource was not found.
     * <p><b>500</b> - The request could not be completed due to an internal error.
     * @param shipmentReprintV2  (required)
     * @param xPBDeveloperPartnerId The Developer Partner ID is assigned by PB to uniquely identify a Developer&#39;s strategic business partners. If the developer is the sole business partner, this field isn&#39;t required. (optional)
     * @param xPBLocationId This is the Location ID assigned as per the Developer&#39;s and Partner&#39;s parsed locations, to which all transactions will be billed. &lt;br /&gt; Partner&#39;s location will be used for billing if it is configured, however, in case Partner&#39;s location is not given, then the Developer&#39;s location will be taken. Developer&#39;s location will be the default value. &lt;br /&gt; Additionally, Developers and Partners can use carriers belong to this location only. (optional)
     * @param xPBTransactionId A unique transaction Id provided by the partner which is used to enable debugging and linking between the client&#39;s transaction and the system. (optional)
     * @return ResponseEntity&lt;ReprintShipmentV2&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ReprintShipmentV2> reprintShipmentByIdV2WithHttpInfo(ShipmentReprintV2 shipmentReprintV2, String xPBDeveloperPartnerId, String xPBLocationId, String xPBTransactionId) throws RestClientException {
        Object localVarPostBody = shipmentReprintV2;
        
        // verify the required parameter 'shipmentReprintV2' is set
        if (shipmentReprintV2 == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'shipmentReprintV2' when calling reprintShipmentByIdV2");
        }
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        if (xPBDeveloperPartnerId != null)
        localVarHeaderParams.add("X-PB-Developer-Partner-Id", apiClient.parameterToString(xPBDeveloperPartnerId));
        if (xPBLocationId != null)
        localVarHeaderParams.add("X-PB-LocationId", apiClient.parameterToString(xPBLocationId));
        if (xPBTransactionId != null)
        localVarHeaderParams.add("X-PB-TransactionId", apiClient.parameterToString(xPBTransactionId));

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/json"
         };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "bearerAuth" };

        ParameterizedTypeReference<ReprintShipmentV2> localReturnType = new ParameterizedTypeReference<ReprintShipmentV2>() {};
        return apiClient.invokeAPI("/api/v2/shipments/reprint", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
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
