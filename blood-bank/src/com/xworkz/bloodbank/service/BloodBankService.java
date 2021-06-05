package com.xworkz.bloodbank.service;

import java.sql.SQLException;

import com.xworkz.bloodbank.dto.BloodBankDTO;

public interface BloodBankService {
	
	public void validateAndSave(BloodBankDTO bloodBankDTO) throws ClassNotFoundException, SQLException ;
	public void updateAgeByName(int age , String donorName) throws ClassNotFoundException, SQLException ; 

}
