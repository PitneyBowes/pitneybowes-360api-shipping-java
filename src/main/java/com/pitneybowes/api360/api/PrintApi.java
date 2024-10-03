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
import com.pitneybowes.api360.model.JobStatus;
import com.pitneybowes.api360.model.PrintDocumentRequest;
import com.pitneybowes.api360.model.PrintDocumentResponse;
import com.pitneybowes.api360.model.PrinterMappingGetResponse;
import com.pitneybowes.api360.model.PrinterMappingRequest;
import com.pitneybowes.api360.model.PrinterMappingResponse;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-09-30T12:57:37.504069+05:30[Asia/Kolkata]", comments = "Generator version: 7.7.0")
public class PrintApi extends BaseApi {

    public PrintApi() {
        super(new ApiClient());
    }

    public PrintApi(ApiClient apiClient) {
        super(apiClient);
    }

    /**
     * Delete Printer mapping
     * delete printer mapping document
     * <p><b>200</b> - Successfully deleted printer mapping
     * <p><b>401</b> - The request could not be authorized.
     * @param alias Refers to a printer connected (directly or via network) to a computer. (required)
     * @param xPBDeveloperPartnerId The Developer Partner ID is assigned by PB to uniquely identify a Developer&#39;s strategic business partners. If the developer is the sole business partner, this field isn&#39;t required. (optional)
     * @param xPBLocationId This is the Location ID assigned as per the Developer&#39;s and Partner&#39;s parsed locations, to which all transactions will be billed. &lt;br /&gt; Partner&#39;s location will be used for billing if it is configured, however, in case Partner&#39;s location is not given, then the Developer&#39;s location will be taken. Developer&#39;s location will be the default value. &lt;br /&gt; Additionally, Developers and Partners can use carriers belong to this location only. (optional)
     * @param xPBTransactionId A unique transaction Id provided by the partner which is used to enable debugging and linking between the client&#39;s transaction and the system. (optional)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void deletePrinterMapping(String alias, String xPBDeveloperPartnerId, String xPBLocationId, String xPBTransactionId) throws RestClientException {
        deletePrinterMappingWithHttpInfo(alias, xPBDeveloperPartnerId, xPBLocationId, xPBTransactionId);
    }

    /**
     * Delete Printer mapping
     * delete printer mapping document
     * <p><b>200</b> - Successfully deleted printer mapping
     * <p><b>401</b> - The request could not be authorized.
     * @param alias Refers to a printer connected (directly or via network) to a computer. (required)
     * @param xPBDeveloperPartnerId The Developer Partner ID is assigned by PB to uniquely identify a Developer&#39;s strategic business partners. If the developer is the sole business partner, this field isn&#39;t required. (optional)
     * @param xPBLocationId This is the Location ID assigned as per the Developer&#39;s and Partner&#39;s parsed locations, to which all transactions will be billed. &lt;br /&gt; Partner&#39;s location will be used for billing if it is configured, however, in case Partner&#39;s location is not given, then the Developer&#39;s location will be taken. Developer&#39;s location will be the default value. &lt;br /&gt; Additionally, Developers and Partners can use carriers belong to this location only. (optional)
     * @param xPBTransactionId A unique transaction Id provided by the partner which is used to enable debugging and linking between the client&#39;s transaction and the system. (optional)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> deletePrinterMappingWithHttpInfo(String alias, String xPBDeveloperPartnerId, String xPBLocationId, String xPBTransactionId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'alias' is set
        if (alias == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'alias' when calling deletePrinterMapping");
        }
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "alias", alias));
        

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
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "bearerAuth" };

        ParameterizedTypeReference<Void> localReturnType = new ParameterizedTypeReference<Void>() {};
        return apiClient.invokeAPI("/api/v1/printer/mapping", HttpMethod.DELETE, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get Printer mapping
     * Get printer mapping document
     * <p><b>200</b> - Mapping printer Get Successfully
     * <p><b>401</b> - The request could not be authorized.
     * @param alias Refers to a printer connected (directly or via network) to a computer. (required)
     * @param xPBDeveloperPartnerId The Developer Partner ID is assigned by PB to uniquely identify a Developer&#39;s strategic business partners. If the developer is the sole business partner, this field isn&#39;t required. (optional)
     * @param xPBLocationId This is the Location ID assigned as per the Developer&#39;s and Partner&#39;s parsed locations, to which all transactions will be billed. &lt;br /&gt; Partner&#39;s location will be used for billing if it is configured, however, in case Partner&#39;s location is not given, then the Developer&#39;s location will be taken. Developer&#39;s location will be the default value. &lt;br /&gt; Additionally, Developers and Partners can use carriers belong to this location only. (optional)
     * @param xPBTransactionId A unique transaction Id provided by the partner which is used to enable debugging and linking between the client&#39;s transaction and the system. (optional)
     * @return PrinterMappingGetResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public PrinterMappingGetResponse getPrinterMapping(String alias, String xPBDeveloperPartnerId, String xPBLocationId, String xPBTransactionId) throws RestClientException {
        return getPrinterMappingWithHttpInfo(alias, xPBDeveloperPartnerId, xPBLocationId, xPBTransactionId).getBody();
    }

    /**
     * Get Printer mapping
     * Get printer mapping document
     * <p><b>200</b> - Mapping printer Get Successfully
     * <p><b>401</b> - The request could not be authorized.
     * @param alias Refers to a printer connected (directly or via network) to a computer. (required)
     * @param xPBDeveloperPartnerId The Developer Partner ID is assigned by PB to uniquely identify a Developer&#39;s strategic business partners. If the developer is the sole business partner, this field isn&#39;t required. (optional)
     * @param xPBLocationId This is the Location ID assigned as per the Developer&#39;s and Partner&#39;s parsed locations, to which all transactions will be billed. &lt;br /&gt; Partner&#39;s location will be used for billing if it is configured, however, in case Partner&#39;s location is not given, then the Developer&#39;s location will be taken. Developer&#39;s location will be the default value. &lt;br /&gt; Additionally, Developers and Partners can use carriers belong to this location only. (optional)
     * @param xPBTransactionId A unique transaction Id provided by the partner which is used to enable debugging and linking between the client&#39;s transaction and the system. (optional)
     * @return ResponseEntity&lt;PrinterMappingGetResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<PrinterMappingGetResponse> getPrinterMappingWithHttpInfo(String alias, String xPBDeveloperPartnerId, String xPBLocationId, String xPBTransactionId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'alias' is set
        if (alias == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'alias' when calling getPrinterMapping");
        }
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "alias", alias));
        

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
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "bearerAuth" };

        ParameterizedTypeReference<PrinterMappingGetResponse> localReturnType = new ParameterizedTypeReference<PrinterMappingGetResponse>() {};
        return apiClient.invokeAPI("/api/v1/printer/mapping", HttpMethod.GET, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Job status
     * job status
     * <p><b>200</b> - The document has been printed successfully.
     * <p><b>401</b> - The request could not be authorized.
     * @param jobId The jobId, a unique identifier assigned for the job. (required)
     * @param xPBDeveloperPartnerId The Developer Partner ID is assigned by PB to uniquely identify a Developer&#39;s strategic business partners. If the developer is the sole business partner, this field isn&#39;t required. (optional)
     * @param xPBLocationId This is the Location ID assigned as per the Developer&#39;s and Partner&#39;s parsed locations, to which all transactions will be billed. &lt;br /&gt; Partner&#39;s location will be used for billing if it is configured, however, in case Partner&#39;s location is not given, then the Developer&#39;s location will be taken. Developer&#39;s location will be the default value. &lt;br /&gt; Additionally, Developers and Partners can use carriers belong to this location only. (optional)
     * @param xPBTransactionId A unique transaction Id provided by the partner which is used to enable debugging and linking between the client&#39;s transaction and the system. (optional)
     * @return JobStatus
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public JobStatus jobStatus(String jobId, String xPBDeveloperPartnerId, String xPBLocationId, String xPBTransactionId) throws RestClientException {
        return jobStatusWithHttpInfo(jobId, xPBDeveloperPartnerId, xPBLocationId, xPBTransactionId).getBody();
    }

    /**
     * Job status
     * job status
     * <p><b>200</b> - The document has been printed successfully.
     * <p><b>401</b> - The request could not be authorized.
     * @param jobId The jobId, a unique identifier assigned for the job. (required)
     * @param xPBDeveloperPartnerId The Developer Partner ID is assigned by PB to uniquely identify a Developer&#39;s strategic business partners. If the developer is the sole business partner, this field isn&#39;t required. (optional)
     * @param xPBLocationId This is the Location ID assigned as per the Developer&#39;s and Partner&#39;s parsed locations, to which all transactions will be billed. &lt;br /&gt; Partner&#39;s location will be used for billing if it is configured, however, in case Partner&#39;s location is not given, then the Developer&#39;s location will be taken. Developer&#39;s location will be the default value. &lt;br /&gt; Additionally, Developers and Partners can use carriers belong to this location only. (optional)
     * @param xPBTransactionId A unique transaction Id provided by the partner which is used to enable debugging and linking between the client&#39;s transaction and the system. (optional)
     * @return ResponseEntity&lt;JobStatus&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<JobStatus> jobStatusWithHttpInfo(String jobId, String xPBDeveloperPartnerId, String xPBLocationId, String xPBTransactionId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'jobId' is set
        if (jobId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'jobId' when calling jobStatus");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("jobId", jobId);

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
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "bearerAuth" };

        ParameterizedTypeReference<JobStatus> localReturnType = new ParameterizedTypeReference<JobStatus>() {};
        return apiClient.invokeAPI("/api/v1/jobs/{jobId}", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Print Document
     * It contains information about a label or a document, e.g. a shipping label, a customs form, manifest report etc., that pertains to a shipment or manifest.
     * <p><b>200</b> - The document has been printed successfully.
     * <p><b>401</b> - The request could not be authorized.
     * @param printDocumentRequest  (required)
     * @param xPBDeveloperPartnerId The Developer Partner ID is assigned by PB to uniquely identify a Developer&#39;s strategic business partners. If the developer is the sole business partner, this field isn&#39;t required. (optional)
     * @param xPBLocationId This is the Location ID assigned as per the Developer&#39;s and Partner&#39;s parsed locations, to which all transactions will be billed. &lt;br /&gt; Partner&#39;s location will be used for billing if it is configured, however, in case Partner&#39;s location is not given, then the Developer&#39;s location will be taken. Developer&#39;s location will be the default value. &lt;br /&gt; Additionally, Developers and Partners can use carriers belong to this location only. (optional)
     * @param xPBTransactionId A unique Transaction ID provided by the partner, which is used to enable debugging and linking between the client&#39;s transaction and the system. (optional)
     * @return PrintDocumentResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public PrintDocumentResponse printDocument(PrintDocumentRequest printDocumentRequest, String xPBDeveloperPartnerId, String xPBLocationId, String xPBTransactionId) throws RestClientException {
        return printDocumentWithHttpInfo(printDocumentRequest, xPBDeveloperPartnerId, xPBLocationId, xPBTransactionId).getBody();
    }

    /**
     * Print Document
     * It contains information about a label or a document, e.g. a shipping label, a customs form, manifest report etc., that pertains to a shipment or manifest.
     * <p><b>200</b> - The document has been printed successfully.
     * <p><b>401</b> - The request could not be authorized.
     * @param printDocumentRequest  (required)
     * @param xPBDeveloperPartnerId The Developer Partner ID is assigned by PB to uniquely identify a Developer&#39;s strategic business partners. If the developer is the sole business partner, this field isn&#39;t required. (optional)
     * @param xPBLocationId This is the Location ID assigned as per the Developer&#39;s and Partner&#39;s parsed locations, to which all transactions will be billed. &lt;br /&gt; Partner&#39;s location will be used for billing if it is configured, however, in case Partner&#39;s location is not given, then the Developer&#39;s location will be taken. Developer&#39;s location will be the default value. &lt;br /&gt; Additionally, Developers and Partners can use carriers belong to this location only. (optional)
     * @param xPBTransactionId A unique Transaction ID provided by the partner, which is used to enable debugging and linking between the client&#39;s transaction and the system. (optional)
     * @return ResponseEntity&lt;PrintDocumentResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<PrintDocumentResponse> printDocumentWithHttpInfo(PrintDocumentRequest printDocumentRequest, String xPBDeveloperPartnerId, String xPBLocationId, String xPBTransactionId) throws RestClientException {
        Object localVarPostBody = printDocumentRequest;
        
        // verify the required parameter 'printDocumentRequest' is set
        if (printDocumentRequest == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'printDocumentRequest' when calling printDocument");
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

        ParameterizedTypeReference<PrintDocumentResponse> localReturnType = new ParameterizedTypeReference<PrintDocumentResponse>() {};
        return apiClient.invokeAPI("/api/v1/document/print", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Printer mapping
     * printer mapping document
     * <p><b>201</b> - Successfully mapped printer
     * <p><b>401</b> - The request could not be authorized.
     * @param printerMappingRequest  (required)
     * @param xPBDeveloperPartnerId The Developer Partner ID is assigned by PB to uniquely identify a Developer&#39;s strategic business partners. If the developer is the sole business partner, this field isn&#39;t required. (optional)
     * @param xPBLocationId This is the Location ID assigned as per the Developer&#39;s and Partner&#39;s parsed locations, to which all transactions will be billed. &lt;br /&gt; Partner&#39;s location will be used for billing if it is configured, however, in case Partner&#39;s location is not given, then the Developer&#39;s location will be taken. Developer&#39;s location will be the default value. &lt;br /&gt; Additionally, Developers and Partners can use carriers belong to this location only. (optional)
     * @param xPBTransactionId A unique transaction Id provided by the partner which is used to enable debugging and linking between the client&#39;s transaction and the system. (optional)
     * @return PrinterMappingResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public PrinterMappingResponse printerMapping(PrinterMappingRequest printerMappingRequest, String xPBDeveloperPartnerId, String xPBLocationId, String xPBTransactionId) throws RestClientException {
        return printerMappingWithHttpInfo(printerMappingRequest, xPBDeveloperPartnerId, xPBLocationId, xPBTransactionId).getBody();
    }

    /**
     * Printer mapping
     * printer mapping document
     * <p><b>201</b> - Successfully mapped printer
     * <p><b>401</b> - The request could not be authorized.
     * @param printerMappingRequest  (required)
     * @param xPBDeveloperPartnerId The Developer Partner ID is assigned by PB to uniquely identify a Developer&#39;s strategic business partners. If the developer is the sole business partner, this field isn&#39;t required. (optional)
     * @param xPBLocationId This is the Location ID assigned as per the Developer&#39;s and Partner&#39;s parsed locations, to which all transactions will be billed. &lt;br /&gt; Partner&#39;s location will be used for billing if it is configured, however, in case Partner&#39;s location is not given, then the Developer&#39;s location will be taken. Developer&#39;s location will be the default value. &lt;br /&gt; Additionally, Developers and Partners can use carriers belong to this location only. (optional)
     * @param xPBTransactionId A unique transaction Id provided by the partner which is used to enable debugging and linking between the client&#39;s transaction and the system. (optional)
     * @return ResponseEntity&lt;PrinterMappingResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<PrinterMappingResponse> printerMappingWithHttpInfo(PrinterMappingRequest printerMappingRequest, String xPBDeveloperPartnerId, String xPBLocationId, String xPBTransactionId) throws RestClientException {
        Object localVarPostBody = printerMappingRequest;
        
        // verify the required parameter 'printerMappingRequest' is set
        if (printerMappingRequest == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'printerMappingRequest' when calling printerMapping");
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

        ParameterizedTypeReference<PrinterMappingResponse> localReturnType = new ParameterizedTypeReference<PrinterMappingResponse>() {};
        return apiClient.invokeAPI("/api/v1/printer/mapping", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
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
