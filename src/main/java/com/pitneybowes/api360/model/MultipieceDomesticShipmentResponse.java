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
import com.pitneybowes.api360.model.MultipieceDomesticShipmentRequestShipmentOptions;
import com.pitneybowes.api360.model.MultipieceDomesticShipmentRequestToAddress;
import com.pitneybowes.api360.model.MultipieceDomesticShipmentResponseLabelLayoutInner;
import com.pitneybowes.api360.model.MultipieceDomesticShipmentResponseMultiPieceRatesInner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * MultipieceDomesticShipmentResponse
 */
@JsonPropertyOrder({
  MultipieceDomesticShipmentResponse.JSON_PROPERTY_CORRELATION_ID,
  MultipieceDomesticShipmentResponse.JSON_PROPERTY_LABEL_LAYOUT,
  MultipieceDomesticShipmentResponse.JSON_PROPERTY_FROM_ADDRESS,
  MultipieceDomesticShipmentResponse.JSON_PROPERTY_MULTI_PIECE_RATES,
  MultipieceDomesticShipmentResponse.JSON_PROPERTY_PARCEL_TRACKING_NUMBER,
  MultipieceDomesticShipmentResponse.JSON_PROPERTY_SHIPMENT_ID,
  MultipieceDomesticShipmentResponse.JSON_PROPERTY_SHIPMENT_OPTIONS,
  MultipieceDomesticShipmentResponse.JSON_PROPERTY_TO_ADDRESS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-09-30T12:57:37.504069+05:30[Asia/Kolkata]", comments = "Generator version: 7.7.0")
public class MultipieceDomesticShipmentResponse {
  public static final String JSON_PROPERTY_CORRELATION_ID = "correlationId";
  private String correlationId;

  public static final String JSON_PROPERTY_LABEL_LAYOUT = "labelLayout";
  private List<MultipieceDomesticShipmentResponseLabelLayoutInner> labelLayout = new ArrayList<>();

  public static final String JSON_PROPERTY_FROM_ADDRESS = "fromAddress";
  private MultipieceDomesticShipmentRequestFromAddress fromAddress;

  public static final String JSON_PROPERTY_MULTI_PIECE_RATES = "multiPieceRates";
  private List<MultipieceDomesticShipmentResponseMultiPieceRatesInner> multiPieceRates = new ArrayList<>();

  public static final String JSON_PROPERTY_PARCEL_TRACKING_NUMBER = "parcelTrackingNumber";
  private String parcelTrackingNumber;

  public static final String JSON_PROPERTY_SHIPMENT_ID = "shipmentId";
  private String shipmentId;

  public static final String JSON_PROPERTY_SHIPMENT_OPTIONS = "shipmentOptions";
  private MultipieceDomesticShipmentRequestShipmentOptions shipmentOptions;

  public static final String JSON_PROPERTY_TO_ADDRESS = "toAddress";
  private MultipieceDomesticShipmentRequestToAddress toAddress;

  public MultipieceDomesticShipmentResponse() {
  }

  public MultipieceDomesticShipmentResponse correlationId(String correlationId) {
    
    this.correlationId = correlationId;
    return this;
  }

  /**
   * description
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

  public MultipieceDomesticShipmentResponse labelLayout(List<MultipieceDomesticShipmentResponseLabelLayoutInner> labelLayout) {
    
    this.labelLayout = labelLayout;
    return this;
  }

  public MultipieceDomesticShipmentResponse addLabelLayoutItem(MultipieceDomesticShipmentResponseLabelLayoutInner labelLayoutItem) {
    if (this.labelLayout == null) {
      this.labelLayout = new ArrayList<>();
    }
    this.labelLayout.add(labelLayoutItem);
    return this;
  }

  /**
   * description
   * @return labelLayout
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LABEL_LAYOUT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<MultipieceDomesticShipmentResponseLabelLayoutInner> getLabelLayout() {
    return labelLayout;
  }


  @JsonProperty(JSON_PROPERTY_LABEL_LAYOUT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLabelLayout(List<MultipieceDomesticShipmentResponseLabelLayoutInner> labelLayout) {
    this.labelLayout = labelLayout;
  }

  public MultipieceDomesticShipmentResponse fromAddress(MultipieceDomesticShipmentRequestFromAddress fromAddress) {
    
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

  public MultipieceDomesticShipmentResponse multiPieceRates(List<MultipieceDomesticShipmentResponseMultiPieceRatesInner> multiPieceRates) {
    
    this.multiPieceRates = multiPieceRates;
    return this;
  }

  public MultipieceDomesticShipmentResponse addMultiPieceRatesItem(MultipieceDomesticShipmentResponseMultiPieceRatesInner multiPieceRatesItem) {
    if (this.multiPieceRates == null) {
      this.multiPieceRates = new ArrayList<>();
    }
    this.multiPieceRates.add(multiPieceRatesItem);
    return this;
  }

  /**
   * description
   * @return multiPieceRates
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MULTI_PIECE_RATES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<MultipieceDomesticShipmentResponseMultiPieceRatesInner> getMultiPieceRates() {
    return multiPieceRates;
  }


  @JsonProperty(JSON_PROPERTY_MULTI_PIECE_RATES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMultiPieceRates(List<MultipieceDomesticShipmentResponseMultiPieceRatesInner> multiPieceRates) {
    this.multiPieceRates = multiPieceRates;
  }

  public MultipieceDomesticShipmentResponse parcelTrackingNumber(String parcelTrackingNumber) {
    
    this.parcelTrackingNumber = parcelTrackingNumber;
    return this;
  }

  /**
   * description
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

  public MultipieceDomesticShipmentResponse shipmentId(String shipmentId) {
    
    this.shipmentId = shipmentId;
    return this;
  }

  /**
   * description
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

  public MultipieceDomesticShipmentResponse shipmentOptions(MultipieceDomesticShipmentRequestShipmentOptions shipmentOptions) {
    
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

  public MultipieceDomesticShipmentResponse toAddress(MultipieceDomesticShipmentRequestToAddress toAddress) {
    
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
    MultipieceDomesticShipmentResponse multipieceDomesticShipmentResponse = (MultipieceDomesticShipmentResponse) o;
    return Objects.equals(this.correlationId, multipieceDomesticShipmentResponse.correlationId) &&
        Objects.equals(this.labelLayout, multipieceDomesticShipmentResponse.labelLayout) &&
        Objects.equals(this.fromAddress, multipieceDomesticShipmentResponse.fromAddress) &&
        Objects.equals(this.multiPieceRates, multipieceDomesticShipmentResponse.multiPieceRates) &&
        Objects.equals(this.parcelTrackingNumber, multipieceDomesticShipmentResponse.parcelTrackingNumber) &&
        Objects.equals(this.shipmentId, multipieceDomesticShipmentResponse.shipmentId) &&
        Objects.equals(this.shipmentOptions, multipieceDomesticShipmentResponse.shipmentOptions) &&
        Objects.equals(this.toAddress, multipieceDomesticShipmentResponse.toAddress);
  }

  @Override
  public int hashCode() {
    return Objects.hash(correlationId, labelLayout, fromAddress, multiPieceRates, parcelTrackingNumber, shipmentId, shipmentOptions, toAddress);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MultipieceDomesticShipmentResponse {\n");
    sb.append("    correlationId: ").append(toIndentedString(correlationId)).append("\n");
    sb.append("    labelLayout: ").append(toIndentedString(labelLayout)).append("\n");
    sb.append("    fromAddress: ").append(toIndentedString(fromAddress)).append("\n");
    sb.append("    multiPieceRates: ").append(toIndentedString(multiPieceRates)).append("\n");
    sb.append("    parcelTrackingNumber: ").append(toIndentedString(parcelTrackingNumber)).append("\n");
    sb.append("    shipmentId: ").append(toIndentedString(shipmentId)).append("\n");
    sb.append("    shipmentOptions: ").append(toIndentedString(shipmentOptions)).append("\n");
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

