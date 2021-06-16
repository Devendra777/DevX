package com.xworkz.whatsapp.dto;

import java.io.Serializable;
//Hibernate uses DTO to perform CRUD

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.xworkz.whatsapp.constants.StatusPrivacy;

@Entity
@Table(name="whats_app_table")
public class WhatsAppDTO implements Serializable {

	@Id
	private int whatsappId;
	private String status;
	private String chats;
	private Long contacts;
	private StatusPrivacy privacy;
	
	public WhatsAppDTO() {
		System.out.println(this.getClass().getSimpleName()+" created");
	}
	public int getWhatsappId() {
		return whatsappId;
	}
	public void setWhatsappId(int whatsappId) {
		this.whatsappId = whatsappId;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getChats() {
		return chats;
	}
	public void setChats(String chats) {
		this.chats = chats;
	}
	public Long getContacts() {
		return contacts;
	}
	public void setContacts(Long contacts) {
		this.contacts = contacts;
	}
	public StatusPrivacy getPrivacy() {
		return privacy;
	}
	public void setPrivacy(StatusPrivacy privacy) {
		this.privacy = privacy;
	}

}
