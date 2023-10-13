package com.revature.personalcard.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import com.revature.personalcard.model.PersonalCard;
import com.revature.personalcard.util.CardUtils;
import com.revature.personalcard.services.PersonalCardService;

@RestController
public class PersonalCardController {
    public PersonalCardController() {
		super();
	}

	public PersonalCardController(PersonalCardService personalCardService) {
		super();
		this.personalCardService = personalCardService;
	}

	public PersonalCardService getPersonalCardService() {
		return personalCardService;
	}

	@Autowired
	public void setPersonalCardService(PersonalCardService personalCardService) {
		this.personalCardService = personalCardService;
	}
	
	@PostMapping("/")
	public PersonalCard PostPersonal_Card(@RequestBody PersonalCard personalCard) {
		return personalCardService.createNewCard(personalCard);
	}
}

