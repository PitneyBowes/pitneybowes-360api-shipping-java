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
import com.pitneybowes.api360.model.SchedulePickupDHLEXPRequestPickupAddress;
import com.pitneybowes.api360.model.SchedulePickupFedexRequestPickupOptions;
import com.pitneybowes.api360.model.SchedulePickupFedexRequestPickupSummaryInner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * SchedulePickupFedexRequest
 */
@JsonPropertyOrder({
  SchedulePickupFedexRequest.JSON_PROPERTY_PACKAGE_LOCATION,
  SchedulePickupFedexRequest.JSON_PROPERTY_CARRIER_ACCOUNT_ID,
  SchedulePickupFedexRequest.JSON_PROPERTY_PICKUP_ADDRESS,
  SchedulePickupFedexRequest.JSON_PROPERTY_SHIPMENT_IDS,
  SchedulePickupFedexRequest.JSON_PROPERTY_PICKUP_SUMMARY,
  SchedulePickupFedexRequest.JSON_PROPERTY_ADDITIONALNOTES,
  SchedulePickupFedexRequest.JSON_PROPERTY_REFERENCE,
  SchedulePickupFedexRequest.JSON_PROPERTY_PICKUP_OPTIONS
})
@JsonTypeName("schedulePickupFedexRequest")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-09-30T12:57:37.504069+05:30[Asia/Kolkata]", comments = "Generator version: 7.7.0")
public class SchedulePickupFedexRequest {
  public static final String JSON_PROPERTY_PACKAGE_LOCATION = "packageLocation";
  private String packageLocation;

  public static final String JSON_PROPERTY_CARRIER_ACCOUNT_ID = "carrierAccountId";
  private String carrierAccountId;

  public static final String JSON_PROPERTY_PICKUP_ADDRESS = "pickupAddress";
  private SchedulePickupDHLEXPRequestPickupAddress pickupAddress;

  public static final String JSON_PROPERTY_SHIPMENT_IDS = "shipmentIds";
  private List<String> shipmentIds = new ArrayList<>();

  public static final String JSON_PROPERTY_PICKUP_SUMMARY = "pickupSummary";
  private List<SchedulePickupFedexRequestPickupSummaryInner> pickupSummary = new ArrayList<>();

  public static final String JSON_PROPERTY_ADDITIONALNOTES = "additionalnotes";
  private String additionalnotes;

  public static final String JSON_PROPERTY_REFERENCE = "reference";
  private String reference;

  public static final String JSON_PROPERTY_PICKUP_OPTIONS = "pickupOptions";
  private SchedulePickupFedexRequestPickupOptions pickupOptions;

  public SchedulePickupFedexRequest() {
  }

  public SchedulePickupFedexRequest packageLocation(String packageLocation) {
    
    this.packageLocation = packageLocation;
    return this;
  }

  /**
   * It specifies the location from where packages would be collected. Applicable values are &#x60;FRONT&#x60;,&#x60;NONE&#x60;,&#x60;SIDE&#x60;,&#x60;REAR&#x60;
   * @return packageLocation
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_PACKAGE_LOCATION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getPackageLocation() {
    return packageLocation;
  }


  @JsonProperty(JSON_PROPERTY_PACKAGE_LOCATION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setPackageLocation(String packageLocation) {
    this.packageLocation = packageLocation;
  }

  public SchedulePickupFedexRequest carrierAccountId(String carrierAccountId) {
    
    this.carrierAccountId = carrierAccountId;
    return this;
  }

  /**
   * It specifies the carrier account id, its value can be referenced from the &#x60;Get Carrier Accounts&#x60; API.
   * @return carrierAccountId
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_CARRIER_ACCOUNT_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getCarrierAccountId() {
    return carrierAccountId;
  }


  @JsonProperty(JSON_PROPERTY_CARRIER_ACCOUNT_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCarrierAccountId(String carrierAccountId) {
    this.carrierAccountId = carrierAccountId;
  }

  public SchedulePickupFedexRequest pickupAddress(SchedulePickupDHLEXPRequestPickupAddress pickupAddress) {
    
    this.pickupAddress = pickupAddress;
    return this;
  }

  /**
   * Get pickupAddress
   * @return pickupAddress
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_PICKUP_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public SchedulePickupDHLEXPRequestPickupAddress getPickupAddress() {
    return pickupAddress;
  }


  @JsonProperty(JSON_PROPERTY_PICKUP_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setPickupAddress(SchedulePickupDHLEXPRequestPickupAddress pickupAddress) {
    this.pickupAddress = pickupAddress;
  }

  public SchedulePickupFedexRequest shipmentIds(List<String> shipmentIds) {
    
    this.shipmentIds = shipmentIds;
    return this;
  }

  public SchedulePickupFedexRequest addShipmentIdsItem(String shipmentIdsItem) {
    if (this.shipmentIds == null) {
      this.shipmentIds = new ArrayList<>();
    }
    this.shipmentIds.add(shipmentIdsItem);
    return this;
  }

  /**
   * It indicates the shipmentIds for which pickup to be scheduled.
   * @return shipmentIds
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SHIPMENT_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getShipmentIds() {
    return shipmentIds;
  }


  @JsonProperty(JSON_PROPERTY_SHIPMENT_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setShipmentIds(List<String> shipmentIds) {
    this.shipmentIds = shipmentIds;
  }

  public SchedulePickupFedexRequest pickupSummary(List<SchedulePickupFedexRequestPickupSummaryInner> pickupSummary) {
    
    this.pickupSummary = pickupSummary;
    return this;
  }

  public SchedulePickupFedexRequest addPickupSummaryItem(SchedulePickupFedexRequestPickupSummaryInner pickupSummaryItem) {
    if (this.pickupSummary == null) {
      this.pickupSummary = new ArrayList<>();
    }
    this.pickupSummary.add(pickupSummaryItem);
    return this;
  }

  /**
   * This can be used to add package details for which labels are not created yet but would want to schedule pickup in advance.
   * @return pickupSummary
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PICKUP_SUMMARY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<SchedulePickupFedexRequestPickupSummaryInner> getPickupSummary() {
    return pickupSummary;
  }


  @JsonProperty(JSON_PROPERTY_PICKUP_SUMMARY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPickupSummary(List<SchedulePickupFedexRequestPickupSummaryInner> pickupSummary) {
    this.pickupSummary = pickupSummary;
  }

  public SchedulePickupFedexRequest additionalnotes(String additionalnotes) {
    
    this.additionalnotes = additionalnotes;
    return this;
  }

  /**
   * It can be used to provide any additional comments or remarks, it would be printed on the scheduled pickup document.
   * @return additionalnotes
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ADDITIONALNOTES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAdditionalnotes() {
    return additionalnotes;
  }


  @JsonProperty(JSON_PROPERTY_ADDITIONALNOTES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAdditionalnotes(String additionalnotes) {
    this.additionalnotes = additionalnotes;
  }

  public SchedulePickupFedexRequest reference(String reference) {
    
    this.reference = reference;
    return this;
  }

  /**
   * It is used for any reference purpose
   * @return reference
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_REFERENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getReference() {
    return reference;
  }


  @JsonProperty(JSON_PROPERTY_REFERENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setReference(String reference) {
    this.reference = reference;
  }

  public SchedulePickupFedexRequest pickupOptions(SchedulePickupFedexRequestPickupOptions pickupOptions) {
    
    this.pickupOptions = pickupOptions;
    return this;
  }

  /**
   * Get pickupOptions
   * @return pickupOptions
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_PICKUP_OPTIONS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public SchedulePickupFedexRequestPickupOptions getPickupOptions() {
    return pickupOptions;
  }


  @JsonProperty(JSON_PROPERTY_PICKUP_OPTIONS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setPickupOptions(SchedulePickupFedexRequestPickupOptions pickupOptions) {
    this.pickupOptions = pickupOptions;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SchedulePickupFedexRequest schedulePickupFedexRequest = (SchedulePickupFedexRequest) o;
    return Objects.equals(this.packageLocation, schedulePickupFedexRequest.packageLocation) &&
        Objects.equals(this.carrierAccountId, schedulePickupFedexRequest.carrierAccountId) &&
        Objects.equals(this.pickupAddress, schedulePickupFedexRequest.pickupAddress) &&
        Objects.equals(this.shipmentIds, schedulePickupFedexRequest.shipmentIds) &&
        Objects.equals(this.pickupSummary, schedulePickupFedexRequest.pickupSummary) &&
        Objects.equals(this.additionalnotes, schedulePickupFedexRequest.additionalnotes) &&
        Objects.equals(this.reference, schedulePickupFedexRequest.reference) &&
        Objects.equals(this.pickupOptions, schedulePickupFedexRequest.pickupOptions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(packageLocation, carrierAccountId, pickupAddress, shipmentIds, pickupSummary, additionalnotes, reference, pickupOptions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SchedulePickupFedexRequest {\n");
    sb.append("    packageLocation: ").append(toIndentedString(packageLocation)).append("\n");
    sb.append("    carrierAccountId: ").append(toIndentedString(carrierAccountId)).append("\n");
    sb.append("    pickupAddress: ").append(toIndentedString(pickupAddress)).append("\n");
    sb.append("    shipmentIds: ").append(toIndentedString(shipmentIds)).append("\n");
    sb.append("    pickupSummary: ").append(toIndentedString(pickupSummary)).append("\n");
    sb.append("    additionalnotes: ").append(toIndentedString(additionalnotes)).append("\n");
    sb.append("    reference: ").append(toIndentedString(reference)).append("\n");
    sb.append("    pickupOptions: ").append(toIndentedString(pickupOptions)).append("\n");
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

