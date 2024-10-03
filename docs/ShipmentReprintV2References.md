

# ShipmentReprintV2References

Contains key value map for passing references which is printed on Shipping Label. <br />For example Department Name, Invoice No., PO No., Package description, Order No./ Purchase Order No., Carrier note, Cost Account No., Transportation No., etc. . Max references allowed here is 2, and max length of each Reference field is 30. [IN/OUT].

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**additionalReference1** | **String** | Additional Reference is hardly used, but sender can mention anything as per requirement, just for Recipient&#39;s information. &lt;br /&gt; &#x60;Max length &#x3D; 30&#x60;. |  [optional] |
|**additionalReference2** | **String** | Any tags or information that to be shown to Recipient, can be mentioned by Sender, which is not indicated on AdditionalReference1 field, e.g. PO No, Order No. etc.&lt;br /&gt; &#x60;Max length &#x3D; 30&#x60;. |  [optional] |



