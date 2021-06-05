package com.xworkz.bloodbank.constants;

public class Constants {
	
	public static final String DRIVER_CLASS_NAME = "com.mysql.cj.jdbc.Driver";
	public static final String URL = "jdbc:mysql://localhost:3306/jokes?user=root&password=Rohith782912";
	public static final String INSERT_QUERY = "insert into blood_bank_table values(?,?,?,?,?,?)";
	public static final String SELECT_QUERY="";
	public static final String UPDATE_AGE_BY_DONOR_NAME = "update blood_bank_table set donor_age = ? where donor_name= ?";

}
