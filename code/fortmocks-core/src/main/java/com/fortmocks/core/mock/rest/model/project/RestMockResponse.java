/*
 * Copyright 2015 Karl Dahlgren
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.fortmocks.core.mock.rest.model.project;

import com.fortmocks.core.base.model.Saveable;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author Karl Dahlgren
 * @since 1.0
 */
@XmlRootElement
public class RestMockResponse implements Saveable<Long> {

    private Long id;
    private String name;
    private String body;
    private RestMockResponseStatus restMockResponseStatus;

    @Override
    @XmlElement
    public Long getId() {
        return id;
    }

    @Override
    public void setId(Long id) {
        this.id = id;
    }

    @XmlElement
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @XmlElement
    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    @XmlElement
    public RestMockResponseStatus getRestMockResponseStatus() {
        return restMockResponseStatus;
    }

    public void setRestMockResponseStatus(RestMockResponseStatus restMockResponseStatus) {
        this.restMockResponseStatus = restMockResponseStatus;
    }
}
