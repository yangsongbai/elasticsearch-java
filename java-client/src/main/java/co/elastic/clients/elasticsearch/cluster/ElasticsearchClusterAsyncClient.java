/*
 * Licensed to Elasticsearch B.V. under one or more contributor
 * license agreements. See the NOTICE file distributed with
 * this work for additional information regarding copyright
 * ownership. Elasticsearch B.V. licenses this file to you under
 * the Apache License, Version 2.0 (the "License"); you may
 * not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package co.elastic.clients.elasticsearch.cluster;

import co.elastic.clients.ApiClient;
import co.elastic.clients.elasticsearch._types.ErrorResponse;
import co.elastic.clients.transport.ElasticsearchTransport;
import co.elastic.clients.transport.Endpoint;
import co.elastic.clients.transport.JsonEndpoint;
import co.elastic.clients.transport.Transport;
import co.elastic.clients.transport.TransportOptions;
import co.elastic.clients.transport.endpoints.BooleanResponse;
import co.elastic.clients.util.ObjectBuilder;
import java.util.concurrent.CompletableFuture;
import java.util.function.Function;
import javax.annotation.Nullable;

//----------------------------------------------------------------
//       THIS CODE IS GENERATED. MANUAL EDITS WILL BE LOST.
//----------------------------------------------------------------
//
// This code is generated from the Elasticsearch API specification
// at https://github.com/elastic/elasticsearch-specification
//
// Manual updates to this file will be lost when the code is
// re-generated.
//
// If you find a property that is missing or wrongly typed, please
// open an issue or a PR on the API specification repository.
//
//----------------------------------------------------------------

/**
 * Client for the cluster namespace.
 */
public class ElasticsearchClusterAsyncClient
		extends
			ApiClient<ElasticsearchTransport, ElasticsearchClusterAsyncClient> {

	public ElasticsearchClusterAsyncClient(ElasticsearchTransport transport) {
		super(transport, null);
	}

	public ElasticsearchClusterAsyncClient(ElasticsearchTransport transport,
			@Nullable TransportOptions transportOptions) {
		super(transport, transportOptions);
	}

	@Override
	public ElasticsearchClusterAsyncClient withTransportOptions(@Nullable TransportOptions transportOptions) {
		return new ElasticsearchClusterAsyncClient(this.transport, transportOptions);
	}

	// ----- Endpoint: cluster.allocation_explain

	/**
	 * Provides explanations for shard allocations in the cluster.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/8.15/cluster-allocation-explain.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<AllocationExplainResponse> allocationExplain(AllocationExplainRequest request) {
		@SuppressWarnings("unchecked")
		JsonEndpoint<AllocationExplainRequest, AllocationExplainResponse, ErrorResponse> endpoint = (JsonEndpoint<AllocationExplainRequest, AllocationExplainResponse, ErrorResponse>) AllocationExplainRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
	}

	/**
	 * Provides explanations for shard allocations in the cluster.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link AllocationExplainRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/8.15/cluster-allocation-explain.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<AllocationExplainResponse> allocationExplain(
			Function<AllocationExplainRequest.Builder, ObjectBuilder<AllocationExplainRequest>> fn) {
		return allocationExplain(fn.apply(new AllocationExplainRequest.Builder()).build());
	}

	/**
	 * Provides explanations for shard allocations in the cluster.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/8.15/cluster-allocation-explain.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<AllocationExplainResponse> allocationExplain() {
		return this.transport.performRequestAsync(new AllocationExplainRequest.Builder().build(),
				AllocationExplainRequest._ENDPOINT, this.transportOptions);
	}

	// ----- Endpoint: cluster.delete_component_template

	/**
	 * Deletes component templates. Component templates are building blocks for
	 * constructing index templates that specify index mappings, settings, and
	 * aliases.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/8.15/indices-component-template.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<DeleteComponentTemplateResponse> deleteComponentTemplate(
			DeleteComponentTemplateRequest request) {
		@SuppressWarnings("unchecked")
		JsonEndpoint<DeleteComponentTemplateRequest, DeleteComponentTemplateResponse, ErrorResponse> endpoint = (JsonEndpoint<DeleteComponentTemplateRequest, DeleteComponentTemplateResponse, ErrorResponse>) DeleteComponentTemplateRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
	}

	/**
	 * Deletes component templates. Component templates are building blocks for
	 * constructing index templates that specify index mappings, settings, and
	 * aliases.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link DeleteComponentTemplateRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/8.15/indices-component-template.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<DeleteComponentTemplateResponse> deleteComponentTemplate(
			Function<DeleteComponentTemplateRequest.Builder, ObjectBuilder<DeleteComponentTemplateRequest>> fn) {
		return deleteComponentTemplate(fn.apply(new DeleteComponentTemplateRequest.Builder()).build());
	}

	// ----- Endpoint: cluster.delete_voting_config_exclusions

	/**
	 * Clears cluster voting config exclusions.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/8.15/voting-config-exclusions.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<BooleanResponse> deleteVotingConfigExclusions(
			DeleteVotingConfigExclusionsRequest request) {
		@SuppressWarnings("unchecked")
		Endpoint<DeleteVotingConfigExclusionsRequest, BooleanResponse, ErrorResponse> endpoint = (Endpoint<DeleteVotingConfigExclusionsRequest, BooleanResponse, ErrorResponse>) DeleteVotingConfigExclusionsRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
	}

	/**
	 * Clears cluster voting config exclusions.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link DeleteVotingConfigExclusionsRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/8.15/voting-config-exclusions.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<BooleanResponse> deleteVotingConfigExclusions(
			Function<DeleteVotingConfigExclusionsRequest.Builder, ObjectBuilder<DeleteVotingConfigExclusionsRequest>> fn) {
		return deleteVotingConfigExclusions(fn.apply(new DeleteVotingConfigExclusionsRequest.Builder()).build());
	}

	/**
	 * Clears cluster voting config exclusions.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/8.15/voting-config-exclusions.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<BooleanResponse> deleteVotingConfigExclusions() {
		return this.transport.performRequestAsync(new DeleteVotingConfigExclusionsRequest.Builder().build(),
				DeleteVotingConfigExclusionsRequest._ENDPOINT, this.transportOptions);
	}

	// ----- Endpoint: cluster.exists_component_template

	/**
	 * Returns information about whether a particular component template exist
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/8.15/indices-component-template.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<BooleanResponse> existsComponentTemplate(ExistsComponentTemplateRequest request) {
		@SuppressWarnings("unchecked")
		Endpoint<ExistsComponentTemplateRequest, BooleanResponse, ErrorResponse> endpoint = (Endpoint<ExistsComponentTemplateRequest, BooleanResponse, ErrorResponse>) ExistsComponentTemplateRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
	}

	/**
	 * Returns information about whether a particular component template exist
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link ExistsComponentTemplateRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/8.15/indices-component-template.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<BooleanResponse> existsComponentTemplate(
			Function<ExistsComponentTemplateRequest.Builder, ObjectBuilder<ExistsComponentTemplateRequest>> fn) {
		return existsComponentTemplate(fn.apply(new ExistsComponentTemplateRequest.Builder()).build());
	}

	// ----- Endpoint: cluster.get_component_template

	/**
	 * Retrieves information about component templates.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/8.15/indices-component-template.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<GetComponentTemplateResponse> getComponentTemplate(GetComponentTemplateRequest request) {
		@SuppressWarnings("unchecked")
		JsonEndpoint<GetComponentTemplateRequest, GetComponentTemplateResponse, ErrorResponse> endpoint = (JsonEndpoint<GetComponentTemplateRequest, GetComponentTemplateResponse, ErrorResponse>) GetComponentTemplateRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
	}

	/**
	 * Retrieves information about component templates.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link GetComponentTemplateRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/8.15/indices-component-template.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<GetComponentTemplateResponse> getComponentTemplate(
			Function<GetComponentTemplateRequest.Builder, ObjectBuilder<GetComponentTemplateRequest>> fn) {
		return getComponentTemplate(fn.apply(new GetComponentTemplateRequest.Builder()).build());
	}

	/**
	 * Retrieves information about component templates.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/8.15/indices-component-template.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<GetComponentTemplateResponse> getComponentTemplate() {
		return this.transport.performRequestAsync(new GetComponentTemplateRequest.Builder().build(),
				GetComponentTemplateRequest._ENDPOINT, this.transportOptions);
	}

	// ----- Endpoint: cluster.get_settings

	/**
	 * Returns cluster-wide settings. By default, it returns only settings that have
	 * been explicitly defined.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/8.15/cluster-get-settings.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<GetClusterSettingsResponse> getSettings(GetClusterSettingsRequest request) {
		@SuppressWarnings("unchecked")
		JsonEndpoint<GetClusterSettingsRequest, GetClusterSettingsResponse, ErrorResponse> endpoint = (JsonEndpoint<GetClusterSettingsRequest, GetClusterSettingsResponse, ErrorResponse>) GetClusterSettingsRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
	}

	/**
	 * Returns cluster-wide settings. By default, it returns only settings that have
	 * been explicitly defined.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link GetClusterSettingsRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/8.15/cluster-get-settings.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<GetClusterSettingsResponse> getSettings(
			Function<GetClusterSettingsRequest.Builder, ObjectBuilder<GetClusterSettingsRequest>> fn) {
		return getSettings(fn.apply(new GetClusterSettingsRequest.Builder()).build());
	}

	/**
	 * Returns cluster-wide settings. By default, it returns only settings that have
	 * been explicitly defined.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/8.15/cluster-get-settings.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<GetClusterSettingsResponse> getSettings() {
		return this.transport.performRequestAsync(new GetClusterSettingsRequest.Builder().build(),
				GetClusterSettingsRequest._ENDPOINT, this.transportOptions);
	}

	// ----- Endpoint: cluster.health

	/**
	 * The cluster health API returns a simple status on the health of the cluster.
	 * You can also use the API to get the health status of only specified data
	 * streams and indices. For data streams, the API retrieves the health status of
	 * the stream’s backing indices. The cluster health status is: green, yellow or
	 * red. On the shard level, a red status indicates that the specific shard is
	 * not allocated in the cluster, yellow means that the primary shard is
	 * allocated but replicas are not, and green means that all shards are
	 * allocated. The index level status is controlled by the worst shard status.
	 * The cluster status is controlled by the worst index status.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/8.15/cluster-health.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<HealthResponse> health(HealthRequest request) {
		@SuppressWarnings("unchecked")
		JsonEndpoint<HealthRequest, HealthResponse, ErrorResponse> endpoint = (JsonEndpoint<HealthRequest, HealthResponse, ErrorResponse>) HealthRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
	}

	/**
	 * The cluster health API returns a simple status on the health of the cluster.
	 * You can also use the API to get the health status of only specified data
	 * streams and indices. For data streams, the API retrieves the health status of
	 * the stream’s backing indices. The cluster health status is: green, yellow or
	 * red. On the shard level, a red status indicates that the specific shard is
	 * not allocated in the cluster, yellow means that the primary shard is
	 * allocated but replicas are not, and green means that all shards are
	 * allocated. The index level status is controlled by the worst shard status.
	 * The cluster status is controlled by the worst index status.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link HealthRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/8.15/cluster-health.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<HealthResponse> health(
			Function<HealthRequest.Builder, ObjectBuilder<HealthRequest>> fn) {
		return health(fn.apply(new HealthRequest.Builder()).build());
	}

	/**
	 * The cluster health API returns a simple status on the health of the cluster.
	 * You can also use the API to get the health status of only specified data
	 * streams and indices. For data streams, the API retrieves the health status of
	 * the stream’s backing indices. The cluster health status is: green, yellow or
	 * red. On the shard level, a red status indicates that the specific shard is
	 * not allocated in the cluster, yellow means that the primary shard is
	 * allocated but replicas are not, and green means that all shards are
	 * allocated. The index level status is controlled by the worst shard status.
	 * The cluster status is controlled by the worst index status.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/8.15/cluster-health.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<HealthResponse> health() {
		return this.transport.performRequestAsync(new HealthRequest.Builder().build(), HealthRequest._ENDPOINT,
				this.transportOptions);
	}

	// ----- Endpoint: cluster.info

	/**
	 * Returns different information about the cluster.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/8.15/cluster-info.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<ClusterInfoResponse> info(ClusterInfoRequest request) {
		@SuppressWarnings("unchecked")
		JsonEndpoint<ClusterInfoRequest, ClusterInfoResponse, ErrorResponse> endpoint = (JsonEndpoint<ClusterInfoRequest, ClusterInfoResponse, ErrorResponse>) ClusterInfoRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
	}

	/**
	 * Returns different information about the cluster.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link ClusterInfoRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/8.15/cluster-info.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<ClusterInfoResponse> info(
			Function<ClusterInfoRequest.Builder, ObjectBuilder<ClusterInfoRequest>> fn) {
		return info(fn.apply(new ClusterInfoRequest.Builder()).build());
	}

	// ----- Endpoint: cluster.pending_tasks

	/**
	 * Returns cluster-level changes (such as create index, update mapping, allocate
	 * or fail shard) that have not yet been executed. NOTE: This API returns a list
	 * of any pending updates to the cluster state. These are distinct from the
	 * tasks reported by the Task Management API which include periodic tasks and
	 * tasks initiated by the user, such as node stats, search queries, or create
	 * index requests. However, if a user-initiated task such as a create index
	 * command causes a cluster state update, the activity of this task might be
	 * reported by both task api and pending cluster tasks API.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/8.15/cluster-pending.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<PendingTasksResponse> pendingTasks(PendingTasksRequest request) {
		@SuppressWarnings("unchecked")
		JsonEndpoint<PendingTasksRequest, PendingTasksResponse, ErrorResponse> endpoint = (JsonEndpoint<PendingTasksRequest, PendingTasksResponse, ErrorResponse>) PendingTasksRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
	}

	/**
	 * Returns cluster-level changes (such as create index, update mapping, allocate
	 * or fail shard) that have not yet been executed. NOTE: This API returns a list
	 * of any pending updates to the cluster state. These are distinct from the
	 * tasks reported by the Task Management API which include periodic tasks and
	 * tasks initiated by the user, such as node stats, search queries, or create
	 * index requests. However, if a user-initiated task such as a create index
	 * command causes a cluster state update, the activity of this task might be
	 * reported by both task api and pending cluster tasks API.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link PendingTasksRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/8.15/cluster-pending.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<PendingTasksResponse> pendingTasks(
			Function<PendingTasksRequest.Builder, ObjectBuilder<PendingTasksRequest>> fn) {
		return pendingTasks(fn.apply(new PendingTasksRequest.Builder()).build());
	}

	/**
	 * Returns cluster-level changes (such as create index, update mapping, allocate
	 * or fail shard) that have not yet been executed. NOTE: This API returns a list
	 * of any pending updates to the cluster state. These are distinct from the
	 * tasks reported by the Task Management API which include periodic tasks and
	 * tasks initiated by the user, such as node stats, search queries, or create
	 * index requests. However, if a user-initiated task such as a create index
	 * command causes a cluster state update, the activity of this task might be
	 * reported by both task api and pending cluster tasks API.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/8.15/cluster-pending.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<PendingTasksResponse> pendingTasks() {
		return this.transport.performRequestAsync(new PendingTasksRequest.Builder().build(),
				PendingTasksRequest._ENDPOINT, this.transportOptions);
	}

	// ----- Endpoint: cluster.post_voting_config_exclusions

	/**
	 * Updates the cluster voting config exclusions by node ids or node names.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/8.15/voting-config-exclusions.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<BooleanResponse> postVotingConfigExclusions(PostVotingConfigExclusionsRequest request) {
		@SuppressWarnings("unchecked")
		Endpoint<PostVotingConfigExclusionsRequest, BooleanResponse, ErrorResponse> endpoint = (Endpoint<PostVotingConfigExclusionsRequest, BooleanResponse, ErrorResponse>) PostVotingConfigExclusionsRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
	}

	/**
	 * Updates the cluster voting config exclusions by node ids or node names.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link PostVotingConfigExclusionsRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/8.15/voting-config-exclusions.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<BooleanResponse> postVotingConfigExclusions(
			Function<PostVotingConfigExclusionsRequest.Builder, ObjectBuilder<PostVotingConfigExclusionsRequest>> fn) {
		return postVotingConfigExclusions(fn.apply(new PostVotingConfigExclusionsRequest.Builder()).build());
	}

	/**
	 * Updates the cluster voting config exclusions by node ids or node names.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/8.15/voting-config-exclusions.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<BooleanResponse> postVotingConfigExclusions() {
		return this.transport.performRequestAsync(new PostVotingConfigExclusionsRequest.Builder().build(),
				PostVotingConfigExclusionsRequest._ENDPOINT, this.transportOptions);
	}

	// ----- Endpoint: cluster.put_component_template

	/**
	 * Creates or updates a component template. Component templates are building
	 * blocks for constructing index templates that specify index mappings,
	 * settings, and aliases.
	 * <p>
	 * An index template can be composed of multiple component templates. To use a
	 * component template, specify it in an index template’s
	 * <code>composed_of</code> list. Component templates are only applied to new
	 * data streams and indices as part of a matching index template.
	 * <p>
	 * Settings and mappings specified directly in the index template or the create
	 * index request override any settings or mappings specified in a component
	 * template.
	 * <p>
	 * Component templates are only used during index creation. For data streams,
	 * this includes data stream creation and the creation of a stream’s backing
	 * indices. Changes to component templates do not affect existing indices,
	 * including a stream’s backing indices.
	 * <p>
	 * You can use C-style <code>/* *\/</code> block comments in component
	 * templates. You can include comments anywhere in the request body except
	 * before the opening curly bracket.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/8.15/indices-component-template.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<PutComponentTemplateResponse> putComponentTemplate(PutComponentTemplateRequest request) {
		@SuppressWarnings("unchecked")
		JsonEndpoint<PutComponentTemplateRequest, PutComponentTemplateResponse, ErrorResponse> endpoint = (JsonEndpoint<PutComponentTemplateRequest, PutComponentTemplateResponse, ErrorResponse>) PutComponentTemplateRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
	}

	/**
	 * Creates or updates a component template. Component templates are building
	 * blocks for constructing index templates that specify index mappings,
	 * settings, and aliases.
	 * <p>
	 * An index template can be composed of multiple component templates. To use a
	 * component template, specify it in an index template’s
	 * <code>composed_of</code> list. Component templates are only applied to new
	 * data streams and indices as part of a matching index template.
	 * <p>
	 * Settings and mappings specified directly in the index template or the create
	 * index request override any settings or mappings specified in a component
	 * template.
	 * <p>
	 * Component templates are only used during index creation. For data streams,
	 * this includes data stream creation and the creation of a stream’s backing
	 * indices. Changes to component templates do not affect existing indices,
	 * including a stream’s backing indices.
	 * <p>
	 * You can use C-style <code>/* *\/</code> block comments in component
	 * templates. You can include comments anywhere in the request body except
	 * before the opening curly bracket.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link PutComponentTemplateRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/8.15/indices-component-template.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<PutComponentTemplateResponse> putComponentTemplate(
			Function<PutComponentTemplateRequest.Builder, ObjectBuilder<PutComponentTemplateRequest>> fn) {
		return putComponentTemplate(fn.apply(new PutComponentTemplateRequest.Builder()).build());
	}

	// ----- Endpoint: cluster.put_settings

	/**
	 * Updates the cluster settings.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/8.15/cluster-update-settings.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<PutClusterSettingsResponse> putSettings(PutClusterSettingsRequest request) {
		@SuppressWarnings("unchecked")
		JsonEndpoint<PutClusterSettingsRequest, PutClusterSettingsResponse, ErrorResponse> endpoint = (JsonEndpoint<PutClusterSettingsRequest, PutClusterSettingsResponse, ErrorResponse>) PutClusterSettingsRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
	}

	/**
	 * Updates the cluster settings.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link PutClusterSettingsRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/8.15/cluster-update-settings.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<PutClusterSettingsResponse> putSettings(
			Function<PutClusterSettingsRequest.Builder, ObjectBuilder<PutClusterSettingsRequest>> fn) {
		return putSettings(fn.apply(new PutClusterSettingsRequest.Builder()).build());
	}

	/**
	 * Updates the cluster settings.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/8.15/cluster-update-settings.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<PutClusterSettingsResponse> putSettings() {
		return this.transport.performRequestAsync(new PutClusterSettingsRequest.Builder().build(),
				PutClusterSettingsRequest._ENDPOINT, this.transportOptions);
	}

	// ----- Endpoint: cluster.remote_info

	/**
	 * The cluster remote info API allows you to retrieve all of the configured
	 * remote cluster information. It returns connection and endpoint information
	 * keyed by the configured remote cluster alias.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/8.15/cluster-remote-info.html">Documentation
	 *      on elastic.co</a>
	 */
	public CompletableFuture<RemoteInfoResponse> remoteInfo() {
		return this.transport.performRequestAsync(RemoteInfoRequest._INSTANCE, RemoteInfoRequest._ENDPOINT,
				this.transportOptions);
	}

	// ----- Endpoint: cluster.reroute

	/**
	 * Allows to manually change the allocation of individual shards in the cluster.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/8.15/cluster-reroute.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<RerouteResponse> reroute(RerouteRequest request) {
		@SuppressWarnings("unchecked")
		JsonEndpoint<RerouteRequest, RerouteResponse, ErrorResponse> endpoint = (JsonEndpoint<RerouteRequest, RerouteResponse, ErrorResponse>) RerouteRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
	}

	/**
	 * Allows to manually change the allocation of individual shards in the cluster.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link RerouteRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/8.15/cluster-reroute.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<RerouteResponse> reroute(
			Function<RerouteRequest.Builder, ObjectBuilder<RerouteRequest>> fn) {
		return reroute(fn.apply(new RerouteRequest.Builder()).build());
	}

	/**
	 * Allows to manually change the allocation of individual shards in the cluster.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/8.15/cluster-reroute.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<RerouteResponse> reroute() {
		return this.transport.performRequestAsync(new RerouteRequest.Builder().build(), RerouteRequest._ENDPOINT,
				this.transportOptions);
	}

	// ----- Endpoint: cluster.state

	/**
	 * Returns a comprehensive information about the state of the cluster.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/8.15/cluster-state.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<StateResponse> state(StateRequest request) {
		@SuppressWarnings("unchecked")
		JsonEndpoint<StateRequest, StateResponse, ErrorResponse> endpoint = (JsonEndpoint<StateRequest, StateResponse, ErrorResponse>) StateRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
	}

	/**
	 * Returns a comprehensive information about the state of the cluster.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link StateRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/8.15/cluster-state.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<StateResponse> state(
			Function<StateRequest.Builder, ObjectBuilder<StateRequest>> fn) {
		return state(fn.apply(new StateRequest.Builder()).build());
	}

	/**
	 * Returns a comprehensive information about the state of the cluster.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/8.15/cluster-state.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<StateResponse> state() {
		return this.transport.performRequestAsync(new StateRequest.Builder().build(), StateRequest._ENDPOINT,
				this.transportOptions);
	}

	// ----- Endpoint: cluster.stats

	/**
	 * Returns cluster statistics. It returns basic index metrics (shard numbers,
	 * store size, memory usage) and information about the current nodes that form
	 * the cluster (number, roles, os, jvm versions, memory usage, cpu and installed
	 * plugins).
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/8.15/cluster-stats.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<ClusterStatsResponse> stats(ClusterStatsRequest request) {
		@SuppressWarnings("unchecked")
		JsonEndpoint<ClusterStatsRequest, ClusterStatsResponse, ErrorResponse> endpoint = (JsonEndpoint<ClusterStatsRequest, ClusterStatsResponse, ErrorResponse>) ClusterStatsRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
	}

	/**
	 * Returns cluster statistics. It returns basic index metrics (shard numbers,
	 * store size, memory usage) and information about the current nodes that form
	 * the cluster (number, roles, os, jvm versions, memory usage, cpu and installed
	 * plugins).
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link ClusterStatsRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/8.15/cluster-stats.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<ClusterStatsResponse> stats(
			Function<ClusterStatsRequest.Builder, ObjectBuilder<ClusterStatsRequest>> fn) {
		return stats(fn.apply(new ClusterStatsRequest.Builder()).build());
	}

	/**
	 * Returns cluster statistics. It returns basic index metrics (shard numbers,
	 * store size, memory usage) and information about the current nodes that form
	 * the cluster (number, roles, os, jvm versions, memory usage, cpu and installed
	 * plugins).
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/8.15/cluster-stats.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<ClusterStatsResponse> stats() {
		return this.transport.performRequestAsync(new ClusterStatsRequest.Builder().build(),
				ClusterStatsRequest._ENDPOINT, this.transportOptions);
	}

}
