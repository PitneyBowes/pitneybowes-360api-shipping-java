

# ShipmentDomesticByRulesetByRuleSet

User can create the Shipment using Rule Set.<br /> By Rule Set means a rule that is defined as one or more conditions resulting in an action (or more than one action). <br /> The conditions and actions can vary widely.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**ruleType** | [**RuleTypeEnum**](#RuleTypeEnum) | The Rule Type is a condition applied to RateGroup by Product side, which can be applicable for a client or set of client users. |  [optional] |
|**hazmat** | **String** | This is for Hazardous material. |  [optional] |
|**shipOption** | **String** | The options for shipment usually created based on priority or Zone. |  [optional] |



## Enum: RuleTypeEnum

| Name | Value |
|---- | -----|
| CHEAPEST | &quot;Cheapest&quot; |
| FASTEST | &quot;Fastest&quot; |



