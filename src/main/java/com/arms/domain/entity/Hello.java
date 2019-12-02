package com.arms.domain.entity;

import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.springframework.lang.NonNull;

import lombok.Data;

@Data
@Entity
public class Hello {
	@Id
	@GeneratedValue
	private int id;

	@NonNull
	private String name;
	
	public Hello() {
		
	}
	
}
