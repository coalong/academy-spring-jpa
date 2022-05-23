package com.nhnacademy.springjpa.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

// TODO #1: `Items` 테이블과 맵핑될 `Item` Entity 클래스를 작성하세요.
/*
 *
 * create table if not exists `Items` (
 *   `item_id` bigint not null auto_increment,
 *   `item_name` varchar(40) not null,
 *   `price` bigint not null,
 *
 *   primary key(`item_id`)
 * );
 *
 */
@Entity
@Table(name = "Items")
@NoArgsConstructor
@Getter
@Setter
public class Item {
    @Id //엔티티에는 id가 꼭 있어야 한다. (PK랑 매핑)
	@Column(name = "item_id")
	private Long itemId;

	@Column(name = "item_name")
	private String itemName;

	// @Column(name = "price")
	// 컬럼명 같으면 생략가능하다.
	private Long price;

	// public Long getItemId() {
	// 	return null;
	// }

}
