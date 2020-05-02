package de.conciso.ping;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.UriBuilder;

import org.junit.AfterClass;
import org.junit.BeforeClass;

public class ContractVerifierBase {

  private static Client client;
  protected static WebTarget webTarget;

  @BeforeClass
  public static void setUp() {
    client = ClientBuilder.newClient();
    webTarget = client.target("http://localhost:8080");
  }

  @AfterClass
  public static void tearDown() {
    if (client != null) {
      client.close();
    }
  }
}
