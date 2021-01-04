/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.dtstack.flinkx.metadatahbase.inputformat;

import com.dtstack.flinkx.metadata.inputformat.MetadataInputFormatBuilder;

import java.util.Map;

/** 帮助配置hbase读取参数
 * @author kunni@dtstack.com
 */
public class MetadatahbaseInputformatBuilder extends MetadataInputFormatBuilder {

    protected MetadatahbaseInputformat format;

    public MetadatahbaseInputformatBuilder(MetadatahbaseInputformat format) {
        super(format);
        this.format = format;
    }

    public void setHadoopConfig(Map<String, Object> hadoopConfig){
        format.setHadoopConfig(hadoopConfig);
    }

    public void setPath(String path){
        format.setPath(path);
    }

    @Override
    protected void checkFormat() {
    }
}
