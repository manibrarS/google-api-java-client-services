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

package com.google.api.services.servicemanagement.model;

/**
 * A rollout resource that defines how service configuration versions are pushed to control plane
 * systems. Typically, you create a new version of the service config, and then create a Rollout to
 * push the service config.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Service Management API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Rollout extends com.google.api.client.json.GenericJson {

  /**
   * Creation time of the rollout. Readonly.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String createTime;

  /**
   * The user who created the Rollout. Readonly.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String createdBy;

  /**
   * The strategy associated with a rollout to delete a `ManagedService`. Readonly.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private DeleteServiceStrategy deleteServiceStrategy;

  /**
   * Optional. Unique identifier of this Rollout. Must be no longer than 63 characters and only
   * lower case letters, digits, '.', '_' and '-' are allowed.
   *
   * If not specified by client, the server will generate one. The generated id will have the form
   * of , where "date" is the create date in ISO 8601 format.  "revision number" is a monotonically
   * increasing positive number that is reset every day for each service. An example of the
   * generated rollout_id is '2016-02-16r1'
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String rolloutId;

  /**
   * The name of the service associated with this Rollout.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String serviceName;

  /**
   * The status of this rollout. Readonly. In case of a failed rollout, the system will
   * automatically rollback to the current Rollout version. Readonly.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String status;

  /**
   * Google Service Control selects service configurations based on traffic percentage.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private TrafficPercentStrategy trafficPercentStrategy;

  /**
   * Creation time of the rollout. Readonly.
   * @return value or {@code null} for none
   */
  public String getCreateTime() {
    return createTime;
  }

  /**
   * Creation time of the rollout. Readonly.
   * @param createTime createTime or {@code null} for none
   */
  public Rollout setCreateTime(String createTime) {
    this.createTime = createTime;
    return this;
  }

  /**
   * The user who created the Rollout. Readonly.
   * @return value or {@code null} for none
   */
  public java.lang.String getCreatedBy() {
    return createdBy;
  }

  /**
   * The user who created the Rollout. Readonly.
   * @param createdBy createdBy or {@code null} for none
   */
  public Rollout setCreatedBy(java.lang.String createdBy) {
    this.createdBy = createdBy;
    return this;
  }

  /**
   * The strategy associated with a rollout to delete a `ManagedService`. Readonly.
   * @return value or {@code null} for none
   */
  public DeleteServiceStrategy getDeleteServiceStrategy() {
    return deleteServiceStrategy;
  }

  /**
   * The strategy associated with a rollout to delete a `ManagedService`. Readonly.
   * @param deleteServiceStrategy deleteServiceStrategy or {@code null} for none
   */
  public Rollout setDeleteServiceStrategy(DeleteServiceStrategy deleteServiceStrategy) {
    this.deleteServiceStrategy = deleteServiceStrategy;
    return this;
  }

  /**
   * Optional. Unique identifier of this Rollout. Must be no longer than 63 characters and only
   * lower case letters, digits, '.', '_' and '-' are allowed.
   *
   * If not specified by client, the server will generate one. The generated id will have the form
   * of , where "date" is the create date in ISO 8601 format.  "revision number" is a monotonically
   * increasing positive number that is reset every day for each service. An example of the
   * generated rollout_id is '2016-02-16r1'
   * @return value or {@code null} for none
   */
  public java.lang.String getRolloutId() {
    return rolloutId;
  }

  /**
   * Optional. Unique identifier of this Rollout. Must be no longer than 63 characters and only
   * lower case letters, digits, '.', '_' and '-' are allowed.
   *
   * If not specified by client, the server will generate one. The generated id will have the form
   * of , where "date" is the create date in ISO 8601 format.  "revision number" is a monotonically
   * increasing positive number that is reset every day for each service. An example of the
   * generated rollout_id is '2016-02-16r1'
   * @param rolloutId rolloutId or {@code null} for none
   */
  public Rollout setRolloutId(java.lang.String rolloutId) {
    this.rolloutId = rolloutId;
    return this;
  }

  /**
   * The name of the service associated with this Rollout.
   * @return value or {@code null} for none
   */
  public java.lang.String getServiceName() {
    return serviceName;
  }

  /**
   * The name of the service associated with this Rollout.
   * @param serviceName serviceName or {@code null} for none
   */
  public Rollout setServiceName(java.lang.String serviceName) {
    this.serviceName = serviceName;
    return this;
  }

  /**
   * The status of this rollout. Readonly. In case of a failed rollout, the system will
   * automatically rollback to the current Rollout version. Readonly.
   * @return value or {@code null} for none
   */
  public java.lang.String getStatus() {
    return status;
  }

  /**
   * The status of this rollout. Readonly. In case of a failed rollout, the system will
   * automatically rollback to the current Rollout version. Readonly.
   * @param status status or {@code null} for none
   */
  public Rollout setStatus(java.lang.String status) {
    this.status = status;
    return this;
  }

  /**
   * Google Service Control selects service configurations based on traffic percentage.
   * @return value or {@code null} for none
   */
  public TrafficPercentStrategy getTrafficPercentStrategy() {
    return trafficPercentStrategy;
  }

  /**
   * Google Service Control selects service configurations based on traffic percentage.
   * @param trafficPercentStrategy trafficPercentStrategy or {@code null} for none
   */
  public Rollout setTrafficPercentStrategy(TrafficPercentStrategy trafficPercentStrategy) {
    this.trafficPercentStrategy = trafficPercentStrategy;
    return this;
  }

  @Override
  public Rollout set(String fieldName, Object value) {
    return (Rollout) super.set(fieldName, value);
  }

  @Override
  public Rollout clone() {
    return (Rollout) super.clone();
  }

}
