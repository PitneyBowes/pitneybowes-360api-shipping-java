package com.pitneybowes.api360.api;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestClientException;

import com.pitneybowes.api360.ApiClient;
import com.pitneybowes.api360.BaseApi;
import com.pitneybowes.api360.model.CreateManifest200Response;
import com.pitneybowes.api360.model.CreateManifestRequest;
import com.pitneybowes.api360.model.ReprintManifestRequest;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-09-30T12:57:37.504069+05:30[Asia/Kolkata]", comments = "Generator version: 7.7.0")
public class ManifestApi extends BaseApi {

    public ManifestApi() {
        super(new ApiClient());
    }

    public ManifestApi(ApiClient apiClient) {
        super(apiClient);
    }

    /**
     * Create Manifest
     * This operation creates an end-of-day manifest (a compilation of information about all shipments) that combines all shipments of the day into a single form or electronic record, depending on the carrier. For different carriers, the Manifest process varies, e.g., USPS use SCAN Form while FedEx has Manifest Form.
     * <p><b>200</b> - The Manifest has been generated for the given carrier.
     * <p><b>400</b> - Invalid request.
     * <p><b>401</b> - The request could not be authorized.
     * <p><b>500</b> - The request could not be completed due to an internal error.
     * @param xPBDeveloperPartnerID This is the Developer Partner ID. When the developer is the only partner, this field is not required. (optional)
     * @param compactResponse This header defines if the response required is detailed or compact. When value is set to true, it will only return manifest details in response.  (optional)
     * @param createManifestRequest  (optional)
     * @return CreateManifest200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public CreateManifest200Response createManifest(String xPBDeveloperPartnerID, Boolean compactResponse, CreateManifestRequest createManifestRequest) throws RestClientException {
        return createManifestWithHttpInfo(xPBDeveloperPartnerID, compactResponse, createManifestRequest).getBody();
    }

    /**
     * Create Manifest
     * This operation creates an end-of-day manifest (a compilation of information about all shipments) that combines all shipments of the day into a single form or electronic record, depending on the carrier. For different carriers, the Manifest process varies, e.g., USPS use SCAN Form while FedEx has Manifest Form.
     * <p><b>200</b> - The Manifest has been generated for the given carrier.
     * <p><b>400</b> - Invalid request.
     * <p><b>401</b> - The request could not be authorized.
     * <p><b>500</b> - The request could not be completed due to an internal error.
     * @param xPBDeveloperPartnerID This is the Developer Partner ID. When the developer is the only partner, this field is not required. (optional)
     * @param compactResponse This header defines if the response required is detailed or compact. When value is set to true, it will only return manifest details in response.  (optional)
     * @param createManifestRequest  (optional)
     * @return ResponseEntity&lt;CreateManifest200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<CreateManifest200Response> createManifestWithHttpInfo(String xPBDeveloperPartnerID, Boolean compactResponse, CreateManifestRequest createManifestRequest) throws RestClientException {
        Object localVarPostBody = createManifestRequest;
        

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

        ParameterizedTypeReference<CreateManifest200Response> localReturnType = new ParameterizedTypeReference<CreateManifest200Response>() {};
        return apiClient.invokeAPI("/api/v1/manifests", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Reprint manifest
     * This operation reprints a manifest for which the initial created manifest request was successful.
     * <p><b>200</b> - The Manifest has been printed successfully.
     * <p><b>400</b> - Invalid request.
     * <p><b>401</b> - The request could not be authorized.
     * <p><b>404</b> - The requested resource was not found.
     * <p><b>500</b> - The request could not be completed due to an internal error.
     * @param xPBDeveloperPartnerID This is the Developer Partner ID. When the developer is the only partner, this field is not required. (optional)
     * @param compactResponse This header defines if the response required is detailed or compact. When value is set to true, it will only return manifest details in response. (optional)
     * @param reprintManifestRequest  (optional)
     * @return CreateManifest200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public CreateManifest200Response reprintManifest(String xPBDeveloperPartnerID, Boolean compactResponse, ReprintManifestRequest reprintManifestRequest) throws RestClientException {
        return reprintManifestWithHttpInfo(xPBDeveloperPartnerID, compactResponse, reprintManifestRequest).getBody();
    }

    /**
     * Reprint manifest
     * This operation reprints a manifest for which the initial created manifest request was successful.
     * <p><b>200</b> - The Manifest has been printed successfully.
     * <p><b>400</b> - Invalid request.
     * <p><b>401</b> - The request could not be authorized.
     * <p><b>404</b> - The requested resource was not found.
     * <p><b>500</b> - The request could not be completed due to an internal error.
     * @param xPBDeveloperPartnerID This is the Developer Partner ID. When the developer is the only partner, this field is not required. (optional)
     * @param compactResponse This header defines if the response required is detailed or compact. When value is set to true, it will only return manifest details in response. (optional)
     * @param reprintManifestRequest  (optional)
     * @return ResponseEntity&lt;CreateManifest200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<CreateManifest200Response> reprintManifestWithHttpInfo(String xPBDeveloperPartnerID, Boolean compactResponse, ReprintManifestRequest reprintManifestRequest) throws RestClientException {
        Object localVarPostBody = reprintManifestRequest;
        

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

        ParameterizedTypeReference<CreateManifest200Response> localReturnType = new ParameterizedTypeReference<CreateManifest200Response>() {};
        return apiClient.invokeAPI("/api/v1/manifests/reprint", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
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
