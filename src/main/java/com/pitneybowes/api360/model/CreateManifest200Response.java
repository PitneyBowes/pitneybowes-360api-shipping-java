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
import com.pitneybowes.api360.model.ManifestCompactResponse;
import com.pitneybowes.api360.model.ManifestCompactResponseManifestDocumentsInner;
import com.pitneybowes.api360.model.ManifestDetailedResponse;
import com.pitneybowes.api360.model.ManifestDetailedResponseFromAddress;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * CreateManifest200Response
 */
@JsonPropertyOrder({
  CreateManifest200Response.JSON_PROPERTY_CARRIER_ACCOUNT_ID,
  CreateManifest200Response.JSON_PROPERTY_CARRIER_NAME,
  CreateManifest200Response.JSON_PROPERTY_MANIFEST_DOCUMENTS,
  CreateManifest200Response.JSON_PROPERTY_MANIFEST_I_D,
  CreateManifest200Response.JSON_PROPERTY_MANIFEST_TRACKING_NUMBER,
  CreateManifest200Response.JSON_PROPERTY_FROM_ADDRESS,
  CreateManifest200Response.JSON_PROPERTY_PARCEL_TRACKING_NUMBERS,
  CreateManifest200Response.JSON_PROPERTY_SUBMISSION_DATE
})
@JsonTypeName("createManifest_200_response")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-09-30T12:57:37.504069+05:30[Asia/Kolkata]", comments = "Generator version: 7.7.0")
public class CreateManifest200Response {
  public static final String JSON_PROPERTY_CARRIER_ACCOUNT_ID = "carrierAccountId";
  private String carrierAccountId;

  public static final String JSON_PROPERTY_CARRIER_NAME = "carrierName";
  private String carrierName;

  public static final String JSON_PROPERTY_MANIFEST_DOCUMENTS = "manifestDocuments";
  private List<ManifestCompactResponseManifestDocumentsInner> manifestDocuments = new ArrayList<>();

  public static final String JSON_PROPERTY_MANIFEST_I_D = "manifestID";
  private String manifestID;

  public static final String JSON_PROPERTY_MANIFEST_TRACKING_NUMBER = "manifestTrackingNumber";
  private String manifestTrackingNumber;

  public static final String JSON_PROPERTY_FROM_ADDRESS = "fromAddress";
  private ManifestDetailedResponseFromAddress fromAddress;

  public static final String JSON_PROPERTY_PARCEL_TRACKING_NUMBERS = "parcelTrackingNumbers";
  private List<Object> parcelTrackingNumbers = new ArrayList<>();

  public static final String JSON_PROPERTY_SUBMISSION_DATE = "submissionDate";
  private String submissionDate;

  public CreateManifest200Response() {
  }

  public CreateManifest200Response carrierAccountId(String carrierAccountId) {
    
    this.carrierAccountId = carrierAccountId;
    return this;
  }

  /**
   * A unique identifier associated with the Carrier account which is used while creating Manifest.
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

  public CreateManifest200Response carrierName(String carrierName) {
    
    this.carrierName = carrierName;
    return this;
  }

  /**
   * Name of the Carrier.
   * @return carrierName
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CARRIER_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCarrierName() {
    return carrierName;
  }


  @JsonProperty(JSON_PROPERTY_CARRIER_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCarrierName(String carrierName) {
    this.carrierName = carrierName;
  }

  public CreateManifest200Response manifestDocuments(List<ManifestCompactResponseManifestDocumentsInner> manifestDocuments) {
    
    this.manifestDocuments = manifestDocuments;
    return this;
  }

  public CreateManifest200Response addManifestDocumentsItem(ManifestCompactResponseManifestDocumentsInner manifestDocumentsItem) {
    if (this.manifestDocuments == null) {
      this.manifestDocuments = new ArrayList<>();
    }
    this.manifestDocuments.add(manifestDocumentsItem);
    return this;
  }

  /**
   * Get manifestDocuments
   * @return manifestDocuments
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MANIFEST_DOCUMENTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<ManifestCompactResponseManifestDocumentsInner> getManifestDocuments() {
    return manifestDocuments;
  }


  @JsonProperty(JSON_PROPERTY_MANIFEST_DOCUMENTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setManifestDocuments(List<ManifestCompactResponseManifestDocumentsInner> manifestDocuments) {
    this.manifestDocuments = manifestDocuments;
  }

  public CreateManifest200Response manifestID(String manifestID) {
    
    this.manifestID = manifestID;
    return this;
  }

  /**
   * Get manifestID
   * @return manifestID
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MANIFEST_I_D)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getManifestID() {
    return manifestID;
  }


  @JsonProperty(JSON_PROPERTY_MANIFEST_I_D)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setManifestID(String manifestID) {
    this.manifestID = manifestID;
  }

  public CreateManifest200Response manifestTrackingNumber(String manifestTrackingNumber) {
    
    this.manifestTrackingNumber = manifestTrackingNumber;
    return this;
  }

  /**
   * Get manifestTrackingNumber
   * @return manifestTrackingNumber
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MANIFEST_TRACKING_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getManifestTrackingNumber() {
    return manifestTrackingNumber;
  }


  @JsonProperty(JSON_PROPERTY_MANIFEST_TRACKING_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setManifestTrackingNumber(String manifestTrackingNumber) {
    this.manifestTrackingNumber = manifestTrackingNumber;
  }

  public CreateManifest200Response fromAddress(ManifestDetailedResponseFromAddress fromAddress) {
    
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

  public ManifestDetailedResponseFromAddress getFromAddress() {
    return fromAddress;
  }


  @JsonProperty(JSON_PROPERTY_FROM_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFromAddress(ManifestDetailedResponseFromAddress fromAddress) {
    this.fromAddress = fromAddress;
  }

  public CreateManifest200Response parcelTrackingNumbers(List<Object> parcelTrackingNumbers) {
    
    this.parcelTrackingNumbers = parcelTrackingNumbers;
    return this;
  }

  public CreateManifest200Response addParcelTrackingNumbersItem(Object parcelTrackingNumbersItem) {
    if (this.parcelTrackingNumbers == null) {
      this.parcelTrackingNumbers = new ArrayList<>();
    }
    this.parcelTrackingNumbers.add(parcelTrackingNumbersItem);
    return this;
  }

  /**
   * Get parcelTrackingNumbers
   * @return parcelTrackingNumbers
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PARCEL_TRACKING_NUMBERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Object> getParcelTrackingNumbers() {
    return parcelTrackingNumbers;
  }


  @JsonProperty(JSON_PROPERTY_PARCEL_TRACKING_NUMBERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setParcelTrackingNumbers(List<Object> parcelTrackingNumbers) {
    this.parcelTrackingNumbers = parcelTrackingNumbers;
  }

  public CreateManifest200Response submissionDate(String submissionDate) {
    
    this.submissionDate = submissionDate;
    return this;
  }

  /**
   * The date the shipments are to be tendered to the carrier, entered as YYYY-MM-DD.
   * @return submissionDate
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SUBMISSION_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getSubmissionDate() {
    return submissionDate;
  }


  @JsonProperty(JSON_PROPERTY_SUBMISSION_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSubmissionDate(String submissionDate) {
    this.submissionDate = submissionDate;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateManifest200Response createManifest200Response = (CreateManifest200Response) o;
    return Objects.equals(this.carrierAccountId, createManifest200Response.carrierAccountId) &&
        Objects.equals(this.carrierName, createManifest200Response.carrierName) &&
        Objects.equals(this.manifestDocuments, createManifest200Response.manifestDocuments) &&
        Objects.equals(this.manifestID, createManifest200Response.manifestID) &&
        Objects.equals(this.manifestTrackingNumber, createManifest200Response.manifestTrackingNumber) &&
        Objects.equals(this.fromAddress, createManifest200Response.fromAddress) &&
        Objects.equals(this.parcelTrackingNumbers, createManifest200Response.parcelTrackingNumbers) &&
        Objects.equals(this.submissionDate, createManifest200Response.submissionDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(carrierAccountId, carrierName, manifestDocuments, manifestID, manifestTrackingNumber, fromAddress, parcelTrackingNumbers, submissionDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateManifest200Response {\n");
    sb.append("    carrierAccountId: ").append(toIndentedString(carrierAccountId)).append("\n");
    sb.append("    carrierName: ").append(toIndentedString(carrierName)).append("\n");
    sb.append("    manifestDocuments: ").append(toIndentedString(manifestDocuments)).append("\n");
    sb.append("    manifestID: ").append(toIndentedString(manifestID)).append("\n");
    sb.append("    manifestTrackingNumber: ").append(toIndentedString(manifestTrackingNumber)).append("\n");
    sb.append("    fromAddress: ").append(toIndentedString(fromAddress)).append("\n");
    sb.append("    parcelTrackingNumbers: ").append(toIndentedString(parcelTrackingNumbers)).append("\n");
    sb.append("    submissionDate: ").append(toIndentedString(submissionDate)).append("\n");
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

