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
 * Order 訂單
 * +-------+------------+------------+--------+--------+------------+------------+
 * |   id  | supplierId | customerId | amount | status | createTime | updateTime |
 * | 訂單id |   供應商id   |   消費者id  |   金額  |   狀態  |   創建時間   | 最後更新時間  |
 * +-------+------------+------------+--------+--------+------------+------------+
 */

@Entity
@Table
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Order {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id; // 訂單id
	
	@JoinColumn(name = "supplier_id") // 外鍵(供應商id)
	@ManyToOne(optional = false) // 該欄位不允許為 null 
	private Supplier supplier; // 供應商
	
	@JoinColumn(name = "customer_id") // 外鍵(消費者id)
	@ManyToOne(optional = false) // 該欄位不允許為 null 
	private Customer customer; // 消費者
	
	@Column
	private double amount; // 訂單金額
	
	@Column
	private Status status; // 訂單狀況
	
	@Column
	private Date createTime; // 訂單創建時間
	
	@Column
	private Date updateTime; // 訂單最後更新時間
	
	

}
