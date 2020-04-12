/*
 * API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 1.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * ModelSignature
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-04-12T16:52:07.017866+02:00[Europe/Paris]")
public class ModelSignature {
  public static final String SERIALIZED_NAME_INPUT = "input";
  @SerializedName(SERIALIZED_NAME_INPUT)
  private List<Object> input = null;

  public static final String SERIALIZED_NAME_OUTPUT = "output";
  @SerializedName(SERIALIZED_NAME_OUTPUT)
  private List<Object> output = null;


  public ModelSignature input(List<Object> input) {
    
    this.input = input;
    return this;
  }

  public ModelSignature addInputItem(Object inputItem) {
    if (this.input == null) {
      this.input = new ArrayList<Object>();
    }
    this.input.add(inputItem);
    return this;
  }

   /**
   * Get input
   * @return input
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Object> getInput() {
    return input;
  }


  public void setInput(List<Object> input) {
    this.input = input;
  }


  public ModelSignature output(List<Object> output) {
    
    this.output = output;
    return this;
  }

  public ModelSignature addOutputItem(Object outputItem) {
    if (this.output == null) {
      this.output = new ArrayList<Object>();
    }
    this.output.add(outputItem);
    return this;
  }

   /**
   * Get output
   * @return output
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Object> getOutput() {
    return output;
  }


  public void setOutput(List<Object> output) {
    this.output = output;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModelSignature modelSignature = (ModelSignature) o;
    return Objects.equals(this.input, modelSignature.input) &&
        Objects.equals(this.output, modelSignature.output);
  }

  @Override
  public int hashCode() {
    return Objects.hash(input, output);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModelSignature {\n");
    sb.append("    input: ").append(toIndentedString(input)).append("\n");
    sb.append("    output: ").append(toIndentedString(output)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

