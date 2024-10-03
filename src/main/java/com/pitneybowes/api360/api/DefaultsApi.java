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
import com.pitneybowes.api360.model.AllDefaults;
import com.pitneybowes.api360.model.CreateDefaults;
import com.pitneybowes.api360.model.CreateDefaultsResponse;
import com.pitneybowes.api360.model.DefaultResponse;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-09-30T12:57:37.504069+05:30[Asia/Kolkata]", comments = "Generator version: 7.7.0")
public class DefaultsApi extends BaseApi {

    public DefaultsApi() {
        super(new ApiClient());
    }

    public DefaultsApi(ApiClient apiClient) {
        super(apiClient);
    }

    /**
     * Create Defaults
     * While creating shipment, a few columns/ fields information are used mandatorily, and if the value for those columns are used repetitively, then it is always better to save last used values. And hence, this API has been introduced. Using this API, default values can be set up for frequently used columns/fields information like carrier, its linked services, and special services.  Setting up the defaults will save both time and efforts. 
     * <p><b>200</b> - Defaults (i.e., default values) have been created successfully.
     * <p><b>400</b> - Invalid request.
     * <p><b>401</b> - The request could not be authorized.
     * <p><b>500</b> - The request could not be completed due to an internal error.
     * @param createDefaults  (required)
     * @return CreateDefaultsResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public CreateDefaultsResponse createDefaults(CreateDefaults createDefaults) throws RestClientException {
        return createDefaultsWithHttpInfo(createDefaults).getBody();
    }

    /**
     * Create Defaults
     * While creating shipment, a few columns/ fields information are used mandatorily, and if the value for those columns are used repetitively, then it is always better to save last used values. And hence, this API has been introduced. Using this API, default values can be set up for frequently used columns/fields information like carrier, its linked services, and special services.  Setting up the defaults will save both time and efforts. 
     * <p><b>200</b> - Defaults (i.e., default values) have been created successfully.
     * <p><b>400</b> - Invalid request.
     * <p><b>401</b> - The request could not be authorized.
     * <p><b>500</b> - The request could not be completed due to an internal error.
     * @param createDefaults  (required)
     * @return ResponseEntity&lt;CreateDefaultsResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<CreateDefaultsResponse> createDefaultsWithHttpInfo(CreateDefaults createDefaults) throws RestClientException {
        Object localVarPostBody = createDefaults;
        
        // verify the required parameter 'createDefaults' is set
        if (createDefaults == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'createDefaults' when calling createDefaults");
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

        ParameterizedTypeReference<CreateDefaultsResponse> localReturnType = new ParameterizedTypeReference<CreateDefaultsResponse>() {};
        return apiClient.invokeAPI("/api/v1/defaults", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Delete Defaults by ID
     * This operation deletes the existing Defaults.
     * <p><b>200</b> - Defaults (i.e., default values) have been deleted successfully.
     * <p><b>400</b> - Invalid request.
     * <p><b>401</b> - The request could not be authorized.
     * <p><b>500</b> - The request could not be completed due to an internal error.
     * @param defaultID This is unique identifier assigned to Defaults while its creation using CreateDefaults API. (required)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void deleteDefaultsById(String defaultID) throws RestClientException {
        deleteDefaultsByIdWithHttpInfo(defaultID);
    }

    /**
     * Delete Defaults by ID
     * This operation deletes the existing Defaults.
     * <p><b>200</b> - Defaults (i.e., default values) have been deleted successfully.
     * <p><b>400</b> - Invalid request.
     * <p><b>401</b> - The request could not be authorized.
     * <p><b>500</b> - The request could not be completed due to an internal error.
     * @param defaultID This is unique identifier assigned to Defaults while its creation using CreateDefaults API. (required)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> deleteDefaultsByIdWithHttpInfo(String defaultID) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'defaultID' is set
        if (defaultID == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'defaultID' when calling deleteDefaultsById");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("defaultID", defaultID);

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

        ParameterizedTypeReference<Void> localReturnType = new ParameterizedTypeReference<Void>() {};
        return apiClient.invokeAPI("/api/v1/defaults/{defaultID}", HttpMethod.DELETE, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get All Defaults
     * The operation fetches all created Defaults. If query parameters are not provided, it will consider default page as 1 and default size as 10.
     * <p><b>200</b> - List of Defaults.
     * <p><b>400</b> - Invalid request.
     * <p><b>401</b> - The request could not be authorized.
     * <p><b>500</b> - The request could not be completed due to an internal error.
     * @param xPBDeveloperPartnerID The Developer Partner ID is assigned by PB to uniquely identify a Developer&#39;s strategic business partners. If the developer is the sole business partner, this field isn&#39;t required. (optional)
     * @param page The page of the Defaults search result list. (optional)
     * @param size The size/count of the searched result list. (optional)
     * @return AllDefaults
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public AllDefaults getAllDefaults(String xPBDeveloperPartnerID, String page, String size) throws RestClientException {
        return getAllDefaultsWithHttpInfo(xPBDeveloperPartnerID, page, size).getBody();
    }

    /**
     * Get All Defaults
     * The operation fetches all created Defaults. If query parameters are not provided, it will consider default page as 1 and default size as 10.
     * <p><b>200</b> - List of Defaults.
     * <p><b>400</b> - Invalid request.
     * <p><b>401</b> - The request could not be authorized.
     * <p><b>500</b> - The request could not be completed due to an internal error.
     * @param xPBDeveloperPartnerID The Developer Partner ID is assigned by PB to uniquely identify a Developer&#39;s strategic business partners. If the developer is the sole business partner, this field isn&#39;t required. (optional)
     * @param page The page of the Defaults search result list. (optional)
     * @param size The size/count of the searched result list. (optional)
     * @return ResponseEntity&lt;AllDefaults&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<AllDefaults> getAllDefaultsWithHttpInfo(String xPBDeveloperPartnerID, String page, String size) throws RestClientException {
        Object localVarPostBody = null;
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

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

        ParameterizedTypeReference<AllDefaults> localReturnType = new ParameterizedTypeReference<AllDefaults>() {};
        return apiClient.invokeAPI("/api/v1/defaults", HttpMethod.GET, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get Defaults By ID
     * This operation fetches the values set for the Defaults.
     * <p><b>200</b> - Defaults values have been retrieved successfully.
     * <p><b>400</b> - Invalid request.
     * <p><b>401</b> - The request could not be authorized.
     * <p><b>500</b> - The request could not be completed due to an internal error.
     * @param defaultID This is unique identifier assigned to Defaults while its creation using CreateDefaults API. (required)
     * @return DefaultResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public DefaultResponse getDefaultsById(String defaultID) throws RestClientException {
        return getDefaultsByIdWithHttpInfo(defaultID).getBody();
    }

    /**
     * Get Defaults By ID
     * This operation fetches the values set for the Defaults.
     * <p><b>200</b> - Defaults values have been retrieved successfully.
     * <p><b>400</b> - Invalid request.
     * <p><b>401</b> - The request could not be authorized.
     * <p><b>500</b> - The request could not be completed due to an internal error.
     * @param defaultID This is unique identifier assigned to Defaults while its creation using CreateDefaults API. (required)
     * @return ResponseEntity&lt;DefaultResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<DefaultResponse> getDefaultsByIdWithHttpInfo(String defaultID) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'defaultID' is set
        if (defaultID == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'defaultID' when calling getDefaultsById");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("defaultID", defaultID);

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

        ParameterizedTypeReference<DefaultResponse> localReturnType = new ParameterizedTypeReference<DefaultResponse>() {};
        return apiClient.invokeAPI("/api/v1/defaults/{defaultID}", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Update Defaults
     * This operation updates the values set for Defaults.
     * <p><b>200</b> - Defaults (i.e., default values) have been updated successfully.
     * <p><b>400</b> - Invalid request.
     * <p><b>401</b> - The request could not be authorized.
     * <p><b>500</b> - The request could not be completed due to an internal error.
     * @param defaultID This is unique identifier assigned to Defaults while its creation using CreateDefaults API. (required)
     * @param createDefaults  (required)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void putDefaultsById(String defaultID, CreateDefaults createDefaults) throws RestClientException {
        putDefaultsByIdWithHttpInfo(defaultID, createDefaults);
    }

    /**
     * Update Defaults
     * This operation updates the values set for Defaults.
     * <p><b>200</b> - Defaults (i.e., default values) have been updated successfully.
     * <p><b>400</b> - Invalid request.
     * <p><b>401</b> - The request could not be authorized.
     * <p><b>500</b> - The request could not be completed due to an internal error.
     * @param defaultID This is unique identifier assigned to Defaults while its creation using CreateDefaults API. (required)
     * @param createDefaults  (required)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> putDefaultsByIdWithHttpInfo(String defaultID, CreateDefaults createDefaults) throws RestClientException {
        Object localVarPostBody = createDefaults;
        
        // verify the required parameter 'defaultID' is set
        if (defaultID == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'defaultID' when calling putDefaultsById");
        }
        
        // verify the required parameter 'createDefaults' is set
        if (createDefaults == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'createDefaults' when calling putDefaultsById");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("defaultID", defaultID);

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

        ParameterizedTypeReference<Void> localReturnType = new ParameterizedTypeReference<Void>() {};
        return apiClient.invokeAPI("/api/v1/defaults/{defaultID}", HttpMethod.PUT, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
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
