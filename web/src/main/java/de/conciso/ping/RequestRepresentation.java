package de.conciso.ping;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import org.immutables.value.Value;

@Value.Immutable
@JsonDeserialize(as = ImmutableRequestRepresentation.class)
public interface RequestRepresentation {
  String getValue();
}
