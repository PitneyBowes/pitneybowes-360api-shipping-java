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
import com.pitneybowes.api360.model.ByCarrierV2;
import com.pitneybowes.api360.model.FromAddressV2;
import com.pitneybowes.api360.model.ParcelV2;
import com.pitneybowes.api360.model.ReferenceV2;
import com.pitneybowes.api360.model.ShipmentDomesticByCarrierDeliveryOption;
import com.pitneybowes.api360.model.ShipmentDomesticByCarrierDocTab;
import com.pitneybowes.api360.model.ShipmentDomesticByCarrierMetadataInner;
import com.pitneybowes.api360.model.ShipmentDomesticByCarrierShipmentOptions;
import com.pitneybowes.api360.model.ToAddressV2;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * ShipmentDomesticByCarrier
 */
@JsonPropertyOrder({
  ShipmentDomesticByCarrier.JSON_PROPERTY_FROM_ADDRESS,
  ShipmentDomesticByCarrier.JSON_PROPERTY_TO_ADDRESS,
  ShipmentDomesticByCarrier.JSON_PROPERTY_PARCEL,
  ShipmentDomesticByCarrier.JSON_PROPERTY_PARCEL_TYPE,
  ShipmentDomesticByCarrier.JSON_PROPERTY_RATE_SHOP_BY,
  ShipmentDomesticByCarrier.JSON_PROPERTY_BY_CARRIER,
  ShipmentDomesticByCarrier.JSON_PROPERTY_SHIPMENT_OPTIONS,
  ShipmentDomesticByCarrier.JSON_PROPERTY_DOC_TAB,
  ShipmentDomesticByCarrier.JSON_PROPERTY_DELIVERY_CONFIRMATION,
  ShipmentDomesticByCarrier.JSON_PROPERTY_HANDLING,
  ShipmentDomesticByCarrier.JSON_PROPERTY_INSURANCE,
  ShipmentDomesticByCarrier.JSON_PROPERTY_REFERENCES,
  ShipmentDomesticByCarrier.JSON_PROPERTY_METADATA,
  ShipmentDomesticByCarrier.JSON_PROPERTY_LABEL_SIZE,
  ShipmentDomesticByCarrier.JSON_PROPERTY_LABEL_TYPE,
  ShipmentDomesticByCarrier.JSON_PROPERTY_LABEL_FORMAT,
  ShipmentDomesticByCarrier.JSON_PROPERTY_PRINTER_ALIAS_NAME,
  ShipmentDomesticByCarrier.JSON_PROPERTY_DATE_OF_SHIPMENT,
  ShipmentDomesticByCarrier.JSON_PROPERTY_DELIVERY_OPTION
})
@JsonTypeName("shipmentDomesticByCarrier")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-09-30T12:57:37.504069+05:30[Asia/Kolkata]", comments = "Generator version: 7.7.0")
public class ShipmentDomesticByCarrier {
  public static final String JSON_PROPERTY_FROM_ADDRESS = "fromAddress";
  private FromAddressV2 fromAddress;

  public static final String JSON_PROPERTY_TO_ADDRESS = "toAddress";
  private ToAddressV2 toAddress;

  public static final String JSON_PROPERTY_PARCEL = "parcel";
  private ParcelV2 parcel;

  public static final String JSON_PROPERTY_PARCEL_TYPE = "parcelType";
  private String parcelType;

  /**
   * RateShop, which is attached to an Enterprise or Location, is done through three approaches: by Carrier, by RateGroup, and by Ruleset. &lt;br /&gt;  Through Carrier, customers can choose the carriers as per requirement, based on which services, parcel types, and special services can be selected, and RateShop is done. &lt;br /&gt; Through RateGroup, customers can select the RateGroup, which has been divided into two categories: Cheapest (w.r.t. price) and Fastest (w.r.t. delivery hours). &lt;br /&gt; Through Ruleset, customers can define the Condition/rule for selecting carriers and their services, so they do not need to worry for Rate Shopping every time they create Shipment. For example, For a particular location, they can set one definite carrier, or apply RateGroup - Cheapest/Fastest. Similarly, for a particular amount like below $1000 Dollars, they can select a definite carrier service, based on RateGroup.
   */
  public enum RateShopByEnum {
    CARRIER("carrier"),
    
    RATE_GROUP("rateGroup"),
    
    RULESET("ruleset");

    private String value;

    RateShopByEnum(String value) {
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
    public static RateShopByEnum fromValue(String value) {
      for (RateShopByEnum b : RateShopByEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_RATE_SHOP_BY = "rateShopBy";
  private RateShopByEnum rateShopBy;

  public static final String JSON_PROPERTY_BY_CARRIER = "byCarrier";
  private ByCarrierV2 byCarrier;

  public static final String JSON_PROPERTY_SHIPMENT_OPTIONS = "shipmentOptions";
  private ShipmentDomesticByCarrierShipmentOptions shipmentOptions;

  public static final String JSON_PROPERTY_DOC_TAB = "docTab";
  private ShipmentDomesticByCarrierDocTab docTab;

  /**
   * Indicates the supporting special service or document as an evidence of shipment delivery.  For the delivery confirmation, user can select any of the following special services, but they may vary as per the carrier selection. &lt;br /&gt;   - Signature Required/ Indirect Signature Required : SIG   - Signed Hard Copy: SIGHC   - Delivery confirmation: DEL_CON   - Proof of age required (18 years) Adult Signature Required: ADULT_SIG   - Proof of age required (19 years): ADULT_SIG_19   - No Signature Required: NO_SIG   - Direct Signature Required: DIRECT_SIG   - Chain of Signature: COS       Carrier specific options:   - UPS supports *SIG and ADULT_SIG*.    - FedEx supports *SIG, ADULT_SIG, NO_SIG, and DIRECT_SIG*.   - Purolator supports *ADULT_SIG, NO_SIG, and COS*.   - GoFor supports *SIG*.   - CPC supports *SIG, SIGHC, DEL_CON, ADULT_SIG, ADULT_SIG_19, and NO_SIG*.     
   */
  public enum DeliveryConfirmationEnum {
    SIG("SIG"),
    
    SIGHC("SIGHC"),
    
    DEL_CON("DEL_CON"),
    
    ADULT_SIG("ADULT_SIG"),
    
    ADULT_SIG_19("ADULT_SIG_19"),
    
    NO_SIG("NO_SIG"),
    
    DIRECT_SIG("DIRECT_SIG"),
    
    COS("COS");

    private String value;

    DeliveryConfirmationEnum(String value) {
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
    public static DeliveryConfirmationEnum fromValue(String value) {
      for (DeliveryConfirmationEnum b : DeliveryConfirmationEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_DELIVERY_CONFIRMATION = "deliveryConfirmation";
  private DeliveryConfirmationEnum deliveryConfirmation;

  /**
   * Few shipments need a special handling, and the reason can be fragile items or highly secured shipments. There might be other case scenarios. In a simple term, this field defines shipment handling, which provides users a capability to select handling options. &lt;br /&gt; User can select any of the following handling options (special services), but they may vary as per the carrier selection.   - Hold For Pickup: HOLD   - Saturday Delivery: SAT_DELIVERY   - UPS Premium Care: PREM_CARE   - Direct Delivery Only: DIRECT   - Additional Handling: ADD_HDL       Carrier specific options:   - UPS supports all handling options mentioned above.    - FedEx supports *HOLD, SAT_DELIVERY, and ADD_HDL*.   - Purolator supports *HOLD, SAT_DELIVERY, and ADD_HDL*.    
   */
  public enum HandlingEnum {
    HOLD("HOLD"),
    
    SAT_DELIVERY("SAT_DELIVERY"),
    
    PREM_CARE("PREM_CARE"),
    
    DIRECT("DIRECT"),
    
    ADD_HDL("ADD_HDL");

    private String value;

    HandlingEnum(String value) {
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
    public static HandlingEnum fromValue(String value) {
      for (HandlingEnum b : HandlingEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_HANDLING = "handling";
  private HandlingEnum handling;

  /**
   * Indicates the insurance coverage, which is selected by users while create shipment - rate shopping. User can select below-mentioned special service for insurance:    - Declared Value Surcharge: INS      Carrier specific options:   - UPS, FedEx, Purolator, and CPC support special service *INS*.    
   */
  public enum InsuranceEnum {
    INS("INS");

    private String value;

    InsuranceEnum(String value) {
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
    public static InsuranceEnum fromValue(String value) {
      for (InsuranceEnum b : InsuranceEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_INSURANCE = "insurance";
  private InsuranceEnum insurance;

  public static final String JSON_PROPERTY_REFERENCES = "references";
  private ReferenceV2 references;

  public static final String JSON_PROPERTY_METADATA = "metadata";
  private List<ShipmentDomesticByCarrierMetadataInner> metadata = new ArrayList<>();

  /**
   * Defines the label size of the Shipment, that is, the Shipping Label is available in different Doc Size. &lt;br /&gt; &#x60;Max length &#x3D; 10&#x60;
   */
  public enum LabelSizeEnum {
    _8_X11("DOC_8X11"),
    
    _4_X8("DOC_4X8"),
    
    _4_X6("DOC_4X6");

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

  /**
   * Defines the type of the Shipment.  &lt;br /&gt; &#x60;Max length &#x3D; 14&#x60;
   */
  public enum LabelTypeEnum {
    SHIPPING_LABEL("SHIPPING_LABEL");

    private String value;

    LabelTypeEnum(String value) {
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
    public static LabelTypeEnum fromValue(String value) {
      for (LabelTypeEnum b : LabelTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_LABEL_TYPE = "labelType";
  private LabelTypeEnum labelType;

  /**
   * Defines the file/format in which the label is printed.&lt;br /&gt; For ZPL2, DOC_4X6 will be supported, while for PDF, both the sizes are supported. &#x60;Max length &#x3D; 14&#x60;
   */
  public enum LabelFormatEnum {
    ZPL2("ZPL2"),
    
    PDF("PDF");

    private String value;

    LabelFormatEnum(String value) {
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
    public static LabelFormatEnum fromValue(String value) {
      for (LabelFormatEnum b : LabelFormatEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_LABEL_FORMAT = "labelFormat";
  private LabelFormatEnum labelFormat;

  public static final String JSON_PROPERTY_PRINTER_ALIAS_NAME = "printerAliasName";
  private String printerAliasName;

  public static final String JSON_PROPERTY_DATE_OF_SHIPMENT = "dateOfShipment";
  private LocalDate dateOfShipment;

  public static final String JSON_PROPERTY_DELIVERY_OPTION = "deliveryOption";
  private ShipmentDomesticByCarrierDeliveryOption deliveryOption;

  public ShipmentDomesticByCarrier() {
  }

  public ShipmentDomesticByCarrier fromAddress(FromAddressV2 fromAddress) {
    
    this.fromAddress = fromAddress;
    return this;
  }

  /**
   * Get fromAddress
   * @return fromAddress
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_FROM_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public FromAddressV2 getFromAddress() {
    return fromAddress;
  }


  @JsonProperty(JSON_PROPERTY_FROM_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setFromAddress(FromAddressV2 fromAddress) {
    this.fromAddress = fromAddress;
  }

  public ShipmentDomesticByCarrier toAddress(ToAddressV2 toAddress) {
    
    this.toAddress = toAddress;
    return this;
  }

  /**
   * Get toAddress
   * @return toAddress
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_TO_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public ToAddressV2 getToAddress() {
    return toAddress;
  }


  @JsonProperty(JSON_PROPERTY_TO_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setToAddress(ToAddressV2 toAddress) {
    this.toAddress = toAddress;
  }

  public ShipmentDomesticByCarrier parcel(ParcelV2 parcel) {
    
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

  public ParcelV2 getParcel() {
    return parcel;
  }


  @JsonProperty(JSON_PROPERTY_PARCEL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setParcel(ParcelV2 parcel) {
    this.parcel = parcel;
  }

  public ShipmentDomesticByCarrier parcelType(String parcelType) {
    
    this.parcelType = parcelType;
    return this;
  }

  /**
   * Parcel Type is required for creating a shipment while rating a parcel, which varies as per Carrier selection.&lt;br /&gt; ParcelType can have categories like Package, Envelopes, Paks, Boxes, Tube, etc. &lt;br /&gt; &#x60;Max length &#x3D; 30&#x60; 
   * @return parcelType
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_PARCEL_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getParcelType() {
    return parcelType;
  }


  @JsonProperty(JSON_PROPERTY_PARCEL_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setParcelType(String parcelType) {
    this.parcelType = parcelType;
  }

  public ShipmentDomesticByCarrier rateShopBy(RateShopByEnum rateShopBy) {
    
    this.rateShopBy = rateShopBy;
    return this;
  }

  /**
   * RateShop, which is attached to an Enterprise or Location, is done through three approaches: by Carrier, by RateGroup, and by Ruleset. &lt;br /&gt;  Through Carrier, customers can choose the carriers as per requirement, based on which services, parcel types, and special services can be selected, and RateShop is done. &lt;br /&gt; Through RateGroup, customers can select the RateGroup, which has been divided into two categories: Cheapest (w.r.t. price) and Fastest (w.r.t. delivery hours). &lt;br /&gt; Through Ruleset, customers can define the Condition/rule for selecting carriers and their services, so they do not need to worry for Rate Shopping every time they create Shipment. For example, For a particular location, they can set one definite carrier, or apply RateGroup - Cheapest/Fastest. Similarly, for a particular amount like below $1000 Dollars, they can select a definite carrier service, based on RateGroup.
   * @return rateShopBy
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_RATE_SHOP_BY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public RateShopByEnum getRateShopBy() {
    return rateShopBy;
  }


  @JsonProperty(JSON_PROPERTY_RATE_SHOP_BY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setRateShopBy(RateShopByEnum rateShopBy) {
    this.rateShopBy = rateShopBy;
  }

  public ShipmentDomesticByCarrier byCarrier(ByCarrierV2 byCarrier) {
    
    this.byCarrier = byCarrier;
    return this;
  }

  /**
   * Get byCarrier
   * @return byCarrier
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_BY_CARRIER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ByCarrierV2 getByCarrier() {
    return byCarrier;
  }


  @JsonProperty(JSON_PROPERTY_BY_CARRIER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setByCarrier(ByCarrierV2 byCarrier) {
    this.byCarrier = byCarrier;
  }

  public ShipmentDomesticByCarrier shipmentOptions(ShipmentDomesticByCarrierShipmentOptions shipmentOptions) {
    
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

  public ShipmentDomesticByCarrierShipmentOptions getShipmentOptions() {
    return shipmentOptions;
  }


  @JsonProperty(JSON_PROPERTY_SHIPMENT_OPTIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setShipmentOptions(ShipmentDomesticByCarrierShipmentOptions shipmentOptions) {
    this.shipmentOptions = shipmentOptions;
  }

  public ShipmentDomesticByCarrier docTab(ShipmentDomesticByCarrierDocTab docTab) {
    
    this.docTab = docTab;
    return this;
  }

  /**
   * Get docTab
   * @return docTab
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DOC_TAB)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ShipmentDomesticByCarrierDocTab getDocTab() {
    return docTab;
  }


  @JsonProperty(JSON_PROPERTY_DOC_TAB)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDocTab(ShipmentDomesticByCarrierDocTab docTab) {
    this.docTab = docTab;
  }

  public ShipmentDomesticByCarrier deliveryConfirmation(DeliveryConfirmationEnum deliveryConfirmation) {
    
    this.deliveryConfirmation = deliveryConfirmation;
    return this;
  }

  /**
   * Indicates the supporting special service or document as an evidence of shipment delivery.  For the delivery confirmation, user can select any of the following special services, but they may vary as per the carrier selection. &lt;br /&gt;   - Signature Required/ Indirect Signature Required : SIG   - Signed Hard Copy: SIGHC   - Delivery confirmation: DEL_CON   - Proof of age required (18 years) Adult Signature Required: ADULT_SIG   - Proof of age required (19 years): ADULT_SIG_19   - No Signature Required: NO_SIG   - Direct Signature Required: DIRECT_SIG   - Chain of Signature: COS       Carrier specific options:   - UPS supports *SIG and ADULT_SIG*.    - FedEx supports *SIG, ADULT_SIG, NO_SIG, and DIRECT_SIG*.   - Purolator supports *ADULT_SIG, NO_SIG, and COS*.   - GoFor supports *SIG*.   - CPC supports *SIG, SIGHC, DEL_CON, ADULT_SIG, ADULT_SIG_19, and NO_SIG*.     
   * @return deliveryConfirmation
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DELIVERY_CONFIRMATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public DeliveryConfirmationEnum getDeliveryConfirmation() {
    return deliveryConfirmation;
  }


  @JsonProperty(JSON_PROPERTY_DELIVERY_CONFIRMATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDeliveryConfirmation(DeliveryConfirmationEnum deliveryConfirmation) {
    this.deliveryConfirmation = deliveryConfirmation;
  }

  public ShipmentDomesticByCarrier handling(HandlingEnum handling) {
    
    this.handling = handling;
    return this;
  }

  /**
   * Few shipments need a special handling, and the reason can be fragile items or highly secured shipments. There might be other case scenarios. In a simple term, this field defines shipment handling, which provides users a capability to select handling options. &lt;br /&gt; User can select any of the following handling options (special services), but they may vary as per the carrier selection.   - Hold For Pickup: HOLD   - Saturday Delivery: SAT_DELIVERY   - UPS Premium Care: PREM_CARE   - Direct Delivery Only: DIRECT   - Additional Handling: ADD_HDL       Carrier specific options:   - UPS supports all handling options mentioned above.    - FedEx supports *HOLD, SAT_DELIVERY, and ADD_HDL*.   - Purolator supports *HOLD, SAT_DELIVERY, and ADD_HDL*.    
   * @return handling
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_HANDLING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public HandlingEnum getHandling() {
    return handling;
  }


  @JsonProperty(JSON_PROPERTY_HANDLING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setHandling(HandlingEnum handling) {
    this.handling = handling;
  }

  public ShipmentDomesticByCarrier insurance(InsuranceEnum insurance) {
    
    this.insurance = insurance;
    return this;
  }

  /**
   * Indicates the insurance coverage, which is selected by users while create shipment - rate shopping. User can select below-mentioned special service for insurance:    - Declared Value Surcharge: INS      Carrier specific options:   - UPS, FedEx, Purolator, and CPC support special service *INS*.    
   * @return insurance
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INSURANCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public InsuranceEnum getInsurance() {
    return insurance;
  }


  @JsonProperty(JSON_PROPERTY_INSURANCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setInsurance(InsuranceEnum insurance) {
    this.insurance = insurance;
  }

  public ShipmentDomesticByCarrier references(ReferenceV2 references) {
    
    this.references = references;
    return this;
  }

  /**
   * Get references
   * @return references
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_REFERENCES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ReferenceV2 getReferences() {
    return references;
  }


  @JsonProperty(JSON_PROPERTY_REFERENCES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setReferences(ReferenceV2 references) {
    this.references = references;
  }

  public ShipmentDomesticByCarrier metadata(List<ShipmentDomesticByCarrierMetadataInner> metadata) {
    
    this.metadata = metadata;
    return this;
  }

  public ShipmentDomesticByCarrier addMetadataItem(ShipmentDomesticByCarrierMetadataInner metadataItem) {
    if (this.metadata == null) {
      this.metadata = new ArrayList<>();
    }
    this.metadata.add(metadataItem);
    return this;
  }

  /**
   * Additional metadata that needs to be stored for this shipment can be added here.&lt;br /&gt; For now, &#39;Cost Account Name&#39; is supported.
   * @return metadata
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_METADATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<ShipmentDomesticByCarrierMetadataInner> getMetadata() {
    return metadata;
  }


  @JsonProperty(JSON_PROPERTY_METADATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMetadata(List<ShipmentDomesticByCarrierMetadataInner> metadata) {
    this.metadata = metadata;
  }

  public ShipmentDomesticByCarrier labelSize(LabelSizeEnum labelSize) {
    
    this.labelSize = labelSize;
    return this;
  }

  /**
   * Defines the label size of the Shipment, that is, the Shipping Label is available in different Doc Size. &lt;br /&gt; &#x60;Max length &#x3D; 10&#x60;
   * @return labelSize
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_LABEL_SIZE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public LabelSizeEnum getLabelSize() {
    return labelSize;
  }


  @JsonProperty(JSON_PROPERTY_LABEL_SIZE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setLabelSize(LabelSizeEnum labelSize) {
    this.labelSize = labelSize;
  }

  public ShipmentDomesticByCarrier labelType(LabelTypeEnum labelType) {
    
    this.labelType = labelType;
    return this;
  }

  /**
   * Defines the type of the Shipment.  &lt;br /&gt; &#x60;Max length &#x3D; 14&#x60;
   * @return labelType
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_LABEL_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public LabelTypeEnum getLabelType() {
    return labelType;
  }


  @JsonProperty(JSON_PROPERTY_LABEL_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setLabelType(LabelTypeEnum labelType) {
    this.labelType = labelType;
  }

  public ShipmentDomesticByCarrier labelFormat(LabelFormatEnum labelFormat) {
    
    this.labelFormat = labelFormat;
    return this;
  }

  /**
   * Defines the file/format in which the label is printed.&lt;br /&gt; For ZPL2, DOC_4X6 will be supported, while for PDF, both the sizes are supported. &#x60;Max length &#x3D; 14&#x60;
   * @return labelFormat
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_LABEL_FORMAT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public LabelFormatEnum getLabelFormat() {
    return labelFormat;
  }


  @JsonProperty(JSON_PROPERTY_LABEL_FORMAT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setLabelFormat(LabelFormatEnum labelFormat) {
    this.labelFormat = labelFormat;
  }

  public ShipmentDomesticByCarrier printerAliasName(String printerAliasName) {
    
    this.printerAliasName = printerAliasName;
    return this;
  }

  /**
   * Refers to a printer connected (directly or via network) to a computer. &#x60;Max length &#x3D; 60&#x60;
   * @return printerAliasName
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PRINTER_ALIAS_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPrinterAliasName() {
    return printerAliasName;
  }


  @JsonProperty(JSON_PROPERTY_PRINTER_ALIAS_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPrinterAliasName(String printerAliasName) {
    this.printerAliasName = printerAliasName;
  }

  public ShipmentDomesticByCarrier dateOfShipment(LocalDate dateOfShipment) {
    
    this.dateOfShipment = dateOfShipment;
    return this;
  }

  /**
   * The date when shipment is created/shipped. The format of the Date is YYYY-MM-DD.
   * @return dateOfShipment
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DATE_OF_SHIPMENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public LocalDate getDateOfShipment() {
    return dateOfShipment;
  }


  @JsonProperty(JSON_PROPERTY_DATE_OF_SHIPMENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDateOfShipment(LocalDate dateOfShipment) {
    this.dateOfShipment = dateOfShipment;
  }

  public ShipmentDomesticByCarrier deliveryOption(ShipmentDomesticByCarrierDeliveryOption deliveryOption) {
    
    this.deliveryOption = deliveryOption;
    return this;
  }

  /**
   * Get deliveryOption
   * @return deliveryOption
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DELIVERY_OPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ShipmentDomesticByCarrierDeliveryOption getDeliveryOption() {
    return deliveryOption;
  }


  @JsonProperty(JSON_PROPERTY_DELIVERY_OPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDeliveryOption(ShipmentDomesticByCarrierDeliveryOption deliveryOption) {
    this.deliveryOption = deliveryOption;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ShipmentDomesticByCarrier shipmentDomesticByCarrier = (ShipmentDomesticByCarrier) o;
    return Objects.equals(this.fromAddress, shipmentDomesticByCarrier.fromAddress) &&
        Objects.equals(this.toAddress, shipmentDomesticByCarrier.toAddress) &&
        Objects.equals(this.parcel, shipmentDomesticByCarrier.parcel) &&
        Objects.equals(this.parcelType, shipmentDomesticByCarrier.parcelType) &&
        Objects.equals(this.rateShopBy, shipmentDomesticByCarrier.rateShopBy) &&
        Objects.equals(this.byCarrier, shipmentDomesticByCarrier.byCarrier) &&
        Objects.equals(this.shipmentOptions, shipmentDomesticByCarrier.shipmentOptions) &&
        Objects.equals(this.docTab, shipmentDomesticByCarrier.docTab) &&
        Objects.equals(this.deliveryConfirmation, shipmentDomesticByCarrier.deliveryConfirmation) &&
        Objects.equals(this.handling, shipmentDomesticByCarrier.handling) &&
        Objects.equals(this.insurance, shipmentDomesticByCarrier.insurance) &&
        Objects.equals(this.references, shipmentDomesticByCarrier.references) &&
        Objects.equals(this.metadata, shipmentDomesticByCarrier.metadata) &&
        Objects.equals(this.labelSize, shipmentDomesticByCarrier.labelSize) &&
        Objects.equals(this.labelType, shipmentDomesticByCarrier.labelType) &&
        Objects.equals(this.labelFormat, shipmentDomesticByCarrier.labelFormat) &&
        Objects.equals(this.printerAliasName, shipmentDomesticByCarrier.printerAliasName) &&
        Objects.equals(this.dateOfShipment, shipmentDomesticByCarrier.dateOfShipment) &&
        Objects.equals(this.deliveryOption, shipmentDomesticByCarrier.deliveryOption);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fromAddress, toAddress, parcel, parcelType, rateShopBy, byCarrier, shipmentOptions, docTab, deliveryConfirmation, handling, insurance, references, metadata, labelSize, labelType, labelFormat, printerAliasName, dateOfShipment, deliveryOption);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ShipmentDomesticByCarrier {\n");
    sb.append("    fromAddress: ").append(toIndentedString(fromAddress)).append("\n");
    sb.append("    toAddress: ").append(toIndentedString(toAddress)).append("\n");
    sb.append("    parcel: ").append(toIndentedString(parcel)).append("\n");
    sb.append("    parcelType: ").append(toIndentedString(parcelType)).append("\n");
    sb.append("    rateShopBy: ").append(toIndentedString(rateShopBy)).append("\n");
    sb.append("    byCarrier: ").append(toIndentedString(byCarrier)).append("\n");
    sb.append("    shipmentOptions: ").append(toIndentedString(shipmentOptions)).append("\n");
    sb.append("    docTab: ").append(toIndentedString(docTab)).append("\n");
    sb.append("    deliveryConfirmation: ").append(toIndentedString(deliveryConfirmation)).append("\n");
    sb.append("    handling: ").append(toIndentedString(handling)).append("\n");
    sb.append("    insurance: ").append(toIndentedString(insurance)).append("\n");
    sb.append("    references: ").append(toIndentedString(references)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    labelSize: ").append(toIndentedString(labelSize)).append("\n");
    sb.append("    labelType: ").append(toIndentedString(labelType)).append("\n");
    sb.append("    labelFormat: ").append(toIndentedString(labelFormat)).append("\n");
    sb.append("    printerAliasName: ").append(toIndentedString(printerAliasName)).append("\n");
    sb.append("    dateOfShipment: ").append(toIndentedString(dateOfShipment)).append("\n");
    sb.append("    deliveryOption: ").append(toIndentedString(deliveryOption)).append("\n");
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

