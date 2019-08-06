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

package com.google.api.services.people.v1.model;

/**
 * The response for deleteing a contact's photo.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the People API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class DeleteContactPhotoResponse extends com.google.api.client.json.GenericJson {

  /**
   * The updated person, if person_fields is set in the DeleteContactPhotoRequest; otherwise this
   * will be unset.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Person person;

  /**
   * The updated person, if person_fields is set in the DeleteContactPhotoRequest; otherwise this
   * will be unset.
   * @return value or {@code null} for none
   */
  public Person getPerson() {
    return person;
  }

  /**
   * The updated person, if person_fields is set in the DeleteContactPhotoRequest; otherwise this
   * will be unset.
   * @param person person or {@code null} for none
   */
  public DeleteContactPhotoResponse setPerson(Person person) {
    this.person = person;
    return this;
  }

  @Override
  public DeleteContactPhotoResponse set(String fieldName, Object value) {
    return (DeleteContactPhotoResponse) super.set(fieldName, value);
  }

  @Override
  public DeleteContactPhotoResponse clone() {
    return (DeleteContactPhotoResponse) super.clone();
  }

}