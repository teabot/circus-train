/**
 * Copyright (C) 2016-2017 Expedia Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.hotels.bdp.circustrain.metrics.conf;

import com.google.common.annotations.VisibleForTesting;

import com.hotels.bdp.circustrain.api.util.DotJoiner;

public class ValidatedGraphite {

  private final Graphite validated;

  public ValidatedGraphite(Graphite validated) {
    this.validated = validated;
  }

  public String getFormattedPrefix() {
    String formattedPrefix = DotJoiner.join(validated.getPrefix(), validated.getNamespace());
    return formattedPrefix;
  }

  public boolean isEnabled() {
    return validated.isEnabled();
  }

  public String getHost() {
    return validated.getHost();
  }

  @VisibleForTesting
  Graphite getGraphite() {
    return validated;
  }

}
