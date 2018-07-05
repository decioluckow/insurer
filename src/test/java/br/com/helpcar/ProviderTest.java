package br.com.helpcar;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.google.common.collect.Sets;

import br.com.helpcar.enums.Service;
import br.com.helpcar.model.Provider;
import br.com.helpcar.repository.ProviderRepository;

@RunWith(SpringRunner.class)
@DataJpaTest
public class ProviderTest {
	
	@Autowired
	private ProviderRepository providerRepository;
	
	@Test
	public void testNewProvider() {
		Provider provider = new Provider();
		provider.setName("Guincho do Décio");
		provider.setServices(Sets.newHashSet(Service.GUINCHO));
		
		providerRepository.save(provider);
		
		Assert.assertEquals(1, providerRepository.count() );
	}

	@Test
	public void testProviderWithoutService() {
		Provider provider = new Provider();
		provider.setName("Fornecedor sem serviço");
		
		providerRepository.save(provider);
		
		Assert.assertEquals(1, providerRepository.count() );
	}
	
	@Test
	public void testProviderWithoutName() {
		Provider provider = new Provider();
		
		providerRepository.save(provider);
		
		Assert.assertEquals(1, providerRepository.count() );
	}
}
