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
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.JsonElement;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * Gets or Sets OrderDataTotalCode
 */
@JsonAdapter(OrderDataTotalCode.Adapter.class)
public enum OrderDataTotalCode {
  
  UNKNOWN("UNKNOWN"),
  
  ORDERED("ORDERED"),
  
  PAID("PAID"),
  
  REFUNDED("REFUNDED");

  private String value;

  OrderDataTotalCode(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static OrderDataTotalCode fromValue(String value) {
    for (OrderDataTotalCode b : OrderDataTotalCode.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<OrderDataTotalCode> {
    @Override
    public void write(final JsonWriter jsonWriter, final OrderDataTotalCode enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public OrderDataTotalCode read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return OrderDataTotalCode.fromValue(value);
    }
  }

  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
    String value = jsonElement.getAsString();
    OrderDataTotalCode.fromValue(value);
  }
}

