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
 * Shipment Options have an added feature that is Manifest.&lt;br /&gt; With Manifest, the Mail Center agent can print the Manifest (End of day records of all created shipment) of selected carrier.
 */
@JsonPropertyOrder({
  ShipmentDomesticByCarrierShipmentOptions.JSON_PROPERTY_ADD_TO_MANIFEST
})
@JsonTypeName("shipmentDomesticByCarrier_shipmentOptions")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-09-30T12:57:37.504069+05:30[Asia/Kolkata]", comments = "Generator version: 7.7.0")
public class ShipmentDomesticByCarrierShipmentOptions {
  public static final String JSON_PROPERTY_ADD_TO_MANIFEST = "addToManifest";
  private Boolean addToManifest;

  public ShipmentDomesticByCarrierShipmentOptions() {
  }

  public ShipmentDomesticByCarrierShipmentOptions addToManifest(Boolean addToManifest) {
    
    this.addToManifest = addToManifest;
    return this;
  }

  /**
   * This option asks if the shipment is to be added for Manifest, so that the shipment will reflect in the Manifest Form while compilation. &lt;br /&gt; The value can be &#39;true&#39; or &#39;false&#39;.
   * @return addToManifest
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ADD_TO_MANIFEST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getAddToManifest() {
    return addToManifest;
  }


  @JsonProperty(JSON_PROPERTY_ADD_TO_MANIFEST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAddToManifest(Boolean addToManifest) {
    this.addToManifest = addToManifest;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ShipmentDomesticByCarrierShipmentOptions shipmentDomesticByCarrierShipmentOptions = (ShipmentDomesticByCarrierShipmentOptions) o;
    return Objects.equals(this.addToManifest, shipmentDomesticByCarrierShipmentOptions.addToManifest);
  }

  @Override
  public int hashCode() {
    return Objects.hash(addToManifest);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ShipmentDomesticByCarrierShipmentOptions {\n");
    sb.append("    addToManifest: ").append(toIndentedString(addToManifest)).append("\n");
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

