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
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.openapitools.client.model.OrderDataSubtotal;
import org.openapitools.client.model.OrderDataTotal;
import org.openapitools.client.model.RmaCurrency;
import org.openapitools.client.model.RmaOrderDataItem;

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
 * RmaOrderData
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-02-29T12:17:10.426764957Z[Etc/UTC]")
public class RmaOrderData {
  public static final String SERIALIZED_NAME_CREATED_AT = "createdAt";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private OffsetDateTime createdAt;

  public static final String SERIALIZED_NAME_UPDATED_AT = "updatedAt";
  @SerializedName(SERIALIZED_NAME_UPDATED_AT)
  private OffsetDateTime updatedAt;

  public static final String SERIALIZED_NAME_GRN = "grn";
  @SerializedName(SERIALIZED_NAME_GRN)
  private String grn;

  public static final String SERIALIZED_NAME_NUMBER = "number";
  @SerializedName(SERIALIZED_NAME_NUMBER)
  private String number;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private String status;

  public static final String SERIALIZED_NAME_CHANNEL = "channel";
  @SerializedName(SERIALIZED_NAME_CHANNEL)
  private String channel;

  public static final String SERIALIZED_NAME_MARKET = "market";
  @SerializedName(SERIALIZED_NAME_MARKET)
  private String market;

  public static final String SERIALIZED_NAME_ITEMS = "items";
  @SerializedName(SERIALIZED_NAME_ITEMS)
  private List<RmaOrderDataItem> items;

  public static final String SERIALIZED_NAME_CURRENCY = "currency";
  @SerializedName(SERIALIZED_NAME_CURRENCY)
  private RmaCurrency currency = RmaCurrency.XXX;

  public static final String SERIALIZED_NAME_SUBTOTALS = "subtotals";
  @SerializedName(SERIALIZED_NAME_SUBTOTALS)
  private Map<String, OrderDataSubtotal> subtotals = new HashMap<>();

  public static final String SERIALIZED_NAME_TOTALS = "totals";
  @SerializedName(SERIALIZED_NAME_TOTALS)
  private Map<String, OrderDataTotal> totals = new HashMap<>();

  public RmaOrderData() {
  }

  public RmaOrderData createdAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Get createdAt
   * @return createdAt
  **/
  @javax.annotation.Nullable
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }


  public RmaOrderData updatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

   /**
   * Get updatedAt
   * @return updatedAt
  **/
  @javax.annotation.Nullable
  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
  }


  public RmaOrderData grn(String grn) {
    this.grn = grn;
    return this;
  }

   /**
   * Get grn
   * @return grn
  **/
  @javax.annotation.Nullable
  public String getGrn() {
    return grn;
  }

  public void setGrn(String grn) {
    this.grn = grn;
  }


  public RmaOrderData number(String number) {
    this.number = number;
    return this;
  }

   /**
   * Get number
   * @return number
  **/
  @javax.annotation.Nullable
  public String getNumber() {
    return number;
  }

  public void setNumber(String number) {
    this.number = number;
  }


  public RmaOrderData status(String status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nullable
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }


  public RmaOrderData channel(String channel) {
    this.channel = channel;
    return this;
  }

   /**
   * Get channel
   * @return channel
  **/
  @javax.annotation.Nullable
  public String getChannel() {
    return channel;
  }

  public void setChannel(String channel) {
    this.channel = channel;
  }


  public RmaOrderData market(String market) {
    this.market = market;
    return this;
  }

   /**
   * Get market
   * @return market
  **/
  @javax.annotation.Nullable
  public String getMarket() {
    return market;
  }

  public void setMarket(String market) {
    this.market = market;
  }


  public RmaOrderData items(List<RmaOrderDataItem> items) {
    this.items = items;
    return this;
  }

  public RmaOrderData addItemsItem(RmaOrderDataItem itemsItem) {
    if (this.items == null) {
      this.items = new ArrayList<>();
    }
    this.items.add(itemsItem);
    return this;
  }

   /**
   * Get items
   * @return items
  **/
  @javax.annotation.Nullable
  public List<RmaOrderDataItem> getItems() {
    return items;
  }

  public void setItems(List<RmaOrderDataItem> items) {
    this.items = items;
  }


  public RmaOrderData currency(RmaCurrency currency) {
    this.currency = currency;
    return this;
  }

   /**
   * Get currency
   * @return currency
  **/
  @javax.annotation.Nullable
  public RmaCurrency getCurrency() {
    return currency;
  }

  public void setCurrency(RmaCurrency currency) {
    this.currency = currency;
  }


  public RmaOrderData subtotals(Map<String, OrderDataSubtotal> subtotals) {
    this.subtotals = subtotals;
    return this;
  }

  public RmaOrderData putSubtotalsItem(String key, OrderDataSubtotal subtotalsItem) {
    if (this.subtotals == null) {
      this.subtotals = new HashMap<>();
    }
    this.subtotals.put(key, subtotalsItem);
    return this;
  }

   /**
   * Get subtotals
   * @return subtotals
  **/
  @javax.annotation.Nullable
  public Map<String, OrderDataSubtotal> getSubtotals() {
    return subtotals;
  }

  public void setSubtotals(Map<String, OrderDataSubtotal> subtotals) {
    this.subtotals = subtotals;
  }


  public RmaOrderData totals(Map<String, OrderDataTotal> totals) {
    this.totals = totals;
    return this;
  }

  public RmaOrderData putTotalsItem(String key, OrderDataTotal totalsItem) {
    if (this.totals == null) {
      this.totals = new HashMap<>();
    }
    this.totals.put(key, totalsItem);
    return this;
  }

   /**
   * Get totals
   * @return totals
  **/
  @javax.annotation.Nullable
  public Map<String, OrderDataTotal> getTotals() {
    return totals;
  }

  public void setTotals(Map<String, OrderDataTotal> totals) {
    this.totals = totals;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RmaOrderData rmaOrderData = (RmaOrderData) o;
    return Objects.equals(this.createdAt, rmaOrderData.createdAt) &&
        Objects.equals(this.updatedAt, rmaOrderData.updatedAt) &&
        Objects.equals(this.grn, rmaOrderData.grn) &&
        Objects.equals(this.number, rmaOrderData.number) &&
        Objects.equals(this.status, rmaOrderData.status) &&
        Objects.equals(this.channel, rmaOrderData.channel) &&
        Objects.equals(this.market, rmaOrderData.market) &&
        Objects.equals(this.items, rmaOrderData.items) &&
        Objects.equals(this.currency, rmaOrderData.currency) &&
        Objects.equals(this.subtotals, rmaOrderData.subtotals) &&
        Objects.equals(this.totals, rmaOrderData.totals);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createdAt, updatedAt, grn, number, status, channel, market, items, currency, subtotals, totals);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RmaOrderData {\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    grn: ").append(toIndentedString(grn)).append("\n");
    sb.append("    number: ").append(toIndentedString(number)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    channel: ").append(toIndentedString(channel)).append("\n");
    sb.append("    market: ").append(toIndentedString(market)).append("\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    subtotals: ").append(toIndentedString(subtotals)).append("\n");
    sb.append("    totals: ").append(toIndentedString(totals)).append("\n");
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
    openapiFields.add("createdAt");
    openapiFields.add("updatedAt");
    openapiFields.add("grn");
    openapiFields.add("number");
    openapiFields.add("status");
    openapiFields.add("channel");
    openapiFields.add("market");
    openapiFields.add("items");
    openapiFields.add("currency");
    openapiFields.add("subtotals");
    openapiFields.add("totals");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to RmaOrderData
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!RmaOrderData.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in RmaOrderData is not found in the empty JSON string", RmaOrderData.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!RmaOrderData.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `RmaOrderData` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("grn") != null && !jsonObj.get("grn").isJsonNull()) && !jsonObj.get("grn").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `grn` to be a primitive type in the JSON string but got `%s`", jsonObj.get("grn").toString()));
      }
      if ((jsonObj.get("number") != null && !jsonObj.get("number").isJsonNull()) && !jsonObj.get("number").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `number` to be a primitive type in the JSON string but got `%s`", jsonObj.get("number").toString()));
      }
      if ((jsonObj.get("status") != null && !jsonObj.get("status").isJsonNull()) && !jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
      if ((jsonObj.get("channel") != null && !jsonObj.get("channel").isJsonNull()) && !jsonObj.get("channel").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `channel` to be a primitive type in the JSON string but got `%s`", jsonObj.get("channel").toString()));
      }
      if ((jsonObj.get("market") != null && !jsonObj.get("market").isJsonNull()) && !jsonObj.get("market").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `market` to be a primitive type in the JSON string but got `%s`", jsonObj.get("market").toString()));
      }
      if (jsonObj.get("items") != null && !jsonObj.get("items").isJsonNull()) {
        JsonArray jsonArrayitems = jsonObj.getAsJsonArray("items");
        if (jsonArrayitems != null) {
          // ensure the json data is an array
          if (!jsonObj.get("items").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `items` to be an array in the JSON string but got `%s`", jsonObj.get("items").toString()));
          }

          // validate the optional field `items` (array)
          for (int i = 0; i < jsonArrayitems.size(); i++) {
            RmaOrderDataItem.validateJsonElement(jsonArrayitems.get(i));
          };
        }
      }
      // validate the optional field `currency`
      if (jsonObj.get("currency") != null && !jsonObj.get("currency").isJsonNull()) {
        RmaCurrency.validateJsonElement(jsonObj.get("currency"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!RmaOrderData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'RmaOrderData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<RmaOrderData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(RmaOrderData.class));

       return (TypeAdapter<T>) new TypeAdapter<RmaOrderData>() {
           @Override
           public void write(JsonWriter out, RmaOrderData value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public RmaOrderData read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of RmaOrderData given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of RmaOrderData
  * @throws IOException if the JSON string is invalid with respect to RmaOrderData
  */
  public static RmaOrderData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, RmaOrderData.class);
  }

 /**
  * Convert an instance of RmaOrderData to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
