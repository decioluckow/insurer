package br.com.helpcar.web.rest.broker;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.helpcar.repository.CustomerRepository;

@RestController
@RequestMapping(value="/broker")
class BrokerController {
	
	@Autowired
	private CustomerRepository customerRepository; 

	@RequestMapping("/")
	public String home() {
		customerRepository.findAll().forEach(customer -> System.out.println(customer.getName()) );
		return "Hello World!";
	}


}