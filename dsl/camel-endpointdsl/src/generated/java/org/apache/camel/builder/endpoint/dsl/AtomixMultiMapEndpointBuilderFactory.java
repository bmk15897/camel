/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.camel.builder.endpoint.dsl;

import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.stream.*;
import javax.annotation.Generated;
import org.apache.camel.builder.EndpointConsumerBuilder;
import org.apache.camel.builder.EndpointProducerBuilder;
import org.apache.camel.builder.endpoint.AbstractEndpointBuilder;

/**
 * Access Atomix's distributed multi map.
 * 
 * Generated by camel build tools - do NOT edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public interface AtomixMultiMapEndpointBuilderFactory {


    /**
     * Builder for endpoint for the Atomix MultiMap component.
     */
    public interface AtomixMultiMapEndpointBuilder
            extends
                EndpointProducerBuilder {
        default AdvancedAtomixMultiMapEndpointBuilder advanced() {
            return (AdvancedAtomixMultiMapEndpointBuilder) this;
        }
        /**
         * The Atomix instance to use.
         * 
         * The option is a: &lt;code&gt;io.atomix.Atomix&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param atomix the value to set
         * @return the dsl builder
         */
        default AtomixMultiMapEndpointBuilder atomix(io.atomix.Atomix atomix) {
            doSetProperty("atomix", atomix);
            return this;
        }
        /**
         * The Atomix instance to use.
         * 
         * The option will be converted to a
         * &lt;code&gt;io.atomix.Atomix&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param atomix the value to set
         * @return the dsl builder
         */
        default AtomixMultiMapEndpointBuilder atomix(String atomix) {
            doSetProperty("atomix", atomix);
            return this;
        }
        /**
         * The Atomix configuration uri.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param configurationUri the value to set
         * @return the dsl builder
         */
        default AtomixMultiMapEndpointBuilder configurationUri(
                String configurationUri) {
            doSetProperty("configurationUri", configurationUri);
            return this;
        }
        /**
         * The default action.
         * 
         * The option is a:
         * &lt;code&gt;org.apache.camel.component.atomix.client.multimap.AtomixMultiMap.Action&lt;/code&gt; type.
         * 
         * Default: PUT
         * Group: producer
         * 
         * @param defaultAction the value to set
         * @return the dsl builder
         */
        default AtomixMultiMapEndpointBuilder defaultAction(
                org.apache.camel.component.atomix.client.multimap.AtomixMultiMap.Action defaultAction) {
            doSetProperty("defaultAction", defaultAction);
            return this;
        }
        /**
         * The default action.
         * 
         * The option will be converted to a
         * &lt;code&gt;org.apache.camel.component.atomix.client.multimap.AtomixMultiMap.Action&lt;/code&gt; type.
         * 
         * Default: PUT
         * Group: producer
         * 
         * @param defaultAction the value to set
         * @return the dsl builder
         */
        default AtomixMultiMapEndpointBuilder defaultAction(String defaultAction) {
            doSetProperty("defaultAction", defaultAction);
            return this;
        }
        /**
         * The key to use if none is set in the header or to listen for events
         * for a specific key.
         * 
         * The option is a: &lt;code&gt;java.lang.Object&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param key the value to set
         * @return the dsl builder
         */
        default AtomixMultiMapEndpointBuilder key(Object key) {
            doSetProperty("key", key);
            return this;
        }
        /**
         * The key to use if none is set in the header or to listen for events
         * for a specific key.
         * 
         * The option will be converted to a
         * &lt;code&gt;java.lang.Object&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param key the value to set
         * @return the dsl builder
         */
        default AtomixMultiMapEndpointBuilder key(String key) {
            doSetProperty("key", key);
            return this;
        }
        /**
         * Whether the producer should be started lazy (on the first message).
         * By starting lazy you can use this to allow CamelContext and routes to
         * startup in situations where a producer may otherwise fail during
         * starting and cause the route to fail being started. By deferring this
         * startup to be lazy then the startup failure can be handled during
         * routing messages via Camel's routing error handlers. Beware that when
         * the first message is processed then creating and starting the
         * producer may take a little time and prolong the total processing time
         * of the processing.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: false
         * Group: producer
         * 
         * @param lazyStartProducer the value to set
         * @return the dsl builder
         */
        default AtomixMultiMapEndpointBuilder lazyStartProducer(
                boolean lazyStartProducer) {
            doSetProperty("lazyStartProducer", lazyStartProducer);
            return this;
        }
        /**
         * Whether the producer should be started lazy (on the first message).
         * By starting lazy you can use this to allow CamelContext and routes to
         * startup in situations where a producer may otherwise fail during
         * starting and cause the route to fail being started. By deferring this
         * startup to be lazy then the startup failure can be handled during
         * routing messages via Camel's routing error handlers. Beware that when
         * the first message is processed then creating and starting the
         * producer may take a little time and prolong the total processing time
         * of the processing.
         * 
         * The option will be converted to a &lt;code&gt;boolean&lt;/code&gt;
         * type.
         * 
         * Default: false
         * Group: producer
         * 
         * @param lazyStartProducer the value to set
         * @return the dsl builder
         */
        default AtomixMultiMapEndpointBuilder lazyStartProducer(
                String lazyStartProducer) {
            doSetProperty("lazyStartProducer", lazyStartProducer);
            return this;
        }
        /**
         * The address of the nodes composing the cluster.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param nodes the value to set
         * @return the dsl builder
         */
        default AtomixMultiMapEndpointBuilder nodes(String nodes) {
            doSetProperty("nodes", nodes);
            return this;
        }
        /**
         * The header that wil carry the result.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param resultHeader the value to set
         * @return the dsl builder
         */
        default AtomixMultiMapEndpointBuilder resultHeader(String resultHeader) {
            doSetProperty("resultHeader", resultHeader);
            return this;
        }
        /**
         * The class name (fqn) of the Atomix transport.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Default: io.atomix.catalyst.transport.netty.NettyTransport
         * Group: producer
         * 
         * @param transportClassName the value to set
         * @return the dsl builder
         */
        default AtomixMultiMapEndpointBuilder transportClassName(
                String transportClassName) {
            doSetProperty("transportClassName", transportClassName);
            return this;
        }
        /**
         * The resource ttl.
         * 
         * The option is a: &lt;code&gt;long&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param ttl the value to set
         * @return the dsl builder
         */
        default AtomixMultiMapEndpointBuilder ttl(long ttl) {
            doSetProperty("ttl", ttl);
            return this;
        }
        /**
         * The resource ttl.
         * 
         * The option will be converted to a &lt;code&gt;long&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param ttl the value to set
         * @return the dsl builder
         */
        default AtomixMultiMapEndpointBuilder ttl(String ttl) {
            doSetProperty("ttl", ttl);
            return this;
        }
    }

    /**
     * Advanced builder for endpoint for the Atomix MultiMap component.
     */
    public interface AdvancedAtomixMultiMapEndpointBuilder
            extends
                EndpointProducerBuilder {
        default AtomixMultiMapEndpointBuilder basic() {
            return (AtomixMultiMapEndpointBuilder) this;
        }
        /**
         * The cluster wide default resource configuration.
         * 
         * The option is a: &lt;code&gt;java.util.Properties&lt;/code&gt; type.
         * 
         * Group: advanced
         * 
         * @param defaultResourceConfig the value to set
         * @return the dsl builder
         */
        default AdvancedAtomixMultiMapEndpointBuilder defaultResourceConfig(
                Properties defaultResourceConfig) {
            doSetProperty("defaultResourceConfig", defaultResourceConfig);
            return this;
        }
        /**
         * The cluster wide default resource configuration.
         * 
         * The option will be converted to a
         * &lt;code&gt;java.util.Properties&lt;/code&gt; type.
         * 
         * Group: advanced
         * 
         * @param defaultResourceConfig the value to set
         * @return the dsl builder
         */
        default AdvancedAtomixMultiMapEndpointBuilder defaultResourceConfig(
                String defaultResourceConfig) {
            doSetProperty("defaultResourceConfig", defaultResourceConfig);
            return this;
        }
        /**
         * The local default resource options.
         * 
         * The option is a: &lt;code&gt;java.util.Properties&lt;/code&gt; type.
         * 
         * Group: advanced
         * 
         * @param defaultResourceOptions the value to set
         * @return the dsl builder
         */
        default AdvancedAtomixMultiMapEndpointBuilder defaultResourceOptions(
                Properties defaultResourceOptions) {
            doSetProperty("defaultResourceOptions", defaultResourceOptions);
            return this;
        }
        /**
         * The local default resource options.
         * 
         * The option will be converted to a
         * &lt;code&gt;java.util.Properties&lt;/code&gt; type.
         * 
         * Group: advanced
         * 
         * @param defaultResourceOptions the value to set
         * @return the dsl builder
         */
        default AdvancedAtomixMultiMapEndpointBuilder defaultResourceOptions(
                String defaultResourceOptions) {
            doSetProperty("defaultResourceOptions", defaultResourceOptions);
            return this;
        }
        /**
         * Sets if the local member should join groups as PersistentMember or
         * not. If set to ephemeral the local member will receive an auto
         * generated ID thus the local one is ignored.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: false
         * Group: advanced
         * 
         * @param ephemeral the value to set
         * @return the dsl builder
         */
        default AdvancedAtomixMultiMapEndpointBuilder ephemeral(
                boolean ephemeral) {
            doSetProperty("ephemeral", ephemeral);
            return this;
        }
        /**
         * Sets if the local member should join groups as PersistentMember or
         * not. If set to ephemeral the local member will receive an auto
         * generated ID thus the local one is ignored.
         * 
         * The option will be converted to a &lt;code&gt;boolean&lt;/code&gt;
         * type.
         * 
         * Default: false
         * Group: advanced
         * 
         * @param ephemeral the value to set
         * @return the dsl builder
         */
        default AdvancedAtomixMultiMapEndpointBuilder ephemeral(String ephemeral) {
            doSetProperty("ephemeral", ephemeral);
            return this;
        }
        /**
         * The read consistency level.
         * 
         * The option is a:
         * &lt;code&gt;io.atomix.resource.ReadConsistency&lt;/code&gt; type.
         * 
         * Group: advanced
         * 
         * @param readConsistency the value to set
         * @return the dsl builder
         */
        default AdvancedAtomixMultiMapEndpointBuilder readConsistency(
                io.atomix.resource.ReadConsistency readConsistency) {
            doSetProperty("readConsistency", readConsistency);
            return this;
        }
        /**
         * The read consistency level.
         * 
         * The option will be converted to a
         * &lt;code&gt;io.atomix.resource.ReadConsistency&lt;/code&gt; type.
         * 
         * Group: advanced
         * 
         * @param readConsistency the value to set
         * @return the dsl builder
         */
        default AdvancedAtomixMultiMapEndpointBuilder readConsistency(
                String readConsistency) {
            doSetProperty("readConsistency", readConsistency);
            return this;
        }
        /**
         * Cluster wide resources configuration.
         * 
         * The option is a: &lt;code&gt;java.util.Map&amp;lt;java.lang.String,
         * java.util.Properties&amp;gt;&lt;/code&gt; type.
         * 
         * Group: advanced
         * 
         * @param resourceConfigs the value to set
         * @return the dsl builder
         */
        default AdvancedAtomixMultiMapEndpointBuilder resourceConfigs(
                Map<java.lang.String, java.util.Properties> resourceConfigs) {
            doSetProperty("resourceConfigs", resourceConfigs);
            return this;
        }
        /**
         * Cluster wide resources configuration.
         * 
         * The option will be converted to a
         * &lt;code&gt;java.util.Map&amp;lt;java.lang.String,
         * java.util.Properties&amp;gt;&lt;/code&gt; type.
         * 
         * Group: advanced
         * 
         * @param resourceConfigs the value to set
         * @return the dsl builder
         */
        default AdvancedAtomixMultiMapEndpointBuilder resourceConfigs(
                String resourceConfigs) {
            doSetProperty("resourceConfigs", resourceConfigs);
            return this;
        }
        /**
         * Local resources configurations.
         * 
         * The option is a: &lt;code&gt;java.util.Map&amp;lt;java.lang.String,
         * java.util.Properties&amp;gt;&lt;/code&gt; type.
         * 
         * Group: advanced
         * 
         * @param resourceOptions the value to set
         * @return the dsl builder
         */
        default AdvancedAtomixMultiMapEndpointBuilder resourceOptions(
                Map<java.lang.String, java.util.Properties> resourceOptions) {
            doSetProperty("resourceOptions", resourceOptions);
            return this;
        }
        /**
         * Local resources configurations.
         * 
         * The option will be converted to a
         * &lt;code&gt;java.util.Map&amp;lt;java.lang.String,
         * java.util.Properties&amp;gt;&lt;/code&gt; type.
         * 
         * Group: advanced
         * 
         * @param resourceOptions the value to set
         * @return the dsl builder
         */
        default AdvancedAtomixMultiMapEndpointBuilder resourceOptions(
                String resourceOptions) {
            doSetProperty("resourceOptions", resourceOptions);
            return this;
        }
    }

    public interface AtomixMultiMapBuilders {
        /**
         * Atomix MultiMap (camel-atomix)
         * Access Atomix's distributed multi map.
         * 
         * Category: clustering
         * Since: 2.20
         * Maven coordinates: org.apache.camel:camel-atomix
         * 
         * Syntax: <code>atomix-multimap:resourceName</code>
         * 
         * Path parameter: resourceName (required)
         * The distributed resource name
         * 
         * @param path resourceName
         * @return the dsl builder
         */
        default AtomixMultiMapEndpointBuilder atomixMultimap(String path) {
            return AtomixMultiMapEndpointBuilderFactory.endpointBuilder("atomix-multimap", path);
        }
        /**
         * Atomix MultiMap (camel-atomix)
         * Access Atomix's distributed multi map.
         * 
         * Category: clustering
         * Since: 2.20
         * Maven coordinates: org.apache.camel:camel-atomix
         * 
         * Syntax: <code>atomix-multimap:resourceName</code>
         * 
         * Path parameter: resourceName (required)
         * The distributed resource name
         * 
         * @param componentName to use a custom component name for the endpoint
         * instead of the default name
         * @param path resourceName
         * @return the dsl builder
         */
        default AtomixMultiMapEndpointBuilder atomixMultimap(
                String componentName,
                String path) {
            return AtomixMultiMapEndpointBuilderFactory.endpointBuilder(componentName, path);
        }
    }
    static AtomixMultiMapEndpointBuilder endpointBuilder(
            String componentName,
            String path) {
        class AtomixMultiMapEndpointBuilderImpl extends AbstractEndpointBuilder implements AtomixMultiMapEndpointBuilder, AdvancedAtomixMultiMapEndpointBuilder {
            public AtomixMultiMapEndpointBuilderImpl(String path) {
                super(componentName, path);
            }
        }
        return new AtomixMultiMapEndpointBuilderImpl(path);
    }
}