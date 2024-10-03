

# ShipmentDomesticByRulesetDeliveryOption

There are two options of delivery: deliverBy and useBestNextDate, where customer can schedule the delivery date in deliverBy. <br /> In case if the customer's scheduled `deliverBy` date falls under Holiday, then `useBestNextDate` will be used by our system. Then, we will mark the second option and deliver the same.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**deliverBy** | **LocalDate** | Delivery date is the data when shipment is to be delivered, which is scheduled by sender. The format of the Date is YYYY-MM-DD. &lt;br /&gt; This field will be mandatory to provide, if the customer chooses ruleType is deliverBy. |  [optional] |
|**useBestNextDate** | **Boolean** | When this is set to true, if the scheduled delivery date falls on a Holiday or there is no carrier to deliver on the deliverby date, then the next business day will be considered to deliver the shipment. |  [optional] |



