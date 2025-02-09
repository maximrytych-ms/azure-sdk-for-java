// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.appservice.models.ProxyOnlyResource;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Publishing Credentials Policies parameters. */
@Fluent
public final class CsmPublishingCredentialsPoliciesEntityInner extends ProxyOnlyResource {
    /*
     * CsmPublishingCredentialsPoliciesEntity resource specific properties
     */
    @JsonProperty(value = "properties")
    private CsmPublishingCredentialsPoliciesEntityProperties innerProperties;

    /** Creates an instance of CsmPublishingCredentialsPoliciesEntityInner class. */
    public CsmPublishingCredentialsPoliciesEntityInner() {
    }

    /**
     * Get the innerProperties property: CsmPublishingCredentialsPoliciesEntity resource specific properties.
     *
     * @return the innerProperties value.
     */
    private CsmPublishingCredentialsPoliciesEntityProperties innerProperties() {
        return this.innerProperties;
    }

    /** {@inheritDoc} */
    @Override
    public CsmPublishingCredentialsPoliciesEntityInner withKind(String kind) {
        super.withKind(kind);
        return this;
    }

    /**
     * Get the allow property: &lt;code&gt;true&lt;/code&gt; to allow access to a publishing method; otherwise,
     * &lt;code&gt;false&lt;/code&gt;.
     *
     * @return the allow value.
     */
    public Boolean allow() {
        return this.innerProperties() == null ? null : this.innerProperties().allow();
    }

    /**
     * Set the allow property: &lt;code&gt;true&lt;/code&gt; to allow access to a publishing method; otherwise,
     * &lt;code&gt;false&lt;/code&gt;.
     *
     * @param allow the allow value to set.
     * @return the CsmPublishingCredentialsPoliciesEntityInner object itself.
     */
    public CsmPublishingCredentialsPoliciesEntityInner withAllow(Boolean allow) {
        if (this.innerProperties() == null) {
            this.innerProperties = new CsmPublishingCredentialsPoliciesEntityProperties();
        }
        this.innerProperties().withAllow(allow);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }
}
