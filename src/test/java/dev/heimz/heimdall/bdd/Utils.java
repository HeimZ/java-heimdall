package dev.heimz.heimdall.bdd;

import dev.heimz.heimdall.model.entity.Rule;
import java.util.Arrays;
import org.apache.commons.lang3.StringUtils;

public interface Utils {

  static Rule[] getRulesFromString(final String input) {
    if (StringUtils.isBlank(input)) {
      return new Rule[] {};
    }
    return Arrays.stream(input.split("\\s*,\\s*"))
        .map(String::toUpperCase)
        .map(Rule::valueOf)
        .toArray(Rule[]::new);
  }
}
