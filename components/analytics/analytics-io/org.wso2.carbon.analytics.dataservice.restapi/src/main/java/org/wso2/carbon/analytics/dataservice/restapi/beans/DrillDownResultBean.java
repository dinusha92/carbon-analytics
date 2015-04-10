/*
 * Copyright (c) 2015, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
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

package org.wso2.carbon.analytics.dataservice.restapi.beans;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import java.util.Map;

/**
 * This class represents the bean class for results of a drilldown request.
 */

@XmlAccessorType(XmlAccessType.FIELD)
public class DrillDownResultBean {
    @XmlElement(name = "drillDownResult")
    private Map<String, DrillDownPerFieldResultBean> perFieldResults;

    public Map<String, DrillDownPerFieldResultBean> getPerFieldResults() {
        return perFieldResults;
    }

    public void setPerFieldResults(Map<String, DrillDownPerFieldResultBean> perFieldResults) {
        this.perFieldResults = perFieldResults;
    }
}
