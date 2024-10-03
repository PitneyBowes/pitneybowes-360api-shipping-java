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
import java.math.BigDecimal;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * This will display the status counts for shipments or batch which are submitted via Import .CSV file
 */
@JsonPropertyOrder({
  ImportCountStatus.JSON_PROPERTY_SUCCESS,
  ImportCountStatus.JSON_PROPERTY_FAILED,
  ImportCountStatus.JSON_PROPERTY_PENDING
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-09-30T12:57:37.504069+05:30[Asia/Kolkata]", comments = "Generator version: 7.7.0")
public class ImportCountStatus {
  public static final String JSON_PROPERTY_SUCCESS = "success";
  private BigDecimal success;

  public static final String JSON_PROPERTY_FAILED = "failed";
  private BigDecimal failed;

  public static final String JSON_PROPERTY_PENDING = "pending";
  private BigDecimal pending;

  public ImportCountStatus() {
  }

  public ImportCountStatus success(BigDecimal success) {
    
    this.success = success;
    return this;
  }

  /**
   * The number of shipments which have been successfully imported.
   * @return success
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SUCCESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getSuccess() {
    return success;
  }


  @JsonProperty(JSON_PROPERTY_SUCCESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSuccess(BigDecimal success) {
    this.success = success;
  }

  public ImportCountStatus failed(BigDecimal failed) {
    
    this.failed = failed;
    return this;
  }

  /**
   * The number of shipments failed during Import.
   * @return failed
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FAILED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getFailed() {
    return failed;
  }


  @JsonProperty(JSON_PROPERTY_FAILED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFailed(BigDecimal failed) {
    this.failed = failed;
  }

  public ImportCountStatus pending(BigDecimal pending) {
    
    this.pending = pending;
    return this;
  }

  /**
   * The number of shipments which are pending and in-queue to be imported.
   * @return pending
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PENDING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getPending() {
    return pending;
  }


  @JsonProperty(JSON_PROPERTY_PENDING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPending(BigDecimal pending) {
    this.pending = pending;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ImportCountStatus importCountStatus = (ImportCountStatus) o;
    return Objects.equals(this.success, importCountStatus.success) &&
        Objects.equals(this.failed, importCountStatus.failed) &&
        Objects.equals(this.pending, importCountStatus.pending);
  }

  @Override
  public int hashCode() {
    return Objects.hash(success, failed, pending);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ImportCountStatus {\n");
    sb.append("    success: ").append(toIndentedString(success)).append("\n");
    sb.append("    failed: ").append(toIndentedString(failed)).append("\n");
    sb.append("    pending: ").append(toIndentedString(pending)).append("\n");
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

