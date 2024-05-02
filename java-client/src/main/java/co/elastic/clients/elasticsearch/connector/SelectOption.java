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

package co.elastic.clients.elasticsearch.connector;

import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.JsonpUtils;
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

// typedef: connector._types.SelectOption

/**
 *
 * @see <a href="../doc-files/api-spec.html#connector._types.SelectOption">API
 *      specification</a>
 */
@JsonpDeserializable
public class SelectOption implements JsonpSerializable {
	private final String label;

	private final String value;

	// ---------------------------------------------------------------------------------------------

	private SelectOption(Builder builder) {

		this.label = ApiTypeHelper.requireNonNull(builder.label, this, "label");
		this.value = ApiTypeHelper.requireNonNull(builder.value, this, "value");

	}

	public static SelectOption of(Function<Builder, ObjectBuilder<SelectOption>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code label}
	 */
	public final String label() {
		return this.label;
	}

	/**
	 * Required - API name: {@code value}
	 */
	public final String value() {
		return this.value;
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

		generator.writeKey("label");
		generator.write(this.label);

		generator.writeKey("value");
		generator.write(this.value);

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link SelectOption}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<SelectOption> {
		private String label;

		private String value;

		/**
		 * Required - API name: {@code label}
		 */
		public final Builder label(String value) {
			this.label = value;
			return this;
		}

		/**
		 * Required - API name: {@code value}
		 */
		public final Builder value(String value) {
			this.value = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link SelectOption}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public SelectOption build() {
			_checkSingleUse();

			return new SelectOption(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link SelectOption}
	 */
	public static final JsonpDeserializer<SelectOption> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			SelectOption::setupSelectOptionDeserializer);

	protected static void setupSelectOptionDeserializer(ObjectDeserializer<SelectOption.Builder> op) {

		op.add(Builder::label, JsonpDeserializer.stringDeserializer(), "label");
		op.add(Builder::value, JsonpDeserializer.stringDeserializer(), "value");

	}

}
