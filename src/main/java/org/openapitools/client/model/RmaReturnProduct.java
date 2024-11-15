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
import org.openapitools.client.model.RmaReturnProductProperty;

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

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import GeminiCommerce.Rma.JSON;

/**
 * RmaReturnProduct
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-15T15:24:42.338735973Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class RmaReturnProduct {
  public static final String SERIALIZED_NAME_GRN = "grn";
  @SerializedName(SERIALIZED_NAME_GRN)
  private String grn;

  public static final String SERIALIZED_NAME_REASON = "reason";
  @SerializedName(SERIALIZED_NAME_REASON)
  private String reason;

  public static final String SERIALIZED_NAME_REQUESTED = "requested";
  @SerializedName(SERIALIZED_NAME_REQUESTED)
  private RmaReturnProductProperty requested;

  public static final String SERIALIZED_NAME_APPROVED = "approved";
  @SerializedName(SERIALIZED_NAME_APPROVED)
  private RmaReturnProductProperty approved;

  public static final String SERIALIZED_NAME_VERIFIED = "verified";
  @SerializedName(SERIALIZED_NAME_VERIFIED)
  private RmaReturnProductProperty verified;

  public static final String SERIALIZED_NAME_REFUNDED = "refunded";
  @SerializedName(SERIALIZED_NAME_REFUNDED)
  private RmaReturnProductProperty refunded;

  public RmaReturnProduct() {
  }

  public RmaReturnProduct grn(String grn) {
    this.grn = grn;
    return this;
  }

  /**
   * Get grn
   * @return grn
   */
  @javax.annotation.Nullable
  public String getGrn() {
    return grn;
  }

  public void setGrn(String grn) {
    this.grn = grn;
  }


  public RmaReturnProduct reason(String reason) {
    this.reason = reason;
    return this;
  }

  /**
   * Get reason
   * @return reason
   */
  @javax.annotation.Nullable
  public String getReason() {
    return reason;
  }

  public void setReason(String reason) {
    this.reason = reason;
  }


  public RmaReturnProduct requested(RmaReturnProductProperty requested) {
    this.requested = requested;
    return this;
  }

  /**
   * Get requested
   * @return requested
   */
  @javax.annotation.Nullable
  public RmaReturnProductProperty getRequested() {
    return requested;
  }

  public void setRequested(RmaReturnProductProperty requested) {
    this.requested = requested;
  }


  public RmaReturnProduct approved(RmaReturnProductProperty approved) {
    this.approved = approved;
    return this;
  }

  /**
   * Get approved
   * @return approved
   */
  @javax.annotation.Nullable
  public RmaReturnProductProperty getApproved() {
    return approved;
  }

  public void setApproved(RmaReturnProductProperty approved) {
    this.approved = approved;
  }


  public RmaReturnProduct verified(RmaReturnProductProperty verified) {
    this.verified = verified;
    return this;
  }

  /**
   * Get verified
   * @return verified
   */
  @javax.annotation.Nullable
  public RmaReturnProductProperty getVerified() {
    return verified;
  }

  public void setVerified(RmaReturnProductProperty verified) {
    this.verified = verified;
  }


  public RmaReturnProduct refunded(RmaReturnProductProperty refunded) {
    this.refunded = refunded;
    return this;
  }

  /**
   * Get refunded
   * @return refunded
   */
  @javax.annotation.Nullable
  public RmaReturnProductProperty getRefunded() {
    return refunded;
  }

  public void setRefunded(RmaReturnProductProperty refunded) {
    this.refunded = refunded;
  }

  /**
   * A container for additional, undeclared properties.
   * This is a holder for any undeclared properties as specified with
   * the 'additionalProperties' keyword in the OAS document.
   */
  private Map<String, Object> additionalProperties;

  /**
   * Set the additional (undeclared) property with the specified name and value.
   * If the property does not already exist, create it otherwise replace it.
   *
   * @param key name of the property
   * @param value value of the property
   * @return the RmaReturnProduct instance itself
   */
  public RmaReturnProduct putAdditionalProperty(String key, Object value) {
    if (this.additionalProperties == null) {
        this.additionalProperties = new HashMap<String, Object>();
    }
    this.additionalProperties.put(key, value);
    return this;
  }

  /**
   * Return the additional (undeclared) property.
   *
   * @return a map of objects
   */
  public Map<String, Object> getAdditionalProperties() {
    return additionalProperties;
  }

  /**
   * Return the additional (undeclared) property with the specified name.
   *
   * @param key name of the property
   * @return an object
   */
  public Object getAdditionalProperty(String key) {
    if (this.additionalProperties == null) {
        return null;
    }
    return this.additionalProperties.get(key);
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RmaReturnProduct rmaReturnProduct = (RmaReturnProduct) o;
    return Objects.equals(this.grn, rmaReturnProduct.grn) &&
        Objects.equals(this.reason, rmaReturnProduct.reason) &&
        Objects.equals(this.requested, rmaReturnProduct.requested) &&
        Objects.equals(this.approved, rmaReturnProduct.approved) &&
        Objects.equals(this.verified, rmaReturnProduct.verified) &&
        Objects.equals(this.refunded, rmaReturnProduct.refunded)&&
        Objects.equals(this.additionalProperties, rmaReturnProduct.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(grn, reason, requested, approved, verified, refunded, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RmaReturnProduct {\n");
    sb.append("    grn: ").append(toIndentedString(grn)).append("\n");
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
    sb.append("    requested: ").append(toIndentedString(requested)).append("\n");
    sb.append("    approved: ").append(toIndentedString(approved)).append("\n");
    sb.append("    verified: ").append(toIndentedString(verified)).append("\n");
    sb.append("    refunded: ").append(toIndentedString(refunded)).append("\n");
    sb.append("    additionalProperties: ").append(toIndentedString(additionalProperties)).append("\n");
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
    openapiFields.add("grn");
    openapiFields.add("reason");
    openapiFields.add("requested");
    openapiFields.add("approved");
    openapiFields.add("verified");
    openapiFields.add("refunded");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to RmaReturnProduct
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!RmaReturnProduct.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in RmaReturnProduct is not found in the empty JSON string", RmaReturnProduct.openapiRequiredFields.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("grn") != null && !jsonObj.get("grn").isJsonNull()) && !jsonObj.get("grn").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `grn` to be a primitive type in the JSON string but got `%s`", jsonObj.get("grn").toString()));
      }
      if ((jsonObj.get("reason") != null && !jsonObj.get("reason").isJsonNull()) && !jsonObj.get("reason").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `reason` to be a primitive type in the JSON string but got `%s`", jsonObj.get("reason").toString()));
      }
      // validate the optional field `requested`
      if (jsonObj.get("requested") != null && !jsonObj.get("requested").isJsonNull()) {
        RmaReturnProductProperty.validateJsonElement(jsonObj.get("requested"));
      }
      // validate the optional field `approved`
      if (jsonObj.get("approved") != null && !jsonObj.get("approved").isJsonNull()) {
        RmaReturnProductProperty.validateJsonElement(jsonObj.get("approved"));
      }
      // validate the optional field `verified`
      if (jsonObj.get("verified") != null && !jsonObj.get("verified").isJsonNull()) {
        RmaReturnProductProperty.validateJsonElement(jsonObj.get("verified"));
      }
      // validate the optional field `refunded`
      if (jsonObj.get("refunded") != null && !jsonObj.get("refunded").isJsonNull()) {
        RmaReturnProductProperty.validateJsonElement(jsonObj.get("refunded"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!RmaReturnProduct.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'RmaReturnProduct' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<RmaReturnProduct> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(RmaReturnProduct.class));

       return (TypeAdapter<T>) new TypeAdapter<RmaReturnProduct>() {
           @Override
           public void write(JsonWriter out, RmaReturnProduct value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             obj.remove("additionalProperties");
             // serialize additional properties
             if (value.getAdditionalProperties() != null) {
               for (Map.Entry<String, Object> entry : value.getAdditionalProperties().entrySet()) {
                 if (entry.getValue() instanceof String)
                   obj.addProperty(entry.getKey(), (String) entry.getValue());
                 else if (entry.getValue() instanceof Number)
                   obj.addProperty(entry.getKey(), (Number) entry.getValue());
                 else if (entry.getValue() instanceof Boolean)
                   obj.addProperty(entry.getKey(), (Boolean) entry.getValue());
                 else if (entry.getValue() instanceof Character)
                   obj.addProperty(entry.getKey(), (Character) entry.getValue());
                 else {
                   JsonElement jsonElement = gson.toJsonTree(entry.getValue());
                   if (jsonElement.isJsonArray()) {
                     obj.add(entry.getKey(), jsonElement.getAsJsonArray());
                   } else {
                     obj.add(entry.getKey(), jsonElement.getAsJsonObject());
                   }
                 }
               }
             }
             elementAdapter.write(out, obj);
           }

           @Override
           public RmaReturnProduct read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             RmaReturnProduct instance = thisAdapter.fromJsonTree(jsonObj);
             for (Map.Entry<String, JsonElement> entry : jsonObj.entrySet()) {
               if (!openapiFields.contains(entry.getKey())) {
                 if (entry.getValue().isJsonPrimitive()) { // primitive type
                   if (entry.getValue().getAsJsonPrimitive().isString())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsString());
                   else if (entry.getValue().getAsJsonPrimitive().isNumber())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsNumber());
                   else if (entry.getValue().getAsJsonPrimitive().isBoolean())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsBoolean());
                   else
                     throw new IllegalArgumentException(String.format("The field `%s` has unknown primitive type. Value: %s", entry.getKey(), entry.getValue().toString()));
                 } else if (entry.getValue().isJsonArray()) {
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), List.class));
                 } else { // JSON object
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), HashMap.class));
                 }
               }
             }
             return instance;
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of RmaReturnProduct given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of RmaReturnProduct
   * @throws IOException if the JSON string is invalid with respect to RmaReturnProduct
   */
  public static RmaReturnProduct fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, RmaReturnProduct.class);
  }

  /**
   * Convert an instance of RmaReturnProduct to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

