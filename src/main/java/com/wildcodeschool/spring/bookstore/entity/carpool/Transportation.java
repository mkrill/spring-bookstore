package com.wildcodeschool.spring.bookstore.entity.carpool;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.wildcodeschool.spring.bookstore.entity.Customer;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Transportation {

	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	Long id;
	
	Date transportation_end;
	
	Date transprotation_start;

	@ManyToOne
	@JoinColumn(name = "car_id")
	Car car;
	
	@ManyToOne
	@JoinColumn(name = "passenger_id")
	Customer passenger;
	
}
