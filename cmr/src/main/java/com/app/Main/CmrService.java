package com.app.Main;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;


@Component
public class CmrService {
	private List<CostumerOpportunity> costumersOpportunities;
	private User user;
	
	static int contactNum=0, opportunityNum=1;
	static final String calls = "Calls", emails = "Emails", 
					salesVisits= "Sales Visitas";
	
	
	
	public CmrService() {
		this.costumersOpportunities = new ArrayList<>();
		//Contacts
		Contact contact1 = new Contact(par(), calls, "27-12-2022","llamaditas");
		//Costumers/opportunities
		CostumerOpportunity opportunity1= new CostumerOpportunity(impar(), "name1", "mail1");
		CostumerOpportunity opportunity2= new CostumerOpportunity(impar(), "name2", "mail2");
		CostumerOpportunity opportunity3= new CostumerOpportunity(impar(), "name3", "mail3");
		CostumerOpportunity opportunity4= new CostumerOpportunity(impar(), "name4", "mail4");
		
		opportunity1.addContact(contact1);
		opportunity1.isClient();

		//costumers
		opportunity1.convertIntoClient();
		opportunity3.convertIntoClient();
		//add Costumers/opportunities
		costumersOpportunities.add(opportunity1);
		costumersOpportunities.add(opportunity2);
		costumersOpportunities.add(opportunity3);
		costumersOpportunities.add(opportunity4);
		
		
		
		
		//user
		this.user = new User(0, "Mateo", "Ramon", "solera@solera.com", "bootcamp4", "solera@solera.com", "123456789");
	}
	//Obtain the list of costumers
	public List<CostumerOpportunity> getCostummers(){
		List<CostumerOpportunity> costumers =  new ArrayList<>();
		for (int i = 0; i < costumersOpportunities.size(); i++) {
			if(costumersOpportunities.get(i).isClient()) {
				costumers.add(costumersOpportunities.get(i));
			}
		}
		return costumers;
	}
	//Obtain list of opportunities
	public List<CostumerOpportunity> getOpportunities(){
		List<CostumerOpportunity> opportunities =  new ArrayList<>();
		for (int i = 0; i < costumersOpportunities.size(); i++) {
			if(!costumersOpportunities.get(i).isClient()) {
				opportunities.add(costumersOpportunities.get(i));
			}
		}
		return opportunities;
	}
	//get opportunity/costumer
	public CostumerOpportunity getCosOppById(int id) {
		for (int i = 0; i < costumersOpportunities.size(); i++) {
			if(costumersOpportunities.get(i).getCosOppId()==id) {
				return costumersOpportunities.get(i);
			}
		}
		return null;
	}
	//remove cosstumerOpportunity
	public boolean removeCosOpp(int id) {
		return costumersOpportunities.remove(getCosOppById(id));
	}
	//Generate id couple numbers
	public int par() {
		return contactNum =2*++contactNum;
	}
	//Generate id odd numbers
	public int impar() {
		return contactNum =(2*++contactNum)-1;
	}
	//login
	public boolean login(String name, String password) {
		boolean login = false;
		if(name==this.user.getUserName() && password==this.user.getPassword()) login = true;
		return login;
	}

	public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	public List<CostumerOpportunity> getCostumersOpportunities() {
		return costumersOpportunities;
	}
	public void setCostumersOpportunities(List<CostumerOpportunity> costumersOpportunities) {
		this.costumersOpportunities = costumersOpportunities;
	}
	public List<CostumerOpportunity> getCossOpp() {
		return costumersOpportunities;
	}
	
	
}
