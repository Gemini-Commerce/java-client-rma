/*
 * RMA Service
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: v1
 * Contact: info@gemini-commerce.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.client.model.CreateReturnRequestProduct;
import org.openapitools.client.model.RmaCustomerInfo;
import org.openapitools.client.model.RmaPostalAddress;
import org.openapitools.client.model.RmaRefundMethod;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import GeminiCommerce_Rma.JSON;

/**
 * RmaCreateReturnRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-02-29T12:17:10.426764957Z[Etc/UTC]")
public class RmaCreateReturnRequest {
  public static final String SERIALIZED_NAME_TENANT_ID = "tenantId";
  @SerializedName(SERIALIZED_NAME_TENANT_ID)
  private String tenantId;

  public static final String SERIALIZED_NAME_ORDER_GRN = "orderGrn";
  @SerializedName(SERIALIZED_NAME_ORDER_GRN)
  private String orderGrn;

  public static final String SERIALIZED_NAME_PRODUCTS = "products";
  @SerializedName(SERIALIZED_NAME_PRODUCTS)
  private List<CreateReturnRequestProduct> products = new ArrayList<>();

  public static final String SERIALIZED_NAME_PREFERRED_REFUND_METHOD = "preferredRefundMethod";
  @SerializedName(SERIALIZED_NAME_PREFERRED_REFUND_METHOD)
  private RmaRefundMethod preferredRefundMethod = RmaRefundMethod.UNKNOWN;

  public static final String SERIALIZED_NAME_REFUND_SHIPPING_COST = "refundShippingCost";
  @SerializedName(SERIALIZED_NAME_REFUND_SHIPPING_COST)
  private Boolean refundShippingCost;

  public static final String SERIALIZED_NAME_REFUND_PAYMENT_COST = "refundPaymentCost";
  @SerializedName(SERIALIZED_NAME_REFUND_PAYMENT_COST)
  private Boolean refundPaymentCost;

  public static final String SERIALIZED_NAME_CUSTOMER_INFO = "customerInfo";
  @SerializedName(SERIALIZED_NAME_CUSTOMER_INFO)
  private RmaCustomerInfo customerInfo;

  public static final String SERIALIZED_NAME_RETURN_ADDRESS = "returnAddress";
  @SerializedName(SERIALIZED_NAME_RETURN_ADDRESS)
  private RmaPostalAddress returnAddress;

  public static final String SERIALIZED_NAME_NOTE = "note";
  @SerializedName(SERIALIZED_NAME_NOTE)
  private String note;

  public RmaCreateReturnRequest() {
  }

  public RmaCreateReturnRequest tenantId(String tenantId) {
    this.tenantId = tenantId;
    return this;
  }

   /**
   * Get tenantId
   * @return tenantId
  **/
  @javax.annotation.Nonnull
  public String getTenantId() {
    return tenantId;
  }

  public void setTenantId(String tenantId) {
    this.tenantId = tenantId;
  }


  public RmaCreateReturnRequest orderGrn(String orderGrn) {
    this.orderGrn = orderGrn;
    return this;
  }

   /**
   * Get orderGrn
   * @return orderGrn
  **/
  @javax.annotation.Nonnull
  public String getOrderGrn() {
    return orderGrn;
  }

  public void setOrderGrn(String orderGrn) {
    this.orderGrn = orderGrn;
  }


  public RmaCreateReturnRequest products(List<CreateReturnRequestProduct> products) {
    this.products = products;
    return this;
  }

  public RmaCreateReturnRequest addProductsItem(CreateReturnRequestProduct productsItem) {
    if (this.products == null) {
      this.products = new ArrayList<>();
    }
    this.products.add(productsItem);
    return this;
  }

   /**
   * Get products
   * @return products
  **/
  @javax.annotation.Nonnull
  public List<CreateReturnRequestProduct> getProducts() {
    return products;
  }

  public void setProducts(List<CreateReturnRequestProduct> products) {
    this.products = products;
  }


  public RmaCreateReturnRequest preferredRefundMethod(RmaRefundMethod preferredRefundMethod) {
    this.preferredRefundMethod = preferredRefundMethod;
    return this;
  }

   /**
   * Get preferredRefundMethod
   * @return preferredRefundMethod
  **/
  @javax.annotation.Nonnull
  public RmaRefundMethod getPreferredRefundMethod() {
    return preferredRefundMethod;
  }

  public void setPreferredRefundMethod(RmaRefundMethod preferredRefundMethod) {
    this.preferredRefundMethod = preferredRefundMethod;
  }


  public RmaCreateReturnRequest refundShippingCost(Boolean refundShippingCost) {
    this.refundShippingCost = refundShippingCost;
    return this;
  }

   /**
   * Get refundShippingCost
   * @return refundShippingCost
  **/
  @javax.annotation.Nullable
  public Boolean getRefundShippingCost() {
    return refundShippingCost;
  }

  public void setRefundShippingCost(Boolean refundShippingCost) {
    this.refundShippingCost = refundShippingCost;
  }


  public RmaCreateReturnRequest refundPaymentCost(Boolean refundPaymentCost) {
    this.refundPaymentCost = refundPaymentCost;
    return this;
  }

   /**
   * Get refundPaymentCost
   * @return refundPaymentCost
  **/
  @javax.annotation.Nullable
  public Boolean getRefundPaymentCost() {
    return refundPaymentCost;
  }

  public void setRefundPaymentCost(Boolean refundPaymentCost) {
    this.refundPaymentCost = refundPaymentCost;
  }


  public RmaCreateReturnRequest customerInfo(RmaCustomerInfo customerInfo) {
    this.customerInfo = customerInfo;
    return this;
  }

   /**
   * Get customerInfo
   * @return customerInfo
  **/
  @javax.annotation.Nullable
  public RmaCustomerInfo getCustomerInfo() {
    return customerInfo;
  }

  public void setCustomerInfo(RmaCustomerInfo customerInfo) {
    this.customerInfo = customerInfo;
  }


  public RmaCreateReturnRequest returnAddress(RmaPostalAddress returnAddress) {
    this.returnAddress = returnAddress;
    return this;
  }

   /**
   * Get returnAddress
   * @return returnAddress
  **/
  @javax.annotation.Nullable
  public RmaPostalAddress getReturnAddress() {
    return returnAddress;
  }

  public void setReturnAddress(RmaPostalAddress returnAddress) {
    this.returnAddress = returnAddress;
  }


  public RmaCreateReturnRequest note(String note) {
    this.note = note;
    return this;
  }

   /**
   * Get note
   * @return note
  **/
  @javax.annotation.Nullable
  public String getNote() {
    return note;
  }

  public void setNote(String note) {
    this.note = note;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RmaCreateReturnRequest rmaCreateReturnRequest = (RmaCreateReturnRequest) o;
    return Objects.equals(this.tenantId, rmaCreateReturnRequest.tenantId) &&
        Objects.equals(this.orderGrn, rmaCreateReturnRequest.orderGrn) &&
        Objects.equals(this.products, rmaCreateReturnRequest.products) &&
        Objects.equals(this.preferredRefundMethod, rmaCreateReturnRequest.preferredRefundMethod) &&
        Objects.equals(this.refundShippingCost, rmaCreateReturnRequest.refundShippingCost) &&
        Objects.equals(this.refundPaymentCost, rmaCreateReturnRequest.refundPaymentCost) &&
        Objects.equals(this.customerInfo, rmaCreateReturnRequest.customerInfo) &&
        Objects.equals(this.returnAddress, rmaCreateReturnRequest.returnAddress) &&
        Objects.equals(this.note, rmaCreateReturnRequest.note);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tenantId, orderGrn, products, preferredRefundMethod, refundShippingCost, refundPaymentCost, customerInfo, returnAddress, note);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RmaCreateReturnRequest {\n");
    sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
    sb.append("    orderGrn: ").append(toIndentedString(orderGrn)).append("\n");
    sb.append("    products: ").append(toIndentedString(products)).append("\n");
    sb.append("    preferredRefundMethod: ").append(toIndentedString(preferredRefundMethod)).append("\n");
    sb.append("    refundShippingCost: ").append(toIndentedString(refundShippingCost)).append("\n");
    sb.append("    refundPaymentCost: ").append(toIndentedString(refundPaymentCost)).append("\n");
    sb.append("    customerInfo: ").append(toIndentedString(customerInfo)).append("\n");
    sb.append("    returnAddress: ").append(toIndentedString(returnAddress)).append("\n");
    sb.append("    note: ").append(toIndentedString(note)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("tenantId");
    openapiFields.add("orderGrn");
    openapiFields.add("products");
    openapiFields.add("preferredRefundMethod");
    openapiFields.add("refundShippingCost");
    openapiFields.add("refundPaymentCost");
    openapiFields.add("customerInfo");
    openapiFields.add("returnAddress");
    openapiFields.add("note");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("tenantId");
    openapiRequiredFields.add("orderGrn");
    openapiRequiredFields.add("products");
    openapiRequiredFields.add("preferredRefundMethod");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to RmaCreateReturnRequest
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!RmaCreateReturnRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in RmaCreateReturnRequest is not found in the empty JSON string", RmaCreateReturnRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!RmaCreateReturnRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `RmaCreateReturnRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : RmaCreateReturnRequest.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("tenantId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `tenantId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("tenantId").toString()));
      }
      if (!jsonObj.get("orderGrn").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `orderGrn` to be a primitive type in the JSON string but got `%s`", jsonObj.get("orderGrn").toString()));
      }
      // ensure the json data is an array
      if (!jsonObj.get("products").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `products` to be an array in the JSON string but got `%s`", jsonObj.get("products").toString()));
      }

      JsonArray jsonArrayproducts = jsonObj.getAsJsonArray("products");
      // validate the required field `products` (array)
      for (int i = 0; i < jsonArrayproducts.size(); i++) {
        CreateReturnRequestProduct.validateJsonElement(jsonArrayproducts.get(i));
      };
      // validate the required field `preferredRefundMethod`
      RmaRefundMethod.validateJsonElement(jsonObj.get("preferredRefundMethod"));
      // validate the optional field `customerInfo`
      if (jsonObj.get("customerInfo") != null && !jsonObj.get("customerInfo").isJsonNull()) {
        RmaCustomerInfo.validateJsonElement(jsonObj.get("customerInfo"));
      }
      // validate the optional field `returnAddress`
      if (jsonObj.get("returnAddress") != null && !jsonObj.get("returnAddress").isJsonNull()) {
        RmaPostalAddress.validateJsonElement(jsonObj.get("returnAddress"));
      }
      if ((jsonObj.get("note") != null && !jsonObj.get("note").isJsonNull()) && !jsonObj.get("note").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `note` to be a primitive type in the JSON string but got `%s`", jsonObj.get("note").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!RmaCreateReturnRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'RmaCreateReturnRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<RmaCreateReturnRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(RmaCreateReturnRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<RmaCreateReturnRequest>() {
           @Override
           public void write(JsonWriter out, RmaCreateReturnRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public RmaCreateReturnRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of RmaCreateReturnRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of RmaCreateReturnRequest
  * @throws IOException if the JSON string is invalid with respect to RmaCreateReturnRequest
  */
  public static RmaCreateReturnRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, RmaCreateReturnRequest.class);
  }

 /**
  * Convert an instance of RmaCreateReturnRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
