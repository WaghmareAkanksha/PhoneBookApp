package com.Akanksha.PhoneBookApp.service;

import java.util.List;

import com.Akanksha.PhoneBookApp.model.Contact;

public interface ContactService {
	
	boolean saveContact(Contact contact);
	
	List<Contact> getAllContact();
	
	Contact getContactById(Integer contactId);
	
	boolean deleteContactById(Integer contactId);

}
