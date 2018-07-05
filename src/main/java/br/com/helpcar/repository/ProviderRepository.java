package br.com.helpcar.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.helpcar.model.Provider;

@Repository
public interface ProviderRepository extends CrudRepository<Provider, Long> {

}
