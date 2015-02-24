/*
*  Copyright (c) 2005-2014, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
*
*  WSO2 Inc. licenses this file to you under the Apache License,
*  Version 2.0 (the "License"); you may not use this file except
*  in compliance with the License.
*  You may obtain a copy of the License at
*
*    http://www.apache.org/licenses/LICENSE-2.0
*
* Unless required by applicable law or agreed to in writing,
* software distributed under the License is distributed on an
* "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
* KIND, either express or implied.  See the License for the
* specific language governing permissions and limitations
* under the License.
*/
package org.wso2.carbon.event.notifier.core;


import org.wso2.carbon.event.notifier.core.config.EndpointAdaptorConfiguration;
import org.wso2.carbon.event.notifier.core.config.EventNotifierConfiguration;

import java.util.List;

/**
 * OSGI interface for the EventAdaptor Service
 */

public interface OutputEventAdaptorService {


    /**
     * this method returns all the available event adaptor types. UI use this details to
     * show the types and the properties to be set to the user when creating the
     * event adaptor objects.
     *
     * @return list of available types
     */
    List<OutputEventAdaptorDto> getEventAdaptors();

    /**
     * publishes the message using the given event adaptor to the given topic.
     *
     * @param eventNotifierName - name of the event adaptor
     * @param object                 - message to send
     * @param tenantId
     */
    void publish(String eventNotifierName,
                 Object object, int tenantId);


    void publish(EndpointAdaptorConfiguration endpointAdaptorConfiguration,
                 Object object, int tenantId);

    /**
     * publish testConnection message using the given event adaptor.
     *
     * @param endpointAdaptorConfiguration - Configuration Details of the event adaptor
     */
    void testConnection(EndpointAdaptorConfiguration endpointAdaptorConfiguration);


    /**
     * This method returns the event adaptor dto for a specific event adaptor type
     *
     * @param eventAdaptorType
     * @return
     */
    OutputEventAdaptorDto getEventAdaptorDto(String eventAdaptorType);


    void removeConnectionInfo(
            EndpointAdaptorConfiguration endpointAdaptorConfiguration, int tenantId);


}
