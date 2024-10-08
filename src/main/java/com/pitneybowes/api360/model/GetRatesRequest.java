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
import com.pitneybowes.api360.model.RateShop;
import com.pitneybowes.api360.model.RateShopFromAddress;
import com.pitneybowes.api360.model.RateShopParcel;
import com.pitneybowes.api360.model.SingleRate;
import com.pitneybowes.api360.model.SingleRateToAddress;
import com.pitneybowes.api360.model.SpecialService;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * GetRatesRequest
 */
@JsonPropertyOrder({
  GetRatesRequest.JSON_PROPERTY_DATE_OF_SHIPMENT,
  GetRatesRequest.JSON_PROPERTY_FROM_ADDRESS,
  GetRatesRequest.JSON_PROPERTY_PARCEL,
  GetRatesRequest.JSON_PROPERTY_CARRIER_ACCOUNTS,
  GetRatesRequest.JSON_PROPERTY_PARCEL_TYPE,
  GetRatesRequest.JSON_PROPERTY_PARCEL_ID,
  GetRatesRequest.JSON_PROPERTY_SERVICE_ID,
  GetRatesRequest.JSON_PROPERTY_SPECIAL_SERVICES,
  GetRatesRequest.JSON_PROPERTY_TO_ADDRESS,
  GetRatesRequest.JSON_PROPERTY_IS_HAZMAT
})
@JsonTypeName("getRates_request")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-09-30T12:57:37.504069+05:30[Asia/Kolkata]", comments = "Generator version: 7.7.0")
public class GetRatesRequest {
  public static final String JSON_PROPERTY_DATE_OF_SHIPMENT = "dateOfShipment";
  private String dateOfShipment;

  public static final String JSON_PROPERTY_FROM_ADDRESS = "fromAddress";
  private RateShopFromAddress fromAddress;

  public static final String JSON_PROPERTY_PARCEL = "parcel";
  private RateShopParcel parcel;

  public static final String JSON_PROPERTY_CARRIER_ACCOUNTS = "carrierAccounts";
  private List<String> carrierAccounts = new ArrayList<>();

  public static final String JSON_PROPERTY_PARCEL_TYPE = "parcelType";
  private String parcelType;

  public static final String JSON_PROPERTY_PARCEL_ID = "parcelId";
  private String parcelId;

  public static final String JSON_PROPERTY_SERVICE_ID = "serviceId";
  private String serviceId;

  public static final String JSON_PROPERTY_SPECIAL_SERVICES = "specialServices";
  private List<SpecialService> specialServices = new ArrayList<>();

  public static final String JSON_PROPERTY_TO_ADDRESS = "toAddress";
  private SingleRateToAddress toAddress;

  public static final String JSON_PROPERTY_IS_HAZMAT = "isHazmat";
  private Boolean isHazmat;

  public GetRatesRequest() {
  }

  public GetRatesRequest dateOfShipment(String dateOfShipment) {
    
    this.dateOfShipment = dateOfShipment;
    return this;
  }

  /**
   * This defines the date of the Shipment in the format YYYY:MM:DD.,required for future shipment rating
   * @return dateOfShipment
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DATE_OF_SHIPMENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDateOfShipment() {
    return dateOfShipment;
  }


  @JsonProperty(JSON_PROPERTY_DATE_OF_SHIPMENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDateOfShipment(String dateOfShipment) {
    this.dateOfShipment = dateOfShipment;
  }

  public GetRatesRequest fromAddress(RateShopFromAddress fromAddress) {
    
    this.fromAddress = fromAddress;
    return this;
  }

  /**
   * Get fromAddress
   * @return fromAddress
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_FROM_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public RateShopFromAddress getFromAddress() {
    return fromAddress;
  }


  @JsonProperty(JSON_PROPERTY_FROM_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setFromAddress(RateShopFromAddress fromAddress) {
    this.fromAddress = fromAddress;
  }

  public GetRatesRequest parcel(RateShopParcel parcel) {
    
    this.parcel = parcel;
    return this;
  }

  /**
   * Get parcel
   * @return parcel
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_PARCEL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public RateShopParcel getParcel() {
    return parcel;
  }


  @JsonProperty(JSON_PROPERTY_PARCEL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setParcel(RateShopParcel parcel) {
    this.parcel = parcel;
  }

  public GetRatesRequest carrierAccounts(List<String> carrierAccounts) {
    
    this.carrierAccounts = carrierAccounts;
    return this;
  }

  public GetRatesRequest addCarrierAccountsItem(String carrierAccountsItem) {
    if (this.carrierAccounts == null) {
      this.carrierAccounts = new ArrayList<>();
    }
    this.carrierAccounts.add(carrierAccountsItem);
    return this;
  }

  /**
   * This provide one or more carrier accounts Ids for rate shop. It can be referred from &#x60;Get Carrier Accounts&#x60; API
   * @return carrierAccounts
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_CARRIER_ACCOUNTS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<String> getCarrierAccounts() {
    return carrierAccounts;
  }


  @JsonProperty(JSON_PROPERTY_CARRIER_ACCOUNTS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCarrierAccounts(List<String> carrierAccounts) {
    this.carrierAccounts = carrierAccounts;
  }

  public GetRatesRequest parcelType(String parcelType) {
    
    this.parcelType = parcelType;
    return this;
  }

  /**
   * Parcel Type required for rating, it&#39;s value can be referred from response of &#x60;Get Parcel Types&#x60; API
   * @return parcelType
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_PARCEL_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getParcelType() {
    return parcelType;
  }


  @JsonProperty(JSON_PROPERTY_PARCEL_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setParcelType(String parcelType) {
    this.parcelType = parcelType;
  }

  public GetRatesRequest parcelId(String parcelId) {
    
    this.parcelId = parcelId;
    return this;
  }

  /**
   * &gt;-Parcel Id is optional and required to be given in case of branded parcels which have brandedDimension and/or brandedWeight. If parcel has brandedDimension, in that case user need not to pass dimensionUnit and dimension details(length, width and height) in the parcel object. And if brandedWeight is also available for the parcel then in that case weightUnit and weight need not to be passed  in parcel object
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

  public GetRatesRequest serviceId(String serviceId) {
    
    this.serviceId = serviceId;
    return this;
  }

  /**
   * Service to be used for rating, it can be referred from response of &#x60;Get Services&#x60; API
   * @return serviceId
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_SERVICE_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getServiceId() {
    return serviceId;
  }


  @JsonProperty(JSON_PROPERTY_SERVICE_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setServiceId(String serviceId) {
    this.serviceId = serviceId;
  }

  public GetRatesRequest specialServices(List<SpecialService> specialServices) {
    
    this.specialServices = specialServices;
    return this;
  }

  public GetRatesRequest addSpecialServicesItem(SpecialService specialServicesItem) {
    if (this.specialServices == null) {
      this.specialServices = new ArrayList<>();
    }
    this.specialServices.add(specialServicesItem);
    return this;
  }

  /**
   * Special services to be used for rating, it can be referred from response of &#x60;Get Special Services&#x60; API
   * @return specialServices
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SPECIAL_SERVICES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<SpecialService> getSpecialServices() {
    return specialServices;
  }


  @JsonProperty(JSON_PROPERTY_SPECIAL_SERVICES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSpecialServices(List<SpecialService> specialServices) {
    this.specialServices = specialServices;
  }

  public GetRatesRequest toAddress(SingleRateToAddress toAddress) {
    
    this.toAddress = toAddress;
    return this;
  }

  /**
   * Get toAddress
   * @return toAddress
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_TO_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public SingleRateToAddress getToAddress() {
    return toAddress;
  }


  @JsonProperty(JSON_PROPERTY_TO_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setToAddress(SingleRateToAddress toAddress) {
    this.toAddress = toAddress;
  }

  public GetRatesRequest isHazmat(Boolean isHazmat) {
    
    this.isHazmat = isHazmat;
    return this;
  }

  /**
   * isHazmat if set to true,only services which support Hazardous material shipment would be visible in the response
   * @return isHazmat
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IS_HAZMAT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getIsHazmat() {
    return isHazmat;
  }


  @JsonProperty(JSON_PROPERTY_IS_HAZMAT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIsHazmat(Boolean isHazmat) {
    this.isHazmat = isHazmat;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetRatesRequest getRatesRequest = (GetRatesRequest) o;
    return Objects.equals(this.dateOfShipment, getRatesRequest.dateOfShipment) &&
        Objects.equals(this.fromAddress, getRatesRequest.fromAddress) &&
        Objects.equals(this.parcel, getRatesRequest.parcel) &&
        Objects.equals(this.carrierAccounts, getRatesRequest.carrierAccounts) &&
        Objects.equals(this.parcelType, getRatesRequest.parcelType) &&
        Objects.equals(this.parcelId, getRatesRequest.parcelId) &&
        Objects.equals(this.serviceId, getRatesRequest.serviceId) &&
        Objects.equals(this.specialServices, getRatesRequest.specialServices) &&
        Objects.equals(this.toAddress, getRatesRequest.toAddress) &&
        Objects.equals(this.isHazmat, getRatesRequest.isHazmat);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dateOfShipment, fromAddress, parcel, carrierAccounts, parcelType, parcelId, serviceId, specialServices, toAddress, isHazmat);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetRatesRequest {\n");
    sb.append("    dateOfShipment: ").append(toIndentedString(dateOfShipment)).append("\n");
    sb.append("    fromAddress: ").append(toIndentedString(fromAddress)).append("\n");
    sb.append("    parcel: ").append(toIndentedString(parcel)).append("\n");
    sb.append("    carrierAccounts: ").append(toIndentedString(carrierAccounts)).append("\n");
    sb.append("    parcelType: ").append(toIndentedString(parcelType)).append("\n");
    sb.append("    parcelId: ").append(toIndentedString(parcelId)).append("\n");
    sb.append("    serviceId: ").append(toIndentedString(serviceId)).append("\n");
    sb.append("    specialServices: ").append(toIndentedString(specialServices)).append("\n");
    sb.append("    toAddress: ").append(toIndentedString(toAddress)).append("\n");
    sb.append("    isHazmat: ").append(toIndentedString(isHazmat)).append("\n");
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

