package com.xworkz.whatsapp;

import com.xworkz.whatsapp.constants.StatusPrivacy;
import com.xworkz.whatsapp.dto.WhatsAppDTO;
import com.xworkz.whatsapp.service.WhatsAppService;
import com.xworkz.whatsapp.service.WhatsAppServiceImpl;

public class Tester {
	
	public static void main(String[] args) {
		
		
		WhatsAppDTO appDTO = new WhatsAppDTO();
		appDTO.setWhatsappId(3);
		appDTO.setPrivacy(StatusPrivacy.MY_CONTACTS);
		appDTO.setContacts(456456567L);
		appDTO.setChats("Hi macha...");
		appDTO.setStatus("quotes");
		
		
		WhatsAppService whatsAppService = new WhatsAppServiceImpl();
		whatsAppService.validateAndCreateWhatsApp(appDTO);
		 
	}

}
