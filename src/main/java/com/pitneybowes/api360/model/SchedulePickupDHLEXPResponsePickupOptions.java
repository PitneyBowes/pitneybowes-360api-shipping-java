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
 * It is used to provide any pickup options while scheduling pickups
 */
@JsonPropertyOrder({
  SchedulePickupDHLEXPResponsePickupOptions.JSON_PROPERTY_PICKUP_START_DATE_TIME,
  SchedulePickupDHLEXPResponsePickupOptions.JSON_PROPERTY_PICKUP_END_DATE_TIME
})
@JsonTypeName("schedulePickupDHLEXPResponse_pickupOptions")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-09-30T12:57:37.504069+05:30[Asia/Kolkata]", comments = "Generator version: 7.7.0")
public class SchedulePickupDHLEXPResponsePickupOptions {
  public static final String JSON_PROPERTY_PICKUP_START_DATE_TIME = "pickupStartDateTime";
  private String pickupStartDateTime;

  public static final String JSON_PROPERTY_PICKUP_END_DATE_TIME = "pickupEndDateTime";
  private String pickupEndDateTime;

  public SchedulePickupDHLEXPResponsePickupOptions() {
  }

  public SchedulePickupDHLEXPResponsePickupOptions pickupStartDateTime(String pickupStartDateTime) {
    
    this.pickupStartDateTime = pickupStartDateTime;
    return this;
  }

  /**
   * It specifies the earliest date and time that your parcels will be available for pickup (UTC time)
   * @return pickupStartDateTime
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PICKUP_START_DATE_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPickupStartDateTime() {
    return pickupStartDateTime;
  }


  @JsonProperty(JSON_PROPERTY_PICKUP_START_DATE_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPickupStartDateTime(String pickupStartDateTime) {
    this.pickupStartDateTime = pickupStartDateTime;
  }

  public SchedulePickupDHLEXPResponsePickupOptions pickupEndDateTime(String pickupEndDateTime) {
    
    this.pickupEndDateTime = pickupEndDateTime;
    return this;
  }

  /**
   * It specifies the latest date and time that your parcels will be available for pickup (UTC time)
   * @return pickupEndDateTime
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PICKUP_END_DATE_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPickupEndDateTime() {
    return pickupEndDateTime;
  }


  @JsonProperty(JSON_PROPERTY_PICKUP_END_DATE_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPickupEndDateTime(String pickupEndDateTime) {
    this.pickupEndDateTime = pickupEndDateTime;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SchedulePickupDHLEXPResponsePickupOptions schedulePickupDHLEXPResponsePickupOptions = (SchedulePickupDHLEXPResponsePickupOptions) o;
    return Objects.equals(this.pickupStartDateTime, schedulePickupDHLEXPResponsePickupOptions.pickupStartDateTime) &&
        Objects.equals(this.pickupEndDateTime, schedulePickupDHLEXPResponsePickupOptions.pickupEndDateTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pickupStartDateTime, pickupEndDateTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SchedulePickupDHLEXPResponsePickupOptions {\n");
    sb.append("    pickupStartDateTime: ").append(toIndentedString(pickupStartDateTime)).append("\n");
    sb.append("    pickupEndDateTime: ").append(toIndentedString(pickupEndDateTime)).append("\n");
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

