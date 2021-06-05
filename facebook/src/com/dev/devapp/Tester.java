package com.dev.devapp;

import java.util.List;
import java.util.Scanner;

import com.dev.devapp.dao.FaceBookDAO;
import com.dev.devapp.dao.FaceBookDAOImpl;
import com.dev.devapp.dto.FaceBookDTO;
import com.dev.devapp.service.FacebookService;
import com.dev.devapp.service.FacebookServiceImpl;

public class Tester {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the id");
		int id = sc.nextInt();
		System.out.println("Enter the Name");
		String name = sc.next();
		System.out.println("Enter the Email");
		String email = sc.next();
		System.out.println("Enter the Password");
		String password = sc.next();

		// Has -A Relation
		System.out.println();
		FaceBookDTO fbDTO = new FaceBookDTO();

		fbDTO.setId(id);
		fbDTO.setName(name);
		fbDTO.setEmail(email);
		fbDTO.setPassword(password);

		System.out.println(fbDTO);

		//Abstraction
		FacebookService bookservice = new FacebookServiceImpl();
		bookservice.validateAndSave(fbDTO);
		
		/*
		 * <FaceBookDTO> bookDTOs = bookDAO.getAllFaceBookDetails();
		 * bookDTOs.forEach(System.out::println);
		 */

	}

}
