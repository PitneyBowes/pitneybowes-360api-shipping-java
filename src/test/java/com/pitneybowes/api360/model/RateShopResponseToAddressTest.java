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
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

/**
 * Model tests for RateShopResponseToAddress
 */
class RateShopResponseToAddressTest {
    private final RateShopResponseToAddress model = new RateShopResponseToAddress();

    /**
     * Model tests for RateShopResponseToAddress
     */
    @Test
    void testRateShopResponseToAddress() {
        // TODO: test RateShopResponseToAddress
    }

    /**
     * Test the property 'addressLine1'
     */
    @Test
    void addressLine1Test() {
        // TODO: test addressLine1
    }

    /**
     * Test the property 'addressLine2'
     */
    @Test
    void addressLine2Test() {
        // TODO: test addressLine2
    }

    /**
     * Test the property 'addressLine3'
     */
    @Test
    void addressLine3Test() {
        // TODO: test addressLine3
    }

    /**
     * Test the property 'cityTown'
     */
    @Test
    void cityTownTest() {
        // TODO: test cityTown
    }

    /**
     * Test the property 'company'
     */
    @Test
    void companyTest() {
        // TODO: test company
    }

    /**
     * Test the property 'countryCode'
     */
    @Test
    void countryCodeTest() {
        // TODO: test countryCode
    }

    /**
     * Test the property 'email'
     */
    @Test
    void emailTest() {
        // TODO: test email
    }

    /**
     * Test the property 'name'
     */
    @Test
    void nameTest() {
        // TODO: test name
    }

    /**
     * Test the property 'phone'
     */
    @Test
    void phoneTest() {
        // TODO: test phone
    }

    /**
     * Test the property 'postalCode'
     */
    @Test
    void postalCodeTest() {
        // TODO: test postalCode
    }

    /**
     * Test the property 'residential'
     */
    @Test
    void residentialTest() {
        // TODO: test residential
    }

    /**
     * Test the property 'stateProvince'
     */
    @Test
    void stateProvinceTest() {
        // TODO: test stateProvince
    }

}
