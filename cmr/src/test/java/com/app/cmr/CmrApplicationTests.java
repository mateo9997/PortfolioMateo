package com.app.cmr;

import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.app.Main.CmrController;
import com.app.Main.CmrService;
import com.app.Main.CostumerOpportunity;

@SpringBootTest
class CmrApplicationTests {

	@Autowired
	CmrController serviceController;
	@Autowired
	CmrService service;
	
	@Test
    void checkIfOpportunitieTurnsIntoCostumer() {
		service=new CmrService();
        CostumerOpportunity opportunity= service.getOpportunities().get(0);
        boolean isClient= opportunity.isClient();
        service.getCosOppById(opportunity.getCosOppId()).convertIntoClient();
        assertNotEquals(isClient, opportunity.isClient());
    }
}
