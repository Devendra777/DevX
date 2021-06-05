package com.xworkz.bloodbank.dao;

import java.sql.SQLException;

import com.xworkz.bloodbank.dto.BloodBankDTO;

public interface BloodBankDAO {

	public void updateAgeByName(int age  , String donorName) throws  ClassNotFoundException , SQLException;

	public void createBloodBank(BloodBankDTO bankDTO)  throws ClassNotFoundException , SQLException;
}
