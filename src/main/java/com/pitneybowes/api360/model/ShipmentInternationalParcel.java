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
 * ShipmentInternationalParcel
 */
@JsonPropertyOrder({
  ShipmentInternationalParcel.JSON_PROPERTY_HEIGHT,
  ShipmentInternationalParcel.JSON_PROPERTY_LENGTH,
  ShipmentInternationalParcel.JSON_PROPERTY_WIDTH,
  ShipmentInternationalParcel.JSON_PROPERTY_DIM_UNIT,
  ShipmentInternationalParcel.JSON_PROPERTY_WEIGHT_UNIT,
  ShipmentInternationalParcel.JSON_PROPERTY_WEIGHT
})
@JsonTypeName("ShipmentInternational_parcel")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-09-30T12:57:37.504069+05:30[Asia/Kolkata]", comments = "Generator version: 7.7.0")
public class ShipmentInternationalParcel {
  public static final String JSON_PROPERTY_HEIGHT = "height";
  private BigDecimal height;

  public static final String JSON_PROPERTY_LENGTH = "length";
  private BigDecimal length;

  public static final String JSON_PROPERTY_WIDTH = "width";
  private BigDecimal width;

  /**
   * Gets or Sets dimUnit
   */
  public enum DimUnitEnum {
    IN("IN");

    private String value;

    DimUnitEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static DimUnitEnum fromValue(String value) {
      for (DimUnitEnum b : DimUnitEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_DIM_UNIT = "dimUnit";
  private DimUnitEnum dimUnit;

  /**
   * Gets or Sets weightUnit
   */
  public enum WeightUnitEnum {
    OZ("OZ");

    private String value;

    WeightUnitEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static WeightUnitEnum fromValue(String value) {
      for (WeightUnitEnum b : WeightUnitEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_WEIGHT_UNIT = "weightUnit";
  private WeightUnitEnum weightUnit;

  public static final String JSON_PROPERTY_WEIGHT = "weight";
  private BigDecimal weight;

  public ShipmentInternationalParcel() {
  }

  public ShipmentInternationalParcel height(BigDecimal height) {
    
    this.height = height;
    return this;
  }

  /**
   * Get height
   * @return height
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_HEIGHT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public BigDecimal getHeight() {
    return height;
  }


  @JsonProperty(JSON_PROPERTY_HEIGHT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setHeight(BigDecimal height) {
    this.height = height;
  }

  public ShipmentInternationalParcel length(BigDecimal length) {
    
    this.length = length;
    return this;
  }

  /**
   * Get length
   * @return length
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_LENGTH)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public BigDecimal getLength() {
    return length;
  }


  @JsonProperty(JSON_PROPERTY_LENGTH)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setLength(BigDecimal length) {
    this.length = length;
  }

  public ShipmentInternationalParcel width(BigDecimal width) {
    
    this.width = width;
    return this;
  }

  /**
   * Get width
   * @return width
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_WIDTH)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public BigDecimal getWidth() {
    return width;
  }


  @JsonProperty(JSON_PROPERTY_WIDTH)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setWidth(BigDecimal width) {
    this.width = width;
  }

  public ShipmentInternationalParcel dimUnit(DimUnitEnum dimUnit) {
    
    this.dimUnit = dimUnit;
    return this;
  }

  /**
   * Get dimUnit
   * @return dimUnit
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_DIM_UNIT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public DimUnitEnum getDimUnit() {
    return dimUnit;
  }


  @JsonProperty(JSON_PROPERTY_DIM_UNIT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setDimUnit(DimUnitEnum dimUnit) {
    this.dimUnit = dimUnit;
  }

  public ShipmentInternationalParcel weightUnit(WeightUnitEnum weightUnit) {
    
    this.weightUnit = weightUnit;
    return this;
  }

  /**
   * Get weightUnit
   * @return weightUnit
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_WEIGHT_UNIT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public WeightUnitEnum getWeightUnit() {
    return weightUnit;
  }


  @JsonProperty(JSON_PROPERTY_WEIGHT_UNIT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setWeightUnit(WeightUnitEnum weightUnit) {
    this.weightUnit = weightUnit;
  }

  public ShipmentInternationalParcel weight(BigDecimal weight) {
    
    this.weight = weight;
    return this;
  }

  /**
   * Get weight
   * @return weight
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_WEIGHT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public BigDecimal getWeight() {
    return weight;
  }


  @JsonProperty(JSON_PROPERTY_WEIGHT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setWeight(BigDecimal weight) {
    this.weight = weight;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ShipmentInternationalParcel shipmentInternationalParcel = (ShipmentInternationalParcel) o;
    return Objects.equals(this.height, shipmentInternationalParcel.height) &&
        Objects.equals(this.length, shipmentInternationalParcel.length) &&
        Objects.equals(this.width, shipmentInternationalParcel.width) &&
        Objects.equals(this.dimUnit, shipmentInternationalParcel.dimUnit) &&
        Objects.equals(this.weightUnit, shipmentInternationalParcel.weightUnit) &&
        Objects.equals(this.weight, shipmentInternationalParcel.weight);
  }

  @Override
  public int hashCode() {
    return Objects.hash(height, length, width, dimUnit, weightUnit, weight);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ShipmentInternationalParcel {\n");
    sb.append("    height: ").append(toIndentedString(height)).append("\n");
    sb.append("    length: ").append(toIndentedString(length)).append("\n");
    sb.append("    width: ").append(toIndentedString(width)).append("\n");
    sb.append("    dimUnit: ").append(toIndentedString(dimUnit)).append("\n");
    sb.append("    weightUnit: ").append(toIndentedString(weightUnit)).append("\n");
    sb.append("    weight: ").append(toIndentedString(weight)).append("\n");
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

