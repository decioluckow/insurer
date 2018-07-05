package br.com.helpcar.model;

import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@EqualsAndHashCode
public class Help {

	@Id
	@GeneratedValue
	private Long id;
	
	private LocalDateTime dateTime;
	
	@Embedded
	private GeoPosition localization;
	
	@ManyToOne
	@JoinColumn(name="customerid", referencedColumnName="id")
	private Customer customer;
	
	@OneToMany(mappedBy="help", cascade={CascadeType.PERSIST, CascadeType.REMOVE})
	private List<HelpItem> itens;
}
