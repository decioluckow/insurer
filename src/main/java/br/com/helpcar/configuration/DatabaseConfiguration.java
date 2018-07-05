package br.com.helpcar.configuration;

import javax.sql.DataSource;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;

import br.com.helpcar.model.Customer;
import br.com.helpcar.repository.CustomerRepository;

@Configuration
@EnableJpaRepositories(basePackageClasses=CustomerRepository.class)
public class DatabaseConfiguration {

	@Bean
	@Primary
	@ConfigurationProperties("helpcar")
	public DataSource dataSource() {
		return DataSourceBuilder.create().build();
	}
	
	@Bean
	public LocalContainerEntityManagerFactoryBean entityManagerFactory(
			EntityManagerFactoryBuilder builder) {
		return builder
				.dataSource(dataSource())
				.packages(Customer.class)
				.persistenceUnit("helpcar")
				.build();
	}
}
