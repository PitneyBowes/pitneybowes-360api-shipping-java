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
 * CustomsInfo
 */
@JsonPropertyOrder({
  CustomsInfo.JSON_PROPERTY_REASON_FOR_EXPORT,
  CustomsInfo.JSON_PROPERTY_CURRENCY_CODE,
  CustomsInfo.JSON_PROPERTY_E_E_L_P_F_C,
  CustomsInfo.JSON_PROPERTY_CERTIFICATE_NUMBER,
  CustomsInfo.JSON_PROPERTY_COMMENTS,
  CustomsInfo.JSON_PROPERTY_FROM_CUSTOMS_REFERENCE,
  CustomsInfo.JSON_PROPERTY_IMPORTER_CUSTOMS_REFERENCE,
  CustomsInfo.JSON_PROPERTY_INVOICE_NUMBER,
  CustomsInfo.JSON_PROPERTY_LICENSE_NUMBER,
  CustomsInfo.JSON_PROPERTY_DECLARATION_STATEMENT,
  CustomsInfo.JSON_PROPERTY_IMPORTER_CUSTOMS_REFERENCE_TYPE,
  CustomsInfo.JSON_PROPERTY_INSURED_AMOUNT,
  CustomsInfo.JSON_PROPERTY_INSURED_NUMBER,
  CustomsInfo.JSON_PROPERTY_SDR_VALUE,
  CustomsInfo.JSON_PROPERTY_TERMS_OF_SALE,
  CustomsInfo.JSON_PROPERTY_RECIPIENT_TAX_TYPE,
  CustomsInfo.JSON_PROPERTY_RECIPIENT_TAX_I_D,
  CustomsInfo.JSON_PROPERTY_SENDER_TAX_TYPE,
  CustomsInfo.JSON_PROPERTY_SENDER_TAX_I_D
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-09-30T12:57:37.504069+05:30[Asia/Kolkata]", comments = "Generator version: 7.7.0")
public class CustomsInfo {
  public static final String JSON_PROPERTY_REASON_FOR_EXPORT = "reasonForExport";
  private String reasonForExport;

  public static final String JSON_PROPERTY_CURRENCY_CODE = "currencyCode";
  private String currencyCode;

  public static final String JSON_PROPERTY_E_E_L_P_F_C = "EELPFC";
  private String EELPFC;

  public static final String JSON_PROPERTY_CERTIFICATE_NUMBER = "certificateNumber";
  private String certificateNumber;

  public static final String JSON_PROPERTY_COMMENTS = "comments";
  private String comments;

  public static final String JSON_PROPERTY_FROM_CUSTOMS_REFERENCE = "fromCustomsReference";
  private String fromCustomsReference;

  public static final String JSON_PROPERTY_IMPORTER_CUSTOMS_REFERENCE = "importerCustomsReference";
  private String importerCustomsReference;

  public static final String JSON_PROPERTY_INVOICE_NUMBER = "invoiceNumber";
  private String invoiceNumber;

  public static final String JSON_PROPERTY_LICENSE_NUMBER = "licenseNumber";
  private String licenseNumber;

  public static final String JSON_PROPERTY_DECLARATION_STATEMENT = "declarationStatement";
  private String declarationStatement;

  public static final String JSON_PROPERTY_IMPORTER_CUSTOMS_REFERENCE_TYPE = "importerCustomsReferenceType";
  private String importerCustomsReferenceType;

  public static final String JSON_PROPERTY_INSURED_AMOUNT = "insuredAmount";
  private Double insuredAmount;

  public static final String JSON_PROPERTY_INSURED_NUMBER = "insuredNumber";
  private String insuredNumber;

  public static final String JSON_PROPERTY_SDR_VALUE = "sdrValue";
  private Double sdrValue;

  /**
   * Three-digit codes describing Terms of sale required for DHL Express shipments. Terms of sale is some sort of agreement between a buyer and seller which serves the purpose of creating uniform expectations between them. Possible values are- CFR (description- Cost and Freight), CIF (description- Cost, Insurance and Freight), CIP (description- Carriage and Insurance Paid To), DAF (description- Delivered at Frontier), DAP (description- Delivered At Place), DAT (description- Delivered At Terminal), DDP (description- Delivered Duty Paid), DDU (description- Delivered Duty Unpaid), DEQ (description- Delivery ex Quay), DES (description- Delivered ex Ship), DPU (description- Delivered At Place Unloaded), EXW (description- Ex Works), FAS (description- FAS Free Alongside Ship), FCA (description- Free Carrier), FOB (description- FOB Free On Board)
   */
  public enum TermsOfSaleEnum {
    CFR("CFR"),
    
    CIF("CIF"),
    
    CIP("CIP"),
    
    CPT("CPT"),
    
    DAF("DAF"),
    
    DAP("DAP"),
    
    DAT("DAT"),
    
    DDP("DDP"),
    
    DDU("DDU"),
    
    DEQ("DEQ"),
    
    DES("DES"),
    
    DPU("DPU"),
    
    EXW("EXW"),
    
    FAS("FAS"),
    
    FCA("FCA"),
    
    FOB("FOB");

    private String value;

    TermsOfSaleEnum(String value) {
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
    public static TermsOfSaleEnum fromValue(String value) {
      for (TermsOfSaleEnum b : TermsOfSaleEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_TERMS_OF_SALE = "termsOfSale";
  private TermsOfSaleEnum termsOfSale;

  /**
   * The tax type to choose for recipient.
   */
  public enum RecipientTaxTypeEnum {
    EIN("EIN"),
    
    GST("GST"),
    
    RFC("RFC"),
    
    VAT("VAT");

    private String value;

    RecipientTaxTypeEnum(String value) {
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
    public static RecipientTaxTypeEnum fromValue(String value) {
      for (RecipientTaxTypeEnum b : RecipientTaxTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_RECIPIENT_TAX_TYPE = "recipientTaxType";
  private RecipientTaxTypeEnum recipientTaxType;

  public static final String JSON_PROPERTY_RECIPIENT_TAX_I_D = "recipientTaxID";
  private String recipientTaxID;

  /**
   * The tax type to choose for recipient.
   */
  public enum SenderTaxTypeEnum {
    EIN("EIN"),
    
    GST("GST"),
    
    RFC("RFC"),
    
    VAT("VAT");

    private String value;

    SenderTaxTypeEnum(String value) {
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
    public static SenderTaxTypeEnum fromValue(String value) {
      for (SenderTaxTypeEnum b : SenderTaxTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_SENDER_TAX_TYPE = "senderTaxType";
  private SenderTaxTypeEnum senderTaxType;

  public static final String JSON_PROPERTY_SENDER_TAX_I_D = "senderTaxID";
  private String senderTaxID;

  public CustomsInfo() {
  }

  public CustomsInfo reasonForExport(String reasonForExport) {
    
    this.reasonForExport = reasonForExport;
    return this;
  }

  /**
   * &gt;-The reason the commodity is being exported. Valid values are: Valid Values : [GIFT COMMERCIAL_SAMPLE MERCHANDISE DOCUMENTS RETURNED_GOODS OTHER SOLD NOT_SOLD]
   * @return reasonForExport
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_REASON_FOR_EXPORT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getReasonForExport() {
    return reasonForExport;
  }


  @JsonProperty(JSON_PROPERTY_REASON_FOR_EXPORT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setReasonForExport(String reasonForExport) {
    this.reasonForExport = reasonForExport;
  }

  public CustomsInfo currencyCode(String currencyCode) {
    
    this.currencyCode = currencyCode;
    return this;
  }

  /**
   * &gt;-The type of currency used for the monetary values in this API request. Use three uppercase letters, per ISO 4217. For example, use USD for US Dollars, CAD for Canadian Dollars, and EUR for Euros.
   * @return currencyCode
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_CURRENCY_CODE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getCurrencyCode() {
    return currencyCode;
  }


  @JsonProperty(JSON_PROPERTY_CURRENCY_CODE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCurrencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
  }

  public CustomsInfo EELPFC(String EELPFC) {
    
    this.EELPFC = EELPFC;
    return this;
  }

  /**
   * &gt;- A number provided by the Automated Export System (AES). This field is required if the item is valued at more than $2,500 USD per Schedule B export codes.
   * @return EELPFC
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_E_E_L_P_F_C)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getEELPFC() {
    return EELPFC;
  }


  @JsonProperty(JSON_PROPERTY_E_E_L_P_F_C)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEELPFC(String EELPFC) {
    this.EELPFC = EELPFC;
  }

  public CustomsInfo certificateNumber(String certificateNumber) {
    
    this.certificateNumber = certificateNumber;
    return this;
  }

  /**
   * The certificate number associated with the commodity.
   * @return certificateNumber
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CERTIFICATE_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCertificateNumber() {
    return certificateNumber;
  }


  @JsonProperty(JSON_PROPERTY_CERTIFICATE_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCertificateNumber(String certificateNumber) {
    this.certificateNumber = certificateNumber;
  }

  public CustomsInfo comments(String comments) {
    
    this.comments = comments;
    return this;
  }

  /**
   * &gt;-Free form comments regarding the exported shipment entered by the shipper.
   * @return comments
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_COMMENTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getComments() {
    return comments;
  }


  @JsonProperty(JSON_PROPERTY_COMMENTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setComments(String comments) {
    this.comments = comments;
  }

  public CustomsInfo fromCustomsReference(String fromCustomsReference) {
    
    this.fromCustomsReference = fromCustomsReference;
    return this;
  }

  /**
   * &gt;-Free form reference information provided by the requestor of the shipment. Depending on the carrier this information may or may not be rendered on the customs documents.
   * @return fromCustomsReference
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FROM_CUSTOMS_REFERENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getFromCustomsReference() {
    return fromCustomsReference;
  }


  @JsonProperty(JSON_PROPERTY_FROM_CUSTOMS_REFERENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFromCustomsReference(String fromCustomsReference) {
    this.fromCustomsReference = fromCustomsReference;
  }

  public CustomsInfo importerCustomsReference(String importerCustomsReference) {
    
    this.importerCustomsReference = importerCustomsReference;
    return this;
  }

  /**
   * &gt;- A reference number used by the importer, such as a VAT number, PO number, or insured number. &#x60;Shipments to the EU&#x60; : Merchants shipping to the European Union (EU) from outside the EU must provide a VAT or IOSS number. Enter the number in this field and specify the reference type in the importerCustomsReferenceType field.
   * @return importerCustomsReference
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IMPORTER_CUSTOMS_REFERENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getImporterCustomsReference() {
    return importerCustomsReference;
  }


  @JsonProperty(JSON_PROPERTY_IMPORTER_CUSTOMS_REFERENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setImporterCustomsReference(String importerCustomsReference) {
    this.importerCustomsReference = importerCustomsReference;
  }

  public CustomsInfo invoiceNumber(String invoiceNumber) {
    
    this.invoiceNumber = invoiceNumber;
    return this;
  }

  /**
   * The commercial invoice number assigned by the exporter. It is rquired for DHL Express
   * @return invoiceNumber
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INVOICE_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getInvoiceNumber() {
    return invoiceNumber;
  }


  @JsonProperty(JSON_PROPERTY_INVOICE_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setInvoiceNumber(String invoiceNumber) {
    this.invoiceNumber = invoiceNumber;
  }

  public CustomsInfo licenseNumber(String licenseNumber) {
    
    this.licenseNumber = licenseNumber;
    return this;
  }

  /**
   * The export license number associated with the commodity.
   * @return licenseNumber
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LICENSE_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getLicenseNumber() {
    return licenseNumber;
  }


  @JsonProperty(JSON_PROPERTY_LICENSE_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLicenseNumber(String licenseNumber) {
    this.licenseNumber = licenseNumber;
  }

  public CustomsInfo declarationStatement(String declarationStatement) {
    
    this.declarationStatement = declarationStatement;
    return this;
  }

  /**
   * This is declaration statement from the Shipper for the items being shipped.
   * @return declarationStatement
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DECLARATION_STATEMENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDeclarationStatement() {
    return declarationStatement;
  }


  @JsonProperty(JSON_PROPERTY_DECLARATION_STATEMENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDeclarationStatement(String declarationStatement) {
    this.declarationStatement = declarationStatement;
  }

  public CustomsInfo importerCustomsReferenceType(String importerCustomsReferenceType) {
    
    this.importerCustomsReferenceType = importerCustomsReferenceType;
    return this;
  }

  /**
   * &gt;-A reference type used by the importer to determine the type of importerCustomsReference. Valid Values are TAX_CODE, IMPORTER_CODE, VAT_NUMBER, IOSS_NUMBER.
   * @return importerCustomsReferenceType
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IMPORTER_CUSTOMS_REFERENCE_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getImporterCustomsReferenceType() {
    return importerCustomsReferenceType;
  }


  @JsonProperty(JSON_PROPERTY_IMPORTER_CUSTOMS_REFERENCE_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setImporterCustomsReferenceType(String importerCustomsReferenceType) {
    this.importerCustomsReferenceType = importerCustomsReferenceType;
  }

  public CustomsInfo insuredAmount(Double insuredAmount) {
    
    this.insuredAmount = insuredAmount;
    return this;
  }

  /**
   * Enter the insurance fee, if applicable.
   * @return insuredAmount
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INSURED_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Double getInsuredAmount() {
    return insuredAmount;
  }


  @JsonProperty(JSON_PROPERTY_INSURED_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setInsuredAmount(Double insuredAmount) {
    this.insuredAmount = insuredAmount;
  }

  public CustomsInfo insuredNumber(String insuredNumber) {
    
    this.insuredNumber = insuredNumber;
    return this;
  }

  /**
   * &gt;- If the sender wishes to insure the contents, they complete an insurance receipt and affix the insured numbered label to the package. The insured number label is what this field represents.
   * @return insuredNumber
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INSURED_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getInsuredNumber() {
    return insuredNumber;
  }


  @JsonProperty(JSON_PROPERTY_INSURED_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setInsuredNumber(String insuredNumber) {
    this.insuredNumber = insuredNumber;
  }

  public CustomsInfo sdrValue(Double sdrValue) {
    
    this.sdrValue = sdrValue;
    return this;
  }

  /**
   * &gt;-When an international parcel is insured, the insured value must be expressed in Special Drawing Rights values. E.g. $100 USD &#x3D; 66.87 SDR.
   * @return sdrValue
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SDR_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Double getSdrValue() {
    return sdrValue;
  }


  @JsonProperty(JSON_PROPERTY_SDR_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSdrValue(Double sdrValue) {
    this.sdrValue = sdrValue;
  }

  public CustomsInfo termsOfSale(TermsOfSaleEnum termsOfSale) {
    
    this.termsOfSale = termsOfSale;
    return this;
  }

  /**
   * Three-digit codes describing Terms of sale required for DHL Express shipments. Terms of sale is some sort of agreement between a buyer and seller which serves the purpose of creating uniform expectations between them. Possible values are- CFR (description- Cost and Freight), CIF (description- Cost, Insurance and Freight), CIP (description- Carriage and Insurance Paid To), DAF (description- Delivered at Frontier), DAP (description- Delivered At Place), DAT (description- Delivered At Terminal), DDP (description- Delivered Duty Paid), DDU (description- Delivered Duty Unpaid), DEQ (description- Delivery ex Quay), DES (description- Delivered ex Ship), DPU (description- Delivered At Place Unloaded), EXW (description- Ex Works), FAS (description- FAS Free Alongside Ship), FCA (description- Free Carrier), FOB (description- FOB Free On Board)
   * @return termsOfSale
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TERMS_OF_SALE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public TermsOfSaleEnum getTermsOfSale() {
    return termsOfSale;
  }


  @JsonProperty(JSON_PROPERTY_TERMS_OF_SALE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTermsOfSale(TermsOfSaleEnum termsOfSale) {
    this.termsOfSale = termsOfSale;
  }

  public CustomsInfo recipientTaxType(RecipientTaxTypeEnum recipientTaxType) {
    
    this.recipientTaxType = recipientTaxType;
    return this;
  }

  /**
   * The tax type to choose for recipient.
   * @return recipientTaxType
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RECIPIENT_TAX_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RecipientTaxTypeEnum getRecipientTaxType() {
    return recipientTaxType;
  }


  @JsonProperty(JSON_PROPERTY_RECIPIENT_TAX_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRecipientTaxType(RecipientTaxTypeEnum recipientTaxType) {
    this.recipientTaxType = recipientTaxType;
  }

  public CustomsInfo recipientTaxID(String recipientTaxID) {
    
    this.recipientTaxID = recipientTaxID;
    return this;
  }

  /**
   * The respective taxID for the taxType chosen
   * @return recipientTaxID
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RECIPIENT_TAX_I_D)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getRecipientTaxID() {
    return recipientTaxID;
  }


  @JsonProperty(JSON_PROPERTY_RECIPIENT_TAX_I_D)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRecipientTaxID(String recipientTaxID) {
    this.recipientTaxID = recipientTaxID;
  }

  public CustomsInfo senderTaxType(SenderTaxTypeEnum senderTaxType) {
    
    this.senderTaxType = senderTaxType;
    return this;
  }

  /**
   * The tax type to choose for recipient.
   * @return senderTaxType
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SENDER_TAX_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public SenderTaxTypeEnum getSenderTaxType() {
    return senderTaxType;
  }


  @JsonProperty(JSON_PROPERTY_SENDER_TAX_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSenderTaxType(SenderTaxTypeEnum senderTaxType) {
    this.senderTaxType = senderTaxType;
  }

  public CustomsInfo senderTaxID(String senderTaxID) {
    
    this.senderTaxID = senderTaxID;
    return this;
  }

  /**
   * The respective taxID for the taxType chosen
   * @return senderTaxID
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SENDER_TAX_I_D)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getSenderTaxID() {
    return senderTaxID;
  }


  @JsonProperty(JSON_PROPERTY_SENDER_TAX_I_D)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSenderTaxID(String senderTaxID) {
    this.senderTaxID = senderTaxID;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomsInfo customsInfo = (CustomsInfo) o;
    return Objects.equals(this.reasonForExport, customsInfo.reasonForExport) &&
        Objects.equals(this.currencyCode, customsInfo.currencyCode) &&
        Objects.equals(this.EELPFC, customsInfo.EELPFC) &&
        Objects.equals(this.certificateNumber, customsInfo.certificateNumber) &&
        Objects.equals(this.comments, customsInfo.comments) &&
        Objects.equals(this.fromCustomsReference, customsInfo.fromCustomsReference) &&
        Objects.equals(this.importerCustomsReference, customsInfo.importerCustomsReference) &&
        Objects.equals(this.invoiceNumber, customsInfo.invoiceNumber) &&
        Objects.equals(this.licenseNumber, customsInfo.licenseNumber) &&
        Objects.equals(this.declarationStatement, customsInfo.declarationStatement) &&
        Objects.equals(this.importerCustomsReferenceType, customsInfo.importerCustomsReferenceType) &&
        Objects.equals(this.insuredAmount, customsInfo.insuredAmount) &&
        Objects.equals(this.insuredNumber, customsInfo.insuredNumber) &&
        Objects.equals(this.sdrValue, customsInfo.sdrValue) &&
        Objects.equals(this.termsOfSale, customsInfo.termsOfSale) &&
        Objects.equals(this.recipientTaxType, customsInfo.recipientTaxType) &&
        Objects.equals(this.recipientTaxID, customsInfo.recipientTaxID) &&
        Objects.equals(this.senderTaxType, customsInfo.senderTaxType) &&
        Objects.equals(this.senderTaxID, customsInfo.senderTaxID);
  }

  @Override
  public int hashCode() {
    return Objects.hash(reasonForExport, currencyCode, EELPFC, certificateNumber, comments, fromCustomsReference, importerCustomsReference, invoiceNumber, licenseNumber, declarationStatement, importerCustomsReferenceType, insuredAmount, insuredNumber, sdrValue, termsOfSale, recipientTaxType, recipientTaxID, senderTaxType, senderTaxID);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomsInfo {\n");
    sb.append("    reasonForExport: ").append(toIndentedString(reasonForExport)).append("\n");
    sb.append("    currencyCode: ").append(toIndentedString(currencyCode)).append("\n");
    sb.append("    EELPFC: ").append(toIndentedString(EELPFC)).append("\n");
    sb.append("    certificateNumber: ").append(toIndentedString(certificateNumber)).append("\n");
    sb.append("    comments: ").append(toIndentedString(comments)).append("\n");
    sb.append("    fromCustomsReference: ").append(toIndentedString(fromCustomsReference)).append("\n");
    sb.append("    importerCustomsReference: ").append(toIndentedString(importerCustomsReference)).append("\n");
    sb.append("    invoiceNumber: ").append(toIndentedString(invoiceNumber)).append("\n");
    sb.append("    licenseNumber: ").append(toIndentedString(licenseNumber)).append("\n");
    sb.append("    declarationStatement: ").append(toIndentedString(declarationStatement)).append("\n");
    sb.append("    importerCustomsReferenceType: ").append(toIndentedString(importerCustomsReferenceType)).append("\n");
    sb.append("    insuredAmount: ").append(toIndentedString(insuredAmount)).append("\n");
    sb.append("    insuredNumber: ").append(toIndentedString(insuredNumber)).append("\n");
    sb.append("    sdrValue: ").append(toIndentedString(sdrValue)).append("\n");
    sb.append("    termsOfSale: ").append(toIndentedString(termsOfSale)).append("\n");
    sb.append("    recipientTaxType: ").append(toIndentedString(recipientTaxType)).append("\n");
    sb.append("    recipientTaxID: ").append(toIndentedString(recipientTaxID)).append("\n");
    sb.append("    senderTaxType: ").append(toIndentedString(senderTaxType)).append("\n");
    sb.append("    senderTaxID: ").append(toIndentedString(senderTaxID)).append("\n");
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

