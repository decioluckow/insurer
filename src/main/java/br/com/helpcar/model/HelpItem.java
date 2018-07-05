package br.com.helpcar.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import br.com.helpcar.enums.Service;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@EqualsAndHashCode
public class HelpItem {

	@Id
	@GeneratedValue
	private Long id;

	@ManyToOne
	@JoinColumn(name="helpid")
	private Help help;

	private Service helpType;

	@ManyToOne(optional = true)
	private Provider provider;
}
