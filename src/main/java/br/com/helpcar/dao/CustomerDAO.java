package br.com.helpcar.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import br.com.helpcar.model.Customer;

@Component
public class CustomerDAO {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public Customer loadCustomer(long id) {
//		jdbcTemplate.
		return null;
	}
}
