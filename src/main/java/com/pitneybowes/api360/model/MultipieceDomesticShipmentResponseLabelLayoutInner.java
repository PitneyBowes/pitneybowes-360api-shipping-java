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
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * description
 */
@JsonPropertyOrder({
  MultipieceDomesticShipmentResponseLabelLayoutInner.JSON_PROPERTY_CONTENT_TYPE,
  MultipieceDomesticShipmentResponseLabelLayoutInner.JSON_PROPERTY_CONTENTS,
  MultipieceDomesticShipmentResponseLabelLayoutInner.JSON_PROPERTY_FILE_FORMAT,
  MultipieceDomesticShipmentResponseLabelLayoutInner.JSON_PROPERTY_SIZE,
  MultipieceDomesticShipmentResponseLabelLayoutInner.JSON_PROPERTY_TYPE
})
@JsonTypeName("MultipieceDomesticShipmentResponse_labelLayout_inner")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-09-30T12:57:37.504069+05:30[Asia/Kolkata]", comments = "Generator version: 7.7.0")
public class MultipieceDomesticShipmentResponseLabelLayoutInner {
  public static final String JSON_PROPERTY_CONTENT_TYPE = "contentType";
  private String contentType;

  public static final String JSON_PROPERTY_CONTENTS = "contents";
  private String contents;

  public static final String JSON_PROPERTY_FILE_FORMAT = "fileFormat";
  private String fileFormat;

  public static final String JSON_PROPERTY_SIZE = "size";
  private String size;

  public static final String JSON_PROPERTY_TYPE = "type";
  private String type;

  public MultipieceDomesticShipmentResponseLabelLayoutInner() {
  }

  public MultipieceDomesticShipmentResponseLabelLayoutInner contentType(String contentType) {
    
    this.contentType = contentType;
    return this;
  }

  /**
   * description
   * @return contentType
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CONTENT_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getContentType() {
    return contentType;
  }


  @JsonProperty(JSON_PROPERTY_CONTENT_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setContentType(String contentType) {
    this.contentType = contentType;
  }

  public MultipieceDomesticShipmentResponseLabelLayoutInner contents(String contents) {
    
    this.contents = contents;
    return this;
  }

  /**
   * description
   * @return contents
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CONTENTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getContents() {
    return contents;
  }


  @JsonProperty(JSON_PROPERTY_CONTENTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setContents(String contents) {
    this.contents = contents;
  }

  public MultipieceDomesticShipmentResponseLabelLayoutInner fileFormat(String fileFormat) {
    
    this.fileFormat = fileFormat;
    return this;
  }

  /**
   * description
   * @return fileFormat
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FILE_FORMAT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getFileFormat() {
    return fileFormat;
  }


  @JsonProperty(JSON_PROPERTY_FILE_FORMAT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFileFormat(String fileFormat) {
    this.fileFormat = fileFormat;
  }

  public MultipieceDomesticShipmentResponseLabelLayoutInner size(String size) {
    
    this.size = size;
    return this;
  }

  /**
   * description
   * @return size
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SIZE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getSize() {
    return size;
  }


  @JsonProperty(JSON_PROPERTY_SIZE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSize(String size) {
    this.size = size;
  }

  public MultipieceDomesticShipmentResponseLabelLayoutInner type(String type) {
    
    this.type = type;
    return this;
  }

  /**
   * description
   * @return type
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getType() {
    return type;
  }


  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setType(String type) {
    this.type = type;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MultipieceDomesticShipmentResponseLabelLayoutInner multipieceDomesticShipmentResponseLabelLayoutInner = (MultipieceDomesticShipmentResponseLabelLayoutInner) o;
    return Objects.equals(this.contentType, multipieceDomesticShipmentResponseLabelLayoutInner.contentType) &&
        Objects.equals(this.contents, multipieceDomesticShipmentResponseLabelLayoutInner.contents) &&
        Objects.equals(this.fileFormat, multipieceDomesticShipmentResponseLabelLayoutInner.fileFormat) &&
        Objects.equals(this.size, multipieceDomesticShipmentResponseLabelLayoutInner.size) &&
        Objects.equals(this.type, multipieceDomesticShipmentResponseLabelLayoutInner.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contentType, contents, fileFormat, size, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MultipieceDomesticShipmentResponseLabelLayoutInner {\n");
    sb.append("    contentType: ").append(toIndentedString(contentType)).append("\n");
    sb.append("    contents: ").append(toIndentedString(contents)).append("\n");
    sb.append("    fileFormat: ").append(toIndentedString(fileFormat)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

