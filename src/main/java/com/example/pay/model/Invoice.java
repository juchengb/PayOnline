package com.example.pay.model;

import java.util.Date;

import com.example.pay.enums.Status;

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
 * Invoice 請款單
 * +--------+--------+------------+--------+--------+------------+-------------+
 * |    id  | bankId | customerId | amount | status | createTime |  updateTime |
 * | 請款單id | 銀行id |    消費者id  | 請款金額 |   狀態  |   創建時間   |   最後更新時間 |
 * +--------+--------+------------+--------+--------+------------+-------------+
 */

@Entity
@Table
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Invoice {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id; // 請款單id
	
	@JoinColumn(name = "bank_id") // 外鍵(銀行id)
	@ManyToOne(optional = false) // 該欄位不允許為 null 
	private Bank bank; // 銀行
	
	@JoinColumn(name = "customer_id") // 外鍵(消費者id)
	@ManyToOne(optional = false) // 該欄位不允許為 null 
	private Customer customer; // 消費者
	
	@Column
	private double amount; // 請款金額
	
	@Column
	private Status status; // 請款狀況
	
	@Column
	private Date createTime; // 請款單創建時間
	
	@Column
	private Date updateTime; // 請款單最後更新時間
}
