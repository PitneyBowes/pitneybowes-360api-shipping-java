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
import com.pitneybowes.api360.model.GetAllPickupsDataInnerPickupOptions;
import com.pitneybowes.api360.model.GetAllPickupsDataInnerPickupSummaryInner;
import com.pitneybowes.api360.model.SchedulePickupDHLEXPResponsePickupAddress;
import com.pitneybowes.api360.model.SchedulePickupUPSResponsePickupRate;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

/**
 * Model tests for GetAllPickupsDataInner
 */
class GetAllPickupsDataInnerTest {
    private final GetAllPickupsDataInner model = new GetAllPickupsDataInner();

    /**
     * Model tests for GetAllPickupsDataInner
     */
    @Test
    void testGetAllPickupsDataInner() {
        // TODO: test GetAllPickupsDataInner
    }

    /**
     * Test the property 'packageLocation'
     */
    @Test
    void packageLocationTest() {
        // TODO: test packageLocation
    }

    /**
     * Test the property 'pickupConfirmationNumber'
     */
    @Test
    void pickupConfirmationNumberTest() {
        // TODO: test pickupConfirmationNumber
    }

    /**
     * Test the property 'pickupId'
     */
    @Test
    void pickupIdTest() {
        // TODO: test pickupId
    }

    /**
     * Test the property 'carrier'
     */
    @Test
    void carrierTest() {
        // TODO: test carrier
    }

    /**
     * Test the property 'carrierAccountId'
     */
    @Test
    void carrierAccountIdTest() {
        // TODO: test carrierAccountId
    }

    /**
     * Test the property 'pickupAddress'
     */
    @Test
    void pickupAddressTest() {
        // TODO: test pickupAddress
    }

    /**
     * Test the property 'shipmentIds'
     */
    @Test
    void shipmentIdsTest() {
        // TODO: test shipmentIds
    }

    /**
     * Test the property 'pickupSummary'
     */
    @Test
    void pickupSummaryTest() {
        // TODO: test pickupSummary
    }

    /**
     * Test the property 'specialInstructions'
     */
    @Test
    void specialInstructionsTest() {
        // TODO: test specialInstructions
    }

    /**
     * Test the property 'reference'
     */
    @Test
    void referenceTest() {
        // TODO: test reference
    }

    /**
     * Test the property 'pickupDateTime'
     */
    @Test
    void pickupDateTimeTest() {
        // TODO: test pickupDateTime
    }

    /**
     * Test the property 'pickupTotalWeight'
     */
    @Test
    void pickupTotalWeightTest() {
        // TODO: test pickupTotalWeight
    }

    /**
     * Test the property 'pickupTotalWeightUnit'
     */
    @Test
    void pickupTotalWeightUnitTest() {
        // TODO: test pickupTotalWeightUnit
    }

    /**
     * Test the property 'pickupOptions'
     */
    @Test
    void pickupOptionsTest() {
        // TODO: test pickupOptions
    }

    /**
     * Test the property 'pickupRate'
     */
    @Test
    void pickupRateTest() {
        // TODO: test pickupRate
    }

}
