package br.com.helpcar.model;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;

import br.com.helpcar.enums.Service;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@EqualsAndHashCode
public class Provider {

	@Id
	@GeneratedValue
	private Long id;
	
	private String name;
	
	@ElementCollection(targetClass = Service.class)
	@JoinTable(name = "provider_service", joinColumns = @JoinColumn(name = "provider_id"))
	@Column(name = "service", nullable = false)
	@Enumerated(EnumType.STRING)
	private Set<Service> services; 
}
