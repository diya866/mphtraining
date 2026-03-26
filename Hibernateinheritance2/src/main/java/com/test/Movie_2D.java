package com.test;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name="2D_MOVIE")
//@DiscriminatorValue("2DMovie")
public class Movie_2D extends Movie{
public String getCasting() {
		return casting;
	}

	public void setCasting(String casting) {
		this.casting = casting;
	}

private String casting;

}
