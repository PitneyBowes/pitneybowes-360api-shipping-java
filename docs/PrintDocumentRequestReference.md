

# PrintDocumentRequestReference

- Contains key value map for passing references. Max references allowed is 6. <br /> - References are tags or information that is printed on Shipping Label based on the customer's requirement.<br /> - Reference Fields can have values/indication like department name, invoice no., package description, purchase order no., carrier note, cost account no., transportation no., or PO No., etc. <br /> - Each of the reference field can have only one indication/value. 

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**reference1** | **String** | Reference 1 can have one of the above-indicated values/information, which is printed on Label, e.g. Cost Account No. (if any) or Invoice Number. &lt;br /&gt; &#x60;Max length &#x3D; 30&#x60;. |  [optional] |
|**reference2** | **String** | Reference 2 can have other details as indicated in the list above. This is also printed on Label, e.g. Package Description . &lt;br /&gt; &#x60;Max length &#x3D; 30&#x60;. |  [optional] |
|**reference3** | **String** | Reference 3 can have the information which were not fulfilled in Ref1 and Ref2, e.g. Order No. or Purchase Order ID. &lt;br /&gt; &#x60;Max length &#x3D; 30&#x60;. |  [optional] |
|**reference4** | **String** | Reference 4 can have more information which were not provided in Ref1, Ref2, or Ref3 e.g. Carrier Note. &lt;br /&gt; &#x60;Max length &#x3D; 30&#x60;. |  [optional] |



