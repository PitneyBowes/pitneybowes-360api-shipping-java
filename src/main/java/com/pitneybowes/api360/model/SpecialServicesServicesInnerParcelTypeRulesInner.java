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
import com.pitneybowes.api360.model.SpecialServicesServicesInnerParcelTypeRulesInnerSpecialServiceRulesInner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * SpecialServicesServicesInnerParcelTypeRulesInner
 */
@JsonPropertyOrder({
  SpecialServicesServicesInnerParcelTypeRulesInner.JSON_PROPERTY_BRANDED_NAME,
  SpecialServicesServicesInnerParcelTypeRulesInner.JSON_PROPERTY_PARCEL_TYPE,
  SpecialServicesServicesInnerParcelTypeRulesInner.JSON_PROPERTY_TRACKABLE,
  SpecialServicesServicesInnerParcelTypeRulesInner.JSON_PROPERTY_SUGGESTED_TRACKABLE_SPECIAL_SERVICE,
  SpecialServicesServicesInnerParcelTypeRulesInner.JSON_PROPERTY_SPECIAL_SERVICE_RULES
})
@JsonTypeName("specialServices_services_inner_parcelTypeRules_inner")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-09-30T12:57:37.504069+05:30[Asia/Kolkata]", comments = "Generator version: 7.7.0")
public class SpecialServicesServicesInnerParcelTypeRulesInner {
  public static final String JSON_PROPERTY_BRANDED_NAME = "brandedName";
  private String brandedName;

  public static final String JSON_PROPERTY_PARCEL_TYPE = "parcelType";
  private String parcelType;

  public static final String JSON_PROPERTY_TRACKABLE = "trackable";
  private String trackable;

  public static final String JSON_PROPERTY_SUGGESTED_TRACKABLE_SPECIAL_SERVICE = "suggestedTrackableSpecialService";
  private String suggestedTrackableSpecialService;

  public static final String JSON_PROPERTY_SPECIAL_SERVICE_RULES = "specialServiceRules";
  private List<SpecialServicesServicesInnerParcelTypeRulesInnerSpecialServiceRulesInner> specialServiceRules = new ArrayList<>();

  public SpecialServicesServicesInnerParcelTypeRulesInner() {
  }

  public SpecialServicesServicesInnerParcelTypeRulesInner brandedName(String brandedName) {
    
    this.brandedName = brandedName;
    return this;
  }

  /**
   * The branded name of Parcel Type
   * @return brandedName
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_BRANDED_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getBrandedName() {
    return brandedName;
  }


  @JsonProperty(JSON_PROPERTY_BRANDED_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBrandedName(String brandedName) {
    this.brandedName = brandedName;
  }

  public SpecialServicesServicesInnerParcelTypeRulesInner parcelType(String parcelType) {
    
    this.parcelType = parcelType;
    return this;
  }

  /**
   * Parcel Type is required for creating a shipment while rating a parcel, which varies as per Carrier selection. Here, it reflects as per the defined ParcelType Rules. ParcelType have categories like Package, Envelopes, Paks, Boxes, Tube, etc. 
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

  public SpecialServicesServicesInnerParcelTypeRulesInner trackable(String trackable) {
    
    this.trackable = trackable;
    return this;
  }

  /**
   * Whether this parcel type is trackable. Valid Values are: TRACKABLE, NON_TRACKABLE, REQUIRES_TRACKABLE_SPECIAL_SERVICE
   * @return trackable
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TRACKABLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTrackable() {
    return trackable;
  }


  @JsonProperty(JSON_PROPERTY_TRACKABLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTrackable(String trackable) {
    this.trackable = trackable;
  }

  public SpecialServicesServicesInnerParcelTypeRulesInner suggestedTrackableSpecialService(String suggestedTrackableSpecialService) {
    
    this.suggestedTrackableSpecialService = suggestedTrackableSpecialService;
    return this;
  }

  /**
   * If trackable is set to REQUIRES_TRACKABLE_SPECIAL_SERVICE, this is a free or low-cost special service that allows the shipper to track the shipment.
   * @return suggestedTrackableSpecialService
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SUGGESTED_TRACKABLE_SPECIAL_SERVICE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getSuggestedTrackableSpecialService() {
    return suggestedTrackableSpecialService;
  }


  @JsonProperty(JSON_PROPERTY_SUGGESTED_TRACKABLE_SPECIAL_SERVICE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSuggestedTrackableSpecialService(String suggestedTrackableSpecialService) {
    this.suggestedTrackableSpecialService = suggestedTrackableSpecialService;
  }

  public SpecialServicesServicesInnerParcelTypeRulesInner specialServiceRules(List<SpecialServicesServicesInnerParcelTypeRulesInnerSpecialServiceRulesInner> specialServiceRules) {
    
    this.specialServiceRules = specialServiceRules;
    return this;
  }

  public SpecialServicesServicesInnerParcelTypeRulesInner addSpecialServiceRulesItem(SpecialServicesServicesInnerParcelTypeRulesInnerSpecialServiceRulesInner specialServiceRulesItem) {
    if (this.specialServiceRules == null) {
      this.specialServiceRules = new ArrayList<>();
    }
    this.specialServiceRules.add(specialServiceRulesItem);
    return this;
  }

  /**
   * It displays all the available special services, their details and prerequisites and/or incompatible details with other special services
   * @return specialServiceRules
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SPECIAL_SERVICE_RULES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<SpecialServicesServicesInnerParcelTypeRulesInnerSpecialServiceRulesInner> getSpecialServiceRules() {
    return specialServiceRules;
  }


  @JsonProperty(JSON_PROPERTY_SPECIAL_SERVICE_RULES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSpecialServiceRules(List<SpecialServicesServicesInnerParcelTypeRulesInnerSpecialServiceRulesInner> specialServiceRules) {
    this.specialServiceRules = specialServiceRules;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SpecialServicesServicesInnerParcelTypeRulesInner specialServicesServicesInnerParcelTypeRulesInner = (SpecialServicesServicesInnerParcelTypeRulesInner) o;
    return Objects.equals(this.brandedName, specialServicesServicesInnerParcelTypeRulesInner.brandedName) &&
        Objects.equals(this.parcelType, specialServicesServicesInnerParcelTypeRulesInner.parcelType) &&
        Objects.equals(this.trackable, specialServicesServicesInnerParcelTypeRulesInner.trackable) &&
        Objects.equals(this.suggestedTrackableSpecialService, specialServicesServicesInnerParcelTypeRulesInner.suggestedTrackableSpecialService) &&
        Objects.equals(this.specialServiceRules, specialServicesServicesInnerParcelTypeRulesInner.specialServiceRules);
  }

  @Override
  public int hashCode() {
    return Objects.hash(brandedName, parcelType, trackable, suggestedTrackableSpecialService, specialServiceRules);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SpecialServicesServicesInnerParcelTypeRulesInner {\n");
    sb.append("    brandedName: ").append(toIndentedString(brandedName)).append("\n");
    sb.append("    parcelType: ").append(toIndentedString(parcelType)).append("\n");
    sb.append("    trackable: ").append(toIndentedString(trackable)).append("\n");
    sb.append("    suggestedTrackableSpecialService: ").append(toIndentedString(suggestedTrackableSpecialService)).append("\n");
    sb.append("    specialServiceRules: ").append(toIndentedString(specialServiceRules)).append("\n");
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

