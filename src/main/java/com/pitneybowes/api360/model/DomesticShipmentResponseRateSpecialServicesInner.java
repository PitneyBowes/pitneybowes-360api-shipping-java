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
import com.pitneybowes.api360.model.DomesticShipmentResponseRateSpecialServicesInnerInputParametersInner;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * DomesticShipmentResponseRateSpecialServicesInner
 */
@JsonPropertyOrder({
  DomesticShipmentResponseRateSpecialServicesInner.JSON_PROPERTY_FEE,
  DomesticShipmentResponseRateSpecialServicesInner.JSON_PROPERTY_INPUT_PARAMETERS,
  DomesticShipmentResponseRateSpecialServicesInner.JSON_PROPERTY_SPECIAL_SERVICE_ID
})
@JsonTypeName("domesticShipmentResponse_rate_specialServices_inner")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-09-30T12:57:37.504069+05:30[Asia/Kolkata]", comments = "Generator version: 7.7.0")
public class DomesticShipmentResponseRateSpecialServicesInner {
  public static final String JSON_PROPERTY_FEE = "fee";
  private BigDecimal fee;

  public static final String JSON_PROPERTY_INPUT_PARAMETERS = "inputParameters";
  private List<DomesticShipmentResponseRateSpecialServicesInnerInputParametersInner> inputParameters = new ArrayList<>();

  public static final String JSON_PROPERTY_SPECIAL_SERVICE_ID = "specialServiceId";
  private String specialServiceId;

  public DomesticShipmentResponseRateSpecialServicesInner() {
  }

  public DomesticShipmentResponseRateSpecialServicesInner fee(BigDecimal fee) {
    
    this.fee = fee;
    return this;
  }

  /**
   * The amount of the special service.
   * @return fee
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FEE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getFee() {
    return fee;
  }


  @JsonProperty(JSON_PROPERTY_FEE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFee(BigDecimal fee) {
    this.fee = fee;
  }

  public DomesticShipmentResponseRateSpecialServicesInner inputParameters(List<DomesticShipmentResponseRateSpecialServicesInnerInputParametersInner> inputParameters) {
    
    this.inputParameters = inputParameters;
    return this;
  }

  public DomesticShipmentResponseRateSpecialServicesInner addInputParametersItem(DomesticShipmentResponseRateSpecialServicesInnerInputParametersInner inputParametersItem) {
    if (this.inputParameters == null) {
      this.inputParameters = new ArrayList<>();
    }
    this.inputParameters.add(inputParametersItem);
    return this;
  }

  /**
   * &gt;-The parameters to set for the special service, such as an insurance value or a receipt-number format. This is required if the specialservice requires input parameters. If a special service does not require input parameters, you can either leave out the array or pass an empty array.
   * @return inputParameters
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INPUT_PARAMETERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<DomesticShipmentResponseRateSpecialServicesInnerInputParametersInner> getInputParameters() {
    return inputParameters;
  }


  @JsonProperty(JSON_PROPERTY_INPUT_PARAMETERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setInputParameters(List<DomesticShipmentResponseRateSpecialServicesInnerInputParametersInner> inputParameters) {
    this.inputParameters = inputParameters;
  }

  public DomesticShipmentResponseRateSpecialServicesInner specialServiceId(String specialServiceId) {
    
    this.specialServiceId = specialServiceId;
    return this;
  }

  /**
   * A unique identifier associated to the Special Service , which depends on the carrier based service.
   * @return specialServiceId
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SPECIAL_SERVICE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getSpecialServiceId() {
    return specialServiceId;
  }


  @JsonProperty(JSON_PROPERTY_SPECIAL_SERVICE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSpecialServiceId(String specialServiceId) {
    this.specialServiceId = specialServiceId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DomesticShipmentResponseRateSpecialServicesInner domesticShipmentResponseRateSpecialServicesInner = (DomesticShipmentResponseRateSpecialServicesInner) o;
    return Objects.equals(this.fee, domesticShipmentResponseRateSpecialServicesInner.fee) &&
        Objects.equals(this.inputParameters, domesticShipmentResponseRateSpecialServicesInner.inputParameters) &&
        Objects.equals(this.specialServiceId, domesticShipmentResponseRateSpecialServicesInner.specialServiceId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fee, inputParameters, specialServiceId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DomesticShipmentResponseRateSpecialServicesInner {\n");
    sb.append("    fee: ").append(toIndentedString(fee)).append("\n");
    sb.append("    inputParameters: ").append(toIndentedString(inputParameters)).append("\n");
    sb.append("    specialServiceId: ").append(toIndentedString(specialServiceId)).append("\n");
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

