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
import com.pitneybowes.api360.model.MultipieceDomesticShipmentResponseMultiPieceRatesInnerMultiPieceParcelsInner;
import com.pitneybowes.api360.model.MultipieceDomesticShipmentResponseMultiPieceRatesInnerSurchargesInner;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * description
 */
@JsonPropertyOrder({
  MultipieceDomesticShipmentResponseMultiPieceRatesInner.JSON_PROPERTY_TOTAL_CARRIER_CHARGE,
  MultipieceDomesticShipmentResponseMultiPieceRatesInner.JSON_PROPERTY_CARRIER,
  MultipieceDomesticShipmentResponseMultiPieceRatesInner.JSON_PROPERTY_CURRENCY_CODE,
  MultipieceDomesticShipmentResponseMultiPieceRatesInner.JSON_PROPERTY_RATE_TYPE_ID,
  MultipieceDomesticShipmentResponseMultiPieceRatesInner.JSON_PROPERTY_SERVICE_ID,
  MultipieceDomesticShipmentResponseMultiPieceRatesInner.JSON_PROPERTY_SERVICE_NAME,
  MultipieceDomesticShipmentResponseMultiPieceRatesInner.JSON_PROPERTY_MULTI_PIECE_PARCELS,
  MultipieceDomesticShipmentResponseMultiPieceRatesInner.JSON_PROPERTY_SURCHARGES
})
@JsonTypeName("MultipieceDomesticShipmentResponse_multiPieceRates_inner")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-09-30T12:57:37.504069+05:30[Asia/Kolkata]", comments = "Generator version: 7.7.0")
public class MultipieceDomesticShipmentResponseMultiPieceRatesInner {
  public static final String JSON_PROPERTY_TOTAL_CARRIER_CHARGE = "totalCarrierCharge";
  private BigDecimal totalCarrierCharge;

  public static final String JSON_PROPERTY_CARRIER = "carrier";
  private String carrier;

  public static final String JSON_PROPERTY_CURRENCY_CODE = "currencyCode";
  private String currencyCode;

  public static final String JSON_PROPERTY_RATE_TYPE_ID = "rateTypeId";
  private String rateTypeId;

  public static final String JSON_PROPERTY_SERVICE_ID = "serviceId";
  private String serviceId;

  public static final String JSON_PROPERTY_SERVICE_NAME = "serviceName";
  private String serviceName;

  public static final String JSON_PROPERTY_MULTI_PIECE_PARCELS = "multiPieceParcels";
  private List<MultipieceDomesticShipmentResponseMultiPieceRatesInnerMultiPieceParcelsInner> multiPieceParcels = new ArrayList<>();

  public static final String JSON_PROPERTY_SURCHARGES = "surcharges";
  private List<MultipieceDomesticShipmentResponseMultiPieceRatesInnerSurchargesInner> surcharges = new ArrayList<>();

  public MultipieceDomesticShipmentResponseMultiPieceRatesInner() {
  }

  public MultipieceDomesticShipmentResponseMultiPieceRatesInner totalCarrierCharge(BigDecimal totalCarrierCharge) {
    
    this.totalCarrierCharge = totalCarrierCharge;
    return this;
  }

  /**
   * description
   * @return totalCarrierCharge
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TOTAL_CARRIER_CHARGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getTotalCarrierCharge() {
    return totalCarrierCharge;
  }


  @JsonProperty(JSON_PROPERTY_TOTAL_CARRIER_CHARGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTotalCarrierCharge(BigDecimal totalCarrierCharge) {
    this.totalCarrierCharge = totalCarrierCharge;
  }

  public MultipieceDomesticShipmentResponseMultiPieceRatesInner carrier(String carrier) {
    
    this.carrier = carrier;
    return this;
  }

  /**
   * description
   * @return carrier
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CARRIER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCarrier() {
    return carrier;
  }


  @JsonProperty(JSON_PROPERTY_CARRIER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCarrier(String carrier) {
    this.carrier = carrier;
  }

  public MultipieceDomesticShipmentResponseMultiPieceRatesInner currencyCode(String currencyCode) {
    
    this.currencyCode = currencyCode;
    return this;
  }

  /**
   * description
   * @return currencyCode
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CURRENCY_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCurrencyCode() {
    return currencyCode;
  }


  @JsonProperty(JSON_PROPERTY_CURRENCY_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCurrencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
  }

  public MultipieceDomesticShipmentResponseMultiPieceRatesInner rateTypeId(String rateTypeId) {
    
    this.rateTypeId = rateTypeId;
    return this;
  }

  /**
   * description
   * @return rateTypeId
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RATE_TYPE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getRateTypeId() {
    return rateTypeId;
  }


  @JsonProperty(JSON_PROPERTY_RATE_TYPE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRateTypeId(String rateTypeId) {
    this.rateTypeId = rateTypeId;
  }

  public MultipieceDomesticShipmentResponseMultiPieceRatesInner serviceId(String serviceId) {
    
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

  public MultipieceDomesticShipmentResponseMultiPieceRatesInner serviceName(String serviceName) {
    
    this.serviceName = serviceName;
    return this;
  }

  /**
   * description
   * @return serviceName
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SERVICE_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getServiceName() {
    return serviceName;
  }


  @JsonProperty(JSON_PROPERTY_SERVICE_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setServiceName(String serviceName) {
    this.serviceName = serviceName;
  }

  public MultipieceDomesticShipmentResponseMultiPieceRatesInner multiPieceParcels(List<MultipieceDomesticShipmentResponseMultiPieceRatesInnerMultiPieceParcelsInner> multiPieceParcels) {
    
    this.multiPieceParcels = multiPieceParcels;
    return this;
  }

  public MultipieceDomesticShipmentResponseMultiPieceRatesInner addMultiPieceParcelsItem(MultipieceDomesticShipmentResponseMultiPieceRatesInnerMultiPieceParcelsInner multiPieceParcelsItem) {
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

  public List<MultipieceDomesticShipmentResponseMultiPieceRatesInnerMultiPieceParcelsInner> getMultiPieceParcels() {
    return multiPieceParcels;
  }


  @JsonProperty(JSON_PROPERTY_MULTI_PIECE_PARCELS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMultiPieceParcels(List<MultipieceDomesticShipmentResponseMultiPieceRatesInnerMultiPieceParcelsInner> multiPieceParcels) {
    this.multiPieceParcels = multiPieceParcels;
  }

  public MultipieceDomesticShipmentResponseMultiPieceRatesInner surcharges(List<MultipieceDomesticShipmentResponseMultiPieceRatesInnerSurchargesInner> surcharges) {
    
    this.surcharges = surcharges;
    return this;
  }

  public MultipieceDomesticShipmentResponseMultiPieceRatesInner addSurchargesItem(MultipieceDomesticShipmentResponseMultiPieceRatesInnerSurchargesInner surchargesItem) {
    if (this.surcharges == null) {
      this.surcharges = new ArrayList<>();
    }
    this.surcharges.add(surchargesItem);
    return this;
  }

  /**
   * description
   * @return surcharges
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SURCHARGES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<MultipieceDomesticShipmentResponseMultiPieceRatesInnerSurchargesInner> getSurcharges() {
    return surcharges;
  }


  @JsonProperty(JSON_PROPERTY_SURCHARGES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSurcharges(List<MultipieceDomesticShipmentResponseMultiPieceRatesInnerSurchargesInner> surcharges) {
    this.surcharges = surcharges;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MultipieceDomesticShipmentResponseMultiPieceRatesInner multipieceDomesticShipmentResponseMultiPieceRatesInner = (MultipieceDomesticShipmentResponseMultiPieceRatesInner) o;
    return Objects.equals(this.totalCarrierCharge, multipieceDomesticShipmentResponseMultiPieceRatesInner.totalCarrierCharge) &&
        Objects.equals(this.carrier, multipieceDomesticShipmentResponseMultiPieceRatesInner.carrier) &&
        Objects.equals(this.currencyCode, multipieceDomesticShipmentResponseMultiPieceRatesInner.currencyCode) &&
        Objects.equals(this.rateTypeId, multipieceDomesticShipmentResponseMultiPieceRatesInner.rateTypeId) &&
        Objects.equals(this.serviceId, multipieceDomesticShipmentResponseMultiPieceRatesInner.serviceId) &&
        Objects.equals(this.serviceName, multipieceDomesticShipmentResponseMultiPieceRatesInner.serviceName) &&
        Objects.equals(this.multiPieceParcels, multipieceDomesticShipmentResponseMultiPieceRatesInner.multiPieceParcels) &&
        Objects.equals(this.surcharges, multipieceDomesticShipmentResponseMultiPieceRatesInner.surcharges);
  }

  @Override
  public int hashCode() {
    return Objects.hash(totalCarrierCharge, carrier, currencyCode, rateTypeId, serviceId, serviceName, multiPieceParcels, surcharges);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MultipieceDomesticShipmentResponseMultiPieceRatesInner {\n");
    sb.append("    totalCarrierCharge: ").append(toIndentedString(totalCarrierCharge)).append("\n");
    sb.append("    carrier: ").append(toIndentedString(carrier)).append("\n");
    sb.append("    currencyCode: ").append(toIndentedString(currencyCode)).append("\n");
    sb.append("    rateTypeId: ").append(toIndentedString(rateTypeId)).append("\n");
    sb.append("    serviceId: ").append(toIndentedString(serviceId)).append("\n");
    sb.append("    serviceName: ").append(toIndentedString(serviceName)).append("\n");
    sb.append("    multiPieceParcels: ").append(toIndentedString(multiPieceParcels)).append("\n");
    sb.append("    surcharges: ").append(toIndentedString(surcharges)).append("\n");
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

