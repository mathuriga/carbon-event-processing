/*
 * Copyright (c) 2015, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.wso2.carbon.event.processor.core;

import java.util.List;
import java.util.Vector;


public class ExecutionPlanConfiguration {
    private String name;
    private String description;
    private boolean isTracingEnabled;
    private boolean isStatisticsEnabled;
    private boolean isProcessingEnabled = true;
    private List<StreamConfiguration> importedStreams;
    private List<StreamConfiguration> exportedStreams;
    private String executionPlan;
    private boolean editable;

    public ExecutionPlanConfiguration() {
        importedStreams = new Vector<StreamConfiguration>();
        exportedStreams = new Vector<StreamConfiguration>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<StreamConfiguration> getImportedStreams() {
        return importedStreams;
    }

    public List<StreamConfiguration> getExportedStreams() {
        return exportedStreams;
    }

    public String getExecutionPlan() {
        return executionPlan;
    }

    public void setExecutionPlan(String executionPlan) {
        this.executionPlan = executionPlan;
    }

    public void addImportedStream(StreamConfiguration stream) {
        this.importedStreams.add(stream);
    }

    public void addExportedStream(StreamConfiguration stream) {
        this.exportedStreams.add(stream);
    }

    public boolean isTracingEnabled() {
        return isTracingEnabled;
    }

    public void setTracingEnabled(boolean tracingEnabled) {
        isTracingEnabled = tracingEnabled;
    }

    public boolean isStatisticsEnabled() {
        return isStatisticsEnabled;
    }

    public void setStatisticsEnabled(boolean statisticsEnabled) {
        isStatisticsEnabled = statisticsEnabled;
    }

    public boolean isProcessingEnabled() {
        return isProcessingEnabled;
    }

    public void setProcessingEnabled(boolean processingEnabled) {
        isProcessingEnabled = processingEnabled;
    }

    public void setEditable(boolean editable) {
        this.editable = editable;
    }

    public boolean isEditable() {
        return editable;
    }
}
