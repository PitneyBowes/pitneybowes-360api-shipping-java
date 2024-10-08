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
import com.pitneybowes.api360.model.MultipieceDomesticShipmentRequestFromAddress;
import com.pitneybowes.api360.model.MultipieceDomesticShipmentRequestMetadataInner;
import com.pitneybowes.api360.model.MultipieceDomesticShipmentRequestMultiPieceParcelsInner;
import com.pitneybowes.api360.model.MultipieceDomesticShipmentRequestShipmentOptions;
import com.pitneybowes.api360.model.MultipieceDomesticShipmentRequestToAddress;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * MultipieceDomesticShipmentRequest
 */
@JsonPropertyOrder({
  MultipieceDomesticShipmentRequest.JSON_PROPERTY_SIZE,
  MultipieceDomesticShipmentRequest.JSON_PROPERTY_TYPE,
  MultipieceDomesticShipmentRequest.JSON_PROPERTY_FROM_ADDRESS,
  MultipieceDomesticShipmentRequest.JSON_PROPERTY_CARRIER_ACCOUNT_ID,
  MultipieceDomesticShipmentRequest.JSON_PROPERTY_SERVICE_ID,
  MultipieceDomesticShipmentRequest.JSON_PROPERTY_SHIPMENT_OPTIONS,
  MultipieceDomesticShipmentRequest.JSON_PROPERTY_METADATA,
  MultipieceDomesticShipmentRequest.JSON_PROPERTY_MULTI_PIECE_PARCELS,
  MultipieceDomesticShipmentRequest.JSON_PROPERTY_TO_ADDRESS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-09-30T12:57:37.504069+05:30[Asia/Kolkata]", comments = "Generator version: 7.7.0")
public class MultipieceDomesticShipmentRequest {
  public static final String JSON_PROPERTY_SIZE = "size";
  private String size;

  public static final String JSON_PROPERTY_TYPE = "type";
  private String type;

  public static final String JSON_PROPERTY_FROM_ADDRESS = "fromAddress";
  private MultipieceDomesticShipmentRequestFromAddress fromAddress;

  public static final String JSON_PROPERTY_CARRIER_ACCOUNT_ID = "carrierAccountId";
  private String carrierAccountId;

  public static final String JSON_PROPERTY_SERVICE_ID = "serviceId";
  private String serviceId;

  public static final String JSON_PROPERTY_SHIPMENT_OPTIONS = "shipmentOptions";
  private MultipieceDomesticShipmentRequestShipmentOptions shipmentOptions;

  public static final String JSON_PROPERTY_METADATA = "metadata";
  private List<MultipieceDomesticShipmentRequestMetadataInner> metadata = new ArrayList<>();

  public static final String JSON_PROPERTY_MULTI_PIECE_PARCELS = "multiPieceParcels";
  private List<MultipieceDomesticShipmentRequestMultiPieceParcelsInner> multiPieceParcels = new ArrayList<>();

  public static final String JSON_PROPERTY_TO_ADDRESS = "toAddress";
  private MultipieceDomesticShipmentRequestToAddress toAddress;

  public MultipieceDomesticShipmentRequest() {
  }

  public MultipieceDomesticShipmentRequest size(String size) {
    
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

  public MultipieceDomesticShipmentRequest type(String type) {
    
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

  public MultipieceDomesticShipmentRequest fromAddress(MultipieceDomesticShipmentRequestFromAddress fromAddress) {
    
    this.fromAddress = fromAddress;
    return this;
  }

  /**
   * Get fromAddress
   * @return fromAddress
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FROM_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public MultipieceDomesticShipmentRequestFromAddress getFromAddress() {
    return fromAddress;
  }


  @JsonProperty(JSON_PROPERTY_FROM_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFromAddress(MultipieceDomesticShipmentRequestFromAddress fromAddress) {
    this.fromAddress = fromAddress;
  }

  public MultipieceDomesticShipmentRequest carrierAccountId(String carrierAccountId) {
    
    this.carrierAccountId = carrierAccountId;
    return this;
  }

  /**
   * description
   * @return carrierAccountId
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CARRIER_ACCOUNT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCarrierAccountId() {
    return carrierAccountId;
  }


  @JsonProperty(JSON_PROPERTY_CARRIER_ACCOUNT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCarrierAccountId(String carrierAccountId) {
    this.carrierAccountId = carrierAccountId;
  }

  public MultipieceDomesticShipmentRequest serviceId(String serviceId) {
    
    this.serviceId = serviceId;
    return this;
  }

  /**
   * description
   * @return serviceId
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SERVICE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getServiceId() {
    return serviceId;
  }


  @JsonProperty(JSON_PROPERTY_SERVICE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setServiceId(String serviceId) {
    this.serviceId = serviceId;
  }

  public MultipieceDomesticShipmentRequest shipmentOptions(MultipieceDomesticShipmentRequestShipmentOptions shipmentOptions) {
    
    this.shipmentOptions = shipmentOptions;
    return this;
  }

  /**
   * Get shipmentOptions
   * @return shipmentOptions
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SHIPMENT_OPTIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public MultipieceDomesticShipmentRequestShipmentOptions getShipmentOptions() {
    return shipmentOptions;
  }


  @JsonProperty(JSON_PROPERTY_SHIPMENT_OPTIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setShipmentOptions(MultipieceDomesticShipmentRequestShipmentOptions shipmentOptions) {
    this.shipmentOptions = shipmentOptions;
  }

  public MultipieceDomesticShipmentRequest metadata(List<MultipieceDomesticShipmentRequestMetadataInner> metadata) {
    
    this.metadata = metadata;
    return this;
  }

  public MultipieceDomesticShipmentRequest addMetadataItem(MultipieceDomesticShipmentRequestMetadataInner metadataItem) {
    if (this.metadata == null) {
      this.metadata = new ArrayList<>();
    }
    this.metadata.add(metadataItem);
    return this;
  }

  /**
   * description
   * @return metadata
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_METADATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<MultipieceDomesticShipmentRequestMetadataInner> getMetadata() {
    return metadata;
  }


  @JsonProperty(JSON_PROPERTY_METADATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMetadata(List<MultipieceDomesticShipmentRequestMetadataInner> metadata) {
    this.metadata = metadata;
  }

  public MultipieceDomesticShipmentRequest multiPieceParcels(List<MultipieceDomesticShipmentRequestMultiPieceParcelsInner> multiPieceParcels) {
    
    this.multiPieceParcels = multiPieceParcels;
    return this;
  }

  public MultipieceDomesticShipmentRequest addMultiPieceParcelsItem(MultipieceDomesticShipmentRequestMultiPieceParcelsInner multiPieceParcelsItem) {
    if (this.multiPieceParcels == null) {
      this.multiPieceParcels = new ArrayList<>();
    }
    this.multiPieceParcels.add(multiPieceParcelsItem);
    return this;
  }

  /**
   * description
   * @return multiPieceParcels
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MULTI_PIECE_PARCELS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<MultipieceDomesticShipmentRequestMultiPieceParcelsInner> getMultiPieceParcels() {
    return multiPieceParcels;
  }


  @JsonProperty(JSON_PROPERTY_MULTI_PIECE_PARCELS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMultiPieceParcels(List<MultipieceDomesticShipmentRequestMultiPieceParcelsInner> multiPieceParcels) {
    this.multiPieceParcels = multiPieceParcels;
  }

  public MultipieceDomesticShipmentRequest toAddress(MultipieceDomesticShipmentRequestToAddress toAddress) {
    
    this.toAddress = toAddress;
    return this;
  }

  /**
   * Get toAddress
   * @return toAddress
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TO_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public MultipieceDomesticShipmentRequestToAddress getToAddress() {
    return toAddress;
  }


  @JsonProperty(JSON_PROPERTY_TO_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setToAddress(MultipieceDomesticShipmentRequestToAddress toAddress) {
    this.toAddress = toAddress;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MultipieceDomesticShipmentRequest multipieceDomesticShipmentRequest = (MultipieceDomesticShipmentRequest) o;
    return Objects.equals(this.size, multipieceDomesticShipmentRequest.size) &&
        Objects.equals(this.type, multipieceDomesticShipmentRequest.type) &&
        Objects.equals(this.fromAddress, multipieceDomesticShipmentRequest.fromAddress) &&
        Objects.equals(this.carrierAccountId, multipieceDomesticShipmentRequest.carrierAccountId) &&
        Objects.equals(this.serviceId, multipieceDomesticShipmentRequest.serviceId) &&
        Objects.equals(this.shipmentOptions, multipieceDomesticShipmentRequest.shipmentOptions) &&
        Objects.equals(this.metadata, multipieceDomesticShipmentRequest.metadata) &&
        Objects.equals(this.multiPieceParcels, multipieceDomesticShipmentRequest.multiPieceParcels) &&
        Objects.equals(this.toAddress, multipieceDomesticShipmentRequest.toAddress);
  }

  @Override
  public int hashCode() {
    return Objects.hash(size, type, fromAddress, carrierAccountId, serviceId, shipmentOptions, metadata, multiPieceParcels, toAddress);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MultipieceDomesticShipmentRequest {\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    fromAddress: ").append(toIndentedString(fromAddress)).append("\n");
    sb.append("    carrierAccountId: ").append(toIndentedString(carrierAccountId)).append("\n");
    sb.append("    serviceId: ").append(toIndentedString(serviceId)).append("\n");
    sb.append("    shipmentOptions: ").append(toIndentedString(shipmentOptions)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    multiPieceParcels: ").append(toIndentedString(multiPieceParcels)).append("\n");
    sb.append("    toAddress: ").append(toIndentedString(toAddress)).append("\n");
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

