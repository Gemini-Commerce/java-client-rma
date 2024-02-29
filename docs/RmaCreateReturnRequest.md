# # RmaCreateReturnRequest


## Properties 


Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**tenantId**| **String** |   |
**orderGrn**| **String** |   |
**products**| [**List<CreateReturnRequestProduct>**](CreateReturnRequestProduct.md) |   | [default to new ArrayList<>()]
**preferredRefundMethod**| [**RmaRefundMethod**](RmaRefundMethod.md) |  for more information please, see Model/RmaRefundMethod.php  | [default to RmaRefundMethod.UNKNOWN]
**refundShippingCost**| **Boolean** |   | [optional]
**refundPaymentCost**| **Boolean** |   | [optional]
**customerInfo**| [**RmaCustomerInfo**](RmaCustomerInfo.md) |   | [optional]
**returnAddress**| [**RmaPostalAddress**](RmaPostalAddress.md) |   | [optional]
**note**| **String** |   | [optional]


[[Back to Model list]](../../README.md#models) [[Back to API list]](../../README.md#endpoints) [[Back to README]](../../README.md)

