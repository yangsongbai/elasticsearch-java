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

//----------------------------------------------------
// THIS CODE IS GENERATED. MANUAL EDITS WILL BE LOST.
//----------------------------------------------------

package co.elastic.clients.elasticsearch.core.get_script_context;

import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ApiTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.WithJsonObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _global.get_script_context.ContextMethodParam

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#_global.get_script_context.ContextMethodParam">API
 *      specification</a>
 */
@JsonpDeserializable
public class ContextMethodParam implements JsonpSerializable {
	private final String name;

	private final String type;

	// ---------------------------------------------------------------------------------------------

	private ContextMethodParam(Builder builder) {

		this.name = ApiTypeHelper.requireNonNull(builder.name, this, "name");
		this.type = ApiTypeHelper.requireNonNull(builder.type, this, "type");

	}

	public static ContextMethodParam of(Function<Builder, ObjectBuilder<ContextMethodParam>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code name}
	 */
	public final String name() {
		return this.name;
	}

	/**
	 * Required - API name: {@code type}
	 */
	public final String type() {
		return this.type;
	}

	/**
	 * Serialize this object to JSON.
	 */
	public void serialize(JsonGenerator generator, JsonpMapper mapper) {
		generator.writeStartObject();
		serializeInternal(generator, mapper);
		generator.writeEnd();
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		generator.writeKey("name");
		generator.write(this.name);

		generator.writeKey("type");
		generator.write(this.type);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link ContextMethodParam}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<ContextMethodParam> {
		private String name;

		private String type;

		/**
		 * Required - API name: {@code name}
		 */
		public final Builder name(String value) {
			this.name = value;
			return this;
		}

		/**
		 * Required - API name: {@code type}
		 */
		public final Builder type(String value) {
			this.type = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link ContextMethodParam}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public ContextMethodParam build() {
			_checkSingleUse();

			return new ContextMethodParam(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link ContextMethodParam}
	 */
	public static final JsonpDeserializer<ContextMethodParam> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, ContextMethodParam::setupContextMethodParamDeserializer);

	protected static void setupContextMethodParamDeserializer(ObjectDeserializer<ContextMethodParam.Builder> op) {

		op.add(Builder::name, JsonpDeserializer.stringDeserializer(), "name");
		op.add(Builder::type, JsonpDeserializer.stringDeserializer(), "type");

	}

}
