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
import com.pitneybowes.api360.model.JobStatus;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * ShipmentBatchResponseERR
 */
@JsonPropertyOrder({
  ShipmentBatchResponseERR.JSON_PROPERTY_BATCH_ID,
  ShipmentBatchResponseERR.JSON_PROPERTY_NAME,
  ShipmentBatchResponseERR.JSON_PROPERTY_GROUP_NAME,
  ShipmentBatchResponseERR.JSON_PROPERTY_STATUS,
  ShipmentBatchResponseERR.JSON_PROPERTY_UPLOAD_U_R_L
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-09-30T12:57:37.504069+05:30[Asia/Kolkata]", comments = "Generator version: 7.7.0")
public class ShipmentBatchResponseERR {
  public static final String JSON_PROPERTY_BATCH_ID = "batchId";
  private String batchId;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_GROUP_NAME = "groupName";
  private String groupName;

  public static final String JSON_PROPERTY_STATUS = "status";
  private JobStatus status;

  public static final String JSON_PROPERTY_UPLOAD_U_R_L = "uploadURL";
  private String uploadURL;

  public ShipmentBatchResponseERR() {
  }

  public ShipmentBatchResponseERR batchId(String batchId) {
    
    this.batchId = batchId;
    return this;
  }

  /**
   * This is a system-generated unique identifier assigned to the ERR Batch while it is processed.
   * @return batchId
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_BATCH_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getBatchId() {
    return batchId;
  }


  @JsonProperty(JSON_PROPERTY_BATCH_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBatchId(String batchId) {
    this.batchId = batchId;
  }

  public ShipmentBatchResponseERR name(String name) {
    
    this.name = name;
    return this;
  }

  /**
   * Name of the of ERR Batch which consists of multiple shipments (shipments in bulk).
   * @return name
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getName() {
    return name;
  }


  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setName(String name) {
    this.name = name;
  }

  public ShipmentBatchResponseERR groupName(String groupName) {
    
    this.groupName = groupName;
    return this;
  }

  /**
   *  Indicates the name of the group of batches, which consists of multiple Batch groups.
   * @return groupName
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_GROUP_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getGroupName() {
    return groupName;
  }


  @JsonProperty(JSON_PROPERTY_GROUP_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setGroupName(String groupName) {
    this.groupName = groupName;
  }

  public ShipmentBatchResponseERR status(JobStatus status) {
    
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JobStatus getStatus() {
    return status;
  }


  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStatus(JobStatus status) {
    this.status = status;
  }

  public ShipmentBatchResponseERR uploadURL(String uploadURL) {
    
    this.uploadURL = uploadURL;
    return this;
  }

  /**
   * For the stored Batch file under S3, this is the S3 returned URL. The URL is uploaded along with the .CSV file to get the BatchID, which is used to track the import status.
   * @return uploadURL
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_UPLOAD_U_R_L)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getUploadURL() {
    return uploadURL;
  }


  @JsonProperty(JSON_PROPERTY_UPLOAD_U_R_L)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUploadURL(String uploadURL) {
    this.uploadURL = uploadURL;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ShipmentBatchResponseERR shipmentBatchResponseERR = (ShipmentBatchResponseERR) o;
    return Objects.equals(this.batchId, shipmentBatchResponseERR.batchId) &&
        Objects.equals(this.name, shipmentBatchResponseERR.name) &&
        Objects.equals(this.groupName, shipmentBatchResponseERR.groupName) &&
        Objects.equals(this.status, shipmentBatchResponseERR.status) &&
        Objects.equals(this.uploadURL, shipmentBatchResponseERR.uploadURL);
  }

  @Override
  public int hashCode() {
    return Objects.hash(batchId, name, groupName, status, uploadURL);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ShipmentBatchResponseERR {\n");
    sb.append("    batchId: ").append(toIndentedString(batchId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    groupName: ").append(toIndentedString(groupName)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    uploadURL: ").append(toIndentedString(uploadURL)).append("\n");
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

