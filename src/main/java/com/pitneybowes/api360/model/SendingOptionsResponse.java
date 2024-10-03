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
import com.pitneybowes.api360.model.FromAddressV2Response;
import com.pitneybowes.api360.model.ParcelV2Response;
import com.pitneybowes.api360.model.SendingOptionsResponseCarrierAccounts;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Sending Options includes used carrier related details, sender details, and parcel details.
 */
@JsonPropertyOrder({
  SendingOptionsResponse.JSON_PROPERTY_CARRIER,
  SendingOptionsResponse.JSON_PROPERTY_SERVICE,
  SendingOptionsResponse.JSON_PROPERTY_CARRIER_ACCOUNTS,
  SendingOptionsResponse.JSON_PROPERTY_LABEL_SIZE,
  SendingOptionsResponse.JSON_PROPERTY_LABEL_TYPE,
  SendingOptionsResponse.JSON_PROPERTY_LABEL_FORMAT,
  SendingOptionsResponse.JSON_PROPERTY_FROM_ADDRESS,
  SendingOptionsResponse.JSON_PROPERTY_PARCEL
})
@JsonTypeName("sendingOptionsResponse")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-09-30T12:57:37.504069+05:30[Asia/Kolkata]", comments = "Generator version: 7.7.0")
public class SendingOptionsResponse {
  public static final String JSON_PROPERTY_CARRIER = "carrier";
  private String carrier;

  public static final String JSON_PROPERTY_SERVICE = "service";
  private String service;

  public static final String JSON_PROPERTY_CARRIER_ACCOUNTS = "carrierAccounts";
  private SendingOptionsResponseCarrierAccounts carrierAccounts;

  /**
   * Size of the label, e.g., DOC_4X6.
   */
  public enum LabelSizeEnum {
    DOC_4_X6("DOC_4X6");

    private String value;

    LabelSizeEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static LabelSizeEnum fromValue(String value) {
      for (LabelSizeEnum b : LabelSizeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_LABEL_SIZE = "labelSize";
  private LabelSizeEnum labelSize;

  public static final String JSON_PROPERTY_LABEL_TYPE = "labelType";
  private String labelType;

  public static final String JSON_PROPERTY_LABEL_FORMAT = "labelFormat";
  private String labelFormat;

  public static final String JSON_PROPERTY_FROM_ADDRESS = "fromAddress";
  private FromAddressV2Response fromAddress;

  public static final String JSON_PROPERTY_PARCEL = "parcel";
  private ParcelV2Response parcel;

  public SendingOptionsResponse() {
  }

  public SendingOptionsResponse carrier(String carrier) {
    
    this.carrier = carrier;
    return this;
  }

  /**
   * Name of the carrier. E.g., FedEx.
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

  public SendingOptionsResponse service(String service) {
    
    this.service = service;
    return this;
  }

  /**
   * Name of the carrier-based service. E.g., 2DA.
   * @return service
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SERVICE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getService() {
    return service;
  }


  @JsonProperty(JSON_PROPERTY_SERVICE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setService(String service) {
    this.service = service;
  }

  public SendingOptionsResponse carrierAccounts(SendingOptionsResponseCarrierAccounts carrierAccounts) {
    
    this.carrierAccounts = carrierAccounts;
    return this;
  }

  /**
   * Get carrierAccounts
   * @return carrierAccounts
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CARRIER_ACCOUNTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public SendingOptionsResponseCarrierAccounts getCarrierAccounts() {
    return carrierAccounts;
  }


  @JsonProperty(JSON_PROPERTY_CARRIER_ACCOUNTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCarrierAccounts(SendingOptionsResponseCarrierAccounts carrierAccounts) {
    this.carrierAccounts = carrierAccounts;
  }

  public SendingOptionsResponse labelSize(LabelSizeEnum labelSize) {
    
    this.labelSize = labelSize;
    return this;
  }

  /**
   * Size of the label, e.g., DOC_4X6.
   * @return labelSize
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LABEL_SIZE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public LabelSizeEnum getLabelSize() {
    return labelSize;
  }


  @JsonProperty(JSON_PROPERTY_LABEL_SIZE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLabelSize(LabelSizeEnum labelSize) {
    this.labelSize = labelSize;
  }

  public SendingOptionsResponse labelType(String labelType) {
    
    this.labelType = labelType;
    return this;
  }

  /**
   * Type of the Label, e.g., Shipping_Label.
   * @return labelType
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LABEL_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getLabelType() {
    return labelType;
  }


  @JsonProperty(JSON_PROPERTY_LABEL_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLabelType(String labelType) {
    this.labelType = labelType;
  }

  public SendingOptionsResponse labelFormat(String labelFormat) {
    
    this.labelFormat = labelFormat;
    return this;
  }

  /**
   * Format of the Label, e.g., PDF.
   * @return labelFormat
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LABEL_FORMAT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getLabelFormat() {
    return labelFormat;
  }


  @JsonProperty(JSON_PROPERTY_LABEL_FORMAT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLabelFormat(String labelFormat) {
    this.labelFormat = labelFormat;
  }

  public SendingOptionsResponse fromAddress(FromAddressV2Response fromAddress) {
    
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

  public FromAddressV2Response getFromAddress() {
    return fromAddress;
  }


  @JsonProperty(JSON_PROPERTY_FROM_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFromAddress(FromAddressV2Response fromAddress) {
    this.fromAddress = fromAddress;
  }

  public SendingOptionsResponse parcel(ParcelV2Response parcel) {
    
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

  public ParcelV2Response getParcel() {
    return parcel;
  }


  @JsonProperty(JSON_PROPERTY_PARCEL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setParcel(ParcelV2Response parcel) {
    this.parcel = parcel;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SendingOptionsResponse sendingOptionsResponse = (SendingOptionsResponse) o;
    return Objects.equals(this.carrier, sendingOptionsResponse.carrier) &&
        Objects.equals(this.service, sendingOptionsResponse.service) &&
        Objects.equals(this.carrierAccounts, sendingOptionsResponse.carrierAccounts) &&
        Objects.equals(this.labelSize, sendingOptionsResponse.labelSize) &&
        Objects.equals(this.labelType, sendingOptionsResponse.labelType) &&
        Objects.equals(this.labelFormat, sendingOptionsResponse.labelFormat) &&
        Objects.equals(this.fromAddress, sendingOptionsResponse.fromAddress) &&
        Objects.equals(this.parcel, sendingOptionsResponse.parcel);
  }

  @Override
  public int hashCode() {
    return Objects.hash(carrier, service, carrierAccounts, labelSize, labelType, labelFormat, fromAddress, parcel);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SendingOptionsResponse {\n");
    sb.append("    carrier: ").append(toIndentedString(carrier)).append("\n");
    sb.append("    service: ").append(toIndentedString(service)).append("\n");
    sb.append("    carrierAccounts: ").append(toIndentedString(carrierAccounts)).append("\n");
    sb.append("    labelSize: ").append(toIndentedString(labelSize)).append("\n");
    sb.append("    labelType: ").append(toIndentedString(labelType)).append("\n");
    sb.append("    labelFormat: ").append(toIndentedString(labelFormat)).append("\n");
    sb.append("    fromAddress: ").append(toIndentedString(fromAddress)).append("\n");
    sb.append("    parcel: ").append(toIndentedString(parcel)).append("\n");
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

