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
import com.pitneybowes.api360.model.AddressSuggestRequest;
import com.pitneybowes.api360.model.AddressSuggestResponse;
import com.pitneybowes.api360.model.AddressValidateRequest;
import com.pitneybowes.api360.model.AddressValidateResponse;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-09-30T12:57:37.504069+05:30[Asia/Kolkata]", comments = "Generator version: 7.7.0")
public class AddressApi extends BaseApi {

    public AddressApi() {
        super(new ApiClient());
    }

    public AddressApi(ApiClient apiClient) {
        super(apiClient);
    }

    /**
     * Address Suggest
     * This operation displays a valid address to match the entered address, only if the address does not seem valid to the system address map. User can select the suggested address or edit the entered address to make it valid.
     * <p><b>200</b> - The address is suggested to use.
     * <p><b>400</b> - Invalid request.
     * <p><b>401</b> - The request could not be authorized.
     * <p><b>500</b> - The request could not be completed due to an internal error.
     * @param addressSuggestRequest  (required)
     * @return AddressSuggestResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public AddressSuggestResponse addressSuggest(AddressSuggestRequest addressSuggestRequest) throws RestClientException {
        return addressSuggestWithHttpInfo(addressSuggestRequest).getBody();
    }

    /**
     * Address Suggest
     * This operation displays a valid address to match the entered address, only if the address does not seem valid to the system address map. User can select the suggested address or edit the entered address to make it valid.
     * <p><b>200</b> - The address is suggested to use.
     * <p><b>400</b> - Invalid request.
     * <p><b>401</b> - The request could not be authorized.
     * <p><b>500</b> - The request could not be completed due to an internal error.
     * @param addressSuggestRequest  (required)
     * @return ResponseEntity&lt;AddressSuggestResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<AddressSuggestResponse> addressSuggestWithHttpInfo(AddressSuggestRequest addressSuggestRequest) throws RestClientException {
        Object localVarPostBody = addressSuggestRequest;
        
        // verify the required parameter 'addressSuggestRequest' is set
        if (addressSuggestRequest == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'addressSuggestRequest' when calling addressSuggest");
        }
        

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

        ParameterizedTypeReference<AddressSuggestResponse> localReturnType = new ParameterizedTypeReference<AddressSuggestResponse>() {};
        return apiClient.invokeAPI("/api/v1/address/suggest", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Address Validate
     * This operation validates address. This improves postal addresses within the country (e.g., United States) to help ensure that parcels are rated accurately and shipments arrive at the final destination on time.&lt;br&gt; The verify address operation sends an address to be verified. The response indicates whether the address is valid.
     * <p><b>200</b> - The address has been verified.
     * <p><b>400</b> - Invalid request.
     * <p><b>401</b> - The request could not be authorized.
     * <p><b>500</b> - The request could not be completed due to an internal error.
     * @param addressValidateRequest  (required)
     * @param minimalAddressValidation If true, then only City, State, and PostalCode (zip) are validated. This option is specific for US domestic addresses only. (optional)
     * @return AddressValidateResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public AddressValidateResponse addressValidate(AddressValidateRequest addressValidateRequest, Boolean minimalAddressValidation) throws RestClientException {
        return addressValidateWithHttpInfo(addressValidateRequest, minimalAddressValidation).getBody();
    }

    /**
     * Address Validate
     * This operation validates address. This improves postal addresses within the country (e.g., United States) to help ensure that parcels are rated accurately and shipments arrive at the final destination on time.&lt;br&gt; The verify address operation sends an address to be verified. The response indicates whether the address is valid.
     * <p><b>200</b> - The address has been verified.
     * <p><b>400</b> - Invalid request.
     * <p><b>401</b> - The request could not be authorized.
     * <p><b>500</b> - The request could not be completed due to an internal error.
     * @param addressValidateRequest  (required)
     * @param minimalAddressValidation If true, then only City, State, and PostalCode (zip) are validated. This option is specific for US domestic addresses only. (optional)
     * @return ResponseEntity&lt;AddressValidateResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<AddressValidateResponse> addressValidateWithHttpInfo(AddressValidateRequest addressValidateRequest, Boolean minimalAddressValidation) throws RestClientException {
        Object localVarPostBody = addressValidateRequest;
        
        // verify the required parameter 'addressValidateRequest' is set
        if (addressValidateRequest == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'addressValidateRequest' when calling addressValidate");
        }
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "minimalAddressValidation", minimalAddressValidation));
        

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/json"
         };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "bearerAuth" };

        ParameterizedTypeReference<AddressValidateResponse> localReturnType = new ParameterizedTypeReference<AddressValidateResponse>() {};
        return apiClient.invokeAPI("/api/v1/address/verify", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
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
