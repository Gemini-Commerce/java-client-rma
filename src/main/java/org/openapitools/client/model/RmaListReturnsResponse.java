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
import org.openapitools.client.model.RmaReturnResponse;

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
 * RmaListReturnsResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-02-29T12:17:10.426764957Z[Etc/UTC]")
public class RmaListReturnsResponse {
  public static final String SERIALIZED_NAME_RETURNS = "returns";
  @SerializedName(SERIALIZED_NAME_RETURNS)
  private List<RmaReturnResponse> returns;

  public static final String SERIALIZED_NAME_NEXT_PAGE_TOKEN = "nextPageToken";
  @SerializedName(SERIALIZED_NAME_NEXT_PAGE_TOKEN)
  private String nextPageToken;

  public RmaListReturnsResponse() {
  }

  public RmaListReturnsResponse returns(List<RmaReturnResponse> returns) {
    this.returns = returns;
    return this;
  }

  public RmaListReturnsResponse addReturnsItem(RmaReturnResponse returnsItem) {
    if (this.returns == null) {
      this.returns = new ArrayList<>();
    }
    this.returns.add(returnsItem);
    return this;
  }

   /**
   * Get returns
   * @return returns
  **/
  @javax.annotation.Nullable
  public List<RmaReturnResponse> getReturns() {
    return returns;
  }

  public void setReturns(List<RmaReturnResponse> returns) {
    this.returns = returns;
  }


  public RmaListReturnsResponse nextPageToken(String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

   /**
   * Get nextPageToken
   * @return nextPageToken
  **/
  @javax.annotation.Nullable
  public String getNextPageToken() {
    return nextPageToken;
  }

  public void setNextPageToken(String nextPageToken) {
    this.nextPageToken = nextPageToken;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RmaListReturnsResponse rmaListReturnsResponse = (RmaListReturnsResponse) o;
    return Objects.equals(this.returns, rmaListReturnsResponse.returns) &&
        Objects.equals(this.nextPageToken, rmaListReturnsResponse.nextPageToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(returns, nextPageToken);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RmaListReturnsResponse {\n");
    sb.append("    returns: ").append(toIndentedString(returns)).append("\n");
    sb.append("    nextPageToken: ").append(toIndentedString(nextPageToken)).append("\n");
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
    openapiFields.add("returns");
    openapiFields.add("nextPageToken");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to RmaListReturnsResponse
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!RmaListReturnsResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in RmaListReturnsResponse is not found in the empty JSON string", RmaListReturnsResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!RmaListReturnsResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `RmaListReturnsResponse` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (jsonObj.get("returns") != null && !jsonObj.get("returns").isJsonNull()) {
        JsonArray jsonArrayreturns = jsonObj.getAsJsonArray("returns");
        if (jsonArrayreturns != null) {
          // ensure the json data is an array
          if (!jsonObj.get("returns").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `returns` to be an array in the JSON string but got `%s`", jsonObj.get("returns").toString()));
          }

          // validate the optional field `returns` (array)
          for (int i = 0; i < jsonArrayreturns.size(); i++) {
            RmaReturnResponse.validateJsonElement(jsonArrayreturns.get(i));
          };
        }
      }
      if ((jsonObj.get("nextPageToken") != null && !jsonObj.get("nextPageToken").isJsonNull()) && !jsonObj.get("nextPageToken").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `nextPageToken` to be a primitive type in the JSON string but got `%s`", jsonObj.get("nextPageToken").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!RmaListReturnsResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'RmaListReturnsResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<RmaListReturnsResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(RmaListReturnsResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<RmaListReturnsResponse>() {
           @Override
           public void write(JsonWriter out, RmaListReturnsResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public RmaListReturnsResponse read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of RmaListReturnsResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of RmaListReturnsResponse
  * @throws IOException if the JSON string is invalid with respect to RmaListReturnsResponse
  */
  public static RmaListReturnsResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, RmaListReturnsResponse.class);
  }

 /**
  * Convert an instance of RmaListReturnsResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
