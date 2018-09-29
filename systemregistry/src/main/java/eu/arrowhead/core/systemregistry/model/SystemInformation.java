/*
 * This work is part of the Productive 4.0 innovation project, which receives grants from the
 * European Commissions H2020 research and innovation programme, ECSEL Joint Undertaking
 * (project no. 737459), the free state of Saxony, the German Federal Ministry of Education and
 * national funding authorities from involved countries.
 */

package eu.arrowhead.core.systemregistry.model;

public class SystemInformation extends Information {

  private SystemIdentity identity;
  private SystemMetadata metadata;
  private Elements<ServiceIdentity> elements;

  public SystemInformation(SystemIdentity identity, Endpoint endpoint, SystemMetadata metadata, Elements<ServiceIdentity> elements) {
    super(identity, endpoint, metadata);
    this.identity = identity;
    this.metadata = metadata;
    this.elements = elements;
  }

  public SystemIdentity getIdentity() {
    return this.identity;
  }

  public void setIdentity(SystemIdentity identity) {
    this.identity = identity;
  }

  public SystemMetadata getMetadata() {
    return this.metadata;
  }

  public void setMetadata(SystemMetadata metadata) {
    this.metadata = metadata;
  }

  public Elements<ServiceIdentity> getElements() {
    return this.elements;
  }

  public void setElements(Elements<ServiceIdentity> elements) {
    this.elements = elements;
  }

  @Override
  public String toString() {
    return "System: \n\t" + identity + "\n\t" + endpoint + "\n\t" + elements + "Metadata [data=" + metadata + "]";
  }

}
