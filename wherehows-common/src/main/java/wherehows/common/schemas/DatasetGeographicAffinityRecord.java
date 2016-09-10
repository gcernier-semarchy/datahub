/**
 * Copyright 2015 LinkedIn Corp. All rights reserved.
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
 */
package wherehows.common.schemas;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class DatasetGeographicAffinityRecord extends AbstractRecord {

  String affinity;
  List<DatasetLocaleRecord> locations;

  @Override
  public String[] getDbColumnNames() {
    return new String[]{"affinity", "locations"};
  }

  @Override
  public List<Object> fillAllFields() {
    return null;
  }

  public DatasetGeographicAffinityRecord() {
  }

  @Override
  public String toString() {
    try {
      Map<String, String> valueMap = new HashMap<>();
      valueMap.put("affinity", affinity);
      valueMap.put("locations", locations.toString());
      return new ObjectMapper().writeValueAsString(valueMap);
    } catch (JsonProcessingException ex) {
      return null;
    }
  }

  public String getAffinity() {
    return affinity;
  }

  public void setAffinity(String affinity) {
    this.affinity = affinity;
  }

  public List<DatasetLocaleRecord> getLocations() {
    return locations;
  }

  public void setLocations(List<DatasetLocaleRecord> locations) {
    this.locations = locations;
  }
}
