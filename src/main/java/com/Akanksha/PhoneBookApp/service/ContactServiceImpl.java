package com.Akanksha.PhoneBookApp.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Akanksha.PhoneBookApp.model.Contact;
import com.Akanksha.PhoneBookApp.repository.ContactRepository;

@Service
public class ContactServiceImpl implements ContactService {
	
	@Autowired
	private ContactRepository contactRepository;
	

	@Override
	public boolean saveContact(Contact contact) {
		Contact save = contactRepository.save(contact);
		return true;
	}

	@Override
	public List<Contact> getAllContact() {
		List<Contact> allContacts = contactRepository.findAll();
		return allContacts;
	}

	@Override
	public Contact getContactById(Integer contactId) {
		Contact contactById = contactRepository.findById(contactId).get();
		return contactById;
	}

	@Override
	public boolean deleteContactById(Integer contactId) {
		contactRepository.deleteById(contactId);
		return true;
	}

}
