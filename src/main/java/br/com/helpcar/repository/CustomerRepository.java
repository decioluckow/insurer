package br.com.helpcar.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.helpcar.model.Customer;

@Repository
public interface CustomerRepository extends CrudRepository<Customer, Long> {

}
