/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.seatunnel.scheduler.dolphinscheduler.dto;

import lombok.Data;

import java.util.Map;

@Data
public class ResourceDto {
    private int id;
    private int pid;

    public static ResourceDto fromMap(Map<String, Object> map) {
        final ResourceDto dto = new ResourceDto();
        dto.setId((Integer) map.get("id"));
        dto.setPid((Integer) map.get("pid"));
        return dto;
    }
}
