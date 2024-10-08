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
import com.pitneybowes.api360.model.GetAllShipmentsDataInnerMetadataInner;
import com.pitneybowes.api360.model.GetSingleShipmentFromAddress;
import com.pitneybowes.api360.model.GetSingleShipmentRate;
import com.pitneybowes.api360.model.GetSingleShipmentToAddress;
import com.pitneybowes.api360.model.ShipmentDomesticParcel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * GetSingleShipment
 */
@JsonPropertyOrder({
  GetSingleShipment.JSON_PROPERTY_CORRELATION_ID,
  GetSingleShipment.JSON_PROPERTY_FROM_ADDRESS,
  GetSingleShipment.JSON_PROPERTY_PARCEL,
  GetSingleShipment.JSON_PROPERTY_METADATA,
  GetSingleShipment.JSON_PROPERTY_PARCEL_TRACKING_NUMBER,
  GetSingleShipment.JSON_PROPERTY_RATE,
  GetSingleShipment.JSON_PROPERTY_SERVICE,
  GetSingleShipment.JSON_PROPERTY_SHIPMENT_ID,
  GetSingleShipment.JSON_PROPERTY_STATUS,
  GetSingleShipment.JSON_PROPERTY_TO_ADDRESS
})
@JsonTypeName("getSingleShipment")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-09-30T12:57:37.504069+05:30[Asia/Kolkata]", comments = "Generator version: 7.7.0")
public class GetSingleShipment {
  public static final String JSON_PROPERTY_CORRELATION_ID = "correlationId";
  private String correlationId;

  public static final String JSON_PROPERTY_FROM_ADDRESS = "fromAddress";
  private GetSingleShipmentFromAddress fromAddress;

  public static final String JSON_PROPERTY_PARCEL = "parcel";
  private ShipmentDomesticParcel parcel;

  public static final String JSON_PROPERTY_METADATA = "metadata";
  private List<GetAllShipmentsDataInnerMetadataInner> metadata = new ArrayList<>();

  public static final String JSON_PROPERTY_PARCEL_TRACKING_NUMBER = "parcelTrackingNumber";
  private String parcelTrackingNumber;

  public static final String JSON_PROPERTY_RATE = "rate";
  private GetSingleShipmentRate rate;

  public static final String JSON_PROPERTY_SERVICE = "service";
  private String service;

  public static final String JSON_PROPERTY_SHIPMENT_ID = "shipmentId";
  private String shipmentId;

  public static final String JSON_PROPERTY_STATUS = "status";
  private String status;

  public static final String JSON_PROPERTY_TO_ADDRESS = "toAddress";
  private GetSingleShipmentToAddress toAddress;

  public GetSingleShipment() {
  }

  public GetSingleShipment correlationId(String correlationId) {
    
    this.correlationId = correlationId;
    return this;
  }

  /**
   * This is a GUID (globally unique identifier) that&#39;s automatically generated for every request that the webserver receives.
   * @return correlationId
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CORRELATION_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCorrelationId() {
    return correlationId;
  }


  @JsonProperty(JSON_PROPERTY_CORRELATION_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCorrelationId(String correlationId) {
    this.correlationId = correlationId;
  }

  public GetSingleShipment fromAddress(GetSingleShipmentFromAddress fromAddress) {
    
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

  public GetSingleShipmentFromAddress getFromAddress() {
    return fromAddress;
  }


  @JsonProperty(JSON_PROPERTY_FROM_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFromAddress(GetSingleShipmentFromAddress fromAddress) {
    this.fromAddress = fromAddress;
  }

  public GetSingleShipment parcel(ShipmentDomesticParcel parcel) {
    
    this.parcel = parcel;
    return this;
  }

  /**
   * Get parcel
   * @return parcel
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PARCEL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ShipmentDomesticParcel getParcel() {
    return parcel;
  }


  @JsonProperty(JSON_PROPERTY_PARCEL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setParcel(ShipmentDomesticParcel parcel) {
    this.parcel = parcel;
  }

  public GetSingleShipment metadata(List<GetAllShipmentsDataInnerMetadataInner> metadata) {
    
    this.metadata = metadata;
    return this;
  }

  public GetSingleShipment addMetadataItem(GetAllShipmentsDataInnerMetadataInner metadataItem) {
    if (this.metadata == null) {
      this.metadata = new ArrayList<>();
    }
    this.metadata.add(metadataItem);
    return this;
  }

  /**
   * Additional metadata that needs to be stored for this shipment can be added here. For now, &#x60;costAccountName&#x60; is supported.
   * @return metadata
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_METADATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<GetAllShipmentsDataInnerMetadataInner> getMetadata() {
    return metadata;
  }


  @JsonProperty(JSON_PROPERTY_METADATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMetadata(List<GetAllShipmentsDataInnerMetadataInner> metadata) {
    this.metadata = metadata;
  }

  public GetSingleShipment parcelTrackingNumber(String parcelTrackingNumber) {
    
    this.parcelTrackingNumber = parcelTrackingNumber;
    return this;
  }

  /**
   * The Tracking number given to the Parcel for tracking purpose.
   * @return parcelTrackingNumber
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PARCEL_TRACKING_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getParcelTrackingNumber() {
    return parcelTrackingNumber;
  }


  @JsonProperty(JSON_PROPERTY_PARCEL_TRACKING_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setParcelTrackingNumber(String parcelTrackingNumber) {
    this.parcelTrackingNumber = parcelTrackingNumber;
  }

  public GetSingleShipment rate(GetSingleShipmentRate rate) {
    
    this.rate = rate;
    return this;
  }

  /**
   * Get rate
   * @return rate
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public GetSingleShipmentRate getRate() {
    return rate;
  }


  @JsonProperty(JSON_PROPERTY_RATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRate(GetSingleShipmentRate rate) {
    this.rate = rate;
  }

  public GetSingleShipment service(String service) {
    
    this.service = service;
    return this;
  }

  /**
   * This indicates the carrier based service that is used for shipment.
   * @return service
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SERVICE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getService() {
    return service;
  }


  @JsonProperty(JSON_PROPERTY_SERVICE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setService(String service) {
    this.service = service;
  }

  public GetSingleShipment shipmentId(String shipmentId) {
    
    this.shipmentId = shipmentId;
    return this;
  }

  /**
   * A unique identifier associated with Shipment ID.
   * @return shipmentId
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SHIPMENT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getShipmentId() {
    return shipmentId;
  }


  @JsonProperty(JSON_PROPERTY_SHIPMENT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setShipmentId(String shipmentId) {
    this.shipmentId = shipmentId;
  }

  public GetSingleShipment status(String status) {
    
    this.status = status;
    return this;
  }

  /**
   * The status of the Shipment.
   * @return status
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getStatus() {
    return status;
  }


  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStatus(String status) {
    this.status = status;
  }

  public GetSingleShipment toAddress(GetSingleShipmentToAddress toAddress) {
    
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

  public GetSingleShipmentToAddress getToAddress() {
    return toAddress;
  }


  @JsonProperty(JSON_PROPERTY_TO_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setToAddress(GetSingleShipmentToAddress toAddress) {
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
    GetSingleShipment getSingleShipment = (GetSingleShipment) o;
    return Objects.equals(this.correlationId, getSingleShipment.correlationId) &&
        Objects.equals(this.fromAddress, getSingleShipment.fromAddress) &&
        Objects.equals(this.parcel, getSingleShipment.parcel) &&
        Objects.equals(this.metadata, getSingleShipment.metadata) &&
        Objects.equals(this.parcelTrackingNumber, getSingleShipment.parcelTrackingNumber) &&
        Objects.equals(this.rate, getSingleShipment.rate) &&
        Objects.equals(this.service, getSingleShipment.service) &&
        Objects.equals(this.shipmentId, getSingleShipment.shipmentId) &&
        Objects.equals(this.status, getSingleShipment.status) &&
        Objects.equals(this.toAddress, getSingleShipment.toAddress);
  }

  @Override
  public int hashCode() {
    return Objects.hash(correlationId, fromAddress, parcel, metadata, parcelTrackingNumber, rate, service, shipmentId, status, toAddress);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetSingleShipment {\n");
    sb.append("    correlationId: ").append(toIndentedString(correlationId)).append("\n");
    sb.append("    fromAddress: ").append(toIndentedString(fromAddress)).append("\n");
    sb.append("    parcel: ").append(toIndentedString(parcel)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    parcelTrackingNumber: ").append(toIndentedString(parcelTrackingNumber)).append("\n");
    sb.append("    rate: ").append(toIndentedString(rate)).append("\n");
    sb.append("    service: ").append(toIndentedString(service)).append("\n");
    sb.append("    shipmentId: ").append(toIndentedString(shipmentId)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

