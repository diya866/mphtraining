package com.test;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table (name="two_wheeler")
public class TwoWheeler extends Vehcle{
	public String getSteeringWheel() {
		return steeringWheel;
	}

	public void setSteeringWheel(String steeringWheel) {
		this.steeringWheel = steeringWheel;
	}

	private String steeringWheel;
}
