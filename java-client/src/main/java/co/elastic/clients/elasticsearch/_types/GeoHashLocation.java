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

package co.elastic.clients.elasticsearch._types;

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

// typedef: _types.GeoHashLocation

/**
 *
 * @see <a href="../doc-files/api-spec.html#_types.GeoHashLocation">API
 *      specification</a>
 */
@JsonpDeserializable
public class GeoHashLocation implements JsonpSerializable {
	private final String geohash;

	// ---------------------------------------------------------------------------------------------

	private GeoHashLocation(Builder builder) {

		this.geohash = ApiTypeHelper.requireNonNull(builder.geohash, this, "geohash");

	}

	public static GeoHashLocation of(Function<Builder, ObjectBuilder<GeoHashLocation>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code geohash}
	 */
	public final String geohash() {
		return this.geohash;
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

		generator.writeKey("geohash");
		generator.write(this.geohash);

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link GeoHashLocation}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<GeoHashLocation> {
		private String geohash;

		/**
		 * Required - API name: {@code geohash}
		 */
		public final Builder geohash(String value) {
			this.geohash = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link GeoHashLocation}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public GeoHashLocation build() {
			_checkSingleUse();

			return new GeoHashLocation(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link GeoHashLocation}
	 */
	public static final JsonpDeserializer<GeoHashLocation> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			GeoHashLocation::setupGeoHashLocationDeserializer);

	protected static void setupGeoHashLocationDeserializer(ObjectDeserializer<GeoHashLocation.Builder> op) {

		op.add(Builder::geohash, JsonpDeserializer.stringDeserializer(), "geohash");

	}

}
