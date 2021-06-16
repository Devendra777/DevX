package com.xworkz.bluetooth.service;

import com.xworkz.bluetooth.dao.BluetoothDAO;
import com.xworkz.bluetooth.dao.BluetoothDAOImpl;
import com.xworkz.bluetooth.dto.BluetoothSpeakerDTO;

// Service layer -  Business logic /Validation
public class BluetoothSpeakerServiceImpl implements BluetoothSpeakerService {

	// Has a Relationship
	private BluetoothDAO bluetoothDAO;

	public BluetoothSpeakerServiceImpl() {
		// TODO Auto-generated constructor stub
		bluetoothDAO = new BluetoothDAOImpl();

	}

	@Override
	public void validateAndSave(BluetoothSpeakerDTO bluetoothSpeakerDTO) {

		if (bluetoothSpeakerDTO != null) {
			if (bluetoothSpeakerDTO.getRange() != null) {
				bluetoothDAO.save(bluetoothSpeakerDTO);
			}

		}

	}

	@Override
	public BluetoothSpeakerDTO getBlueToothById(int id) {
		if (id > 0) {
			return bluetoothDAO.getBlueToothById(id);
		}
		return null;
	}

	@Override
	public void updateCompanyByBluetoothName(String bluetoothName, String company) {
		// TODO Auto-generated method stub
		if(bluetoothName != null && company != null)
		{
			bluetoothDAO.updateCompanyByBluetoothName(bluetoothName , company);
		}
	}

}
