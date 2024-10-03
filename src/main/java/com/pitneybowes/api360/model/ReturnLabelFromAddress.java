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
 * ReturnLabelFromAddress
 */
@JsonPropertyOrder({
  ReturnLabelFromAddress.JSON_PROPERTY_ADDRESS_LINE1,
  ReturnLabelFromAddress.JSON_PROPERTY_EMAIL,
  ReturnLabelFromAddress.JSON_PROPERTY_CITY_TOWN,
  ReturnLabelFromAddress.JSON_PROPERTY_COUNTRY_CODE,
  ReturnLabelFromAddress.JSON_PROPERTY_NAME,
  ReturnLabelFromAddress.JSON_PROPERTY_PHONE,
  ReturnLabelFromAddress.JSON_PROPERTY_POSTAL_CODE,
  ReturnLabelFromAddress.JSON_PROPERTY_STATE_PROVINCE
})
@JsonTypeName("returnLabel_fromAddress")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-09-30T12:57:37.504069+05:30[Asia/Kolkata]", comments = "Generator version: 7.7.0")
public class ReturnLabelFromAddress {
  public static final String JSON_PROPERTY_ADDRESS_LINE1 = "addressLine1";
  private String addressLine1;

  public static final String JSON_PROPERTY_EMAIL = "email";
  private String email;

  public static final String JSON_PROPERTY_CITY_TOWN = "cityTown";
  private String cityTown;

  public static final String JSON_PROPERTY_COUNTRY_CODE = "countryCode";
  private String countryCode;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_PHONE = "phone";
  private String phone;

  public static final String JSON_PROPERTY_POSTAL_CODE = "postalCode";
  private String postalCode;

  public static final String JSON_PROPERTY_STATE_PROVINCE = "stateProvince";
  private String stateProvince;

  public ReturnLabelFromAddress() {
  }

  public ReturnLabelFromAddress addressLine1(String addressLine1) {
    
    this.addressLine1 = addressLine1;
    return this;
  }

  /**
   * The addressLine1 can contain the Flat number, Building or Apartment Name/number (if any) or company name (if not residential).
   * @return addressLine1
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_ADDRESS_LINE1)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getAddressLine1() {
    return addressLine1;
  }


  @JsonProperty(JSON_PROPERTY_ADDRESS_LINE1)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setAddressLine1(String addressLine1) {
    this.addressLine1 = addressLine1;
  }

  public ReturnLabelFromAddress email(String email) {
    
    this.email = email;
    return this;
  }

  /**
   * email id 
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

  public ReturnLabelFromAddress cityTown(String cityTown) {
    
    this.cityTown = cityTown;
    return this;
  }

  /**
   * The name of the city or town to where the address belongs.
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

  public ReturnLabelFromAddress countryCode(String countryCode) {
    
    this.countryCode = countryCode;
    return this;
  }

  /**
   * This indicates the two-character ISO code of the source country from the ISO country list.
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

  public ReturnLabelFromAddress name(String name) {
    
    this.name = name;
    return this;
  }

  /**
   * Name of the sender to which this address points.
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

  public ReturnLabelFromAddress phone(String phone) {
    
    this.phone = phone;
    return this;
  }

  /**
   * This is sender&#39;s phone number. Enter the digits with or without spaces or hyphens. The maximum characters for Phone number is 10 digits. 
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

  public ReturnLabelFromAddress postalCode(String postalCode) {
    
    this.postalCode = postalCode;
    return this;
  }

  /**
   * The postal code or ZIP code of the address. For US addresses, use either the 5-digit or 9-digit ZIP code in one of the following formats: &#39;12345&#39; or &#39;12345-6789&#39;. If you use a different format, such as 12345- or 123451234, will receive an error.
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

  public ReturnLabelFromAddress stateProvince(String stateProvince) {
    
    this.stateProvince = stateProvince;
    return this;
  }

  /**
   * The State or Province of the address. For a US or Canadian address, it is the 2-letter state or province code. 
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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReturnLabelFromAddress returnLabelFromAddress = (ReturnLabelFromAddress) o;
    return Objects.equals(this.addressLine1, returnLabelFromAddress.addressLine1) &&
        Objects.equals(this.email, returnLabelFromAddress.email) &&
        Objects.equals(this.cityTown, returnLabelFromAddress.cityTown) &&
        Objects.equals(this.countryCode, returnLabelFromAddress.countryCode) &&
        Objects.equals(this.name, returnLabelFromAddress.name) &&
        Objects.equals(this.phone, returnLabelFromAddress.phone) &&
        Objects.equals(this.postalCode, returnLabelFromAddress.postalCode) &&
        Objects.equals(this.stateProvince, returnLabelFromAddress.stateProvince);
  }

  @Override
  public int hashCode() {
    return Objects.hash(addressLine1, email, cityTown, countryCode, name, phone, postalCode, stateProvince);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReturnLabelFromAddress {\n");
    sb.append("    addressLine1: ").append(toIndentedString(addressLine1)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    cityTown: ").append(toIndentedString(cityTown)).append("\n");
    sb.append("    countryCode: ").append(toIndentedString(countryCode)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
    sb.append("    postalCode: ").append(toIndentedString(postalCode)).append("\n");
    sb.append("    stateProvince: ").append(toIndentedString(stateProvince)).append("\n");
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

