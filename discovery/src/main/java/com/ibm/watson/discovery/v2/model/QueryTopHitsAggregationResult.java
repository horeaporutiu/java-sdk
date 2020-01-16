/*
 * (C) Copyright IBM Corp. 2019, 2020.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 */
package com.ibm.watson.discovery.v2.model;

import java.util.List;
import java.util.Map;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * A query response containing the matching documents for the preceding aggregations.
 */
public class QueryTopHitsAggregationResult extends GenericModel {

  @SerializedName("matching_results")
  protected Long matchingResults;
  protected List<Map<String, Object>> hits;

  /**
   * Gets the matchingResults.
   *
   * Number of matching results.
   *
   * @return the matchingResults
   */
  public Long getMatchingResults() {
    return matchingResults;
  }

  /**
   * Gets the hits.
   *
   * An array of the document results.
   *
   * @return the hits
   */
  public List<Map<String, Object>> getHits() {
    return hits;
  }
}
