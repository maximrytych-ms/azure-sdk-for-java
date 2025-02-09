// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.netapp.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.netapp.models.EndpointType;
import com.azure.resourcemanager.netapp.models.ReplicationObject;
import com.azure.resourcemanager.netapp.models.ReplicationSchedule;
import org.junit.jupiter.api.Assertions;

public final class ReplicationObjectTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ReplicationObject model =
            BinaryData
                .fromString(
                    "{\"replicationId\":\"btdzumveekg\",\"endpointType\":\"src\",\"replicationSchedule\":\"daily\",\"remoteVolumeResourceId\":\"hkfpbs\",\"remoteVolumeRegion\":\"ofd\"}")
                .toObject(ReplicationObject.class);
        Assertions.assertEquals("btdzumveekg", model.replicationId());
        Assertions.assertEquals(EndpointType.SRC, model.endpointType());
        Assertions.assertEquals(ReplicationSchedule.DAILY, model.replicationSchedule());
        Assertions.assertEquals("hkfpbs", model.remoteVolumeResourceId());
        Assertions.assertEquals("ofd", model.remoteVolumeRegion());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ReplicationObject model =
            new ReplicationObject()
                .withReplicationId("btdzumveekg")
                .withEndpointType(EndpointType.SRC)
                .withReplicationSchedule(ReplicationSchedule.DAILY)
                .withRemoteVolumeResourceId("hkfpbs")
                .withRemoteVolumeRegion("ofd");
        model = BinaryData.fromObject(model).toObject(ReplicationObject.class);
        Assertions.assertEquals("btdzumveekg", model.replicationId());
        Assertions.assertEquals(EndpointType.SRC, model.endpointType());
        Assertions.assertEquals(ReplicationSchedule.DAILY, model.replicationSchedule());
        Assertions.assertEquals("hkfpbs", model.remoteVolumeResourceId());
        Assertions.assertEquals("ofd", model.remoteVolumeRegion());
    }
}
