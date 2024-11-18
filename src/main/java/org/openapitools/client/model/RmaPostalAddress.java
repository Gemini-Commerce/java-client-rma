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
 * Represents a postal address, e.g. for postal delivery or payments addresses. Given a postal address, a postal service can deliver items to a premise, P.O. Box or similar. It is not intended to model geographical locations (roads, towns, mountains).  In typical usage an address would be created via user input or from importing existing data, depending on the type of process.  Advice on address input / editing:  - Use an i18n-ready address widget such as    https://github.com/google/libaddressinput) - Users should not be presented with UI elements for input or editing of   fields outside countries where that field is used.  For more guidance on how to use this schema, please see: https://support.google.com/business/answer/6397478
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-18T16:38:09.864475796Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class RmaPostalAddress {
  public static final String SERIALIZED_NAME_REVISION = "revision";
  @SerializedName(SERIALIZED_NAME_REVISION)
  private Integer revision;

  public static final String SERIALIZED_NAME_REGION_CODE = "regionCode";
  @SerializedName(SERIALIZED_NAME_REGION_CODE)
  private String regionCode;

  public static final String SERIALIZED_NAME_LANGUAGE_CODE = "languageCode";
  @SerializedName(SERIALIZED_NAME_LANGUAGE_CODE)
  private String languageCode;

  public static final String SERIALIZED_NAME_POSTAL_CODE = "postalCode";
  @SerializedName(SERIALIZED_NAME_POSTAL_CODE)
  private String postalCode;

  public static final String SERIALIZED_NAME_SORTING_CODE = "sortingCode";
  @SerializedName(SERIALIZED_NAME_SORTING_CODE)
  private String sortingCode;

  public static final String SERIALIZED_NAME_ADMINISTRATIVE_AREA = "administrativeArea";
  @SerializedName(SERIALIZED_NAME_ADMINISTRATIVE_AREA)
  private String administrativeArea;

  public static final String SERIALIZED_NAME_LOCALITY = "locality";
  @SerializedName(SERIALIZED_NAME_LOCALITY)
  private String locality;

  public static final String SERIALIZED_NAME_SUBLOCALITY = "sublocality";
  @SerializedName(SERIALIZED_NAME_SUBLOCALITY)
  private String sublocality;

  public static final String SERIALIZED_NAME_ADDRESS_LINES = "addressLines";
  @SerializedName(SERIALIZED_NAME_ADDRESS_LINES)
  private List<String> addressLines = new ArrayList<>();

  public static final String SERIALIZED_NAME_RECIPIENTS = "recipients";
  @SerializedName(SERIALIZED_NAME_RECIPIENTS)
  private List<String> recipients = new ArrayList<>();

  public static final String SERIALIZED_NAME_ORGANIZATION = "organization";
  @SerializedName(SERIALIZED_NAME_ORGANIZATION)
  private String organization;

  public static final String SERIALIZED_NAME_PHONE_NUMBER = "phoneNumber";
  @SerializedName(SERIALIZED_NAME_PHONE_NUMBER)
  private String phoneNumber;

  public static final String SERIALIZED_NAME_ADDITIONAL_INFO = "additionalInfo";
  @SerializedName(SERIALIZED_NAME_ADDITIONAL_INFO)
  private Object additionalInfo;

  public RmaPostalAddress() {
  }

  public RmaPostalAddress revision(Integer revision) {
    this.revision = revision;
    return this;
  }

  /**
   * The schema revision of the &#x60;PostalAddress&#x60;. This must be set to 0, which is the latest revision.  All new revisions **must** be backward compatible with old revisions.
   * @return revision
   */
  @javax.annotation.Nullable
  public Integer getRevision() {
    return revision;
  }

  public void setRevision(Integer revision) {
    this.revision = revision;
  }


  public RmaPostalAddress regionCode(String regionCode) {
    this.regionCode = regionCode;
    return this;
  }

  /**
   * Required. CLDR region code of the country/region of the address. This is never inferred and it is up to the user to ensure the value is correct. See http://cldr.unicode.org/ and http://www.unicode.org/cldr/charts/30/supplemental/territory_information.html for details. Example: \&quot;CH\&quot; for Switzerland.
   * @return regionCode
   */
  @javax.annotation.Nullable
  public String getRegionCode() {
    return regionCode;
  }

  public void setRegionCode(String regionCode) {
    this.regionCode = regionCode;
  }


  public RmaPostalAddress languageCode(String languageCode) {
    this.languageCode = languageCode;
    return this;
  }

  /**
   * Optional. BCP-47 language code of the contents of this address (if known). This is often the UI language of the input form or is expected to match one of the languages used in the address&#39; country/region, or their transliterated equivalents. This can affect formatting in certain countries, but is not critical to the correctness of the data and will never affect any validation or other non-formatting related operations.  If this value is not known, it should be omitted (rather than specifying a possibly incorrect default).  Examples: \&quot;zh-Hant\&quot;, \&quot;ja\&quot;, \&quot;ja-Latn\&quot;, \&quot;en\&quot;.
   * @return languageCode
   */
  @javax.annotation.Nullable
  public String getLanguageCode() {
    return languageCode;
  }

  public void setLanguageCode(String languageCode) {
    this.languageCode = languageCode;
  }


  public RmaPostalAddress postalCode(String postalCode) {
    this.postalCode = postalCode;
    return this;
  }

  /**
   * Optional. Postal code of the address. Not all countries use or require postal codes to be present, but where they are used, they may trigger additional validation with other parts of the address (e.g. state/zip validation in the U.S.A.).
   * @return postalCode
   */
  @javax.annotation.Nullable
  public String getPostalCode() {
    return postalCode;
  }

  public void setPostalCode(String postalCode) {
    this.postalCode = postalCode;
  }


  public RmaPostalAddress sortingCode(String sortingCode) {
    this.sortingCode = sortingCode;
    return this;
  }

  /**
   * Optional. Additional, country-specific, sorting code. This is not used in most regions. Where it is used, the value is either a string like \&quot;CEDEX\&quot;, optionally followed by a number (e.g. \&quot;CEDEX 7\&quot;), or just a number alone, representing the \&quot;sector code\&quot; (Jamaica), \&quot;delivery area indicator\&quot; (Malawi) or \&quot;post office indicator\&quot; (e.g. Côte d&#39;Ivoire).
   * @return sortingCode
   */
  @javax.annotation.Nullable
  public String getSortingCode() {
    return sortingCode;
  }

  public void setSortingCode(String sortingCode) {
    this.sortingCode = sortingCode;
  }


  public RmaPostalAddress administrativeArea(String administrativeArea) {
    this.administrativeArea = administrativeArea;
    return this;
  }

  /**
   * Optional. Highest administrative subdivision which is used for postal addresses of a country or region. For example, this can be a state, a province, an oblast, or a prefecture. Specifically, for Spain this is the province and not the autonomous community (e.g. \&quot;Barcelona\&quot; and not \&quot;Catalonia\&quot;). Many countries don&#39;t use an administrative area in postal addresses. E.g. in Switzerland this should be left unpopulated.
   * @return administrativeArea
   */
  @javax.annotation.Nullable
  public String getAdministrativeArea() {
    return administrativeArea;
  }

  public void setAdministrativeArea(String administrativeArea) {
    this.administrativeArea = administrativeArea;
  }


  public RmaPostalAddress locality(String locality) {
    this.locality = locality;
    return this;
  }

  /**
   * Optional. Generally refers to the city/town portion of the address. Examples: US city, IT comune, UK post town. In regions of the world where localities are not well defined or do not fit into this structure well, leave locality empty and use address_lines.
   * @return locality
   */
  @javax.annotation.Nullable
  public String getLocality() {
    return locality;
  }

  public void setLocality(String locality) {
    this.locality = locality;
  }


  public RmaPostalAddress sublocality(String sublocality) {
    this.sublocality = sublocality;
    return this;
  }

  /**
   * Optional. Sublocality of the address. For example, this can be neighborhoods, boroughs, districts.
   * @return sublocality
   */
  @javax.annotation.Nullable
  public String getSublocality() {
    return sublocality;
  }

  public void setSublocality(String sublocality) {
    this.sublocality = sublocality;
  }


  public RmaPostalAddress addressLines(List<String> addressLines) {
    this.addressLines = addressLines;
    return this;
  }

  public RmaPostalAddress addAddressLinesItem(String addressLinesItem) {
    if (this.addressLines == null) {
      this.addressLines = new ArrayList<>();
    }
    this.addressLines.add(addressLinesItem);
    return this;
  }

  /**
   * Unstructured address lines describing the lower levels of an address.  Because values in address_lines do not have type information and may sometimes contain multiple values in a single field (e.g. \&quot;Austin, TX\&quot;), it is important that the line order is clear. The order of address lines should be \&quot;envelope order\&quot; for the country/region of the address. In places where this can vary (e.g. Japan), address_language is used to make it explicit (e.g. \&quot;ja\&quot; for large-to-small ordering and \&quot;ja-Latn\&quot; or \&quot;en\&quot; for small-to-large). This way, the most specific line of an address can be selected based on the language.  The minimum permitted structural representation of an address consists of a region_code with all remaining information placed in the address_lines. It would be possible to format such an address very approximately without geocoding, but no semantic reasoning could be made about any of the address components until it was at least partially resolved.  Creating an address only containing a region_code and address_lines, and then geocoding is the recommended way to handle completely unstructured addresses (as opposed to guessing which parts of the address should be localities or administrative areas).
   * @return addressLines
   */
  @javax.annotation.Nullable
  public List<String> getAddressLines() {
    return addressLines;
  }

  public void setAddressLines(List<String> addressLines) {
    this.addressLines = addressLines;
  }


  public RmaPostalAddress recipients(List<String> recipients) {
    this.recipients = recipients;
    return this;
  }

  public RmaPostalAddress addRecipientsItem(String recipientsItem) {
    if (this.recipients == null) {
      this.recipients = new ArrayList<>();
    }
    this.recipients.add(recipientsItem);
    return this;
  }

  /**
   * Optional. The recipient at the address. This field may, under certain circumstances, contain multiline information. For example, it might contain \&quot;care of\&quot; information.
   * @return recipients
   */
  @javax.annotation.Nullable
  public List<String> getRecipients() {
    return recipients;
  }

  public void setRecipients(List<String> recipients) {
    this.recipients = recipients;
  }


  public RmaPostalAddress organization(String organization) {
    this.organization = organization;
    return this;
  }

  /**
   * Optional. The name of the organization at the address.
   * @return organization
   */
  @javax.annotation.Nullable
  public String getOrganization() {
    return organization;
  }

  public void setOrganization(String organization) {
    this.organization = organization;
  }


  public RmaPostalAddress phoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
    return this;
  }

  /**
   * Optional.
   * @return phoneNumber
   */
  @javax.annotation.Nullable
  public String getPhoneNumber() {
    return phoneNumber;
  }

  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }


  public RmaPostalAddress additionalInfo(Object additionalInfo) {
    this.additionalInfo = additionalInfo;
    return this;
  }

  /**
   * Optional.
   * @return additionalInfo
   */
  @javax.annotation.Nullable
  public Object getAdditionalInfo() {
    return additionalInfo;
  }

  public void setAdditionalInfo(Object additionalInfo) {
    this.additionalInfo = additionalInfo;
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
   * @return the RmaPostalAddress instance itself
   */
  public RmaPostalAddress putAdditionalProperty(String key, Object value) {
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
    RmaPostalAddress rmaPostalAddress = (RmaPostalAddress) o;
    return Objects.equals(this.revision, rmaPostalAddress.revision) &&
        Objects.equals(this.regionCode, rmaPostalAddress.regionCode) &&
        Objects.equals(this.languageCode, rmaPostalAddress.languageCode) &&
        Objects.equals(this.postalCode, rmaPostalAddress.postalCode) &&
        Objects.equals(this.sortingCode, rmaPostalAddress.sortingCode) &&
        Objects.equals(this.administrativeArea, rmaPostalAddress.administrativeArea) &&
        Objects.equals(this.locality, rmaPostalAddress.locality) &&
        Objects.equals(this.sublocality, rmaPostalAddress.sublocality) &&
        Objects.equals(this.addressLines, rmaPostalAddress.addressLines) &&
        Objects.equals(this.recipients, rmaPostalAddress.recipients) &&
        Objects.equals(this.organization, rmaPostalAddress.organization) &&
        Objects.equals(this.phoneNumber, rmaPostalAddress.phoneNumber) &&
        Objects.equals(this.additionalInfo, rmaPostalAddress.additionalInfo)&&
        Objects.equals(this.additionalProperties, rmaPostalAddress.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(revision, regionCode, languageCode, postalCode, sortingCode, administrativeArea, locality, sublocality, addressLines, recipients, organization, phoneNumber, additionalInfo, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RmaPostalAddress {\n");
    sb.append("    revision: ").append(toIndentedString(revision)).append("\n");
    sb.append("    regionCode: ").append(toIndentedString(regionCode)).append("\n");
    sb.append("    languageCode: ").append(toIndentedString(languageCode)).append("\n");
    sb.append("    postalCode: ").append(toIndentedString(postalCode)).append("\n");
    sb.append("    sortingCode: ").append(toIndentedString(sortingCode)).append("\n");
    sb.append("    administrativeArea: ").append(toIndentedString(administrativeArea)).append("\n");
    sb.append("    locality: ").append(toIndentedString(locality)).append("\n");
    sb.append("    sublocality: ").append(toIndentedString(sublocality)).append("\n");
    sb.append("    addressLines: ").append(toIndentedString(addressLines)).append("\n");
    sb.append("    recipients: ").append(toIndentedString(recipients)).append("\n");
    sb.append("    organization: ").append(toIndentedString(organization)).append("\n");
    sb.append("    phoneNumber: ").append(toIndentedString(phoneNumber)).append("\n");
    sb.append("    additionalInfo: ").append(toIndentedString(additionalInfo)).append("\n");
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
    openapiFields.add("revision");
    openapiFields.add("regionCode");
    openapiFields.add("languageCode");
    openapiFields.add("postalCode");
    openapiFields.add("sortingCode");
    openapiFields.add("administrativeArea");
    openapiFields.add("locality");
    openapiFields.add("sublocality");
    openapiFields.add("addressLines");
    openapiFields.add("recipients");
    openapiFields.add("organization");
    openapiFields.add("phoneNumber");
    openapiFields.add("additionalInfo");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to RmaPostalAddress
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!RmaPostalAddress.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in RmaPostalAddress is not found in the empty JSON string", RmaPostalAddress.openapiRequiredFields.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("regionCode") != null && !jsonObj.get("regionCode").isJsonNull()) && !jsonObj.get("regionCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `regionCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("regionCode").toString()));
      }
      if ((jsonObj.get("languageCode") != null && !jsonObj.get("languageCode").isJsonNull()) && !jsonObj.get("languageCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `languageCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("languageCode").toString()));
      }
      if ((jsonObj.get("postalCode") != null && !jsonObj.get("postalCode").isJsonNull()) && !jsonObj.get("postalCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `postalCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("postalCode").toString()));
      }
      if ((jsonObj.get("sortingCode") != null && !jsonObj.get("sortingCode").isJsonNull()) && !jsonObj.get("sortingCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sortingCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sortingCode").toString()));
      }
      if ((jsonObj.get("administrativeArea") != null && !jsonObj.get("administrativeArea").isJsonNull()) && !jsonObj.get("administrativeArea").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `administrativeArea` to be a primitive type in the JSON string but got `%s`", jsonObj.get("administrativeArea").toString()));
      }
      if ((jsonObj.get("locality") != null && !jsonObj.get("locality").isJsonNull()) && !jsonObj.get("locality").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `locality` to be a primitive type in the JSON string but got `%s`", jsonObj.get("locality").toString()));
      }
      if ((jsonObj.get("sublocality") != null && !jsonObj.get("sublocality").isJsonNull()) && !jsonObj.get("sublocality").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sublocality` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sublocality").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("addressLines") != null && !jsonObj.get("addressLines").isJsonNull() && !jsonObj.get("addressLines").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `addressLines` to be an array in the JSON string but got `%s`", jsonObj.get("addressLines").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("recipients") != null && !jsonObj.get("recipients").isJsonNull() && !jsonObj.get("recipients").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `recipients` to be an array in the JSON string but got `%s`", jsonObj.get("recipients").toString()));
      }
      if ((jsonObj.get("organization") != null && !jsonObj.get("organization").isJsonNull()) && !jsonObj.get("organization").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `organization` to be a primitive type in the JSON string but got `%s`", jsonObj.get("organization").toString()));
      }
      if ((jsonObj.get("phoneNumber") != null && !jsonObj.get("phoneNumber").isJsonNull()) && !jsonObj.get("phoneNumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `phoneNumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("phoneNumber").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!RmaPostalAddress.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'RmaPostalAddress' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<RmaPostalAddress> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(RmaPostalAddress.class));

       return (TypeAdapter<T>) new TypeAdapter<RmaPostalAddress>() {
           @Override
           public void write(JsonWriter out, RmaPostalAddress value) throws IOException {
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
           public RmaPostalAddress read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             RmaPostalAddress instance = thisAdapter.fromJsonTree(jsonObj);
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
   * Create an instance of RmaPostalAddress given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of RmaPostalAddress
   * @throws IOException if the JSON string is invalid with respect to RmaPostalAddress
   */
  public static RmaPostalAddress fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, RmaPostalAddress.class);
  }

  /**
   * Convert an instance of RmaPostalAddress to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

