// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.iotfirmwaredefense.generated;

/** Samples for Firmware ListGenerateCveList. */
public final class FirmwareListGenerateCveListSamples {
    /*
     * x-ms-original-file: specification/fist/resource-manager/Microsoft.IoTFirmwareDefense/preview/2023-02-08-preview/examples/Firmware_ListGenerateCveList_MaximumSet_Gen.json
     */
    /**
     * Sample code: Firmware_ListGenerateCveList_MaximumSet_Gen.
     *
     * @param manager Entry point to IoTFirmwareDefenseManager.
     */
    public static void firmwareListGenerateCveListMaximumSetGen(
        com.azure.resourcemanager.iotfirmwaredefense.IoTFirmwareDefenseManager manager) {
        manager
            .firmwares()
            .listGenerateCveList("rgworkspaces-firmwares", "A7", "umrkdttp", com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: specification/fist/resource-manager/Microsoft.IoTFirmwareDefense/preview/2023-02-08-preview/examples/Firmware_ListGenerateCveList_MinimumSet_Gen.json
     */
    /**
     * Sample code: Firmware_ListGenerateCveList_MinimumSet_Gen.
     *
     * @param manager Entry point to IoTFirmwareDefenseManager.
     */
    public static void firmwareListGenerateCveListMinimumSetGen(
        com.azure.resourcemanager.iotfirmwaredefense.IoTFirmwareDefenseManager manager) {
        manager
            .firmwares()
            .listGenerateCveList("rgworkspaces-firmwares", "A7", "umrkdttp", com.azure.core.util.Context.NONE);
    }
}
