// Licensed to the Apache Software Foundation (ASF) under one
// or more contributor license agreements.  See the NOTICE file
// distributed with this work for additional information
// regarding copyright ownership.  The ASF licenses this file
// to you under the Apache License, Version 2.0 (the
// "License"); you may not use this file except in compliance
// with the License.  You may obtain a copy of the License at
//
//   http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing,
// software distributed under the License is distributed on an
// "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
// KIND, either express or implied.  See the License for the
// specific language governing permissions and limitations
// under the License.

package org.apache.doris.util;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class DateUtils {

    public static final DateTimeFormatter NORMAL_FORMATER =
            DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss").withZone(
                    ZoneId.systemDefault());

    public static final DateTimeFormatter NUMBER_FORMATER =
            DateTimeFormatter.ofPattern("yyyyMMddHHmmss").withZone(
                    ZoneId.systemDefault());

    public static String getFormattedNow(DateTimeFormatter formatter) {
        return formatter.format(LocalDateTime.now(ZoneId.systemDefault()));
    }

}
