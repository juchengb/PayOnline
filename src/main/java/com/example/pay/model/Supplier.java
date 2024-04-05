package com.example.pay.model;

import java.util.Date;

import com.example.pay.enums.Status;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/*
 * Supplier 供應商
 * +--------+----------+---------+
 * |    id  |   name   | account |
 * | 供應商id | 供應商名稱 | 供應商帳號 |
 * +--------+----------+---------+
 */

@Entity
@Table
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Supplier {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id; // 供應商id
	
	@Column
	private String name; // 供應商名稱
	
	@Column
	private String account; // 供應商銀行帳號
	
}
