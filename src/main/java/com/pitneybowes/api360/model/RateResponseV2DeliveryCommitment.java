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
 * Check for estimated delivery date, guarantee (if any), and number of days for shipment to be delivered.
 */
@JsonPropertyOrder({
  RateResponseV2DeliveryCommitment.JSON_PROPERTY_ESTIMATED_DELIVERY_DATE_TIME,
  RateResponseV2DeliveryCommitment.JSON_PROPERTY_MAX_ESTIMATED_NUMBER_OF_DAYS,
  RateResponseV2DeliveryCommitment.JSON_PROPERTY_GUARANTEE
})
@JsonTypeName("rateResponseV2_deliveryCommitment")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-09-30T12:57:37.504069+05:30[Asia/Kolkata]", comments = "Generator version: 7.7.0")
public class RateResponseV2DeliveryCommitment {
  public static final String JSON_PROPERTY_ESTIMATED_DELIVERY_DATE_TIME = "estimatedDeliveryDateTime";
  private String estimatedDeliveryDateTime;

  public static final String JSON_PROPERTY_MAX_ESTIMATED_NUMBER_OF_DAYS = "maxEstimatedNumberOfDays";
  private String maxEstimatedNumberOfDays;

  public static final String JSON_PROPERTY_GUARANTEE = "guarantee";
  private String guarantee;

  public RateResponseV2DeliveryCommitment() {
  }

  public RateResponseV2DeliveryCommitment estimatedDeliveryDateTime(String estimatedDeliveryDateTime) {
    
    this.estimatedDeliveryDateTime = estimatedDeliveryDateTime;
    return this;
  }

  /**
   * Estimated Delivery Date.
   * @return estimatedDeliveryDateTime
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ESTIMATED_DELIVERY_DATE_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getEstimatedDeliveryDateTime() {
    return estimatedDeliveryDateTime;
  }


  @JsonProperty(JSON_PROPERTY_ESTIMATED_DELIVERY_DATE_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEstimatedDeliveryDateTime(String estimatedDeliveryDateTime) {
    this.estimatedDeliveryDateTime = estimatedDeliveryDateTime;
  }

  public RateResponseV2DeliveryCommitment maxEstimatedNumberOfDays(String maxEstimatedNumberOfDays) {
    
    this.maxEstimatedNumberOfDays = maxEstimatedNumberOfDays;
    return this;
  }

  /**
   * Max days to deliver shipment.
   * @return maxEstimatedNumberOfDays
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MAX_ESTIMATED_NUMBER_OF_DAYS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getMaxEstimatedNumberOfDays() {
    return maxEstimatedNumberOfDays;
  }


  @JsonProperty(JSON_PROPERTY_MAX_ESTIMATED_NUMBER_OF_DAYS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMaxEstimatedNumberOfDays(String maxEstimatedNumberOfDays) {
    this.maxEstimatedNumberOfDays = maxEstimatedNumberOfDays;
  }

  public RateResponseV2DeliveryCommitment guarantee(String guarantee) {
    
    this.guarantee = guarantee;
    return this;
  }

  /**
   * Checks if there is any guarantee or committment for shipment delivery.
   * @return guarantee
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_GUARANTEE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getGuarantee() {
    return guarantee;
  }


  @JsonProperty(JSON_PROPERTY_GUARANTEE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setGuarantee(String guarantee) {
    this.guarantee = guarantee;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RateResponseV2DeliveryCommitment rateResponseV2DeliveryCommitment = (RateResponseV2DeliveryCommitment) o;
    return Objects.equals(this.estimatedDeliveryDateTime, rateResponseV2DeliveryCommitment.estimatedDeliveryDateTime) &&
        Objects.equals(this.maxEstimatedNumberOfDays, rateResponseV2DeliveryCommitment.maxEstimatedNumberOfDays) &&
        Objects.equals(this.guarantee, rateResponseV2DeliveryCommitment.guarantee);
  }

  @Override
  public int hashCode() {
    return Objects.hash(estimatedDeliveryDateTime, maxEstimatedNumberOfDays, guarantee);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RateResponseV2DeliveryCommitment {\n");
    sb.append("    estimatedDeliveryDateTime: ").append(toIndentedString(estimatedDeliveryDateTime)).append("\n");
    sb.append("    maxEstimatedNumberOfDays: ").append(toIndentedString(maxEstimatedNumberOfDays)).append("\n");
    sb.append("    guarantee: ").append(toIndentedString(guarantee)).append("\n");
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

