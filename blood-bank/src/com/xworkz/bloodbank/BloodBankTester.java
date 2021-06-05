package com.xworkz.bloodbank;

import java.sql.SQLException;
import java.util.Scanner;

import com.xworkz.bloodbank.dto.BloodBankDTO;
import com.xworkz.bloodbank.service.BloodBankService;
import com.xworkz.bloodbank.service.BloodBankServiceImpl;

public class BloodBankTester {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		BloodBankDTO dto = new BloodBankDTO();
		dto.setBloodBankId(sc.nextInt());
		dto.setDonorName(sc.next());
		dto.setDonorAge(sc.nextInt());
		dto.setSmoker(sc.nextBoolean());
		dto.setBloodBankLocation(sc.next());
		dto.setContactNo(sc.nextLong());

		BloodBankService bankService = new BloodBankServiceImpl();
		try {
			bankService.validateAndSave(dto);

		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}

		
		try {
			bankService.updateAgeByName(27, "Arvind");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
