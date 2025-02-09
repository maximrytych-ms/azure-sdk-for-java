// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Properties of the FirewallPolicyNatRuleCollectionAction. */
@Fluent
public final class FirewallPolicyNatRuleCollectionAction {
    /*
     * The type of action.
     */
    @JsonProperty(value = "type")
    private FirewallPolicyNatRuleCollectionActionType type;

    /** Creates an instance of FirewallPolicyNatRuleCollectionAction class. */
    public FirewallPolicyNatRuleCollectionAction() {
    }

    /**
     * Get the type property: The type of action.
     *
     * @return the type value.
     */
    public FirewallPolicyNatRuleCollectionActionType type() {
        return this.type;
    }

    /**
     * Set the type property: The type of action.
     *
     * @param type the type value to set.
     * @return the FirewallPolicyNatRuleCollectionAction object itself.
     */
    public FirewallPolicyNatRuleCollectionAction withType(FirewallPolicyNatRuleCollectionActionType type) {
        this.type = type;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
