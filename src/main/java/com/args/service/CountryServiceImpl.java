package com.args.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.args.model.Country;
import com.args.repository.CountryRepository;

@Service
public class CountryServiceImpl implements CountryService {
	@Autowired
	private CountryRepository countryRepository;

	@Override
	public List<Country> getAllCountries() {
		return countryRepository.findAll();
	}

}
