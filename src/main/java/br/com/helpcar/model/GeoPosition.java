package br.com.helpcar.model;

import javax.persistence.Embeddable;

import lombok.Getter;
import lombok.Setter;

@Embeddable
@Getter
@Setter
public class GeoPosition {
	private float latitude;
	private float longitude;
}
