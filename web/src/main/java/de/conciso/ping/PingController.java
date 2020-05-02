package de.conciso.ping;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PingController {

  private static final String HELLO = "Hello, %s!";
  private static final String HOW_ARE_YOU = "How are you, %s?";

  @PostMapping(value = "/hello",
  consumes = MediaType.APPLICATION_JSON_VALUE,
  produces = MediaType.APPLICATION_JSON_VALUE)
  public ResponseRepresentation hello(@RequestBody RequestRepresentation requestRepresentation) {
    return ImmutableResponseRepresentation.builder()
        .message(String.format(HELLO, requestRepresentation.getValue()))
        .build();
  }

  @PostMapping(value = "/ping",
      consumes = "application/my-content-type+json",
      produces = MediaType.APPLICATION_JSON_VALUE)
  public ResponseRepresentation howAreYou(@RequestBody RequestRepresentation requestRepresentation) {
    return ImmutableResponseRepresentation.builder()
        .message(String.format(HOW_ARE_YOU, requestRepresentation.getValue()))
        .build();
  }
}

