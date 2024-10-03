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
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

/**
 * Model tests for ShipmentDomesticByCarrier
 */
class ShipmentDomesticByCarrierTest {
    private final ShipmentDomesticByCarrier model = new ShipmentDomesticByCarrier();

    /**
     * Model tests for ShipmentDomesticByCarrier
     */
    @Test
    void testShipmentDomesticByCarrier() {
        // TODO: test ShipmentDomesticByCarrier
    }

    /**
     * Test the property 'fromAddress'
     */
    @Test
    void fromAddressTest() {
        // TODO: test fromAddress
    }

    /**
     * Test the property 'toAddress'
     */
    @Test
    void toAddressTest() {
        // TODO: test toAddress
    }

    /**
     * Test the property 'parcel'
     */
    @Test
    void parcelTest() {
        // TODO: test parcel
    }

    /**
     * Test the property 'parcelType'
     */
    @Test
    void parcelTypeTest() {
        // TODO: test parcelType
    }

    /**
     * Test the property 'rateShopBy'
     */
    @Test
    void rateShopByTest() {
        // TODO: test rateShopBy
    }

    /**
     * Test the property 'byCarrier'
     */
    @Test
    void byCarrierTest() {
        // TODO: test byCarrier
    }

    /**
     * Test the property 'shipmentOptions'
     */
    @Test
    void shipmentOptionsTest() {
        // TODO: test shipmentOptions
    }

    /**
     * Test the property 'docTab'
     */
    @Test
    void docTabTest() {
        // TODO: test docTab
    }

    /**
     * Test the property 'deliveryConfirmation'
     */
    @Test
    void deliveryConfirmationTest() {
        // TODO: test deliveryConfirmation
    }

    /**
     * Test the property 'handling'
     */
    @Test
    void handlingTest() {
        // TODO: test handling
    }

    /**
     * Test the property 'insurance'
     */
    @Test
    void insuranceTest() {
        // TODO: test insurance
    }

    /**
     * Test the property 'references'
     */
    @Test
    void referencesTest() {
        // TODO: test references
    }

    /**
     * Test the property 'metadata'
     */
    @Test
    void metadataTest() {
        // TODO: test metadata
    }

    /**
     * Test the property 'labelSize'
     */
    @Test
    void labelSizeTest() {
        // TODO: test labelSize
    }

    /**
     * Test the property 'labelType'
     */
    @Test
    void labelTypeTest() {
        // TODO: test labelType
    }

    /**
     * Test the property 'labelFormat'
     */
    @Test
    void labelFormatTest() {
        // TODO: test labelFormat
    }

    /**
     * Test the property 'printerAliasName'
     */
    @Test
    void printerAliasNameTest() {
        // TODO: test printerAliasName
    }

    /**
     * Test the property 'dateOfShipment'
     */
    @Test
    void dateOfShipmentTest() {
        // TODO: test dateOfShipment
    }

    /**
     * Test the property 'deliveryOption'
     */
    @Test
    void deliveryOptionTest() {
        // TODO: test deliveryOption
    }

}
