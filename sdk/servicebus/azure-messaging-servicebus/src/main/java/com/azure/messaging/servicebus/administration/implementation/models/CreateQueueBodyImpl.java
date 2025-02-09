// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.
package com.azure.messaging.servicebus.administration.implementation.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

/** The request body for creating a queue. */
@JacksonXmlRootElement(localName = "entry", namespace = "http://www.w3.org/2005/Atom")
@Fluent
public final class CreateQueueBodyImpl {

    /*
     * QueueDescription for the new queue.
     */
    @JacksonXmlProperty(localName = "content", namespace = "http://www.w3.org/2005/Atom")
    private CreateQueueBodyContentImpl content;

    /** Creates an instance of CreateQueueBody class. */
    public CreateQueueBodyImpl() {}

    /**
     * Get the content property: QueueDescription for the new queue.
     *
     * @return the content value.
     */
    public CreateQueueBodyContentImpl getContent() {
        return this.content;
    }

    /**
     * Set the content property: QueueDescription for the new queue.
     *
     * @param content the content value to set.
     * @return the CreateQueueBody object itself.
     */
    public CreateQueueBodyImpl setContent(CreateQueueBodyContentImpl content) {
        this.content = content;
        return this;
    }
}
