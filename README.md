# PayOnline
```java
// Order 訂單
+---------+------------+------------+--------+------------+
|    id   | supplierId | customerId | amount | createTime |
|  訂單id  |   供應商id  |  消費者id   |  金額   |  創建時間   |
+---------+------------+------------+--------+------------+

// Supplier 供應商
+---------+-----------+-----------------+
|    id   |    name   |   bank_account  |
| 供應商id |  供應商名稱 |    供應商帳號     |
+---------+-----------+-----------------+

// Customer 消費者
+---------+-----------+--------------+
|    id   |    name   | bank_account |
| 消費者id |  消費者名稱 |   銀行帳號    |
+---------+-----------+--------------+

// Bank 銀行
+--------+---------+---------+------------+------------+------------+--------------+
|   id   |   name  | account |  Deposit   |  Withdraw  |  balance   | updateTime   |
| 銀行id  | 銀行名稱 | 銀行帳號 |    存入     |    提取     |    餘額     |  更新時間     |
+--------+---------+---------+------------+------------+------------+--------------+

// Invoice 請款單
+---------+---------+--------------------+--------------------+-------------+-------------+
|    id   | bank_id | customer_account   | supplier_account   |    amount   | createTime  |
| 請款單id |  銀行id  |      消費者帳號      |    供應商帳號       |    請款金額   |  創建時間    |
+---------+---------+--------------------+--------------------+-------------+-------------+

```
