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
import com.pitneybowes.api360.model.FromAddress;
import com.pitneybowes.api360.model.GetShipmentsForBatchDataInnerLabelLayout;
import com.pitneybowes.api360.model.GetShipmentsForBatchDataInnerMetadataInner;
import com.pitneybowes.api360.model.GetShipmentsForBatchDataInnerSpecialServicesInner;
import com.pitneybowes.api360.model.GetShipmentsForBatchDataInnerStepStatus;
import com.pitneybowes.api360.model.Parcel;
import com.pitneybowes.api360.model.ShipmentOptions;
import com.pitneybowes.api360.model.ToAddress;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * GetShipmentsForBatchDataInner
 */
@JsonPropertyOrder({
  GetShipmentsForBatchDataInner.JSON_PROPERTY_BATCH_ID,
  GetShipmentsForBatchDataInner.JSON_PROPERTY_CARRIER_ACCOUNT_ID,
  GetShipmentsForBatchDataInner.JSON_PROPERTY_EXTERNAL_ID,
  GetShipmentsForBatchDataInner.JSON_PROPERTY_FROM_ADDRESS,
  GetShipmentsForBatchDataInner.JSON_PROPERTY_LABEL_LAYOUT,
  GetShipmentsForBatchDataInner.JSON_PROPERTY_METADATA,
  GetShipmentsForBatchDataInner.JSON_PROPERTY_PARCEL,
  GetShipmentsForBatchDataInner.JSON_PROPERTY_PARCEL_TYPE,
  GetShipmentsForBatchDataInner.JSON_PROPERTY_SERVICE_ID,
  GetShipmentsForBatchDataInner.JSON_PROPERTY_SHIPMENT_ID,
  GetShipmentsForBatchDataInner.JSON_PROPERTY_SHIPMENT_IDENTIFIER,
  GetShipmentsForBatchDataInner.JSON_PROPERTY_SHIPMENT_OPTIONS,
  GetShipmentsForBatchDataInner.JSON_PROPERTY_SPECIAL_SERVICES,
  GetShipmentsForBatchDataInner.JSON_PROPERTY_STEP_STATUS,
  GetShipmentsForBatchDataInner.JSON_PROPERTY_TO_ADDRESS
})
@JsonTypeName("getShipmentsForBatch_data_inner")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-09-30T12:57:37.504069+05:30[Asia/Kolkata]", comments = "Generator version: 7.7.0")
public class GetShipmentsForBatchDataInner {
  public static final String JSON_PROPERTY_BATCH_ID = "batchId";
  private String batchId;

  public static final String JSON_PROPERTY_CARRIER_ACCOUNT_ID = "carrierAccountId";
  private String carrierAccountId;

  public static final String JSON_PROPERTY_EXTERNAL_ID = "externalId";
  private String externalId;

  public static final String JSON_PROPERTY_FROM_ADDRESS = "fromAddress";
  private FromAddress fromAddress;

  public static final String JSON_PROPERTY_LABEL_LAYOUT = "labelLayout";
  private GetShipmentsForBatchDataInnerLabelLayout labelLayout;

  public static final String JSON_PROPERTY_METADATA = "metadata";
  private List<GetShipmentsForBatchDataInnerMetadataInner> metadata = new ArrayList<>();

  public static final String JSON_PROPERTY_PARCEL = "parcel";
  private Parcel parcel;

  public static final String JSON_PROPERTY_PARCEL_TYPE = "parcelType";
  private String parcelType;

  public static final String JSON_PROPERTY_SERVICE_ID = "serviceId";
  private String serviceId;

  public static final String JSON_PROPERTY_SHIPMENT_ID = "shipmentId";
  private String shipmentId;

  public static final String JSON_PROPERTY_SHIPMENT_IDENTIFIER = "shipmentIdentifier";
  private String shipmentIdentifier;

  public static final String JSON_PROPERTY_SHIPMENT_OPTIONS = "shipmentOptions";
  private ShipmentOptions shipmentOptions;

  public static final String JSON_PROPERTY_SPECIAL_SERVICES = "specialServices";
  private List<GetShipmentsForBatchDataInnerSpecialServicesInner> specialServices = new ArrayList<>();

  public static final String JSON_PROPERTY_STEP_STATUS = "stepStatus";
  private GetShipmentsForBatchDataInnerStepStatus stepStatus;

  public static final String JSON_PROPERTY_TO_ADDRESS = "toAddress";
  private ToAddress toAddress;

  public GetShipmentsForBatchDataInner() {
  }

  public GetShipmentsForBatchDataInner batchId(String batchId) {
    
    this.batchId = batchId;
    return this;
  }

  /**
   * This is a system-generated unique identifier assigned to the Batch while it is processed.
   * @return batchId
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_BATCH_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getBatchId() {
    return batchId;
  }


  @JsonProperty(JSON_PROPERTY_BATCH_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBatchId(String batchId) {
    this.batchId = batchId;
  }

  public GetShipmentsForBatchDataInner carrierAccountId(String carrierAccountId) {
    
    this.carrierAccountId = carrierAccountId;
    return this;
  }

  /**
   * A unique identifier associated with the Carrier account used by client users during shipment process.
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

  public GetShipmentsForBatchDataInner externalId(String externalId) {
    
    this.externalId = externalId;
    return this;
  }

  /**
   * This is a user-defined value provided by users just for their reference. This is for mapping purpose against each shipment.
   * @return externalId
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EXTERNAL_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getExternalId() {
    return externalId;
  }


  @JsonProperty(JSON_PROPERTY_EXTERNAL_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setExternalId(String externalId) {
    this.externalId = externalId;
  }

  public GetShipmentsForBatchDataInner fromAddress(FromAddress fromAddress) {
    
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

  public FromAddress getFromAddress() {
    return fromAddress;
  }


  @JsonProperty(JSON_PROPERTY_FROM_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFromAddress(FromAddress fromAddress) {
    this.fromAddress = fromAddress;
  }

  public GetShipmentsForBatchDataInner labelLayout(GetShipmentsForBatchDataInnerLabelLayout labelLayout) {
    
    this.labelLayout = labelLayout;
    return this;
  }

  /**
   * Get labelLayout
   * @return labelLayout
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LABEL_LAYOUT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public GetShipmentsForBatchDataInnerLabelLayout getLabelLayout() {
    return labelLayout;
  }


  @JsonProperty(JSON_PROPERTY_LABEL_LAYOUT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLabelLayout(GetShipmentsForBatchDataInnerLabelLayout labelLayout) {
    this.labelLayout = labelLayout;
  }

  public GetShipmentsForBatchDataInner metadata(List<GetShipmentsForBatchDataInnerMetadataInner> metadata) {
    
    this.metadata = metadata;
    return this;
  }

  public GetShipmentsForBatchDataInner addMetadataItem(GetShipmentsForBatchDataInnerMetadataInner metadataItem) {
    if (this.metadata == null) {
      this.metadata = new ArrayList<>();
    }
    this.metadata.add(metadataItem);
    return this;
  }

  /**
   * Additional metadata that needs to be stored for this shipment can be added here. For now, &#x60;costAccountName&#x60; is supported.
   * @return metadata
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_METADATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<GetShipmentsForBatchDataInnerMetadataInner> getMetadata() {
    return metadata;
  }


  @JsonProperty(JSON_PROPERTY_METADATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMetadata(List<GetShipmentsForBatchDataInnerMetadataInner> metadata) {
    this.metadata = metadata;
  }

  public GetShipmentsForBatchDataInner parcel(Parcel parcel) {
    
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

  public Parcel getParcel() {
    return parcel;
  }


  @JsonProperty(JSON_PROPERTY_PARCEL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setParcel(Parcel parcel) {
    this.parcel = parcel;
  }

  public GetShipmentsForBatchDataInner parcelType(String parcelType) {
    
    this.parcelType = parcelType;
    return this;
  }

  /**
   * Parcel Type is required for creating a shipment while rating a parcel. And it varies as per carrier selection and corresponding services.
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

  public GetShipmentsForBatchDataInner serviceId(String serviceId) {
    
    this.serviceId = serviceId;
    return this;
  }

  /**
   * A unique identifier given to the carrier-specific service. User can override this value by defining it at Shipment level.
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

  public GetShipmentsForBatchDataInner shipmentId(String shipmentId) {
    
    this.shipmentId = shipmentId;
    return this;
  }

  /**
   * Shipment ID is a unique identifier for an individual shipment
   * @return shipmentId
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SHIPMENT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getShipmentId() {
    return shipmentId;
  }


  @JsonProperty(JSON_PROPERTY_SHIPMENT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setShipmentId(String shipmentId) {
    this.shipmentId = shipmentId;
  }

  public GetShipmentsForBatchDataInner shipmentIdentifier(String shipmentIdentifier) {
    
    this.shipmentIdentifier = shipmentIdentifier;
    return this;
  }

  /**
   * Unique identifier generated for each shipment, it can be either success or failed.
   * @return shipmentIdentifier
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SHIPMENT_IDENTIFIER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getShipmentIdentifier() {
    return shipmentIdentifier;
  }


  @JsonProperty(JSON_PROPERTY_SHIPMENT_IDENTIFIER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setShipmentIdentifier(String shipmentIdentifier) {
    this.shipmentIdentifier = shipmentIdentifier;
  }

  public GetShipmentsForBatchDataInner shipmentOptions(ShipmentOptions shipmentOptions) {
    
    this.shipmentOptions = shipmentOptions;
    return this;
  }

  /**
   * Get shipmentOptions
   * @return shipmentOptions
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SHIPMENT_OPTIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ShipmentOptions getShipmentOptions() {
    return shipmentOptions;
  }


  @JsonProperty(JSON_PROPERTY_SHIPMENT_OPTIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setShipmentOptions(ShipmentOptions shipmentOptions) {
    this.shipmentOptions = shipmentOptions;
  }

  public GetShipmentsForBatchDataInner specialServices(List<GetShipmentsForBatchDataInnerSpecialServicesInner> specialServices) {
    
    this.specialServices = specialServices;
    return this;
  }

  public GetShipmentsForBatchDataInner addSpecialServicesItem(GetShipmentsForBatchDataInnerSpecialServicesInner specialServicesItem) {
    if (this.specialServices == null) {
      this.specialServices = new ArrayList<>();
    }
    this.specialServices.add(specialServicesItem);
    return this;
  }

  /**
   * Special services used to create shipment
   * @return specialServices
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SPECIAL_SERVICES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<GetShipmentsForBatchDataInnerSpecialServicesInner> getSpecialServices() {
    return specialServices;
  }


  @JsonProperty(JSON_PROPERTY_SPECIAL_SERVICES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSpecialServices(List<GetShipmentsForBatchDataInnerSpecialServicesInner> specialServices) {
    this.specialServices = specialServices;
  }

  public GetShipmentsForBatchDataInner stepStatus(GetShipmentsForBatchDataInnerStepStatus stepStatus) {
    
    this.stepStatus = stepStatus;
    return this;
  }

  /**
   * Get stepStatus
   * @return stepStatus
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_STEP_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public GetShipmentsForBatchDataInnerStepStatus getStepStatus() {
    return stepStatus;
  }


  @JsonProperty(JSON_PROPERTY_STEP_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStepStatus(GetShipmentsForBatchDataInnerStepStatus stepStatus) {
    this.stepStatus = stepStatus;
  }

  public GetShipmentsForBatchDataInner toAddress(ToAddress toAddress) {
    
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

  public ToAddress getToAddress() {
    return toAddress;
  }


  @JsonProperty(JSON_PROPERTY_TO_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setToAddress(ToAddress toAddress) {
    this.toAddress = toAddress;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetShipmentsForBatchDataInner getShipmentsForBatchDataInner = (GetShipmentsForBatchDataInner) o;
    return Objects.equals(this.batchId, getShipmentsForBatchDataInner.batchId) &&
        Objects.equals(this.carrierAccountId, getShipmentsForBatchDataInner.carrierAccountId) &&
        Objects.equals(this.externalId, getShipmentsForBatchDataInner.externalId) &&
        Objects.equals(this.fromAddress, getShipmentsForBatchDataInner.fromAddress) &&
        Objects.equals(this.labelLayout, getShipmentsForBatchDataInner.labelLayout) &&
        Objects.equals(this.metadata, getShipmentsForBatchDataInner.metadata) &&
        Objects.equals(this.parcel, getShipmentsForBatchDataInner.parcel) &&
        Objects.equals(this.parcelType, getShipmentsForBatchDataInner.parcelType) &&
        Objects.equals(this.serviceId, getShipmentsForBatchDataInner.serviceId) &&
        Objects.equals(this.shipmentId, getShipmentsForBatchDataInner.shipmentId) &&
        Objects.equals(this.shipmentIdentifier, getShipmentsForBatchDataInner.shipmentIdentifier) &&
        Objects.equals(this.shipmentOptions, getShipmentsForBatchDataInner.shipmentOptions) &&
        Objects.equals(this.specialServices, getShipmentsForBatchDataInner.specialServices) &&
        Objects.equals(this.stepStatus, getShipmentsForBatchDataInner.stepStatus) &&
        Objects.equals(this.toAddress, getShipmentsForBatchDataInner.toAddress);
  }

  @Override
  public int hashCode() {
    return Objects.hash(batchId, carrierAccountId, externalId, fromAddress, labelLayout, metadata, parcel, parcelType, serviceId, shipmentId, shipmentIdentifier, shipmentOptions, specialServices, stepStatus, toAddress);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetShipmentsForBatchDataInner {\n");
    sb.append("    batchId: ").append(toIndentedString(batchId)).append("\n");
    sb.append("    carrierAccountId: ").append(toIndentedString(carrierAccountId)).append("\n");
    sb.append("    externalId: ").append(toIndentedString(externalId)).append("\n");
    sb.append("    fromAddress: ").append(toIndentedString(fromAddress)).append("\n");
    sb.append("    labelLayout: ").append(toIndentedString(labelLayout)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    parcel: ").append(toIndentedString(parcel)).append("\n");
    sb.append("    parcelType: ").append(toIndentedString(parcelType)).append("\n");
    sb.append("    serviceId: ").append(toIndentedString(serviceId)).append("\n");
    sb.append("    shipmentId: ").append(toIndentedString(shipmentId)).append("\n");
    sb.append("    shipmentIdentifier: ").append(toIndentedString(shipmentIdentifier)).append("\n");
    sb.append("    shipmentOptions: ").append(toIndentedString(shipmentOptions)).append("\n");
    sb.append("    specialServices: ").append(toIndentedString(specialServices)).append("\n");
    sb.append("    stepStatus: ").append(toIndentedString(stepStatus)).append("\n");
    sb.append("    toAddress: ").append(toIndentedString(toAddress)).append("\n");
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

