# # RmaOrderData


## Properties 


Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**createdAt**| [**OffsetDateTime**](OffsetDateTime.md) |   | [optional]
**updatedAt**| [**OffsetDateTime**](OffsetDateTime.md) |   | [optional]
**grn**| **String** |   | [optional]
**number**| **String** |   | [optional]
**status**| **String** |   | [optional]
**channel**| **String** |   | [optional]
**market**| **String** |   | [optional]
**items**| [**List<RmaOrderDataItem>**](RmaOrderDataItem.md) |   | [optional] [default to new ArrayList<>()]
**currency**| [**RmaCurrency**](RmaCurrency.md) |  for more information please, see Model/RmaCurrency.php  | [optional] [default to RmaCurrency.XXX]
**subtotals**| [**Map<String, OrderDataSubtotal>**](OrderDataSubtotal.md) |   | [optional] [default to new HashMap<>()]
**totals**| [**Map<String, OrderDataTotal>**](OrderDataTotal.md) |   | [optional] [default to new HashMap<>()]


[[Back to Model list]](../../README.md#models) [[Back to API list]](../../README.md#endpoints) [[Back to README]](../../README.md)

