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
package io.micronaut.kubernetes.client.v1.configmaps;

import io.micronaut.core.annotation.Introspected;

/**
 * Represents a ConfigMap watch event returned from the Kubernetes API.
 *
 * @author Álvaro Sánchez-Mariscal
 * @since 1.0.0
 */
@Introspected
public class ConfigMapWatchEvent {

    private EventType type;
    private ConfigMap object;

    /**
     * The default constructor.
     */
    public ConfigMapWatchEvent() {
    }

    /**
     * @param type the event type
     */
    public ConfigMapWatchEvent(EventType type) {
        this.type = type;
    }

    /**
     * @return the {@link EventType}
     */
    public EventType getType() {
        return type;
    }

    /**
     * @param type the {@link EventType}
     */
    public void setType(EventType type) {
        this.type = type;
    }

    /**
     * @return the {@link ConfigMap} object
     */
    public ConfigMap getObject() {
        return object;
    }

    /**
     * @param object the {@link ConfigMap} object
     */
    public void setObject(ConfigMap object) {
        this.object = object;
    }

    /**
     * The type of the event occurred.
     */
    public enum EventType {
        ADDED, MODIFIED, DELETED, ERROR
    }

    @Override
    public String toString() {
        return "ConfigMapWatchEvent{" +
                "type=" + type +
                ", object=" + object +
                '}';
    }
}
