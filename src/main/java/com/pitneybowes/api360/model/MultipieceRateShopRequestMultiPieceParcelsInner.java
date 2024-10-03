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
import com.pitneybowes.api360.model.MultipieceRateShopRequestMultiPieceParcelsInnerParcel;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * description
 */
@JsonPropertyOrder({
  MultipieceRateShopRequestMultiPieceParcelsInner.JSON_PROPERTY_PARCEL_TYPE,
  MultipieceRateShopRequestMultiPieceParcelsInner.JSON_PROPERTY_PARCEL
})
@JsonTypeName("MultipieceRateShopRequest_multiPieceParcels_inner")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-09-30T12:57:37.504069+05:30[Asia/Kolkata]", comments = "Generator version: 7.7.0")
public class MultipieceRateShopRequestMultiPieceParcelsInner {
  public static final String JSON_PROPERTY_PARCEL_TYPE = "parcelType";
  private String parcelType;

  public static final String JSON_PROPERTY_PARCEL = "parcel";
  private MultipieceRateShopRequestMultiPieceParcelsInnerParcel parcel;

  public MultipieceRateShopRequestMultiPieceParcelsInner() {
  }

  public MultipieceRateShopRequestMultiPieceParcelsInner parcelType(String parcelType) {
    
    this.parcelType = parcelType;
    return this;
  }

  /**
   * description
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

  public MultipieceRateShopRequestMultiPieceParcelsInner parcel(MultipieceRateShopRequestMultiPieceParcelsInnerParcel parcel) {
    
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

  public MultipieceRateShopRequestMultiPieceParcelsInnerParcel getParcel() {
    return parcel;
  }


  @JsonProperty(JSON_PROPERTY_PARCEL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setParcel(MultipieceRateShopRequestMultiPieceParcelsInnerParcel parcel) {
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
    MultipieceRateShopRequestMultiPieceParcelsInner multipieceRateShopRequestMultiPieceParcelsInner = (MultipieceRateShopRequestMultiPieceParcelsInner) o;
    return Objects.equals(this.parcelType, multipieceRateShopRequestMultiPieceParcelsInner.parcelType) &&
        Objects.equals(this.parcel, multipieceRateShopRequestMultiPieceParcelsInner.parcel);
  }

  @Override
  public int hashCode() {
    return Objects.hash(parcelType, parcel);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MultipieceRateShopRequestMultiPieceParcelsInner {\n");
    sb.append("    parcelType: ").append(toIndentedString(parcelType)).append("\n");
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

