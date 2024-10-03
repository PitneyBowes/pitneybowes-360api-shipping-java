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
import com.pitneybowes.api360.model.GetAllPickupsDataInnerPickupOptions;
import com.pitneybowes.api360.model.SchedulePickupDHLEXPResponse;
import com.pitneybowes.api360.model.SchedulePickupDHLEXPResponsePickupAddress;
import com.pitneybowes.api360.model.SchedulePickupFedexResponse;
import com.pitneybowes.api360.model.SchedulePickupUPSResponse;
import com.pitneybowes.api360.model.SchedulePickupUPSResponsePickupRate;
import com.pitneybowes.api360.model.SchedulePickupUSPSResponse;
import com.pitneybowes.api360.model.SchedulePickupUSPSResponsePickupSummaryInner;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * SchedulePickup200Response
 */
@JsonPropertyOrder({
  SchedulePickup200Response.JSON_PROPERTY_PACKAGE_LOCATION,
  SchedulePickup200Response.JSON_PROPERTY_PICKUP_CONFIRMATION_NUMBER,
  SchedulePickup200Response.JSON_PROPERTY_PICKUP_ID,
  SchedulePickup200Response.JSON_PROPERTY_CARRIER,
  SchedulePickup200Response.JSON_PROPERTY_CARRIER_ACCOUNT_ID,
  SchedulePickup200Response.JSON_PROPERTY_PICKUP_ADDRESS,
  SchedulePickup200Response.JSON_PROPERTY_SHIPMENT_IDS,
  SchedulePickup200Response.JSON_PROPERTY_PICKUP_SUMMARY,
  SchedulePickup200Response.JSON_PROPERTY_ADDITIONALNOTES,
  SchedulePickup200Response.JSON_PROPERTY_REFERENCE,
  SchedulePickup200Response.JSON_PROPERTY_PICKUP_DATE_TIME,
  SchedulePickup200Response.JSON_PROPERTY_PICKUP_TOTAL_WEIGHT,
  SchedulePickup200Response.JSON_PROPERTY_PICKUP_TOTAL_WEIGHT_UNIT,
  SchedulePickup200Response.JSON_PROPERTY_PICKUP_OPTIONS,
  SchedulePickup200Response.JSON_PROPERTY_PICKUP_RATE
})
@JsonTypeName("schedulePickup_200_response")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-09-30T12:57:37.504069+05:30[Asia/Kolkata]", comments = "Generator version: 7.7.0")
public class SchedulePickup200Response {
  public static final String JSON_PROPERTY_PACKAGE_LOCATION = "packageLocation";
  private String packageLocation;

  public static final String JSON_PROPERTY_PICKUP_CONFIRMATION_NUMBER = "pickupConfirmationNumber";
  private String pickupConfirmationNumber;

  public static final String JSON_PROPERTY_PICKUP_ID = "pickupId";
  private String pickupId;

  public static final String JSON_PROPERTY_CARRIER = "carrier";
  private String carrier;

  public static final String JSON_PROPERTY_CARRIER_ACCOUNT_ID = "carrierAccountId";
  private String carrierAccountId;

  public static final String JSON_PROPERTY_PICKUP_ADDRESS = "pickupAddress";
  private SchedulePickupDHLEXPResponsePickupAddress pickupAddress;

  public static final String JSON_PROPERTY_SHIPMENT_IDS = "shipmentIds";
  private List<String> shipmentIds = new ArrayList<>();

  public static final String JSON_PROPERTY_PICKUP_SUMMARY = "pickupSummary";
  private List<SchedulePickupUSPSResponsePickupSummaryInner> pickupSummary = new ArrayList<>();

  public static final String JSON_PROPERTY_ADDITIONALNOTES = "additionalnotes";
  private String additionalnotes;

  public static final String JSON_PROPERTY_REFERENCE = "reference";
  private String reference;

  public static final String JSON_PROPERTY_PICKUP_DATE_TIME = "pickupDateTime";
  private String pickupDateTime;

  public static final String JSON_PROPERTY_PICKUP_TOTAL_WEIGHT = "pickupTotalWeight";
  private BigDecimal pickupTotalWeight;

  public static final String JSON_PROPERTY_PICKUP_TOTAL_WEIGHT_UNIT = "pickupTotalWeightUnit";
  private String pickupTotalWeightUnit;

  public static final String JSON_PROPERTY_PICKUP_OPTIONS = "pickupOptions";
  private GetAllPickupsDataInnerPickupOptions pickupOptions;

  public static final String JSON_PROPERTY_PICKUP_RATE = "pickupRate";
  private SchedulePickupUPSResponsePickupRate pickupRate;

  public SchedulePickup200Response() {
  }

  public SchedulePickup200Response packageLocation(String packageLocation) {
    
    this.packageLocation = packageLocation;
    return this;
  }

  /**
   * It specifies the location from where packages would be collected.
   * @return packageLocation
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PACKAGE_LOCATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPackageLocation() {
    return packageLocation;
  }


  @JsonProperty(JSON_PROPERTY_PACKAGE_LOCATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPackageLocation(String packageLocation) {
    this.packageLocation = packageLocation;
  }

  public SchedulePickup200Response pickupConfirmationNumber(String pickupConfirmationNumber) {
    
    this.pickupConfirmationNumber = pickupConfirmationNumber;
    return this;
  }

  /**
   * It displays the unique confirmation number of the pickup
   * @return pickupConfirmationNumber
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PICKUP_CONFIRMATION_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPickupConfirmationNumber() {
    return pickupConfirmationNumber;
  }


  @JsonProperty(JSON_PROPERTY_PICKUP_CONFIRMATION_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPickupConfirmationNumber(String pickupConfirmationNumber) {
    this.pickupConfirmationNumber = pickupConfirmationNumber;
  }

  public SchedulePickup200Response pickupId(String pickupId) {
    
    this.pickupId = pickupId;
    return this;
  }

  /**
   * It displays the unique pickup Id which can be further used to get scheduled PDF and cancel pdf if required.
   * @return pickupId
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PICKUP_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPickupId() {
    return pickupId;
  }


  @JsonProperty(JSON_PROPERTY_PICKUP_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPickupId(String pickupId) {
    this.pickupId = pickupId;
  }

  public SchedulePickup200Response carrier(String carrier) {
    
    this.carrier = carrier;
    return this;
  }

  /**
   * It dispays the carrier
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

  public SchedulePickup200Response carrierAccountId(String carrierAccountId) {
    
    this.carrierAccountId = carrierAccountId;
    return this;
  }

  /**
   * It displays the carrier acount id which is used to create the shipment
   * @return carrierAccountId
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CARRIER_ACCOUNT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCarrierAccountId() {
    return carrierAccountId;
  }


  @JsonProperty(JSON_PROPERTY_CARRIER_ACCOUNT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCarrierAccountId(String carrierAccountId) {
    this.carrierAccountId = carrierAccountId;
  }

  public SchedulePickup200Response pickupAddress(SchedulePickupDHLEXPResponsePickupAddress pickupAddress) {
    
    this.pickupAddress = pickupAddress;
    return this;
  }

  /**
   * Get pickupAddress
   * @return pickupAddress
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PICKUP_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public SchedulePickupDHLEXPResponsePickupAddress getPickupAddress() {
    return pickupAddress;
  }


  @JsonProperty(JSON_PROPERTY_PICKUP_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPickupAddress(SchedulePickupDHLEXPResponsePickupAddress pickupAddress) {
    this.pickupAddress = pickupAddress;
  }

  public SchedulePickup200Response shipmentIds(List<String> shipmentIds) {
    
    this.shipmentIds = shipmentIds;
    return this;
  }

  public SchedulePickup200Response addShipmentIdsItem(String shipmentIdsItem) {
    if (this.shipmentIds == null) {
      this.shipmentIds = new ArrayList<>();
    }
    this.shipmentIds.add(shipmentIdsItem);
    return this;
  }

  /**
   * It indicates the shipmentIds for which pickup is scheduled.
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

  public SchedulePickup200Response pickupSummary(List<SchedulePickupUSPSResponsePickupSummaryInner> pickupSummary) {
    
    this.pickupSummary = pickupSummary;
    return this;
  }

  public SchedulePickup200Response addPickupSummaryItem(SchedulePickupUSPSResponsePickupSummaryInner pickupSummaryItem) {
    if (this.pickupSummary == null) {
      this.pickupSummary = new ArrayList<>();
    }
    this.pickupSummary.add(pickupSummaryItem);
    return this;
  }

  /**
   * It displays the package details provided in the request.
   * @return pickupSummary
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PICKUP_SUMMARY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<SchedulePickupUSPSResponsePickupSummaryInner> getPickupSummary() {
    return pickupSummary;
  }


  @JsonProperty(JSON_PROPERTY_PICKUP_SUMMARY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPickupSummary(List<SchedulePickupUSPSResponsePickupSummaryInner> pickupSummary) {
    this.pickupSummary = pickupSummary;
  }

  public SchedulePickup200Response additionalnotes(String additionalnotes) {
    
    this.additionalnotes = additionalnotes;
    return this;
  }

  /**
   * It displays additional comments or remarks provided in the request, it would be printed on the scheduled pickup document
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

  public SchedulePickup200Response reference(String reference) {
    
    this.reference = reference;
    return this;
  }

  /**
   * It displays any reference information provided in the request.
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

  public SchedulePickup200Response pickupDateTime(String pickupDateTime) {
    
    this.pickupDateTime = pickupDateTime;
    return this;
  }

  /**
   * It displays the scheduled pickup date and time (in UTC)
   * @return pickupDateTime
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PICKUP_DATE_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPickupDateTime() {
    return pickupDateTime;
  }


  @JsonProperty(JSON_PROPERTY_PICKUP_DATE_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPickupDateTime(String pickupDateTime) {
    this.pickupDateTime = pickupDateTime;
  }

  public SchedulePickup200Response pickupTotalWeight(BigDecimal pickupTotalWeight) {
    
    this.pickupTotalWeight = pickupTotalWeight;
    return this;
  }

  /**
   * It displays the total package weight.
   * @return pickupTotalWeight
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PICKUP_TOTAL_WEIGHT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getPickupTotalWeight() {
    return pickupTotalWeight;
  }


  @JsonProperty(JSON_PROPERTY_PICKUP_TOTAL_WEIGHT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPickupTotalWeight(BigDecimal pickupTotalWeight) {
    this.pickupTotalWeight = pickupTotalWeight;
  }

  public SchedulePickup200Response pickupTotalWeightUnit(String pickupTotalWeightUnit) {
    
    this.pickupTotalWeightUnit = pickupTotalWeightUnit;
    return this;
  }

  /**
   * It displays the weight unit.
   * @return pickupTotalWeightUnit
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PICKUP_TOTAL_WEIGHT_UNIT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPickupTotalWeightUnit() {
    return pickupTotalWeightUnit;
  }


  @JsonProperty(JSON_PROPERTY_PICKUP_TOTAL_WEIGHT_UNIT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPickupTotalWeightUnit(String pickupTotalWeightUnit) {
    this.pickupTotalWeightUnit = pickupTotalWeightUnit;
  }

  public SchedulePickup200Response pickupOptions(GetAllPickupsDataInnerPickupOptions pickupOptions) {
    
    this.pickupOptions = pickupOptions;
    return this;
  }

  /**
   * Get pickupOptions
   * @return pickupOptions
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PICKUP_OPTIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public GetAllPickupsDataInnerPickupOptions getPickupOptions() {
    return pickupOptions;
  }


  @JsonProperty(JSON_PROPERTY_PICKUP_OPTIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPickupOptions(GetAllPickupsDataInnerPickupOptions pickupOptions) {
    this.pickupOptions = pickupOptions;
  }

  public SchedulePickup200Response pickupRate(SchedulePickupUPSResponsePickupRate pickupRate) {
    
    this.pickupRate = pickupRate;
    return this;
  }

  /**
   * Get pickupRate
   * @return pickupRate
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PICKUP_RATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public SchedulePickupUPSResponsePickupRate getPickupRate() {
    return pickupRate;
  }


  @JsonProperty(JSON_PROPERTY_PICKUP_RATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPickupRate(SchedulePickupUPSResponsePickupRate pickupRate) {
    this.pickupRate = pickupRate;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SchedulePickup200Response schedulePickup200Response = (SchedulePickup200Response) o;
    return Objects.equals(this.packageLocation, schedulePickup200Response.packageLocation) &&
        Objects.equals(this.pickupConfirmationNumber, schedulePickup200Response.pickupConfirmationNumber) &&
        Objects.equals(this.pickupId, schedulePickup200Response.pickupId) &&
        Objects.equals(this.carrier, schedulePickup200Response.carrier) &&
        Objects.equals(this.carrierAccountId, schedulePickup200Response.carrierAccountId) &&
        Objects.equals(this.pickupAddress, schedulePickup200Response.pickupAddress) &&
        Objects.equals(this.shipmentIds, schedulePickup200Response.shipmentIds) &&
        Objects.equals(this.pickupSummary, schedulePickup200Response.pickupSummary) &&
        Objects.equals(this.additionalnotes, schedulePickup200Response.additionalnotes) &&
        Objects.equals(this.reference, schedulePickup200Response.reference) &&
        Objects.equals(this.pickupDateTime, schedulePickup200Response.pickupDateTime) &&
        Objects.equals(this.pickupTotalWeight, schedulePickup200Response.pickupTotalWeight) &&
        Objects.equals(this.pickupTotalWeightUnit, schedulePickup200Response.pickupTotalWeightUnit) &&
        Objects.equals(this.pickupOptions, schedulePickup200Response.pickupOptions) &&
        Objects.equals(this.pickupRate, schedulePickup200Response.pickupRate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(packageLocation, pickupConfirmationNumber, pickupId, carrier, carrierAccountId, pickupAddress, shipmentIds, pickupSummary, additionalnotes, reference, pickupDateTime, pickupTotalWeight, pickupTotalWeightUnit, pickupOptions, pickupRate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SchedulePickup200Response {\n");
    sb.append("    packageLocation: ").append(toIndentedString(packageLocation)).append("\n");
    sb.append("    pickupConfirmationNumber: ").append(toIndentedString(pickupConfirmationNumber)).append("\n");
    sb.append("    pickupId: ").append(toIndentedString(pickupId)).append("\n");
    sb.append("    carrier: ").append(toIndentedString(carrier)).append("\n");
    sb.append("    carrierAccountId: ").append(toIndentedString(carrierAccountId)).append("\n");
    sb.append("    pickupAddress: ").append(toIndentedString(pickupAddress)).append("\n");
    sb.append("    shipmentIds: ").append(toIndentedString(shipmentIds)).append("\n");
    sb.append("    pickupSummary: ").append(toIndentedString(pickupSummary)).append("\n");
    sb.append("    additionalnotes: ").append(toIndentedString(additionalnotes)).append("\n");
    sb.append("    reference: ").append(toIndentedString(reference)).append("\n");
    sb.append("    pickupDateTime: ").append(toIndentedString(pickupDateTime)).append("\n");
    sb.append("    pickupTotalWeight: ").append(toIndentedString(pickupTotalWeight)).append("\n");
    sb.append("    pickupTotalWeightUnit: ").append(toIndentedString(pickupTotalWeightUnit)).append("\n");
    sb.append("    pickupOptions: ").append(toIndentedString(pickupOptions)).append("\n");
    sb.append("    pickupRate: ").append(toIndentedString(pickupRate)).append("\n");
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

