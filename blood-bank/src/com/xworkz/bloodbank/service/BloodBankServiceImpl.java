package com.xworkz.bloodbank.service;

import java.sql.SQLException;

import com.xworkz.bloodbank.dao.BloodBankDAO;
import com.xworkz.bloodbank.dao.BloodBankDAOImpl;
import com.xworkz.bloodbank.dto.BloodBankDTO;

public class BloodBankServiceImpl implements BloodBankService {

	private BloodBankDAO bloodBankDAO;

	public BloodBankServiceImpl() {

		bloodBankDAO = new BloodBankDAOImpl();
	}

	@Override
	public void validateAndSave(BloodBankDTO bloodBankDTO) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub

		if (bloodBankDTO != null) {
			if (bloodBankDTO.getDonorAge() > 18 && bloodBankDTO.getDonorName() != null) {
				bloodBankDAO.createBloodBank(bloodBankDTO);
			}
			else {
				System.out.println("Sorry !.. We cannot consider his/her donation");
			}
		}
		else {
			System.out.println("Found Empty Object ... Please fill the data Again..");
		}
		
	}

	@Override
	public void updateAgeByName(int age, String donorName) throws ClassNotFoundException, SQLException {
		 
		if(age > 18 && donorName != null)
		{
			bloodBankDAO.updateAgeByName(age, donorName);
		}
		
	}

}
