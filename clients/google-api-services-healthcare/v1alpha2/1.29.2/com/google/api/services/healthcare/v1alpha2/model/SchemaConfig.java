/*
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
/*
 * This code was generated by https://github.com/googleapis/google-api-java-client-services/
 * Modify at your own risk.
 */

package com.google.api.services.healthcare.v1alpha2.model;

/**
 * Configuration for the FHIR BigQuery and Cloud Storage schema. Determines how the server generates
 * the schema.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Healthcare API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class SchemaConfig extends com.google.api.client.json.GenericJson {

  /**
   * The depth for all recursive structures in the output analytics schema. For example, `concept`
   * in the CodeSystem resource is a recursive structure; when the depth is 2, the CodeSystem table
   * will have a column called `concept.concept` but not `concept.concept.concept`. If not specified
   * or set to 0, the server will use the default value 2.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long recursiveStructureDepth;

  /**
   * Specifies the output schema type. If unspecified, the default is `LOSSLESS`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String schemaType;

  /**
   * The depth for all recursive structures in the output analytics schema. For example, `concept`
   * in the CodeSystem resource is a recursive structure; when the depth is 2, the CodeSystem table
   * will have a column called `concept.concept` but not `concept.concept.concept`. If not specified
   * or set to 0, the server will use the default value 2.
   * @return value or {@code null} for none
   */
  public java.lang.Long getRecursiveStructureDepth() {
    return recursiveStructureDepth;
  }

  /**
   * The depth for all recursive structures in the output analytics schema. For example, `concept`
   * in the CodeSystem resource is a recursive structure; when the depth is 2, the CodeSystem table
   * will have a column called `concept.concept` but not `concept.concept.concept`. If not specified
   * or set to 0, the server will use the default value 2.
   * @param recursiveStructureDepth recursiveStructureDepth or {@code null} for none
   */
  public SchemaConfig setRecursiveStructureDepth(java.lang.Long recursiveStructureDepth) {
    this.recursiveStructureDepth = recursiveStructureDepth;
    return this;
  }

  /**
   * Specifies the output schema type. If unspecified, the default is `LOSSLESS`.
   * @return value or {@code null} for none
   */
  public java.lang.String getSchemaType() {
    return schemaType;
  }

  /**
   * Specifies the output schema type. If unspecified, the default is `LOSSLESS`.
   * @param schemaType schemaType or {@code null} for none
   */
  public SchemaConfig setSchemaType(java.lang.String schemaType) {
    this.schemaType = schemaType;
    return this;
  }

  @Override
  public SchemaConfig set(String fieldName, Object value) {
    return (SchemaConfig) super.set(fieldName, value);
  }

  @Override
  public SchemaConfig clone() {
    return (SchemaConfig) super.clone();
  }

}