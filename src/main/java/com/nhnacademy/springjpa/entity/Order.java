package com.nhnacademy.springjpa.entity;

import java.sql.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

// TODO #1: `Orders` 테이블과 맵핑될 `Order` Entity 클래스를 작성하세요.
/*
 * create table if not exists `Orders` (
 *   `order_id` bigint not null auto_increment,
 *   `order_date` timestamp not null,
 *
 *   primary key(`order_id`)
 * );
 *
 */
@Entity
@Table(name = "Orders")
@NoArgsConstructor
@Getter
@Setter
public class Order {
	@Id
	@Column(name = "order_id")
	private long orderId;

	@Column(name = "order_date")
	private Date orderDate;

}
