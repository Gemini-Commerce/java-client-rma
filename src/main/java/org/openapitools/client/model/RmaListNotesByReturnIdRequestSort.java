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
import java.util.Arrays;
import org.openapitools.client.model.RmaListNotesByReturnIdRequestSortSortField;
import org.openapitools.client.model.RmaSortOrder;

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
 * RmaListNotesByReturnIdRequestSort
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-02-29T12:17:10.426764957Z[Etc/UTC]")
public class RmaListNotesByReturnIdRequestSort {
  public static final String SERIALIZED_NAME_EVALUATION_ORDER = "evaluationOrder";
  @SerializedName(SERIALIZED_NAME_EVALUATION_ORDER)
  private Long evaluationOrder;

  public static final String SERIALIZED_NAME_FIELD = "field";
  @SerializedName(SERIALIZED_NAME_FIELD)
  private RmaListNotesByReturnIdRequestSortSortField field = RmaListNotesByReturnIdRequestSortSortField.UNKNOWN;

  public static final String SERIALIZED_NAME_ORDER = "order";
  @SerializedName(SERIALIZED_NAME_ORDER)
  private RmaSortOrder order = RmaSortOrder.DESC;

  public RmaListNotesByReturnIdRequestSort() {
  }

  public RmaListNotesByReturnIdRequestSort evaluationOrder(Long evaluationOrder) {
    this.evaluationOrder = evaluationOrder;
    return this;
  }

   /**
   * evaluation_order is the order in which the sort will be applied. The lower the number, the earlier the sort will be applied.
   * @return evaluationOrder
  **/
  @javax.annotation.Nonnull
  public Long getEvaluationOrder() {
    return evaluationOrder;
  }

  public void setEvaluationOrder(Long evaluationOrder) {
    this.evaluationOrder = evaluationOrder;
  }


  public RmaListNotesByReturnIdRequestSort field(RmaListNotesByReturnIdRequestSortSortField field) {
    this.field = field;
    return this;
  }

   /**
   * Get field
   * @return field
  **/
  @javax.annotation.Nonnull
  public RmaListNotesByReturnIdRequestSortSortField getField() {
    return field;
  }

  public void setField(RmaListNotesByReturnIdRequestSortSortField field) {
    this.field = field;
  }


  public RmaListNotesByReturnIdRequestSort order(RmaSortOrder order) {
    this.order = order;
    return this;
  }

   /**
   * Get order
   * @return order
  **/
  @javax.annotation.Nullable
  public RmaSortOrder getOrder() {
    return order;
  }

  public void setOrder(RmaSortOrder order) {
    this.order = order;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RmaListNotesByReturnIdRequestSort rmaListNotesByReturnIdRequestSort = (RmaListNotesByReturnIdRequestSort) o;
    return Objects.equals(this.evaluationOrder, rmaListNotesByReturnIdRequestSort.evaluationOrder) &&
        Objects.equals(this.field, rmaListNotesByReturnIdRequestSort.field) &&
        Objects.equals(this.order, rmaListNotesByReturnIdRequestSort.order);
  }

  @Override
  public int hashCode() {
    return Objects.hash(evaluationOrder, field, order);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RmaListNotesByReturnIdRequestSort {\n");
    sb.append("    evaluationOrder: ").append(toIndentedString(evaluationOrder)).append("\n");
    sb.append("    field: ").append(toIndentedString(field)).append("\n");
    sb.append("    order: ").append(toIndentedString(order)).append("\n");
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
    openapiFields.add("evaluationOrder");
    openapiFields.add("field");
    openapiFields.add("order");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("evaluationOrder");
    openapiRequiredFields.add("field");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to RmaListNotesByReturnIdRequestSort
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!RmaListNotesByReturnIdRequestSort.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in RmaListNotesByReturnIdRequestSort is not found in the empty JSON string", RmaListNotesByReturnIdRequestSort.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!RmaListNotesByReturnIdRequestSort.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `RmaListNotesByReturnIdRequestSort` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : RmaListNotesByReturnIdRequestSort.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the required field `field`
      RmaListNotesByReturnIdRequestSortSortField.validateJsonElement(jsonObj.get("field"));
      // validate the optional field `order`
      if (jsonObj.get("order") != null && !jsonObj.get("order").isJsonNull()) {
        RmaSortOrder.validateJsonElement(jsonObj.get("order"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!RmaListNotesByReturnIdRequestSort.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'RmaListNotesByReturnIdRequestSort' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<RmaListNotesByReturnIdRequestSort> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(RmaListNotesByReturnIdRequestSort.class));

       return (TypeAdapter<T>) new TypeAdapter<RmaListNotesByReturnIdRequestSort>() {
           @Override
           public void write(JsonWriter out, RmaListNotesByReturnIdRequestSort value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public RmaListNotesByReturnIdRequestSort read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of RmaListNotesByReturnIdRequestSort given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of RmaListNotesByReturnIdRequestSort
  * @throws IOException if the JSON string is invalid with respect to RmaListNotesByReturnIdRequestSort
  */
  public static RmaListNotesByReturnIdRequestSort fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, RmaListNotesByReturnIdRequestSort.class);
  }

 /**
  * Convert an instance of RmaListNotesByReturnIdRequestSort to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

