/*
 * Shipping APIs
 * ### Introduction  The Shipping APIs include a variety of operations that allow users to manage and track their shipping requests.   Some of the key API operations available in the Shipping API includes: ### Shipment API  | Operation      | Description | | ----------- | ----------- |  | Get Carriers    | This operation fetches all onboarded carriers. Typically, user will use this service to get list of onboarded carriers and supported properties for those carriers.  |  | Get Countries | This operation fetches list of supported destination countries for a provided carrier and origin country.  |  | Get Services | This operation fetches a list of supported services for a carrier with respect to specific origin and destination country. |  | Get ParcelTypes| This operation fetches ParcelTypes based on carrier, origin and destination country. |  | Get Special Services| This operation fetches Special Services for a given carrier, service, origin and destination country. |  | Get Carrier Accounts| This operation retrieves onboarded Carriers with their Carrier Account Ids which uniquely identify multiple accounts of same carrier.  |  | Rate Shop and Get Single Rate| This API contains 2 operations, rate shop and single rate. Rate shop will fetch rates for all carrier services based on the given addresses (From and To), weight, and dimension for given parcelType. Single rate will get rate for specific service and special service (if requested) based on the given addresses (From and To), weight, and dimension, parcelType and serviceId with or without specialServices. Single rate will be used mainly to a rate a shipment before creating shipment.  |  | Create Shipment| This operation creates a new Shipment or Shipment Label. This is for both Domestic and International. | | Get All Shipments| This operation fetches all created Shipments. |  | Get Shipment by Id| Retrieves single shipment using Shipment Id. |  | Reprint Shipment| This operation reprints Shipment by the shipmentId. It retrieves an existing shipping label to reprint. The API sends the shipmentId returned by the original Created Shipment request. Use this only if the shipping label in the Create Shipment response was spoilt or lost. |  | Cancel Shipment| This operation cancels previously created shipment. |  
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.pitneybowes.api360.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * ErrorsErrorsInner
 */
@JsonPropertyOrder({
  ErrorsErrorsInner.JSON_PROPERTY_ERROR_CODE,
  ErrorsErrorsInner.JSON_PROPERTY_ERROR_DESCRIPTION,
  ErrorsErrorsInner.JSON_PROPERTY_ADDITIONAL_CODE,
  ErrorsErrorsInner.JSON_PROPERTY_ADDITIONAL_INFO,
  ErrorsErrorsInner.JSON_PROPERTY_ADDITIONAL_PARAMETERS
})
@JsonTypeName("Errors_errors_inner")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-09-30T12:57:37.504069+05:30[Asia/Kolkata]", comments = "Generator version: 7.7.0")
public class ErrorsErrorsInner {
  public static final String JSON_PROPERTY_ERROR_CODE = "errorCode";
  private String errorCode;

  public static final String JSON_PROPERTY_ERROR_DESCRIPTION = "errorDescription";
  private String errorDescription;

  public static final String JSON_PROPERTY_ADDITIONAL_CODE = "additionalCode";
  private String additionalCode;

  public static final String JSON_PROPERTY_ADDITIONAL_INFO = "additionalInfo";
  private String additionalInfo;

  public static final String JSON_PROPERTY_ADDITIONAL_PARAMETERS = "additionalParameters";
  private List<String> additionalParameters = new ArrayList<>();

  public ErrorsErrorsInner() {
  }

  public ErrorsErrorsInner errorCode(String errorCode) {
    
    this.errorCode = errorCode;
    return this;
  }

  /**
   * Error code(s) that appear due to HTTP  400- Invalid or Bad Request, e.g. validation-error.
   * @return errorCode
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ERROR_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getErrorCode() {
    return errorCode;
  }


  @JsonProperty(JSON_PROPERTY_ERROR_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setErrorCode(String errorCode) {
    this.errorCode = errorCode;
  }

  public ErrorsErrorsInner errorDescription(String errorDescription) {
    
    this.errorDescription = errorDescription;
    return this;
  }

  /**
   * The HTTP 400 Bad Request response status code indicates that the server cannot process the request due to something that is perceived to be a client error (e.g., malformed request syntax, invalid request message framing, or deceptive request routing).
   * @return errorDescription
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ERROR_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getErrorDescription() {
    return errorDescription;
  }


  @JsonProperty(JSON_PROPERTY_ERROR_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setErrorDescription(String errorDescription) {
    this.errorDescription = errorDescription;
  }

  public ErrorsErrorsInner additionalCode(String additionalCode) {
    
    this.additionalCode = additionalCode;
    return this;
  }

  /**
   * A unique identifier for the error, for example 1101055, 0100008, or 1021126.
   * @return additionalCode
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ADDITIONAL_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAdditionalCode() {
    return additionalCode;
  }


  @JsonProperty(JSON_PROPERTY_ADDITIONAL_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAdditionalCode(String additionalCode) {
    this.additionalCode = additionalCode;
  }

  public ErrorsErrorsInner additionalInfo(String additionalInfo) {
    
    this.additionalInfo = additionalInfo;
    return this;
  }

  /**
   * This is an additional information about the error. This error &#39;Invalid Request&#39; might appear due to invalid dimension, weight, or serviceid, or if the information is missing.
   * @return additionalInfo
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ADDITIONAL_INFO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAdditionalInfo() {
    return additionalInfo;
  }


  @JsonProperty(JSON_PROPERTY_ADDITIONAL_INFO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAdditionalInfo(String additionalInfo) {
    this.additionalInfo = additionalInfo;
  }

  public ErrorsErrorsInner additionalParameters(List<String> additionalParameters) {
    
    this.additionalParameters = additionalParameters;
    return this;
  }

  public ErrorsErrorsInner addAdditionalParametersItem(String additionalParametersItem) {
    if (this.additionalParameters == null) {
      this.additionalParameters = new ArrayList<>();
    }
    this.additionalParameters.add(additionalParametersItem);
    return this;
  }

  /**
   * Get additionalParameters
   * @return additionalParameters
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ADDITIONAL_PARAMETERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getAdditionalParameters() {
    return additionalParameters;
  }


  @JsonProperty(JSON_PROPERTY_ADDITIONAL_PARAMETERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAdditionalParameters(List<String> additionalParameters) {
    this.additionalParameters = additionalParameters;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ErrorsErrorsInner errorsErrorsInner = (ErrorsErrorsInner) o;
    return Objects.equals(this.errorCode, errorsErrorsInner.errorCode) &&
        Objects.equals(this.errorDescription, errorsErrorsInner.errorDescription) &&
        Objects.equals(this.additionalCode, errorsErrorsInner.additionalCode) &&
        Objects.equals(this.additionalInfo, errorsErrorsInner.additionalInfo) &&
        Objects.equals(this.additionalParameters, errorsErrorsInner.additionalParameters);
  }

  @Override
  public int hashCode() {
    return Objects.hash(errorCode, errorDescription, additionalCode, additionalInfo, additionalParameters);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ErrorsErrorsInner {\n");
    sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
    sb.append("    errorDescription: ").append(toIndentedString(errorDescription)).append("\n");
    sb.append("    additionalCode: ").append(toIndentedString(additionalCode)).append("\n");
    sb.append("    additionalInfo: ").append(toIndentedString(additionalInfo)).append("\n");
    sb.append("    additionalParameters: ").append(toIndentedString(additionalParameters)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

