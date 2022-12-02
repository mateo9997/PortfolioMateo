package com.app.Main;



public class Contact {
	private int contactId;
	private String type;
	private String dateContact;
	private String description;
	
	public Contact() {
		super();
	}
	
	public Contact(int contactId, String type, String dateContact, String description) {
		super();
		this.contactId = contactId;
		this.type = type;
		this.dateContact = dateContact;
		this.description = description;
	}
	
	
	public int getContactId() {
		return contactId;
	}

	public void setContactId(int contactId) {
		this.contactId = contactId;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getDateContact() {
		return dateContact;
	}

	public void setDateContact(String dateContact) {
		this.dateContact = dateContact;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	
	
	
	
	
}
