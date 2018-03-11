package com.java.big.service.impl;

import org.springframework.stereotype.Service;

import com.java.big.service.GeneralCaseService;

@Service(value = "generalCaseService")
public class GeneralCaseServiceImpl implements GeneralCaseService {

	@Override
	public void example() {
		System.out.println("Hello Ivandra Ganteng!!");
	}

}
