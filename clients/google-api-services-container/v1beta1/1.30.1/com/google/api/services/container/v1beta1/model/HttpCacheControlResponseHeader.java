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

package com.google.api.services.container.v1beta1.model;

/**
 * RFC-2616: cache control support
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Kubernetes Engine API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class HttpCacheControlResponseHeader extends com.google.api.client.json.GenericJson {

  /**
   * 14.6 response cache age, in seconds since the response is generated
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long age;

  /**
   * 14.9 request and response directives
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String directive;

  /**
   * 14.21 response cache expires, in RFC 1123 date format
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String expires;

  /**
   * 14.6 response cache age, in seconds since the response is generated
   * @return value or {@code null} for none
   */
  public java.lang.Long getAge() {
    return age;
  }

  /**
   * 14.6 response cache age, in seconds since the response is generated
   * @param age age or {@code null} for none
   */
  public HttpCacheControlResponseHeader setAge(java.lang.Long age) {
    this.age = age;
    return this;
  }

  /**
   * 14.9 request and response directives
   * @return value or {@code null} for none
   */
  public java.lang.String getDirective() {
    return directive;
  }

  /**
   * 14.9 request and response directives
   * @param directive directive or {@code null} for none
   */
  public HttpCacheControlResponseHeader setDirective(java.lang.String directive) {
    this.directive = directive;
    return this;
  }

  /**
   * 14.21 response cache expires, in RFC 1123 date format
   * @return value or {@code null} for none
   */
  public java.lang.String getExpires() {
    return expires;
  }

  /**
   * 14.21 response cache expires, in RFC 1123 date format
   * @param expires expires or {@code null} for none
   */
  public HttpCacheControlResponseHeader setExpires(java.lang.String expires) {
    this.expires = expires;
    return this;
  }

  @Override
  public HttpCacheControlResponseHeader set(String fieldName, Object value) {
    return (HttpCacheControlResponseHeader) super.set(fieldName, value);
  }

  @Override
  public HttpCacheControlResponseHeader clone() {
    return (HttpCacheControlResponseHeader) super.clone();
  }

}
