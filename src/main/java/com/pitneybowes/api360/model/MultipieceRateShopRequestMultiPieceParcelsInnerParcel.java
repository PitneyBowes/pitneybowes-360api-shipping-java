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
 * description
 */
@JsonPropertyOrder({
  MultipieceRateShopRequestMultiPieceParcelsInnerParcel.JSON_PROPERTY_WEIGHT_UNIT,
  MultipieceRateShopRequestMultiPieceParcelsInnerParcel.JSON_PROPERTY_WEIGHT,
  MultipieceRateShopRequestMultiPieceParcelsInnerParcel.JSON_PROPERTY_DIM_UNIT,
  MultipieceRateShopRequestMultiPieceParcelsInnerParcel.JSON_PROPERTY_LENGTH,
  MultipieceRateShopRequestMultiPieceParcelsInnerParcel.JSON_PROPERTY_WIDTH,
  MultipieceRateShopRequestMultiPieceParcelsInnerParcel.JSON_PROPERTY_HEIGHT
})
@JsonTypeName("MultipieceRateShopRequest_multiPieceParcels_inner_parcel")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-09-30T12:57:37.504069+05:30[Asia/Kolkata]", comments = "Generator version: 7.7.0")
public class MultipieceRateShopRequestMultiPieceParcelsInnerParcel {
  public static final String JSON_PROPERTY_WEIGHT_UNIT = "weightUnit";
  private String weightUnit;

  public static final String JSON_PROPERTY_WEIGHT = "weight";
  private BigDecimal weight;

  public static final String JSON_PROPERTY_DIM_UNIT = "dimUnit";
  private String dimUnit;

  public static final String JSON_PROPERTY_LENGTH = "length";
  private BigDecimal length;

  public static final String JSON_PROPERTY_WIDTH = "width";
  private BigDecimal width;

  public static final String JSON_PROPERTY_HEIGHT = "height";
  private BigDecimal height;

  public MultipieceRateShopRequestMultiPieceParcelsInnerParcel() {
  }

  public MultipieceRateShopRequestMultiPieceParcelsInnerParcel weightUnit(String weightUnit) {
    
    this.weightUnit = weightUnit;
    return this;
  }

  /**
   * description
   * @return weightUnit
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_WEIGHT_UNIT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getWeightUnit() {
    return weightUnit;
  }


  @JsonProperty(JSON_PROPERTY_WEIGHT_UNIT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setWeightUnit(String weightUnit) {
    this.weightUnit = weightUnit;
  }

  public MultipieceRateShopRequestMultiPieceParcelsInnerParcel weight(BigDecimal weight) {
    
    this.weight = weight;
    return this;
  }

  /**
   * description
   * @return weight
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_WEIGHT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getWeight() {
    return weight;
  }


  @JsonProperty(JSON_PROPERTY_WEIGHT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setWeight(BigDecimal weight) {
    this.weight = weight;
  }

  public MultipieceRateShopRequestMultiPieceParcelsInnerParcel dimUnit(String dimUnit) {
    
    this.dimUnit = dimUnit;
    return this;
  }

  /**
   * description
   * @return dimUnit
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DIM_UNIT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDimUnit() {
    return dimUnit;
  }


  @JsonProperty(JSON_PROPERTY_DIM_UNIT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDimUnit(String dimUnit) {
    this.dimUnit = dimUnit;
  }

  public MultipieceRateShopRequestMultiPieceParcelsInnerParcel length(BigDecimal length) {
    
    this.length = length;
    return this;
  }

  /**
   * description
   * @return length
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LENGTH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getLength() {
    return length;
  }


  @JsonProperty(JSON_PROPERTY_LENGTH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLength(BigDecimal length) {
    this.length = length;
  }

  public MultipieceRateShopRequestMultiPieceParcelsInnerParcel width(BigDecimal width) {
    
    this.width = width;
    return this;
  }

  /**
   * description
   * @return width
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_WIDTH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getWidth() {
    return width;
  }


  @JsonProperty(JSON_PROPERTY_WIDTH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setWidth(BigDecimal width) {
    this.width = width;
  }

  public MultipieceRateShopRequestMultiPieceParcelsInnerParcel height(BigDecimal height) {
    
    this.height = height;
    return this;
  }

  /**
   * description
   * @return height
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_HEIGHT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getHeight() {
    return height;
  }


  @JsonProperty(JSON_PROPERTY_HEIGHT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setHeight(BigDecimal height) {
    this.height = height;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MultipieceRateShopRequestMultiPieceParcelsInnerParcel multipieceRateShopRequestMultiPieceParcelsInnerParcel = (MultipieceRateShopRequestMultiPieceParcelsInnerParcel) o;
    return Objects.equals(this.weightUnit, multipieceRateShopRequestMultiPieceParcelsInnerParcel.weightUnit) &&
        Objects.equals(this.weight, multipieceRateShopRequestMultiPieceParcelsInnerParcel.weight) &&
        Objects.equals(this.dimUnit, multipieceRateShopRequestMultiPieceParcelsInnerParcel.dimUnit) &&
        Objects.equals(this.length, multipieceRateShopRequestMultiPieceParcelsInnerParcel.length) &&
        Objects.equals(this.width, multipieceRateShopRequestMultiPieceParcelsInnerParcel.width) &&
        Objects.equals(this.height, multipieceRateShopRequestMultiPieceParcelsInnerParcel.height);
  }

  @Override
  public int hashCode() {
    return Objects.hash(weightUnit, weight, dimUnit, length, width, height);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MultipieceRateShopRequestMultiPieceParcelsInnerParcel {\n");
    sb.append("    weightUnit: ").append(toIndentedString(weightUnit)).append("\n");
    sb.append("    weight: ").append(toIndentedString(weight)).append("\n");
    sb.append("    dimUnit: ").append(toIndentedString(dimUnit)).append("\n");
    sb.append("    length: ").append(toIndentedString(length)).append("\n");
    sb.append("    width: ").append(toIndentedString(width)).append("\n");
    sb.append("    height: ").append(toIndentedString(height)).append("\n");
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

