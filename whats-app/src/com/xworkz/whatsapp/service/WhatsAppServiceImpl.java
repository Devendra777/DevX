package com.xworkz.whatsapp.service;

import com.xworkz.whatsapp.dao.WhatsAppDAO;
import com.xworkz.whatsapp.dao.WhatsAppDAOImpl;
import com.xworkz.whatsapp.dto.WhatsAppDTO;

public class WhatsAppServiceImpl implements WhatsAppService {
	
	
	   private WhatsAppDAO  whatsAppDAO ; 
	   
	   public WhatsAppServiceImpl() {
		   whatsAppDAO =  new WhatsAppDAOImpl();
	}

	@Override
	public void validateAndCreateWhatsApp(WhatsAppDTO appDTO) {
		// TODO Auto-generated method stub
		if(appDTO != null) {
			if(appDTO.getContacts()  > 0 )
		whatsAppDAO.saveWhatsApp(appDTO);
		}
	}

}
