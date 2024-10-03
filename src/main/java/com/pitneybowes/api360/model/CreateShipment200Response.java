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
import com.pitneybowes.api360.model.DomesticShipmentResponse;
import com.pitneybowes.api360.model.DomesticShipmentResponseLabelLayoutInner;
import com.pitneybowes.api360.model.InternationalShipmentResponse;
import com.pitneybowes.api360.model.InternationalShipmentResponseCustoms;
import com.pitneybowes.api360.model.InternationalShipmentResponseRate;
import com.pitneybowes.api360.model.ReprintShipmentFromAddress;
import com.pitneybowes.api360.model.ReprintShipmentToAddress;
import com.pitneybowes.api360.model.ShipmentDomesticParcel;
import com.pitneybowes.api360.model.ShipmentOptions;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * CreateShipment200Response
 */
@JsonPropertyOrder({
  CreateShipment200Response.JSON_PROPERTY_CORRELATION_ID,
  CreateShipment200Response.JSON_PROPERTY_LABEL_LAYOUT,
  CreateShipment200Response.JSON_PROPERTY_FROM_ADDRESS,
  CreateShipment200Response.JSON_PROPERTY_PARCEL,
  CreateShipment200Response.JSON_PROPERTY_PARCEL_ID,
  CreateShipment200Response.JSON_PROPERTY_PARCEL_TRACKING_NUMBER,
  CreateShipment200Response.JSON_PROPERTY_RATE,
  CreateShipment200Response.JSON_PROPERTY_SHIPMENT_ID,
  CreateShipment200Response.JSON_PROPERTY_SHIPMENT_OPTIONS,
  CreateShipment200Response.JSON_PROPERTY_TO_ADDRESS,
  CreateShipment200Response.JSON_PROPERTY_CUSTOMS
})
@JsonTypeName("createShipment_200_response")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-09-30T12:57:37.504069+05:30[Asia/Kolkata]", comments = "Generator version: 7.7.0")
public class CreateShipment200Response {
  public static final String JSON_PROPERTY_CORRELATION_ID = "correlationId";
  private String correlationId;

  public static final String JSON_PROPERTY_LABEL_LAYOUT = "labelLayout";
  private List<DomesticShipmentResponseLabelLayoutInner> labelLayout = new ArrayList<>();

  public static final String JSON_PROPERTY_FROM_ADDRESS = "fromAddress";
  private ReprintShipmentFromAddress fromAddress;

  public static final String JSON_PROPERTY_PARCEL = "parcel";
  private ShipmentDomesticParcel parcel;

  public static final String JSON_PROPERTY_PARCEL_ID = "parcelId";
  private String parcelId;

  public static final String JSON_PROPERTY_PARCEL_TRACKING_NUMBER = "parcelTrackingNumber";
  private String parcelTrackingNumber;

  public static final String JSON_PROPERTY_RATE = "rate";
  private InternationalShipmentResponseRate rate;

  public static final String JSON_PROPERTY_SHIPMENT_ID = "shipmentId";
  private String shipmentId;

  public static final String JSON_PROPERTY_SHIPMENT_OPTIONS = "shipmentOptions";
  private ShipmentOptions shipmentOptions;

  public static final String JSON_PROPERTY_TO_ADDRESS = "toAddress";
  private ReprintShipmentToAddress toAddress;

  public static final String JSON_PROPERTY_CUSTOMS = "customs";
  private InternationalShipmentResponseCustoms customs;

  public CreateShipment200Response() {
  }

  public CreateShipment200Response correlationId(String correlationId) {
    
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

  public CreateShipment200Response labelLayout(List<DomesticShipmentResponseLabelLayoutInner> labelLayout) {
    
    this.labelLayout = labelLayout;
    return this;
  }

  public CreateShipment200Response addLabelLayoutItem(DomesticShipmentResponseLabelLayoutInner labelLayoutItem) {
    if (this.labelLayout == null) {
      this.labelLayout = new ArrayList<>();
    }
    this.labelLayout.add(labelLayoutItem);
    return this;
  }

  /**
   * This indicates the label layout and generated label details
   * @return labelLayout
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LABEL_LAYOUT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<DomesticShipmentResponseLabelLayoutInner> getLabelLayout() {
    return labelLayout;
  }


  @JsonProperty(JSON_PROPERTY_LABEL_LAYOUT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLabelLayout(List<DomesticShipmentResponseLabelLayoutInner> labelLayout) {
    this.labelLayout = labelLayout;
  }

  public CreateShipment200Response fromAddress(ReprintShipmentFromAddress fromAddress) {
    
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

  public ReprintShipmentFromAddress getFromAddress() {
    return fromAddress;
  }


  @JsonProperty(JSON_PROPERTY_FROM_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFromAddress(ReprintShipmentFromAddress fromAddress) {
    this.fromAddress = fromAddress;
  }

  public CreateShipment200Response parcel(ShipmentDomesticParcel parcel) {
    
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

  public CreateShipment200Response parcelId(String parcelId) {
    
    this.parcelId = parcelId;
    return this;
  }

  /**
   * &gt;-Parcel Id is optional and would be visible in case when is present in the request.
   * @return parcelId
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PARCEL_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getParcelId() {
    return parcelId;
  }


  @JsonProperty(JSON_PROPERTY_PARCEL_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setParcelId(String parcelId) {
    this.parcelId = parcelId;
  }

  public CreateShipment200Response parcelTrackingNumber(String parcelTrackingNumber) {
    
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

  public CreateShipment200Response rate(InternationalShipmentResponseRate rate) {
    
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

  public InternationalShipmentResponseRate getRate() {
    return rate;
  }


  @JsonProperty(JSON_PROPERTY_RATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRate(InternationalShipmentResponseRate rate) {
    this.rate = rate;
  }

  public CreateShipment200Response shipmentId(String shipmentId) {
    
    this.shipmentId = shipmentId;
    return this;
  }

  /**
   * A unique identifier associated with the Shipment.
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

  public CreateShipment200Response shipmentOptions(ShipmentOptions shipmentOptions) {
    
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

  public ShipmentOptions getShipmentOptions() {
    return shipmentOptions;
  }


  @JsonProperty(JSON_PROPERTY_SHIPMENT_OPTIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setShipmentOptions(ShipmentOptions shipmentOptions) {
    this.shipmentOptions = shipmentOptions;
  }

  public CreateShipment200Response toAddress(ReprintShipmentToAddress toAddress) {
    
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

  public ReprintShipmentToAddress getToAddress() {
    return toAddress;
  }


  @JsonProperty(JSON_PROPERTY_TO_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setToAddress(ReprintShipmentToAddress toAddress) {
    this.toAddress = toAddress;
  }

  public CreateShipment200Response customs(InternationalShipmentResponseCustoms customs) {
    
    this.customs = customs;
    return this;
  }

  /**
   * Get customs
   * @return customs
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CUSTOMS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public InternationalShipmentResponseCustoms getCustoms() {
    return customs;
  }


  @JsonProperty(JSON_PROPERTY_CUSTOMS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCustoms(InternationalShipmentResponseCustoms customs) {
    this.customs = customs;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateShipment200Response createShipment200Response = (CreateShipment200Response) o;
    return Objects.equals(this.correlationId, createShipment200Response.correlationId) &&
        Objects.equals(this.labelLayout, createShipment200Response.labelLayout) &&
        Objects.equals(this.fromAddress, createShipment200Response.fromAddress) &&
        Objects.equals(this.parcel, createShipment200Response.parcel) &&
        Objects.equals(this.parcelId, createShipment200Response.parcelId) &&
        Objects.equals(this.parcelTrackingNumber, createShipment200Response.parcelTrackingNumber) &&
        Objects.equals(this.rate, createShipment200Response.rate) &&
        Objects.equals(this.shipmentId, createShipment200Response.shipmentId) &&
        Objects.equals(this.shipmentOptions, createShipment200Response.shipmentOptions) &&
        Objects.equals(this.toAddress, createShipment200Response.toAddress) &&
        Objects.equals(this.customs, createShipment200Response.customs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(correlationId, labelLayout, fromAddress, parcel, parcelId, parcelTrackingNumber, rate, shipmentId, shipmentOptions, toAddress, customs);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateShipment200Response {\n");
    sb.append("    correlationId: ").append(toIndentedString(correlationId)).append("\n");
    sb.append("    labelLayout: ").append(toIndentedString(labelLayout)).append("\n");
    sb.append("    fromAddress: ").append(toIndentedString(fromAddress)).append("\n");
    sb.append("    parcel: ").append(toIndentedString(parcel)).append("\n");
    sb.append("    parcelId: ").append(toIndentedString(parcelId)).append("\n");
    sb.append("    parcelTrackingNumber: ").append(toIndentedString(parcelTrackingNumber)).append("\n");
    sb.append("    rate: ").append(toIndentedString(rate)).append("\n");
    sb.append("    shipmentId: ").append(toIndentedString(shipmentId)).append("\n");
    sb.append("    shipmentOptions: ").append(toIndentedString(shipmentOptions)).append("\n");
    sb.append("    toAddress: ").append(toIndentedString(toAddress)).append("\n");
    sb.append("    customs: ").append(toIndentedString(customs)).append("\n");
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

