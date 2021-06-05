package com.dev.devapp.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.dev.devapp.dto.FaceBookDTO;

public class FaceBookDAOImpl implements FaceBookDAO {

	@Override
	public void createFaceBook(FaceBookDTO bookDTO) {
		Connection con = null;
		PreparedStatement pstmt = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jokes", "root", "Rohith782912");
			pstmt = con.prepareStatement("insert into facebook_table values(?,?,?,?)");
			pstmt.setInt(1, bookDTO.getId());
			pstmt.setString(2, bookDTO.getName());
			pstmt.setString(3, bookDTO.getEmail()	);
			pstmt.setString(4, bookDTO.getPassword());
			int i = pstmt.executeUpdate();
			System.out.println(i);
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (pstmt != null) {
				try {
					pstmt.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if (con != null) {
				try {
					con.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}

	}

	@Override
	public List<FaceBookDTO> getAllFaceBookDetails() {
		Connection con = null;
		Statement stmt = null;
		List<FaceBookDTO> bookDTOs = new ArrayList<FaceBookDTO>();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jokes", "root", "Rohith782912");
			stmt = con.createStatement();
			ResultSet resultSet = stmt.executeQuery("select * from facebook_table");
			while (resultSet.next()) {

				FaceBookDTO bookDTO = new FaceBookDTO();

				bookDTO.setId(resultSet.getInt("facebook_id"));
				bookDTO.setName(resultSet.getString("facebook_name"));
				bookDTO.setEmail(resultSet.getString("facebook_email"));
				bookDTO.setPassword(resultSet.getString("facebook_password"));

				bookDTOs.add(bookDTO);

			}
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {

			if (stmt != null) {
				try {
					stmt.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if (con != null) {
				try {
					con.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}

		}
		return bookDTOs;
	}
}
