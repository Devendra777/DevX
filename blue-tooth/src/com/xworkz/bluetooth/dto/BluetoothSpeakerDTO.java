package com.xworkz.bluetooth.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "bluetooth_speaker")
public class BluetoothSpeakerDTO implements Serializable {

	@Id
	@Column(name = "bluetooth_id")
	private Integer bluetoothId;
	
	@Column(name = "bluetooth_name")
	private String bluetoothName;
	
	@Column(name = "bluetooth_company")
	private String companyName;
	
	@Column(name = "bluetooth_range")
	private String range;

	public BluetoothSpeakerDTO() {
		// TODO Auto-generated constructor stub
	}

	public int getBluetoothId() {
		return bluetoothId;
	}

	public void setBluetoothId(int bluetoothId) {
		this.bluetoothId = bluetoothId;
	}

	public String getBluetoothName() {
		return bluetoothName;
	}

	public void setBluetoothName(String bluetoothName) {
		this.bluetoothName = bluetoothName;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getRange() {
		return range;
	}

	public void setRange(String range) {
		this.range = range;
	}

	@Override
	public String toString() {
		return "BluetoothSpeakerDTO [bluetoothId=" + bluetoothId + ", bluetoothName=" + bluetoothName + ", companyName="
				+ companyName + ", range=" + range + "]";
	}

}
