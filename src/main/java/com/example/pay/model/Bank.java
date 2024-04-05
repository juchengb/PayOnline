package com.example.pay.model;

import java.util.Date;
import java.util.LinkedHashSet;
import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OrderBy;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/*
 * Bank 銀行
 * +-------+--------+---------+---------+------------+
 * |   id  |  name  | account | balance | updateTime |
 * | 銀行id | 銀行名稱 |  銀行帳號 |   餘額   |   更新時間   |
 * +-------+--------+---------+---------+------------+
 */

@Entity
@Table
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Bank {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id; // 銀行id
	
	@Column
	private String name; // 銀行名稱
	
	@Column
	private String account; // 銀行帳號
	
	@Column
	private double balance; // 銀行餘額
	
	@Column
	private Date updateTime; // 更新時間
	
	@OneToMany(mappedBy = "bank", fetch = FetchType.EAGER)
	@OrderBy("id ASC")
	private Set<Customer> employees = new LinkedHashSet<>();
	
	
}
