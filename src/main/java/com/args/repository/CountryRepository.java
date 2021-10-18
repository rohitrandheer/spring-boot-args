package com.args.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.args.model.Country;

@Repository
public interface CountryRepository extends JpaRepository<Country, Integer> {
}
