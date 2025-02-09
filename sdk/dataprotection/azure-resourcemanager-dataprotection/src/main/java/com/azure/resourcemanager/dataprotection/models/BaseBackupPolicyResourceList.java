// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.dataprotection.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.dataprotection.fluent.models.BaseBackupPolicyResourceInner;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * BaseBackupPolicyResourceList
 *
 * <p>List of BaseBackupPolicy resources.
 */
@Fluent
public final class BaseBackupPolicyResourceList extends DppResourceList {
    /*
     * List of resources.
     */
    @JsonProperty(value = "value")
    private List<BaseBackupPolicyResourceInner> value;

    /** Creates an instance of BaseBackupPolicyResourceList class. */
    public BaseBackupPolicyResourceList() {
    }

    /**
     * Get the value property: List of resources.
     *
     * @return the value value.
     */
    public List<BaseBackupPolicyResourceInner> value() {
        return this.value;
    }

    /**
     * Set the value property: List of resources.
     *
     * @param value the value value to set.
     * @return the BaseBackupPolicyResourceList object itself.
     */
    public BaseBackupPolicyResourceList withValue(List<BaseBackupPolicyResourceInner> value) {
        this.value = value;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public BaseBackupPolicyResourceList withNextLink(String nextLink) {
        super.withNextLink(nextLink);
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
        if (value() != null) {
            value().forEach(e -> e.validate());
        }
    }
}
