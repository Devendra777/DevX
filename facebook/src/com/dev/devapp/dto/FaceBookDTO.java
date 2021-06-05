package com.dev.devapp.dto;

// DTO 
public class FaceBookDTO {

	private int id;
	private String name;
	private String email;
	private String password;

	public FaceBookDTO() {
		System.out.println(this.getClass().getSimpleName() + "created");
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "FaceBookDTO [id=" + id + ", name=" + name + ", email=" + email + ", password=" + password + "]";
	}

}
