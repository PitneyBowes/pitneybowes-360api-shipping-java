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
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * description
 */
@JsonPropertyOrder({
  MultipieceRatesRequestFromAddress.JSON_PROPERTY_ADDRESS_LINE1,
  MultipieceRatesRequestFromAddress.JSON_PROPERTY_CITY_TOWN,
  MultipieceRatesRequestFromAddress.JSON_PROPERTY_STATE_PROVINCE,
  MultipieceRatesRequestFromAddress.JSON_PROPERTY_POSTAL_CODE,
  MultipieceRatesRequestFromAddress.JSON_PROPERTY_COUNTRY_CODE,
  MultipieceRatesRequestFromAddress.JSON_PROPERTY_COMPANY,
  MultipieceRatesRequestFromAddress.JSON_PROPERTY_NAME,
  MultipieceRatesRequestFromAddress.JSON_PROPERTY_PHONE,
  MultipieceRatesRequestFromAddress.JSON_PROPERTY_EMAIL,
  MultipieceRatesRequestFromAddress.JSON_PROPERTY_RESIDENTIAL
})
@JsonTypeName("MultipieceRatesRequest_fromAddress")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-09-30T12:57:37.504069+05:30[Asia/Kolkata]", comments = "Generator version: 7.7.0")
public class MultipieceRatesRequestFromAddress {
  public static final String JSON_PROPERTY_ADDRESS_LINE1 = "addressLine1";
  private String addressLine1;

  public static final String JSON_PROPERTY_CITY_TOWN = "cityTown";
  private String cityTown;

  public static final String JSON_PROPERTY_STATE_PROVINCE = "stateProvince";
  private String stateProvince;

  public static final String JSON_PROPERTY_POSTAL_CODE = "postalCode";
  private String postalCode;

  public static final String JSON_PROPERTY_COUNTRY_CODE = "countryCode";
  private String countryCode;

  public static final String JSON_PROPERTY_COMPANY = "company";
  private String company;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_PHONE = "phone";
  private String phone;

  public static final String JSON_PROPERTY_EMAIL = "email";
  private String email;

  public static final String JSON_PROPERTY_RESIDENTIAL = "residential";
  private Boolean residential;

  public MultipieceRatesRequestFromAddress() {
  }

  public MultipieceRatesRequestFromAddress addressLine1(String addressLine1) {
    
    this.addressLine1 = addressLine1;
    return this;
  }

  /**
   * description
   * @return addressLine1
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ADDRESS_LINE1)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAddressLine1() {
    return addressLine1;
  }


  @JsonProperty(JSON_PROPERTY_ADDRESS_LINE1)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAddressLine1(String addressLine1) {
    this.addressLine1 = addressLine1;
  }

  public MultipieceRatesRequestFromAddress cityTown(String cityTown) {
    
    this.cityTown = cityTown;
    return this;
  }

  /**
   * description
   * @return cityTown
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CITY_TOWN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCityTown() {
    return cityTown;
  }


  @JsonProperty(JSON_PROPERTY_CITY_TOWN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCityTown(String cityTown) {
    this.cityTown = cityTown;
  }

  public MultipieceRatesRequestFromAddress stateProvince(String stateProvince) {
    
    this.stateProvince = stateProvince;
    return this;
  }

  /**
   * description
   * @return stateProvince
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_STATE_PROVINCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getStateProvince() {
    return stateProvince;
  }


  @JsonProperty(JSON_PROPERTY_STATE_PROVINCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStateProvince(String stateProvince) {
    this.stateProvince = stateProvince;
  }

  public MultipieceRatesRequestFromAddress postalCode(String postalCode) {
    
    this.postalCode = postalCode;
    return this;
  }

  /**
   * description
   * @return postalCode
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_POSTAL_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPostalCode() {
    return postalCode;
  }


  @JsonProperty(JSON_PROPERTY_POSTAL_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPostalCode(String postalCode) {
    this.postalCode = postalCode;
  }

  public MultipieceRatesRequestFromAddress countryCode(String countryCode) {
    
    this.countryCode = countryCode;
    return this;
  }

  /**
   * description
   * @return countryCode
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_COUNTRY_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCountryCode() {
    return countryCode;
  }


  @JsonProperty(JSON_PROPERTY_COUNTRY_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCountryCode(String countryCode) {
    this.countryCode = countryCode;
  }

  public MultipieceRatesRequestFromAddress company(String company) {
    
    this.company = company;
    return this;
  }

  /**
   * description
   * @return company
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_COMPANY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCompany() {
    return company;
  }


  @JsonProperty(JSON_PROPERTY_COMPANY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCompany(String company) {
    this.company = company;
  }

  public MultipieceRatesRequestFromAddress name(String name) {
    
    this.name = name;
    return this;
  }

  /**
   * description
   * @return name
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getName() {
    return name;
  }


  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setName(String name) {
    this.name = name;
  }

  public MultipieceRatesRequestFromAddress phone(String phone) {
    
    this.phone = phone;
    return this;
  }

  /**
   * description
   * @return phone
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PHONE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPhone() {
    return phone;
  }


  @JsonProperty(JSON_PROPERTY_PHONE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPhone(String phone) {
    this.phone = phone;
  }

  public MultipieceRatesRequestFromAddress email(String email) {
    
    this.email = email;
    return this;
  }

  /**
   * description
   * @return email
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EMAIL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getEmail() {
    return email;
  }


  @JsonProperty(JSON_PROPERTY_EMAIL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEmail(String email) {
    this.email = email;
  }

  public MultipieceRatesRequestFromAddress residential(Boolean residential) {
    
    this.residential = residential;
    return this;
  }

  /**
   * description
   * @return residential
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RESIDENTIAL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getResidential() {
    return residential;
  }


  @JsonProperty(JSON_PROPERTY_RESIDENTIAL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setResidential(Boolean residential) {
    this.residential = residential;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MultipieceRatesRequestFromAddress multipieceRatesRequestFromAddress = (MultipieceRatesRequestFromAddress) o;
    return Objects.equals(this.addressLine1, multipieceRatesRequestFromAddress.addressLine1) &&
        Objects.equals(this.cityTown, multipieceRatesRequestFromAddress.cityTown) &&
        Objects.equals(this.stateProvince, multipieceRatesRequestFromAddress.stateProvince) &&
        Objects.equals(this.postalCode, multipieceRatesRequestFromAddress.postalCode) &&
        Objects.equals(this.countryCode, multipieceRatesRequestFromAddress.countryCode) &&
        Objects.equals(this.company, multipieceRatesRequestFromAddress.company) &&
        Objects.equals(this.name, multipieceRatesRequestFromAddress.name) &&
        Objects.equals(this.phone, multipieceRatesRequestFromAddress.phone) &&
        Objects.equals(this.email, multipieceRatesRequestFromAddress.email) &&
        Objects.equals(this.residential, multipieceRatesRequestFromAddress.residential);
  }

  @Override
  public int hashCode() {
    return Objects.hash(addressLine1, cityTown, stateProvince, postalCode, countryCode, company, name, phone, email, residential);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MultipieceRatesRequestFromAddress {\n");
    sb.append("    addressLine1: ").append(toIndentedString(addressLine1)).append("\n");
    sb.append("    cityTown: ").append(toIndentedString(cityTown)).append("\n");
    sb.append("    stateProvince: ").append(toIndentedString(stateProvince)).append("\n");
    sb.append("    postalCode: ").append(toIndentedString(postalCode)).append("\n");
    sb.append("    countryCode: ").append(toIndentedString(countryCode)).append("\n");
    sb.append("    company: ").append(toIndentedString(company)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    residential: ").append(toIndentedString(residential)).append("\n");
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

