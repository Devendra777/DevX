package com.dev.devapp.service;

import com.dev.devapp.dao.FaceBookDAO;
import com.dev.devapp.dao.FaceBookDAOImpl;
import com.dev.devapp.dto.FaceBookDTO;

public class FacebookServiceImpl implements FacebookService {

	// Has - A - relationship
	public FaceBookDAO faceBookDAO ;
	
	public FacebookServiceImpl() {
		
		//Abstraction
		faceBookDAO = new FaceBookDAOImpl();
	}

	@Override
	public void validateAndSave(FaceBookDTO bookDTO) {

		if (bookDTO != null) {
			if (bookDTO.getId() > 0 && bookDTO.getName() != null && bookDTO.getPassword() != null) {

				faceBookDAO.createFaceBook(bookDTO);

			}

		}

	}

}
