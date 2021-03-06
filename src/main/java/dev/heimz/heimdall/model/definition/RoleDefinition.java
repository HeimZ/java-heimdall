package dev.heimz.heimdall.model.definition;

import org.immutables.value.Value.Default;

interface RoleDefinition {

  @Default
  default boolean role() {
    return false;
  }

  @Default
  default boolean roleHierarchy() {
    return false;
  }

  @Default
  default int maxRoleHierarchy() {
    return 10;
  }

  @Default
  default boolean application() {
    return false;
  }
}
