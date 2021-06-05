package com.dev.devapp.dao;

import java.util.List;

import com.dev.devapp.dto.FaceBookDTO;

public interface FaceBookDAO {

	public void createFaceBook(FaceBookDTO bookDTO);
	
	public List<FaceBookDTO> getAllFaceBookDetails();
}
