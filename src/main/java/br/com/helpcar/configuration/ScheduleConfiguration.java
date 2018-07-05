package br.com.helpcar.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

import br.com.helpcar.model.Customer;
import br.com.helpcar.repository.CustomerRepository;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Configuration
@EnableScheduling
@EnableAsync
public class ScheduleConfiguration {
	
	@Autowired
	private CustomerRepository customerRepository;

	@Scheduled(fixedDelay=5000)
	public void verifyUnverifiedAssistanceRequisition() {
		log.info("Verificando");
		customerRepository.save(buildCustomer("Décio"));
		customerRepository.findAll().forEach(customer -> System.out.println(customer.getName()) );
		System.out.println("verificando");
	}
	
	private Customer buildCustomer(final String name) {
		Customer customer = new Customer();
		customer.setName(name);
		return customer;
	}
}
