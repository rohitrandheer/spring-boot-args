package com.args;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.args.service.CountryService;
import com.args.service.DepartmentService;

@SpringBootApplication
public class SpringBootArgsApplication implements CommandLineRunner {

	@Autowired
	private CountryService countryService;

	@Autowired
	private DepartmentService departmentService;

	public static void main(String[] args) {
		SpringApplication.run(SpringBootArgsApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		if (args.length > 0) {
			System.out.println("Option Received.");
			switch (Integer.parseInt(args[0])) {
			case 1:
				System.out.println("Reading country data");
				countryService.getAllCountries().forEach(customer -> {
					System.out.println(customer.toString());
				});
				break;
			case 2:
				System.out.println("Reading department data");
				departmentService.getAllDepartments().forEach(office -> {
					System.out.println(office.toString());
				});
				break;
			default:
				break;
			}
		} else {

		}

	}

}
