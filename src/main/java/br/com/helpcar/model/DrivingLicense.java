package br.com.helpcar.model;

import java.util.Calendar;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Embeddable;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import br.com.helpcar.enums.DrivingCategory;
import lombok.Getter;
import lombok.Setter;

@Embeddable
@Getter
@Setter
public class DrivingLicense {

	@Temporal(TemporalType.DATE)
	private Calendar firstLicenseDate;

	@ElementCollection(targetClass = DrivingCategory.class)
	@JoinTable(name = "customer_driving_category", joinColumns = @JoinColumn(name = "customer_id"))
	@Column(name = "category", nullable = false)
	@Enumerated(EnumType.STRING)
	private Set<DrivingCategory> categories;
	
	@Temporal(TemporalType.DATE)
	private Calendar licenseExpiration;
	
}
