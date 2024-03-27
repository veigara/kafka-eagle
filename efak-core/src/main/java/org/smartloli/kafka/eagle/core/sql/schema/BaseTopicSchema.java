/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.smartloli.kafka.eagle.core.sql.schema;

/**
 * Defined the schema of a topic.
 * 
 * @author smartloli.
 *
 *         Created by Sep 29, 2017
 */
public class BaseTopicSchema {

	/** Offset generated by a consumer topic message. */
	public static final String OFFSET = "offset";
	/** Topic include partition id. */
	public static final String PARTITION = "partition";
	/** Topic message content. */
	public static final String MSG = "msg";
	/** Topic message content timespan. */
	public static final String TIMESPAN = "timespan";
	/** Topic message content date. */
	public static final String DATE = "date";

}
