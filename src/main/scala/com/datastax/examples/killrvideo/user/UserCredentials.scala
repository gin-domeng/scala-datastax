/*
 * Copyright DataStax, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.datastax.examples.killrvideo.user

import com.datastax.oss.driver.api.mapper.annotations.{Entity, PartitionKey}

import java.util.UUID
import scala.annotation.meta.field

@Entity
case class UserCredentials(@(PartitionKey@field) email: String,
                           password: String,
                           userid: UUID)
