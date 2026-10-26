package com.example.demo.entity;

import java.sql.Date;

import lombok.Data;

@Data
public class Review {
	private Integer restaurantId;
	private String userId;
	private Date visitDate;
	private String comment;
	public Integer rating;
}
