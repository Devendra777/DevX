package com.xworkz.bluetooth.dao;

import com.xworkz.bluetooth.dto.BluetoothSpeakerDTO;

public interface BluetoothDAO {
	
	
	public void   save(BluetoothSpeakerDTO bluetoothSpeakerDTO);

	public BluetoothSpeakerDTO getBlueToothById(int id);

	public void updateCompanyByBluetoothName(String bluetoothName, String company);

}
