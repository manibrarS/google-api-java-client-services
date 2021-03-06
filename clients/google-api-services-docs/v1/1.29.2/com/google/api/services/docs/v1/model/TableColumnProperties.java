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

package com.google.api.services.docs.v1.model;

/**
 * The properties of a column in a table.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Docs API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class TableColumnProperties extends com.google.api.client.json.GenericJson {

  /**
   * The width of the column. Set when the column's `width_type` is FIXED_WIDTH.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Dimension width;

  /**
   * The width type of the column.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String widthType;

  /**
   * The width of the column. Set when the column's `width_type` is FIXED_WIDTH.
   * @return value or {@code null} for none
   */
  public Dimension getWidth() {
    return width;
  }

  /**
   * The width of the column. Set when the column's `width_type` is FIXED_WIDTH.
   * @param width width or {@code null} for none
   */
  public TableColumnProperties setWidth(Dimension width) {
    this.width = width;
    return this;
  }

  /**
   * The width type of the column.
   * @return value or {@code null} for none
   */
  public java.lang.String getWidthType() {
    return widthType;
  }

  /**
   * The width type of the column.
   * @param widthType widthType or {@code null} for none
   */
  public TableColumnProperties setWidthType(java.lang.String widthType) {
    this.widthType = widthType;
    return this;
  }

  @Override
  public TableColumnProperties set(String fieldName, Object value) {
    return (TableColumnProperties) super.set(fieldName, value);
  }

  @Override
  public TableColumnProperties clone() {
    return (TableColumnProperties) super.clone();
  }

}
