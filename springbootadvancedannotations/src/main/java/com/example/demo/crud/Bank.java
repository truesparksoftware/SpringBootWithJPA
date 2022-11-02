package com.example.demo.crud;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Bank {
	private String id;
	private String name;
	private String loc;
}
