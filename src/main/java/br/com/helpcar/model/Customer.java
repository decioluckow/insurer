package br.com.helpcar.model;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import br.com.helpcar.enums.MaritalStatus;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@EqualsAndHashCode
public class Customer {

	@Id
	@GeneratedValue
	private Long id;

	@Column(length = 11)
	private String cpf;

	private String name;
	
	@Temporal(TemporalType.DATE)
	private Calendar birthDate;
	
	private String email;

	@Enumerated(EnumType.STRING)
	private MaritalStatus maritalStatus;
	
	private boolean livesWithTheRiskRange;
	
	@Embedded
	private DrivingLicense drivingLicense;
	
}
