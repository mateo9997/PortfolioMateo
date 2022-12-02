package com.app.Main;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("*")
public class CmrController {
	
	@Autowired
	private CmrService service;
	
	@GetMapping("/login")
	@ResponseBody
	public String login() {
		return "hola";
	}
	
	@ResponseBody
	@GetMapping("/cossOpp")
	public List<CostumerOpportunity> getCossOpp(){
		return service.getCossOpp();
	}
	//Convert an specific opportunity passed by front, into a costumer 
	@PutMapping("/opportunities")
	public void setOpportunityAsCostumer(@PathVariable int oppId) {
		for(int i = 0; i < service.getCostumersOpportunities().size(); i++) {
			if(service.getCostumersOpportunities().get(i).getCosOppId()==oppId){
				service.getCostumersOpportunities().get(i).convertIntoClient();
				break;
			}
		}
	}
	
//	
	@GetMapping("/costumers")
	@ResponseBody
	public List<CostumerOpportunity> getCostumers(){
		return service.getCostummers();
	}
	@GetMapping("/opportunities")
	@ResponseBody
	public List<CostumerOpportunity> getOpportunities(){
		return service.getOpportunities();
	}
	
	@GetMapping("/user")
	@ResponseBody
	public User getUser() {
		return service.getUser();
	}
	
}
