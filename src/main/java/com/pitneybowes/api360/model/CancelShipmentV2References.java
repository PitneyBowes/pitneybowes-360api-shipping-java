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
 * Contains key value map for passing references which is printed on Shipping Label. &lt;br /&gt;For example Department Name, Invoice No., PO No., Package description, Order No./ Purchase Order No., Carrier note, Cost Account No., Transportation No., etc. . Max references allowed here is 2, and max length of each Reference field is 35. [IN/OUT].
 */
@JsonPropertyOrder({
  CancelShipmentV2References.JSON_PROPERTY_ADDITIONAL_REFERENCE1,
  CancelShipmentV2References.JSON_PROPERTY_ADDITIONAL_REFERENCE2
})
@JsonTypeName("cancelShipmentV2_references")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-09-30T12:57:37.504069+05:30[Asia/Kolkata]", comments = "Generator version: 7.7.0")
public class CancelShipmentV2References {
  public static final String JSON_PROPERTY_ADDITIONAL_REFERENCE1 = "additionalReference1";
  private String additionalReference1;

  public static final String JSON_PROPERTY_ADDITIONAL_REFERENCE2 = "additionalReference2";
  private String additionalReference2;

  public CancelShipmentV2References() {
  }

  public CancelShipmentV2References additionalReference1(String additionalReference1) {
    
    this.additionalReference1 = additionalReference1;
    return this;
  }

  /**
   * Additional Reference is hardly used, but sender can mention anything as per requirement, just for Recipient&#39;s information. &lt;br /&gt; &#x60;Max length &#x3D; 30&#x60;.
   * @return additionalReference1
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ADDITIONAL_REFERENCE1)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAdditionalReference1() {
    return additionalReference1;
  }


  @JsonProperty(JSON_PROPERTY_ADDITIONAL_REFERENCE1)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAdditionalReference1(String additionalReference1) {
    this.additionalReference1 = additionalReference1;
  }

  public CancelShipmentV2References additionalReference2(String additionalReference2) {
    
    this.additionalReference2 = additionalReference2;
    return this;
  }

  /**
   * Any tags or information that to be shown to Recipient, can be mentioned by Sender, which is not indicated on AdditionalReference1 field, e.g. PO No, Order No. etc.&lt;br /&gt; &#x60;Max length &#x3D; 30&#x60;.
   * @return additionalReference2
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ADDITIONAL_REFERENCE2)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAdditionalReference2() {
    return additionalReference2;
  }


  @JsonProperty(JSON_PROPERTY_ADDITIONAL_REFERENCE2)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAdditionalReference2(String additionalReference2) {
    this.additionalReference2 = additionalReference2;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CancelShipmentV2References cancelShipmentV2References = (CancelShipmentV2References) o;
    return Objects.equals(this.additionalReference1, cancelShipmentV2References.additionalReference1) &&
        Objects.equals(this.additionalReference2, cancelShipmentV2References.additionalReference2);
  }

  @Override
  public int hashCode() {
    return Objects.hash(additionalReference1, additionalReference2);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CancelShipmentV2References {\n");
    sb.append("    additionalReference1: ").append(toIndentedString(additionalReference1)).append("\n");
    sb.append("    additionalReference2: ").append(toIndentedString(additionalReference2)).append("\n");
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

