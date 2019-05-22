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

package com.google.api.services.container.model;

/**
 * Configuration for controlling how IPs are allocated in the cluster.
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
public final class IPAllocationPolicy extends com.google.api.client.json.GenericJson {

  /**
   * This field is deprecated, use cluster_ipv4_cidr_block.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String clusterIpv4Cidr;

  /**
   * The IP address range for the cluster pod IPs. If this field is set, then
   * `cluster.cluster_ipv4_cidr` must be left blank.
   *
   * This field is only applicable when `use_ip_aliases` is true.
   *
   * Set to blank to have a range chosen with the default size.
   *
   * Set to /netmask (e.g. `/14`) to have a range chosen with a specific netmask.
   *
   * Set to a [CIDR](http://en.wikipedia.org/wiki/Classless_Inter-Domain_Routing) notation (e.g.
   * `10.96.0.0/14`) from the RFC-1918 private networks (e.g. `10.0.0.0/8`, `172.16.0.0/12`,
   * `192.168.0.0/16`) to pick a specific range to use.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String clusterIpv4CidrBlock;

  /**
   * The name of the secondary range to be used for the cluster CIDR block.  The secondary range
   * will be used for pod IP addresses. This must be an existing secondary range associated with the
   * cluster subnetwork.
   *
   * This field is only applicable with use_ip_aliases is true and create_subnetwork is false.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String clusterSecondaryRangeName;

  /**
   * Whether a new subnetwork will be created automatically for the cluster.
   *
   * This field is only applicable when `use_ip_aliases` is true.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean createSubnetwork;

  /**
   * This field is deprecated, use node_ipv4_cidr_block.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String nodeIpv4Cidr;

  /**
   * The IP address range of the instance IPs in this cluster.
   *
   * This is applicable only if `create_subnetwork` is true.
   *
   * Set to blank to have a range chosen with the default size.
   *
   * Set to /netmask (e.g. `/14`) to have a range chosen with a specific netmask.
   *
   * Set to a [CIDR](http://en.wikipedia.org/wiki/Classless_Inter-Domain_Routing) notation (e.g.
   * `10.96.0.0/14`) from the RFC-1918 private networks (e.g. `10.0.0.0/8`, `172.16.0.0/12`,
   * `192.168.0.0/16`) to pick a specific range to use.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String nodeIpv4CidrBlock;

  /**
   * This field is deprecated, use services_ipv4_cidr_block.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String servicesIpv4Cidr;

  /**
   * The IP address range of the services IPs in this cluster. If blank, a range will be
   * automatically chosen with the default size.
   *
   * This field is only applicable when `use_ip_aliases` is true.
   *
   * Set to blank to have a range chosen with the default size.
   *
   * Set to /netmask (e.g. `/14`) to have a range chosen with a specific netmask.
   *
   * Set to a [CIDR](http://en.wikipedia.org/wiki/Classless_Inter-Domain_Routing) notation (e.g.
   * `10.96.0.0/14`) from the RFC-1918 private networks (e.g. `10.0.0.0/8`, `172.16.0.0/12`,
   * `192.168.0.0/16`) to pick a specific range to use.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String servicesIpv4CidrBlock;

  /**
   * The name of the secondary range to be used as for the services CIDR block.  The secondary range
   * will be used for service ClusterIPs. This must be an existing secondary range associated with
   * the cluster subnetwork.
   *
   * This field is only applicable with use_ip_aliases is true and create_subnetwork is false.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String servicesSecondaryRangeName;

  /**
   * A custom subnetwork name to be used if `create_subnetwork` is true.  If this field is empty,
   * then an automatic name will be chosen for the new subnetwork.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String subnetworkName;

  /**
   * The IP address range of the Cloud TPUs in this cluster. If unspecified, a range will be
   * automatically chosen with the default size.
   *
   * This field is only applicable when `use_ip_aliases` is true.
   *
   * If unspecified, the range will use the default size.
   *
   * Set to /netmask (e.g. `/14`) to have a range chosen with a specific netmask.
   *
   * Set to a [CIDR](http://en.wikipedia.org/wiki/Classless_Inter-Domain_Routing) notation (e.g.
   * `10.96.0.0/14`) from the RFC-1918 private networks (e.g. `10.0.0.0/8`, `172.16.0.0/12`,
   * `192.168.0.0/16`) to pick a specific range to use.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String tpuIpv4CidrBlock;

  /**
   * Whether alias IPs will be used for pod IPs in the cluster.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean useIpAliases;

  /**
   * This field is deprecated, use cluster_ipv4_cidr_block.
   * @return value or {@code null} for none
   */
  public java.lang.String getClusterIpv4Cidr() {
    return clusterIpv4Cidr;
  }

  /**
   * This field is deprecated, use cluster_ipv4_cidr_block.
   * @param clusterIpv4Cidr clusterIpv4Cidr or {@code null} for none
   */
  public IPAllocationPolicy setClusterIpv4Cidr(java.lang.String clusterIpv4Cidr) {
    this.clusterIpv4Cidr = clusterIpv4Cidr;
    return this;
  }

  /**
   * The IP address range for the cluster pod IPs. If this field is set, then
   * `cluster.cluster_ipv4_cidr` must be left blank.
   *
   * This field is only applicable when `use_ip_aliases` is true.
   *
   * Set to blank to have a range chosen with the default size.
   *
   * Set to /netmask (e.g. `/14`) to have a range chosen with a specific netmask.
   *
   * Set to a [CIDR](http://en.wikipedia.org/wiki/Classless_Inter-Domain_Routing) notation (e.g.
   * `10.96.0.0/14`) from the RFC-1918 private networks (e.g. `10.0.0.0/8`, `172.16.0.0/12`,
   * `192.168.0.0/16`) to pick a specific range to use.
   * @return value or {@code null} for none
   */
  public java.lang.String getClusterIpv4CidrBlock() {
    return clusterIpv4CidrBlock;
  }

  /**
   * The IP address range for the cluster pod IPs. If this field is set, then
   * `cluster.cluster_ipv4_cidr` must be left blank.
   *
   * This field is only applicable when `use_ip_aliases` is true.
   *
   * Set to blank to have a range chosen with the default size.
   *
   * Set to /netmask (e.g. `/14`) to have a range chosen with a specific netmask.
   *
   * Set to a [CIDR](http://en.wikipedia.org/wiki/Classless_Inter-Domain_Routing) notation (e.g.
   * `10.96.0.0/14`) from the RFC-1918 private networks (e.g. `10.0.0.0/8`, `172.16.0.0/12`,
   * `192.168.0.0/16`) to pick a specific range to use.
   * @param clusterIpv4CidrBlock clusterIpv4CidrBlock or {@code null} for none
   */
  public IPAllocationPolicy setClusterIpv4CidrBlock(java.lang.String clusterIpv4CidrBlock) {
    this.clusterIpv4CidrBlock = clusterIpv4CidrBlock;
    return this;
  }

  /**
   * The name of the secondary range to be used for the cluster CIDR block.  The secondary range
   * will be used for pod IP addresses. This must be an existing secondary range associated with the
   * cluster subnetwork.
   *
   * This field is only applicable with use_ip_aliases is true and create_subnetwork is false.
   * @return value or {@code null} for none
   */
  public java.lang.String getClusterSecondaryRangeName() {
    return clusterSecondaryRangeName;
  }

  /**
   * The name of the secondary range to be used for the cluster CIDR block.  The secondary range
   * will be used for pod IP addresses. This must be an existing secondary range associated with the
   * cluster subnetwork.
   *
   * This field is only applicable with use_ip_aliases is true and create_subnetwork is false.
   * @param clusterSecondaryRangeName clusterSecondaryRangeName or {@code null} for none
   */
  public IPAllocationPolicy setClusterSecondaryRangeName(java.lang.String clusterSecondaryRangeName) {
    this.clusterSecondaryRangeName = clusterSecondaryRangeName;
    return this;
  }

  /**
   * Whether a new subnetwork will be created automatically for the cluster.
   *
   * This field is only applicable when `use_ip_aliases` is true.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getCreateSubnetwork() {
    return createSubnetwork;
  }

  /**
   * Whether a new subnetwork will be created automatically for the cluster.
   *
   * This field is only applicable when `use_ip_aliases` is true.
   * @param createSubnetwork createSubnetwork or {@code null} for none
   */
  public IPAllocationPolicy setCreateSubnetwork(java.lang.Boolean createSubnetwork) {
    this.createSubnetwork = createSubnetwork;
    return this;
  }

  /**
   * This field is deprecated, use node_ipv4_cidr_block.
   * @return value or {@code null} for none
   */
  public java.lang.String getNodeIpv4Cidr() {
    return nodeIpv4Cidr;
  }

  /**
   * This field is deprecated, use node_ipv4_cidr_block.
   * @param nodeIpv4Cidr nodeIpv4Cidr or {@code null} for none
   */
  public IPAllocationPolicy setNodeIpv4Cidr(java.lang.String nodeIpv4Cidr) {
    this.nodeIpv4Cidr = nodeIpv4Cidr;
    return this;
  }

  /**
   * The IP address range of the instance IPs in this cluster.
   *
   * This is applicable only if `create_subnetwork` is true.
   *
   * Set to blank to have a range chosen with the default size.
   *
   * Set to /netmask (e.g. `/14`) to have a range chosen with a specific netmask.
   *
   * Set to a [CIDR](http://en.wikipedia.org/wiki/Classless_Inter-Domain_Routing) notation (e.g.
   * `10.96.0.0/14`) from the RFC-1918 private networks (e.g. `10.0.0.0/8`, `172.16.0.0/12`,
   * `192.168.0.0/16`) to pick a specific range to use.
   * @return value or {@code null} for none
   */
  public java.lang.String getNodeIpv4CidrBlock() {
    return nodeIpv4CidrBlock;
  }

  /**
   * The IP address range of the instance IPs in this cluster.
   *
   * This is applicable only if `create_subnetwork` is true.
   *
   * Set to blank to have a range chosen with the default size.
   *
   * Set to /netmask (e.g. `/14`) to have a range chosen with a specific netmask.
   *
   * Set to a [CIDR](http://en.wikipedia.org/wiki/Classless_Inter-Domain_Routing) notation (e.g.
   * `10.96.0.0/14`) from the RFC-1918 private networks (e.g. `10.0.0.0/8`, `172.16.0.0/12`,
   * `192.168.0.0/16`) to pick a specific range to use.
   * @param nodeIpv4CidrBlock nodeIpv4CidrBlock or {@code null} for none
   */
  public IPAllocationPolicy setNodeIpv4CidrBlock(java.lang.String nodeIpv4CidrBlock) {
    this.nodeIpv4CidrBlock = nodeIpv4CidrBlock;
    return this;
  }

  /**
   * This field is deprecated, use services_ipv4_cidr_block.
   * @return value or {@code null} for none
   */
  public java.lang.String getServicesIpv4Cidr() {
    return servicesIpv4Cidr;
  }

  /**
   * This field is deprecated, use services_ipv4_cidr_block.
   * @param servicesIpv4Cidr servicesIpv4Cidr or {@code null} for none
   */
  public IPAllocationPolicy setServicesIpv4Cidr(java.lang.String servicesIpv4Cidr) {
    this.servicesIpv4Cidr = servicesIpv4Cidr;
    return this;
  }

  /**
   * The IP address range of the services IPs in this cluster. If blank, a range will be
   * automatically chosen with the default size.
   *
   * This field is only applicable when `use_ip_aliases` is true.
   *
   * Set to blank to have a range chosen with the default size.
   *
   * Set to /netmask (e.g. `/14`) to have a range chosen with a specific netmask.
   *
   * Set to a [CIDR](http://en.wikipedia.org/wiki/Classless_Inter-Domain_Routing) notation (e.g.
   * `10.96.0.0/14`) from the RFC-1918 private networks (e.g. `10.0.0.0/8`, `172.16.0.0/12`,
   * `192.168.0.0/16`) to pick a specific range to use.
   * @return value or {@code null} for none
   */
  public java.lang.String getServicesIpv4CidrBlock() {
    return servicesIpv4CidrBlock;
  }

  /**
   * The IP address range of the services IPs in this cluster. If blank, a range will be
   * automatically chosen with the default size.
   *
   * This field is only applicable when `use_ip_aliases` is true.
   *
   * Set to blank to have a range chosen with the default size.
   *
   * Set to /netmask (e.g. `/14`) to have a range chosen with a specific netmask.
   *
   * Set to a [CIDR](http://en.wikipedia.org/wiki/Classless_Inter-Domain_Routing) notation (e.g.
   * `10.96.0.0/14`) from the RFC-1918 private networks (e.g. `10.0.0.0/8`, `172.16.0.0/12`,
   * `192.168.0.0/16`) to pick a specific range to use.
   * @param servicesIpv4CidrBlock servicesIpv4CidrBlock or {@code null} for none
   */
  public IPAllocationPolicy setServicesIpv4CidrBlock(java.lang.String servicesIpv4CidrBlock) {
    this.servicesIpv4CidrBlock = servicesIpv4CidrBlock;
    return this;
  }

  /**
   * The name of the secondary range to be used as for the services CIDR block.  The secondary range
   * will be used for service ClusterIPs. This must be an existing secondary range associated with
   * the cluster subnetwork.
   *
   * This field is only applicable with use_ip_aliases is true and create_subnetwork is false.
   * @return value or {@code null} for none
   */
  public java.lang.String getServicesSecondaryRangeName() {
    return servicesSecondaryRangeName;
  }

  /**
   * The name of the secondary range to be used as for the services CIDR block.  The secondary range
   * will be used for service ClusterIPs. This must be an existing secondary range associated with
   * the cluster subnetwork.
   *
   * This field is only applicable with use_ip_aliases is true and create_subnetwork is false.
   * @param servicesSecondaryRangeName servicesSecondaryRangeName or {@code null} for none
   */
  public IPAllocationPolicy setServicesSecondaryRangeName(java.lang.String servicesSecondaryRangeName) {
    this.servicesSecondaryRangeName = servicesSecondaryRangeName;
    return this;
  }

  /**
   * A custom subnetwork name to be used if `create_subnetwork` is true.  If this field is empty,
   * then an automatic name will be chosen for the new subnetwork.
   * @return value or {@code null} for none
   */
  public java.lang.String getSubnetworkName() {
    return subnetworkName;
  }

  /**
   * A custom subnetwork name to be used if `create_subnetwork` is true.  If this field is empty,
   * then an automatic name will be chosen for the new subnetwork.
   * @param subnetworkName subnetworkName or {@code null} for none
   */
  public IPAllocationPolicy setSubnetworkName(java.lang.String subnetworkName) {
    this.subnetworkName = subnetworkName;
    return this;
  }

  /**
   * The IP address range of the Cloud TPUs in this cluster. If unspecified, a range will be
   * automatically chosen with the default size.
   *
   * This field is only applicable when `use_ip_aliases` is true.
   *
   * If unspecified, the range will use the default size.
   *
   * Set to /netmask (e.g. `/14`) to have a range chosen with a specific netmask.
   *
   * Set to a [CIDR](http://en.wikipedia.org/wiki/Classless_Inter-Domain_Routing) notation (e.g.
   * `10.96.0.0/14`) from the RFC-1918 private networks (e.g. `10.0.0.0/8`, `172.16.0.0/12`,
   * `192.168.0.0/16`) to pick a specific range to use.
   * @return value or {@code null} for none
   */
  public java.lang.String getTpuIpv4CidrBlock() {
    return tpuIpv4CidrBlock;
  }

  /**
   * The IP address range of the Cloud TPUs in this cluster. If unspecified, a range will be
   * automatically chosen with the default size.
   *
   * This field is only applicable when `use_ip_aliases` is true.
   *
   * If unspecified, the range will use the default size.
   *
   * Set to /netmask (e.g. `/14`) to have a range chosen with a specific netmask.
   *
   * Set to a [CIDR](http://en.wikipedia.org/wiki/Classless_Inter-Domain_Routing) notation (e.g.
   * `10.96.0.0/14`) from the RFC-1918 private networks (e.g. `10.0.0.0/8`, `172.16.0.0/12`,
   * `192.168.0.0/16`) to pick a specific range to use.
   * @param tpuIpv4CidrBlock tpuIpv4CidrBlock or {@code null} for none
   */
  public IPAllocationPolicy setTpuIpv4CidrBlock(java.lang.String tpuIpv4CidrBlock) {
    this.tpuIpv4CidrBlock = tpuIpv4CidrBlock;
    return this;
  }

  /**
   * Whether alias IPs will be used for pod IPs in the cluster.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getUseIpAliases() {
    return useIpAliases;
  }

  /**
   * Whether alias IPs will be used for pod IPs in the cluster.
   * @param useIpAliases useIpAliases or {@code null} for none
   */
  public IPAllocationPolicy setUseIpAliases(java.lang.Boolean useIpAliases) {
    this.useIpAliases = useIpAliases;
    return this;
  }

  @Override
  public IPAllocationPolicy set(String fieldName, Object value) {
    return (IPAllocationPolicy) super.set(fieldName, value);
  }

  @Override
  public IPAllocationPolicy clone() {
    return (IPAllocationPolicy) super.clone();
  }

}