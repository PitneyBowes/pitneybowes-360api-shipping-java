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
 * SchedulePickupUPSResponsePickupSummaryInner
 */
@JsonPropertyOrder({
  SchedulePickupUPSResponsePickupSummaryInner.JSON_PROPERTY_SERVICE_ID,
  SchedulePickupUPSResponsePickupSummaryInner.JSON_PROPERTY_PACKAGE_COUNT,
  SchedulePickupUPSResponsePickupSummaryInner.JSON_PROPERTY_TOTAL_WEIGHT,
  SchedulePickupUPSResponsePickupSummaryInner.JSON_PROPERTY_WEIGHT_UNIT,
  SchedulePickupUPSResponsePickupSummaryInner.JSON_PROPERTY_PARCEL_TYPE,
  SchedulePickupUPSResponsePickupSummaryInner.JSON_PROPERTY_TO_ADDRESS_COUNTRY_CODE
})
@JsonTypeName("schedulePickupUPSResponse_pickupSummary_inner")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-09-30T12:57:37.504069+05:30[Asia/Kolkata]", comments = "Generator version: 7.7.0")
public class SchedulePickupUPSResponsePickupSummaryInner {
  public static final String JSON_PROPERTY_SERVICE_ID = "serviceId";
  private String serviceId;

  public static final String JSON_PROPERTY_PACKAGE_COUNT = "packageCount";
  private BigDecimal packageCount;

  public static final String JSON_PROPERTY_TOTAL_WEIGHT = "totalWeight";
  private BigDecimal totalWeight;

  public static final String JSON_PROPERTY_WEIGHT_UNIT = "weightUnit";
  private String weightUnit;

  public static final String JSON_PROPERTY_PARCEL_TYPE = "parcelType";
  private String parcelType;

  public static final String JSON_PROPERTY_TO_ADDRESS_COUNTRY_CODE = "toAddressCountryCode";
  private String toAddressCountryCode;

  public SchedulePickupUPSResponsePickupSummaryInner() {
  }

  public SchedulePickupUPSResponsePickupSummaryInner serviceId(String serviceId) {
    
    this.serviceId = serviceId;
    return this;
  }

  /**
   * The service id
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

  public SchedulePickupUPSResponsePickupSummaryInner packageCount(BigDecimal packageCount) {
    
    this.packageCount = packageCount;
    return this;
  }

  /**
   * The total number of packages
   * @return packageCount
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PACKAGE_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getPackageCount() {
    return packageCount;
  }


  @JsonProperty(JSON_PROPERTY_PACKAGE_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPackageCount(BigDecimal packageCount) {
    this.packageCount = packageCount;
  }

  public SchedulePickupUPSResponsePickupSummaryInner totalWeight(BigDecimal totalWeight) {
    
    this.totalWeight = totalWeight;
    return this;
  }

  /**
   * The total weight of the packages
   * @return totalWeight
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TOTAL_WEIGHT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getTotalWeight() {
    return totalWeight;
  }


  @JsonProperty(JSON_PROPERTY_TOTAL_WEIGHT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTotalWeight(BigDecimal totalWeight) {
    this.totalWeight = totalWeight;
  }

  public SchedulePickupUPSResponsePickupSummaryInner weightUnit(String weightUnit) {
    
    this.weightUnit = weightUnit;
    return this;
  }

  /**
   * Weight Unit, supported values are &#x60;OZ&#x60; and &#x60;GM&#x60;
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

  public SchedulePickupUPSResponsePickupSummaryInner parcelType(String parcelType) {
    
    this.parcelType = parcelType;
    return this;
  }

  /**
   * It indicates the parcel type, applicable values are- &#x60;PKG&#x60;,&#x60;LTR&#x60;,&#x60;TUBE&#x60;,&#x60;PACK&#x60;,&#x60;BOX&#x60;,&#x60;25KG&#x60;,&#x60;10KG&#x60;,&#x60;SMALL_EXP_BOX&#x60;,&#x60;MED_EXP_BOX&#x60;,&#x60;LG_EXP_BOX&#x60;
   * @return parcelType
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PARCEL_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getParcelType() {
    return parcelType;
  }


  @JsonProperty(JSON_PROPERTY_PARCEL_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setParcelType(String parcelType) {
    this.parcelType = parcelType;
  }

  public SchedulePickupUPSResponsePickupSummaryInner toAddressCountryCode(String toAddressCountryCode) {
    
    this.toAddressCountryCode = toAddressCountryCode;
    return this;
  }

  /**
   * It indicates the 2 characters- ISO country code of recipient of the shipment.
   * @return toAddressCountryCode
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TO_ADDRESS_COUNTRY_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getToAddressCountryCode() {
    return toAddressCountryCode;
  }


  @JsonProperty(JSON_PROPERTY_TO_ADDRESS_COUNTRY_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setToAddressCountryCode(String toAddressCountryCode) {
    this.toAddressCountryCode = toAddressCountryCode;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SchedulePickupUPSResponsePickupSummaryInner schedulePickupUPSResponsePickupSummaryInner = (SchedulePickupUPSResponsePickupSummaryInner) o;
    return Objects.equals(this.serviceId, schedulePickupUPSResponsePickupSummaryInner.serviceId) &&
        Objects.equals(this.packageCount, schedulePickupUPSResponsePickupSummaryInner.packageCount) &&
        Objects.equals(this.totalWeight, schedulePickupUPSResponsePickupSummaryInner.totalWeight) &&
        Objects.equals(this.weightUnit, schedulePickupUPSResponsePickupSummaryInner.weightUnit) &&
        Objects.equals(this.parcelType, schedulePickupUPSResponsePickupSummaryInner.parcelType) &&
        Objects.equals(this.toAddressCountryCode, schedulePickupUPSResponsePickupSummaryInner.toAddressCountryCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(serviceId, packageCount, totalWeight, weightUnit, parcelType, toAddressCountryCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SchedulePickupUPSResponsePickupSummaryInner {\n");
    sb.append("    serviceId: ").append(toIndentedString(serviceId)).append("\n");
    sb.append("    packageCount: ").append(toIndentedString(packageCount)).append("\n");
    sb.append("    totalWeight: ").append(toIndentedString(totalWeight)).append("\n");
    sb.append("    weightUnit: ").append(toIndentedString(weightUnit)).append("\n");
    sb.append("    parcelType: ").append(toIndentedString(parcelType)).append("\n");
    sb.append("    toAddressCountryCode: ").append(toIndentedString(toAddressCountryCode)).append("\n");
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

