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

package com.fortmocks.war.mock.rest.model.event.service;

import com.fortmocks.core.base.model.TypeIdentifier;
import com.fortmocks.core.base.model.event.dto.EventDto;
import com.fortmocks.core.mock.rest.model.RestTypeIdentifier;
import com.fortmocks.core.mock.rest.model.event.RestEvent;
import com.fortmocks.core.mock.rest.model.event.dto.RestEventDto;
import com.fortmocks.war.base.model.event.service.EventServiceImpl;
import com.google.common.base.Preconditions;
import org.springframework.stereotype.Service;

/**
 * The REST event service is responsible for all the functionality related to the REST events.
 * @author Karl Dahlgren
 * @since 1.0
 */
@Service
public class RestEventServiceImpl extends EventServiceImpl<RestEvent, RestEventDto> implements RestEventService {

    private static final RestTypeIdentifier REST_TYPE_IDENTIFIER = new RestTypeIdentifier();

    /**
     * Returns the REST type identifier.
     * @return The REST identifier
     */
    @Override
    public TypeIdentifier getTypeIdentifier() {
        return REST_TYPE_IDENTIFIER;
    }

    /**
     * The method is responsible for converting an event dto instance into a event dto subclass.
     * This is used when the {@link com.fortmocks.war.base.model.project.service.ProjectServiceFacadeImpl} needs
     * to manage base event class, but wants to be able to convert it into a specific subclass, for example when
     * creating or updating a event instance.
     * @param eventDto The event dto instance that will be converted into a event dto subclass
     * @return The converted event dto subclass
     * @throws NullPointerException Throws NullPointerException in case if the provided event dto instance is null.
     * @see com.fortmocks.war.base.model.event.service.EventServiceFacade
     */
    @Override
    public RestEventDto convertType(EventDto eventDto) {
        Preconditions.checkNotNull("Event DTO cannot be null", eventDto);
        return new RestEventDto(eventDto);
    }
}

