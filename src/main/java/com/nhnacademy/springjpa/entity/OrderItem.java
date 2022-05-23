package com.nhnacademy.springjpa.entity;


import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;



@Entity
@Table(name = "OrderItems")
// @IdClass(OrderItem.Pk.class)
public class OrderItem {

	@EmbeddedId
	private Pk pk;

	// @Id
	// @Column(name = "order_id")
	// private Long orderId;
	//
	// @Id
	// @Column(name = "line_number")
	// private Integer lineNumber;

	@Column(name = "item_id")
	private long itemId;

	// @Column(name = "quantity")
	private long quantity;



	@NoArgsConstructor
	@EqualsAndHashCode
	@Embeddable
	public static class Pk implements Serializable {
		@Column(name = "order_id")
		private Long orderId;

		@Column(name = "line_number")
		private Integer lineNumber;

	}

}
