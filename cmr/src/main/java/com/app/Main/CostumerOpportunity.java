package com.app.Main;

import java.util.ArrayList;
import java.util.List;

public class CostumerOpportunity {
	private int cosOppId;
	private String name;
	private String mail;
	private static List<Contact> contactsList = new ArrayList<>();
	private boolean isClient;
	
	public CostumerOpportunity() {
		super();
	}

	public CostumerOpportunity(int cosOppId, String name, String mail) {
		super();
		this.cosOppId = cosOppId;
		this.name = name;
		this.mail = mail;
		this.isClient = false;
	}

	
	public int getCosOppId() {
		return cosOppId;
	}

	public void setCosOppId(int cosOppId) {
		this.cosOppId = cosOppId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public List<Contact> getContactsList() {
		return contactsList;
	}
	public void addContact(Contact contact) {
		contactsList.add(contact);
	}
	// get a specific contact
	public Contact getContact(int id) {
		for (int i = 0; i < contactsList.size(); i++) {
			if(contactsList.get(i).getContactId()==id) {
				return contactsList.get(i);
			}
		}
		return null;
	}
	//remove specific contact
	public boolean removeContact(int id) {
		return contactsList.remove(getContact(id));
	}
	public boolean isClient() {
		return isClient;
	}

	public void convertIntoClient() {
		this.isClient = true;
	}
	
}
