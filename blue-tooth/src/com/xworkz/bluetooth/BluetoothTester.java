package com.xworkz.bluetooth;

import com.xworkz.bluetooth.service.BluetoothSpeakerService;
import com.xworkz.bluetooth.service.BluetoothSpeakerServiceImpl;
import com.xworkz.bluetooth.dto.BluetoothSpeakerDTO;

public class BluetoothTester {

   public static void main(String[] args) {
	
	  BluetoothSpeakerDTO bluetoothSpeakerDTO = new BluetoothSpeakerDTO();
	  bluetoothSpeakerDTO.setBluetoothId(4);
	  bluetoothSpeakerDTO.setCompanyName("One-plus");
	  bluetoothSpeakerDTO.setBluetoothName("Oneplus Bullets Wireless");
	  bluetoothSpeakerDTO.setRange("5m");
	  
	  BluetoothSpeakerService bluetoothSpeakerService = new BluetoothSpeakerServiceImpl();
	 // bluetoothSpeakerService.validateAndSave(bluetoothSpeakerDTO);
	  
	  BluetoothSpeakerDTO bluetoothSpeakerDTO2 = bluetoothSpeakerService.getBlueToothById(2);
	  System.out.println(bluetoothSpeakerDTO2);
	 
	  
	  bluetoothSpeakerService.updateCompanyByBluetoothName("Oneplus Bullets Wireless" ,"Sony");
	  
	  
}
   
   
   
}
