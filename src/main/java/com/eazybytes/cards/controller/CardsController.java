package com.eazybytes.cards.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.eazybytes.cards.model.Cards;
import com.eazybytes.cards.model.Customer;
import com.eazybytes.cards.repository.CardsRepository;

@RestController
public class CardsController {

	@Autowired
	private CardsRepository repository;

	@PostMapping("/myCards")
	public List<Cards> findByCustomer(@RequestBody Customer customer) {
		List<Cards> cards = repository.findByCustomerId(customer.getCustomerId());
		return cards;
	}
}
