/*
 * Copyright 2017-2020 original authors
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.micronaut.kubernetes.client.v1;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import io.micronaut.core.annotation.Introspected;

import java.net.InetAddress;

/**
 * Address object.
 *
 * @author Álvaro Sánchez-Mariscal
 * @since 1.0.0
 */
@Introspected
public class Address {

    private InetAddress ip;

    /**
     *
     * @return The IP.
     */
    @JsonDeserialize(using = InetAddressDeserializer.class)
    public InetAddress getIp() {
        return ip;
    }

    /**
     *
     * @param ip An IP
     */
    public void setIp(InetAddress ip) {
        this.ip = ip;
    }

    @Override
    public String toString() {
        return "Address{" +
                "ip=" + ip +
                '}';
    }
}
