package com.rays.form;

import javax.validation.constraints.NotEmpty;

import com.rays.common.BaseForm;
import com.rays.dto.DeviceDTO;

public class DeviceForm extends BaseForm {

    @NotEmpty(message = "please enter DeviceSerialNumber")
    private String deviceSerialNumber;

    @NotEmpty(message = "please enter DeviceName")
    private String deviceName;

    @NotEmpty(message = "please enter DeviceType")
    private String deviceType;

    @NotEmpty(message = "please enter OperatingSystem")
    private String operatingSystem;

    public String getDeviceSerialNumber() {
        return deviceSerialNumber;
    }

    public void setDeviceSerialNumber(String deviceSerialNumber) {
        this.deviceSerialNumber = deviceSerialNumber;
    }

    public String getDeviceName() {
        return deviceName;
    }

    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }

    public String getDeviceType() {
        return deviceType;
    }

    public void setDeviceType(String deviceType) {
        this.deviceType = deviceType;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    @Override
    public DeviceDTO getDto() {

        DeviceDTO dto = initDTO(new DeviceDTO());
        dto.setDeviceSerialNumber(deviceSerialNumber);
        dto.setDeviceName(deviceName);
        dto.setDeviceType(deviceType);
        dto.setOperatingSystem(operatingSystem);

        return dto;
    }
}
