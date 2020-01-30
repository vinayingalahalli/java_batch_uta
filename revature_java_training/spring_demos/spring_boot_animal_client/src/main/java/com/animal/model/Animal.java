package com.animal.model;

import java.io.Serializable;

import org.springframework.stereotype.Indexed;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@ToString
@AllArgsConstructor

@Indexed
public class Animal implements Serializable {
	private int id;
	private String name;
	private int age;
	private String category;
	

}
