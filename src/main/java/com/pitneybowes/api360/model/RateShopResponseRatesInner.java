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
import com.pitneybowes.api360.model.RateShopResponseRatesInnerDeliveryCommitment;
import com.pitneybowes.api360.model.RateShopResponseRatesInnerSurchargesInner;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * RateShopResponseRatesInner
 */
@JsonPropertyOrder({
  RateShopResponseRatesInner.JSON_PROPERTY_BASE_CHARGE,
  RateShopResponseRatesInner.JSON_PROPERTY_CARRIER,
  RateShopResponseRatesInner.JSON_PROPERTY_CARRIER_ACCOUNT,
  RateShopResponseRatesInner.JSON_PROPERTY_DELIVERY_COMMITMENT,
  RateShopResponseRatesInner.JSON_PROPERTY_CURRENCY_CODE,
  RateShopResponseRatesInner.JSON_PROPERTY_PARCEL_TYPE,
  RateShopResponseRatesInner.JSON_PROPERTY_PARCEL_ID,
  RateShopResponseRatesInner.JSON_PROPERTY_RATE_TYPE_ID,
  RateShopResponseRatesInner.JSON_PROPERTY_SERVICE_ID,
  RateShopResponseRatesInner.JSON_PROPERTY_SURCHARGES,
  RateShopResponseRatesInner.JSON_PROPERTY_TOTAL_CARRIER_CHARGE
})
@JsonTypeName("rateShopResponse_rates_inner")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-09-30T12:57:37.504069+05:30[Asia/Kolkata]", comments = "Generator version: 7.7.0")
public class RateShopResponseRatesInner {
  public static final String JSON_PROPERTY_BASE_CHARGE = "baseCharge";
  private BigDecimal baseCharge;

  public static final String JSON_PROPERTY_CARRIER = "carrier";
  private String carrier;

  public static final String JSON_PROPERTY_CARRIER_ACCOUNT = "carrierAccount";
  private String carrierAccount;

  public static final String JSON_PROPERTY_DELIVERY_COMMITMENT = "deliveryCommitment";
  private RateShopResponseRatesInnerDeliveryCommitment deliveryCommitment;

  public static final String JSON_PROPERTY_CURRENCY_CODE = "currencyCode";
  private String currencyCode;

  public static final String JSON_PROPERTY_PARCEL_TYPE = "parcelType";
  private String parcelType;

  public static final String JSON_PROPERTY_PARCEL_ID = "parcelId";
  private String parcelId;

  public static final String JSON_PROPERTY_RATE_TYPE_ID = "rateTypeId";
  private String rateTypeId;

  public static final String JSON_PROPERTY_SERVICE_ID = "serviceId";
  private String serviceId;

  public static final String JSON_PROPERTY_SURCHARGES = "surcharges";
  private List<RateShopResponseRatesInnerSurchargesInner> surcharges = new ArrayList<>();

  public static final String JSON_PROPERTY_TOTAL_CARRIER_CHARGE = "totalCarrierCharge";
  private BigDecimal totalCarrierCharge;

  public RateShopResponseRatesInner() {
  }

  public RateShopResponseRatesInner baseCharge(BigDecimal baseCharge) {
    
    this.baseCharge = baseCharge;
    return this;
  }

  /**
   * The base service charge is payable to the carrier, excluding special service charges.
   * @return baseCharge
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_BASE_CHARGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getBaseCharge() {
    return baseCharge;
  }


  @JsonProperty(JSON_PROPERTY_BASE_CHARGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBaseCharge(BigDecimal baseCharge) {
    this.baseCharge = baseCharge;
  }

  public RateShopResponseRatesInner carrier(String carrier) {
    
    this.carrier = carrier;
    return this;
  }

  /**
   * Carrier is a service used to transport the parcels or couriers from one place to another.
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

  public RateShopResponseRatesInner carrierAccount(String carrierAccount) {
    
    this.carrierAccount = carrierAccount;
    return this;
  }

  /**
   * Carrier Account is the account associated to specific carrier service.
   * @return carrierAccount
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CARRIER_ACCOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCarrierAccount() {
    return carrierAccount;
  }


  @JsonProperty(JSON_PROPERTY_CARRIER_ACCOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCarrierAccount(String carrierAccount) {
    this.carrierAccount = carrierAccount;
  }

  public RateShopResponseRatesInner deliveryCommitment(RateShopResponseRatesInnerDeliveryCommitment deliveryCommitment) {
    
    this.deliveryCommitment = deliveryCommitment;
    return this;
  }

  /**
   * Get deliveryCommitment
   * @return deliveryCommitment
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DELIVERY_COMMITMENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RateShopResponseRatesInnerDeliveryCommitment getDeliveryCommitment() {
    return deliveryCommitment;
  }


  @JsonProperty(JSON_PROPERTY_DELIVERY_COMMITMENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDeliveryCommitment(RateShopResponseRatesInnerDeliveryCommitment deliveryCommitment) {
    this.deliveryCommitment = deliveryCommitment;
  }

  public RateShopResponseRatesInner currencyCode(String currencyCode) {
    
    this.currencyCode = currencyCode;
    return this;
  }

  /**
   * A three-character (all uppercase letter) symbol of a currency according to the international ISO standard. As a rule, the first two letters denote the name of the country, and the third letter, the name of the currency thereof.For example, for US - the currency is Dollars and code is USD. Similarly for Canada, the currencycode is CAD, and for India, it is INR. 
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

  public RateShopResponseRatesInner parcelType(String parcelType) {
    
    this.parcelType = parcelType;
    return this;
  }

  /**
   * Parcel Type is required for creating a shipment while rating a parcel, which varies as per Carrier selection. ParcelType have categories like Package, Envelopes, Paks, Boxes, Tube, etc. 
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

  public RateShopResponseRatesInner parcelId(String parcelId) {
    
    this.parcelId = parcelId;
    return this;
  }

  /**
   * It indicates parcelId chosen in the request
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

  public RateShopResponseRatesInner rateTypeId(String rateTypeId) {
    
    this.rateTypeId = rateTypeId;
    return this;
  }

  /**
   * Its value can be CONTRACT_RATES, COMMERCIAL or COMMERCIAL_BASE for USPS and COMMERCIAL for other carriers depending on the Pitney Bowes contract/subscription
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

  public RateShopResponseRatesInner serviceId(String serviceId) {
    
    this.serviceId = serviceId;
    return this;
  }

  /**
   * The unique identifier given to the carrier specific service.
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

  public RateShopResponseRatesInner surcharges(List<RateShopResponseRatesInnerSurchargesInner> surcharges) {
    
    this.surcharges = surcharges;
    return this;
  }

  public RateShopResponseRatesInner addSurchargesItem(RateShopResponseRatesInnerSurchargesInner surchargesItem) {
    if (this.surcharges == null) {
      this.surcharges = new ArrayList<>();
    }
    this.surcharges.add(surchargesItem);
    return this;
  }

  /**
   *  Additional fees or surcharges for the shipment. Each object in the array defines a surcharge and fee.
   * @return surcharges
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SURCHARGES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<RateShopResponseRatesInnerSurchargesInner> getSurcharges() {
    return surcharges;
  }


  @JsonProperty(JSON_PROPERTY_SURCHARGES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSurcharges(List<RateShopResponseRatesInnerSurchargesInner> surcharges) {
    this.surcharges = surcharges;
  }

  public RateShopResponseRatesInner totalCarrierCharge(BigDecimal totalCarrierCharge) {
    
    this.totalCarrierCharge = totalCarrierCharge;
    return this;
  }

  /**
   * The total amount payable to the carrier, including special service fees, surcharges, and any international taxes and duties
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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RateShopResponseRatesInner rateShopResponseRatesInner = (RateShopResponseRatesInner) o;
    return Objects.equals(this.baseCharge, rateShopResponseRatesInner.baseCharge) &&
        Objects.equals(this.carrier, rateShopResponseRatesInner.carrier) &&
        Objects.equals(this.carrierAccount, rateShopResponseRatesInner.carrierAccount) &&
        Objects.equals(this.deliveryCommitment, rateShopResponseRatesInner.deliveryCommitment) &&
        Objects.equals(this.currencyCode, rateShopResponseRatesInner.currencyCode) &&
        Objects.equals(this.parcelType, rateShopResponseRatesInner.parcelType) &&
        Objects.equals(this.parcelId, rateShopResponseRatesInner.parcelId) &&
        Objects.equals(this.rateTypeId, rateShopResponseRatesInner.rateTypeId) &&
        Objects.equals(this.serviceId, rateShopResponseRatesInner.serviceId) &&
        Objects.equals(this.surcharges, rateShopResponseRatesInner.surcharges) &&
        Objects.equals(this.totalCarrierCharge, rateShopResponseRatesInner.totalCarrierCharge);
  }

  @Override
  public int hashCode() {
    return Objects.hash(baseCharge, carrier, carrierAccount, deliveryCommitment, currencyCode, parcelType, parcelId, rateTypeId, serviceId, surcharges, totalCarrierCharge);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RateShopResponseRatesInner {\n");
    sb.append("    baseCharge: ").append(toIndentedString(baseCharge)).append("\n");
    sb.append("    carrier: ").append(toIndentedString(carrier)).append("\n");
    sb.append("    carrierAccount: ").append(toIndentedString(carrierAccount)).append("\n");
    sb.append("    deliveryCommitment: ").append(toIndentedString(deliveryCommitment)).append("\n");
    sb.append("    currencyCode: ").append(toIndentedString(currencyCode)).append("\n");
    sb.append("    parcelType: ").append(toIndentedString(parcelType)).append("\n");
    sb.append("    parcelId: ").append(toIndentedString(parcelId)).append("\n");
    sb.append("    rateTypeId: ").append(toIndentedString(rateTypeId)).append("\n");
    sb.append("    serviceId: ").append(toIndentedString(serviceId)).append("\n");
    sb.append("    surcharges: ").append(toIndentedString(surcharges)).append("\n");
    sb.append("    totalCarrierCharge: ").append(toIndentedString(totalCarrierCharge)).append("\n");
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

