package com.example.pay.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/*
 * Customer 消費者
 * +---------+----------+--------+
 * |    id   |   name   | bankId |
 * | 消費者id  | 消費者名稱 |  銀行id |
 * +---------+----------+--------+
 */

@Entity
@Table
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Customer {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id; // 消費者id
	
	@Column
	private String name; // 消費者名稱
	
	@JoinColumn(name = "bank_id") // 外鍵(銀行id)
	@ManyToOne(optional = false) // 該欄位不允許為 null 
	private Bank bank; // 消費者連結的銀行

}
