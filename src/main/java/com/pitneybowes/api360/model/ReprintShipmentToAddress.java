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
 * ReprintShipmentToAddress
 */
@JsonPropertyOrder({
  ReprintShipmentToAddress.JSON_PROPERTY_ADDRESS_LINE1,
  ReprintShipmentToAddress.JSON_PROPERTY_ADDRESS_LINE2,
  ReprintShipmentToAddress.JSON_PROPERTY_ADDRESS_LINE3,
  ReprintShipmentToAddress.JSON_PROPERTY_CITY_TOWN,
  ReprintShipmentToAddress.JSON_PROPERTY_COMPANY,
  ReprintShipmentToAddress.JSON_PROPERTY_COUNTRY_CODE,
  ReprintShipmentToAddress.JSON_PROPERTY_EMAIL,
  ReprintShipmentToAddress.JSON_PROPERTY_NAME,
  ReprintShipmentToAddress.JSON_PROPERTY_PHONE,
  ReprintShipmentToAddress.JSON_PROPERTY_POSTAL_CODE,
  ReprintShipmentToAddress.JSON_PROPERTY_RESIDENTIAL,
  ReprintShipmentToAddress.JSON_PROPERTY_STATE_PROVINCE
})
@JsonTypeName("reprintShipment_toAddress")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-09-30T12:57:37.504069+05:30[Asia/Kolkata]", comments = "Generator version: 7.7.0")
public class ReprintShipmentToAddress {
  public static final String JSON_PROPERTY_ADDRESS_LINE1 = "addressLine1";
  private String addressLine1;

  public static final String JSON_PROPERTY_ADDRESS_LINE2 = "addressLine2";
  private String addressLine2;

  public static final String JSON_PROPERTY_ADDRESS_LINE3 = "addressLine3";
  private String addressLine3;

  public static final String JSON_PROPERTY_CITY_TOWN = "cityTown";
  private String cityTown;

  public static final String JSON_PROPERTY_COMPANY = "company";
  private String company;

  public static final String JSON_PROPERTY_COUNTRY_CODE = "countryCode";
  private String countryCode;

  public static final String JSON_PROPERTY_EMAIL = "email";
  private String email;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_PHONE = "phone";
  private String phone;

  public static final String JSON_PROPERTY_POSTAL_CODE = "postalCode";
  private String postalCode;

  public static final String JSON_PROPERTY_RESIDENTIAL = "residential";
  private Boolean residential;

  public static final String JSON_PROPERTY_STATE_PROVINCE = "stateProvince";
  private String stateProvince;

  public ReprintShipmentToAddress() {
  }

  public ReprintShipmentToAddress addressLine1(String addressLine1) {
    
    this.addressLine1 = addressLine1;
    return this;
  }

  /**
   * The addressLine1 can contain the Flat number, Building or Apartment Name/number (if any) or company name (if not residential).
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

  public ReprintShipmentToAddress addressLine2(String addressLine2) {
    
    this.addressLine2 = addressLine2;
    return this;
  }

  /**
   * The addressLine2 contains Street address or Landmark (if any).
   * @return addressLine2
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ADDRESS_LINE2)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAddressLine2() {
    return addressLine2;
  }


  @JsonProperty(JSON_PROPERTY_ADDRESS_LINE2)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAddressLine2(String addressLine2) {
    this.addressLine2 = addressLine2;
  }

  public ReprintShipmentToAddress addressLine3(String addressLine3) {
    
    this.addressLine3 = addressLine3;
    return this;
  }

  /**
   * The addressLine3 contains P.O.Box (if any) near the address.
   * @return addressLine3
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ADDRESS_LINE3)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAddressLine3() {
    return addressLine3;
  }


  @JsonProperty(JSON_PROPERTY_ADDRESS_LINE3)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAddressLine3(String addressLine3) {
    this.addressLine3 = addressLine3;
  }

  public ReprintShipmentToAddress cityTown(String cityTown) {
    
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

  public ReprintShipmentToAddress company(String company) {
    
    this.company = company;
    return this;
  }

  /**
   * This indicates the name of the company, in case if the Recipient address is not residential.
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

  public ReprintShipmentToAddress countryCode(String countryCode) {
    
    this.countryCode = countryCode;
    return this;
  }

  /**
   * This indicates the two-character ISO code of the destination country from the ISO country list.
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

  public ReprintShipmentToAddress email(String email) {
    
    this.email = email;
    return this;
  }

  /**
   * The email address of the recipient. It can be person&#39;s email address or company email address (for non-residential).
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

  public ReprintShipmentToAddress name(String name) {
    
    this.name = name;
    return this;
  }

  /**
   * Name of the recipient to which this address points.
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

  public ReprintShipmentToAddress phone(String phone) {
    
    this.phone = phone;
    return this;
  }

  /**
   * This is recipient&#39;s phone number. Enter the digits with or without spaces or hyphens. The maximum characters for Phone number is 10 digits. 
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

  public ReprintShipmentToAddress postalCode(String postalCode) {
    
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

  public ReprintShipmentToAddress residential(Boolean residential) {
    
    this.residential = residential;
    return this;
  }

  /**
   * The specified adress can be Residential or Official. In case if the adress is Residential, the boolean value will be &#39;true&#39;, else it will take &#39;false&#39;.
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

  public ReprintShipmentToAddress stateProvince(String stateProvince) {
    
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
    ReprintShipmentToAddress reprintShipmentToAddress = (ReprintShipmentToAddress) o;
    return Objects.equals(this.addressLine1, reprintShipmentToAddress.addressLine1) &&
        Objects.equals(this.addressLine2, reprintShipmentToAddress.addressLine2) &&
        Objects.equals(this.addressLine3, reprintShipmentToAddress.addressLine3) &&
        Objects.equals(this.cityTown, reprintShipmentToAddress.cityTown) &&
        Objects.equals(this.company, reprintShipmentToAddress.company) &&
        Objects.equals(this.countryCode, reprintShipmentToAddress.countryCode) &&
        Objects.equals(this.email, reprintShipmentToAddress.email) &&
        Objects.equals(this.name, reprintShipmentToAddress.name) &&
        Objects.equals(this.phone, reprintShipmentToAddress.phone) &&
        Objects.equals(this.postalCode, reprintShipmentToAddress.postalCode) &&
        Objects.equals(this.residential, reprintShipmentToAddress.residential) &&
        Objects.equals(this.stateProvince, reprintShipmentToAddress.stateProvince);
  }

  @Override
  public int hashCode() {
    return Objects.hash(addressLine1, addressLine2, addressLine3, cityTown, company, countryCode, email, name, phone, postalCode, residential, stateProvince);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReprintShipmentToAddress {\n");
    sb.append("    addressLine1: ").append(toIndentedString(addressLine1)).append("\n");
    sb.append("    addressLine2: ").append(toIndentedString(addressLine2)).append("\n");
    sb.append("    addressLine3: ").append(toIndentedString(addressLine3)).append("\n");
    sb.append("    cityTown: ").append(toIndentedString(cityTown)).append("\n");
    sb.append("    company: ").append(toIndentedString(company)).append("\n");
    sb.append("    countryCode: ").append(toIndentedString(countryCode)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
    sb.append("    postalCode: ").append(toIndentedString(postalCode)).append("\n");
    sb.append("    residential: ").append(toIndentedString(residential)).append("\n");
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

