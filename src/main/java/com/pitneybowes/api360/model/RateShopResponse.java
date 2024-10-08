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
import com.pitneybowes.api360.model.RateShopResponseErrorsInner;
import com.pitneybowes.api360.model.RateShopResponseFromAddress;
import com.pitneybowes.api360.model.RateShopResponseParcel;
import com.pitneybowes.api360.model.RateShopResponseRatesInner;
import com.pitneybowes.api360.model.RateShopResponseToAddress;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * RateShopResponse
 */
@JsonPropertyOrder({
  RateShopResponse.JSON_PROPERTY_FROM_ADDRESS,
  RateShopResponse.JSON_PROPERTY_PARCEL,
  RateShopResponse.JSON_PROPERTY_RATES,
  RateShopResponse.JSON_PROPERTY_TO_ADDRESS,
  RateShopResponse.JSON_PROPERTY_IS_HAZMAT,
  RateShopResponse.JSON_PROPERTY_ERRORS
})
@JsonTypeName("rateShopResponse")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-09-30T12:57:37.504069+05:30[Asia/Kolkata]", comments = "Generator version: 7.7.0")
public class RateShopResponse {
  public static final String JSON_PROPERTY_FROM_ADDRESS = "fromAddress";
  private RateShopResponseFromAddress fromAddress;

  public static final String JSON_PROPERTY_PARCEL = "parcel";
  private RateShopResponseParcel parcel;

  public static final String JSON_PROPERTY_RATES = "rates";
  private List<RateShopResponseRatesInner> rates = new ArrayList<>();

  public static final String JSON_PROPERTY_TO_ADDRESS = "toAddress";
  private RateShopResponseToAddress toAddress;

  public static final String JSON_PROPERTY_IS_HAZMAT = "isHazmat";
  private Boolean isHazmat;

  public static final String JSON_PROPERTY_ERRORS = "errors";
  private List<RateShopResponseErrorsInner> errors = new ArrayList<>();

  public RateShopResponse() {
  }

  public RateShopResponse fromAddress(RateShopResponseFromAddress fromAddress) {
    
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

  public RateShopResponseFromAddress getFromAddress() {
    return fromAddress;
  }


  @JsonProperty(JSON_PROPERTY_FROM_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFromAddress(RateShopResponseFromAddress fromAddress) {
    this.fromAddress = fromAddress;
  }

  public RateShopResponse parcel(RateShopResponseParcel parcel) {
    
    this.parcel = parcel;
    return this;
  }

  /**
   * Get parcel
   * @return parcel
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PARCEL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RateShopResponseParcel getParcel() {
    return parcel;
  }


  @JsonProperty(JSON_PROPERTY_PARCEL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setParcel(RateShopResponseParcel parcel) {
    this.parcel = parcel;
  }

  public RateShopResponse rates(List<RateShopResponseRatesInner> rates) {
    
    this.rates = rates;
    return this;
  }

  public RateShopResponse addRatesItem(RateShopResponseRatesInner ratesItem) {
    if (this.rates == null) {
      this.rates = new ArrayList<>();
    }
    this.rates.add(ratesItem);
    return this;
  }

  /**
   * It displays all available rates for each services
   * @return rates
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RATES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<RateShopResponseRatesInner> getRates() {
    return rates;
  }


  @JsonProperty(JSON_PROPERTY_RATES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRates(List<RateShopResponseRatesInner> rates) {
    this.rates = rates;
  }

  public RateShopResponse toAddress(RateShopResponseToAddress toAddress) {
    
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

  public RateShopResponseToAddress getToAddress() {
    return toAddress;
  }


  @JsonProperty(JSON_PROPERTY_TO_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setToAddress(RateShopResponseToAddress toAddress) {
    this.toAddress = toAddress;
  }

  public RateShopResponse isHazmat(Boolean isHazmat) {
    
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

  public RateShopResponse errors(List<RateShopResponseErrorsInner> errors) {
    
    this.errors = errors;
    return this;
  }

  public RateShopResponse addErrorsItem(RateShopResponseErrorsInner errorsItem) {
    if (this.errors == null) {
      this.errors = new ArrayList<>();
    }
    this.errors.add(errorsItem);
    return this;
  }

  /**
   * It display any error while getting rates
   * @return errors
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ERRORS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<RateShopResponseErrorsInner> getErrors() {
    return errors;
  }


  @JsonProperty(JSON_PROPERTY_ERRORS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setErrors(List<RateShopResponseErrorsInner> errors) {
    this.errors = errors;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RateShopResponse rateShopResponse = (RateShopResponse) o;
    return Objects.equals(this.fromAddress, rateShopResponse.fromAddress) &&
        Objects.equals(this.parcel, rateShopResponse.parcel) &&
        Objects.equals(this.rates, rateShopResponse.rates) &&
        Objects.equals(this.toAddress, rateShopResponse.toAddress) &&
        Objects.equals(this.isHazmat, rateShopResponse.isHazmat) &&
        Objects.equals(this.errors, rateShopResponse.errors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fromAddress, parcel, rates, toAddress, isHazmat, errors);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RateShopResponse {\n");
    sb.append("    fromAddress: ").append(toIndentedString(fromAddress)).append("\n");
    sb.append("    parcel: ").append(toIndentedString(parcel)).append("\n");
    sb.append("    rates: ").append(toIndentedString(rates)).append("\n");
    sb.append("    toAddress: ").append(toIndentedString(toAddress)).append("\n");
    sb.append("    isHazmat: ").append(toIndentedString(isHazmat)).append("\n");
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
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

