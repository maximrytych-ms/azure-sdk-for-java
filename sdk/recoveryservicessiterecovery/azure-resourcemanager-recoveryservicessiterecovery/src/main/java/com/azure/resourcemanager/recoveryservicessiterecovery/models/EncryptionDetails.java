// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

/** Encryption details for the fabric. */
@Fluent
public final class EncryptionDetails {
    /*
     * The key encryption key state for the Vmm.
     */
    @JsonProperty(value = "kekState")
    private String kekState;

    /*
     * The key encryption key certificate thumbprint.
     */
    @JsonProperty(value = "kekCertThumbprint")
    private String kekCertThumbprint;

    /*
     * The key encryption key certificate expiry date.
     */
    @JsonProperty(value = "kekCertExpiryDate")
    private OffsetDateTime kekCertExpiryDate;

    /** Creates an instance of EncryptionDetails class. */
    public EncryptionDetails() {
    }

    /**
     * Get the kekState property: The key encryption key state for the Vmm.
     *
     * @return the kekState value.
     */
    public String kekState() {
        return this.kekState;
    }

    /**
     * Set the kekState property: The key encryption key state for the Vmm.
     *
     * @param kekState the kekState value to set.
     * @return the EncryptionDetails object itself.
     */
    public EncryptionDetails withKekState(String kekState) {
        this.kekState = kekState;
        return this;
    }

    /**
     * Get the kekCertThumbprint property: The key encryption key certificate thumbprint.
     *
     * @return the kekCertThumbprint value.
     */
    public String kekCertThumbprint() {
        return this.kekCertThumbprint;
    }

    /**
     * Set the kekCertThumbprint property: The key encryption key certificate thumbprint.
     *
     * @param kekCertThumbprint the kekCertThumbprint value to set.
     * @return the EncryptionDetails object itself.
     */
    public EncryptionDetails withKekCertThumbprint(String kekCertThumbprint) {
        this.kekCertThumbprint = kekCertThumbprint;
        return this;
    }

    /**
     * Get the kekCertExpiryDate property: The key encryption key certificate expiry date.
     *
     * @return the kekCertExpiryDate value.
     */
    public OffsetDateTime kekCertExpiryDate() {
        return this.kekCertExpiryDate;
    }

    /**
     * Set the kekCertExpiryDate property: The key encryption key certificate expiry date.
     *
     * @param kekCertExpiryDate the kekCertExpiryDate value to set.
     * @return the EncryptionDetails object itself.
     */
    public EncryptionDetails withKekCertExpiryDate(OffsetDateTime kekCertExpiryDate) {
        this.kekCertExpiryDate = kekCertExpiryDate;
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
