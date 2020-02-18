package com.wildcodeschool.spring.bookstore.entity.carpool;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

import com.wildcodeschool.spring.bookstore.entity.Customer;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Car {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String model;
	
	@OneToMany(mappedBy = "car")
	private List<Transportation> transportations = new ArrayList<>();
	
	@ManyToMany
	@JoinTable(name = "owner_car", 
		joinColumns = @JoinColumn(name = "car_id"), 
		inverseJoinColumns = @JoinColumn(name = "customer_id"))
	private List<Customer> owners = new ArrayList<>();

}
