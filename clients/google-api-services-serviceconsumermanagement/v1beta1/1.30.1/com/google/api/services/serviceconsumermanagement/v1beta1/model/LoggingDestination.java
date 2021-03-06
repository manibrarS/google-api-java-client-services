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

package com.google.api.services.serviceconsumermanagement.v1beta1.model;

/**
 * Configuration of a specific logging destination (the producer project or the consumer project).
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Service Consumer Management API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class LoggingDestination extends com.google.api.client.json.GenericJson {

  /**
   * Names of the logs to be sent to this destination. Each name must be defined in the Service.logs
   * section. If the log name is not a domain scoped name, it will be automatically prefixed with
   * the service name followed by "/".
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> logs;

  /**
   * The monitored resource type. The type must be defined in the Service.monitored_resources
   * section.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String monitoredResource;

  /**
   * Names of the logs to be sent to this destination. Each name must be defined in the Service.logs
   * section. If the log name is not a domain scoped name, it will be automatically prefixed with
   * the service name followed by "/".
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getLogs() {
    return logs;
  }

  /**
   * Names of the logs to be sent to this destination. Each name must be defined in the Service.logs
   * section. If the log name is not a domain scoped name, it will be automatically prefixed with
   * the service name followed by "/".
   * @param logs logs or {@code null} for none
   */
  public LoggingDestination setLogs(java.util.List<java.lang.String> logs) {
    this.logs = logs;
    return this;
  }

  /**
   * The monitored resource type. The type must be defined in the Service.monitored_resources
   * section.
   * @return value or {@code null} for none
   */
  public java.lang.String getMonitoredResource() {
    return monitoredResource;
  }

  /**
   * The monitored resource type. The type must be defined in the Service.monitored_resources
   * section.
   * @param monitoredResource monitoredResource or {@code null} for none
   */
  public LoggingDestination setMonitoredResource(java.lang.String monitoredResource) {
    this.monitoredResource = monitoredResource;
    return this;
  }

  @Override
  public LoggingDestination set(String fieldName, Object value) {
    return (LoggingDestination) super.set(fieldName, value);
  }

  @Override
  public LoggingDestination clone() {
    return (LoggingDestination) super.clone();
  }

}
