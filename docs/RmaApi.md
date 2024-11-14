# RmaApi

All URIs are relative to *https://rma.api.gogemini.io*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addNote**](RmaApi.md#addNote) | **POST** /rma.Rma/AddNote | Add a note to an RMA |
| [**approveReturn**](RmaApi.md#approveReturn) | **POST** /rma.Rma/ApproveReturn | Approve a return |
| [**cancelReturn**](RmaApi.md#cancelReturn) | **POST** /rma.Rma/CancelReturn | Cancel a return |
| [**confirmReturnApproveItems**](RmaApi.md#confirmReturnApproveItems) | **POST** /rma.Rma/ConfirmReturnApproveItems | Confirm return approve items |
| [**createReturn**](RmaApi.md#createReturn) | **POST** /rma.Rma/CreateReturn | Create a return |
| [**deleteNote**](RmaApi.md#deleteNote) | **POST** /rma.Rma/DeleteNote | Delete a note from an RMA |
| [**editNote**](RmaApi.md#editNote) | **POST** /rma.Rma/EditNote | Edit a note on an RMA |
| [**getReturn**](RmaApi.md#getReturn) | **POST** /rma.Rma/GetReturn | Get a return |
| [**listNotesByReturnId**](RmaApi.md#listNotesByReturnId) | **POST** /rma.Rma/ListNotesByReturnId | List notes by return id |
| [**listReturns**](RmaApi.md#listReturns) | **POST** /rma.Rma/ListReturns | List returns |
| [**refundReturn**](RmaApi.md#refundReturn) | **POST** /rma.Rma/RefundReturn | Refund a return |
| [**rejectReturn**](RmaApi.md#rejectReturn) | **POST** /rma.Rma/RejectReturn | Reject a return |
| [**setReceivedItems**](RmaApi.md#setReceivedItems) | **POST** /rma.Rma/SetReceivedItems | Set received items |
| [**skipReturnStatus**](RmaApi.md#skipReturnStatus) | **POST** /rma.Rma/SkipReturnStatus | Skip a return status |


<a id="addNote"></a>
# **addNote**
> RmaNoteResponse addNote(body)

Add a note to an RMA

### Example
```java
// Import classes:
import GeminiCommerce.Rma.ApiClient;
import GeminiCommerce.Rma.ApiException;
import GeminiCommerce.Rma.Configuration;
import GeminiCommerce.Rma.auth.*;
import GeminiCommerce.Rma.models.*;
import org.openapitools.client.api.RmaApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://rma.api.gogemini.io");
    
    RmaApi apiInstance = new RmaApi(defaultClient);
    RmaAddNoteRequest body = new RmaAddNoteRequest(); // RmaAddNoteRequest | 
    try {
      RmaNoteResponse result = apiInstance.addNote(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RmaApi#addNote");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **body** | [**RmaAddNoteRequest**](RmaAddNoteRequest.md)|  | |

### Return type

[**RmaNoteResponse**](RmaNoteResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **401** | Unauthorized |  -  |
| **500** | An internal error occurred is thrown when an incompatible payload is sent |  -  |
| **0** | An unexpected error response. |  -  |

<a id="approveReturn"></a>
# **approveReturn**
> RpcStatus approveReturn(body)

Approve a return

### Example
```java
// Import classes:
import GeminiCommerce.Rma.ApiClient;
import GeminiCommerce.Rma.ApiException;
import GeminiCommerce.Rma.Configuration;
import GeminiCommerce.Rma.auth.*;
import GeminiCommerce.Rma.models.*;
import org.openapitools.client.api.RmaApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://rma.api.gogemini.io");
    
    RmaApi apiInstance = new RmaApi(defaultClient);
    RmaApproveReturnRequest body = new RmaApproveReturnRequest(); // RmaApproveReturnRequest | 
    try {
      RpcStatus result = apiInstance.approveReturn(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RmaApi#approveReturn");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **body** | [**RmaApproveReturnRequest**](RmaApproveReturnRequest.md)|  | |

### Return type

[**RpcStatus**](RpcStatus.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **500** | An internal error occurred is thrown when an incompatible payload is sent |  -  |
| **0** | An unexpected error response. |  -  |

<a id="cancelReturn"></a>
# **cancelReturn**
> Object cancelReturn(body)

Cancel a return

### Example
```java
// Import classes:
import GeminiCommerce.Rma.ApiClient;
import GeminiCommerce.Rma.ApiException;
import GeminiCommerce.Rma.Configuration;
import GeminiCommerce.Rma.auth.*;
import GeminiCommerce.Rma.models.*;
import org.openapitools.client.api.RmaApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://rma.api.gogemini.io");
    
    RmaApi apiInstance = new RmaApi(defaultClient);
    RmaCancelReturnRequest body = new RmaCancelReturnRequest(); // RmaCancelReturnRequest | 
    try {
      Object result = apiInstance.cancelReturn(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RmaApi#cancelReturn");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **body** | [**RmaCancelReturnRequest**](RmaCancelReturnRequest.md)|  | |

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **401** | Unauthorized |  -  |
| **500** | An internal error occurred is thrown when an incompatible payload is sent |  -  |
| **0** | An unexpected error response. |  -  |

<a id="confirmReturnApproveItems"></a>
# **confirmReturnApproveItems**
> Object confirmReturnApproveItems(body)

Confirm return approve items

### Example
```java
// Import classes:
import GeminiCommerce.Rma.ApiClient;
import GeminiCommerce.Rma.ApiException;
import GeminiCommerce.Rma.Configuration;
import GeminiCommerce.Rma.auth.*;
import GeminiCommerce.Rma.models.*;
import org.openapitools.client.api.RmaApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://rma.api.gogemini.io");
    
    RmaApi apiInstance = new RmaApi(defaultClient);
    RmaConfirmReturnApproveItemsRequest body = new RmaConfirmReturnApproveItemsRequest(); // RmaConfirmReturnApproveItemsRequest | 
    try {
      Object result = apiInstance.confirmReturnApproveItems(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RmaApi#confirmReturnApproveItems");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **body** | [**RmaConfirmReturnApproveItemsRequest**](RmaConfirmReturnApproveItemsRequest.md)|  | |

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **401** | Unauthorized |  -  |
| **500** | An internal error occurred is thrown when an incompatible payload is sent |  -  |
| **0** | An unexpected error response. |  -  |

<a id="createReturn"></a>
# **createReturn**
> RmaReturnResponse createReturn(body)

Create a return

### Example
```java
// Import classes:
import GeminiCommerce.Rma.ApiClient;
import GeminiCommerce.Rma.ApiException;
import GeminiCommerce.Rma.Configuration;
import GeminiCommerce.Rma.auth.*;
import GeminiCommerce.Rma.models.*;
import org.openapitools.client.api.RmaApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://rma.api.gogemini.io");
    
    RmaApi apiInstance = new RmaApi(defaultClient);
    RmaCreateReturnRequest body = new RmaCreateReturnRequest(); // RmaCreateReturnRequest | 
    try {
      RmaReturnResponse result = apiInstance.createReturn(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RmaApi#createReturn");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **body** | [**RmaCreateReturnRequest**](RmaCreateReturnRequest.md)|  | |

### Return type

[**RmaReturnResponse**](RmaReturnResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **401** | Unauthorized |  -  |
| **500** | An internal error occurred is thrown when an incompatible payload is sent |  -  |
| **0** | An unexpected error response. |  -  |

<a id="deleteNote"></a>
# **deleteNote**
> Object deleteNote(body)

Delete a note from an RMA

### Example
```java
// Import classes:
import GeminiCommerce.Rma.ApiClient;
import GeminiCommerce.Rma.ApiException;
import GeminiCommerce.Rma.Configuration;
import GeminiCommerce.Rma.auth.*;
import GeminiCommerce.Rma.models.*;
import org.openapitools.client.api.RmaApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://rma.api.gogemini.io");
    
    RmaApi apiInstance = new RmaApi(defaultClient);
    RmaDeleteNoteRequest body = new RmaDeleteNoteRequest(); // RmaDeleteNoteRequest | 
    try {
      Object result = apiInstance.deleteNote(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RmaApi#deleteNote");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **body** | [**RmaDeleteNoteRequest**](RmaDeleteNoteRequest.md)|  | |

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **401** | Unauthorized |  -  |
| **500** | An internal error occurred is thrown when an incompatible payload is sent |  -  |
| **0** | An unexpected error response. |  -  |

<a id="editNote"></a>
# **editNote**
> RmaNoteResponse editNote(body)

Edit a note on an RMA

### Example
```java
// Import classes:
import GeminiCommerce.Rma.ApiClient;
import GeminiCommerce.Rma.ApiException;
import GeminiCommerce.Rma.Configuration;
import GeminiCommerce.Rma.auth.*;
import GeminiCommerce.Rma.models.*;
import org.openapitools.client.api.RmaApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://rma.api.gogemini.io");
    
    RmaApi apiInstance = new RmaApi(defaultClient);
    RmaEditNoteRequest body = new RmaEditNoteRequest(); // RmaEditNoteRequest | 
    try {
      RmaNoteResponse result = apiInstance.editNote(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RmaApi#editNote");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **body** | [**RmaEditNoteRequest**](RmaEditNoteRequest.md)|  | |

### Return type

[**RmaNoteResponse**](RmaNoteResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **401** | Unauthorized |  -  |
| **500** | An internal error occurred is thrown when an incompatible payload is sent |  -  |
| **0** | An unexpected error response. |  -  |

<a id="getReturn"></a>
# **getReturn**
> RmaReturnResponse getReturn(body)

Get a return

### Example
```java
// Import classes:
import GeminiCommerce.Rma.ApiClient;
import GeminiCommerce.Rma.ApiException;
import GeminiCommerce.Rma.Configuration;
import GeminiCommerce.Rma.auth.*;
import GeminiCommerce.Rma.models.*;
import org.openapitools.client.api.RmaApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://rma.api.gogemini.io");
    
    RmaApi apiInstance = new RmaApi(defaultClient);
    RmaGetReturnRequest body = new RmaGetReturnRequest(); // RmaGetReturnRequest | 
    try {
      RmaReturnResponse result = apiInstance.getReturn(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RmaApi#getReturn");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **body** | [**RmaGetReturnRequest**](RmaGetReturnRequest.md)|  | |

### Return type

[**RmaReturnResponse**](RmaReturnResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **401** | Unauthorized |  -  |
| **500** | An internal error occurred is thrown when an incompatible payload is sent |  -  |
| **0** | An unexpected error response. |  -  |

<a id="listNotesByReturnId"></a>
# **listNotesByReturnId**
> RmaListNotesByReturnIdResponse listNotesByReturnId(body)

List notes by return id

### Example
```java
// Import classes:
import GeminiCommerce.Rma.ApiClient;
import GeminiCommerce.Rma.ApiException;
import GeminiCommerce.Rma.Configuration;
import GeminiCommerce.Rma.auth.*;
import GeminiCommerce.Rma.models.*;
import org.openapitools.client.api.RmaApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://rma.api.gogemini.io");
    
    RmaApi apiInstance = new RmaApi(defaultClient);
    RmaListNotesByReturnIdRequest body = new RmaListNotesByReturnIdRequest(); // RmaListNotesByReturnIdRequest | 
    try {
      RmaListNotesByReturnIdResponse result = apiInstance.listNotesByReturnId(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RmaApi#listNotesByReturnId");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **body** | [**RmaListNotesByReturnIdRequest**](RmaListNotesByReturnIdRequest.md)|  | |

### Return type

[**RmaListNotesByReturnIdResponse**](RmaListNotesByReturnIdResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **401** | Unauthorized |  -  |
| **500** | An internal error occurred is thrown when an incompatible payload is sent |  -  |
| **0** | An unexpected error response. |  -  |

<a id="listReturns"></a>
# **listReturns**
> RmaListReturnsResponse listReturns(body)

List returns

### Example
```java
// Import classes:
import GeminiCommerce.Rma.ApiClient;
import GeminiCommerce.Rma.ApiException;
import GeminiCommerce.Rma.Configuration;
import GeminiCommerce.Rma.auth.*;
import GeminiCommerce.Rma.models.*;
import org.openapitools.client.api.RmaApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://rma.api.gogemini.io");
    
    RmaApi apiInstance = new RmaApi(defaultClient);
    RmaListReturnsRequest body = new RmaListReturnsRequest(); // RmaListReturnsRequest | 
    try {
      RmaListReturnsResponse result = apiInstance.listReturns(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RmaApi#listReturns");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **body** | [**RmaListReturnsRequest**](RmaListReturnsRequest.md)|  | |

### Return type

[**RmaListReturnsResponse**](RmaListReturnsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **401** | Unauthorized |  -  |
| **500** | An internal error occurred is thrown when an incompatible payload is sent |  -  |
| **0** | An unexpected error response. |  -  |

<a id="refundReturn"></a>
# **refundReturn**
> Object refundReturn(body)

Refund a return

### Example
```java
// Import classes:
import GeminiCommerce.Rma.ApiClient;
import GeminiCommerce.Rma.ApiException;
import GeminiCommerce.Rma.Configuration;
import GeminiCommerce.Rma.auth.*;
import GeminiCommerce.Rma.models.*;
import org.openapitools.client.api.RmaApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://rma.api.gogemini.io");
    
    RmaApi apiInstance = new RmaApi(defaultClient);
    RmaRefundReturnRequest body = new RmaRefundReturnRequest(); // RmaRefundReturnRequest | 
    try {
      Object result = apiInstance.refundReturn(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RmaApi#refundReturn");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **body** | [**RmaRefundReturnRequest**](RmaRefundReturnRequest.md)|  | |

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **401** | Unauthorized |  -  |
| **500** | An internal error occurred is thrown when an incompatible payload is sent |  -  |
| **0** | An unexpected error response. |  -  |

<a id="rejectReturn"></a>
# **rejectReturn**
> Object rejectReturn(body)

Reject a return

### Example
```java
// Import classes:
import GeminiCommerce.Rma.ApiClient;
import GeminiCommerce.Rma.ApiException;
import GeminiCommerce.Rma.Configuration;
import GeminiCommerce.Rma.auth.*;
import GeminiCommerce.Rma.models.*;
import org.openapitools.client.api.RmaApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://rma.api.gogemini.io");
    
    RmaApi apiInstance = new RmaApi(defaultClient);
    RmaRejectReturnRequest body = new RmaRejectReturnRequest(); // RmaRejectReturnRequest | 
    try {
      Object result = apiInstance.rejectReturn(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RmaApi#rejectReturn");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **body** | [**RmaRejectReturnRequest**](RmaRejectReturnRequest.md)|  | |

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **401** | Unauthorized |  -  |
| **500** | An internal error occurred is thrown when an incompatible payload is sent |  -  |
| **0** | An unexpected error response. |  -  |

<a id="setReceivedItems"></a>
# **setReceivedItems**
> Object setReceivedItems(body)

Set received items

### Example
```java
// Import classes:
import GeminiCommerce.Rma.ApiClient;
import GeminiCommerce.Rma.ApiException;
import GeminiCommerce.Rma.Configuration;
import GeminiCommerce.Rma.auth.*;
import GeminiCommerce.Rma.models.*;
import org.openapitools.client.api.RmaApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://rma.api.gogemini.io");
    
    RmaApi apiInstance = new RmaApi(defaultClient);
    RmaSetReceivedItemsRequest body = new RmaSetReceivedItemsRequest(); // RmaSetReceivedItemsRequest | 
    try {
      Object result = apiInstance.setReceivedItems(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RmaApi#setReceivedItems");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **body** | [**RmaSetReceivedItemsRequest**](RmaSetReceivedItemsRequest.md)|  | |

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **401** | Unauthorized |  -  |
| **500** | An internal error occurred is thrown when an incompatible payload is sent |  -  |
| **0** | An unexpected error response. |  -  |

<a id="skipReturnStatus"></a>
# **skipReturnStatus**
> Object skipReturnStatus(body)

Skip a return status

### Example
```java
// Import classes:
import GeminiCommerce.Rma.ApiClient;
import GeminiCommerce.Rma.ApiException;
import GeminiCommerce.Rma.Configuration;
import GeminiCommerce.Rma.auth.*;
import GeminiCommerce.Rma.models.*;
import org.openapitools.client.api.RmaApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://rma.api.gogemini.io");
    
    RmaApi apiInstance = new RmaApi(defaultClient);
    RmaSkipReturnStatusRequest body = new RmaSkipReturnStatusRequest(); // RmaSkipReturnStatusRequest | 
    try {
      Object result = apiInstance.skipReturnStatus(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RmaApi#skipReturnStatus");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **body** | [**RmaSkipReturnStatusRequest**](RmaSkipReturnStatusRequest.md)|  | |

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **401** | Unauthorized |  -  |
| **500** | An internal error occurred is thrown when an incompatible payload is sent |  -  |
| **0** | An unexpected error response. |  -  |

