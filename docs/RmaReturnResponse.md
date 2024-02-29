# # RmaReturnResponse


## Properties 


Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id**| **String** |   | [optional]
**grn**| **String** |   | [optional]
**orderGrn**| **String** |   | [optional]
**status**| **String** |   | [optional]
**products**| [**List<RmaReturnProduct>**](RmaReturnProduct.md) |   | [optional]
**preferredRefundMethod**| [**RmaRefundMethod**](RmaRefundMethod.md) |  for more information please, see Model/RmaRefundMethod.php  | [optional] [default to RmaRefundMethod.UNKNOWN]
**refundShippingCost**| **Boolean** |   | [optional]
**refundPaymentCost**| **Boolean** |   | [optional]
**customerInfo**| [**RmaCustomerInfo**](RmaCustomerInfo.md) |   | [optional]
**returnAddress**| [**RmaPostalAddress**](RmaPostalAddress.md) |   | [optional]
**note**| **String** |   | [optional]
**history**| [**List<RmaReturnHistory>**](RmaReturnHistory.md) |   | [optional]
**createdAt**| [**OffsetDateTime**](OffsetDateTime.md) |   | [optional]
**updatedAt**| [**OffsetDateTime**](OffsetDateTime.md) |   | [optional]
**orderData**| [**RmaOrderData**](RmaOrderData.md) |   | [optional]


[[Back to Model list]](../../README.md#models) [[Back to API list]](../../README.md#endpoints) [[Back to README]](../../README.md)

