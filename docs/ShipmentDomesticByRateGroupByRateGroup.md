

# ShipmentDomesticByRateGroupByRateGroup

Indicates the category to select how cheap the carrier service is, or which carrier has fastest service. <br /> It displays the list of those services. 

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**ruleType** | [**RuleTypeEnum**](#RuleTypeEnum) | The Rule Type is a condition applied to RateGroup by Product side as per the customer requirement, which can have following options: Cheapest, Fastest, and deliverBy. &lt;br /&gt; If ruleType is deliverBy, then deliverBy date under deliveryOption will be mandatory to provide. |  |
|**rateGroupId** | **String** | This is a unique identifier assigned to the created RateGroup, which is used in the shipment creation. |  |



## Enum: RuleTypeEnum

| Name | Value |
|---- | -----|
| CHEAPEST | &quot;Cheapest&quot; |
| FASTEST | &quot;Fastest&quot; |
| DELIVER_BY | &quot;DeliverBy&quot; |



