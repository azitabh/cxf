/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements. See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership. The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.apache.cxf.rs.security.jose.jwk;

import org.apache.cxf.rs.security.jose.AbstractJoseObjectReaderWriter;




public class DefaultJwkReaderWriter extends AbstractJoseObjectReaderWriter
    implements JwkReaderWriter {
    @Override
    public String jwkSetToJson(JsonWebKeys jwks) {
        return toJson(jwks);
    }
    @Override
    public JsonWebKeys jsonToJwkSet(String jwksJson) {
        JsonWebKeys jwks = new JsonWebKeys();
        fromJsonInternal(jwks, jwksJson);
        return jwks;
    }
    @Override
    public String jwkToJson(JsonWebKey jwk) {
        return toJson(jwk);
    }
    @Override
    public JsonWebKey jsonToJwk(String jwkJson) {
        JsonWebKey jwk = new JsonWebKey();
        fromJsonInternal(jwk, jwkJson);
        return jwk;
    }
}
