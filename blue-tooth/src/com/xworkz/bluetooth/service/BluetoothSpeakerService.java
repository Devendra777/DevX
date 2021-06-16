package com.xworkz.bluetooth.service;

import com.xworkz.bluetooth.dto.BluetoothSpeakerDTO;

public interface BluetoothSpeakerService {

	public void validateAndSave(BluetoothSpeakerDTO bluetoothSpeakerDTO);

	public BluetoothSpeakerDTO getBlueToothById(int id);

	public void updateCompanyByBluetoothName(String bluetoothName, String company);

}
