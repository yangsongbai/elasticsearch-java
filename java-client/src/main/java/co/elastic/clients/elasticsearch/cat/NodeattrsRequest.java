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

package co.elastic.clients.elasticsearch.cat;

import co.elastic.clients.elasticsearch._types.ErrorResponse;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.transport.Endpoint;
import co.elastic.clients.transport.endpoints.SimpleEndpoint;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
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

// typedef: cat.nodeattrs.Request

/**
 * Get node attribute information. Get information about custom node attributes.
 * IMPORTANT: cat APIs are only intended for human consumption using the command
 * line or Kibana console. They are not intended for use by applications. For
 * application consumption, use the nodes info API.
 * 
 * @see <a href="../doc-files/api-spec.html#cat.nodeattrs.Request">API
 *      specification</a>
 */

public class NodeattrsRequest extends CatRequestBase {
	@Nullable
	private final Boolean local;

	// ---------------------------------------------------------------------------------------------

	private NodeattrsRequest(Builder builder) {

		this.local = builder.local;

	}

	public static NodeattrsRequest of(Function<Builder, ObjectBuilder<NodeattrsRequest>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * If <code>true</code>, the request computes the list of selected nodes from
	 * the local cluster state. If <code>false</code> the list of selected nodes are
	 * computed from the cluster state of the master node. In both cases the
	 * coordinating node will send requests for further information to each selected
	 * node.
	 * <p>
	 * API name: {@code local}
	 */
	@Nullable
	public final Boolean local() {
		return this.local;
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link NodeattrsRequest}.
	 */

	public static class Builder extends CatRequestBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<NodeattrsRequest> {
		@Nullable
		private Boolean local;

		/**
		 * If <code>true</code>, the request computes the list of selected nodes from
		 * the local cluster state. If <code>false</code> the list of selected nodes are
		 * computed from the cluster state of the master node. In both cases the
		 * coordinating node will send requests for further information to each selected
		 * node.
		 * <p>
		 * API name: {@code local}
		 */
		public final Builder local(@Nullable Boolean value) {
			this.local = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link NodeattrsRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public NodeattrsRequest build() {
			_checkSingleUse();

			return new NodeattrsRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code cat.nodeattrs}".
	 */
	public static final Endpoint<NodeattrsRequest, NodeattrsResponse, ErrorResponse> _ENDPOINT = new SimpleEndpoint<>(
			"es/cat.nodeattrs",

			// Request method
			request -> {
				return "GET";

			},

			// Request path
			request -> {
				return "/_cat/nodeattrs";

			},

			// Path parameters
			request -> {
				return Collections.emptyMap();
			},

			// Request parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				params.put("format", "json");
				if (request.local != null) {
					params.put("local", String.valueOf(request.local));
				}
				return params;

			}, SimpleEndpoint.emptyMap(), false, NodeattrsResponse._DESERIALIZER);
}
